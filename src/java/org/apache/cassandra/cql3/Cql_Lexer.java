/*       */
package org.apache.cassandra.cql3;
/*       */

import java.util.ArrayList;
import java.util.List;
/*       */ import org.antlr.runtime.*;
/*       */
/*       */
/*       */
/*       */
/*       */
/*       */
/*       */
/*       */
/*       */
/*       */

/*       */
/*       */ public class Cql_Lexer extends Lexer {
    /*       */   public static final int EOF = -1;
    /*       */   public static final int T__199 = 199;
    /*       */   public static final int T__200 = 200;
    /*       */   public static final int T__201 = 201;
    /*       */   public static final int T__202 = 202;
    /*       */   public static final int T__203 = 203;
    /*       */   public static final int T__204 = 204;
    /*       */   public static final int T__205 = 205;
    /*       */   public static final int T__206 = 206;
    /*       */   public static final int T__207 = 207;
    /*       */   public static final int T__208 = 208;
    /*       */   public static final int T__209 = 209;
    /*       */   public static final int T__210 = 210;
    /*       */   public static final int T__211 = 211;
    /*       */   public static final int T__212 = 212;
    /*       */   public static final int T__213 = 213;
    /*       */   public static final int T__214 = 214;
    /*       */   public static final int T__215 = 215;
    /*       */   public static final int T__216 = 216;
    /*       */   public static final int T__217 = 217;
    /*       */   public static final int T__218 = 218;
    /*       */   public static final int T__219 = 219;
    /*       */   public static final int T__220 = 220;
    /*       */   public static final int T__221 = 221;
    /*       */   public static final int T__222 = 222;
    /*       */   public static final int A = 4;
    /*       */   public static final int B = 5;
    /*       */   public static final int BOOLEAN = 6;
    /*       */   public static final int C = 7;
    /*       */   public static final int COMMENT = 8;
    /*       */   public static final int D = 9;
    /*       */   public static final int DIGIT = 10;
    /*       */   public static final int DURATION = 11;
    /*       */   public static final int DURATION_ISO_8601_PERIOD_DESIGNATORS = 12;
    /*       */   public static final int DURATION_ISO_8601_TIME_DESIGNATORS = 13;
    /*       */   public static final int DURATION_ISO_8601_WEEK_PERIOD_DESIGNATOR = 14;
    /*       */   public static final int DURATION_UNIT = 15;
    /*       */   public static final int E = 16;
    /*       */   public static final int EMPTY_QUOTED_NAME = 17;
    /*       */   public static final int EXPONENT = 18;
    /*       */   public static final int F = 19;
    /*       */   public static final int FLOAT = 20;
    /*       */   public static final int G = 21;
    /*       */   public static final int H = 22;
    /*       */   public static final int HEX = 23;
    /*       */   public static final int HEXNUMBER = 24;
    /*       */   public static final int I = 25;
    /*       */   public static final int IDENT = 26;
    /*       */   public static final int INTEGER = 27;
    /*       */   public static final int J = 28;
    /*       */   public static final int K = 29;
    /*       */   public static final int K_ACCESS = 30;
    /*       */   public static final int K_ADD = 31;
    /*       */   public static final int K_AGGREGATE = 32;
    /*       */   public static final int K_AGGREGATES = 33;
    /*       */   public static final int K_ALL = 34;
    /*       */   public static final int K_ALLOW = 35;
    /*       */   public static final int K_ALTER = 36;
    /*       */   public static final int K_AND = 37;
    /*       */   public static final int K_APPLY = 38;
    /*       */   public static final int K_AS = 39;
    /*       */   public static final int K_ASC = 40;
    /*       */   public static final int K_ASCII = 41;
    /*       */   public static final int K_AUTHORIZE = 42;
    /*       */   public static final int K_BATCH = 43;
    /*       */   public static final int K_BEGIN = 44;
    /*       */   public static final int K_BIGINT = 45;
    /*       */   public static final int K_BLOB = 46;
    /*       */   public static final int K_BOOLEAN = 47;
    /*       */   public static final int K_BY = 48;
    /*       */   public static final int K_CALLED = 49;
    /*       */   public static final int K_CAST = 50;
    /*       */   public static final int K_CLUSTER = 51;
    /*       */   public static final int K_CLUSTERING = 52;
    /*       */   public static final int K_COLUMNFAMILY = 53;
    /*       */   public static final int K_COMPACT = 54;
    /*       */   public static final int K_CONTAINS = 55;
    /*       */   public static final int K_COUNT = 56;
    /*       */   public static final int K_COUNTER = 57;
    /*       */   public static final int K_CREATE = 58;
    /*       */   public static final int K_CUSTOM = 59;
    /*       */   public static final int K_DATACENTERS = 60;
    /*       */   public static final int K_DATE = 61;
    /*       */   public static final int K_DECIMAL = 62;
    /*       */   public static final int K_DEFAULT = 63;
    /*       */   public static final int K_DELETE = 64;
    /*       */   public static final int K_DESC = 65;
    /*       */   public static final int K_DESCRIBE = 66;
    /*       */   public static final int K_DISTINCT = 67;
    /*       */   public static final int K_DOUBLE = 68;
    /*       */   public static final int K_DROP = 69;
    /*       */   public static final int K_DURATION = 70;
    /*       */   public static final int K_ENTRIES = 71;
    /*       */   public static final int K_EXECUTE = 72;
    /*       */   public static final int K_EXISTS = 73;
    /*       */   public static final int K_FILTERING = 74;
    /*       */   public static final int K_FINALFUNC = 75;
    /*       */   public static final int K_FLOAT = 76;
    /*       */   public static final int K_FROM = 77;
    /*       */   public static final int K_FROZEN = 78;
    /*       */   public static final int K_FULL = 79;
    /*       */   public static final int K_FUNCTION = 80;
    /*       */   public static final int K_FUNCTIONS = 81;
    /*       */   public static final int K_GRANT = 82;
    /*       */   public static final int K_GROUP = 83;
    /*       */   public static final int K_HASHED = 84;
    /*       */   public static final int K_IF = 85;
    /*       */   public static final int K_IN = 86;
    /*       */   public static final int K_INDEX = 87;
    /*       */   public static final int K_INET = 88;
    /*       */   public static final int K_INITCOND = 89;
    /*       */   public static final int K_INPUT = 90;
    /*       */   public static final int K_INSERT = 91;
    /*       */   public static final int K_INT = 92;
    /*       */   public static final int K_INTERNALS = 93;
    /*       */   public static final int K_INTO = 94;
    /*       */   public static final int K_IS = 95;
    /*       */   public static final int K_JSON = 96;
    /*       */   public static final int K_KEY = 97;
    /*       */   public static final int K_KEYS = 98;
    /*       */   public static final int K_KEYSPACE = 99;
    /*       */   public static final int K_KEYSPACES = 100;
    /*       */   public static final int K_LANGUAGE = 101;
    /*       */   public static final int K_LIKE = 102;
    /*       */   public static final int K_LIMIT = 103;
    /*       */   public static final int K_LIST = 104;
    /*       */   public static final int K_LOGIN = 105;
    /*       */   public static final int K_MAP = 106;
    /*       */   public static final int K_MATERIALIZED = 107;
    /*       */   public static final int K_MBEAN = 108;
    /*       */   public static final int K_MBEANS = 109;
    /*       */   public static final int K_MODIFY = 110;
    /*       */   public static final int K_NEGATIVE_INFINITY = 111;
    /*       */   public static final int K_NEGATIVE_NAN = 112;
    /*       */   public static final int K_NOLOGIN = 113;
    /*       */   public static final int K_NORECURSIVE = 114;
    /*       */   public static final int K_NOSUPERUSER = 115;
    /*       */   public static final int K_NOT = 116;
    /*       */   public static final int K_NULL = 117;
    /*       */   public static final int K_OF = 118;
    /*       */   public static final int K_ON = 119;
    /*       */   public static final int K_ONLY = 120;
    /*       */   public static final int K_OPTIONS = 121;
    /*       */   public static final int K_OR = 122;
    /*       */   public static final int K_ORDER = 123;
    /*       */   public static final int K_PARTITION = 124;
    /*       */   public static final int K_PASSWORD = 125;
    /*       */   public static final int K_PER = 126;
    /*       */   public static final int K_PERMISSION = 127;
    /*       */   public static final int K_PERMISSIONS = 128;
    /*       */   public static final int K_POSITIVE_INFINITY = 129;
    /*       */   public static final int K_POSITIVE_NAN = 130;
    /*       */   public static final int K_PRIMARY = 131;
    /*       */   public static final int K_RENAME = 132;
    /*       */   public static final int K_REPLACE = 133;
    /*       */   public static final int K_RETURNS = 134;
    /*       */   public static final int K_REVOKE = 135;
    /*       */   public static final int K_ROLE = 136;
    /*       */   public static final int K_ROLES = 137;
    /*       */   public static final int K_SCHEMA = 138;
    /*       */   public static final int K_SELECT = 139;
    /*       */   public static final int K_SET = 140;
    /*       */   public static final int K_SFUNC = 141;
    /*       */   public static final int K_SMALLINT = 142;
    /*       */   public static final int K_STATIC = 143;
    /*       */   public static final int K_STORAGE = 144;
    /*       */   public static final int K_STYPE = 145;
    /*       */   public static final int K_SUPERUSER = 146;
    /*       */   public static final int K_TABLES = 147;
    /*       */   public static final int K_TEXT = 148;
    /*       */   public static final int K_TIME = 149;
    /*       */   public static final int K_TIMESTAMP = 150;
    /*       */   public static final int K_TIMEUUID = 151;
    /*       */   public static final int K_TINYINT = 152;
    /*       */   public static final int K_TO = 153;
    /*       */   public static final int K_TOKEN = 154;
    /*       */   public static final int K_TRIGGER = 155;
    /*       */   public static final int K_TRUNCATE = 156;
    /*       */   public static final int K_TTL = 157;
    /*       */   public static final int K_TUPLE = 158;
    /*       */   public static final int K_TYPE = 159;
    /*       */   public static final int K_TYPES = 160;
    /*       */   public static final int K_UNLOGGED = 161;
    /*       */   public static final int K_UNSET = 162;
    /*       */   public static final int K_UPDATE = 163;
    /*       */   public static final int K_USE = 164;
    /*       */   public static final int K_USER = 165;
    /*       */   public static final int K_USERS = 166;
    /*       */   public static final int K_USING = 167;
    /*       */   public static final int K_UUID = 168;
    /*       */   public static final int K_VALUES = 169;
    /*       */   public static final int K_VARCHAR = 170;
    /*       */   public static final int K_VARINT = 171;
    /*       */   public static final int K_VIEW = 172;
    /*       */   public static final int K_WHERE = 173;
    /*       */   public static final int K_WITH = 174;
    /*       */   public static final int K_WRITETIME = 175;
    /*       */   public static final int L = 176;
    /*       */   public static final int LETTER = 177;
    /*       */   public static final int M = 178;
    /*       */   public static final int MULTILINE_COMMENT = 179;
    /*       */   public static final int N = 180;
    /*       */   public static final int O = 181;
    /*       */   public static final int P = 182;
    /*       */   public static final int Q = 183;
    /*       */   public static final int QMARK = 184;
    /*       */   public static final int QUOTED_NAME = 185;
    /*       */   public static final int R = 186;
    /*       */   public static final int RANGE = 187;
    /*       */   public static final int S = 188;
    /*       */   public static final int STRING_LITERAL = 189;
    /*       */   public static final int T = 190;
    /*       */   public static final int U = 191;
    /*       */   public static final int UUID = 192;
    /*       */   public static final int V = 193;
    /*       */   public static final int W = 194;
    /*       */   public static final int WS = 195;
    /*       */   public static final int X = 196;
    /*       */   public static final int Y = 197;
    /*       */   public static final int Z = 198;
    /*       */   public static final int Tokens = 223;
    /*   237 */ List<Token> tokens = new ArrayList<>();

    /*       */
    /*       */
    /*       */
    public void emit(Token token) {
        /*   241 */
        this.state.token = token;
        /*   242 */
        this.tokens.add(token);
        /*       */
    }

    /*       */
    /*       */
    /*       */
    public Token nextToken() {
        /*   247 */
        super.nextToken();
        /*   248 */
        if (this.tokens.size() == 0)
            /*   249 */ return (Token) new CommonToken(-1);
        /*   250 */
        return this.tokens.remove(0);
        /*       */
    }

    /*       */
    /*   253 */   private final List<ErrorListener> listeners = new ArrayList<>();
    public CqlLexer gCql;
    public CqlLexer gParent;
    protected DFA22 dfa22;
    protected DFA13 dfa13;
    protected DFA32 dfa32;
    protected DFA25 dfa25;
    protected DFA35 dfa35;
    protected DFA50 dfa50;
    protected DFA57 dfa57;
    static final String DFA22_eotS = "\007￿";
    static final String DFA22_eofS = "\007￿";
    static final String DFA22_minS = "\001-\001P\0020\003￿";
    static final String DFA22_maxS = "\002P\0019\001Y\003￿";
    static final String DFA22_acceptS = "\004￿\001\001\001\002\001\003";
    /*       */   static final String DFA22_specialS = "\007￿}>";

    /*       */
    /*       */
    public void addErrorListener(ErrorListener listener) {
        /*   257 */
        this.listeners.add(listener);
        /*       */
    }

    /*       */
    /*       */
    /*       */
    public void removeErrorListener(ErrorListener listener) {
        /*   262 */
        this.listeners.remove(listener);
        /*       */
    }

    /*       */
    /*       */
    /*       */
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        /*   267 */
        for (int i = 0, m = this.listeners.size(); i < m; i++) {
            /*   268 */
            ((ErrorListener) this.listeners.get(i)).syntaxError((BaseRecognizer) this, tokenNames, e);
            /*       */
        }
        /*       */
    }

    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    public Lexer[] getDelegates() {
        /*   277 */
        return new Lexer[0];
        /*       */
    }

    /*       */
    /*       */
    /*       */
    public Cql_Lexer(CharStream input, CqlLexer gCql) {
        /*   282 */
        this(input, new RecognizerSharedState(), gCql);
        /*       */
    }

    /*       */
    /*   285 */
    public Cql_Lexer(CharStream input, RecognizerSharedState state, CqlLexer gCql) {
        super(input, state);
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*       */
        /*  8953 */
        this.dfa22 = new DFA22((BaseRecognizer) this);
        /*  8954 */
        this.dfa13 = new DFA13((BaseRecognizer) this);
        /*  8955 */
        this.dfa32 = new DFA32((BaseRecognizer) this);
        /*  8956 */
        this.dfa25 = new DFA25((BaseRecognizer) this);
        /*  8957 */
        this.dfa35 = new DFA35((BaseRecognizer) this);
        /*  8958 */
        this.dfa50 = new DFA50((BaseRecognizer) this);
        /*  8959 */
        this.dfa57 = new DFA57((BaseRecognizer) this);
        this.gCql = gCql;
        this.gParent = gCql;
    }

    public String getGrammarFileName() {
        return "Lexer.g";
    }

    public final void mK_SELECT() throws RecognitionException {
        int _type = 139;
        int _channel = 0;
        mS();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_FROM() throws RecognitionException {
        int _type = 77;
        int _channel = 0;
        mF();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mM();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_AS() throws RecognitionException {
        int _type = 39;
        int _channel = 0;
        mA();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_WHERE() throws RecognitionException {
        int _type = 173;
        int _channel = 0;
        mW();
        if (this.state.failed) return;
        mH();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_AND() throws RecognitionException {
        int _type = 37;
        int _channel = 0;
        mA();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mD();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_KEY() throws RecognitionException {
        int _type = 97;
        int _channel = 0;
        mK();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mY();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_KEYS() throws RecognitionException {
        int _type = 98;
        int _channel = 0;
        mK();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mY();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_ENTRIES() throws RecognitionException {
        int _type = 71;
        int _channel = 0;
        mE();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_FULL() throws RecognitionException {
        int _type = 79;
        int _channel = 0;
        mF();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_INSERT() throws RecognitionException {
        int _type = 91;
        int _channel = 0;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_UPDATE() throws RecognitionException {
        int _type = 163;
        int _channel = 0;
        mU();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        mD();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_WITH() throws RecognitionException {
        int _type = 174;
        int _channel = 0;
        mW();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mH();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_LIMIT() throws RecognitionException {
        int _type = 103;
        int _channel = 0;
        mL();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mM();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_PER() throws RecognitionException {
        int _type = 126;
        int _channel = 0;
        mP();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_PARTITION() throws RecognitionException {
        int _type = 124;
        int _channel = 0;
        mP();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_USING() throws RecognitionException {
        int _type = 167;
        int _channel = 0;
        mU();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_USE() throws RecognitionException {
        int _type = 164;
        int _channel = 0;
        mU();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_DISTINCT() throws RecognitionException {
        int _type = 67;
        int _channel = 0;
        mD();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_COUNT() throws RecognitionException {
        int _type = 56;
        int _channel = 0;
        mC();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_SET() throws RecognitionException {
        int _type = 140;
        int _channel = 0;
        mS();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_BEGIN() throws RecognitionException {
        int _type = 44;
        int _channel = 0;
        mB();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_UNLOGGED() throws RecognitionException {
        int _type = 161;
        int _channel = 0;
        mU();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mD();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_BATCH() throws RecognitionException {
        int _type = 43;
        int _channel = 0;
        mB();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mH();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_APPLY() throws RecognitionException {
        int _type = 38;
        int _channel = 0;
        mA();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mY();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_TRUNCATE() throws RecognitionException {
        int _type = 156;
        int _channel = 0;
        mT();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_DELETE() throws RecognitionException {
        int _type = 64;
        int _channel = 0;
        mD();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_IN() throws RecognitionException {
        int _type = 86;
        int _channel = 0;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_CREATE() throws RecognitionException {
        int _type = 58;
        int _channel = 0;
        mC();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_SCHEMA() throws RecognitionException {
        int _type = 138;
        int _channel = 0;
        mS();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mH();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mM();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_KEYSPACE() throws RecognitionException {
        int _type = 99;
        int _channel = 0;
        int alt1 = 2;
        int LA1_0 = this.input.LA(1);
        if (LA1_0 == 75 || LA1_0 == 107) {
            alt1 = 1;
        } else if (LA1_0 == 83 || LA1_0 == 115) {
            alt1 = 2;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            NoViableAltException nvae = new NoViableAltException("", 1, 0, (IntStream) this.input);
            throw nvae;
        }
        switch (alt1) {
            case 1:
                mK();
                if (this.state.failed) return;
                mE();
                if (this.state.failed) return;
                mY();
                if (this.state.failed) return;
                mS();
                if (this.state.failed) return;
                mP();
                if (this.state.failed) return;
                mA();
                if (this.state.failed) return;
                mC();
                if (this.state.failed) return;
                mE();
                if (this.state.failed) return;
                break;
            case 2:
                mK_SCHEMA();
                if (this.state.failed) return;
                break;
        }
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_KEYSPACES() throws RecognitionException {
        int _type = 100;
        int _channel = 0;
        mK();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mY();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_COLUMNFAMILY() throws RecognitionException {
        int _type = 53;
        int _channel = 0;
        int alt2 = 2;
        int LA2_0 = this.input.LA(1);
        if (LA2_0 == 67 || LA2_0 == 99) {
            alt2 = 1;
        } else if (LA2_0 == 84 || LA2_0 == 116) {
            alt2 = 2;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            NoViableAltException nvae = new NoViableAltException("", 2, 0, (IntStream) this.input);
            throw nvae;
        }
        switch (alt2) {
            case 1:
                mC();
                if (this.state.failed) return;
                mO();
                if (this.state.failed) return;
                mL();
                if (this.state.failed) return;
                mU();
                if (this.state.failed) return;
                mM();
                if (this.state.failed) return;
                mN();
                if (this.state.failed) return;
                mF();
                if (this.state.failed) return;
                mA();
                if (this.state.failed) return;
                mM();
                if (this.state.failed) return;
                mI();
                if (this.state.failed) return;
                mL();
                if (this.state.failed) return;
                mY();
                if (this.state.failed) return;
                break;
            case 2:
                mT();
                if (this.state.failed) return;
                mA();
                if (this.state.failed) return;
                mB();
                if (this.state.failed) return;
                mL();
                if (this.state.failed) return;
                mE();
                if (this.state.failed) return;
                break;
        }
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_TABLES() throws RecognitionException {
        int _type = 147;
        int _channel = 0;
        int alt3 = 2;
        int LA3_0 = this.input.LA(1);
        if (LA3_0 == 67 || LA3_0 == 99) {
            alt3 = 1;
        } else if (LA3_0 == 84 || LA3_0 == 116) {
            alt3 = 2;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            NoViableAltException nvae = new NoViableAltException("", 3, 0, (IntStream) this.input);
            throw nvae;
        }
        switch (alt3) {
            case 1:
                mC();
                if (this.state.failed) return;
                mO();
                if (this.state.failed) return;
                mL();
                if (this.state.failed) return;
                mU();
                if (this.state.failed) return;
                mM();
                if (this.state.failed) return;
                mN();
                if (this.state.failed) return;
                mF();
                if (this.state.failed) return;
                mA();
                if (this.state.failed) return;
                mM();
                if (this.state.failed) return;
                mI();
                if (this.state.failed) return;
                mL();
                if (this.state.failed) return;
                mI();
                if (this.state.failed) return;
                mE();
                if (this.state.failed) return;
                mS();
                if (this.state.failed) return;
                break;
            case 2:
                mT();
                if (this.state.failed) return;
                mA();
                if (this.state.failed) return;
                mB();
                if (this.state.failed) return;
                mL();
                if (this.state.failed) return;
                mE();
                if (this.state.failed) return;
                mS();
                if (this.state.failed) return;
                break;
        }
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_MATERIALIZED() throws RecognitionException {
        int _type = 107;
        int _channel = 0;
        mM();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mZ();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mD();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_VIEW() throws RecognitionException {
        int _type = 172;
        int _channel = 0;
        mV();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mW();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_INDEX() throws RecognitionException {
        int _type = 87;
        int _channel = 0;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mD();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mX();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_CUSTOM() throws RecognitionException {
        int _type = 59;
        int _channel = 0;
        mC();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mM();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_ON() throws RecognitionException {
        int _type = 119;
        int _channel = 0;
        mO();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_TO() throws RecognitionException {
        int _type = 153;
        int _channel = 0;
        mT();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_DROP() throws RecognitionException {
        int _type = 69;
        int _channel = 0;
        mD();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_PRIMARY() throws RecognitionException {
        int _type = 131;
        int _channel = 0;
        mP();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mM();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mY();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_INTO() throws RecognitionException {
        int _type = 94;
        int _channel = 0;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_VALUES() throws RecognitionException {
        int _type = 169;
        int _channel = 0;
        mV();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_TIMESTAMP() throws RecognitionException {
        int _type = 150;
        int _channel = 0;
        mT();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mM();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mM();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_TTL() throws RecognitionException {
        int _type = 157;
        int _channel = 0;
        mT();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_CAST() throws RecognitionException {
        int _type = 50;
        int _channel = 0;
        mC();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_ALTER() throws RecognitionException {
        int _type = 36;
        int _channel = 0;
        mA();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_RENAME() throws RecognitionException {
        int _type = 132;
        int _channel = 0;
        mR();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mM();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_ADD() throws RecognitionException {
        int _type = 31;
        int _channel = 0;
        mA();
        if (this.state.failed) return;
        mD();
        if (this.state.failed) return;
        mD();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_TYPE() throws RecognitionException {
        int _type = 159;
        int _channel = 0;
        mT();
        if (this.state.failed) return;
        mY();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_TYPES() throws RecognitionException {
        int _type = 160;
        int _channel = 0;
        mT();
        if (this.state.failed) return;
        mY();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_COMPACT() throws RecognitionException {
        int _type = 54;
        int _channel = 0;
        mC();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mM();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_STORAGE() throws RecognitionException {
        int _type = 144;
        int _channel = 0;
        mS();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_ORDER() throws RecognitionException {
        int _type = 123;
        int _channel = 0;
        mO();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mD();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_BY() throws RecognitionException {
        int _type = 48;
        int _channel = 0;
        mB();
        if (this.state.failed) return;
        mY();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_ASC() throws RecognitionException {
        int _type = 40;
        int _channel = 0;
        mA();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_DESC() throws RecognitionException {
        int _type = 65;
        int _channel = 0;
        mD();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_ALLOW() throws RecognitionException {
        int _type = 35;
        int _channel = 0;
        mA();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mW();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_FILTERING() throws RecognitionException {
        int _type = 74;
        int _channel = 0;
        mF();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_IF() throws RecognitionException {
        int _type = 85;
        int _channel = 0;
        mI();
        if (this.state.failed) return;
        mF();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_IS() throws RecognitionException {
        int _type = 95;
        int _channel = 0;
        mI();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_CONTAINS() throws RecognitionException {
        int _type = 55;
        int _channel = 0;
        mC();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_GROUP() throws RecognitionException {
        int _type = 83;
        int _channel = 0;
        mG();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_CLUSTER() throws RecognitionException {
        int _type = 51;
        int _channel = 0;
        mC();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_INTERNALS() throws RecognitionException {
        int _type = 93;
        int _channel = 0;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_ONLY() throws RecognitionException {
        int _type = 120;
        int _channel = 0;
        mO();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mY();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_GRANT() throws RecognitionException {
        int _type = 82;
        int _channel = 0;
        mG();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_ALL() throws RecognitionException {
        int _type = 34;
        int _channel = 0;
        mA();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_PERMISSION() throws RecognitionException {
        int _type = 127;
        int _channel = 0;
        mP();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mM();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_PERMISSIONS() throws RecognitionException {
        int _type = 128;
        int _channel = 0;
        mP();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mM();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_OF() throws RecognitionException {
        int _type = 118;
        int _channel = 0;
        mO();
        if (this.state.failed) return;
        mF();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_REVOKE() throws RecognitionException {
        int _type = 135;
        int _channel = 0;
        mR();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mV();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mK();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_MODIFY() throws RecognitionException {
        int _type = 110;
        int _channel = 0;
        mM();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mD();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mF();
        if (this.state.failed) return;
        mY();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_AUTHORIZE() throws RecognitionException {
        int _type = 42;
        int _channel = 0;
        mA();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mH();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mZ();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_DESCRIBE() throws RecognitionException {
        int _type = 66;
        int _channel = 0;
        mD();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mB();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_EXECUTE() throws RecognitionException {
        int _type = 72;
        int _channel = 0;
        mE();
        if (this.state.failed) return;
        mX();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_NORECURSIVE() throws RecognitionException {
        int _type = 114;
        int _channel = 0;
        mN();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mV();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_MBEAN() throws RecognitionException {
        int _type = 108;
        int _channel = 0;
        mM();
        if (this.state.failed) return;
        mB();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_MBEANS() throws RecognitionException {
        int _type = 109;
        int _channel = 0;
        mM();
        if (this.state.failed) return;
        mB();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_USER() throws RecognitionException {
        int _type = 165;
        int _channel = 0;
        mU();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_USERS() throws RecognitionException {
        int _type = 166;
        int _channel = 0;
        mU();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_ROLE() throws RecognitionException {
        int _type = 136;
        int _channel = 0;
        mR();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_ROLES() throws RecognitionException {
        int _type = 137;
        int _channel = 0;
        mR();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_SUPERUSER() throws RecognitionException {
        int _type = 146;
        int _channel = 0;
        mS();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_NOSUPERUSER() throws RecognitionException {
        int _type = 115;
        int _channel = 0;
        mN();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_PASSWORD() throws RecognitionException {
        int _type = 125;
        int _channel = 0;
        mP();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mW();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mD();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_HASHED() throws RecognitionException {
        int _type = 84;
        int _channel = 0;
        mH();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mH();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mD();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_LOGIN() throws RecognitionException {
        int _type = 105;
        int _channel = 0;
        mL();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_NOLOGIN() throws RecognitionException {
        int _type = 113;
        int _channel = 0;
        mN();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_OPTIONS() throws RecognitionException {
        int _type = 121;
        int _channel = 0;
        mO();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_ACCESS() throws RecognitionException {
        int _type = 30;
        int _channel = 0;
        mA();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_DATACENTERS() throws RecognitionException {
        int _type = 60;
        int _channel = 0;
        mD();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_CLUSTERING() throws RecognitionException {
        int _type = 52;
        int _channel = 0;
        mC();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_ASCII() throws RecognitionException {
        int _type = 41;
        int _channel = 0;
        mA();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_BIGINT() throws RecognitionException {
        int _type = 45;
        int _channel = 0;
        mB();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_BLOB() throws RecognitionException {
        int _type = 46;
        int _channel = 0;
        mB();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mB();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_BOOLEAN() throws RecognitionException {
        int _type = 47;
        int _channel = 0;
        mB();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_COUNTER() throws RecognitionException {
        int _type = 57;
        int _channel = 0;
        mC();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_DECIMAL() throws RecognitionException {
        int _type = 62;
        int _channel = 0;
        mD();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mM();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public Cql_Lexer() {
        this.dfa22 = new DFA22((BaseRecognizer) this);
        this.dfa13 = new DFA13((BaseRecognizer) this);
        this.dfa32 = new DFA32((BaseRecognizer) this);
        this.dfa25 = new DFA25((BaseRecognizer) this);
        this.dfa35 = new DFA35((BaseRecognizer) this);
        this.dfa50 = new DFA50((BaseRecognizer) this);
        this.dfa57 = new DFA57((BaseRecognizer) this);
    }

    public final void mK_DOUBLE() throws RecognitionException {
        int _type = 68;
        int _channel = 0;
        mD();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mB();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_DURATION() throws RecognitionException {
        int _type = 70;
        int _channel = 0;
        mD();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_FLOAT() throws RecognitionException {
        int _type = 76;
        int _channel = 0;
        mF();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_INET() throws RecognitionException {
        int _type = 88;
        int _channel = 0;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_INT() throws RecognitionException {
        int _type = 92;
        int _channel = 0;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_SMALLINT() throws RecognitionException {
        int _type = 142;
        int _channel = 0;
        mS();
        if (this.state.failed) return;
        mM();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_TINYINT() throws RecognitionException {
        int _type = 152;
        int _channel = 0;
        mT();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mY();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_TEXT() throws RecognitionException {
        int _type = 148;
        int _channel = 0;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mX();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_UUID() throws RecognitionException {
        int _type = 168;
        int _channel = 0;
        mU();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mD();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_VARCHAR() throws RecognitionException {
        int _type = 170;
        int _channel = 0;
        mV();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mH();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_VARINT() throws RecognitionException {
        int _type = 171;
        int _channel = 0;
        mV();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_TIMEUUID() throws RecognitionException {
        int _type = 151;
        int _channel = 0;
        mT();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mM();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mD();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_TOKEN() throws RecognitionException {
        int _type = 154;
        int _channel = 0;
        mT();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mK();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_WRITETIME() throws RecognitionException {
        int _type = 175;
        int _channel = 0;
        mW();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mM();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_DATE() throws RecognitionException {
        int _type = 61;
        int _channel = 0;
        mD();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_TIME() throws RecognitionException {
        int _type = 149;
        int _channel = 0;
        mT();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mM();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_NULL() throws RecognitionException {
        int _type = 117;
        int _channel = 0;
        mN();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_NOT() throws RecognitionException {
        int _type = 116;
        int _channel = 0;
        mN();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_EXISTS() throws RecognitionException {
        int _type = 73;
        int _channel = 0;
        mE();
        if (this.state.failed) return;
        mX();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_MAP() throws RecognitionException {
        int _type = 106;
        int _channel = 0;
        mM();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_LIST() throws RecognitionException {
        int _type = 104;
        int _channel = 0;
        mL();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_POSITIVE_NAN() throws RecognitionException {
        int _type = 130;
        int _channel = 0;
        mN();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_NEGATIVE_NAN() throws RecognitionException {
        int _type = 112;
        int _channel = 0;
        match(45);
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_POSITIVE_INFINITY() throws RecognitionException {
        int _type = 129;
        int _channel = 0;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mF();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mY();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_NEGATIVE_INFINITY() throws RecognitionException {
        int _type = 111;
        int _channel = 0;
        match(45);
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mF();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mY();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_TUPLE() throws RecognitionException {
        int _type = 158;
        int _channel = 0;
        mT();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_TRIGGER() throws RecognitionException {
        int _type = 155;
        int _channel = 0;
        mT();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_STATIC() throws RecognitionException {
        int _type = 143;
        int _channel = 0;
        mS();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_FROZEN() throws RecognitionException {
        int _type = 78;
        int _channel = 0;
        mF();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mZ();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_FUNCTION() throws RecognitionException {
        int _type = 80;
        int _channel = 0;
        mF();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_FUNCTIONS() throws RecognitionException {
        int _type = 81;
        int _channel = 0;
        mF();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_AGGREGATE() throws RecognitionException {
        int _type = 32;
        int _channel = 0;
        mA();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_AGGREGATES() throws RecognitionException {
        int _type = 33;
        int _channel = 0;
        mA();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_SFUNC() throws RecognitionException {
        int _type = 141;
        int _channel = 0;
        mS();
        if (this.state.failed) return;
        mF();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_STYPE() throws RecognitionException {
        int _type = 145;
        int _channel = 0;
        mS();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mY();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_FINALFUNC() throws RecognitionException {
        int _type = 75;
        int _channel = 0;
        mF();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mF();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_INITCOND() throws RecognitionException {
        int _type = 89;
        int _channel = 0;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mD();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mK_RETURNS() throws RecognitionException {
        int _type = 134;
        int _channel = 0;
        mR();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*       */
    public final void mK_CALLED() throws RecognitionException {
        int _type = 49;
        int _channel = 0;
        mC();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mD();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*       */
    public final void mK_INPUT() throws RecognitionException {
        int _type = 90;
        int _channel = 0;
        mI();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*       */
    public final void mK_LANGUAGE() throws RecognitionException {
        int _type = 101;
        int _channel = 0;
        mL();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mG();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*       */
    public final void mK_OR() throws RecognitionException {
        int _type = 122;
        int _channel = 0;
        mO();
        if (this.state.failed) return;
        mR();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*       */
    public final void mK_REPLACE() throws RecognitionException {
        int _type = 133;
        int _channel = 0;
        mR();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mP();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mC();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*       */
    public final void mK_JSON() throws RecognitionException {
        int _type = 96;
        int _channel = 0;
        mJ();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mO();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*       */
    public final void mK_DEFAULT() throws RecognitionException {
        int _type = 63;
        int _channel = 0;
        mD();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mF();
        if (this.state.failed) return;
        mA();
        if (this.state.failed) return;
        mU();
        if (this.state.failed) return;
        mL();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*       */
    public final void mK_UNSET() throws RecognitionException {
        int _type = 162;
        int _channel = 0;
        mU();
        if (this.state.failed) return;
        mN();
        if (this.state.failed) return;
        mS();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        mT();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*       */
    public final void mK_LIKE() throws RecognitionException {
        int _type = 102;
        int _channel = 0;
        mL();
        if (this.state.failed) return;
        mI();
        if (this.state.failed) return;
        mK();
        if (this.state.failed) return;
        mE();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    /*       */
    public final void mA() throws RecognitionException {
        if (this.input.LA(1) == 65 || this.input.LA(1) == 97) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    /*       */
    public final void mB() throws RecognitionException {
        if (this.input.LA(1) == 66 || this.input.LA(1) == 98) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    /*       */
    public final void mC() throws RecognitionException {
        if (this.input.LA(1) == 67 || this.input.LA(1) == 99) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    /*  8972 */   static final String[] DFA22_transitionS = new String[]{"\001\001\"￿\001\002", "\001\002", "\n\003", "\n\003\n￿\001\006\b￿\001\005\013￿\001\004", "", "", ""};

    /*       */
    public final void mD() throws RecognitionException {
        if (this.input.LA(1) == 68 || this.input.LA(1) == 100) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    /*       */
    public final void mE() throws RecognitionException {
        if (this.input.LA(1) == 69 || this.input.LA(1) == 101) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    /*       */
    public final void mF() throws RecognitionException {
        if (this.input.LA(1) == 70 || this.input.LA(1) == 102) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    /*       */
    public final void mG() throws RecognitionException {
        if (this.input.LA(1) == 71 || this.input.LA(1) == 103) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    /*       */
    public final void mH() throws RecognitionException {
        if (this.input.LA(1) == 72 || this.input.LA(1) == 104) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    /*       */
    public final void mI() throws RecognitionException {
        if (this.input.LA(1) == 73 || this.input.LA(1) == 105) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    /*       */
    public final void mJ() throws RecognitionException {
        if (this.input.LA(1) == 74 || this.input.LA(1) == 106) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    /*       */
    public final void mK() throws RecognitionException {
        if (this.input.LA(1) == 75 || this.input.LA(1) == 107) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    /*       */
    public final void mL() throws RecognitionException {
        if (this.input.LA(1) == 76 || this.input.LA(1) == 108) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    /*  8982 */
    public final void mM() throws RecognitionException {
        if (this.input.LA(1) == 77 || this.input.LA(1) == 109) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mN() throws RecognitionException {
        if (this.input.LA(1) == 78 || this.input.LA(1) == 110) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mO() throws RecognitionException {
        if (this.input.LA(1) == 79 || this.input.LA(1) == 111) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mP() throws RecognitionException {
        if (this.input.LA(1) == 80 || this.input.LA(1) == 112) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mQ() throws RecognitionException {
        if (this.input.LA(1) == 81 || this.input.LA(1) == 113) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mR() throws RecognitionException {
        if (this.input.LA(1) == 82 || this.input.LA(1) == 114) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mS() throws RecognitionException {
        if (this.input.LA(1) == 83 || this.input.LA(1) == 115) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mT() throws RecognitionException {
        if (this.input.LA(1) == 84 || this.input.LA(1) == 116) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mU() throws RecognitionException {
        if (this.input.LA(1) == 85 || this.input.LA(1) == 117) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mV() throws RecognitionException {
        if (this.input.LA(1) == 86 || this.input.LA(1) == 118) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mW() throws RecognitionException {
        if (this.input.LA(1) == 87 || this.input.LA(1) == 119) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mX() throws RecognitionException {
        if (this.input.LA(1) == 88 || this.input.LA(1) == 120) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mY() throws RecognitionException {
        if (this.input.LA(1) == 89 || this.input.LA(1) == 121) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mZ() throws RecognitionException {
        if (this.input.LA(1) == 90 || this.input.LA(1) == 122) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mSTRING_LITERAL() throws RecognitionException {
        int _type = 189;
        int _channel = 0;
        StringBuilder txt = new StringBuilder();
        int alt6 = 2;
        int LA6_0 = this.input.LA(1);
        if (LA6_0 == 36) {
            alt6 = 1;
        } else if (LA6_0 == 39) {
            alt6 = 2;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            NoViableAltException nvae = new NoViableAltException("", 6, 0, (IntStream) this.input);
            throw nvae;
        }
        switch (alt6) {
            case 1:
                match(36);
                if (this.state.failed) return;
                match(36);
                if (this.state.failed) return;
                while (true) {
                    int c, alt4 = 2;
                    int LA4_0 = this.input.LA(1);
                    if (LA4_0 == 36) {
                        int LA4_1 = this.input.LA(2);
                        if (LA4_1 == 36) {
                            int LA4_3 = this.input.LA(3);
                            if (LA4_3 >= 0 && LA4_3 <= 65535 && this.input.size() - this.input.index() > 1 && !"$$".equals(this.input.substring(this.input.index(), this.input.index() + 1)))
                                alt4 = 1;
                        } else if (((LA4_1 >= 0 && LA4_1 <= 35) || (LA4_1 >= 37 && LA4_1 <= 65535)) && this.input.size() - this.input.index() > 1 && !"$$".equals(this.input.substring(this.input.index(), this.input.index() + 1))) {
                            alt4 = 1;
                        }
                    } else if (((LA4_0 >= 0 && LA4_0 <= 35) || (LA4_0 >= 37 && LA4_0 <= 65535)) && this.input.size() - this.input.index() > 1 && !"$$".equals(this.input.substring(this.input.index(), this.input.index() + 1))) {
                        alt4 = 1;
                    }
                    switch (alt4) {
                        case 1:
                            if (this.input.size() - this.input.index() <= 1 || "$$".equals(this.input.substring(this.input.index(), this.input.index() + 1))) {
                                if (this.state.backtracking > 0) {
                                    this.state.failed = true;
                                    return;
                                }
                                throw new FailedPredicateException(this.input, "STRING_LITERAL", "  (input.size() - input.index() > 1)\n               && !\"$$\".equals(input.substring(input.index(), input.index() + 1)) ");
                            }
                            c = this.input.LA(1);
                            matchAny();
                            if (this.state.failed) return;
                            if (this.state.backtracking == 0) txt.appendCodePoint(c);
                            continue;
                    }
                    break;
                }
                match(36);
                if (this.state.failed) return;
                match(36);
                if (this.state.failed) return;
                break;
            case 2:
                match(39);
                if (this.state.failed) return;
                while (true) {
                    int c, alt5 = 3;
                    int LA5_0 = this.input.LA(1);
                    if (LA5_0 == 39) {
                        int LA5_1 = this.input.LA(2);
                        if (LA5_1 == 39) alt5 = 2;
                    } else if ((LA5_0 >= 0 && LA5_0 <= 38) || (LA5_0 >= 40 && LA5_0 <= 65535)) {
                        alt5 = 1;
                    }
                    switch (alt5) {
                        case 1:
                            c = this.input.LA(1);
                            if ((this.input.LA(1) >= 0 && this.input.LA(1) <= 38) || (this.input.LA(1) >= 40 && this.input.LA(1) <= 65535)) {
                                this.input.consume();
                                this.state.failed = false;
                            } else {
                                if (this.state.backtracking > 0) {
                                    this.state.failed = true;
                                    return;
                                }
                                MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
                                recover((RecognitionException) mse);
                                throw mse;
                            }
                            if (this.state.backtracking == 0) txt.appendCodePoint(c);
                            continue;
                        case 2:
                            match(39);
                            if (this.state.failed) return;
                            match(39);
                            if (this.state.failed) return;
                            if (this.state.backtracking == 0) txt.appendCodePoint(39);
                            continue;
                    }
                    break;
                }
                match(39);
                if (this.state.failed) return;
                break;
        }
        this.state.type = _type;
        this.state.channel = _channel;
        if (this.state.backtracking == 0) setText(txt.toString());
    }

    public final void mQUOTED_NAME() throws RecognitionException {
        int _type = 185;
        int _channel = 0;
        StringBuilder b = new StringBuilder();
        match(34);
        if (this.state.failed) return;
        int cnt7 = 0;
        while (true) {
            int c;
            EarlyExitException eee;
            int alt7 = 3;
            int LA7_0 = this.input.LA(1);
            if (LA7_0 == 34) {
                int LA7_1 = this.input.LA(2);
                if (LA7_1 == 34) alt7 = 2;
            } else if ((LA7_0 >= 0 && LA7_0 <= 33) || (LA7_0 >= 35 && LA7_0 <= 65535)) {
                alt7 = 1;
            }
            switch (alt7) {
                case 1:
                    c = this.input.LA(1);
                    if ((this.input.LA(1) >= 0 && this.input.LA(1) <= 33) || (this.input.LA(1) >= 35 && this.input.LA(1) <= 65535)) {
                        this.input.consume();
                        this.state.failed = false;
                    } else {
                        if (this.state.backtracking > 0) {
                            this.state.failed = true;
                            return;
                        }
                        MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
                        recover((RecognitionException) mse);
                        throw mse;
                    }
                    if (this.state.backtracking == 0) b.appendCodePoint(c);
                    break;
                case 2:
                    match(34);
                    if (this.state.failed) return;
                    match(34);
                    if (this.state.failed) return;
                    if (this.state.backtracking == 0) b.appendCodePoint(34);
                    break;
                default:
                    if (cnt7 >= 1) break;
                    if (this.state.backtracking > 0) {
                        this.state.failed = true;
                        return;
                    }
                    eee = new EarlyExitException(7, (IntStream) this.input);
                    throw eee;
            }
            cnt7++;
        }
        //match(34);
        //if (this.state.failed) return;
        //this.state.type = _type;
        //this.state.channel = _channel;
        //if (this.state.backtracking == 0) setText(b.toString());
    }

    static final short[] DFA22_eot = DFA.unpackEncodedString("\007￿");

    /*  8983 */
    public final void mEMPTY_QUOTED_NAME() throws RecognitionException {
        int _type = 17;
        int _channel = 0;
        match(34);
        if (this.state.failed) return;
        match(34);
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mDIGIT() throws RecognitionException {
        if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mLETTER() throws RecognitionException {
        if ((this.input.LA(1) >= 65 && this.input.LA(1) <= 90) || (this.input.LA(1) >= 97 && this.input.LA(1) <= 122)) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mHEX() throws RecognitionException {
        if ((this.input.LA(1) >= 48 && this.input.LA(1) <= 57) || (this.input.LA(1) >= 65 && this.input.LA(1) <= 70) || (this.input.LA(1) >= 97 && this.input.LA(1) <= 102)) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
    }

    public final void mEXPONENT() throws RecognitionException {
        MismatchedSetException mse;
        mE();
        if (this.state.failed) return;
        int alt8 = 2;
        int LA8_0 = this.input.LA(1);
        if (LA8_0 == 43 || LA8_0 == 45) alt8 = 1;
        switch (alt8) {
            case 1:
                if (this.input.LA(1) == 43 || this.input.LA(1) == 45) {
                    this.input.consume();
                    this.state.failed = false;
                    break;
                }
                if (this.state.backtracking > 0) {
                    this.state.failed = true;
                    return;
                }
                mse = new MismatchedSetException(null, (IntStream) this.input);
                recover((RecognitionException) mse);
                throw mse;
        }
        int cnt9 = 0;
        while (true) {
            MismatchedSetException mismatchedSetException;
            EarlyExitException eee;
            int alt9 = 2;
            int LA9_0 = this.input.LA(1);
            if (LA9_0 >= 48 && LA9_0 <= 57) alt9 = 1;
            switch (alt9) {
                case 1:
                    if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                        this.input.consume();
                        this.state.failed = false;
                        break;
                    }
                    if (this.state.backtracking > 0) {
                        this.state.failed = true;
                        return;
                    }
                    mismatchedSetException = new MismatchedSetException(null, (IntStream) this.input);
                    recover((RecognitionException) mismatchedSetException);
                    throw mismatchedSetException;
                default:
                    if (cnt9 >= 1) break;
                    if (this.state.backtracking > 0) {
                        this.state.failed = true;
                        return;
                    }
                    eee = new EarlyExitException(9, (IntStream) this.input);
                    throw eee;
            }
            cnt9++;
        }
    }

    public final void mDURATION_ISO_8601_PERIOD_DESIGNATORS() throws RecognitionException {
        int alt10, alt16, alt20, LA10_0, LA16_0, LA20_0, cnt11, cnt17, cnt21, alt13, alt19, cnt12, alt15, LA19_0, LA15_0, cnt18, cnt14, alt22 = 3;
        alt22 = this.dfa22.predict((IntStream) this.input);
        switch (alt22) {
            case 1:
                alt10 = 2;
                LA10_0 = this.input.LA(1);
                if (LA10_0 == 45) alt10 = 1;
                switch (alt10) {
                    case 1:
                        match(45);
                        if (this.state.failed) return;
                        break;
                }
                match(80);
                if (this.state.failed) return;
                cnt11 = 0;
                while (true) {
                    MismatchedSetException mse;
                    EarlyExitException eee;
                    int alt11 = 2;
                    int LA11_0 = this.input.LA(1);
                    if (LA11_0 >= 48 && LA11_0 <= 57) alt11 = 1;
                    switch (alt11) {
                        case 1:
                            if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                                this.input.consume();
                                this.state.failed = false;
                                break;
                            }
                            if (this.state.backtracking > 0) {
                                this.state.failed = true;
                                return;
                            }
                            mse = new MismatchedSetException(null, (IntStream) this.input);
                            recover((RecognitionException) mse);
                            throw mse;
                        default:
                            if (cnt11 >= 1) break;
                            if (this.state.backtracking > 0) {
                                this.state.failed = true;
                                return;
                            }
                            eee = new EarlyExitException(11, (IntStream) this.input);
                            throw eee;
                    }
                    cnt11++;
                    break;
                }
                match(89);
                if (this.state.failed) return;
                alt13 = 2;
                alt13 = this.dfa13.predict((IntStream) this.input);
                switch (alt13) {
                    case 1:
                        cnt12 = 0;
                        while (true) {
                            MismatchedSetException mse;
                            EarlyExitException eee;
                            int alt12 = 2;
                            int LA12_0 = this.input.LA(1);
                            if (LA12_0 >= 48 && LA12_0 <= 57) alt12 = 1;
                            switch (alt12) {
                                case 1:
                                    if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                                        this.input.consume();
                                        this.state.failed = false;
                                        break;
                                    }
                                    if (this.state.backtracking > 0) {
                                        this.state.failed = true;
                                        return;
                                    }
                                    mse = new MismatchedSetException(null, (IntStream) this.input);
                                    recover((RecognitionException) mse);
                                    throw mse;
                                default:
                                    if (cnt12 >= 1) break;
                                    if (this.state.backtracking > 0) {
                                        this.state.failed = true;
                                        return;
                                    }
                                    eee = new EarlyExitException(12, (IntStream) this.input);
                                    throw eee;
                            }
                            cnt12++;
                            break;
                        }
                        match(77);
                        if (this.state.failed) return;
                        break;
                }
                alt15 = 2;
                LA15_0 = this.input.LA(1);
                if (LA15_0 >= 48 && LA15_0 <= 57) alt15 = 1;
                switch (alt15) {
                    case 1:
                        cnt14 = 0;
                        while (true) {
                            MismatchedSetException mse;
                            EarlyExitException eee;
                            int alt14 = 2;
                            int LA14_0 = this.input.LA(1);
                            if (LA14_0 >= 48 && LA14_0 <= 57) alt14 = 1;
                            switch (alt14) {
                                case 1:
                                    if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                                        this.input.consume();
                                        this.state.failed = false;
                                        break;
                                    }
                                    if (this.state.backtracking > 0) {
                                        this.state.failed = true;
                                        return;
                                    }
                                    mse = new MismatchedSetException(null, (IntStream) this.input);
                                    recover((RecognitionException) mse);
                                    throw mse;
                                default:
                                    if (cnt14 >= 1) break;
                                    if (this.state.backtracking > 0) {
                                        this.state.failed = true;
                                        return;
                                    }
                                    eee = new EarlyExitException(14, (IntStream) this.input);
                                    throw eee;
                            }
                            cnt14++;
                            break;
                        }
                        match(68);
                        if (this.state.failed) return;
                        break;
                }
                break;
            case 2:
                alt16 = 2;
                LA16_0 = this.input.LA(1);
                if (LA16_0 == 45) alt16 = 1;
                switch (alt16) {
                    case 1:
                        match(45);
                        if (this.state.failed) return;
                        break;
                }
                match(80);
                if (this.state.failed) return;
                cnt17 = 0;
                while (true) {
                    MismatchedSetException mse;
                    EarlyExitException eee;
                    int alt17 = 2;
                    int LA17_0 = this.input.LA(1);
                    if (LA17_0 >= 48 && LA17_0 <= 57) alt17 = 1;
                    switch (alt17) {
                        case 1:
                            if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                                this.input.consume();
                                this.state.failed = false;
                                break;
                            }
                            if (this.state.backtracking > 0) {
                                this.state.failed = true;
                                return;
                            }
                            mse = new MismatchedSetException(null, (IntStream) this.input);
                            recover((RecognitionException) mse);
                            throw mse;
                        default:
                            if (cnt17 >= 1) break;
                            if (this.state.backtracking > 0) {
                                this.state.failed = true;
                                return;
                            }
                            eee = new EarlyExitException(17, (IntStream) this.input);
                            throw eee;
                    }
                    cnt17++;
                    break;
                }
                match(77);
                if (this.state.failed) return;
                alt19 = 2;
                LA19_0 = this.input.LA(1);
                if (LA19_0 >= 48 && LA19_0 <= 57) alt19 = 1;
                switch (alt19) {
                    case 1:
                        cnt18 = 0;
                        while (true) {
                            MismatchedSetException mse;
                            EarlyExitException eee;
                            int alt18 = 2;
                            int LA18_0 = this.input.LA(1);
                            if (LA18_0 >= 48 && LA18_0 <= 57) alt18 = 1;
                            switch (alt18) {
                                case 1:
                                    if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                                        this.input.consume();
                                        this.state.failed = false;
                                        break;
                                    }
                                    if (this.state.backtracking > 0) {
                                        this.state.failed = true;
                                        return;
                                    }
                                    mse = new MismatchedSetException(null, (IntStream) this.input);
                                    recover((RecognitionException) mse);
                                    throw mse;
                                default:
                                    if (cnt18 >= 1) break;
                                    if (this.state.backtracking > 0) {
                                        this.state.failed = true;
                                        return;
                                    }
                                    eee = new EarlyExitException(18, (IntStream) this.input);
                                    throw eee;
                            }
                            cnt18++;
                            break;
                        }
                        match(68);
                        if (this.state.failed) return;
                        break;
                }
                break;
            case 3:
                alt20 = 2;
                LA20_0 = this.input.LA(1);
                if (LA20_0 == 45) alt20 = 1;
                switch (alt20) {
                    case 1:
                        match(45);
                        if (this.state.failed) return;
                        break;
                }
                match(80);
                if (this.state.failed) return;
                cnt21 = 0;
                while (true) {
                    MismatchedSetException mse;
                    EarlyExitException eee;
                    int alt21 = 2;
                    int LA21_0 = this.input.LA(1);
                    if (LA21_0 >= 48 && LA21_0 <= 57) alt21 = 1;
                    switch (alt21) {
                        case 1:
                            if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                                this.input.consume();
                                this.state.failed = false;
                                break;
                            }
                            if (this.state.backtracking > 0) {
                                this.state.failed = true;
                                return;
                            }
                            mse = new MismatchedSetException(null, (IntStream) this.input);
                            recover((RecognitionException) mse);
                            throw mse;
                        default:
                            if (cnt21 >= 1) break;
                            if (this.state.backtracking > 0) {
                                this.state.failed = true;
                                return;
                            }
                            eee = new EarlyExitException(21, (IntStream) this.input);
                            throw eee;
                    }
                    cnt21++;
                    break;
                }
                match(68);
                if (this.state.failed) return;
                break;
        }
    }

    public final void mDURATION_ISO_8601_TIME_DESIGNATORS() throws RecognitionException {
        int cnt23, cnt28, cnt31, alt25, alt30, cnt24, alt27, LA30_0, LA27_0, cnt29, cnt26, alt32 = 3;
        alt32 = this.dfa32.predict((IntStream) this.input);
        switch (alt32) {
            case 1:
                match(84);
                if (this.state.failed) return;
                cnt23 = 0;
                while (true) {
                    MismatchedSetException mse;
                    EarlyExitException eee;
                    int alt23 = 2;
                    int LA23_0 = this.input.LA(1);
                    if (LA23_0 >= 48 && LA23_0 <= 57) alt23 = 1;
                    switch (alt23) {
                        case 1:
                            if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                                this.input.consume();
                                this.state.failed = false;
                                break;
                            }
                            if (this.state.backtracking > 0) {
                                this.state.failed = true;
                                return;
                            }
                            mse = new MismatchedSetException(null, (IntStream) this.input);
                            recover((RecognitionException) mse);
                            throw mse;
                        default:
                            if (cnt23 >= 1) break;
                            if (this.state.backtracking > 0) {
                                this.state.failed = true;
                                return;
                            }
                            eee = new EarlyExitException(23, (IntStream) this.input);
                            throw eee;
                    }
                    cnt23++;
                    break;
                }
                match(72);
                if (this.state.failed) return;
                alt25 = 2;
                alt25 = this.dfa25.predict((IntStream) this.input);
                switch (alt25) {
                    case 1:
                        cnt24 = 0;
                        while (true) {
                            MismatchedSetException mse;
                            EarlyExitException eee;
                            int alt24 = 2;
                            int LA24_0 = this.input.LA(1);
                            if (LA24_0 >= 48 && LA24_0 <= 57) alt24 = 1;
                            switch (alt24) {
                                case 1:
                                    if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                                        this.input.consume();
                                        this.state.failed = false;
                                        break;
                                    }
                                    if (this.state.backtracking > 0) {
                                        this.state.failed = true;
                                        return;
                                    }
                                    mse = new MismatchedSetException(null, (IntStream) this.input);
                                    recover((RecognitionException) mse);
                                    throw mse;
                                default:
                                    if (cnt24 >= 1) break;
                                    if (this.state.backtracking > 0) {
                                        this.state.failed = true;
                                        return;
                                    }
                                    eee = new EarlyExitException(24, (IntStream) this.input);
                                    throw eee;
                            }
                            cnt24++;
                            break;
                        }
                        match(77);
                        if (this.state.failed) return;
                        break;
                }
                alt27 = 2;
                LA27_0 = this.input.LA(1);
                if (LA27_0 >= 48 && LA27_0 <= 57) alt27 = 1;
                switch (alt27) {
                    case 1:
                        cnt26 = 0;
                        while (true) {
                            MismatchedSetException mse;
                            EarlyExitException eee;
                            int alt26 = 2;
                            int LA26_0 = this.input.LA(1);
                            if (LA26_0 >= 48 && LA26_0 <= 57) alt26 = 1;
                            switch (alt26) {
                                case 1:
                                    if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                                        this.input.consume();
                                        this.state.failed = false;
                                        break;
                                    }
                                    if (this.state.backtracking > 0) {
                                        this.state.failed = true;
                                        return;
                                    }
                                    mse = new MismatchedSetException(null, (IntStream) this.input);
                                    recover((RecognitionException) mse);
                                    throw mse;
                                default:
                                    if (cnt26 >= 1) break;
                                    if (this.state.backtracking > 0) {
                                        this.state.failed = true;
                                        return;
                                    }
                                    eee = new EarlyExitException(26, (IntStream) this.input);
                                    throw eee;
                            }
                            cnt26++;
                            break;
                        }
                        match(83);
                        if (this.state.failed) return;
                        break;
                }
                break;
            case 2:
                match(84);
                if (this.state.failed) return;
                cnt28 = 0;
                while (true) {
                    MismatchedSetException mse;
                    EarlyExitException eee;
                    int alt28 = 2;
                    int LA28_0 = this.input.LA(1);
                    if (LA28_0 >= 48 && LA28_0 <= 57) alt28 = 1;
                    switch (alt28) {
                        case 1:
                            if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                                this.input.consume();
                                this.state.failed = false;
                                break;
                            }
                            if (this.state.backtracking > 0) {
                                this.state.failed = true;
                                return;
                            }
                            mse = new MismatchedSetException(null, (IntStream) this.input);
                            recover((RecognitionException) mse);
                            throw mse;
                        default:
                            if (cnt28 >= 1) break;
                            if (this.state.backtracking > 0) {
                                this.state.failed = true;
                                return;
                            }
                            eee = new EarlyExitException(28, (IntStream) this.input);
                            throw eee;
                    }
                    cnt28++;
                    break;
                }
                match(77);
                if (this.state.failed) return;
                alt30 = 2;
                LA30_0 = this.input.LA(1);
                if (LA30_0 >= 48 && LA30_0 <= 57) alt30 = 1;
                switch (alt30) {
                    case 1:
                        cnt29 = 0;
                        while (true) {
                            MismatchedSetException mse;
                            EarlyExitException eee;
                            int alt29 = 2;
                            int LA29_0 = this.input.LA(1);
                            if (LA29_0 >= 48 && LA29_0 <= 57) alt29 = 1;
                            switch (alt29) {
                                case 1:
                                    if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                                        this.input.consume();
                                        this.state.failed = false;
                                        break;
                                    }
                                    if (this.state.backtracking > 0) {
                                        this.state.failed = true;
                                        return;
                                    }
                                    mse = new MismatchedSetException(null, (IntStream) this.input);
                                    recover((RecognitionException) mse);
                                    throw mse;
                                default:
                                    if (cnt29 >= 1) break;
                                    if (this.state.backtracking > 0) {
                                        this.state.failed = true;
                                        return;
                                    }
                                    eee = new EarlyExitException(29, (IntStream) this.input);
                                    throw eee;
                            }
                            cnt29++;
                            break;
                        }
                        match(83);
                        if (this.state.failed) return;
                        break;
                }
                break;
            case 3:
                match(84);
                if (this.state.failed) return;
                cnt31 = 0;
                while (true) {
                    MismatchedSetException mse;
                    EarlyExitException eee;
                    int alt31 = 2;
                    int LA31_0 = this.input.LA(1);
                    if (LA31_0 >= 48 && LA31_0 <= 57) alt31 = 1;
                    switch (alt31) {
                        case 1:
                            if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                                this.input.consume();
                                this.state.failed = false;
                                break;
                            }
                            if (this.state.backtracking > 0) {
                                this.state.failed = true;
                                return;
                            }
                            mse = new MismatchedSetException(null, (IntStream) this.input);
                            recover((RecognitionException) mse);
                            throw mse;
                        default:
                            if (cnt31 >= 1) break;
                            if (this.state.backtracking > 0) {
                                this.state.failed = true;
                                return;
                            }
                            eee = new EarlyExitException(31, (IntStream) this.input);
                            throw eee;
                    }
                    cnt31++;
                    break;
                }
                match(83);
                if (this.state.failed) return;
                break;
        }
    }

    public final void mDURATION_ISO_8601_WEEK_PERIOD_DESIGNATOR() throws RecognitionException {
        int alt33 = 2;
        int LA33_0 = this.input.LA(1);
        if (LA33_0 == 45) alt33 = 1;
        switch (alt33) {
            case 1:
                match(45);
                if (this.state.failed) return;
                break;
        }
        match(80);
        if (this.state.failed) return;
        int cnt34 = 0;
        while (true) {
            MismatchedSetException mse;
            EarlyExitException eee;
            int alt34 = 2;
            int LA34_0 = this.input.LA(1);
            if (LA34_0 >= 48 && LA34_0 <= 57) alt34 = 1;
            switch (alt34) {
                case 1:
                    if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                        this.input.consume();
                        this.state.failed = false;
                        break;
                    }
                    if (this.state.backtracking > 0) {
                        this.state.failed = true;
                        return;
                    }
                    mse = new MismatchedSetException(null, (IntStream) this.input);
                    recover((RecognitionException) mse);
                    throw mse;
                default:
                    if (cnt34 >= 1) break;
                    if (this.state.backtracking > 0) {
                        this.state.failed = true;
                        return;
                    }
                    eee = new EarlyExitException(34, (IntStream) this.input);
                    throw eee;
            }
            cnt34++;
            break;
        }
        match(87);
        if (this.state.failed) return;
    }

    public final void mDURATION_UNIT() throws RecognitionException {
        int alt35 = 11;
        alt35 = this.dfa35.predict((IntStream) this.input);
        switch (alt35) {
            case 1:
                mY();
                if (this.state.failed) return;
                break;
            case 2:
                mM();
                if (this.state.failed) return;
                mO();
                if (this.state.failed) return;
                break;
            case 3:
                mW();
                if (this.state.failed) return;
                break;
            case 4:
                mD();
                if (this.state.failed) return;
                break;
            case 5:
                mH();
                if (this.state.failed) return;
                break;
            case 6:
                mM();
                if (this.state.failed) return;
                break;
            case 7:
                mS();
                if (this.state.failed) return;
                break;
            case 8:
                mM();
                if (this.state.failed) return;
                mS();
                if (this.state.failed) return;
                break;
            case 9:
                mU();
                if (this.state.failed) return;
                mS();
                if (this.state.failed) return;
                break;
            case 10:
                match(181);
                if (this.state.failed) return;
                mS();
                if (this.state.failed) return;
                break;
            case 11:
                mN();
                if (this.state.failed) return;
                mS();
                if (this.state.failed) return;
                break;
        }
    }

    public final void mINTEGER() throws RecognitionException {
        int _type = 27;
        int _channel = 0;
        int alt36 = 2;
        int LA36_0 = this.input.LA(1);
        if (LA36_0 == 45) alt36 = 1;
        switch (alt36) {
            case 1:
                match(45);
                if (this.state.failed) return;
                break;
        }
        int cnt37 = 0;
        while (true) {
            MismatchedSetException mse;
            EarlyExitException eee;
            int alt37 = 2;
            int LA37_0 = this.input.LA(1);
            if (LA37_0 >= 48 && LA37_0 <= 57) alt37 = 1;
            switch (alt37) {
                case 1:
                    if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                        this.input.consume();
                        this.state.failed = false;
                        break;
                    }
                    if (this.state.backtracking > 0) {
                        this.state.failed = true;
                        return;
                    }
                    mse = new MismatchedSetException(null, (IntStream) this.input);
                    recover((RecognitionException) mse);
                    throw mse;
                default:
                    if (cnt37 >= 1) break;
                    if (this.state.backtracking > 0) {
                        this.state.failed = true;
                        return;
                    }
                    eee = new EarlyExitException(37, (IntStream) this.input);
                    throw eee;
            }
            cnt37++;
            break;
        }
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mQMARK() throws RecognitionException {
        int _type = 184;
        int _channel = 0;
        match(63);
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mRANGE() throws RecognitionException {
        int _type = 187;
        int _channel = 0;
        match("..");
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mFLOAT() throws RecognitionException {
        int alt39, LA39_0, alt40, LA40_0, _type = 20;
        int _channel = 0;
        int alt41 = 3;
        int LA41_0 = this.input.LA(1);
        if (LA41_0 == 45) {
            int LA41_1 = this.input.LA(2);
            if (LA41_1 >= 48 && LA41_1 <= 57) {
                int LA41_3 = this.input.LA(3);
                if (LA41_3 == 46 && synpred1_Lexer()) {
                    alt41 = 1;
                } else if (LA41_3 >= 48 && LA41_3 <= 57 && synpred1_Lexer()) {
                    alt41 = 1;
                } else if (synpred2_Lexer()) {
                    alt41 = 2;
                } else {
                    alt41 = 3;
                }
            } else {
                if (this.state.backtracking > 0) {
                    this.state.failed = true;
                    return;
                }
                int nvaeMark = this.input.mark();
                try {
                    this.input.consume();
                    NoViableAltException nvae = new NoViableAltException("", 41, 1, (IntStream) this.input);
                    throw nvae;
                } finally {
                    this.input.rewind(nvaeMark);
                }
            }
        } else if (LA41_0 >= 48 && LA41_0 <= 57) {
            int LA41_2 = this.input.LA(2);
            if (LA41_2 == 46 && synpred1_Lexer()) {
                alt41 = 1;
            } else if (LA41_2 >= 48 && LA41_2 <= 57 && synpred1_Lexer()) {
                alt41 = 1;
            } else if (synpred2_Lexer()) {
                alt41 = 2;
            } else {
                alt41 = 3;
            }
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            NoViableAltException nvae = new NoViableAltException("", 41, 0, (IntStream) this.input);
            throw nvae;
        }
        switch (alt41) {
            case 1:
                mINTEGER();
                if (this.state.failed) return;
                match(46);
                if (this.state.failed) return;
                break;
            case 2:
                mINTEGER();
                if (this.state.failed) return;
                if (this.state.backtracking == 0) _type = 27;
                break;
            case 3:
                mINTEGER();
                if (this.state.failed) return;
                alt39 = 2;
                LA39_0 = this.input.LA(1);
                if (LA39_0 == 46) alt39 = 1;
                switch (alt39) {
                    case 1:
                        match(46);
                        if (this.state.failed) return;
                        while (true) {
                            MismatchedSetException mse;
                            int alt38 = 2;
                            int LA38_0 = this.input.LA(1);
                            if (LA38_0 >= 48 && LA38_0 <= 57) alt38 = 1;
                            switch (alt38) {
                                case 1:
                                    if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                                        this.input.consume();
                                        this.state.failed = false;
                                        continue;
                                    }
                                    if (this.state.backtracking > 0) {
                                        this.state.failed = true;
                                        return;
                                    }
                                    mse = new MismatchedSetException(null, (IntStream) this.input);
                                    recover((RecognitionException) mse);
                                    throw mse;
                            }
                            break;
                        }
                        break;
                }
                alt40 = 2;
                LA40_0 = this.input.LA(1);
                if (LA40_0 == 69 || LA40_0 == 101) alt40 = 1;
                switch (alt40) {
                    case 1:
                        mEXPONENT();
                        if (this.state.failed) return;
                        break;
                }
                break;
        }
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mBOOLEAN() throws RecognitionException {
        int _type = 6;
        int _channel = 0;
        int alt42 = 2;
        int LA42_0 = this.input.LA(1);
        if (LA42_0 == 84 || LA42_0 == 116) {
            alt42 = 1;
        } else if (LA42_0 == 70 || LA42_0 == 102) {
            alt42 = 2;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            NoViableAltException nvae = new NoViableAltException("", 42, 0, (IntStream) this.input);
            throw nvae;
        }
        switch (alt42) {
            case 1:
                mT();
                if (this.state.failed) return;
                mR();
                if (this.state.failed) return;
                mU();
                if (this.state.failed) return;
                mE();
                if (this.state.failed) return;
                break;
            case 2:
                mF();
                if (this.state.failed) return;
                mA();
                if (this.state.failed) return;
                mL();
                if (this.state.failed) return;
                mS();
                if (this.state.failed) return;
                mE();
                if (this.state.failed) return;
                break;
        }
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mDURATION() throws RecognitionException {
        int alt43, alt47, alt48, alt49, LA43_0, LA47_0, LA48_0, LA49_0, cnt44, _type = 11;
        int _channel = 0;
        int alt50 = 5;
        alt50 = this.dfa50.predict((IntStream) this.input);
        switch (alt50) {
            case 1:
                alt43 = 2;
                LA43_0 = this.input.LA(1);
                if (LA43_0 == 45) alt43 = 1;
                switch (alt43) {
                    case 1:
                        match(45);
                        if (this.state.failed) return;
                        break;
                }
                cnt44 = 0;
                while (true) {
                    MismatchedSetException mse;
                    EarlyExitException eee;
                    int alt44 = 2;
                    int LA44_0 = this.input.LA(1);
                    if (LA44_0 >= 48 && LA44_0 <= 57) alt44 = 1;
                    switch (alt44) {
                        case 1:
                            if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                                this.input.consume();
                                this.state.failed = false;
                                break;
                            }
                            if (this.state.backtracking > 0) {
                                this.state.failed = true;
                                return;
                            }
                            mse = new MismatchedSetException(null, (IntStream) this.input);
                            recover((RecognitionException) mse);
                            throw mse;
                        default:
                            if (cnt44 >= 1) break;
                            if (this.state.backtracking > 0) {
                                this.state.failed = true;
                                return;
                            }
                            eee = new EarlyExitException(44, (IntStream) this.input);
                            throw eee;
                    }
                    cnt44++;
                    break;
                }
                mDURATION_UNIT();
                if (this.state.failed) return;
                while (true) {
                    int cnt45, alt46 = 2;
                    int LA46_0 = this.input.LA(1);
                    if (LA46_0 >= 48 && LA46_0 <= 57) alt46 = 1;
                    switch (alt46) {
                        case 1:
                            cnt45 = 0;
                            while (true) {
                                MismatchedSetException mse;
                                EarlyExitException eee;
                                int alt45 = 2;
                                int LA45_0 = this.input.LA(1);
                                if (LA45_0 >= 48 && LA45_0 <= 57) alt45 = 1;
                                switch (alt45) {
                                    case 1:
                                        if (this.input.LA(1) >= 48 && this.input.LA(1) <= 57) {
                                            this.input.consume();
                                            this.state.failed = false;
                                            break;
                                        }
                                        if (this.state.backtracking > 0) {
                                            this.state.failed = true;
                                            return;
                                        }
                                        mse = new MismatchedSetException(null, (IntStream) this.input);
                                        recover((RecognitionException) mse);
                                        throw mse;
                                    default:
                                        if (cnt45 >= 1) break;
                                        if (this.state.backtracking > 0) {
                                            this.state.failed = true;
                                            return;
                                        }
                                        eee = new EarlyExitException(45, (IntStream) this.input);
                                        throw eee;
                                }
                                cnt45++;
                                break;
                            }
                            mDURATION_UNIT();
                            if (this.state.failed) return;
                            continue;
                    }
                    break;
                }
                break;
            case 2:
                alt47 = 2;
                LA47_0 = this.input.LA(1);
                if (LA47_0 == 45) alt47 = 1;
                switch (alt47) {
                    case 1:
                        match(45);
                        if (this.state.failed) return;
                        break;
                }
                match(80);
                if (this.state.failed) return;
                mDIGIT();
                if (this.state.failed) return;
                mDIGIT();
                if (this.state.failed) return;
                mDIGIT();
                if (this.state.failed) return;
                mDIGIT();
                if (this.state.failed) return;
                match(45);
                if (this.state.failed) return;
                mDIGIT();
                if (this.state.failed) return;
                mDIGIT();
                if (this.state.failed) return;
                match(45);
                if (this.state.failed) return;
                mDIGIT();
                if (this.state.failed) return;
                mDIGIT();
                if (this.state.failed) return;
                match(84);
                if (this.state.failed) return;
                mDIGIT();
                if (this.state.failed) return;
                mDIGIT();
                if (this.state.failed) return;
                match(58);
                if (this.state.failed) return;
                mDIGIT();
                if (this.state.failed) return;
                mDIGIT();
                if (this.state.failed) return;
                match(58);
                if (this.state.failed) return;
                mDIGIT();
                if (this.state.failed) return;
                mDIGIT();
                if (this.state.failed) return;
                break;
            case 3:
                alt48 = 2;
                LA48_0 = this.input.LA(1);
                if (LA48_0 == 45) alt48 = 1;
                switch (alt48) {
                    case 1:
                        match(45);
                        if (this.state.failed) return;
                        break;
                }
                match(80);
                if (this.state.failed) return;
                mDURATION_ISO_8601_TIME_DESIGNATORS();
                if (this.state.failed) return;
                break;
            case 4:
                mDURATION_ISO_8601_WEEK_PERIOD_DESIGNATOR();
                if (this.state.failed) return;
                break;
            case 5:
                mDURATION_ISO_8601_PERIOD_DESIGNATORS();
                if (this.state.failed) return;
                alt49 = 2;
                LA49_0 = this.input.LA(1);
                if (LA49_0 == 84) alt49 = 1;
                switch (alt49) {
                    case 1:
                        mDURATION_ISO_8601_TIME_DESIGNATORS();
                        if (this.state.failed) return;
                        break;
                }
                break;
        }
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mIDENT() throws RecognitionException {
        int _type = 26;
        int _channel = 0;
        mLETTER();
        if (this.state.failed) return;
        while (true) {
            MismatchedSetException mse;
            int alt51 = 2;
            int LA51_0 = this.input.LA(1);
            if ((LA51_0 >= 48 && LA51_0 <= 57) || (LA51_0 >= 65 && LA51_0 <= 90) || LA51_0 == 95 || (LA51_0 >= 97 && LA51_0 <= 122))
                alt51 = 1;
            switch (alt51) {
                case 1:
                    if ((this.input.LA(1) >= 48 && this.input.LA(1) <= 57) || (this.input.LA(1) >= 65 && this.input.LA(1) <= 90) || this.input.LA(1) == 95 || (this.input.LA(1) >= 97 && this.input.LA(1) <= 122)) {
                        this.input.consume();
                        this.state.failed = false;
                        continue;
                    }
                    if (this.state.backtracking > 0) {
                        this.state.failed = true;
                        return;
                    }
                    mse = new MismatchedSetException(null, (IntStream) this.input);
                    recover((RecognitionException) mse);
                    throw mse;
            }
            break;
        }
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mHEXNUMBER() throws RecognitionException {
        int _type = 24;
        int _channel = 0;
        match(48);
        if (this.state.failed) return;
        mX();
        if (this.state.failed) return;
        while (true) {
            MismatchedSetException mse;
            int alt52 = 2;
            int LA52_0 = this.input.LA(1);
            if ((LA52_0 >= 48 && LA52_0 <= 57) || (LA52_0 >= 65 && LA52_0 <= 70) || (LA52_0 >= 97 && LA52_0 <= 102))
                alt52 = 1;
            switch (alt52) {
                case 1:
                    if ((this.input.LA(1) >= 48 && this.input.LA(1) <= 57) || (this.input.LA(1) >= 65 && this.input.LA(1) <= 70) || (this.input.LA(1) >= 97 && this.input.LA(1) <= 102)) {
                        this.input.consume();
                        this.state.failed = false;
                        continue;
                    }
                    if (this.state.backtracking > 0) {
                        this.state.failed = true;
                        return;
                    }
                    mse = new MismatchedSetException(null, (IntStream) this.input);
                    recover((RecognitionException) mse);
                    throw mse;
            }
            break;
        }
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mUUID() throws RecognitionException {
        int _type = 192;
        int _channel = 0;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        match(45);
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        match(45);
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        match(45);
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        match(45);
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        mHEX();
        if (this.state.failed) return;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mWS() throws RecognitionException {
        int _type = 195;
        int _channel = 0;
        int cnt53 = 0;
        while (true) {
            MismatchedSetException mse;
            EarlyExitException eee;
            int alt53 = 2;
            int LA53_0 = this.input.LA(1);
            if ((LA53_0 >= 9 && LA53_0 <= 10) || LA53_0 == 13 || LA53_0 == 32) alt53 = 1;
            switch (alt53) {
                case 1:
                    if ((this.input.LA(1) >= 9 && this.input.LA(1) <= 10) || this.input.LA(1) == 13 || this.input.LA(1) == 32) {
                        this.input.consume();
                        this.state.failed = false;
                        break;
                    }
                    if (this.state.backtracking > 0) {
                        this.state.failed = true;
                        return;
                    }
                    mse = new MismatchedSetException(null, (IntStream) this.input);
                    recover((RecognitionException) mse);
                    throw mse;
                default:
                    if (cnt53 >= 1) break;
                    if (this.state.backtracking > 0) {
                        this.state.failed = true;
                        return;
                    }
                    eee = new EarlyExitException(53, (IntStream) this.input);
                    throw eee;
            }
            cnt53++;
        }
//        if (this.state.backtracking == 0) _channel = 99;
//        this.state.type = _type;
//        this.state.channel = _channel;
    }

    public final void mCOMMENT() throws RecognitionException {
        int _type = 8;
        int _channel = 0;
        int alt54 = 2;
        int LA54_0 = this.input.LA(1);
        if (LA54_0 == 45) {
            alt54 = 1;
        } else if (LA54_0 == 47) {
            alt54 = 2;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            NoViableAltException nvae = new NoViableAltException("", 54, 0, (IntStream) this.input);
            throw nvae;
        }
        switch (alt54) {
            case 1:
                match("--");
                if (this.state.failed) return;
                break;
            case 2:
                match("//");
                if (this.state.failed) return;
                break;
        }
        while (true) {
            int alt55 = 2;
            int LA55_0 = this.input.LA(1);
            if (LA55_0 == 10 || LA55_0 == 13) {
                alt55 = 2;
            } else if ((LA55_0 >= 0 && LA55_0 <= 9) || (LA55_0 >= 11 && LA55_0 <= 12) || (LA55_0 >= 14 && LA55_0 <= 65535)) {
                alt55 = 1;
            }
            switch (alt55) {
                case 1:
                    matchAny();
                    if (this.state.failed) return;
                    continue;
            }
            break;
        }
        if (this.input.LA(1) == 10 || this.input.LA(1) == 13) {
            this.input.consume();
            this.state.failed = false;
        } else {
            if (this.state.backtracking > 0) {
                this.state.failed = true;
                return;
            }
            MismatchedSetException mse = new MismatchedSetException(null, (IntStream) this.input);
            recover((RecognitionException) mse);
            throw mse;
        }
        if (this.state.backtracking == 0) _channel = 99;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public final void mMULTILINE_COMMENT() throws RecognitionException {
        int _type = 179;
        int _channel = 0;
        match("/*");
        if (this.state.failed) return;
        while (true) {
            int alt56 = 2;
            int LA56_0 = this.input.LA(1);
            if (LA56_0 == 42) {
                int LA56_1 = this.input.LA(2);
                if (LA56_1 == 47) {
                    alt56 = 2;
                } else if ((LA56_1 >= 0 && LA56_1 <= 46) || (LA56_1 >= 48 && LA56_1 <= 65535)) {
                    alt56 = 1;
                }
            } else if ((LA56_0 >= 0 && LA56_0 <= 41) || (LA56_0 >= 43 && LA56_0 <= 65535)) {
                alt56 = 1;
            }
            switch (alt56) {
                case 1:
                    matchAny();
                    if (this.state.failed) return;
                    continue;
            }
            break;
        }
        match("*/");
        if (this.state.failed) return;
        if (this.state.backtracking == 0) _channel = 99;
        this.state.type = _type;
        this.state.channel = _channel;
    }

    public void mTokens() throws RecognitionException {
        int alt57 = 161;
        alt57 = this.dfa57.predict((IntStream) this.input);
        switch (alt57) {
            case 1:
                mK_SELECT();
                if (this.state.failed) return;
                break;
            case 2:
                mK_FROM();
                if (this.state.failed) return;
                break;
            case 3:
                mK_AS();
                if (this.state.failed) return;
                break;
            case 4:
                mK_WHERE();
                if (this.state.failed) return;
                break;
            case 5:
                mK_AND();
                if (this.state.failed) return;
                break;
            case 6:
                mK_KEY();
                if (this.state.failed) return;
                break;
            case 7:
                mK_KEYS();
                if (this.state.failed) return;
                break;
            case 8:
                mK_ENTRIES();
                if (this.state.failed) return;
                break;
            case 9:
                mK_FULL();
                if (this.state.failed) return;
                break;
            case 10:
                mK_INSERT();
                if (this.state.failed) return;
                break;
            case 11:
                mK_UPDATE();
                if (this.state.failed) return;
                break;
            case 12:
                mK_WITH();
                if (this.state.failed) return;
                break;
            case 13:
                mK_LIMIT();
                if (this.state.failed) return;
                break;
            case 14:
                mK_PER();
                if (this.state.failed) return;
                break;
            case 15:
                mK_PARTITION();
                if (this.state.failed) return;
                break;
            case 16:
                mK_USING();
                if (this.state.failed) return;
                break;
            case 17:
                mK_USE();
                if (this.state.failed) return;
                break;
            case 18:
                mK_DISTINCT();
                if (this.state.failed) return;
                break;
            case 19:
                mK_COUNT();
                if (this.state.failed) return;
                break;
            case 20:
                mK_SET();
                if (this.state.failed) return;
                break;
            case 21:
                mK_BEGIN();
                if (this.state.failed) return;
                break;
            case 22:
                mK_UNLOGGED();
                if (this.state.failed) return;
                break;
            case 23:
                mK_BATCH();
                if (this.state.failed) return;
                break;
            case 24:
                mK_APPLY();
                if (this.state.failed) return;
                break;
            case 25:
                mK_TRUNCATE();
                if (this.state.failed) return;
                break;
            case 26:
                mK_DELETE();
                if (this.state.failed) return;
                break;
            case 27:
                mK_IN();
                if (this.state.failed) return;
                break;
            case 28:
                mK_CREATE();
                if (this.state.failed) return;
                break;
            case 29:
                mK_SCHEMA();
                if (this.state.failed) return;
                break;
            case 30:
                mK_KEYSPACE();
                if (this.state.failed) return;
                break;
            case 31:
                mK_KEYSPACES();
                if (this.state.failed) return;
                break;
            case 32:
                mK_COLUMNFAMILY();
                if (this.state.failed) return;
                break;
            case 33:
                mK_TABLES();
                if (this.state.failed) return;
                break;
            case 34:
                mK_MATERIALIZED();
                if (this.state.failed) return;
                break;
            case 35:
                mK_VIEW();
                if (this.state.failed) return;
                break;
            case 36:
                mK_INDEX();
                if (this.state.failed) return;
                break;
            case 37:
                mK_CUSTOM();
                if (this.state.failed) return;
                break;
            case 38:
                mK_ON();
                if (this.state.failed) return;
                break;
            case 39:
                mK_TO();
                if (this.state.failed) return;
                break;
            case 40:
                mK_DROP();
                if (this.state.failed) return;
                break;
            case 41:
                mK_PRIMARY();
                if (this.state.failed) return;
                break;
            case 42:
                mK_INTO();
                if (this.state.failed) return;
                break;
            case 43:
                mK_VALUES();
                if (this.state.failed) return;
                break;
            case 44:
                mK_TIMESTAMP();
                if (this.state.failed) return;
                break;
            case 45:
                mK_TTL();
                if (this.state.failed) return;
                break;
            case 46:
                mK_CAST();
                if (this.state.failed) return;
                break;
            case 47:
                mK_ALTER();
                if (this.state.failed) return;
                break;
            case 48:
                mK_RENAME();
                if (this.state.failed) return;
                break;
            case 49:
                mK_ADD();
                if (this.state.failed) return;
                break;
            case 50:
                mK_TYPE();
                if (this.state.failed) return;
                break;
            case 51:
                mK_TYPES();
                if (this.state.failed) return;
                break;
            case 52:
                mK_COMPACT();
                if (this.state.failed) return;
                break;
            case 53:
                mK_STORAGE();
                if (this.state.failed) return;
                break;
            case 54:
                mK_ORDER();
                if (this.state.failed) return;
                break;
            case 55:
                mK_BY();
                if (this.state.failed) return;
                break;
            case 56:
                mK_ASC();
                if (this.state.failed) return;
                break;
            case 57:
                mK_DESC();
                if (this.state.failed) return;
                break;
            case 58:
                mK_ALLOW();
                if (this.state.failed) return;
                break;
            case 59:
                mK_FILTERING();
                if (this.state.failed) return;
                break;
            case 60:
                mK_IF();
                if (this.state.failed) return;
                break;
            case 61:
                mK_IS();
                if (this.state.failed) return;
                break;
            case 62:
                mK_CONTAINS();
                if (this.state.failed) return;
                break;
            case 63:
                mK_GROUP();
                if (this.state.failed) return;
                break;
            case 64:
                mK_CLUSTER();
                if (this.state.failed) return;
                break;
            case 65:
                mK_INTERNALS();
                if (this.state.failed) return;
                break;
            case 66:
                mK_ONLY();
                if (this.state.failed) return;
                break;
            case 67:
                mK_GRANT();
                if (this.state.failed) return;
                break;
            case 68:
                mK_ALL();
                if (this.state.failed) return;
                break;
            case 69:
                mK_PERMISSION();
                if (this.state.failed) return;
                break;
            case 70:
                mK_PERMISSIONS();
                if (this.state.failed) return;
                break;
            case 71:
                mK_OF();
                if (this.state.failed) return;
                break;
            case 72:
                mK_REVOKE();
                if (this.state.failed) return;
                break;
            case 73:
                mK_MODIFY();
                if (this.state.failed) return;
                break;
            case 74:
                mK_AUTHORIZE();
                if (this.state.failed) return;
                break;
            case 75:
                mK_DESCRIBE();
                if (this.state.failed) return;
                break;
            case 76:
                mK_EXECUTE();
                if (this.state.failed) return;
                break;
            case 77:
                mK_NORECURSIVE();
                if (this.state.failed) return;
                break;
            case 78:
                mK_MBEAN();
                if (this.state.failed) return;
                break;
            case 79:
                mK_MBEANS();
                if (this.state.failed) return;
                break;
            case 80:
                mK_USER();
                if (this.state.failed) return;
                break;
            case 81:
                mK_USERS();
                if (this.state.failed) return;
                break;
            case 82:
                mK_ROLE();
                if (this.state.failed) return;
                break;
            case 83:
                mK_ROLES();
                if (this.state.failed) return;
                break;
            case 84:
                mK_SUPERUSER();
                if (this.state.failed) return;
                break;
            case 85:
                mK_NOSUPERUSER();
                if (this.state.failed) return;
                break;
            case 86:
                mK_PASSWORD();
                if (this.state.failed) return;
                break;
            case 87:
                mK_HASHED();
                if (this.state.failed) return;
                break;
            case 88:
                mK_LOGIN();
                if (this.state.failed) return;
                break;
            case 89:
                mK_NOLOGIN();
                if (this.state.failed) return;
                break;
            case 90:
                mK_OPTIONS();
                if (this.state.failed) return;
                break;
            case 91:
                mK_ACCESS();
                if (this.state.failed) return;
                break;
            case 92:
                mK_DATACENTERS();
                if (this.state.failed) return;
                break;
            case 93:
                mK_CLUSTERING();
                if (this.state.failed) return;
                break;
            case 94:
                mK_ASCII();
                if (this.state.failed) return;
                break;
            case 95:
                mK_BIGINT();
                if (this.state.failed) return;
                break;
            case 96:
                mK_BLOB();
                if (this.state.failed) return;
                break;
            case 97:
                mK_BOOLEAN();
                if (this.state.failed) return;
                break;
            case 98:
                mK_COUNTER();
                if (this.state.failed) return;
                break;
            case 99:
                mK_DECIMAL();
                if (this.state.failed) return;
                break;
            case 100:
                mK_DOUBLE();
                if (this.state.failed) return;
                break;
            case 101:
                mK_DURATION();
                if (this.state.failed) return;
                break;
            case 102:
                mK_FLOAT();
                if (this.state.failed) return;
                break;
            case 103:
                mK_INET();
                if (this.state.failed) return;
                break;
            case 104:
                mK_INT();
                if (this.state.failed) return;
                break;
            case 105:
                mK_SMALLINT();
                if (this.state.failed) return;
                break;
            case 106:
                mK_TINYINT();
                if (this.state.failed) return;
                break;
            case 107:
                mK_TEXT();
                if (this.state.failed) return;
                break;
            case 108:
                mK_UUID();
                if (this.state.failed) return;
                break;
            case 109:
                mK_VARCHAR();
                if (this.state.failed) return;
                break;
            case 110:
                mK_VARINT();
                if (this.state.failed) return;
                break;
            case 111:
                mK_TIMEUUID();
                if (this.state.failed) return;
                break;
            case 112:
                mK_TOKEN();
                if (this.state.failed) return;
                break;
            case 113:
                mK_WRITETIME();
                if (this.state.failed) return;
                break;
            case 114:
                mK_DATE();
                if (this.state.failed) return;
                break;
            case 115:
                mK_TIME();
                if (this.state.failed) return;
                break;
            case 116:
                mK_NULL();
                if (this.state.failed) return;
                break;
            case 117:
                mK_NOT();
                if (this.state.failed) return;
                break;
            case 118:
                mK_EXISTS();
                if (this.state.failed) return;
                break;
            case 119:
                mK_MAP();
                if (this.state.failed) return;
                break;
            case 120:
                mK_LIST();
                if (this.state.failed) return;
                break;
            case 121:
                mK_POSITIVE_NAN();
                if (this.state.failed) return;
                break;
            case 122:
                mK_NEGATIVE_NAN();
                if (this.state.failed) return;
                break;
            case 123:
                mK_POSITIVE_INFINITY();
                if (this.state.failed) return;
                break;
            case 124:
                mK_NEGATIVE_INFINITY();
                if (this.state.failed) return;
                break;
            case 125:
                mK_TUPLE();
                if (this.state.failed) return;
                break;
            case 126:
                mK_TRIGGER();
                if (this.state.failed) return;
                break;
            case 127:
                mK_STATIC();
                if (this.state.failed) return;
                break;
            case 128:
                mK_FROZEN();
                if (this.state.failed) return;
                break;
            case 129:
                mK_FUNCTION();
                if (this.state.failed) return;
                break;
            case 130:
                mK_FUNCTIONS();
                if (this.state.failed) return;
                break;
            case 131:
                mK_AGGREGATE();
                if (this.state.failed) return;
                break;
            case 132:
                mK_AGGREGATES();
                if (this.state.failed) return;
                break;
            case 133:
                mK_SFUNC();
                if (this.state.failed) return;
                break;
            case 134:
                mK_STYPE();
                if (this.state.failed) return;
                break;
            case 135:
                mK_FINALFUNC();
                if (this.state.failed) return;
                break;
            case 136:
                mK_INITCOND();
                if (this.state.failed) return;
                break;
            case 137:
                mK_RETURNS();
                if (this.state.failed) return;
                break;
            case 138:
                mK_CALLED();
                if (this.state.failed) return;
                break;
            case 139:
                mK_INPUT();
                if (this.state.failed) return;
                break;
            case 140:
                mK_LANGUAGE();
                if (this.state.failed) return;
                break;
            case 141:
                mK_OR();
                if (this.state.failed) return;
                break;
            case 142:
                mK_REPLACE();
                if (this.state.failed) return;
                break;
            case 143:
                mK_JSON();
                if (this.state.failed) return;
                break;
            case 144:
                mK_DEFAULT();
                if (this.state.failed) return;
                break;
            case 145:
                mK_UNSET();
                if (this.state.failed) return;
                break;
            case 146:
                mK_LIKE();
                if (this.state.failed) return;
                break;
            case 147:
                mSTRING_LITERAL();
                if (this.state.failed) return;
                break;
            case 148:
                mQUOTED_NAME();
                if (this.state.failed) return;
                break;
            case 149:
                mEMPTY_QUOTED_NAME();
                if (this.state.failed) return;
                break;
            case 150:
                mINTEGER();
                if (this.state.failed) return;
                break;
            case 151:
                mQMARK();
                if (this.state.failed) return;
                break;
            case 152:
                mRANGE();
                if (this.state.failed) return;
                break;
            case 153:
                mFLOAT();
                if (this.state.failed) return;
                break;
            case 154:
                mBOOLEAN();
                if (this.state.failed) return;
                break;
            case 155:
                mDURATION();
                if (this.state.failed) return;
                break;
            case 156:
                mIDENT();
                if (this.state.failed) return;
                break;
            case 157:
                mHEXNUMBER();
                if (this.state.failed) return;
                break;
            case 158:
                mUUID();
                if (this.state.failed) return;
                break;
            case 159:
                mWS();
                if (this.state.failed) return;
                break;
            case 160:
                mCOMMENT();
                if (this.state.failed) return;
                break;
            case 161:
                mMULTILINE_COMMENT();
                if (this.state.failed) return;
                break;
        }
    }

    public final void synpred1_Lexer_fragment() throws RecognitionException {
        mINTEGER();
        if (this.state.failed) return;
        match(46);
        if (this.state.failed) return;
        mRANGE();
        if (this.state.failed) return;
    }

    public final void synpred2_Lexer_fragment() throws RecognitionException {
        mINTEGER();
        if (this.state.failed) return;
        mRANGE();
        if (this.state.failed) return;
    }

    public final boolean synpred2_Lexer() {
        this.state.backtracking++;
        int start = this.input.mark();
        try {
            synpred2_Lexer_fragment();
        } catch (RecognitionException re) {
            System.err.println("impossible: " + re);
        }
        boolean success = !this.state.failed;
        this.input.rewind(start);
        this.state.backtracking--;
        this.state.failed = false;
        return success;
    }

    public final boolean synpred1_Lexer() {
        this.state.backtracking++;
        int start = this.input.mark();
        try {
            synpred1_Lexer_fragment();
        } catch (RecognitionException re) {
            System.err.println("impossible: " + re);
        }
        boolean success = !this.state.failed;
        this.input.rewind(start);
        this.state.backtracking--;
        this.state.failed = false;
        return success;
    }

    static final short[] DFA22_eof = DFA.unpackEncodedString("\007￿");
    /*  8984 */   static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars("\001-\001P\0020\003￿");
    /*  8985 */   static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars("\002P\0019\001Y\003￿");
    /*  8986 */   static final short[] DFA22_accept = DFA.unpackEncodedString("\004￿\001\001\001\002\001\003");
    /*  8987 */   static final short[] DFA22_special = DFA.unpackEncodedString("\007￿}>");
    static final short[][] DFA22_transition;
    static final String DFA13_eotS = "\001\002\003￿";
    static final String DFA13_eofS = "\004￿";
    static final String DFA13_minS = "\0020\002￿";
    static final String DFA13_maxS = "\0019\001M\002￿";
    static final String DFA13_acceptS = "\002￿\001\002\001\001";
    /*       */   static final String DFA13_specialS = "\004￿}>";

    /*       */
    /*       */   static {
        /*  8991 */
        int numStates = DFA22_transitionS.length;
        /*  8992 */
        DFA22_transition = new short[numStates][];
        int i;
        /*  8993 */
        for (i = 0; i < numStates; i++)
            /*  8994 */
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        /*       */
    }

    /*       */
    /*       */   protected class DFA22
            /*       */ extends DFA
            /*       */ {
        /*       */
        public DFA22(BaseRecognizer recognizer) {
            /*  9001 */
            this.recognizer = recognizer;
            /*  9002 */
            this.decisionNumber = 22;
            /*  9003 */
            this.eot = Cql_Lexer.DFA22_eot;
            /*  9004 */
            this.eof = Cql_Lexer.DFA22_eof;
            /*  9005 */
            this.min = Cql_Lexer.DFA22_min;
            /*  9006 */
            this.max = Cql_Lexer.DFA22_max;
            /*  9007 */
            this.accept = Cql_Lexer.DFA22_accept;
            /*  9008 */
            this.special = Cql_Lexer.DFA22_special;
            /*  9009 */
            this.transition = Cql_Lexer.DFA22_transition;
            /*       */
        }

        /*       */
        /*       */
        public String getDescription() {
            /*  9013 */
            return "297:10: fragment DURATION_ISO_8601_PERIOD_DESIGNATORS : ( ( '-' )? 'P' ( DIGIT )+ 'Y' ( ( DIGIT )+ 'M' )? ( ( DIGIT )+ 'D' )? | ( '-' )? 'P' ( DIGIT )+ 'M' ( ( DIGIT )+ 'D' )? | ( '-' )? 'P' ( DIGIT )+ 'D' );";
            /*       */
        }
        /*       */
    }

    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*  9029 */   static final String[] DFA13_transitionS = new String[]{"\n\001", "\n\001\n￿\001\002\b￿\001\003", "", ""};
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*  9036 */   static final short[] DFA13_eot = DFA.unpackEncodedString("\001\002\003￿");
    /*  9037 */   static final short[] DFA13_eof = DFA.unpackEncodedString("\004￿");
    /*  9038 */   static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars("\0020\002￿");
    /*  9039 */   static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars("\0019\001M\002￿");
    /*  9040 */   static final short[] DFA13_accept = DFA.unpackEncodedString("\002￿\001\002\001\001");
    /*  9041 */   static final short[] DFA13_special = DFA.unpackEncodedString("\004￿}>");
    static final short[][] DFA13_transition;
    static final String DFA32_eotS = "\006￿";
    static final String DFA32_eofS = "\006￿";
    static final String DFA32_minS = "\001T\0020\003￿";
    static final String DFA32_maxS = "\001T\0019\001S\003￿";
    static final String DFA32_acceptS = "\003￿\001\001\001\002\001\003";
    /*       */   static final String DFA32_specialS = "\006￿}>";

    /*       */
    /*       */   static {
        /*  9045 */
        int numStates = DFA13_transitionS.length;
        /*  9046 */
        DFA13_transition = new short[numStates][];
        /*  9047 */
        for (int i = 0; i < numStates; i++)
            /*  9048 */
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        /*       */
    }

    /*       */
    /*       */   protected class DFA13
            /*       */ extends DFA
            /*       */ {
        /*       */
        public DFA13(BaseRecognizer recognizer) {
            /*  9055 */
            this.recognizer = recognizer;
            /*  9056 */
            this.decisionNumber = 13;
            /*  9057 */
            this.eot = Cql_Lexer.DFA13_eot;
            /*  9058 */
            this.eof = Cql_Lexer.DFA13_eof;
            /*  9059 */
            this.min = Cql_Lexer.DFA13_min;
            /*  9060 */
            this.max = Cql_Lexer.DFA13_max;
            /*  9061 */
            this.accept = Cql_Lexer.DFA13_accept;
            /*  9062 */
            this.special = Cql_Lexer.DFA13_special;
            /*  9063 */
            this.transition = Cql_Lexer.DFA13_transition;
            /*       */
        }

        /*       */
        /*       */
        public String getDescription() {
            /*  9067 */
            return "298:27: ( ( DIGIT )+ 'M' )?";
            /*       */
        }
        /*       */
    }

    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*  9083 */   static final String[] DFA32_transitionS = new String[]{"\001\001", "\n\002", "\n\002\016￿\001\003\004￿\001\004\005￿\001\005", "", "", ""};
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*  9092 */   static final short[] DFA32_eot = DFA.unpackEncodedString("\006￿");
    /*  9093 */   static final short[] DFA32_eof = DFA.unpackEncodedString("\006￿");
    /*  9094 */   static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars("\001T\0020\003￿");
    /*  9095 */   static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars("\001T\0019\001S\003￿");
    /*  9096 */   static final short[] DFA32_accept = DFA.unpackEncodedString("\003￿\001\001\001\002\001\003");
    /*  9097 */   static final short[] DFA32_special = DFA.unpackEncodedString("\006￿}>");
    static final short[][] DFA32_transition;
    static final String DFA25_eotS = "\001\002\003￿";
    static final String DFA25_eofS = "\004￿";
    static final String DFA25_minS = "\0020\002￿";
    static final String DFA25_maxS = "\0019\001S\002￿";
    static final String DFA25_acceptS = "\002￿\001\002\001\001";
    /*       */   static final String DFA25_specialS = "\004￿}>";

    /*       */
    /*       */   static {
        /*  9101 */
        int numStates = DFA32_transitionS.length;
        /*  9102 */
        DFA32_transition = new short[numStates][];
        /*  9103 */
        for (int i = 0; i < numStates; i++)
            /*  9104 */
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        /*       */
    }

    /*       */
    /*       */   protected class DFA32
            /*       */ extends DFA
            /*       */ {
        /*       */
        public DFA32(BaseRecognizer recognizer) {
            /*  9111 */
            this.recognizer = recognizer;
            /*  9112 */
            this.decisionNumber = 32;
            /*  9113 */
            this.eot = Cql_Lexer.DFA32_eot;
            /*  9114 */
            this.eof = Cql_Lexer.DFA32_eof;
            /*  9115 */
            this.min = Cql_Lexer.DFA32_min;
            /*  9116 */
            this.max = Cql_Lexer.DFA32_max;
            /*  9117 */
            this.accept = Cql_Lexer.DFA32_accept;
            /*  9118 */
            this.special = Cql_Lexer.DFA32_special;
            /*  9119 */
            this.transition = Cql_Lexer.DFA32_transition;
            /*       */
        }

        /*       */
        /*       */
        public String getDescription() {
            /*  9123 */
            return "303:10: fragment DURATION_ISO_8601_TIME_DESIGNATORS : ( 'T' ( DIGIT )+ 'H' ( ( DIGIT )+ 'M' )? ( ( DIGIT )+ 'S' )? | 'T' ( DIGIT )+ 'M' ( ( DIGIT )+ 'S' )? | 'T' ( DIGIT )+ 'S' );";
            /*       */
        }
        /*       */
    }

    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*  9139 */   static final String[] DFA25_transitionS = new String[]{"\n\001", "\n\001\023￿\001\003\005￿\001\002", "", ""};
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*  9146 */   static final short[] DFA25_eot = DFA.unpackEncodedString("\001\002\003￿");
    /*  9147 */   static final short[] DFA25_eof = DFA.unpackEncodedString("\004￿");
    /*  9148 */   static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars("\0020\002￿");
    /*  9149 */   static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars("\0019\001S\002￿");
    /*  9150 */   static final short[] DFA25_accept = DFA.unpackEncodedString("\002￿\001\002\001\001");
    /*  9151 */   static final short[] DFA25_special = DFA.unpackEncodedString("\004￿}>");
    static final short[][] DFA25_transition;
    static final String DFA35_eotS = "\002￿\001\n\n￿";
    static final String DFA35_eofS = "\r￿";
    static final String DFA35_minS = "\001D\001￿\001O\n￿";
    static final String DFA35_maxS = "\001µ\001￿\001s\n￿";
    static final String DFA35_acceptS = "\001￿\001\001\001￿\001\003\001\004\001\005\001\007\001\t\001\n\001\013\001\006\001\002\001\b";
    /*       */   static final String DFA35_specialS = "\r￿}>";

    /*       */
    /*       */   static {
        /*  9155 */
        int numStates = DFA25_transitionS.length;
        /*  9156 */
        DFA25_transition = new short[numStates][];
        /*  9157 */
        for (int i = 0; i < numStates; i++)
            /*  9158 */
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        /*       */
    }

    /*       */
    /*       */   protected class DFA25
            /*       */ extends DFA
            /*       */ {
        /*       */
        public DFA25(BaseRecognizer recognizer) {
            /*  9165 */
            this.recognizer = recognizer;
            /*  9166 */
            this.decisionNumber = 25;
            /*  9167 */
            this.eot = Cql_Lexer.DFA25_eot;
            /*  9168 */
            this.eof = Cql_Lexer.DFA25_eof;
            /*  9169 */
            this.min = Cql_Lexer.DFA25_min;
            /*  9170 */
            this.max = Cql_Lexer.DFA25_max;
            /*  9171 */
            this.accept = Cql_Lexer.DFA25_accept;
            /*  9172 */
            this.special = Cql_Lexer.DFA25_special;
            /*  9173 */
            this.transition = Cql_Lexer.DFA25_transition;
            /*       */
        }

        /*       */
        /*       */
        public String getDescription() {
            /*  9177 */
            return "304:22: ( ( DIGIT )+ 'M' )?";
            /*       */
        }
        /*       */
    }

    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*  9193 */   static final String[] DFA35_transitionS = new String[]{"\001\004\003￿\001\005\004￿\001\002\001\t\004￿\001\006\001￿\001\007\001￿\001\003\001￿\001\001\n￿\001\004\003￿\001\005\004￿\001\002\001\t\004￿\001\006\001￿\001\007\001￿\001\003\001￿\001\001;￿\001\b", "", "\001\013\003￿\001\f\033￿\001\013\003￿\001\f", "", "", "", "", "", "", "", "", "", ""};
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*  9211 */   static final short[] DFA35_eot = DFA.unpackEncodedString("\002￿\001\n\n￿");
    /*  9212 */   static final short[] DFA35_eof = DFA.unpackEncodedString("\r￿");
    /*  9213 */   static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars("\001D\001￿\001O\n￿");
    /*  9214 */   static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars("\001µ\001￿\001s\n￿");
    /*  9215 */   static final short[] DFA35_accept = DFA.unpackEncodedString("\001￿\001\001\001￿\001\003\001\004\001\005\001\007\001\t\001\n\001\013\001\006\001\002\001\b");
    /*  9216 */   static final short[] DFA35_special = DFA.unpackEncodedString("\r￿}>");
    static final short[][] DFA35_transition;
    static final String DFA50_eotS = "\r￿";
    static final String DFA50_eofS = "\r￿";
    static final String DFA50_minS = "\001-\0010\001￿\0020\001￿\0010\002￿\0010\001-\001￿\0010";
    static final String DFA50_maxS = "\002P\001￿\001T\001Y\001￿\001Y\002￿\002Y\001￿\001Y";
    static final String DFA50_acceptS = "\002￿\001\001\002￿\001\003\001￿\001\004\001\005\002￿\001\002\001￿";
    /*       */   static final String DFA50_specialS = "\r￿}>";

    /*       */
    /*       */   static {
        /*  9220 */
        int numStates = DFA35_transitionS.length;
        /*  9221 */
        DFA35_transition = new short[numStates][];
        /*  9222 */
        for (int i = 0; i < numStates; i++)
            /*  9223 */
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        /*       */
    }

    /*       */
    /*       */   protected class DFA35
            /*       */ extends DFA
            /*       */ {
        /*       */
        public DFA35(BaseRecognizer recognizer) {
            /*  9230 */
            this.recognizer = recognizer;
            /*  9231 */
            this.decisionNumber = 35;
            /*  9232 */
            this.eot = Cql_Lexer.DFA35_eot;
            /*  9233 */
            this.eof = Cql_Lexer.DFA35_eof;
            /*  9234 */
            this.min = Cql_Lexer.DFA35_min;
            /*  9235 */
            this.max = Cql_Lexer.DFA35_max;
            /*  9236 */
            this.accept = Cql_Lexer.DFA35_accept;
            /*  9237 */
            this.special = Cql_Lexer.DFA35_special;
            /*  9238 */
            this.transition = Cql_Lexer.DFA35_transition;
            /*       */
        }

        /*       */
        /*       */
        public String getDescription() {
            /*  9242 */
            return "313:10: fragment DURATION_UNIT : ( Y | M O | W | D | H | M | S | M S | U S | '\\u00B5' S | N S );";
            /*       */
        }
        /*       */
    }

    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*  9258 */   static final String[] DFA50_transitionS = new String[]{"\001\001\002￿\n\002\026￿\001\003", "\n\002\026￿\001\003", "", "\n\004\032￿\001\005", "\n\006\n￿\001\b\b￿\001\b\t￿\001\007\001￿\001\b", "", "\n\t\n￿\001\b\b￿\001\b\t￿\001\007\001￿\001\b", "", "", "\n\n\n￿\001\b\b￿\001\b\t￿\001\007\001￿\001\b", "\001\013\002￿\n\f\n￿\001\b\b￿\001\b\t￿\001\007\001￿\001\b", "", "\n\f\n￿\001\b\b￿\001\b\t￿\001\007\001￿\001\b"};
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*  9275 */   static final short[] DFA50_eot = DFA.unpackEncodedString("\r￿");
    /*  9276 */   static final short[] DFA50_eof = DFA.unpackEncodedString("\r￿");
    /*  9277 */   static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars("\001-\0010\001￿\0020\001￿\0010\002￿\0010\001-\001￿\0010");
    /*  9278 */   static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars("\002P\001￿\001T\001Y\001￿\001Y\002￿\002Y\001￿\001Y");
    /*  9279 */   static final short[] DFA50_accept = DFA.unpackEncodedString("\002￿\001\001\002￿\001\003\001￿\001\004\001\005\002￿\001\002\001￿");
    /*  9280 */   static final short[] DFA50_special = DFA.unpackEncodedString("\r￿}>");
    static final short[][] DFA50_transition;
    static final String DFA57_eotS = "\001￿\025\036\001￿\001\036\002￿\001|\002￿\001\036\001￿\001|\002￿\f\036\001\r\036\001¦\001®\001¯\031\036\001Ù\005\036\001à\n\036\001ï\001ñ\001ó\b\036\003￿\001|\001￿\001\036\001Ą\002￿\001|\002￿\001x\003￿\001\036\001ċ\017\036\001￿\001Ĝ\001Ğ\002\036\001ġ\001ģ\006\036\001Ī\003\036\001￿\002\036\001ı\004\036\002￿\002\036\001ĺ\b\036\001ń\004\036\004x\025\036\001￿\006\036\001￿\003\036\001ů\004\036\001Ŵ\005\036\001￿\001\036\001￿\001\036\001￿\013\036\001ƈ\001\036\001Ɗ\002\036\001￿\001|\001￿\001x\001~\001￿\001\036\001￿\007\036\001ƛ\001\036\001Ɲ\006\036\001￿\001\036\001￿\002\036\001￿\001\036\001￿\004\036\001Ƭ\001\036\001￿\001Ʈ\005\036\001￿\001Ƶ\001\036\001Ʒ\005\036\001￿\001ƽ\002\036\001ǁ\001\036\001ǃ\001Ǆ\002\036\001￿\b\036\003x\002\036\001ǔ\002\036\001ǘ\001\036\001ǚ\b\036\001ǣ\005\036\001ǩ\002\036\001Ǭ\003\036\001ǰ\001\036\001￿\001Ǵ\001Ƕ\002\036\001￿\002\036\001ǻ\003\036\001ǿ\006\036\001Ȇ\005\036\001￿\001ȍ\001￿\001\036\001ȏ\001|\001￿\001x\001~\001￿\001x\004\036\001Ț\002\036\001ȝ\001￿\001\036\001￿\003\036\001Ȣ\001Ǭ\001\036\001Ȥ\001ȥ\001Ȧ\001ȧ\003\036\001ȫ\001￿\001\036\001￿\005\036\001Ȳ\001￿\001\036\001￿\002\036\001ȶ\001\036\001ȸ\001￿\001ȹ\001\036\001Ȼ\001￿\001ȼ\002￿\001Ƚ\006\036\002x\001\036\001x\004\036\001￿\003\036\001￿\001\036\001￿\002\036\001ɓ\005\036\001￿\002\036\001ɜ\001ɝ\001\036\001￿\002\036\001￿\001\036\001ɢ\001ɤ\001￿\003\036\001￿\001ɨ\001￿\001ɩ\002\036\001ɬ\001￿\003\036\001￿\001ɱ\005\036\001￿\001ɷ\001ɸ\001ɹ\003\036\001￿\001\036\001￿\001|\001￿\001x\001~\001￿\001x\001ʄ\001ʅ\001\036\001ʇ\001￿\002\036\001￿\001ʊ\003\036\001￿\001\036\004￿\001\036\001ʐ\001\036\001￿\004\036\001ʖ\001ʗ\001￿\003\036\001￿\001ʛ\002￿\001\036\003￿\007\036\006x\001\036\001ʦ\004\036\001ʫ\001\036\001￿\004\036\001ʱ\001ʲ\001ʳ\001\036\002￿\001ʵ\003\036\001￿\001ʹ\001￿\003\036\002￿\001\036\001ʾ\001￿\001ʿ\001ˀ\001\036\001˂\001￿\001\036\001˄\001˅\002\036\003￿\003\036\001ˋ\001|\001￿\001x\001~\001￿\001x\002￿\001˒\001￿\002\036\001￿\005\036\001￿\003\036\001˝\001˞\002￿\003\036\001￿\005\036\001˧\004\036\001￿\001\036\001˭\001ˮ\001\036\001￿\001\036\001˱\001\036\001˳\001\036\003￿\001˵\001￿\001˷\001\036\001˹\001￿\002\036\001˼\001\036\003￿\001˾\001￿\001˿\002￿\001̀\001́\002\036\001̄\001￿\001|\001￿\001x\001~\001￿\001x\001￿\001\036\001̌\001̍\006\036\001̔\002￿\001\036\001̗\001̘\001̙\001̚\002\036\001̝\001￿\003x\001̟\001̠\002￿\001\036\001̢\001￿\001\036\001￿\001̤\001￿\001\036\001￿\001̦\001￿\001\036\001̨\001￿\001\036\004￿\002\036\001￿\001|\001￿\001x\001~\001￿\001x\001̭\002￿\001̮\001̯\001̰\001̱\001̲\001̴\001￿\001̵\001̶\004￿\001\036\001̸\001￿\001\036\002￿\001\036\001￿\001\036\001￿\001\036\001￿\001̼\001￿\003\036\007￿\001́\003￿\001͂\001￿\002\036\001͆\001￿\003\036\001~\002￿\001͋\001͌\001\036\001￿\001\036\001͐\001͑\001~\002￿\001ɢ\001\036\001͔\002￿\001~\001\036\001￿\001~\001ʹ";
    static final String DFA57_eofS = "͗￿";
    static final String DFA57_minS = "\001\t\001C\0020\001H\001E\0010\001F\001N\001A\0040\003A\001F\001E\001R\002A\001-\001S\001￿\001\000\001.\002￿\001A\001￿\001.\001￿\001*\001L\001H\001A\001P\001A\001U\001O\002L\001O\0030\001D\001P\001L\0010\001T\0010\001G\001E\001T\001I\001Y\001T\001E\0030\001D\001E\001L\001I\001K\001G\001N\002R\001I\0020\001S\0010\001O\0010\001U\001R\001L\001E\001S\0010\001U\0030\001G\002O\001I\001B\0010\001M\001L\001P\001X\002P\001D\002E\001L\0030\001T\001N\001L\001A\002L\001N\001S\003￿\001.\001￿\001O\001\"\002￿\001.\001￿\001+\0010\003￿\001E\0010\001E\001R\001T\001P\001E\001L\001N\001M\001L\001C\001T\002A\001S\0010\001￿\0020\001L\001E\0020\001H\0010\002R\001H\001T\0010\001R\001C\001S\001￿\002E\0010\001T\001I\001T\001U\002￿\001A\001N\0010\001O\001E\001D\001I\001T\001E\001I\001G\0010\001T\001S\001M\0060\001T\001E\001C\0020\001P\001A\001B\001A\001N\001U\001P\001T\001A\002T\001L\001S\001I\001C\001￿\001I\001B\001L\001E\001G\001L\001￿\002E\001Y\0010\001E\001T\001L\001E\0010\001I\001A\001W\001U\001C\001￿\001Y\001￿\001E\001￿\001I\001A\001O\001U\001L\001E\001U\001N\001E\001U\001O\0010\001L\0010\001H\001N\001￿\001.\001+\0030\001C\001￿\001M\001A\001I\001E\001R\001L\001C\0010\001E\0010\001T\001E\001L\001T\001E\0010\001￿\001I\001￿\001Y\001R\001￿\001W\001￿\001O\0010\002E\0010\001E\001￿\0010\001I\001U\001T\001R\001X\001￿\0010\001R\0010\001N\001C\002T\001G\001￿\0010\001G\001T\0010\001T\0020\001N\001U\001￿\002I\001W\001A\0070\001I\001T\0010\001M\0020\001C\0010\001L\002T\001M\002A\001T\001O\0010\001E\001T\001N\001H\001N\0010\001E\001C\0010\001G\001E\001N\0010\001I\001￿\0020\001E\001R\001￿\001F\001N\0010\001E\001H\001N\0010\001R\001O\001M\001K\001R\001A\0010\001P\001T\001C\001P\001G\001￿\0010\001￿\001E\0010\001.\001+\0040\001T\001A\001G\001C\0010\001U\001I\0010\001￿\001N\001￿\001I\001R\001F\0070\001R\001S\001G\0010\001￿\001T\001￿\001A\001E\001T\001S\001T\0010\001￿\001N\001￿\001I\001O\0010\001E\0010\001￿\0010\001G\0010\001￿\0010\002￿\0010\001A\001S\001T\001O\001R\001-\0060\001N\001E\001￿\001I\001A\001L\001￿\001E\001￿\001E\001I\0010\001N\001C\001I\001E\001M\001￿\001D\001E\0020\001T\001￿\002A\001￿\001E\0020\001￿\001T\001U\001N\001￿\0010\001￿\0010\001I\001Y\0010\001￿\001S\001A\001T\001￿\0010\001N\002E\001N\001C\001￿\0030\001U\001E\001I\001￿\001D\001￿\001.\001+\0060\001E\0010\001￿\001S\001N\001￿\0010\001O\001I\001U\001￿\0010\004￿\001I\0010\001A\001￿\001I\001C\001S\001E\0020\001￿\001A\001T\001N\001￿\0010\002￿\001E\003￿\001G\001S\001I\001R\001Y\b0\001C\0010\001B\001L\001T\001N\0010\001O\001￿\001R\001F\001T\001N\0030\001R\002￿\0010\001N\001T\001R\001￿\0010\001￿\001A\001I\001T\002￿\001A\0010\001￿\0020\001R\0010\001￿\001S\0020\001S\001E\003￿\002R\001N\0010\001.\001+\0040\002￿\0010\001￿\001E\001T\001￿\003N\0010\001Z\001￿\001T\001M\001E\0020\002￿\001L\001Y\001D\001￿\001D\001E\001I\001O\001D\0040\001T\001￿\001E\0020\001T\001￿\001N\0010\001A\0010\001S\003￿\0010\001￿\0010\001E\0010\001￿\001M\001D\0010\001L\003￿\0010\001￿\0010\002￿\0020\001S\001U\0010\001￿\001.\001+\0040\001￿\001R\0020\001G\001C\001-\003E\0010\002￿\001S\0040\001O\001N\0010\001￿\0050\002￿\001E\0010\001￿\001M\001￿\0010\001￿\001N\001￿\0010\001￿\001P\0010\001￿\001I\004￿\001I\001S\001￿\001-\001+\004-\0010\002￿\0060\001￿\0020\004￿\001N\0010\001￿\0010\002￿\001R\001￿\001I\001￿\001G\001￿\0010\001￿\001Z\001V\001E\0010\006￿\0010\003￿\0010\001￿\001S\001L\0010\001￿\002E\001R\0010\002￿\0020\001I\001￿\001D\0030\002￿\0010\001E\0010\002￿\0010\001S\001￿\001-\0010";
    static final String DFA57_maxS = "\001z\003u\001r\001e\001x\001s\001u\001o\001r\002u\002y\001o\001i\001r\001o\001r\001u\001a\001n\001s\001￿\001￿\001µ\002￿\001r\001￿\001µ\001￿\001/\001t\001h\001y\001p\001a\001u\001o\002n\001o\001l\001f\001z\001d\001p\001t\001f\001t\001f\001g\001e\001t\001i\001y\001t\001i\003z\001d\001i\001s\001i\001s\001g\001n\001r\001s\001i\001Y\0019\002s\001o\001t\001u\001r\001u\001e\002s\001u\001g\001t\001z\001g\002o\001u\001b\001z\001n\001l\001p\001x\001p\001t\001d\002e\001r\003z\001t\001v\001l\001o\001t\001l\001n\001s\003￿\001µ\001￿\001o\001\"\002￿\001µ\001￿\002f\003￿\001e\001z\001e\001r\001t\001p\001e\001l\001n\001z\001l\001c\001t\002a\001s\001f\001￿\002z\001l\001e\002z\001h\001f\002r\001h\001t\001z\001r\001c\001s\001￿\002e\001z\001t\001i\001t\001u\002￿\001a\001n\001z\001o\001e\001d\001i\001t\001e\001i\001g\001z\001t\001s\001m\001Y\004z\001S\001t\001e\001c\001i\001f\001p\001e\001b\001a\001n\001u\001p\001t\001a\002t\001l\001s\001i\001c\001￿\001i\001b\001l\001n\001g\001l\001￿\002e\001y\001z\001e\001t\001l\001e\001z\001i\001a\001w\001u\001i\001￿\001y\001￿\001e\001￿\001i\001a\001o\001u\001l\001e\001u\001n\001e\001u\001o\001z\001l\001z\001h\001n\001￿\001µ\003f\001µ\001c\001￿\001m\001a\001i\001e\001r\001l\001c\001z\001e\001z\001t\001e\001l\001t\001e\001f\001￿\001i\001￿\001y\001r\001￿\001w\001￿\001o\001s\002e\001z\001e\001￿\001z\001i\001u\001t\001r\001x\001￿\001z\001r\001z\001n\001c\002t\001g\001￿\001z\001g\001t\001z\001t\002z\001n\001u\001￿\002i\001w\001a\001Y\001M\0019\001D\003z\001i\001t\001z\001m\001u\001z\001c\001z\001l\002t\001m\002a\001t\001o\001z\001e\001t\001n\001h\001n\001z\001e\001c\001z\001g\001e\001n\001z\001i\001￿\002z\001e\001r\001￿\001f\001n\001z\001e\001h\001n\001z\001r\001o\001m\001k\001r\001a\001z\001p\001t\001c\001p\001g\001￿\001z\001￿\001e\001z\001µ\003f\001µ\001f\001t\001a\001g\001c\001z\001u\001i\001z\001￿\001n\001￿\001i\001r\001f\002z\001f\004z\001r\001s\001g\001z\001￿\001t\001￿\001a\001e\001t\001s\001t\001z\001￿\001n\001￿\001i\001o\001z\001e\001z\001￿\001z\001g\001z\001￿\001z\002￿\001z\001a\001s\001t\001o\001r\001Y\002z\001S\001z\002S\001n\001e\001￿\001i\001a\001l\001￿\001e\001￿\001e\001i\001z\001n\001c\001i\001e\001m\001￿\001d\001e\002z\001t\001￿\002a\001￿\001e\002z\001￿\001t\001u\001n\001￿\001z\001￿\001z\001i\001y\001z\001￿\001s\001a\001t\001￿\001z\001n\002e\001n\001c\001￿\003z\001u\001e\001i\001￿\001d\001￿\001µ\003f\001µ\001f\002z\001e\001z\001￿\001s\001n\001￿\001z\001o\001i\001u\001￿\001f\004￿\001i\001z\001a\001￿\001i\001c\001s\001e\002z\001￿\001a\001t\001n\001￿\001z\002￿\001e\003￿\001g\001s\001i\001r\001y\001Y\001D\006z\001c\001z\001b\001l\001t\001n\001z\001o\001￿\001r\001f\001t\001n\003z\001r\002￿\001z\001n\001t\001r\001￿\001z\001￿\001a\001i\001t\002￿\001a\001z\001￿\002z\001r\001z\001￿\001s\002z\001s\001e\003￿\002r\001n\001z\001µ\003f\001µ\001f\002￿\001z\001￿\001e\001t\001￿\003n\001f\001z\001￿\001t\001m\001e\002z\002￿\001l\001y\001d\001￿\001d\001e\001i\001o\001d\001z\003S\001t\001￿\001e\002z\001t\001￿\001n\001z\001a\001z\001s\003￿\001z\001￿\001z\001e\001z\001￿\001m\001d\001z\001l\003￿\001z\001￿\001z\002￿\002z\001s\001u\001z\001￿\001µ\003f\001µ\001f\001￿\001r\002z\001g\001c\001-\003e\001z\002￿\001s\004z\001o\001n\001z\001￿\005z\002￿\001e\001z\001￿\001m\001￿\001z\001￿\001n\001￿\001z\001￿\001p\001z\001￿\001i\004￿\001i\001s\001￿\001µ\0019\002-\001µ\001-\001z\002￿\006z\001￿\002z\004￿\001n\001z\001￿\001S\002￿\001r\001￿\001i\001￿\001g\001￿\001z\001￿\001z\001v\001e\001f\006￿\001z\003￿\001z\001￿\001s\001l\001z\001￿\002e\001r\001f\002￿\002z\001y\001￿\001d\002z\001f\002￿\001z\001e\001z\002￿\001f\001s\001￿\001-\001z";
    static final String DFA57_acceptS = "\030￿\001\002￿\001\001\001￿\001\001￿\001S￿\001 \001z\001|\001￿\001\002￿\001\001\001￿\001\002￿\001\001\001¡\021￿\001\003\020￿\001\033\007￿\001<\001=)￿\0017\006￿\001'\016￿\001&\001￿\001\001￿\001G\020￿\001\006￿\001\024\020￿\0018\001￿\001\005\002￿\001D\001￿\0011\006￿\001\006\006￿\001h\b￿\001\021\t￿\001\016*￿\001-\004￿\001w\023￿\001u\001￿\001y\020￿\001\002\001￿\001\t\016￿\001\f\001￿\001\007\006￿\001*\001￿\001g\005￿\001P\003￿\001l\001￿\001x\001\017￿\0019\003￿\001(\001￿\001r\b￿\001.\005￿\001`\002￿\001\003￿\001s\003￿\0012\001￿\001k\004￿\001#\003￿\001B\006￿\001R\006￿\001t\001￿\001\n￿\001\002￿\001\004￿\001f\001￿\001^\001\030\001/\001:\003￿\001\004\006￿\001$\003￿\001\001￿\001\020\001Q\001￿\001\001\r\001X\025￿\001\023\b￿\001\025\001\027\004￿\001 \001￿\001p\003￿\0013\001}\002￿\001N\004￿\0016\005￿\001S\001?\001C\n￿\001\001\001\035\001￿\001\002￿\001\005￿\001[\005￿\001v\001\n\003￿\001\013\n￿\001\032\004￿\001d\005￿\001\034\001%\001\001￿\001_\003￿\001!\004￿\001I\001O\001+\001￿\001n\001￿\0010\001H\005￿\001W\006￿\0015\n￿\001\b\001L\b￿\001)\005￿\001c\001\002￿\001b\001￿\0014\001￿\001@\001￿\001a\001￿\001~\002￿\001j\001￿\001m\001Z\001\001\002￿\001Y\007￿\001i\001\006￿\001\036\002￿\001{\001\001\026\001\002￿\001V\001￿\001\022\001K\001￿\001e\001￿\001>\001￿\001\031\001￿\001o\004￿\001T\001\001;\001\001J\001\001￿\001q\001\037\001A\001￿\001\017\003￿\001,\004￿\001\001E\003￿\001]\004￿\001F\001\\\003￿\001M\001U\002￿\001\"\002￿";
    /*       */   static final String DFA57_specialS = "\031￿\001\000̽￿}>";

    /*       */
    /*       */   static {
        /*  9284 */
        int numStates = DFA50_transitionS.length;
        /*  9285 */
        DFA50_transition = new short[numStates][];
        /*  9286 */
        for (int i = 0; i < numStates; i++)
            /*  9287 */
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        /*       */
    }

    /*       */
    /*       */   protected class DFA50
            /*       */ extends DFA
            /*       */ {
        /*       */
        public DFA50(BaseRecognizer recognizer) {
            /*  9294 */
            this.recognizer = recognizer;
            /*  9295 */
            this.decisionNumber = 50;
            /*  9296 */
            this.eot = Cql_Lexer.DFA50_eot;
            /*  9297 */
            this.eof = Cql_Lexer.DFA50_eof;
            /*  9298 */
            this.min = Cql_Lexer.DFA50_min;
            /*  9299 */
            this.max = Cql_Lexer.DFA50_max;
            /*  9300 */
            this.accept = Cql_Lexer.DFA50_accept;
            /*  9301 */
            this.special = Cql_Lexer.DFA50_special;
            /*  9302 */
            this.transition = Cql_Lexer.DFA50_transition;
            /*       */
        }

        /*       */
        /*       */
        public String getDescription() {
            /*  9306 */
            return "356:1: DURATION : ( ( '-' )? ( DIGIT )+ DURATION_UNIT ( ( DIGIT )+ DURATION_UNIT )* | ( '-' )? 'P' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT 'T' DIGIT DIGIT ':' DIGIT DIGIT ':' DIGIT DIGIT | ( '-' )? 'P' DURATION_ISO_8601_TIME_DESIGNATORS | DURATION_ISO_8601_WEEK_PERIOD_DESIGNATOR | DURATION_ISO_8601_PERIOD_DESIGNATORS ( DURATION_ISO_8601_TIME_DESIGNATORS )? );";
            /*       */
        }
        /*       */
    }

    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*  9517 */   static final String[] DFA57_transitionS = new String[]{"\002 \002￿\001 \022￿\001 \001￿\001\031\001￿\001\030\002￿\001\030\005￿\001\026\001\034\001!\001\032\t\037\005￿\001\033\001￿\001\003\001\r\001\f\001\013\001\006\001\002\001\023\001\025\001\007\001\027\001\005\001\t\001\017\001\024\001\021\001\n\001\036\001\022\001\001\001\016\001\b\001\020\001\004\003\036\006￿\001\003\001\r\001\f\001\013\001\006\001\002\001\023\001\025\001\007\001\027\001\005\001\t\001\017\001\024\001\021\001\035\001\036\001\022\001\001\001\016\001\b\001\020\001\004\003\036", "\001#\001￿\001\"\001'\006￿\001&\006￿\001$\001%\r￿\001#\001￿\001\"\001'\006￿\001&\006￿\001$\001%", "\n-\007￿\001,\005-\002￿\001*\002￿\001+\005￿\001(\002￿\001)\013￿\001,\005-\002￿\001*\002￿\001+\005￿\001(\002￿\001)", "\n-\007￿\002-\0014\0012\002-\0015\004￿\0011\001￿\001/\001￿\0010\002￿\001.\001￿\0013\013￿\002-\0014\0012\002-\0015\004￿\0011\001￿\001/\001￿\0010\002￿\001.\001￿\0013", "\0016\0017\b￿\0018\025￿\0016\0017\b￿\0018", "\0019\037￿\0019", "\n-\007￿\006-\007￿\001:\t￿\001;\b￿\006-\007￿\001:\t￿\001;", "\001=\007￿\001<\004￿\001>\022￿\001=\007￿\001<\004￿\001>", "\001A\001￿\001?\002￿\001@\001￿\001B\030￿\001A\001￿\001?\002￿\001@\001￿\001B", "\001E\007￿\001C\005￿\001D\021￿\001E\007￿\001C\005￿\001D", "\nI\007￿\001G\003￿\001F\f￿\001H\001￿\001J\f￿\001G\003￿\001F\f￿\001H", "\n-\007￿\001N\003-\001L\001-\002￿\001K\005￿\001O\002￿\001M\002￿\001P\013￿\001N\003-\001L\001-\002￿\001K\005￿\001O\002￿\001M\002￿\001P", "\n-\007￿\001T\005-\005￿\001U\002￿\001Q\002￿\001R\002￿\001S\013￿\001T\005-\005￿\001U\002￿\001Q\002￿\001R\002￿\001S", "\n-\007￿\001W\003-\001V\001-\002￿\001Y\002￿\001Z\002￿\001[\t￿\001X\007￿\001W\003-\001V\001-\002￿\001Y\002￿\001Z\002￿\001[\t￿\001X", "\001]\003￿\001b\003￿\001_\005￿\001^\002￿\001\\\001￿\001`\001c\003￿\001a\007￿\001]\003￿\001b\003￿\001_\005￿\001^\002￿\001\\\001￿\001`\001c\003￿\001a", "\001d\001f\f￿\001e\021￿\001d\001f\f￿\001e", "\001h\007￿\001g\027￿\001h\007￿\001g", "\001k\007￿\001i\001￿\001l\001￿\001j\023￿\001k\007￿\001i\001￿\001l\001￿\001j", "\001m\t￿\001n\025￿\001m\t￿\001n", "\001o\037￿\001o", "\001r\r￿\001p\005￿\001q\013￿\001r\r￿\001p\005￿\001q", "\001s\037￿\001s", "\001t\002￿\nw\017￿\001v\004￿\001u\001￿\001x\030￿\001v\004￿\001u", "\001y\037￿\001y", "", "\"{\001z￝{", "\001~\001￿\n}\007￿\003\001\001\001\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001\001x\007￿\003\001\001\001\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001\001x;￿\001x", "", "", "\001G\003￿\001F\f￿\001H\016￿\001G\003￿\001F\f￿\001H", "", "\001~\001￿\n}\007￿\003\001\001\001\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x\007￿\003\001\001\001\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x;￿\001x", "", "\001\004￿\001t", "\001\007￿\001\027￿\001\007￿\001", "\001\037￿\001", "\001\r￿\001\t￿\001\007￿\001\r￿\001\t￿\001", "\001\037￿\001", "\001\037￿\001", "\001\037￿\001", "\001\037￿\001", "\001\001￿\001\035￿\001\001￿\001", "\001\001￿\001\035￿\001\001￿\001", "\001\037￿\001", "\n\007￿\006\005￿\001\024￿\006\005￿\001", "\n\007￿\006\032￿\006", "\n\036\007￿\002\036\001\027\036\004￿\001\036\001￿\002\036\001\027\036", "\001\037￿\001", "\001\037￿\001", "\001\007￿\001\027￿\001\007￿\001", "\n\007￿\003\001\002\032￿\003\001\002", "\001\037￿\001", "\n\007￿\002\001\003\032￿\002\001\003", "\001\037￿\001", "\001\037￿\001", "\001 \037￿\001 ", "\001¡\037￿\001¡", "\001¢\037￿\001¢", "\001£\037￿\001£", "\001¤\003￿\001¥\033￿\001¤\003￿\001¥", "\n\036\007￿\003\036\001¨\001ª\001«\002\036\001¬\006\036\001­\002\036\001§\001©\006\036\004￿\001\036\001￿\003\036\001¨\001ª\001«\002\036\001¬\006\036\001­\002\036\001§\001©\006\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001°\037￿\001°", "\001²\003￿\001±\033￿\001²\003￿\001±", "\001³\006￿\001´\030￿\001³\006￿\001´", "\001µ\037￿\001µ", "\001¸\001￿\001¶\005￿\001·\027￿\001¸\001￿\001¶\005￿\001·", "\001¹\037￿\001¹", "\001º\037￿\001º", "\001»\037￿\001»", "\001¼\001½\036￿\001¼\001½", "\001¾\037￿\001¾", "\n¿\n￿\001Ã\b￿\001Â\t￿\001À\001￿\001Á", "\nÄ", "\001Å\037￿\001Å", "\n\007￿\002\001È\002\001É\005￿\001Æ\006￿\001Ç\r￿\002\001È\002\001É\005￿\001Æ\006￿\001Ç", "\001Ê\037￿\001Ê", "\n\007￿\006\r￿\001Ë\f￿\006\r￿\001Ë", "\001Ì\037￿\001Ì", "\001Í\037￿\001Í", "\001Ï\001Ð\001Ñ\006￿\001Î\026￿\001Ï\001Ð\001Ñ\006￿\001Î", "\001Ò\037￿\001Ò", "\001Ó\037￿\001Ó", "\n\007￿\006\005￿\001Õ\006￿\001Ô\r￿\006\005￿\001Õ\006￿\001Ô", "\001Ö\037￿\001Ö", "\n\007￿\006\001×\031￿\006\001×", "\n\007￿\006\r￿\001Ø\f￿\006\r￿\001Ø", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Ú\037￿\001Ú", "\001Û\037￿\001Û", "\001Ü\037￿\001Ü", "\001Þ\013￿\001Ý\023￿\001Þ\013￿\001Ý", "\001ß\037￿\001ß", "\n\036\007￿\n\036\001á\017\036\004￿\001\036\001￿\n\036\001á\017\036", "\001â\001ã\036￿\001â\001ã", "\001ä\037￿\001ä", "\001å\037￿\001å", "\001æ\037￿\001æ", "\001ç\037￿\001ç", "\001é\003￿\001è\033￿\001é\003￿\001è", "\001ê\037￿\001ê", "\001ë\037￿\001ë", "\001ì\037￿\001ì", "\001í\005￿\001î\031￿\001í\005￿\001î", "\n\036\007￿\013\036\001ð\016\036\004￿\001\036\001￿\013\036\001ð\016\036", "\n\036\007￿\003\036\001ò\026\036\004￿\001\036\001￿\003\036\001ò\026\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ô\037￿\001ô", "\001õ\001￿\001ø\003￿\001÷\001￿\001ö\027￿\001õ\001￿\001ø\003￿\001÷\001￿\001ö", "\001ù\037￿\001ù", "\001û\r￿\001ú\021￿\001û\r￿\001ú", "\001þ\005￿\001ü\001ý\001ÿ\027￿\001þ\005￿\001ü\001ý\001ÿ", "\001Ā\037￿\001Ā", "\001ā\037￿\001ā", "\001Ă\037￿\001Ă", "", "", "", "\001~\001￿\nw\n￿\001x\001~\002￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x\n￿\001x\001~\002￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x;￿\001x", "", "\001ă\037￿\001ă", "\001{", "", "", "\001~\001￿\ną\007￿\003\001ć\001Ć\001\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x\007￿\003\001ć\001Ć\001\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x;￿\001x", "", "\001~\001￿\001~\002￿\nĈ\007￿\006\032￿\006", "\nĉ\007￿\006\032￿\006", "", "", "", "\001Ċ\037￿\001Ċ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Č\037￿\001Č", "\001č\037￿\001č", "\001Ď\037￿\001Ď", "\001ď\037￿\001ď", "\001Đ\037￿\001Đ", "\001đ\037￿\001đ", "\001Ē\037￿\001Ē", "\001ē\f￿\001Ĕ\022￿\001ē\f￿\001Ĕ", "\001ĕ\037￿\001ĕ", "\001Ė\037￿\001Ė", "\001ė\037￿\001ė", "\001Ę\037￿\001Ę", "\001ę\037￿\001ę", "\001Ě\037￿\001Ě", "\ně\007￿\006ě\032￿\006ě", "", "\n\036\007￿\b\036\001ĝ\021\036\004￿\001\036\001￿\b\036\001ĝ\021\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ğ\037￿\001ğ", "\001Ġ\037￿\001Ġ", "\n\036\007￿\016\036\001Ģ\013\036\004￿\001\036\001￿\016\036\001Ģ\013\036", "\ně\007￿\006ě\024\036\004￿\001\036\001￿\006ě\024\036", "\001Ĥ\037￿\001Ĥ", "\ně\007￿\004ě\001ĥ\001ě\032￿\004ě\001ĥ\001ě", "\001Ħ\037￿\001Ħ", "\001ħ\037￿\001ħ", "\001Ĩ\037￿\001Ĩ", "\001ĩ\037￿\001ĩ", "\n\036\007￿\022\036\001ī\007\036\004￿\001\036\001￿\022\036\001ī\007\036", "\001Ĭ\037￿\001Ĭ", "\001ĭ\037￿\001ĭ", "\001Į\037￿\001Į", "", "\001į\037￿\001į", "\001İ\037￿\001İ", "\n\036\007￿\004\036\001ĳ\t\036\001Ĳ\013\036\004￿\001\036\001￿\004\036\001ĳ\t\036\001Ĳ\013\036", "\001Ĵ\037￿\001Ĵ", "\001ĵ\037￿\001ĵ", "\001Ķ\037￿\001Ķ", "\001ķ\037￿\001ķ", "", "", "\001ĸ\037￿\001ĸ", "\001Ĺ\037￿\001Ĺ", "\n\036\007￿\021\036\001Ļ\b\036\004￿\001\036\001￿\021\036\001Ļ\b\036", "\001ļ\037￿\001ļ", "\001Ľ\037￿\001Ľ", "\001ľ\037￿\001ľ", "\001Ŀ\037￿\001Ŀ", "\001ŀ\037￿\001ŀ", "\001Ł\037￿\001Ł", "\001ł\037￿\001ł", "\001Ń\037￿\001Ń", "\n\036\007￿\f\036\001Ņ\r\036\004￿\001\036\001￿\f\036\001Ņ\r\036", "\001ņ\037￿\001ņ", "\001Ň\037￿\001Ň", "\001ň\037￿\001ň", "\nŉ\n￿\001Ã\b￿\001Â\t￿\001À\001￿\001Á", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\nŊ\007￿\023\036\001ŋ\006\036\004￿\001\036\001￿\032\036", "\nŌ\007￿\023\036\001ŋ\006\036\004￿\001\036\001￿\032\036", "\n\036\007￿\023\036\001ŋ\006\036\004￿\001\036\001￿\032\036", "\nÄ\016￿\001ō\004￿\001Ŏ\005￿\001ŏ", "\001Ő\037￿\001Ő", "\001ő\037￿\001ő", "\001Œ\037￿\001Œ", "\ně\007￿\006ě\002￿\001œ\027￿\006ě\002￿\001œ", "\ně\007￿\001Ŕ\005ě\032￿\001Ŕ\005ě", "\001ŕ\037￿\001ŕ", "\001Ŗ\003￿\001ŗ\033￿\001Ŗ\003￿\001ŗ", "\001Ř\037￿\001Ř", "\001ř\037￿\001ř", "\001Ś\037￿\001Ś", "\001ś\037￿\001ś", "\001Ŝ\037￿\001Ŝ", "\001ŝ\037￿\001ŝ", "\001Ş\037￿\001Ş", "\001ş\037￿\001ş", "\001Š\037￿\001Š", "\001š\037￿\001š", "\001Ţ\037￿\001Ţ", "\001ţ\037￿\001ţ", "\001Ť\037￿\001Ť", "", "\001ť\037￿\001ť", "\001Ŧ\037￿\001Ŧ", "\001ŧ\037￿\001ŧ", "\001ũ\b￿\001Ũ\026￿\001ũ\b￿\001Ũ", "\001Ū\037￿\001Ū", "\001ū\037￿\001ū", "", "\001Ŭ\037￿\001Ŭ", "\001ŭ\037￿\001ŭ", "\001Ů\037￿\001Ů", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Ű\037￿\001Ű", "\001ű\037￿\001ű", "\001Ų\037￿\001Ų", "\001ų\037￿\001ų", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ŵ\037￿\001ŵ", "\001Ŷ\037￿\001Ŷ", "\001ŷ\037￿\001ŷ", "\001Ÿ\037￿\001Ÿ", "\001Ź\005￿\001ź\031￿\001Ź\005￿\001ź", "", "\001Ż\037￿\001Ż", "", "\001ż\037￿\001ż", "", "\001Ž\037￿\001Ž", "\001ž\037￿\001ž", "\001ſ\037￿\001ſ", "\001ƀ\037￿\001ƀ", "\001Ɓ\037￿\001Ɓ", "\001Ƃ\037￿\001Ƃ", "\001ƃ\037￿\001ƃ", "\001Ƅ\037￿\001Ƅ", "\001ƅ\037￿\001ƅ", "\001Ɔ\037￿\001Ɔ", "\001Ƈ\037￿\001Ƈ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Ɖ\037￿\001Ɖ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Ƌ\037￿\001Ƌ", "\001ƌ\037￿\001ƌ", "", "\001~\001￿\nƍ\007￿\003\001Ə\001Ǝ\001\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x\007￿\003\001Ə\001Ǝ\001\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x;￿\001x", "\001~\001￿\001~\002￿\nƐ\007￿\006\032￿\006", "\nƑ\007￿\006\032￿\006", "\nƐ\007￿\006\032￿\006", "\nƑ\007￿\003\001ƒ\002\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x\007￿\003\001ƒ\002\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x;￿\001x", "\001Ɠ\037￿\001Ɠ", "", "\001Ɣ\037￿\001Ɣ", "\001ƕ\037￿\001ƕ", "\001Ɩ\037￿\001Ɩ", "\001Ɨ\037￿\001Ɨ", "\001Ƙ\037￿\001Ƙ", "\001ƙ\037￿\001ƙ", "\001ƚ\037￿\001ƚ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Ɯ\037￿\001Ɯ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ƞ\037￿\001ƞ", "\001Ɵ\037￿\001Ɵ", "\001Ơ\037￿\001Ơ", "\001ơ\037￿\001ơ", "\001Ƣ\037￿\001Ƣ", "\nƣ\007￿\006ƣ\032￿\006ƣ", "", "\001Ƥ\037￿\001Ƥ", "", "\001ƥ\037￿\001ƥ", "\001Ʀ\037￿\001Ʀ", "", "\001Ƨ\037￿\001Ƨ", "", "\001ƨ\037￿\001ƨ", "\nƣ\007￿\006ƣ\f￿\001Ʃ\r￿\006ƣ\f￿\001Ʃ", "\001ƪ\037￿\001ƪ", "\001ƫ\037￿\001ƫ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ƭ\037￿\001ƭ", "", "\n\036\007￿\017\036\001Ư\n\036\004￿\001\036\001￿\017\036\001Ư\n\036", "\001ư\037￿\001ư", "\001Ʊ\037￿\001Ʊ", "\001Ʋ\037￿\001Ʋ", "\001Ƴ\037￿\001Ƴ", "\001ƴ\037￿\001ƴ", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ƶ\037￿\001ƶ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Ƹ\037￿\001Ƹ", "\001ƹ\037￿\001ƹ", "\001ƺ\037￿\001ƺ", "\001ƻ\037￿\001ƻ", "\001Ƽ\037￿\001Ƽ", "", "\n\036\007￿\022\036\001ƾ\007\036\004￿\001\036\001￿\022\036\001ƾ\007\036", "\001ƿ\037￿\001ƿ", "\001ǀ\037￿\001ǀ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ǂ\037￿\001ǂ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ǅ\037￿\001ǅ", "\001ǆ\037￿\001ǆ", "", "\001Ǉ\037￿\001Ǉ", "\001ǈ\037￿\001ǈ", "\001ǉ\037￿\001ǉ", "\001Ǌ\037￿\001Ǌ", "\nǋ\n￿\001Ã\b￿\001Â\t￿\001À\001￿\001Á", "\nŊ\n￿\001Ǎ\b￿\001ǌ", "\nǎ", "\nŌ\n￿\001Ǐ", "\nǐ\007￿\032\036\004￿\001\036\001￿\032\036", "\nǑ\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ǒ\037￿\001ǒ", "\001Ǔ\037￿\001Ǔ", "\n\036\007￿\021\036\001Ǖ\b\036\004￿\001\036\001￿\021\036\001Ǖ\b\036", "\001ǖ\037￿\001ǖ", "\nƣ\007￿\006ƣ\016￿\001Ǘ\013￿\006ƣ\016￿\001Ǘ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Ǚ\037￿\001Ǚ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Ǜ\037￿\001Ǜ", "\001ǜ\037￿\001ǜ", "\001ǝ\037￿\001ǝ", "\001Ǟ\037￿\001Ǟ", "\001ǟ\037￿\001ǟ", "\001Ǡ\037￿\001Ǡ", "\001ǡ\037￿\001ǡ", "\001Ǣ\037￿\001Ǣ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Ǥ\037￿\001Ǥ", "\001ǥ\037￿\001ǥ", "\001Ǧ\037￿\001Ǧ", "\001ǧ\037￿\001ǧ", "\001Ǩ\037￿\001Ǩ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Ǫ\037￿\001Ǫ", "\001ǫ\037￿\001ǫ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ǭ\037￿\001ǭ", "\001Ǯ\037￿\001Ǯ", "\001ǯ\037￿\001ǯ", "\n\036\007￿\022\036\001Ǳ\001\036\001ǲ\005\036\004￿\001\036\001￿\022\036\001Ǳ\001\036\001ǲ\005\036", "\001ǳ\037￿\001ǳ", "", "\n\036\007￿\022\036\001ǵ\007\036\004￿\001\036\001￿\022\036\001ǵ\007\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Ƿ\037￿\001Ƿ", "\001Ǹ\037￿\001Ǹ", "", "\001ǹ\037￿\001ǹ", "\001Ǻ\037￿\001Ǻ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Ǽ\037￿\001Ǽ", "\001ǽ\037￿\001ǽ", "\001Ǿ\037￿\001Ǿ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Ȁ\037￿\001Ȁ", "\001ȁ\037￿\001ȁ", "\001Ȃ\037￿\001Ȃ", "\001ȃ\037￿\001ȃ", "\001Ȅ\037￿\001Ȅ", "\001ȅ\037￿\001ȅ", "\n\036\007￿\022\036\001ȇ\007\036\004￿\001\036\001￿\022\036\001ȇ\007\036", "\001Ȉ\037￿\001Ȉ", "\001ȉ\037￿\001ȉ", "\001Ȋ\037￿\001Ȋ", "\001ȋ\037￿\001ȋ", "\001Ȍ\037￿\001Ȍ", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001Ȏ\037￿\001Ȏ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001~\001￿\nȐ\007￿\003\001Ȓ\001ȑ\001\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x\007￿\003\001Ȓ\001ȑ\001\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x;￿\001x", "\001~\001￿\001~\002￿\nȓ\007￿\006\032￿\006", "\nȔ\007￿\006\032￿\006", "\nȓ\007￿\006\032￿\006", "\nȔ\007￿\003\001ȕ\002\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x\007￿\003\001ȕ\002\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x;￿\001x", "\nȔ\007￿\006\032￿\006", "\001Ȗ\037￿\001Ȗ", "\001ȗ\037￿\001ȗ", "\001Ș\037￿\001Ș", "\001ș\037￿\001ș", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ț\037￿\001ț", "\001Ȝ\037￿\001Ȝ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001Ȟ\037￿\001Ȟ", "", "\001ȟ\037￿\001ȟ", "\001Ƞ\037￿\001Ƞ", "\001ȡ\037￿\001ȡ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\nȣ\007￿\006ȣ\032￿\006ȣ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Ȩ\037￿\001Ȩ", "\001ȩ\037￿\001ȩ", "\001Ȫ\037￿\001Ȫ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001Ȭ\037￿\001Ȭ", "", "\001ȭ\037￿\001ȭ", "\001Ȯ\037￿\001Ȯ", "\001ȯ\037￿\001ȯ", "\001Ȱ\037￿\001Ȱ", "\001ȱ\037￿\001ȱ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001ȳ\037￿\001ȳ", "", "\001ȴ\037￿\001ȴ", "\001ȵ\037￿\001ȵ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ȷ\037￿\001ȷ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Ⱥ\037￿\001Ⱥ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001Ⱦ\037￿\001Ⱦ", "\001ȿ\037￿\001ȿ", "\001ɀ\037￿\001ɀ", "\001Ɂ\037￿\001Ɂ", "\001ɂ\037￿\001ɂ", "\001x\002￿\nɃ\n￿\001Ã\b￿\001Â\t￿\001À\001￿\001Á", "\nɄ\007￿\023\036\001ŋ\006\036\004￿\001\036\001￿\032\036", "\n\036\007￿\023\036\001ŋ\006\036\004￿\001\036\001￿\032\036", "\nǎ\016￿\001Ʌ\004￿\001Ɇ\005￿\001ɇ", "\n\036\007￿\023\036\001ŋ\006\036\004￿\001\036\001￿\032\036", "\nǐ\023￿\001Ɉ\005￿\001ɉ", "\nǑ\031￿\001Ɋ", "\001ɋ\037￿\001ɋ", "\001Ɍ\037￿\001Ɍ", "", "\001ɍ\037￿\001ɍ", "\001Ɏ\037￿\001Ɏ", "\001ɏ\037￿\001ɏ", "", "\001ɐ\037￿\001ɐ", "", "\001ɑ\037￿\001ɑ", "\001ɒ\037￿\001ɒ", "\n\036\007￿\004\036\001ɔ\025\036\004￿\001\036\001￿\004\036\001ɔ\025\036", "\001ɕ\037￿\001ɕ", "\001ɖ\037￿\001ɖ", "\001ɗ\037￿\001ɗ", "\001ɘ\037￿\001ɘ", "\001ə\037￿\001ə", "", "\001ɚ\037￿\001ɚ", "\001ɛ\037￿\001ɛ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ɞ\037￿\001ɞ", "", "\001ɟ\037￿\001ɟ", "\001ɠ\037￿\001ɠ", "", "\001ɡ\037￿\001ɡ", "\n\036\007￿\022\036\001ɣ\007\036\004￿\001\036\001￿\022\036\001ɣ\007\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001ɥ\037￿\001ɥ", "\001ɦ\037￿\001ɦ", "\001ɧ\037￿\001ɧ", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ɪ\037￿\001ɪ", "\001ɫ\037￿\001ɫ", "\n\036\007￿\022\036\001ɭ\007\036\004￿\001\036\001￿\022\036\001ɭ\007\036", "", "\001ɮ\037￿\001ɮ", "\001ɯ\037￿\001ɯ", "\001ɰ\037￿\001ɰ", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ɲ\037￿\001ɲ", "\001ɳ\037￿\001ɳ", "\001ɴ\037￿\001ɴ", "\001ɵ\037￿\001ɵ", "\001ɶ\037￿\001ɶ", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ɺ\037￿\001ɺ", "\001ɻ\037￿\001ɻ", "\001ɼ\037￿\001ɼ", "", "\001ɽ\037￿\001ɽ", "", "\001~\001￿\nɾ\007￿\003\001ʀ\001ɿ\001\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x\007￿\003\001ʀ\001ɿ\001\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x;￿\001x", "\001~\001￿\001~\002￿\nʁ\007￿\006\032￿\006", "\nʂ\007￿\006\032￿\006", "\nʁ\007￿\006\032￿\006", "\nʂ\007￿\003\001ʃ\002\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x\007￿\003\001ʃ\002\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x;￿\001x", "\nʂ\007￿\006\032￿\006", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ʆ\037￿\001ʆ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001ʈ\037￿\001ʈ", "\001ʉ\037￿\001ʉ", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ʋ\037￿\001ʋ", "\001ʌ\037￿\001ʌ", "\001ʍ\037￿\001ʍ", "", "\nʎ\007￿\006ʎ\032￿\006ʎ", "", "", "", "", "\001ʏ\037￿\001ʏ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ʑ\037￿\001ʑ", "", "\001ʒ\037￿\001ʒ", "\001ʓ\037￿\001ʓ", "\001ʔ\037￿\001ʔ", "\001ʕ\037￿\001ʕ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001ʘ\037￿\001ʘ", "\001ʙ\037￿\001ʙ", "\001ʚ\037￿\001ʚ", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "", "\001ʜ\037￿\001ʜ", "", "", "", "\001ʝ\037￿\001ʝ", "\001ʞ\037￿\001ʞ", "\001ʟ\037￿\001ʟ", "\001ʠ\037￿\001ʠ", "\001ʡ\037￿\001ʡ", "\nɃ\n￿\001Ã\b￿\001Â\t￿\001À\001￿\001Á", "\nɄ\n￿\001Ǎ", "\nʢ\007￿\032\036\004￿\001\036\001￿\032\036", "\nʣ\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\nʤ\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ʥ\037￿\001ʥ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ʧ\037￿\001ʧ", "\001ʨ\037￿\001ʨ", "\001ʩ\037￿\001ʩ", "\001ʪ\037￿\001ʪ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ʬ\037￿\001ʬ", "", "\001ʭ\037￿\001ʭ", "\001ʮ\037￿\001ʮ", "\001ʯ\037￿\001ʯ", "\001ʰ\037￿\001ʰ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ʴ\037￿\001ʴ", "", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ʶ\037￿\001ʶ", "\001ʷ\037￿\001ʷ", "\001ʸ\037￿\001ʸ", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001ʺ\037￿\001ʺ", "\001ʻ\037￿\001ʻ", "\001ʼ\037￿\001ʼ", "", "", "\001ʽ\037￿\001ʽ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ˁ\037￿\001ˁ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001˃\037￿\001˃", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001ˆ\037￿\001ˆ", "\001ˇ\037￿\001ˇ", "", "", "", "\001ˈ\037￿\001ˈ", "\001ˉ\037￿\001ˉ", "\001ˊ\037￿\001ˊ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001~\001￿\nˌ\007￿\003\001ˎ\001ˍ\001\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x\007￿\003\001ˎ\001ˍ\001\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x;￿\001x", "\001~\001￿\001~\002￿\nˏ\007￿\006\032￿\006", "\nː\007￿\006\032￿\006", "\nˏ\007￿\006\032￿\006", "\nː\007￿\003\001ˑ\002\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x\007￿\003\001ˑ\002\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x;￿\001x", "\nː\007￿\006\032￿\006", "", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001˓\037￿\001˓", "\001˔\037￿\001˔", "", "\001˕\037￿\001˕", "\001˖\037￿\001˖", "\001˗\037￿\001˗", "\n˘\007￿\006˘\032￿\006˘", "\001˙\037￿\001˙", "", "\001˚\037￿\001˚", "\001˛\037￿\001˛", "\001˜\037￿\001˜", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "", "\001˟\037￿\001˟", "\001ˠ\037￿\001ˠ", "\001ˡ\037￿\001ˡ", "", "\001ˢ\037￿\001ˢ", "\001ˣ\037￿\001ˣ", "\001ˤ\037￿\001ˤ", "\001˥\037￿\001˥", "\001˦\037￿\001˦", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\nʢ\023￿\001˨\005￿\001˩", "\nʣ\031￿\001˪", "\nʤ\031￿\001ɉ", "\001˫\037￿\001˫", "", "\001ˬ\037￿\001ˬ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001˯\037￿\001˯", "", "\001˰\037￿\001˰", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001˲\037￿\001˲", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001˴\037￿\001˴", "", "", "", "\n\036\007￿\b\036\001˶\021\036\004￿\001\036\001￿\b\036\001˶\021\036", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001˸\037￿\001˸", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001˺\037￿\001˺", "\001˻\037￿\001˻", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001˽\037￿\001˽", "", "", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001̂\037￿\001̂", "\001̃\037￿\001̃", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001~\001￿\n̅\007￿\003\001̇\001̆\001\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x\007￿\003\001̇\001̆\001\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x;￿\001x", "\001~\001￿\001~\002￿\n̈\007￿\006\032￿\006", "\n̉\007￿\006\032￿\006", "\n̈\007￿\006\032￿\006", "\n̉\007￿\003\001̊\002\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x\007￿\003\001̊\002\001￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x;￿\001x", "\n̉\007￿\006\032￿\006", "", "\001̋\037￿\001̋", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\022\036\001̎\007\036\004￿\001\036\001￿\022\036\001̎\007\036", "\001̏\037￿\001̏", "\001̐\037￿\001̐", "\001", "\001̑\037￿\001̑", "\001̒\037￿\001̒", "\001̓\037￿\001̓", "\n\036\007￿\022\036\001̕\007\036\004￿\001\036\001￿\022\036\001̕\007\036", "", "", "\001̖\037￿\001̖", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001̛\037￿\001̛", "\001̜\037￿\001̜", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\n̞\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "", "\001̡\037￿\001̡", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001̣\037￿\001̣", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001̥\037￿\001̥", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001̧\037￿\001̧", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001̩\037￿\001̩", "", "", "", "", "\001̪\037￿\001̪", "\001̫\037￿\001̫", "", "\001\001~\001￿\nw\n￿\001x\001~\002￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x\n￿\001x\001~\002￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x;￿\001x", "\001~\001￿\001̬\002￿\n~", "\001", "\001", "\001\002￿\nx\n￿\001x\003￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x\n￿\001x\003￿\001x\004￿\002x\004￿\001x\001￿\001x\001￿\001x\001￿\001x;￿\001x", "\001", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\022\036\001̳\007\036\004￿\001\036\001￿\022\036\001̳\007\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "", "", "", "\001̷\037￿\001̷", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\n̞\031￿\001˩", "", "", "\001̹\037￿\001̹", "", "\001̺\037￿\001̺", "", "\001̻\037￿\001̻", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001̽\037￿\001̽", "\001̾\037￿\001̾", "\001̿\037￿\001̿", "\ǹ\007￿\006\032￿\006", "", "", "", "", "", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "", "", "\n\036\007￿\022\036\001̓\007\036\004￿\001\036\001￿\022\036\001̓\007\036", "", "\001̈́\037￿\001̈́", "\001ͅ\037￿\001ͅ", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "\001͇\037￿\001͇", "\001͈\037￿\001͈", "\001͉\037￿\001͉", "\n͊\007￿\006\032￿\006", "", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001͎\017￿\001͍\017￿\001͎\017￿\001͍", "", "\001͏\037￿\001͏", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\n͒\007￿\006\032￿\006", "", "", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "\001͓\037￿\001͓", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036", "", "", "\n͕\007￿\006\032￿\006", "\001͖\037￿\001͖", "", "\001", "\n\036\007￿\032\036\004￿\001\036\001￿\032\036"};
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /*       */
    /* 10506 */   static final short[] DFA57_eot = DFA.unpackEncodedString("\001￿\025\036\001￿\001\036\002￿\001|\002￿\001\036\001￿\001|\002￿\f\036\001\r\036\001¦\001®\001¯\031\036\001Ù\005\036\001à\n\036\001ï\001ñ\001ó\b\036\003￿\001|\001￿\001\036\001Ą\002￿\001|\002￿\001x\003￿\001\036\001ċ\017\036\001￿\001Ĝ\001Ğ\002\036\001ġ\001ģ\006\036\001Ī\003\036\001￿\002\036\001ı\004\036\002￿\002\036\001ĺ\b\036\001ń\004\036\004x\025\036\001￿\006\036\001￿\003\036\001ů\004\036\001Ŵ\005\036\001￿\001\036\001￿\001\036\001￿\013\036\001ƈ\001\036\001Ɗ\002\036\001￿\001|\001￿\001x\001~\001￿\001\036\001￿\007\036\001ƛ\001\036\001Ɲ\006\036\001￿\001\036\001￿\002\036\001￿\001\036\001￿\004\036\001Ƭ\001\036\001￿\001Ʈ\005\036\001￿\001Ƶ\001\036\001Ʒ\005\036\001￿\001ƽ\002\036\001ǁ\001\036\001ǃ\001Ǆ\002\036\001￿\b\036\003x\002\036\001ǔ\002\036\001ǘ\001\036\001ǚ\b\036\001ǣ\005\036\001ǩ\002\036\001Ǭ\003\036\001ǰ\001\036\001￿\001Ǵ\001Ƕ\002\036\001￿\002\036\001ǻ\003\036\001ǿ\006\036\001Ȇ\005\036\001￿\001ȍ\001￿\001\036\001ȏ\001|\001￿\001x\001~\001￿\001x\004\036\001Ț\002\036\001ȝ\001￿\001\036\001￿\003\036\001Ȣ\001Ǭ\001\036\001Ȥ\001ȥ\001Ȧ\001ȧ\003\036\001ȫ\001￿\001\036\001￿\005\036\001Ȳ\001￿\001\036\001￿\002\036\001ȶ\001\036\001ȸ\001￿\001ȹ\001\036\001Ȼ\001￿\001ȼ\002￿\001Ƚ\006\036\002x\001\036\001x\004\036\001￿\003\036\001￿\001\036\001￿\002\036\001ɓ\005\036\001￿\002\036\001ɜ\001ɝ\001\036\001￿\002\036\001￿\001\036\001ɢ\001ɤ\001￿\003\036\001￿\001ɨ\001￿\001ɩ\002\036\001ɬ\001￿\003\036\001￿\001ɱ\005\036\001￿\001ɷ\001ɸ\001ɹ\003\036\001￿\001\036\001￿\001|\001￿\001x\001~\001￿\001x\001ʄ\001ʅ\001\036\001ʇ\001￿\002\036\001￿\001ʊ\003\036\001￿\001\036\004￿\001\036\001ʐ\001\036\001￿\004\036\001ʖ\001ʗ\001￿\003\036\001￿\001ʛ\002￿\001\036\003￿\007\036\006x\001\036\001ʦ\004\036\001ʫ\001\036\001￿\004\036\001ʱ\001ʲ\001ʳ\001\036\002￿\001ʵ\003\036\001￿\001ʹ\001￿\003\036\002￿\001\036\001ʾ\001￿\001ʿ\001ˀ\001\036\001˂\001￿\001\036\001˄\001˅\002\036\003￿\003\036\001ˋ\001|\001￿\001x\001~\001￿\001x\002￿\001˒\001￿\002\036\001￿\005\036\001￿\003\036\001˝\001˞\002￿\003\036\001￿\005\036\001˧\004\036\001￿\001\036\001˭\001ˮ\001\036\001￿\001\036\001˱\001\036\001˳\001\036\003￿\001˵\001￿\001˷\001\036\001˹\001￿\002\036\001˼\001\036\003￿\001˾\001￿\001˿\002￿\001̀\001́\002\036\001̄\001￿\001|\001￿\001x\001~\001￿\001x\001￿\001\036\001̌\001̍\006\036\001̔\002￿\001\036\001̗\001̘\001̙\001̚\002\036\001̝\001￿\003x\001̟\001̠\002￿\001\036\001̢\001￿\001\036\001￿\001̤\001￿\001\036\001￿\001̦\001￿\001\036\001̨\001￿\001\036\004￿\002\036\001￿\001|\001￿\001x\001~\001￿\001x\001̭\002￿\001̮\001̯\001̰\001̱\001̲\001̴\001￿\001̵\001̶\004￿\001\036\001̸\001￿\001\036\002￿\001\036\001￿\001\036\001￿\001\036\001￿\001̼\001￿\003\036\007￿\001́\003￿\001͂\001￿\002\036\001͆\001￿\003\036\001~\002￿\001͋\001͌\001\036\001￿\001\036\001͐\001͑\001~\002￿\001ɢ\001\036\001͔\002￿\001~\001\036\001￿\001~\001ʹ");
    /* 10507 */   static final short[] DFA57_eof = DFA.unpackEncodedString("͗￿");
    /* 10508 */   static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars("\001\t\001C\0020\001H\001E\0010\001F\001N\001A\0040\003A\001F\001E\001R\002A\001-\001S\001￿\001\000\001.\002￿\001A\001￿\001.\001￿\001*\001L\001H\001A\001P\001A\001U\001O\002L\001O\0030\001D\001P\001L\0010\001T\0010\001G\001E\001T\001I\001Y\001T\001E\0030\001D\001E\001L\001I\001K\001G\001N\002R\001I\0020\001S\0010\001O\0010\001U\001R\001L\001E\001S\0010\001U\0030\001G\002O\001I\001B\0010\001M\001L\001P\001X\002P\001D\002E\001L\0030\001T\001N\001L\001A\002L\001N\001S\003￿\001.\001￿\001O\001\"\002￿\001.\001￿\001+\0010\003￿\001E\0010\001E\001R\001T\001P\001E\001L\001N\001M\001L\001C\001T\002A\001S\0010\001￿\0020\001L\001E\0020\001H\0010\002R\001H\001T\0010\001R\001C\001S\001￿\002E\0010\001T\001I\001T\001U\002￿\001A\001N\0010\001O\001E\001D\001I\001T\001E\001I\001G\0010\001T\001S\001M\0060\001T\001E\001C\0020\001P\001A\001B\001A\001N\001U\001P\001T\001A\002T\001L\001S\001I\001C\001￿\001I\001B\001L\001E\001G\001L\001￿\002E\001Y\0010\001E\001T\001L\001E\0010\001I\001A\001W\001U\001C\001￿\001Y\001￿\001E\001￿\001I\001A\001O\001U\001L\001E\001U\001N\001E\001U\001O\0010\001L\0010\001H\001N\001￿\001.\001+\0030\001C\001￿\001M\001A\001I\001E\001R\001L\001C\0010\001E\0010\001T\001E\001L\001T\001E\0010\001￿\001I\001￿\001Y\001R\001￿\001W\001￿\001O\0010\002E\0010\001E\001￿\0010\001I\001U\001T\001R\001X\001￿\0010\001R\0010\001N\001C\002T\001G\001￿\0010\001G\001T\0010\001T\0020\001N\001U\001￿\002I\001W\001A\0070\001I\001T\0010\001M\0020\001C\0010\001L\002T\001M\002A\001T\001O\0010\001E\001T\001N\001H\001N\0010\001E\001C\0010\001G\001E\001N\0010\001I\001￿\0020\001E\001R\001￿\001F\001N\0010\001E\001H\001N\0010\001R\001O\001M\001K\001R\001A\0010\001P\001T\001C\001P\001G\001￿\0010\001￿\001E\0010\001.\001+\0040\001T\001A\001G\001C\0010\001U\001I\0010\001￿\001N\001￿\001I\001R\001F\0070\001R\001S\001G\0010\001￿\001T\001￿\001A\001E\001T\001S\001T\0010\001￿\001N\001￿\001I\001O\0010\001E\0010\001￿\0010\001G\0010\001￿\0010\002￿\0010\001A\001S\001T\001O\001R\001-\0060\001N\001E\001￿\001I\001A\001L\001￿\001E\001￿\001E\001I\0010\001N\001C\001I\001E\001M\001￿\001D\001E\0020\001T\001￿\002A\001￿\001E\0020\001￿\001T\001U\001N\001￿\0010\001￿\0010\001I\001Y\0010\001￿\001S\001A\001T\001￿\0010\001N\002E\001N\001C\001￿\0030\001U\001E\001I\001￿\001D\001￿\001.\001+\0060\001E\0010\001￿\001S\001N\001￿\0010\001O\001I\001U\001￿\0010\004￿\001I\0010\001A\001￿\001I\001C\001S\001E\0020\001￿\001A\001T\001N\001￿\0010\002￿\001E\003￿\001G\001S\001I\001R\001Y\b0\001C\0010\001B\001L\001T\001N\0010\001O\001￿\001R\001F\001T\001N\0030\001R\002￿\0010\001N\001T\001R\001￿\0010\001￿\001A\001I\001T\002￿\001A\0010\001￿\0020\001R\0010\001￿\001S\0020\001S\001E\003￿\002R\001N\0010\001.\001+\0040\002￿\0010\001￿\001E\001T\001￿\003N\0010\001Z\001￿\001T\001M\001E\0020\002￿\001L\001Y\001D\001￿\001D\001E\001I\001O\001D\0040\001T\001￿\001E\0020\001T\001￿\001N\0010\001A\0010\001S\003￿\0010\001￿\0010\001E\0010\001￿\001M\001D\0010\001L\003￿\0010\001￿\0010\002￿\0020\001S\001U\0010\001￿\001.\001+\0040\001￿\001R\0020\001G\001C\001-\003E\0010\002￿\001S\0040\001O\001N\0010\001￿\0050\002￿\001E\0010\001￿\001M\001￿\0010\001￿\001N\001￿\0010\001￿\001P\0010\001￿\001I\004￿\001I\001S\001￿\001-\001+\004-\0010\002￿\0060\001￿\0020\004￿\001N\0010\001￿\0010\002￿\001R\001￿\001I\001￿\001G\001￿\0010\001￿\001Z\001V\001E\0010\006￿\0010\003￿\0010\001￿\001S\001L\0010\001￿\002E\001R\0010\002￿\0020\001I\001￿\001D\0030\002￿\0010\001E\0010\002￿\0010\001S\001￿\001-\0010");
    /* 10509 */   static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars("\001z\003u\001r\001e\001x\001s\001u\001o\001r\002u\002y\001o\001i\001r\001o\001r\001u\001a\001n\001s\001￿\001￿\001µ\002￿\001r\001￿\001µ\001￿\001/\001t\001h\001y\001p\001a\001u\001o\002n\001o\001l\001f\001z\001d\001p\001t\001f\001t\001f\001g\001e\001t\001i\001y\001t\001i\003z\001d\001i\001s\001i\001s\001g\001n\001r\001s\001i\001Y\0019\002s\001o\001t\001u\001r\001u\001e\002s\001u\001g\001t\001z\001g\002o\001u\001b\001z\001n\001l\001p\001x\001p\001t\001d\002e\001r\003z\001t\001v\001l\001o\001t\001l\001n\001s\003￿\001µ\001￿\001o\001\"\002￿\001µ\001￿\002f\003￿\001e\001z\001e\001r\001t\001p\001e\001l\001n\001z\001l\001c\001t\002a\001s\001f\001￿\002z\001l\001e\002z\001h\001f\002r\001h\001t\001z\001r\001c\001s\001￿\002e\001z\001t\001i\001t\001u\002￿\001a\001n\001z\001o\001e\001d\001i\001t\001e\001i\001g\001z\001t\001s\001m\001Y\004z\001S\001t\001e\001c\001i\001f\001p\001e\001b\001a\001n\001u\001p\001t\001a\002t\001l\001s\001i\001c\001￿\001i\001b\001l\001n\001g\001l\001￿\002e\001y\001z\001e\001t\001l\001e\001z\001i\001a\001w\001u\001i\001￿\001y\001￿\001e\001￿\001i\001a\001o\001u\001l\001e\001u\001n\001e\001u\001o\001z\001l\001z\001h\001n\001￿\001µ\003f\001µ\001c\001￿\001m\001a\001i\001e\001r\001l\001c\001z\001e\001z\001t\001e\001l\001t\001e\001f\001￿\001i\001￿\001y\001r\001￿\001w\001￿\001o\001s\002e\001z\001e\001￿\001z\001i\001u\001t\001r\001x\001￿\001z\001r\001z\001n\001c\002t\001g\001￿\001z\001g\001t\001z\001t\002z\001n\001u\001￿\002i\001w\001a\001Y\001M\0019\001D\003z\001i\001t\001z\001m\001u\001z\001c\001z\001l\002t\001m\002a\001t\001o\001z\001e\001t\001n\001h\001n\001z\001e\001c\001z\001g\001e\001n\001z\001i\001￿\002z\001e\001r\001￿\001f\001n\001z\001e\001h\001n\001z\001r\001o\001m\001k\001r\001a\001z\001p\001t\001c\001p\001g\001￿\001z\001￿\001e\001z\001µ\003f\001µ\001f\001t\001a\001g\001c\001z\001u\001i\001z\001￿\001n\001￿\001i\001r\001f\002z\001f\004z\001r\001s\001g\001z\001￿\001t\001￿\001a\001e\001t\001s\001t\001z\001￿\001n\001￿\001i\001o\001z\001e\001z\001￿\001z\001g\001z\001￿\001z\002￿\001z\001a\001s\001t\001o\001r\001Y\002z\001S\001z\002S\001n\001e\001￿\001i\001a\001l\001￿\001e\001￿\001e\001i\001z\001n\001c\001i\001e\001m\001￿\001d\001e\002z\001t\001￿\002a\001￿\001e\002z\001￿\001t\001u\001n\001￿\001z\001￿\001z\001i\001y\001z\001￿\001s\001a\001t\001￿\001z\001n\002e\001n\001c\001￿\003z\001u\001e\001i\001￿\001d\001￿\001µ\003f\001µ\001f\002z\001e\001z\001￿\001s\001n\001￿\001z\001o\001i\001u\001￿\001f\004￿\001i\001z\001a\001￿\001i\001c\001s\001e\002z\001￿\001a\001t\001n\001￿\001z\002￿\001e\003￿\001g\001s\001i\001r\001y\001Y\001D\006z\001c\001z\001b\001l\001t\001n\001z\001o\001￿\001r\001f\001t\001n\003z\001r\002￿\001z\001n\001t\001r\001￿\001z\001￿\001a\001i\001t\002￿\001a\001z\001￿\002z\001r\001z\001￿\001s\002z\001s\001e\003￿\002r\001n\001z\001µ\003f\001µ\001f\002￿\001z\001￿\001e\001t\001￿\003n\001f\001z\001￿\001t\001m\001e\002z\002￿\001l\001y\001d\001￿\001d\001e\001i\001o\001d\001z\003S\001t\001￿\001e\002z\001t\001￿\001n\001z\001a\001z\001s\003￿\001z\001￿\001z\001e\001z\001￿\001m\001d\001z\001l\003￿\001z\001￿\001z\002￿\002z\001s\001u\001z\001￿\001µ\003f\001µ\001f\001￿\001r\002z\001g\001c\001-\003e\001z\002￿\001s\004z\001o\001n\001z\001￿\005z\002￿\001e\001z\001￿\001m\001￿\001z\001￿\001n\001￿\001z\001￿\001p\001z\001￿\001i\004￿\001i\001s\001￿\001µ\0019\002-\001µ\001-\001z\002￿\006z\001￿\002z\004￿\001n\001z\001￿\001S\002￿\001r\001￿\001i\001￿\001g\001￿\001z\001￿\001z\001v\001e\001f\006￿\001z\003￿\001z\001￿\001s\001l\001z\001￿\002e\001r\001f\002￿\002z\001y\001￿\001d\002z\001f\002￿\001z\001e\001z\002￿\001f\001s\001￿\001-\001z");
    /* 10510 */   static final short[] DFA57_accept = DFA.unpackEncodedString("\030￿\001\002￿\001\001\001￿\001\001￿\001S￿\001 \001z\001|\001￿\001\002￿\001\001\001￿\001\002￿\001\001\001¡\021￿\001\003\020￿\001\033\007￿\001<\001=)￿\0017\006￿\001'\016￿\001&\001￿\001\001￿\001G\020￿\001\006￿\001\024\020￿\0018\001￿\001\005\002￿\001D\001￿\0011\006￿\001\006\006￿\001h\b￿\001\021\t￿\001\016*￿\001-\004￿\001w\023￿\001u\001￿\001y\020￿\001\002\001￿\001\t\016￿\001\f\001￿\001\007\006￿\001*\001￿\001g\005￿\001P\003￿\001l\001￿\001x\001\017￿\0019\003￿\001(\001￿\001r\b￿\001.\005￿\001`\002￿\001\003￿\001s\003￿\0012\001￿\001k\004￿\001#\003￿\001B\006￿\001R\006￿\001t\001￿\001\n￿\001\002￿\001\004￿\001f\001￿\001^\001\030\001/\001:\003￿\001\004\006￿\001$\003￿\001\001￿\001\020\001Q\001￿\001\001\r\001X\025￿\001\023\b￿\001\025\001\027\004￿\001 \001￿\001p\003￿\0013\001}\002￿\001N\004￿\0016\005￿\001S\001?\001C\n￿\001\001\001\035\001￿\001\002￿\001\005￿\001[\005￿\001v\001\n\003￿\001\013\n￿\001\032\004￿\001d\005￿\001\034\001%\001\001￿\001_\003￿\001!\004￿\001I\001O\001+\001￿\001n\001￿\0010\001H\005￿\001W\006￿\0015\n￿\001\b\001L\b￿\001)\005￿\001c\001\002￿\001b\001￿\0014\001￿\001@\001￿\001a\001￿\001~\002￿\001j\001￿\001m\001Z\001\001\002￿\001Y\007￿\001i\001\006￿\001\036\002￿\001{\001\001\026\001\002￿\001V\001￿\001\022\001K\001￿\001e\001￿\001>\001￿\001\031\001￿\001o\004￿\001T\001\001;\001\001J\001\001￿\001q\001\037\001A\001￿\001\017\003￿\001,\004￿\001\001E\003￿\001]\004￿\001F\001\\\003￿\001M\001U\002￿\001\"\002￿");
    /* 10511 */   static final short[] DFA57_special = DFA.unpackEncodedString("\031￿\001\000̽￿}>");
    /*       */   static final short[][] DFA57_transition;

    /*       */
    /*       */   static {
        /* 10515 */
        int numStates = DFA57_transitionS.length;
        /* 10516 */
        DFA57_transition = new short[numStates][];
        /* 10517 */
        for (int i = 0; i < numStates; i++)
            /* 10518 */
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        /*       */
    }

    /*       */
    /*       */   protected class DFA57
            /*       */ extends DFA
            /*       */ {
        /*       */
        public DFA57(BaseRecognizer recognizer) {
            /* 10525 */
            this.recognizer = recognizer;
            /* 10526 */
            this.decisionNumber = 57;
            /* 10527 */
            this.eot = Cql_Lexer.DFA57_eot;
            /* 10528 */
            this.eof = Cql_Lexer.DFA57_eof;
            /* 10529 */
            this.min = Cql_Lexer.DFA57_min;
            /* 10530 */
            this.max = Cql_Lexer.DFA57_max;
            /* 10531 */
            this.accept = Cql_Lexer.DFA57_accept;
            /* 10532 */
            this.special = Cql_Lexer.DFA57_special;
            /* 10533 */
            this.transition = Cql_Lexer.DFA57_transition;
            /*       */
        }

        /*       */
        /*       */
        public String getDescription() {
            /* 10537 */
            return "1:1: Tokens : ( K_SELECT | K_FROM | K_AS | K_WHERE | K_AND | K_KEY | K_KEYS | K_ENTRIES | K_FULL | K_INSERT | K_UPDATE | K_WITH | K_LIMIT | K_PER | K_PARTITION | K_USING | K_USE | K_DISTINCT | K_COUNT | K_SET | K_BEGIN | K_UNLOGGED | K_BATCH | K_APPLY | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_SCHEMA | K_KEYSPACE | K_KEYSPACES | K_COLUMNFAMILY | K_TABLES | K_MATERIALIZED | K_VIEW | K_INDEX | K_CUSTOM | K_ON | K_TO | K_DROP | K_PRIMARY | K_INTO | K_VALUES | K_TIMESTAMP | K_TTL | K_CAST | K_ALTER | K_RENAME | K_ADD | K_TYPE | K_TYPES | K_COMPACT | K_STORAGE | K_ORDER | K_BY | K_ASC | K_DESC | K_ALLOW | K_FILTERING | K_IF | K_IS | K_CONTAINS | K_GROUP | K_CLUSTER | K_INTERNALS | K_ONLY | K_GRANT | K_ALL | K_PERMISSION | K_PERMISSIONS | K_OF | K_REVOKE | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE | K_NORECURSIVE | K_MBEAN | K_MBEANS | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_HASHED | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_ACCESS | K_DATACENTERS | K_CLUSTERING | K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_DURATION | K_FLOAT | K_INET | K_INT | K_SMALLINT | K_TINYINT | K_TEXT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_TOKEN | K_WRITETIME | K_DATE | K_TIME | K_NULL | K_NOT | K_EXISTS | K_MAP | K_LIST | K_POSITIVE_NAN | K_NEGATIVE_NAN | K_POSITIVE_INFINITY | K_NEGATIVE_INFINITY | K_TUPLE | K_TRIGGER | K_STATIC | K_FROZEN | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_AGGREGATES | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_CALLED | K_INPUT | K_LANGUAGE | K_OR | K_REPLACE | K_JSON | K_DEFAULT | K_UNSET | K_LIKE | STRING_LITERAL | QUOTED_NAME | EMPTY_QUOTED_NAME | INTEGER | QMARK | RANGE | FLOAT | BOOLEAN | DURATION | IDENT | HEXNUMBER | UUID | WS | COMMENT | MULTILINE_COMMENT );";
            /*       */
        }

        /*       */
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            /*       */
            int LA57_25;
            /* 10541 */
            IntStream input = _input;
            /* 10542 */
            int _s = s;
            /* 10543 */
            switch (s) {
                /*       */
                case 0:
                    /* 10545 */
                    LA57_25 = input.LA(1);
                    /* 10546 */
                    s = -1;
                    /* 10547 */
                    if (LA57_25 == 34) {
                        s = 122;
                    }
                    /* 10548 */
                    else if ((LA57_25 >= 0 && LA57_25 <= 33) || (LA57_25 >= 35 && LA57_25 <= 65535)) {
                        s = 123;
                    }
                    /* 10549 */
                    if (s >= 0) return s;
                    /*       */
                    break;
                /*       */
            }
            /* 10552 */
            if (Cql_Lexer.this.state.backtracking > 0) {
                Cql_Lexer.this.state.failed = true;
                return -1;
            }
            /*       */
            /* 10554 */
            NoViableAltException nvae = new NoViableAltException(getDescription(), 57, _s, input);
            /* 10555 */
            error(nvae);
            /* 10556 */
            throw nvae;
            /*       */
        }
        /*       */
    }
    /*       */
}


/* Location:              C:\Users\Leo\Desktop\temp\apache-cassandra-4.1.9.jar!\org\apache\cassandra\cql3\Cql_Lexer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */