package org.labisd;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.labisd.sum.ConsumerTest;
import org.labisd.sum.SommatoreTest;

@RunWith(Suite.class) // Runner: classe che esegue i test
@Suite.SuiteClasses({ConsumerTest.class, SommatoreTest.class}) // indico i casi di test della suite
public class TestSuiteExample { }

