module.exports = function (grunt) {
    grunt.loadNpmTasks('grunt-contrib-jshint');
    grunt.loadNpmTasks('grunt-contrib-qunit');

    grunt.initConfig({
        jshint: {
            all: ['*.js', 'src/*.js', 'test/*.js']
        },
        qunit: {
            options: {
                page : {
                    viewportSize : { width: 1024, height: 786 }
                }
            },
            all: ['test/index.html']
        }
    });

    grunt.registerTask('test', ['jshint', 'qunit']);
    grunt.registerTask('default', ['test']);
};