package bassouat

class DemoController {

    def displayModel(String traceAffiche) {
        String[] arr = traceAffiche.split(',')
        [stackJ: arr]
    }
}
