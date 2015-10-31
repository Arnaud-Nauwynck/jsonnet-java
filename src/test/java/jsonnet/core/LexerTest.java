package jsonnet.core;

import com.google.gson.JsonObject;
import jsonnet.core.model.Token;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class LexerTest {

    Lexer lexer = new Lexer();

    @Test
    public void shouldGetEmptyTokensList() {
        // given
        String input = "";

        // when
        List<Token> tokens = lexer.lex(input);

        // then
        assertTrue(tokens.isEmpty());
    }

    @Test
    public void shouldGetBracesTokens() {
        // given
        JsonObject input = new JsonObject();

        // when
        List<Token> tokens = lexer.lex(input.toString());

        // then
        assertTrue(tokens.size() == 2);
    }

}