package demo

import io.micrometer.core.instrument.MeterRegistry
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class UseMetrics(val meterRegistry: MeterRegistry) {
    @EventListener(ApplicationReadyEvent::class)
    fun onApplicationReady() {
        val random = Random(System.currentTimeMillis())
        meterRegistry.gauge("demo.randomGauge", this) { random.nextInt(0, 1000).toDouble() }
    }
}