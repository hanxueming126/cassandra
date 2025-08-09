/*      */
package org.apache.cassandra.cql3;
/*      */

import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import org.antlr.runtime.*;
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */

/*      */
/*      */ public class CqlLexer extends Lexer {
    /*      */   public static final int EOF = -1;
    /*      */   public static final int T__199 = 199;
    /*      */   public static final int T__200 = 200;
    /*      */   public static final int T__201 = 201;
    /*      */   public static final int T__202 = 202;
    /*      */   public static final int T__203 = 203;
    /*      */   public static final int T__204 = 204;
    /*      */   public static final int T__205 = 205;
    /*      */   public static final int T__206 = 206;
    /*      */   public static final int T__207 = 207;
    /*      */   public static final int T__208 = 208;
    /*      */   public static final int T__209 = 209;
    /*      */   public static final int T__210 = 210;
    /*      */   public static final int T__211 = 211;
    /*      */   public static final int T__212 = 212;
    /*      */   public static final int T__213 = 213;
    /*      */   public static final int T__214 = 214;
    /*      */   public static final int T__215 = 215;
    /*      */   public static final int T__216 = 216;
    /*      */   public static final int T__217 = 217;
    /*      */   public static final int T__218 = 218;
    /*      */   public static final int T__219 = 219;
    /*      */   public static final int T__220 = 220;
    /*      */   public static final int T__221 = 221;
    /*      */   public static final int T__222 = 222;
    /*      */   public static final int A = 4;
    /*      */   public static final int B = 5;
    /*      */   public static final int BOOLEAN = 6;
    /*      */   public static final int C = 7;
    /*      */   public static final int COMMENT = 8;
    /*      */   public static final int D = 9;
    /*      */   public static final int DIGIT = 10;
    /*      */   public static final int DURATION = 11;
    /*      */   public static final int DURATION_ISO_8601_PERIOD_DESIGNATORS = 12;
    /*      */   public static final int DURATION_ISO_8601_TIME_DESIGNATORS = 13;
    /*      */   public static final int DURATION_ISO_8601_WEEK_PERIOD_DESIGNATOR = 14;
    /*      */   public static final int DURATION_UNIT = 15;
    /*      */   public static final int E = 16;
    /*      */   public static final int EMPTY_QUOTED_NAME = 17;
    /*      */   public static final int EXPONENT = 18;
    /*      */   public static final int F = 19;
    /*      */   public static final int FLOAT = 20;
    /*      */   public static final int G = 21;
    /*      */   public static final int H = 22;
    /*      */   public static final int HEX = 23;
    /*      */   public static final int HEXNUMBER = 24;
    /*      */   public static final int I = 25;
    /*      */   public static final int IDENT = 26;
    /*      */   public static final int INTEGER = 27;
    /*      */   public static final int J = 28;
    /*      */   public static final int K = 29;
    /*      */   public static final int K_ACCESS = 30;
    /*      */   public static final int K_ADD = 31;
    /*      */   public static final int K_AGGREGATE = 32;
    /*      */   public static final int K_AGGREGATES = 33;
    /*      */   public static final int K_ALL = 34;
    /*      */   public static final int K_ALLOW = 35;
    /*      */   public static final int K_ALTER = 36;
    /*      */   public static final int K_AND = 37;
    /*      */   public static final int K_APPLY = 38;
    /*      */   public static final int K_AS = 39;
    /*      */   public static final int K_ASC = 40;
    /*      */   public static final int K_ASCII = 41;
    /*      */   public static final int K_AUTHORIZE = 42;
    /*      */   public static final int K_BATCH = 43;
    /*      */   public static final int K_BEGIN = 44;
    /*      */   public static final int K_BIGINT = 45;
    /*      */   public static final int K_BLOB = 46;
    /*      */   public static final int K_BOOLEAN = 47;
    /*      */   public static final int K_BY = 48;
    /*      */   public static final int K_CALLED = 49;
    /*      */   public static final int K_CAST = 50;
    /*      */   public static final int K_CLUSTER = 51;
    /*      */   public static final int K_CLUSTERING = 52;
    /*      */   public static final int K_COLUMNFAMILY = 53;
    /*      */   public static final int K_COMPACT = 54;
    /*      */   public static final int K_CONTAINS = 55;
    /*      */   public static final int K_COUNT = 56;
    /*      */   public static final int K_COUNTER = 57;
    /*      */   public static final int K_CREATE = 58;
    /*      */   public static final int K_CUSTOM = 59;
    /*      */   public static final int K_DATACENTERS = 60;
    /*      */   public static final int K_DATE = 61;
    /*      */   public static final int K_DECIMAL = 62;
    /*      */   public static final int K_DEFAULT = 63;
    /*      */   public static final int K_DELETE = 64;
    /*      */   public static final int K_DESC = 65;
    /*      */   public static final int K_DESCRIBE = 66;
    /*      */   public static final int K_DISTINCT = 67;
    /*      */   public static final int K_DOUBLE = 68;
    /*      */   public static final int K_DROP = 69;
    /*      */   public static final int K_DURATION = 70;
    /*      */   public static final int K_ENTRIES = 71;
    /*      */   public static final int K_EXECUTE = 72;
    /*      */   public static final int K_EXISTS = 73;
    /*      */   public static final int K_FILTERING = 74;
    /*      */   public static final int K_FINALFUNC = 75;
    /*      */   public static final int K_FLOAT = 76;
    /*      */   public static final int K_FROM = 77;
    /*      */   public static final int K_FROZEN = 78;
    /*      */   public static final int K_FULL = 79;
    /*      */   public static final int K_FUNCTION = 80;
    /*      */   public static final int K_FUNCTIONS = 81;
    /*      */   public static final int K_GRANT = 82;
    /*      */   public static final int K_GROUP = 83;
    /*      */   public static final int K_HASHED = 84;
    /*      */   public static final int K_IF = 85;
    /*      */   public static final int K_IN = 86;
    /*      */   public static final int K_INDEX = 87;
    /*      */   public static final int K_INET = 88;
    /*      */   public static final int K_INITCOND = 89;
    /*      */   public static final int K_INPUT = 90;
    /*      */   public static final int K_INSERT = 91;
    /*      */   public static final int K_INT = 92;
    /*      */   public static final int K_INTERNALS = 93;
    /*      */   public static final int K_INTO = 94;
    /*      */   public static final int K_IS = 95;
    /*      */   public static final int K_JSON = 96;
    /*      */   public static final int K_KEY = 97;
    /*      */   public static final int K_KEYS = 98;
    /*      */   public static final int K_KEYSPACE = 99;
    /*      */   public static final int K_KEYSPACES = 100;
    /*      */   public static final int K_LANGUAGE = 101;
    /*      */   public static final int K_LIKE = 102;
    /*      */   public static final int K_LIMIT = 103;
    /*      */   public static final int K_LIST = 104;
    /*      */   public static final int K_LOGIN = 105;
    /*      */   public static final int K_MAP = 106;
    /*      */   public static final int K_MATERIALIZED = 107;
    /*      */   public static final int K_MBEAN = 108;
    /*      */   public static final int K_MBEANS = 109;
    /*      */   public static final int K_MODIFY = 110;
    /*      */   public static final int K_NEGATIVE_INFINITY = 111;
    /*      */   public static final int K_NEGATIVE_NAN = 112;
    /*      */   public static final int K_NOLOGIN = 113;
    /*      */   public static final int K_NORECURSIVE = 114;
    /*      */   public static final int K_NOSUPERUSER = 115;
    /*      */   public static final int K_NOT = 116;
    /*      */   public static final int K_NULL = 117;
    /*      */   public static final int K_OF = 118;
    /*      */   public static final int K_ON = 119;
    /*      */   public static final int K_ONLY = 120;
    /*      */   public static final int K_OPTIONS = 121;
    /*      */   public static final int K_OR = 122;
    /*      */   public static final int K_ORDER = 123;
    /*      */   public static final int K_PARTITION = 124;
    /*      */   public static final int K_PASSWORD = 125;
    /*      */   public static final int K_PER = 126;
    /*      */   public static final int K_PERMISSION = 127;
    /*      */   public static final int K_PERMISSIONS = 128;
    /*      */   public static final int K_POSITIVE_INFINITY = 129;
    /*      */   public static final int K_POSITIVE_NAN = 130;
    /*      */   public static final int K_PRIMARY = 131;
    /*      */   public static final int K_RENAME = 132;
    /*      */   public static final int K_REPLACE = 133;
    /*      */   public static final int K_RETURNS = 134;
    /*      */   public static final int K_REVOKE = 135;
    /*      */   public static final int K_ROLE = 136;
    /*      */   public static final int K_ROLES = 137;
    /*      */   public static final int K_SCHEMA = 138;
    /*      */   public static final int K_SELECT = 139;
    /*      */   public static final int K_SET = 140;
    /*      */   public static final int K_SFUNC = 141;
    /*      */   public static final int K_SMALLINT = 142;
    /*      */   public static final int K_STATIC = 143;
    /*      */   public static final int K_STORAGE = 144;
    /*      */   public static final int K_STYPE = 145;
    /*      */   public static final int K_SUPERUSER = 146;
    /*      */   public static final int K_TABLES = 147;
    /*      */   public static final int K_TEXT = 148;
    /*      */   public static final int K_TIME = 149;
    /*      */   public static final int K_TIMESTAMP = 150;
    /*      */   public static final int K_TIMEUUID = 151;
    /*      */   public static final int K_TINYINT = 152;
    /*      */   public static final int K_TO = 153;
    /*      */   public static final int K_TOKEN = 154;
    /*      */   public static final int K_TRIGGER = 155;
    /*      */   public static final int K_TRUNCATE = 156;
    /*      */   public static final int K_TTL = 157;
    /*      */   public static final int K_TUPLE = 158;
    /*      */   public static final int K_TYPE = 159;
    /*      */   public static final int K_TYPES = 160;
    /*      */   public static final int K_UNLOGGED = 161;
    /*      */   public static final int K_UNSET = 162;
    /*      */   public static final int K_UPDATE = 163;
    /*      */   public static final int K_USE = 164;
    /*      */   public static final int K_USER = 165;
    /*      */   public static final int K_USERS = 166;
    /*      */   public static final int K_USING = 167;
    /*      */   public static final int K_UUID = 168;
    /*      */   public static final int K_VALUES = 169;
    /*      */   public static final int K_VARCHAR = 170;
    /*      */   public static final int K_VARINT = 171;
    /*      */   public static final int K_VIEW = 172;
    /*      */   public static final int K_WHERE = 173;
    /*      */   public static final int K_WITH = 174;
    /*      */   public static final int K_WRITETIME = 175;
    /*      */   public static final int L = 176;
    /*      */   public static final int LETTER = 177;
    /*      */   public static final int M = 178;
    /*      */   public static final int MULTILINE_COMMENT = 179;
    /*      */   public static final int N = 180;
    /*      */   public static final int O = 181;
    /*      */   public static final int P = 182;
    /*      */   public static final int Q = 183;
    /*      */   public static final int QMARK = 184;
    /*      */   public static final int QUOTED_NAME = 185;
    /*      */   public static final int R = 186;
    /*      */   public static final int RANGE = 187;
    /*      */   public static final int S = 188;
    /*      */   public static final int STRING_LITERAL = 189;
    /*      */   public static final int T = 190;
    /*      */   public static final int U = 191;
    /*      */   public static final int UUID = 192;
    /*      */   public static final int V = 193;
    /*      */   public static final int W = 194;
    /*      */   public static final int WS = 195;
    /*      */   public static final int X = 196;
    /*      */   public static final int Y = 197;
    /*      */   public static final int Z = 198;
    /*      */   public static final int Tokens = 223;
    /*  235 */ List<Token> tokens = new ArrayList<>();

    /*      */
    /*      */
    /*      */
    public void emit(Token token) {
        /*  239 */
        this.state.token = token;
        /*  240 */
        this.tokens.add(token);
        /*      */
    }

    /*      */
    /*      */
    /*      */
    public Token nextToken() {
        /*  245 */
        super.nextToken();
        /*  246 */
        if (this.tokens.size() == 0)
            /*  247 */ return (Token) new CommonToken(-1);
        /*  248 */
        return this.tokens.remove(0);
        /*      */
    }

    /*      */
    /*  251 */   private final List<ErrorListener> listeners = new ArrayList<>();
    public Cql_Lexer gLexer;
    protected DFA1 dfa1;
    static final String DFA1_eotS = "\005￿\001\027\001￿\001\031\001\032\001\033\002￿\001\035\001￿\001\037\003￿\001\025\r￿\003\025\001￿";
    static final String DFA1_eofS = "$￿";
    static final String DFA1_minS = "\001\t\004￿\001=\001￿\001-\001.\001*\002￿\001=\001￿\001=\003￿\001x\r￿\001p\001r\001(\001￿";
    static final String DFA1_maxS = "\001}\004￿\001=\001￿\001n\001.\001/\002￿\001=\001￿\001=\003￿\001x\r￿\001p\001r\001(\001￿";
    static final String DFA1_acceptS = "\001￿\001\001\001\002\001\003\001\004\001￿\001\007\003￿\001\f\001\r\001￿\001\020\001￿\001\023\001\024\001\025\001￿\001\027\001\030\001\031\001\006\001\005\001\t\001\b\001\n\001\013\001\017\001\016\001\022\001\021\003￿\001\026";
    /*      */   static final String DFA1_specialS = "$￿}>";

    /*      */
    /*      */
    public void addErrorListener(ErrorListener listener) {
        /*  255 */
        this.listeners.add(listener);
        /*      */
    }

    /*      */
    /*      */
    /*      */
    public void removeErrorListener(ErrorListener listener) {
        /*  260 */
        this.listeners.remove(listener);
        /*      */
    }

    /*      */
    /*      */
    /*      */
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        /*  265 */
        for (int i = 0, m = this.listeners.size(); i < m; i++) {
            /*  266 */
            ((ErrorListener) this.listeners.get(i)).syntaxError((BaseRecognizer) this, tokenNames, e);
            /*      */
        }
        /*      */
    }

    /*      */
    /*      */
    /*      */
    /*      */
    /*      */
    public Lexer[] getDelegates() {
        /*  274 */
        return new Lexer[]{this.gLexer};
        /*      */
    }

    /*      */
    /*      */
    /*      */
    public CqlLexer(CharStream input) {
        /*  279 */
        this(input, new RecognizerSharedState());
    }

    /*      */
    public String getGrammarFileName() {
        return "Cql__.g";
    }

    /*      */
    public final void mT__199() throws RecognitionException {
        int _type = 199;
        int _channel = 0;
        match("!=");
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*  282 */
    public final void mT__200() throws RecognitionException {
        int _type = 200;
        int _channel = 0;
        match(37);
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mT__201() throws RecognitionException {
        int _type = 201;
        int _channel = 0;
        match(40);
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mT__202() throws RecognitionException {
        int _type = 202;
        int _channel = 0;
        match(41);
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mT__203() throws RecognitionException {
        int _type = 203;
        int _channel = 0;
        match(43);
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mT__204() throws RecognitionException {
        int _type = 204;
        int _channel = 0;
        match("+=");
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public CqlLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*      */
        /*  959 */
        this.dfa1 = new DFA1((BaseRecognizer) this);
        this.gLexer = new Cql_Lexer(input, state, this);
    }

    public final void mT__205() throws RecognitionException {
        int _type = 205;
        int _channel = 0;
        match(44);
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mT__206() throws RecognitionException {
        int _type = 206;
        int _channel = 0;
        match(45);
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mT__207() throws RecognitionException {
        int _type = 207;
        int _channel = 0;
        match("-=");
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mT__208() throws RecognitionException {
        int _type = 208;
        int _channel = 0;
        match(46);
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mT__209() throws RecognitionException {
        int _type = 209;
        int _channel = 0;
        match(47);
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mT__210() throws RecognitionException {
        int _type = 210;
        int _channel = 0;
        match(58);
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public CqlLexer() {
        this.dfa1 = new DFA1((BaseRecognizer) this);
    }

    public final void mT__211() throws RecognitionException {
        int _type = 211;
        int _channel = 0;
        match(59);
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*      */
    public final void mT__212() throws RecognitionException {
        int _type = 212;
        int _channel = 0;
        match(60);
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*      */
    public final void mT__213() throws RecognitionException {
        int _type = 213;
        int _channel = 0;
        match("<=");
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*      */
    public final void mT__214() throws RecognitionException {
        int _type = 214;
        /*      */
        int _channel = 0;
        /*      */
        match(61);
        /*      */
        this.state.type = _type;
        /*      */
        this.state.channel = _channel;
    }

    /*      */
    public final void mT__215() throws RecognitionException {
        int _type = 215;
        /*      */
        int _channel = 0;
        /*      */
        match(62);
        /*      */
        this.state.type = _type;
        /*      */
        this.state.channel = _channel;
    }

    /*      */
    public final void mT__216() throws RecognitionException {
        int _type = 216;
        /*      */
        int _channel = 0;
        /*      */
        match(">=");
        /*      */
        this.state.type = _type;
        /*      */
        this.state.channel = _channel;
    }

    /*  977 */   static final String[] DFA1_transitionS = new String[]{"\002\025\002￿\001\025\022￿\001\025\001\001\001\025\001￿\001\025\001\002\001￿\001\025\001\003\001\004\001\020\001\005\001\006\001\007\001\b\001\t\n\025\001\n\001\013\001\f\001\r\001\016\001\025\001￿\032\025\001\017\001￿\001\021\003￿\004\025\001\022\025\025\001\023\001￿\001\024", "", "", "", "", "\001\026", "", "\001\025\002￿\n\025\003￿\001\030\013￿\001\025\004￿\001\025\001￿\001\025\030￿\001\025\004￿\001\025", "\001\025", "\001\025\004￿\001\025", "", "", "\001\034", "", "\001\036", "", "", "", "\001 ", "", "", "", "", "", "", "", "", "", "", "", "", "", "\001!", "\001\"", "\001#", ""};

    public final void mT__217() throws RecognitionException {
        int _type = 217;
        int _channel = 0;
        match(91);
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*      */
    public final void mT__218() throws RecognitionException {
        int _type = 218;
        int _channel = 0;
        match(42);
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*      */
    public final void mT__219() throws RecognitionException {
        int _type = 219;
        int _channel = 0;
        match(93);
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*      */
    public final void mT__220() throws RecognitionException {
        int _type = 220;
        int _channel = 0;
        match("expr(");
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*      */
    public final void mT__221() throws RecognitionException {
        int _type = 221;
        int _channel = 0;
        match(123);
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*      */
    public final void mT__222() throws RecognitionException {
        int _type = 222;
        int _channel = 0;
        match(125);
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*      */
    public void mTokens() throws RecognitionException {
        int alt1 = 25;
        alt1 = this.dfa1.predict((IntStream) this.input);
        switch (alt1) {
            case 1:
                mT__199();
                break;
            /*      */
            case 2:
                mT__200();
                break;
            /*      */
            case 3:
                mT__201();
                break;
            /*      */
            case 4:
                mT__202();
                break;
            /*      */
            case 5:
                mT__203();
                break;
            /*      */
            case 6:
                mT__204();
                break;
            /*      */
            case 7:
                mT__205();
                break;
            /*      */
            case 8:
                mT__206();
                break;
            /*      */
            case 9:
                mT__207();
                break;
            /*      */
            case 10:
                mT__208();
                break;
            /*      */
            case 11:
                mT__209();
                break;
            /*      */
            case 12:
                mT__210();
                break;
            /*      */
            case 13:
                mT__211();
                break;
            /*      */
            case 14:
                /*      */
                mT__212();
                break;
            /*      */
            case 15:
                /*      */
                mT__213();
                break;
            /*      */
            case 16:
                /*      */
                mT__214();
                break;
            /*      */
            case 17:
                /*      */
                mT__215();
                break;
            /*      */
            case 18:
                /*      */
                mT__216();
                break;
            /*      */
            case 19:
                /*      */
                mT__217();
                break;
            /*      */
            case 20:
                /*      */
                mT__218();
                break;
            /*      */
            case 21:
                /*      */
                mT__219();
                break;
            /*      */
            case 22:
                /*      */
                mT__220();
                break;
            /*      */
            case 23:
                /*      */
                mT__221();
                break;
            /*      */
            case 24:
                /*      */
                mT__222();
                break;
            /*      */
            case 25:
                /*      */
                this.gLexer.mTokens();
                break;
        }
    }

    /* 1020 */   static final short[] DFA1_eot = DFA.unpackEncodedString("\005￿\001\027\001￿\001\031\001\032\001\033\002￿\001\035\001￿\001\037\003￿\001\025\r￿\003\025\001￿");
    /* 1021 */   static final short[] DFA1_eof = DFA.unpackEncodedString("$￿");
    /* 1022 */   static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars("\001\t\004￿\001=\001￿\001-\001.\001*\002￿\001=\001￿\001=\003￿\001x\r￿\001p\001r\001(\001￿");
    /* 1023 */   static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars("\001}\004￿\001=\001￿\001n\001.\001/\002￿\001=\001￿\001=\003￿\001x\r￿\001p\001r\001(\001￿");
    /* 1024 */   static final short[] DFA1_accept = DFA.unpackEncodedString("\001￿\001\001\001\002\001\003\001\004\001￿\001\007\003￿\001\f\001\r\001￿\001\020\001￿\001\023\001\024\001\025\001￿\001\027\001\030\001\031\001\006\001\005\001\t\001\b\001\n\001\013\001\017\001\016\001\022\001\021\003￿\001\026");
    /* 1025 */   static final short[] DFA1_special = DFA.unpackEncodedString("$￿}>");
    /*      */   static final short[][] DFA1_transition;

    /*      */
    /*      */   static {
        /* 1029 */
        int numStates = DFA1_transitionS.length;
        /* 1030 */
        DFA1_transition = new short[numStates][];
        /* 1031 */
        for (int i = 0; i < numStates; i++)
            /* 1032 */
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        /*      */
    }

    /*      */
    /*      */   protected class DFA1
            /*      */ extends DFA
            /*      */ {
        /*      */
        public DFA1(BaseRecognizer recognizer) {
            /* 1039 */
            this.recognizer = recognizer;
            /* 1040 */
            this.decisionNumber = 1;
            /* 1041 */
            this.eot = CqlLexer.DFA1_eot;
            /* 1042 */
            this.eof = CqlLexer.DFA1_eof;
            /* 1043 */
            this.min = CqlLexer.DFA1_min;
            /* 1044 */
            this.max = CqlLexer.DFA1_max;
            /* 1045 */
            this.accept = CqlLexer.DFA1_accept;
            /* 1046 */
            this.special = CqlLexer.DFA1_special;
            /* 1047 */
            this.transition = CqlLexer.DFA1_transition;
            /*      */
        }

        /*      */
        /*      */
        public String getDescription() {
            /* 1051 */
            return "1:1: Tokens : ( T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | T__221 | T__222 | Lexer. Tokens );";
            /*      */
        }
        /*      */
    }
    /*      */
}


/* Location:              C:\Users\Leo\Desktop\temp\apache-cassandra-4.1.9.jar!\org\apache\cassandra\cql3\CqlLexer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */