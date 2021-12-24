### Генерация PB файлов
В директории `src/main/proto` выполнить:

    protoc -I/home/raccoon/IdeaProjects/envoyGrpcTranscoding/build/extracted-include-protos/main -I. --include_imports --include_source_info --descriptor_set_out=echoService.pb echoService.proto
