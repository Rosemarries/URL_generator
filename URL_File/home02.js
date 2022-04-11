const http = require('http')
const fs = require('fs')

const app = http.createServer((req,res)=>{
    fs.readFile('./home01.html', (err, data)=>{
        if(err) throw err;
        res.writeHead(200, {'Content-Type': "text/html"})
        res.write(data)
        res.end();
    })
    
}).listen(3000)