const base = {
    get() {
        return {
            url : "http://localhost:8080/fufeiwendaxitong/",
            name: "fufeiwendaxitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/fufeiwendaxitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "付费问答系统"
        } 
    }
}
export default base
