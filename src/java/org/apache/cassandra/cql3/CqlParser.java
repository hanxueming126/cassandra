/*     */
package org.apache.cassandra.cql3;
/*     */

import java.util.List;
import java.util.Set;
/*     */ import org.antlr.runtime.*;
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ import org.apache.cassandra.auth.*;
/*     */
/*     */
/*     */
/*     */
/*     */ import org.apache.cassandra.cql3.conditions.ColumnCondition;
/*     */ import org.apache.cassandra.cql3.functions.FunctionName;
import org.apache.cassandra.cql3.functions.masking.ColumnMask;
import org.apache.cassandra.cql3.selection.RawSelector;
/*     */ import org.apache.cassandra.cql3.selection.Selectable;
/*     */ import org.apache.cassandra.cql3.statements.*;
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ import org.apache.cassandra.cql3.statements.schema.*;
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ import org.apache.cassandra.utils.Pair;

/*     */
/*     */ public class CqlParser extends Parser {
    /*  35 */   public static final String[] tokenNames = new String[]{"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "B", "BOOLEAN", "C", "COMMENT", "D", "DIGIT", "DURATION", "DURATION_ISO_8601_PERIOD_DESIGNATORS", "DURATION_ISO_8601_TIME_DESIGNATORS", "DURATION_ISO_8601_WEEK_PERIOD_DESIGNATOR", "DURATION_UNIT", "E", "EMPTY_QUOTED_NAME", "EXPONENT", "F", "FLOAT", "G", "H", "HEX", "HEXNUMBER", "I", "IDENT", "INTEGER", "J", "K", "K_ACCESS", "K_ADD", "K_AGGREGATE", "K_AGGREGATES", "K_ALL", "K_ALLOW", "K_ALTER", "K_AND", "K_ANN", "K_APPLY", "K_AS", "K_ASC", "K_ASCII", "K_AUTHORIZE", "K_BATCH", "K_BEGIN", "K_BIGINT", "K_BLOB", "K_BOOLEAN", "K_BY", "K_CALLED", "K_CAST", "K_CIDRS", "K_CLUSTER", "K_CLUSTERING", "K_COLUMNFAMILY", "K_COMPACT", "K_CONTAINS", "K_COUNT", "K_COUNTER", "K_CREATE", "K_CUSTOM", "K_DATACENTERS", "K_DATE", "K_DECIMAL", "K_DEFAULT", "K_DELETE", "K_DESC", "K_DESCRIBE", "K_DISTINCT", "K_DOUBLE", "K_DROP", "K_DURATION", "K_ENTRIES", "K_EXECUTE", "K_EXISTS", "K_FILTERING", "K_FINALFUNC", "K_FLOAT", "K_FROM", "K_FROZEN", "K_FULL", "K_FUNCTION", "K_FUNCTIONS", "K_GRANT", "K_GROUP", "K_HASHED", "K_IDENTITY", "K_IF", "K_IN", "K_INDEX", "K_INET", "K_INITCOND", "K_INPUT", "K_INSERT", "K_INT", "K_INTERNALS", "K_INTO", "K_IS", "K_JSON", "K_KEY", "K_KEYS", "K_KEYSPACE", "K_KEYSPACES", "K_LANGUAGE", "K_LIKE", "K_LIMIT", "K_LIST", "K_LOGIN", "K_MAP", "K_MASKED", "K_MATERIALIZED", "K_MAXWRITETIME", "K_MBEAN", "K_MBEANS", "K_MODIFY", "K_NEGATIVE_INFINITY", "K_NEGATIVE_NAN", "K_NOLOGIN", "K_NORECURSIVE", "K_NOSUPERUSER", "K_NOT", "K_NULL", "K_OF", "K_ON", "K_ONLY", "K_OPTIONS", "K_OR", "K_ORDER", "K_PARTITION", "K_PASSWORD", "K_PER", "K_PERMISSION", "K_PERMISSIONS", "K_POSITIVE_INFINITY", "K_POSITIVE_NAN", "K_PRIMARY", "K_RENAME", "K_REPLACE", "K_RETURNS", "K_REVOKE", "K_ROLE", "K_ROLES", "K_SCHEMA", "K_SELECT", "K_SELECT_MASKED", "K_SET", "K_SFUNC", "K_SMALLINT", "K_STATIC", "K_STORAGE", "K_STYPE", "K_SUPERUSER", "K_TABLES", "K_TEXT", "K_TIME", "K_TIMESTAMP", "K_TIMEUUID", "K_TINYINT", "K_TO", "K_TOKEN", "K_TRIGGER", "K_TRUNCATE", "K_TTL", "K_TUPLE", "K_TYPE", "K_TYPES", "K_UNLOGGED", "K_UNMASK", "K_UNSET", "K_UPDATE", "K_USE", "K_USER", "K_USERS", "K_USING", "K_UUID", "K_VALUES", "K_VARCHAR", "K_VARINT", "K_VECTOR", "K_VIEW", "K_WHERE", "K_WITH", "K_WRITETIME", "L", "LETTER", "M", "MULTILINE_COMMENT", "N", "O", "P", "Q", "QMARK", "QUOTED_NAME", "R", "RANGE", "S", "STRING_LITERAL", "T", "U", "UUID", "V", "W", "WS", "X", "Y", "Z", "'!='", "'%'", "'('", "')'", "'+'", "'+='", "','", "'-'", "'-='", "'.'", "'/'", "':'", "';'", "'<'", "'<='", "'='", "'>'", "'>='", "'['", "'\\*'", "']'", "'expr('", "'{'", "'}'"};
    /*     */
    /*     */   public static final int EOF = -1;
    /*     */
    /*     */   public static final int T__207 = 207;
    /*     */
    /*     */   public static final int T__208 = 208;
    /*     */
    /*     */   public static final int T__209 = 209;
    /*     */
    /*     */   public static final int T__210 = 210;
    /*     */
    /*     */   public static final int T__211 = 211;
    /*     */
    /*     */   public static final int T__212 = 212;
    /*     */
    /*     */   public static final int T__213 = 213;
    /*     */
    /*     */   public static final int T__214 = 214;
    /*     */
    /*     */   public static final int T__215 = 215;
    /*     */
    /*     */   public static final int T__216 = 216;
    /*     */
    /*     */   public static final int T__217 = 217;
    /*     */
    /*     */   public static final int T__218 = 218;
    /*     */
    /*     */   public static final int T__219 = 219;
    /*     */
    /*     */   public static final int T__220 = 220;
    /*     */
    /*     */   public static final int T__221 = 221;
    /*     */
    /*     */   public static final int T__222 = 222;
    /*     */
    /*     */   public static final int T__223 = 223;
    /*     */
    /*     */   public static final int T__224 = 224;
    /*     */
    /*     */   public static final int T__225 = 225;
    /*     */
    /*     */   public static final int T__226 = 226;
    /*     */
    /*     */   public static final int T__227 = 227;
    /*     */
    /*     */   public static final int T__228 = 228;
    /*     */
    /*     */   public static final int T__229 = 229;
    /*     */
    /*     */   public static final int T__230 = 230;
    /*     */
    /*     */   public static final int A = 4;
    /*     */
    /*     */   public static final int B = 5;
    /*     */
    /*     */   public static final int BOOLEAN = 6;
    /*     */
    /*     */   public static final int C = 7;
    /*     */
    /*     */   public static final int COMMENT = 8;
    /*     */
    /*     */   public static final int D = 9;
    /*     */
    /*     */   public static final int DIGIT = 10;
    /*     */
    /*     */   public static final int DURATION = 11;
    /*     */
    /*     */   public static final int DURATION_ISO_8601_PERIOD_DESIGNATORS = 12;
    /*     */
    /*     */   public static final int DURATION_ISO_8601_TIME_DESIGNATORS = 13;
    /*     */
    /*     */   public static final int DURATION_ISO_8601_WEEK_PERIOD_DESIGNATOR = 14;
    /*     */   public static final int DURATION_UNIT = 15;
    /*     */   public static final int E = 16;
    /*     */   public static final int EMPTY_QUOTED_NAME = 17;
    /*     */   public static final int EXPONENT = 18;
    /*     */   public static final int F = 19;
    /*     */   public static final int FLOAT = 20;
    /*     */   public static final int G = 21;
    /*     */   public static final int H = 22;
    /*     */   public static final int HEX = 23;
    /*     */   public static final int HEXNUMBER = 24;
    /*     */   public static final int I = 25;
    /*     */   public static final int IDENT = 26;
    /*     */   public static final int INTEGER = 27;
    /*     */   public static final int J = 28;
    /*     */   public static final int K = 29;
    /*     */   public static final int K_ACCESS = 30;
    /*     */   public static final int K_ADD = 31;
    /*     */   public static final int K_AGGREGATE = 32;
    /*     */   public static final int K_AGGREGATES = 33;
    /*     */   public static final int K_ALL = 34;
    /*     */   public static final int K_ALLOW = 35;
    /*     */   public static final int K_ALTER = 36;
    /*     */   public static final int K_AND = 37;
    /*     */   public static final int K_ANN = 38;
    /*     */   public static final int K_APPLY = 39;
    /*     */   public static final int K_AS = 40;
    /*     */   public static final int K_ASC = 41;
    /*     */   public static final int K_ASCII = 42;
    /*     */   public static final int K_AUTHORIZE = 43;
    /*     */   public static final int K_BATCH = 44;
    /*     */   public static final int K_BEGIN = 45;
    /*     */   public static final int K_BIGINT = 46;
    /*     */   public static final int K_BLOB = 47;
    /*     */   public static final int K_BOOLEAN = 48;
    /*     */   public static final int K_BY = 49;
    /*     */   public static final int K_CALLED = 50;
    /*     */   public static final int K_CAST = 51;
    /*     */   public static final int K_CIDRS = 52;
    /*     */   public static final int K_CLUSTER = 53;
    /*     */   public static final int K_CLUSTERING = 54;
    /*     */   public static final int K_COLUMNFAMILY = 55;
    /*     */   public static final int K_COMPACT = 56;
    /*     */   public static final int K_CONTAINS = 57;
    /*     */   public static final int K_COUNT = 58;
    /*     */   public static final int K_COUNTER = 59;
    /*     */   public static final int K_CREATE = 60;
    /*     */   public static final int K_CUSTOM = 61;
    /*     */   public static final int K_DATACENTERS = 62;
    /*     */   public static final int K_DATE = 63;
    /*     */   public static final int K_DECIMAL = 64;
    /*     */   public static final int K_DEFAULT = 65;
    /*     */   public static final int K_DELETE = 66;
    /*     */   public static final int K_DESC = 67;
    /*     */   public static final int K_DESCRIBE = 68;
    /*     */   public static final int K_DISTINCT = 69;
    /*     */   public static final int K_DOUBLE = 70;
    /*     */   public static final int K_DROP = 71;
    /*     */   public static final int K_DURATION = 72;
    /*     */   public static final int K_ENTRIES = 73;
    /*     */   public static final int K_EXECUTE = 74;
    /*     */   public static final int K_EXISTS = 75;
    /*     */   public static final int K_FILTERING = 76;
    /*     */   public static final int K_FINALFUNC = 77;
    /*     */   public static final int K_FLOAT = 78;
    /*     */   public static final int K_FROM = 79;
    /*     */   public static final int K_FROZEN = 80;
    /*     */   public static final int K_FULL = 81;
    /*     */   public static final int K_FUNCTION = 82;
    /*     */   public static final int K_FUNCTIONS = 83;
    /*     */   public static final int K_GRANT = 84;
    /*     */   public static final int K_GROUP = 85;
    /*     */   public static final int K_HASHED = 86;
    /*     */   public static final int K_IDENTITY = 87;
    /*     */   public static final int K_IF = 88;
    /*     */   public static final int K_IN = 89;
    /*     */   public static final int K_INDEX = 90;
    /*     */   public static final int K_INET = 91;
    /*     */   public static final int K_INITCOND = 92;
    /*     */   public static final int K_INPUT = 93;
    /*     */   public static final int K_INSERT = 94;
    /*     */   public static final int K_INT = 95;
    /*     */   public static final int K_INTERNALS = 96;
    /*     */   public static final int K_INTO = 97;
    /*     */   public static final int K_IS = 98;
    /*     */   public static final int K_JSON = 99;
    /*     */   public static final int K_KEY = 100;
    /*     */   public static final int K_KEYS = 101;
    /*     */   public static final int K_KEYSPACE = 102;
    /*     */   public static final int K_KEYSPACES = 103;
    /*     */   public static final int K_LANGUAGE = 104;
    /*     */   public static final int K_LIKE = 105;
    /*     */   public static final int K_LIMIT = 106;
    /*     */   public static final int K_LIST = 107;
    /*     */   public static final int K_LOGIN = 108;
    /*     */   public static final int K_MAP = 109;
    /*     */   public static final int K_MASKED = 110;
    /*     */   public static final int K_MATERIALIZED = 111;
    /*     */   public static final int K_MAXWRITETIME = 112;
    /*     */   public static final int K_MBEAN = 113;
    /*     */   public static final int K_MBEANS = 114;
    /*     */   public static final int K_MODIFY = 115;
    /*     */   public static final int K_NEGATIVE_INFINITY = 116;
    /*     */   public static final int K_NEGATIVE_NAN = 117;
    /*     */   public static final int K_NOLOGIN = 118;
    /*     */   public static final int K_NORECURSIVE = 119;
    /*     */   public static final int K_NOSUPERUSER = 120;
    /*     */   public static final int K_NOT = 121;
    /*     */   public static final int K_NULL = 122;
    /*     */   public static final int K_OF = 123;
    /*     */   public static final int K_ON = 124;
    /*     */   public static final int K_ONLY = 125;
    /*     */   public static final int K_OPTIONS = 126;
    /*     */   public static final int K_OR = 127;
    /*     */   public static final int K_ORDER = 128;
    /*     */   public static final int K_PARTITION = 129;
    /*     */   public static final int K_PASSWORD = 130;
    /*     */   public static final int K_PER = 131;
    /*     */   public static final int K_PERMISSION = 132;
    /*     */   public static final int K_PERMISSIONS = 133;
    /*     */   public static final int K_POSITIVE_INFINITY = 134;
    /*     */   public static final int K_POSITIVE_NAN = 135;
    /*     */   public static final int K_PRIMARY = 136;
    /*     */   public static final int K_RENAME = 137;
    /*     */   public static final int K_REPLACE = 138;
    /*     */   public static final int K_RETURNS = 139;
    /*     */   public static final int K_REVOKE = 140;
    /*     */   public static final int K_ROLE = 141;
    /*     */   public static final int K_ROLES = 142;
    /*     */   public static final int K_SCHEMA = 143;
    /*     */   public static final int K_SELECT = 144;
    /*     */   public static final int K_SELECT_MASKED = 145;
    /*     */   public static final int K_SET = 146;
    /*     */   public static final int K_SFUNC = 147;
    /*     */   public static final int K_SMALLINT = 148;
    /*     */   public static final int K_STATIC = 149;
    /*     */   public static final int K_STORAGE = 150;
    /*     */   public static final int K_STYPE = 151;
    /*     */   public static final int K_SUPERUSER = 152;
    /*     */   public static final int K_TABLES = 153;
    /*     */   public static final int K_TEXT = 154;
    /*     */   public static final int K_TIME = 155;
    /*     */   public static final int K_TIMESTAMP = 156;
    /*     */   public static final int K_TIMEUUID = 157;
    /*     */   public static final int K_TINYINT = 158;
    /*     */   public static final int K_TO = 159;
    /*     */   public static final int K_TOKEN = 160;
    /*     */   public static final int K_TRIGGER = 161;
    /*     */   public static final int K_TRUNCATE = 162;
    /*     */   public static final int K_TTL = 163;
    /*     */   public static final int K_TUPLE = 164;
    /*     */   public static final int K_TYPE = 165;
    /*     */   public static final int K_TYPES = 166;
    /*     */   public static final int K_UNLOGGED = 167;
    /*     */   public static final int K_UNMASK = 168;
    /*     */   public static final int K_UNSET = 169;
    /*     */   public static final int K_UPDATE = 170;
    /*     */   public static final int K_USE = 171;
    /*     */   public static final int K_USER = 172;
    /*     */   public static final int K_USERS = 173;
    /*     */   public static final int K_USING = 174;
    /*     */   public static final int K_UUID = 175;
    /*     */   public static final int K_VALUES = 176;
    /*     */   public static final int K_VARCHAR = 177;
    /*     */   public static final int K_VARINT = 178;
    /*     */   public static final int K_VECTOR = 179;
    /*     */   public static final int K_VIEW = 180;
    /*     */   public static final int K_WHERE = 181;
    /*     */   public static final int K_WITH = 182;
    /*     */   public static final int K_WRITETIME = 183;
    /*     */   public static final int L = 184;
    /*     */   public static final int LETTER = 185;
    /*     */   public static final int M = 186;
    /*     */   public static final int MULTILINE_COMMENT = 187;
    /*     */   public static final int N = 188;
    /*     */   public static final int O = 189;
    /*     */   public static final int P = 190;
    /*     */   public static final int Q = 191;
    /*     */   public static final int QMARK = 192;
    /*     */   public static final int QUOTED_NAME = 193;
    /*     */   public static final int R = 194;
    /*     */   public static final int RANGE = 195;
    /*     */   public static final int S = 196;
    /*     */   public static final int STRING_LITERAL = 197;
    /*     */   public static final int T = 198;
    /*     */   public static final int U = 199;
    /*     */   public static final int UUID = 200;
    /*     */   public static final int V = 201;
    /*     */   public static final int W = 202;
    /*     */   public static final int WS = 203;
    /*     */   public static final int X = 204;
    /*     */   public static final int Y = 205;
    /*     */   public static final int Z = 206;
    /*     */   public Cql_Parser gParser;

    /*     */
    /*     */
    public Parser[] getDelegates() {
        /* 303 */
        return new Parser[]{this.gParser};
        /*     */
    }

    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    public CqlParser(TokenStream input) {
        /* 310 */
        this(input, new RecognizerSharedState());
        /*     */
    }

    /*     */
    public CqlParser(TokenStream input, RecognizerSharedState state) {
        /* 313 */
        super(input, state);
        /* 314 */
        this.gParser = new Cql_Parser(input, state, this);
        /*     */
    }

    /*     */
    /* 317 */
    public String[] getTokenNames() {
        return tokenNames;
    }

    public String getGrammarFileName() {
        /* 318 */
        return "/tmp/tmp.za7mxDaZqX/cassandra/src/antlr/Cql.g";
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public void addErrorListener(ErrorListener listener) {
        /* 323 */
        this.gParser.addErrorListener(listener);
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public void removeErrorListener(ErrorListener listener) {
        /* 328 */
        this.gParser.removeErrorListener(listener);
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        /* 333 */
        this.gParser.displayRecognitionError(tokenNames, e);
        /*     */
    }

    /*     */
    /*     */
    /*     */
    protected void addRecognitionError(String msg) {
        /* 338 */
        this.gParser.addRecognitionError(msg);
        /*     */
    }

    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
        /* 349 */
        throw new MismatchedTokenException(ttype, input);
        /*     */
    }

    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    public void recover(IntStream input, RecognitionException re) {
    }

    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    public final CQLStatement.Raw query() throws RecognitionException {
        /* 363 */
        CQLStatement.Raw stmnt = null;
        /*     */
        /*     */
        /* 366 */
        CQLStatement.Raw st = null;
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        try {
            /* 372 */
            pushFollow(FOLLOW_cqlStatement_in_query77);
            /* 373 */
            st = cqlStatement();
            /* 374 */
            this.state._fsp--;
            /*     */
            /*     */
            /*     */
            /*     */
            while (true) {
                /* 379 */
                int alt1 = 2;
                /* 380 */
                int LA1_0 = this.input.LA(1);
                /* 381 */
                if (LA1_0 == 219) {
                    /* 382 */
                    alt1 = 1;
                    /*     */
                }
                /*     */
                /* 385 */
                switch (alt1) {
                    /*     */
                    /*     */
                    /*     */
                    case 1:
                        /* 389 */
                        match((IntStream) this.input, 219, FOLLOW_219_in_query80);
                        /*     */
                        continue;
                        /*     */
                }
                /*     */
                /*     */
                /*     */
                /*     */
                /*     */
                break;
                /*     */
            }
            /* 398 */
            match((IntStream) this.input, -1, FOLLOW_EOF_in_query84);
            /* 399 */
            stmnt = st;
            /*     */
            /*     */
            /*     */
        }
        /* 403 */ catch (RecognitionException re) {
            /* 404 */
            reportError(re);
            /* 405 */
            recover((IntStream) this.input, re);
            /*     */
        } finally {
        }
        /*     */
        /*     */
        /*     */
        /* 410 */
        return stmnt;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public void usingClause(Attributes.Raw attrs) throws RecognitionException {
        /* 415 */
        this.gParser.usingClause(attrs);
        /*     */
    }

    public Selectable.Raw selectorModifier(Selectable.Raw receiver) throws RecognitionException {
        /* 417 */
        return this.gParser.selectorModifier(receiver);
        /*     */
    }

    public Selectable.Raw selectionTupleOrNestedSelector() throws RecognitionException {
        /* 419 */
        return this.gParser.selectionTupleOrNestedSelector();
        /*     */
    }

    public Selectable.Raw selectionMultiplication() throws RecognitionException {
        /* 421 */
        return this.gParser.selectionMultiplication();
        /*     */
    }

    public CQL3Type.Raw comparatorType() throws RecognitionException {
        /* 423 */
        return this.gParser.comparatorType();
        /*     */
    }

    public DropAggregateStatement.Raw dropAggregateStatement() throws RecognitionException {
        /* 425 */
        return this.gParser.dropAggregateStatement();
        /*     */
    }

    public Permission permission() throws RecognitionException {
        /* 427 */
        return this.gParser.permission();
        /*     */
    }

    public RawSelector selector() throws RecognitionException {
        /* 429 */
        return this.gParser.selector();
        /*     */
    }

    public List<Term.Raw> singleColumnInValues() throws RecognitionException {
        /* 431 */
        return this.gParser.singleColumnInValues();
        /*     */
    }

    public UseStatement useStatement() throws RecognitionException {
        /* 433 */
        return this.gParser.useStatement();
        /*     */
    }

    public void udtColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, FieldIdentifier field) throws RecognitionException {
        /* 435 */
        this.gParser.udtColumnOperation(operations, key, field);
        /*     */
    }

    public Selectable.Raw collectionSubSelection(Selectable.Raw receiver) throws RecognitionException {
        /* 437 */
        return this.gParser.collectionSubSelection(receiver);
        /*     */
    }

    public ColumnIdentifier non_type_ident() throws RecognitionException {
        /* 439 */
        return this.gParser.non_type_ident();
        /*     */
    }

    public Term.Raw selectionLiteral() throws RecognitionException {
        /* 441 */
        return this.gParser.selectionLiteral();
        /*     */
    }

    public void roleOption(RoleOptions opts, DCPermissions.Builder dcperms, CIDRPermissions.Builder cidrperms) throws RecognitionException {
        /* 443 */
        this.gParser.roleOption(opts, dcperms, cidrperms);
        /*     */
    }

    public Term.Raw termMultiplication() throws RecognitionException {
        /* 445 */
        return this.gParser.termMultiplication();
        /*     */
    }

    public Selectable.Raw fieldSelectorModifier(Selectable.Raw receiver) throws RecognitionException {
        /* 447 */
        return this.gParser.fieldSelectorModifier(receiver);
        /*     */
    }

    public DropViewStatement.Raw dropMaterializedViewStatement() throws RecognitionException {
        /* 449 */
        return this.gParser.dropMaterializedViewStatement();
        /*     */
    }

    public CQL3Type.Raw tuple_type() throws RecognitionException {
        /* 451 */
        return this.gParser.tuple_type();
        /*     */
    }

    public BatchStatement.Parsed batchStatement() throws RecognitionException {
        /* 453 */
        return this.gParser.batchStatement();
        /*     */
    }

    public DropTriggerStatement.Raw dropTriggerStatement() throws RecognitionException {
        /* 455 */
        return this.gParser.dropTriggerStatement();
        /*     */
    }

    public Cql_Parser.identity_return identity() throws RecognitionException {
        /* 457 */
        return this.gParser.identity();
        /*     */
    }

    public void tableClusteringOrder(CreateTableStatement.Raw stmt) throws RecognitionException {
        /* 459 */
        this.gParser.tableClusteringOrder(stmt);
        /*     */
    }

    public void groupByClause(List<Selectable.Raw> groups) throws RecognitionException {
        /* 461 */
        this.gParser.groupByClause(groups);
        /*     */
    }

    public void shorthandColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException {
        /* 463 */
        this.gParser.shorthandColumnOperation(operations, key);
        /*     */
    }

    public String unreserved_keyword() throws RecognitionException {
        /* 465 */
        return this.gParser.unreserved_keyword();
        /*     */
    }

    public ModificationStatement.Parsed batchStatementObjective() throws RecognitionException {
        /* 467 */
        return this.gParser.batchStatementObjective();
        /*     */
    }

    public Json.Raw jsonValue() throws RecognitionException {
        /* 469 */
        return this.gParser.jsonValue();
        /*     */
    }

    public Operation.RawDeletion deleteOp() throws RecognitionException {
        /* 471 */
        return this.gParser.deleteOp();
        /*     */
    }

    public CQLStatement.Raw cqlStatement() throws RecognitionException {
        /* 473 */
        return this.gParser.cqlStatement();
        /*     */
    }

    public Term.Raw setLiteral(Term.Raw t) throws RecognitionException {
        /* 475 */
        return this.gParser.setLiteral(t);
        /*     */
    }

    public CreateRoleStatement createUserStatement() throws RecognitionException {
        /* 477 */
        return this.gParser.createUserStatement();
        /*     */
    }

    public RoleName userOrRoleName() throws RecognitionException {
        /* 479 */
        return this.gParser.userOrRoleName();
        /*     */
    }

    public void normalColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException {
        /* 481 */
        this.gParser.normalColumnOperation(operations, key);
        /*     */
    }

    public AlterKeyspaceStatement.Raw alterKeyspaceStatement() throws RecognitionException {
        /* 483 */
        return this.gParser.alterKeyspaceStatement();
        /*     */
    }

    public Term.Raw intValue() throws RecognitionException {
        /* 485 */
        return this.gParser.intValue();
        /*     */
    }

    public String keyspaceName() throws RecognitionException {
        /* 487 */
        return this.gParser.keyspaceName();
        /*     */
    }

    public Tuples.INRaw inMarkerForTuple() throws RecognitionException {
        /* 489 */
        return this.gParser.inMarkerForTuple();
        /*     */
    }

    public Selectable.RawIdentifier sident() throws RecognitionException {
        /* 491 */
        return this.gParser.sident();
        /*     */
    }

    public ListRolesStatement listRolesStatement() throws RecognitionException {
        /* 493 */
        return this.gParser.listRolesStatement();
        /*     */
    }

    public boolean isStaticColumn() throws RecognitionException {
        /* 495 */
        return this.gParser.isStaticColumn();
        /*     */
    }

    public Selectable.Raw unaliasedSelector() throws RecognitionException {
        /* 497 */
        return this.gParser.unaliasedSelector();
        /*     */
    }

    public Cql_Parser.mbean_return mbean() throws RecognitionException {
        /* 499 */
        return this.gParser.mbean();
        /*     */
    }

    public Selectable.Raw selectionFunction() throws RecognitionException {
        /* 501 */
        return this.gParser.selectionFunction();
        /*     */
    }

    public void tableDefinition(CreateTableStatement.Raw stmt) throws RecognitionException {
        /* 503 */
        this.gParser.tableDefinition(stmt);
        /*     */
    }

    public Selectable.Raw selectionList() throws RecognitionException {
        /* 505 */
        return this.gParser.selectionList();
        /*     */
    }

    public void roleName(RoleName name) throws RecognitionException {
        /* 507 */
        this.gParser.roleName(name);
        /*     */
    }

    public DropIndexStatement.Raw dropIndexStatement() throws RecognitionException {
        /* 509 */
        return this.gParser.dropIndexStatement();
        /*     */
    }

    public void usingClauseObjective(Attributes.Raw attrs) throws RecognitionException {
        /* 511 */
        this.gParser.usingClauseObjective(attrs);
        /*     */
    }

    public DropTableStatement.Raw dropTableStatement() throws RecognitionException {
        /* 513 */
        return this.gParser.dropTableStatement();
        /*     */
    }

    public CreateTriggerStatement.Raw createTriggerStatement() throws RecognitionException {
        /* 515 */
        return this.gParser.createTriggerStatement();
        /*     */
    }

    public void collectionColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, Term.Raw k) throws RecognitionException {
        /* 517 */
        this.gParser.collectionColumnOperation(operations, key, k);
        /*     */
    }

    public ColumnIdentifier noncol_ident() throws RecognitionException {
        /* 519 */
        return this.gParser.noncol_ident();
        /*     */
    }

    public Selectable.Raw selectionGroup() throws RecognitionException {
        /* 521 */
        return this.gParser.selectionGroup();
        /*     */
    }

    public UTName userTypeName() throws RecognitionException {
        /* 523 */
        return this.gParser.userTypeName();
        /*     */
    }

    public void viewProperty(CreateViewStatement.Raw stmt) throws RecognitionException {
        /* 525 */
        this.gParser.viewProperty(stmt);
        /*     */
    }

    public JMXResource jmxResource() throws RecognitionException {
        /* 527 */
        return this.gParser.jmxResource();
        /*     */
    }

    public Constants.Literal constant() throws RecognitionException {
        /* 529 */
        return this.gParser.constant();
        /*     */
    }

    public Term.Raw mapLiteral(Term.Raw k) throws RecognitionException {
        /* 531 */
        return this.gParser.mapLiteral(k);
        /*     */
    }

    public String allowedFunctionName() throws RecognitionException {
        /* 533 */
        return this.gParser.allowedFunctionName();
        /*     */
    }

    public void ksName(QualifiedName name) throws RecognitionException {
        /* 535 */
        this.gParser.ksName(name);
        /*     */
    }

    public GrantRoleStatement grantRoleStatement() throws RecognitionException {
        /* 537 */
        return this.gParser.grantRoleStatement();
        /*     */
    }

    public QualifiedName columnFamilyName() throws RecognitionException {
        /* 539 */
        return this.gParser.columnFamilyName();
        /*     */
    }

    public void property(PropertyDefinitions props) throws RecognitionException {
        /* 541 */
        this.gParser.property(props);
        /*     */
    }

    public void orderByClause(List<Ordering.Raw> orderings) throws RecognitionException {
        /* 543 */
        this.gParser.orderByClause(orderings);
        /*     */
    }

    public void usingClauseDelete(Attributes.Raw attrs) throws RecognitionException {
        /* 545 */
        this.gParser.usingClauseDelete(attrs);
        /*     */
    }

    public CreateRoleStatement createRoleStatement() throws RecognitionException {
        /* 547 */
        return this.gParser.createRoleStatement();
        /*     */
    }

    public Term.Raw termAddition() throws RecognitionException {
        /* 549 */
        return this.gParser.termAddition();
        /*     */
    }

    public Operator containsOperator() throws RecognitionException {
        /* 551 */
        return this.gParser.containsOperator();
        /*     */
    }

    public RevokePermissionsStatement revokePermissionsStatement() throws RecognitionException {
        /* 553 */
        return this.gParser.revokePermissionsStatement();
        /*     */
    }

    public Tuples.Raw markerForTuple() throws RecognitionException {
        /* 555 */
        return this.gParser.markerForTuple();
        /*     */
    }

    public Selectable.Raw selectionTypeHint() throws RecognitionException {
        /* 557 */
        return this.gParser.selectionTypeHint();
        /*     */
    }

    public DeleteStatement.Parsed deleteStatement() throws RecognitionException {
        /* 559 */
        return this.gParser.deleteStatement();
        /*     */
    }

    public void columnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations) throws RecognitionException {
        /* 561 */
        this.gParser.columnOperation(operations);
        /*     */
    }

    public UpdateStatement.ParsedUpdate updateStatement() throws RecognitionException {
        /* 563 */
        return this.gParser.updateStatement();
        /*     */
    }

    public List<Term.Raw> functionArgs() throws RecognitionException {
        /* 565 */
        return this.gParser.functionArgs();
        /*     */
    }

    public Cql_Parser.username_return username() throws RecognitionException {
        /* 567 */
        return this.gParser.username();
        /*     */
    }

    public CreateIndexStatement.Raw createIndexStatement() throws RecognitionException {
        /* 569 */
        return this.gParser.createIndexStatement();
        /*     */
    }

    public Term.Raw term() throws RecognitionException {
        /* 571 */
        return this.gParser.term();
        /*     */
    }

    public List<Operation.RawDeletion> deleteSelection() throws RecognitionException {
        /* 573 */
        return this.gParser.deleteSelection();
        /*     */
    }

    public void tableColumns(CreateTableStatement.Raw stmt) throws RecognitionException {
        /* 575 */
        this.gParser.tableColumns(stmt);
        /*     */
    }

    public ColumnMask.Raw columnMask() throws RecognitionException {
        /* 577 */
        return this.gParser.columnMask();
        /*     */
    }

    public Tuples.Literal tupleLiteral() throws RecognitionException {
        /* 579 */
        return this.gParser.tupleLiteral();
        /*     */
    }

    public DropRoleStatement dropRoleStatement() throws RecognitionException {
        /* 581 */
        return this.gParser.dropRoleStatement();
        /*     */
    }

    public DropTypeStatement.Raw dropTypeStatement() throws RecognitionException {
        /* 583 */
        return this.gParser.dropTypeStatement();
        /*     */
    }

    public void properties(PropertyDefinitions props) throws RecognitionException {
        /* 585 */
        this.gParser.properties(props);
        /*     */
    }

    public void tableProperty(CreateTableStatement.Raw stmt) throws RecognitionException {
        /* 587 */
        this.gParser.tableProperty(stmt);
        /*     */
    }

    public DataResource dataResource() throws RecognitionException {
        /* 589 */
        return this.gParser.dataResource();
        /*     */
    }

    public FunctionName functionName() throws RecognitionException {
        /* 591 */
        return this.gParser.functionName();
        /*     */
    }

    public DropKeyspaceStatement.Raw dropKeyspaceStatement() throws RecognitionException {
        /* 593 */
        return this.gParser.dropKeyspaceStatement();
        /*     */
    }

    public void userPassword(RoleOptions opts) throws RecognitionException {
        /* 595 */
        this.gParser.userPassword(opts);
        /*     */
    }

    public void viewPrimaryKey(CreateViewStatement.Raw stmt) throws RecognitionException {
        /* 597 */
        this.gParser.viewPrimaryKey(stmt);
        /*     */
    }

    public Set<Permission> permissionOrAll() throws RecognitionException {
        /* 599 */
        return this.gParser.permissionOrAll();
        /*     */
    }

    public AbstractMarker.INRaw inMarker() throws RecognitionException {
        /* 601 */
        return this.gParser.inMarker();
        /*     */
    }

    public FunctionResource functionResource() throws RecognitionException {
        /* 603 */
        return this.gParser.functionResource();
        /*     */
    }

    public Selectable.Raw selectionGroupWithField() throws RecognitionException {
        /* 605 */
        return this.gParser.selectionGroupWithField();
        /*     */
    }

    public void customIndexExpression(WhereClause.Builder clause) throws RecognitionException {
        /* 607 */
        this.gParser.customIndexExpression(clause);
        /*     */
    }

    public Term.Raw termGroup() throws RecognitionException {
        /* 609 */
        return this.gParser.termGroup();
        /*     */
    }

    public void viewPartitionKey(CreateViewStatement.Raw stmt) throws RecognitionException {
        /* 611 */
        this.gParser.viewPartitionKey(stmt);
        /*     */
    }

    public ListPermissionsStatement listPermissionsStatement() throws RecognitionException {
        /* 613 */
        return this.gParser.listPermissionsStatement();
        /*     */
    }

    public void dcPermission(DCPermissions.Builder builder) throws RecognitionException {
        /* 615 */
        this.gParser.dcPermission(builder);
        /*     */
    }

    public Term.Raw collectionLiteral() throws RecognitionException {
        /* 617 */
        return this.gParser.collectionLiteral();
        /*     */
    }

    public void cidrPermission(CIDRPermissions.Builder builder) throws RecognitionException {
        /* 619 */
        this.gParser.cidrPermission(builder);
        /*     */
    }

    public Maps.Literal fullMapLiteral() throws RecognitionException {
        /* 621 */
        return this.gParser.fullMapLiteral();
        /*     */
    }

    public RoleResource roleResource() throws RecognitionException {
        /* 623 */
        return this.gParser.roleResource();
        /*     */
    }

    public String basic_unreserved_keyword() throws RecognitionException {
        /* 625 */
        return this.gParser.basic_unreserved_keyword();
        /*     */
    }

    public ModificationStatement.Parsed insertStatement() throws RecognitionException {
        /* 627 */
        return this.gParser.insertStatement();
        /*     */
    }

    public AlterViewStatement.Raw alterMaterializedViewStatement() throws RecognitionException {
        /* 629 */
        return this.gParser.alterMaterializedViewStatement();
        /*     */
    }

    public void columnOperationDifferentiator(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException {
        /* 631 */
        this.gParser.columnOperationDifferentiator(operations, key);
        /*     */
    }

    public CQL3Type.Raw vector_type() throws RecognitionException {
        /* 633 */
        return this.gParser.vector_type();
        /*     */
    }

    public void columnCondition(List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions) throws RecognitionException {
        /* 635 */
        this.gParser.columnCondition(conditions);
        /*     */
    }

    public Operator relationType() throws RecognitionException {
        /* 637 */
        return this.gParser.relationType();
        /*     */
    }

    public ListRolesStatement listUsersStatement() throws RecognitionException {
        /* 639 */
        return this.gParser.listUsersStatement();
        /*     */
    }

    public ColumnIdentifier cident() throws RecognitionException {
        /* 641 */
        return this.gParser.cident();
        /*     */
    }

    public Selectable.Raw selectionGroupWithoutField() throws RecognitionException {
        /* 643 */
        return this.gParser.selectionGroupWithoutField();
        /*     */
    }

    public AlterRoleStatement alterUserStatement() throws RecognitionException {
        /* 645 */
        return this.gParser.alterUserStatement();
        /*     */
    }

    public IResource resource() throws RecognitionException {
        /* 647 */
        return this.gParser.resource();
        /*     */
    }

    public void roleOptions(RoleOptions opts, DCPermissions.Builder dcperms, CIDRPermissions.Builder cidrperms) throws RecognitionException {
        /* 649 */
        this.gParser.roleOptions(opts, dcperms, cidrperms);
        /*     */
    }

    public AlterTableStatement.Raw alterTableStatement() throws RecognitionException {
        /* 651 */
        return this.gParser.alterTableStatement();
        /*     */
    }

    public AlterTypeStatement.Raw alterTypeStatement() throws RecognitionException {
        /* 653 */
        return this.gParser.alterTypeStatement();
        /*     */
    }

    public Selectable.Raw simpleUnaliasedSelector() throws RecognitionException {
        /* 655 */
        return this.gParser.simpleUnaliasedSelector();
        /*     */
    }

    public CreateAggregateStatement.Raw createAggregateStatement() throws RecognitionException {
        /* 657 */
        return this.gParser.createAggregateStatement();
        /*     */
    }

    public void relation(WhereClause.Builder clauses) throws RecognitionException {
        /* 659 */
        this.gParser.relation(clauses);
        /*     */
    }

    public void idxName(QualifiedName name) throws RecognitionException {
        /* 661 */
        this.gParser.idxName(name);
        /*     */
    }

    public DropFunctionStatement.Raw dropFunctionStatement() throws RecognitionException {
        /* 663 */
        return this.gParser.dropFunctionStatement();
        /*     */
    }

    public AddIdentityStatement addIdentityStatement() throws RecognitionException {
        /* 665 */
        return this.gParser.addIdentityStatement();
        /*     */
    }

    public AlterRoleStatement alterRoleStatement() throws RecognitionException {
        /* 667 */
        return this.gParser.alterRoleStatement();
        /*     */
    }

    public DropRoleStatement dropUserStatement() throws RecognitionException {
        /* 669 */
        return this.gParser.dropUserStatement();
        /*     */
    }

    public CreateKeyspaceStatement.Raw createKeyspaceStatement() throws RecognitionException {
        /* 671 */
        return this.gParser.createKeyspaceStatement();
        /*     */
    }

    public RevokeRoleStatement revokeRoleStatement() throws RecognitionException {
        /* 673 */
        return this.gParser.revokeRoleStatement();
        /*     */
    }

    public QualifiedName indexName() throws RecognitionException {
        /* 675 */
        return this.gParser.indexName();
        /*     */
    }

    public UpdateStatement.ParsedInsert normalInsertStatement(QualifiedName qn) throws RecognitionException {
        /* 677 */
        return this.gParser.normalInsertStatement(qn);
        /*     */
    }

    public Term.Raw value() throws RecognitionException {
        /* 679 */
        return this.gParser.value();
        /*     */
    }

    public GrantPermissionsStatement grantPermissionsStatement() throws RecognitionException {
        /* 681 */
        return this.gParser.grantPermissionsStatement();
        /*     */
    }

    public Cql_Parser.selectClause_return selectClause() throws RecognitionException {
        /* 683 */
        return this.gParser.selectClause();
        /*     */
    }

    public Term.Raw listLiteral() throws RecognitionException {
        /* 685 */
        return this.gParser.listLiteral();
        /*     */
    }

    public List<RawSelector> selectors() throws RecognitionException {
        /* 687 */
        return this.gParser.selectors();
        /*     */
    }

    public Selectable.Raw selectionMap(Selectable.Raw k1) throws RecognitionException {
        /* 689 */
        return this.gParser.selectionMap(k1);
        /*     */
    }

    public void columnMaskArguments(List<Term.Raw> arguments) throws RecognitionException {
        /* 691 */
        this.gParser.columnMaskArguments(arguments);
        /*     */
    }

    public void tablePartitionKey(CreateTableStatement.Raw stmt) throws RecognitionException {
        /* 693 */
        this.gParser.tablePartitionKey(stmt);
        /*     */
    }

    public FieldIdentifier fident() throws RecognitionException {
        /* 695 */
        return this.gParser.fident();
        /*     */
    }

    public CQL3Type.Raw collection_type() throws RecognitionException {
        /* 697 */
        return this.gParser.collection_type();
        /*     */
    }

    public SelectStatement.RawStatement selectStatement() throws RecognitionException {
        /* 699 */
        return this.gParser.selectStatement();
        /*     */
    }

    public void cfName(QualifiedName name) throws RecognitionException {
        /* 701 */
        this.gParser.cfName(name);
        /*     */
    }

    public void typeColumns(CreateTypeStatement.Raw stmt) throws RecognitionException {
        /* 703 */
        this.gParser.typeColumns(stmt);
        /*     */
    }

    public List<Tuples.Literal> tupleOfTupleLiterals() throws RecognitionException {
        /* 705 */
        return this.gParser.tupleOfTupleLiterals();
        /*     */
    }

    public CreateViewStatement.Raw createMaterializedViewStatement() throws RecognitionException {
        /* 707 */
        return this.gParser.createMaterializedViewStatement();
        /*     */
    }

    public Selectable.Raw selectionAddition() throws RecognitionException {
        /* 709 */
        return this.gParser.selectionAddition();
        /*     */
    }

    public TruncateStatement truncateStatement() throws RecognitionException {
        /* 711 */
        return this.gParser.truncateStatement();
        /*     */
    }

    public List<ColumnIdentifier> tupleOfIdentifiers() throws RecognitionException {
        /* 713 */
        return this.gParser.tupleOfIdentifiers();
        /*     */
    }

    public List<Selectable.Raw> selectionFunctionArgs() throws RecognitionException {
        /* 715 */
        return this.gParser.selectionFunctionArgs();
        /*     */
    }

    public CreateTableStatement.Raw createTableStatement() throws RecognitionException {
        /* 717 */
        return this.gParser.createTableStatement();
        /*     */
    }

    public DescribeStatement describeStatement() throws RecognitionException {
        /* 719 */
        return this.gParser.describeStatement();
        /*     */
    }

    public Selectable.Raw selectionMapOrSet() throws RecognitionException {
        /* 721 */
        return this.gParser.selectionMapOrSet();
        /*     */
    }

    public String propertyValue() throws RecognitionException {
        /* 723 */
        return this.gParser.propertyValue();
        /*     */
    }

    public String unreserved_function_keyword() throws RecognitionException {
        /* 725 */
        return this.gParser.unreserved_function_keyword();
        /*     */
    }

    public Term.Raw setOrMapLiteral(Term.Raw t) throws RecognitionException {
        /* 727 */
        return this.gParser.setOrMapLiteral(t);
        /*     */
    }

    public CreateTypeStatement.Raw createTypeStatement() throws RecognitionException {
        /* 729 */
        return this.gParser.createTypeStatement();
        /*     */
    }

    public Term.Raw function() throws RecognitionException {
        /* 731 */
        return this.gParser.function();
        /*     */
    }

    public Term.Raw simpleTerm() throws RecognitionException {
        /* 733 */
        return this.gParser.simpleTerm();
        /*     */
    }

    public void viewClusteringOrder(CreateViewStatement.Raw stmt) throws RecognitionException {
        /* 735 */
        this.gParser.viewClusteringOrder(stmt);
        /*     */
    }

    public CQL3Type native_type() throws RecognitionException {
        /* 737 */
        return this.gParser.native_type();
        /*     */
    }

    public void indexIdent(List<IndexTarget.Raw> targets) throws RecognitionException {
        /* 739 */
        this.gParser.indexIdent(targets);
        /*     */
    }

    public List<Tuples.Raw> tupleOfMarkersForTuples() throws RecognitionException {
        /* 741 */
        return this.gParser.tupleOfMarkersForTuples();
        /*     */
    }

    public void relationOrExpression(WhereClause.Builder clause) throws RecognitionException {
        /* 743 */
        this.gParser.relationOrExpression(clause);
        /*     */
    }

    public DropIdentityStatement dropIdentityStatement() throws RecognitionException {
        /* 745 */
        return this.gParser.dropIdentityStatement();
        /*     */
    }

    public UpdateStatement.ParsedInsertJson jsonInsertStatement(QualifiedName qn) throws RecognitionException {
        /* 747 */
        return this.gParser.jsonInsertStatement(qn);
        /*     */
    }

    public WhereClause.Builder whereClause() throws RecognitionException {
        /* 749 */
        return this.gParser.whereClause();
        /*     */
    }

    public UserTypes.Literal usertypeLiteral() throws RecognitionException {
        /* 751 */
        return this.gParser.usertypeLiteral();
        /*     */
    }

    public CreateFunctionStatement.Raw createFunctionStatement() throws RecognitionException {
        /* 753 */
        return this.gParser.createFunctionStatement();
        /*     */
    }

    public ColumnIdentifier ident() throws RecognitionException {
        /* 755 */
        return this.gParser.ident();
        /*     */
    }

    public List<Pair<ColumnIdentifier, ColumnCondition.Raw>> updateConditions() throws RecognitionException {
        /* 757 */
        return this.gParser.updateConditions();
        /*     */
    }

    public Selectable.Raw selectionSet(Selectable.Raw t1) throws RecognitionException {
        /* 759 */
        return this.gParser.selectionSet(t1);
        /*     */
    }

    /*     */
    /*     */
    /* 763 */   public static final BitSet FOLLOW_cqlStatement_in_query77 = new BitSet(new long[]{0L, 0L, 0L, 134217728L});
    /* 764 */   public static final BitSet FOLLOW_219_in_query80 = new BitSet(new long[]{0L, 0L, 0L, 134217728L});
    /* 765 */   public static final BitSet FOLLOW_EOF_in_query84 = new BitSet(new long[]{2L});
    /*     */
}


/* Location:              C:\Users\Leo\Desktop\temp\apache-cassandra-5.0.5\lib\apache-cassandra-5.0.5.jar!\org\apache\cassandra\cql3\CqlParser.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */