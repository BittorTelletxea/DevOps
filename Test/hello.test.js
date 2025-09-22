const helloWorld = require('./Hello');

test('devuelve Hello, World!', () => {
    expect(helloWorld()).toBe("Hello, World!");
});
