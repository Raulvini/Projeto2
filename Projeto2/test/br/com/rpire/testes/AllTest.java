package br.com.rpire.testes;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ClienteDaoTest.class, ClienteServiceTest.class})
public class AllTest {

}
