# Covfefe-ify your words

## Usage
`covfefe [args]` 
 
e.g. `covfefe president` will return `preszizi`.  You can enter multiple string arguments as well. 
 
For more information, see https://codegolf.stackexchange.com/questions/123685/covfefify-a-string

## How to Install
- Make sure you have Java 8
- If you want to compile (not download the JAR) you'll need jdk 1.8

### Building
`sh build.sh` 
 
This will compile Main.java and bundle it into the jar

### Installing locally
`sh install.sh` 
 
This will install it to /usr/local/lib and name it covfefe.jar.  It'll also create a symlink in /usr/local/bin to the covfefe shell script