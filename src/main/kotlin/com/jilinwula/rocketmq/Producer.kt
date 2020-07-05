package com.jilinwula.rocketmq

import com.alibaba.fastjson.JSONObject
import org.apache.rocketmq.client.producer.DefaultMQProducer
import org.apache.rocketmq.common.message.Message

class Producer

fun main(){
    val producer = DefaultMQProducer("producerGroup-test")
    producer.namesrvAddr = "47.95.201.37:9876"
    producer.start()

    var message = Message("topic-test","tag-test","key-test","hello world test".toByteArray())

    var send = producer.send(message)

    print(JSONObject.toJSONString(send))

}