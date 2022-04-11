const http = require('http')

const app = http.createServer((req,res)=>{
    res.writeHead(200, 'Weldone!')
    res.write('Hi!')
    res.end();
}).listen(3000)