package com.chf.sample.spring.service;

import org.springframework.stereotype.Service;

import reactor.bus.Event;
import reactor.fn.Consumer;

@Service
public class Receiver implements Consumer<Event<String>> {

	public void accept(Event<String> ev) {
		System.out.println("Receiver get : " + ev.getData());
	}
}
