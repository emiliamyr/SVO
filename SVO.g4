grammar SVO;

start: sentence EOF;

// zdanie skalda sie ze zdan i spojnikow
sentence: sentence CONJ sentence
        | nounPhrase verbPhrase
        | nounPhrasePlural verbPhrasePlural
        | PRONOUN_I verbPhraseI;

// todo liczba mnoga nie moze miec a/an
// todo problem jest bo mozna dac has eatting, jakos to rozdzielic

nounPhrase:PRONOUN_SINGULAR  //ja ty on ono 😉
           // the/a + rzeczownik/przymiotnik rzeczownik +? PP
          | (DETERMINER_SINGULAR | DETERMINER) (NOUN_SINGULAR | (ADJECTIVE* NOUN_SINGULAR)) (prepositionalPhrase)?
          | NOUN_SINGULAR; // ranodomowy rzeczownik

nounPhrasePlural: PRONOUN
                | NOUN_PLURAL
                | DETERMINER (NOUN_PLURAL | (ADJECTIVE* NOUN_PLURAL)) (prepositionalPhrase)?;

// PP: on/in/by + rzeczownik
prepositionalPhrase: PREPOSITION (nounPhrase | nounPhrasePlural) ;
// dla pronouns
verbPhrase: tense ((nounPhrase | prepositionalPhrase | nounPhrasePlural)? | ADJECTIVE); // is eating, will eat, ate

verbPhrasePlural: tensePlural ((nounPhrasePlural | prepositionalPhrase | nounPhrase)? | ADJECTIVE);

verbPhraseI: tenseI ((nounPhrase | prepositionalPhrase | nounPhrasePlural)? | ADJECTIVE);

tense: past | present | future;

tensePlural: pastPlural | presentPlural | future;

tenseI: past | presentI | future;

tenseNoun: past | present | future;

tenseNouns: pastPlural | presentPlural | future;

past: AUXILIARY_PAST_WAS  VERB_PRESENT | VERB_PAST | AUXILIARY_PAST | AUXILIARY_PAST_WAS ADJECTIVE;
present: AUXILIARY_PRESENT  VERB_PRESENT | AUXILIARY_PRESENT ADJECTIVE | AUXILIARY_PRESENT_HAS;
future: AUXILIARY_FUTURE  VERB_FUTURE | AUXILIARY_FUTURE AUXILIARY_INFINITIVE (AUXILIARY_PRESENT)*;

pastPlural: AUXILIARY_PAST_WERE  VERB_PRESENT | VERB_PAST | AUXILIARY_PAST_WERE ADJECTIVE;
presentPlural: AUXILIARY_PRESENT_PLURAL  VERB_PRESENT | AUXILIARY_PRESENT_PLURAL ADJECTIVE | AUXILIARY_PRESENT_HAVE;

presentI: AUXILIARY_PRESENT_I  VERB_PRESENT | AUXILIARY_PRESENT_I ADJECTIVE| AUXILIARY_PRESENT_HAVE;


PRONOUN: 'you' | 'we' | 'they';
PRONOUN_SINGULAR: 'he' | 'she' | 'it';
PRONOUN_I: 'I';
DETERMINER: 'the' | 'my' | 'your' | 'his' | 'her' | 'our' | 'their';
DETERMINER_SINGULAR: 'a' | 'an';
NOUN_SINGULAR: 'name' | 'monster' | 'evening' | 'Herbert' | 'apple' | 'dog' | 'car' | 'crash';
NOUN_PLURAL: 'boats' | 'cats' | 'houses';
ADJECTIVE: 'big' | 'small' | 'blue' | 'red' | 'happy' | 'huge';

AUXILIARY_PRESENT : 'is';
AUXILIARY_PRESENT_I: 'am';
AUXILIARY_PRESENT_PLURAL: 'are';
AUXILIARY_PRESENT_HAS: 'has';
AUXILIARY_PRESENT_HAVE: 'have';
AUXILIARY_PAST_WAS: 'was';
AUXILIARY_PAST :  'had';
AUXILIARY_PAST_WERE: 'were';
AUXILIARY_FUTURE : 'will';
AUXILIARY_INFINITIVE : 'be'; // idk czy to potrzebne

//VERB: 'eat' | 'run' | 'jump' | 'be' | 'see' | 'like' | 'want' | 'like';
//VERB: VERB_PRESENT | VERB_PAST | VERB_FUTURE;
VERB_PRESENT: 'eating' | 'running' | 'jumping' | 'sleeping';
VERB_PAST: 'ate' | 'ran' | 'jumped';
VERB_FUTURE: 'eat' | 'run' | 'jump';


PREPOSITION: 'for' | 'with' | 'to' | 'on' | 'in' | 'by';
CONJ: 'and' | 'but' | 'or';

WS: [ \t\r\n]+ -> skip;