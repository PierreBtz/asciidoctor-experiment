# asciidoctor-experiment
A small experimentation to check whether asciidoctor fit my need.

## Aim
Check what a developer without any knowledge of asciidoctor can hope to accomplish in two hours.

## Structure
I made a sample file `sample.adoc` grouping all the features I would need to write my documentations.
I also made a `questions.adoc` file with the questions I still have after those two hours.

## Result
The results of the two previous files are available in output. Of course, this output file should be in the .gitignore in a standard project.

## Usage
In case you wish to regenerate the documentation from sources, here is what you need:
* ruby
* the following ruby-gem: `asciidoctor` and `pygments.rb` (that I used for the syntax highlighting).

Once you are setup, just run the following:

```
asciidoctor questions.adoc -o output/questions.html
asciidoctor sample.adoc -o output/sample.html
```
