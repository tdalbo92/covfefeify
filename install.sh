#!/usr/bin/env bash
cp covfefe.jar /usr/local/lib
chmod +x covfefe
rm /usr/local/bin/covfefe
ln -s $(pwd)/covfefe /usr/local/bin/covfefe