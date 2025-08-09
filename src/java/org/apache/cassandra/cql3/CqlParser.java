/*     */
package org.apache.cassandra.cql3;
/*     */

import java.util.List;
/*     */ import java.util.Map;
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
/*     */ import org.apache.cassandra.cql3.conditions.ColumnCondition;
/*     */ import org.apache.cassandra.cql3.functions.FunctionName;
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
/*     */ import org.apache.cassandra.utils.Pair;

/*     */
/*     */ public class CqlParser extends Parser {
    /*  34 */   public static final String[] tokenNames = new String[]{"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "B", "BOOLEAN", "C", "COMMENT", "D", "DIGIT", "DURATION", "DURATION_ISO_8601_PERIOD_DESIGNATORS", "DURATION_ISO_8601_TIME_DESIGNATORS", "DURATION_ISO_8601_WEEK_PERIOD_DESIGNATOR", "DURATION_UNIT", "E", "EMPTY_QUOTED_NAME", "EXPONENT", "F", "FLOAT", "G", "H", "HEX", "HEXNUMBER", "I", "IDENT", "INTEGER", "J", "K", "K_ACCESS", "K_ADD", "K_AGGREGATE", "K_AGGREGATES", "K_ALL", "K_ALLOW", "K_ALTER", "K_AND", "K_APPLY", "K_AS", "K_ASC", "K_ASCII", "K_AUTHORIZE", "K_BATCH", "K_BEGIN", "K_BIGINT", "K_BLOB", "K_BOOLEAN", "K_BY", "K_CALLED", "K_CAST", "K_CLUSTER", "K_CLUSTERING", "K_COLUMNFAMILY", "K_COMPACT", "K_CONTAINS", "K_COUNT", "K_COUNTER", "K_CREATE", "K_CUSTOM", "K_DATACENTERS", "K_DATE", "K_DECIMAL", "K_DEFAULT", "K_DELETE", "K_DESC", "K_DESCRIBE", "K_DISTINCT", "K_DOUBLE", "K_DROP", "K_DURATION", "K_ENTRIES", "K_EXECUTE", "K_EXISTS", "K_FILTERING", "K_FINALFUNC", "K_FLOAT", "K_FROM", "K_FROZEN", "K_FULL", "K_FUNCTION", "K_FUNCTIONS", "K_GRANT", "K_GROUP", "K_HASHED", "K_IF", "K_IN", "K_INDEX", "K_INET", "K_INITCOND", "K_INPUT", "K_INSERT", "K_INT", "K_INTERNALS", "K_INTO", "K_IS", "K_JSON", "K_KEY", "K_KEYS", "K_KEYSPACE", "K_KEYSPACES", "K_LANGUAGE", "K_LIKE", "K_LIMIT", "K_LIST", "K_LOGIN", "K_MAP", "K_MATERIALIZED", "K_MBEAN", "K_MBEANS", "K_MODIFY", "K_NEGATIVE_INFINITY", "K_NEGATIVE_NAN", "K_NOLOGIN", "K_NORECURSIVE", "K_NOSUPERUSER", "K_NOT", "K_NULL", "K_OF", "K_ON", "K_ONLY", "K_OPTIONS", "K_OR", "K_ORDER", "K_PARTITION", "K_PASSWORD", "K_PER", "K_PERMISSION", "K_PERMISSIONS", "K_POSITIVE_INFINITY", "K_POSITIVE_NAN", "K_PRIMARY", "K_RENAME", "K_REPLACE", "K_RETURNS", "K_REVOKE", "K_ROLE", "K_ROLES", "K_SCHEMA", "K_SELECT", "K_SET", "K_SFUNC", "K_SMALLINT", "K_STATIC", "K_STORAGE", "K_STYPE", "K_SUPERUSER", "K_TABLES", "K_TEXT", "K_TIME", "K_TIMESTAMP", "K_TIMEUUID", "K_TINYINT", "K_TO", "K_TOKEN", "K_TRIGGER", "K_TRUNCATE", "K_TTL", "K_TUPLE", "K_TYPE", "K_TYPES", "K_UNLOGGED", "K_UNSET", "K_UPDATE", "K_USE", "K_USER", "K_USERS", "K_USING", "K_UUID", "K_VALUES", "K_VARCHAR", "K_VARINT", "K_VIEW", "K_WHERE", "K_WITH", "K_WRITETIME", "L", "LETTER", "M", "MULTILINE_COMMENT", "N", "O", "P", "Q", "QMARK", "QUOTED_NAME", "R", "RANGE", "S", "STRING_LITERAL", "T", "U", "UUID", "V", "W", "WS", "X", "Y", "Z", "'!='", "'%'", "'('", "')'", "'+'", "'+='", "','", "'-'", "'-='", "'.'", "'/'", "':'", "';'", "'<'", "'<='", "'='", "'>'", "'>='", "'['", "'\\*'", "']'", "'expr('", "'{'", "'}'"};
    /*     */
    /*     */   public static final int EOF = -1;
    /*     */
    /*     */   public static final int T__199 = 199;
    /*     */
    /*     */   public static final int T__200 = 200;
    /*     */
    /*     */   public static final int T__201 = 201;
    /*     */
    /*     */   public static final int T__202 = 202;
    /*     */
    /*     */   public static final int T__203 = 203;
    /*     */
    /*     */   public static final int T__204 = 204;
    /*     */
    /*     */   public static final int T__205 = 205;
    /*     */
    /*     */   public static final int T__206 = 206;
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
    /*     */   public static final int K_APPLY = 38;
    /*     */   public static final int K_AS = 39;
    /*     */   public static final int K_ASC = 40;
    /*     */   public static final int K_ASCII = 41;
    /*     */   public static final int K_AUTHORIZE = 42;
    /*     */   public static final int K_BATCH = 43;
    /*     */   public static final int K_BEGIN = 44;
    /*     */   public static final int K_BIGINT = 45;
    /*     */   public static final int K_BLOB = 46;
    /*     */   public static final int K_BOOLEAN = 47;
    /*     */   public static final int K_BY = 48;
    /*     */   public static final int K_CALLED = 49;
    /*     */   public static final int K_CAST = 50;
    /*     */   public static final int K_CLUSTER = 51;
    /*     */   public static final int K_CLUSTERING = 52;
    /*     */   public static final int K_COLUMNFAMILY = 53;
    /*     */   public static final int K_COMPACT = 54;
    /*     */   public static final int K_CONTAINS = 55;
    /*     */   public static final int K_COUNT = 56;
    /*     */   public static final int K_COUNTER = 57;
    /*     */   public static final int K_CREATE = 58;
    /*     */   public static final int K_CUSTOM = 59;
    /*     */   public static final int K_DATACENTERS = 60;
    /*     */   public static final int K_DATE = 61;
    /*     */   public static final int K_DECIMAL = 62;
    /*     */   public static final int K_DEFAULT = 63;
    /*     */   public static final int K_DELETE = 64;
    /*     */   public static final int K_DESC = 65;
    /*     */   public static final int K_DESCRIBE = 66;
    /*     */   public static final int K_DISTINCT = 67;
    /*     */   public static final int K_DOUBLE = 68;
    /*     */   public static final int K_DROP = 69;
    /*     */   public static final int K_DURATION = 70;
    /*     */   public static final int K_ENTRIES = 71;
    /*     */   public static final int K_EXECUTE = 72;
    /*     */   public static final int K_EXISTS = 73;
    /*     */   public static final int K_FILTERING = 74;
    /*     */   public static final int K_FINALFUNC = 75;
    /*     */   public static final int K_FLOAT = 76;
    /*     */   public static final int K_FROM = 77;
    /*     */   public static final int K_FROZEN = 78;
    /*     */   public static final int K_FULL = 79;
    /*     */   public static final int K_FUNCTION = 80;
    /*     */   public static final int K_FUNCTIONS = 81;
    /*     */   public static final int K_GRANT = 82;
    /*     */   public static final int K_GROUP = 83;
    /*     */   public static final int K_HASHED = 84;
    /*     */   public static final int K_IF = 85;
    /*     */   public static final int K_IN = 86;
    /*     */   public static final int K_INDEX = 87;
    /*     */   public static final int K_INET = 88;
    /*     */   public static final int K_INITCOND = 89;
    /*     */   public static final int K_INPUT = 90;
    /*     */   public static final int K_INSERT = 91;
    /*     */   public static final int K_INT = 92;
    /*     */   public static final int K_INTERNALS = 93;
    /*     */   public static final int K_INTO = 94;
    /*     */   public static final int K_IS = 95;
    /*     */   public static final int K_JSON = 96;
    /*     */   public static final int K_KEY = 97;
    /*     */   public static final int K_KEYS = 98;
    /*     */   public static final int K_KEYSPACE = 99;
    /*     */   public static final int K_KEYSPACES = 100;
    /*     */   public static final int K_LANGUAGE = 101;
    /*     */   public static final int K_LIKE = 102;
    /*     */   public static final int K_LIMIT = 103;
    /*     */   public static final int K_LIST = 104;
    /*     */   public static final int K_LOGIN = 105;
    /*     */   public static final int K_MAP = 106;
    /*     */   public static final int K_MATERIALIZED = 107;
    /*     */   public static final int K_MBEAN = 108;
    /*     */   public static final int K_MBEANS = 109;
    /*     */   public static final int K_MODIFY = 110;
    /*     */   public static final int K_NEGATIVE_INFINITY = 111;
    /*     */   public static final int K_NEGATIVE_NAN = 112;
    /*     */   public static final int K_NOLOGIN = 113;
    /*     */   public static final int K_NORECURSIVE = 114;
    /*     */   public static final int K_NOSUPERUSER = 115;
    /*     */   public static final int K_NOT = 116;
    /*     */   public static final int K_NULL = 117;
    /*     */   public static final int K_OF = 118;
    /*     */   public static final int K_ON = 119;
    /*     */   public static final int K_ONLY = 120;
    /*     */   public static final int K_OPTIONS = 121;
    /*     */   public static final int K_OR = 122;
    /*     */   public static final int K_ORDER = 123;
    /*     */   public static final int K_PARTITION = 124;
    /*     */   public static final int K_PASSWORD = 125;
    /*     */   public static final int K_PER = 126;
    /*     */   public static final int K_PERMISSION = 127;
    /*     */   public static final int K_PERMISSIONS = 128;
    /*     */   public static final int K_POSITIVE_INFINITY = 129;
    /*     */   public static final int K_POSITIVE_NAN = 130;
    /*     */   public static final int K_PRIMARY = 131;
    /*     */   public static final int K_RENAME = 132;
    /*     */   public static final int K_REPLACE = 133;
    /*     */   public static final int K_RETURNS = 134;
    /*     */   public static final int K_REVOKE = 135;
    /*     */   public static final int K_ROLE = 136;
    /*     */   public static final int K_ROLES = 137;
    /*     */   public static final int K_SCHEMA = 138;
    /*     */   public static final int K_SELECT = 139;
    /*     */   public static final int K_SET = 140;
    /*     */   public static final int K_SFUNC = 141;
    /*     */   public static final int K_SMALLINT = 142;
    /*     */   public static final int K_STATIC = 143;
    /*     */   public static final int K_STORAGE = 144;
    /*     */   public static final int K_STYPE = 145;
    /*     */   public static final int K_SUPERUSER = 146;
    /*     */   public static final int K_TABLES = 147;
    /*     */   public static final int K_TEXT = 148;
    /*     */   public static final int K_TIME = 149;
    /*     */   public static final int K_TIMESTAMP = 150;
    /*     */   public static final int K_TIMEUUID = 151;
    /*     */   public static final int K_TINYINT = 152;
    /*     */   public static final int K_TO = 153;
    /*     */   public static final int K_TOKEN = 154;
    /*     */   public static final int K_TRIGGER = 155;
    /*     */   public static final int K_TRUNCATE = 156;
    /*     */   public static final int K_TTL = 157;
    /*     */   public static final int K_TUPLE = 158;
    /*     */   public static final int K_TYPE = 159;
    /*     */   public static final int K_TYPES = 160;
    /*     */   public static final int K_UNLOGGED = 161;
    /*     */   public static final int K_UNSET = 162;
    /*     */   public static final int K_UPDATE = 163;
    /*     */   public static final int K_USE = 164;
    /*     */   public static final int K_USER = 165;
    /*     */   public static final int K_USERS = 166;
    /*     */   public static final int K_USING = 167;
    /*     */   public static final int K_UUID = 168;
    /*     */   public static final int K_VALUES = 169;
    /*     */   public static final int K_VARCHAR = 170;
    /*     */   public static final int K_VARINT = 171;
    /*     */   public static final int K_VIEW = 172;
    /*     */   public static final int K_WHERE = 173;
    /*     */   public static final int K_WITH = 174;
    /*     */   public static final int K_WRITETIME = 175;
    /*     */   public static final int L = 176;
    /*     */   public static final int LETTER = 177;
    /*     */   public static final int M = 178;
    /*     */   public static final int MULTILINE_COMMENT = 179;
    /*     */   public static final int N = 180;
    /*     */   public static final int O = 181;
    /*     */   public static final int P = 182;
    /*     */   public static final int Q = 183;
    /*     */   public static final int QMARK = 184;
    /*     */   public static final int QUOTED_NAME = 185;
    /*     */   public static final int R = 186;
    /*     */   public static final int RANGE = 187;
    /*     */   public static final int S = 188;
    /*     */   public static final int STRING_LITERAL = 189;
    /*     */   public static final int T = 190;
    /*     */   public static final int U = 191;
    /*     */   public static final int UUID = 192;
    /*     */   public static final int V = 193;
    /*     */   public static final int W = 194;
    /*     */   public static final int WS = 195;
    /*     */   public static final int X = 196;
    /*     */   public static final int Y = 197;
    /*     */   public static final int Z = 198;
    /*     */   public Cql_Parser gParser;

    /*     */
    /*     */
    public Parser[] getDelegates() {
        /* 293 */
        return new Parser[]{this.gParser};
        /*     */
    }

    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    public CqlParser(TokenStream input) {
        /* 300 */
        this(input, new RecognizerSharedState());
        /*     */
    }

    /*     */
    public CqlParser(TokenStream input, RecognizerSharedState state) {
        /* 303 */
        super(input, state);
        /* 304 */
        this.gParser = new Cql_Parser(input, state, this);
        /*     */
    }

    /*     */
    /* 307 */
    public String[] getTokenNames() {
        return tokenNames;
    }

    public String getGrammarFileName() {
        /* 308 */
        return "/tmp/tmp.ONj2JCnxsN/cassandra/src/antlr/Cql.g";
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public void addErrorListener(ErrorListener listener) {
        /* 313 */
        this.gParser.addErrorListener(listener);
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public void removeErrorListener(ErrorListener listener) {
        /* 318 */
        this.gParser.removeErrorListener(listener);
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        /* 323 */
        this.gParser.displayRecognitionError(tokenNames, e);
        /*     */
    }

    /*     */
    /*     */
    /*     */
    protected void addRecognitionError(String msg) {
        /* 328 */
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
        /* 339 */
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
        /* 353 */
        CQLStatement.Raw stmnt = null;
        /*     */
        /*     */
        /* 356 */
        CQLStatement.Raw st = null;
        /*     */
        /*     */
        /*     */
        /*     */
        /*     */
        try {
            /* 362 */
            pushFollow(FOLLOW_cqlStatement_in_query77);
            /* 363 */
            st = cqlStatement();
            /* 364 */
            this.state._fsp--;
            /*     */
            /*     */
            /*     */
            /*     */
            while (true) {
                /* 369 */
                int alt1 = 2;
                /* 370 */
                int LA1_0 = this.input.LA(1);
                /* 371 */
                if (LA1_0 == 211) {
                    /* 372 */
                    alt1 = 1;
                    /*     */
                }
                /*     */
                /* 375 */
                switch (alt1) {
                    /*     */
                    /*     */
                    /*     */
                    case 1:
                        /* 379 */
                        match((IntStream) this.input, 211, FOLLOW_211_in_query80);
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
            /* 388 */
            match((IntStream) this.input, -1, FOLLOW_EOF_in_query84);
            /* 389 */
            stmnt = st;
            /*     */
            /*     */
            /*     */
        }
        /* 393 */ catch (RecognitionException re) {
            /* 394 */
            reportError(re);
            /* 395 */
            recover((IntStream) this.input, re);
            /*     */
        } finally {
        }
        /*     */
        /*     */
        /*     */
        /* 400 */
        return stmnt;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public SelectStatement.RawStatement selectStatement() throws RecognitionException {
        /* 405 */
        return this.gParser.selectStatement();
        /*     */
    }

    public Selectable.Raw selectionGroupWithoutField() throws RecognitionException {
        /* 407 */
        return this.gParser.selectionGroupWithoutField();
        /*     */
    }

    public void shorthandColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException {
        /* 409 */
        this.gParser.shorthandColumnOperation(operations, key);
        /*     */
    }

    public DescribeStatement describeStatement() throws RecognitionException {
        /* 411 */
        return this.gParser.describeStatement();
        /*     */
    }

    public GrantPermissionsStatement grantPermissionsStatement() throws RecognitionException {
        /* 413 */
        return this.gParser.grantPermissionsStatement();
        /*     */
    }

    public Selectable.Raw selectionList() throws RecognitionException {
        /* 415 */
        return this.gParser.selectionList();
        /*     */
    }

    public Selectable.Raw simpleUnaliasedSelector() throws RecognitionException {
        /* 417 */
        return this.gParser.simpleUnaliasedSelector();
        /*     */
    }

    public void groupByClause(List<Selectable.Raw> groups) throws RecognitionException {
        /* 419 */
        this.gParser.groupByClause(groups);
        /*     */
    }

    public void dcPermission(DCPermissions.Builder builder) throws RecognitionException {
        /* 421 */
        this.gParser.dcPermission(builder);
        /*     */
    }

    public DropRoleStatement dropRoleStatement() throws RecognitionException {
        /* 423 */
        return this.gParser.dropRoleStatement();
        /*     */
    }

    public CQL3Type native_type() throws RecognitionException {
        /* 425 */
        return this.gParser.native_type();
        /*     */
    }

    public ModificationStatement.Parsed insertStatement() throws RecognitionException {
        /* 427 */
        return this.gParser.insertStatement();
        /*     */
    }

    public void columnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations) throws RecognitionException {
        /* 429 */
        this.gParser.columnOperation(operations);
        /*     */
    }

    public void normalColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException {
        /* 431 */
        this.gParser.normalColumnOperation(operations, key);
        /*     */
    }

    public Tuples.INRaw inMarkerForTuple() throws RecognitionException {
        /* 433 */
        return this.gParser.inMarkerForTuple();
        /*     */
    }

    public UpdateStatement.ParsedInsertJson jsonInsertStatement(QualifiedName qn) throws RecognitionException {
        /* 435 */
        return this.gParser.jsonInsertStatement(qn);
        /*     */
    }

    public Tuples.Literal tupleLiteral() throws RecognitionException {
        /* 437 */
        return this.gParser.tupleLiteral();
        /*     */
    }

    public void collectionColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, Term.Raw k) throws RecognitionException {
        /* 439 */
        this.gParser.collectionColumnOperation(operations, key, k);
        /*     */
    }

    public Selectable.Raw selectionGroup() throws RecognitionException {
        /* 441 */
        return this.gParser.selectionGroup();
        /*     */
    }

    public List<Pair<ColumnIdentifier, ColumnCondition.Raw>> updateConditions() throws RecognitionException {
        /* 443 */
        return this.gParser.updateConditions();
        /*     */
    }

    public UseStatement useStatement() throws RecognitionException {
        /* 445 */
        return this.gParser.useStatement();
        /*     */
    }

    public Operator relationType() throws RecognitionException {
        /* 447 */
        return this.gParser.relationType();
        /*     */
    }

    public Selectable.Raw selectionSet(Selectable.Raw t1) throws RecognitionException {
        /* 449 */
        return this.gParser.selectionSet(t1);
        /*     */
    }

    public Constants.Literal constant() throws RecognitionException {
        /* 451 */
        return this.gParser.constant();
        /*     */
    }

    public ListRolesStatement listRolesStatement() throws RecognitionException {
        /* 453 */
        return this.gParser.listRolesStatement();
        /*     */
    }

    public UTName userTypeName() throws RecognitionException {
        /* 455 */
        return this.gParser.userTypeName();
        /*     */
    }

    public Selectable.Raw selectorModifier(Selectable.Raw receiver) throws RecognitionException {
        /* 457 */
        return this.gParser.selectorModifier(receiver);
        /*     */
    }

    public void viewPrimaryKey(CreateViewStatement.Raw stmt) throws RecognitionException {
        /* 459 */
        this.gParser.viewPrimaryKey(stmt);
        /*     */
    }

    public void viewClusteringOrder(CreateViewStatement.Raw stmt) throws RecognitionException {
        /* 461 */
        this.gParser.viewClusteringOrder(stmt);
        /*     */
    }

    public List<Term.Raw> singleColumnInValues() throws RecognitionException {
        /* 463 */
        return this.gParser.singleColumnInValues();
        /*     */
    }

    public Term.Raw mapLiteral(Term.Raw k) throws RecognitionException {
        /* 465 */
        return this.gParser.mapLiteral(k);
        /*     */
    }

    public Permission permission() throws RecognitionException {
        /* 467 */
        return this.gParser.permission();
        /*     */
    }

    public Term.Raw term() throws RecognitionException {
        /* 469 */
        return this.gParser.term();
        /*     */
    }

    public String allowedFunctionName() throws RecognitionException {
        /* 471 */
        return this.gParser.allowedFunctionName();
        /*     */
    }

    public Selectable.Raw selectionMultiplication() throws RecognitionException {
        /* 473 */
        return this.gParser.selectionMultiplication();
        /*     */
    }

    public void usingClause(Attributes.Raw attrs) throws RecognitionException {
        /* 475 */
        this.gParser.usingClause(attrs);
        /*     */
    }

    public void cfName(QualifiedName name) throws RecognitionException {
        /* 477 */
        this.gParser.cfName(name);
        /*     */
    }

    public void tableDefinition(CreateTableStatement.Raw stmt) throws RecognitionException {
        /* 479 */
        this.gParser.tableDefinition(stmt);
        /*     */
    }

    public String unreserved_keyword() throws RecognitionException {
        /* 481 */
        return this.gParser.unreserved_keyword();
        /*     */
    }

    public FunctionResource functionResource() throws RecognitionException {
        /* 483 */
        return this.gParser.functionResource();
        /*     */
    }

    public String propertyValue() throws RecognitionException {
        /* 485 */
        return this.gParser.propertyValue();
        /*     */
    }

    public void userPassword(RoleOptions opts) throws RecognitionException {
        /* 487 */
        this.gParser.userPassword(opts);
        /*     */
    }

    public AlterViewStatement.Raw alterMaterializedViewStatement() throws RecognitionException {
        /* 489 */
        return this.gParser.alterMaterializedViewStatement();
        /*     */
    }

    public ColumnIdentifier cident() throws RecognitionException {
        /* 491 */
        return this.gParser.cident();
        /*     */
    }

    public GrantRoleStatement grantRoleStatement() throws RecognitionException {
        /* 493 */
        return this.gParser.grantRoleStatement();
        /*     */
    }

    public Cql_Parser.username_return username() throws RecognitionException {
        /* 495 */
        return this.gParser.username();
        /*     */
    }

    public Tuples.Raw markerForTuple() throws RecognitionException {
        /* 497 */
        return this.gParser.markerForTuple();
        /*     */
    }

    public Selectable.Raw selectionGroupWithField() throws RecognitionException {
        /* 499 */
        return this.gParser.selectionGroupWithField();
        /*     */
    }

    public CreateIndexStatement.Raw createIndexStatement() throws RecognitionException {
        /* 501 */
        return this.gParser.createIndexStatement();
        /*     */
    }

    public Term.Raw termAddition() throws RecognitionException {
        /* 503 */
        return this.gParser.termAddition();
        /*     */
    }

    public Cql_Parser.selectClause_return selectClause() throws RecognitionException {
        /* 505 */
        return this.gParser.selectClause();
        /*     */
    }

    public AlterTypeStatement.Raw alterTypeStatement() throws RecognitionException {
        /* 507 */
        return this.gParser.alterTypeStatement();
        /*     */
    }

    public Selectable.RawIdentifier sident() throws RecognitionException {
        /* 509 */
        return this.gParser.sident();
        /*     */
    }

    public DropFunctionStatement.Raw dropFunctionStatement() throws RecognitionException {
        /* 511 */
        return this.gParser.dropFunctionStatement();
        /*     */
    }

    public void tableProperty(CreateTableStatement.Raw stmt) throws RecognitionException {
        /* 513 */
        this.gParser.tableProperty(stmt);
        /*     */
    }

    public Term.Raw simpleTerm() throws RecognitionException {
        /* 515 */
        return this.gParser.simpleTerm();
        /*     */
    }

    public Maps.Literal fullMapLiteral() throws RecognitionException {
        /* 517 */
        return this.gParser.fullMapLiteral();
        /*     */
    }

    public QualifiedName columnFamilyName() throws RecognitionException {
        /* 519 */
        return this.gParser.columnFamilyName();
        /*     */
    }

    public WhereClause.Builder whereClause() throws RecognitionException {
        /* 521 */
        return this.gParser.whereClause();
        /*     */
    }

    public ListPermissionsStatement listPermissionsStatement() throws RecognitionException {
        /* 523 */
        return this.gParser.listPermissionsStatement();
        /*     */
    }

    public CQL3Type.Raw comparatorType() throws RecognitionException {
        /* 525 */
        return this.gParser.comparatorType();
        /*     */
    }

    public CQL3Type.Raw tuple_type() throws RecognitionException {
        /* 527 */
        return this.gParser.tuple_type();
        /*     */
    }

    public void customIndexExpression(WhereClause.Builder clause) throws RecognitionException {
        /* 529 */
        this.gParser.customIndexExpression(clause);
        /*     */
    }

    public void usingClauseDelete(Attributes.Raw attrs) throws RecognitionException {
        /* 531 */
        this.gParser.usingClauseDelete(attrs);
        /*     */
    }

    public List<ColumnIdentifier> tupleOfIdentifiers() throws RecognitionException {
        /* 533 */
        return this.gParser.tupleOfIdentifiers();
        /*     */
    }

    public void tablePartitionKey(CreateTableStatement.Raw stmt) throws RecognitionException {
        /* 535 */
        this.gParser.tablePartitionKey(stmt);
        /*     */
    }

    public CreateFunctionStatement.Raw createFunctionStatement() throws RecognitionException {
        /* 537 */
        return this.gParser.createFunctionStatement();
        /*     */
    }

    public Json.Raw jsonValue() throws RecognitionException {
        /* 539 */
        return this.gParser.jsonValue();
        /*     */
    }

    public RevokeRoleStatement revokeRoleStatement() throws RecognitionException {
        /* 541 */
        return this.gParser.revokeRoleStatement();
        /*     */
    }

    public FunctionName functionName() throws RecognitionException {
        /* 543 */
        return this.gParser.functionName();
        /*     */
    }

    public QualifiedName indexName() throws RecognitionException {
        /* 545 */
        return this.gParser.indexName();
        /*     */
    }

    public UserTypes.Literal usertypeLiteral() throws RecognitionException {
        /* 547 */
        return this.gParser.usertypeLiteral();
        /*     */
    }

    public List<Tuples.Raw> tupleOfMarkersForTuples() throws RecognitionException {
        /* 549 */
        return this.gParser.tupleOfMarkersForTuples();
        /*     */
    }

    public void roleName(RoleName name) throws RecognitionException {
        /* 551 */
        this.gParser.roleName(name);
        /*     */
    }

    public Term.Raw setLiteral(Term.Raw t) throws RecognitionException {
        /* 553 */
        return this.gParser.setLiteral(t);
        /*     */
    }

    public ModificationStatement.Parsed batchStatementObjective() throws RecognitionException {
        /* 555 */
        return this.gParser.batchStatementObjective();
        /*     */
    }

    public boolean isStaticColumn() throws RecognitionException {
        /* 557 */
        return this.gParser.isStaticColumn();
        /*     */
    }

    public void property(PropertyDefinitions props) throws RecognitionException {
        /* 559 */
        this.gParser.property(props);
        /*     */
    }

    public void roleOption(RoleOptions opts, DCPermissions.Builder dcperms) throws RecognitionException {
        /* 561 */
        this.gParser.roleOption(opts, dcperms);
        /*     */
    }

    public CQLStatement.Raw cqlStatement() throws RecognitionException {
        /* 563 */
        return this.gParser.cqlStatement();
        /*     */
    }

    public ColumnIdentifier noncol_ident() throws RecognitionException {
        /* 565 */
        return this.gParser.noncol_ident();
        /*     */
    }

    public List<Operation.RawDeletion> deleteSelection() throws RecognitionException {
        /* 567 */
        return this.gParser.deleteSelection();
        /*     */
    }

    public Selectable.Raw unaliasedSelector() throws RecognitionException {
        /* 569 */
        return this.gParser.unaliasedSelector();
        /*     */
    }

    public Term.Raw termGroup() throws RecognitionException {
        /* 571 */
        return this.gParser.termGroup();
        /*     */
    }

    public CreateRoleStatement createRoleStatement() throws RecognitionException {
        /* 573 */
        return this.gParser.createRoleStatement();
        /*     */
    }

    public Selectable.Raw fieldSelectorModifier(Selectable.Raw receiver) throws RecognitionException {
        /* 575 */
        return this.gParser.fieldSelectorModifier(receiver);
        /*     */
    }

    public DropKeyspaceStatement.Raw dropKeyspaceStatement() throws RecognitionException {
        /* 577 */
        return this.gParser.dropKeyspaceStatement();
        /*     */
    }

    public Selectable.Raw selectionMap(Selectable.Raw k1) throws RecognitionException {
        /* 579 */
        return this.gParser.selectionMap(k1);
        /*     */
    }

    public RoleResource roleResource() throws RecognitionException {
        /* 581 */
        return this.gParser.roleResource();
        /*     */
    }

    public DropIndexStatement.Raw dropIndexStatement() throws RecognitionException {
        /* 583 */
        return this.gParser.dropIndexStatement();
        /*     */
    }

    public void columnCondition(List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions) throws RecognitionException {
        /* 585 */
        this.gParser.columnCondition(conditions);
        /*     */
    }

    public DataResource dataResource() throws RecognitionException {
        /* 587 */
        return this.gParser.dataResource();
        /*     */
    }

    public void tableClusteringOrder(CreateTableStatement.Raw stmt) throws RecognitionException {
        /* 589 */
        this.gParser.tableClusteringOrder(stmt);
        /*     */
    }

    public void udtColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, FieldIdentifier field) throws RecognitionException {
        /* 591 */
        this.gParser.udtColumnOperation(operations, key, field);
        /*     */
    }

    public Term.Raw intValue() throws RecognitionException {
        /* 593 */
        return this.gParser.intValue();
        /*     */
    }

    public Selectable.Raw selectionMapOrSet() throws RecognitionException {
        /* 595 */
        return this.gParser.selectionMapOrSet();
        /*     */
    }

    public AlterTableStatement.Raw alterTableStatement() throws RecognitionException {
        /* 597 */
        return this.gParser.alterTableStatement();
        /*     */
    }

    public List<Selectable.Raw> selectionFunctionArgs() throws RecognitionException {
        /* 599 */
        return this.gParser.selectionFunctionArgs();
        /*     */
    }

    public CreateKeyspaceStatement.Raw createKeyspaceStatement() throws RecognitionException {
        /* 601 */
        return this.gParser.createKeyspaceStatement();
        /*     */
    }

    public CreateRoleStatement createUserStatement() throws RecognitionException {
        /* 603 */
        return this.gParser.createUserStatement();
        /*     */
    }

    public Term.Raw collectionLiteral() throws RecognitionException {
        /* 605 */
        return this.gParser.collectionLiteral();
        /*     */
    }

    public void typeColumns(CreateTypeStatement.Raw stmt) throws RecognitionException {
        /* 607 */
        this.gParser.typeColumns(stmt);
        /*     */
    }

    public AbstractMarker.INRaw inMarker() throws RecognitionException {
        /* 609 */
        return this.gParser.inMarker();
        /*     */
    }

    public RawSelector selector() throws RecognitionException {
        /* 611 */
        return this.gParser.selector();
        /*     */
    }

    public Selectable.Raw selectionTypeHint() throws RecognitionException {
        /* 613 */
        return this.gParser.selectionTypeHint();
        /*     */
    }

    public void idxName(QualifiedName name) throws RecognitionException {
        /* 615 */
        this.gParser.idxName(name);
        /*     */
    }

    public void roleOptions(RoleOptions opts, DCPermissions.Builder dcperms) throws RecognitionException {
        /* 617 */
        this.gParser.roleOptions(opts, dcperms);
        /*     */
    }

    public CQL3Type.Raw collection_type() throws RecognitionException {
        /* 619 */
        return this.gParser.collection_type();
        /*     */
    }

    public Term.Raw listLiteral() throws RecognitionException {
        /* 621 */
        return this.gParser.listLiteral();
        /*     */
    }

    public void viewProperty(CreateViewStatement.Raw stmt) throws RecognitionException {
        /* 623 */
        this.gParser.viewProperty(stmt);
        /*     */
    }

    public ListRolesStatement listUsersStatement() throws RecognitionException {
        /* 625 */
        return this.gParser.listUsersStatement();
        /*     */
    }

    public void usingClauseObjective(Attributes.Raw attrs) throws RecognitionException {
        /* 627 */
        this.gParser.usingClauseObjective(attrs);
        /*     */
    }

    public Selectable.Raw collectionSubSelection(Selectable.Raw receiver) throws RecognitionException {
        /* 629 */
        return this.gParser.collectionSubSelection(receiver);
        /*     */
    }

    public Set<Permission> permissionOrAll() throws RecognitionException {
        /* 631 */
        return this.gParser.permissionOrAll();
        /*     */
    }

    public UpdateStatement.ParsedInsert normalInsertStatement(QualifiedName qn) throws RecognitionException {
        /* 633 */
        return this.gParser.normalInsertStatement(qn);
        /*     */
    }

    public void tableColumns(CreateTableStatement.Raw stmt) throws RecognitionException {
        /* 635 */
        this.gParser.tableColumns(stmt);
        /*     */
    }

    public DropRoleStatement dropUserStatement() throws RecognitionException {
        /* 637 */
        return this.gParser.dropUserStatement();
        /*     */
    }

    public Term.Raw function() throws RecognitionException {
        /* 639 */
        return this.gParser.function();
        /*     */
    }

    public Cql_Parser.mbean_return mbean() throws RecognitionException {
        /* 641 */
        return this.gParser.mbean();
        /*     */
    }

    public DropTriggerStatement.Raw dropTriggerStatement() throws RecognitionException {
        /* 643 */
        return this.gParser.dropTriggerStatement();
        /*     */
    }

    public IResource resource() throws RecognitionException {
        /* 645 */
        return this.gParser.resource();
        /*     */
    }

    public CreateAggregateStatement.Raw createAggregateStatement() throws RecognitionException {
        /* 647 */
        return this.gParser.createAggregateStatement();
        /*     */
    }

    public DropTypeStatement.Raw dropTypeStatement() throws RecognitionException {
        /* 649 */
        return this.gParser.dropTypeStatement();
        /*     */
    }

    public List<RawSelector> selectors() throws RecognitionException {
        /* 651 */
        return this.gParser.selectors();
        /*     */
    }

    public RevokePermissionsStatement revokePermissionsStatement() throws RecognitionException {
        /* 653 */
        return this.gParser.revokePermissionsStatement();
        /*     */
    }

    public Selectable.Raw selectionFunction() throws RecognitionException {
        /* 655 */
        return this.gParser.selectionFunction();
        /*     */
    }

    public void properties(PropertyDefinitions props) throws RecognitionException {
        /* 657 */
        this.gParser.properties(props);
        /*     */
    }

    public JMXResource jmxResource() throws RecognitionException {
        /* 659 */
        return this.gParser.jmxResource();
        /*     */
    }

    public void viewPartitionKey(CreateViewStatement.Raw stmt) throws RecognitionException {
        /* 661 */
        this.gParser.viewPartitionKey(stmt);
        /*     */
    }

    public Selectable.Raw selectionAddition() throws RecognitionException {
        /* 663 */
        return this.gParser.selectionAddition();
        /*     */
    }

    public TruncateStatement truncateStatement() throws RecognitionException {
        /* 665 */
        return this.gParser.truncateStatement();
        /*     */
    }

    public CreateViewStatement.Raw createMaterializedViewStatement() throws RecognitionException {
        /* 667 */
        return this.gParser.createMaterializedViewStatement();
        /*     */
    }

    public void relation(WhereClause.Builder clauses) throws RecognitionException {
        /* 669 */
        this.gParser.relation(clauses);
        /*     */
    }

    public List<Term.Raw> functionArgs() throws RecognitionException {
        /* 671 */
        return this.gParser.functionArgs();
        /*     */
    }

    public void relationOrExpression(WhereClause.Builder clause) throws RecognitionException {
        /* 673 */
        this.gParser.relationOrExpression(clause);
        /*     */
    }

    public void orderByClause(Map<ColumnIdentifier, Boolean> orderings) throws RecognitionException {
        /* 675 */
        this.gParser.orderByClause(orderings);
        /*     */
    }

    public ColumnIdentifier ident() throws RecognitionException {
        /* 677 */
        return this.gParser.ident();
        /*     */
    }

    public CreateTypeStatement.Raw createTypeStatement() throws RecognitionException {
        /* 679 */
        return this.gParser.createTypeStatement();
        /*     */
    }

    public void columnOperationDifferentiator(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException {
        /* 681 */
        this.gParser.columnOperationDifferentiator(operations, key);
        /*     */
    }

    public DeleteStatement.Parsed deleteStatement() throws RecognitionException {
        /* 683 */
        return this.gParser.deleteStatement();
        /*     */
    }

    public AlterRoleStatement alterUserStatement() throws RecognitionException {
        /* 685 */
        return this.gParser.alterUserStatement();
        /*     */
    }

    public Operation.RawDeletion deleteOp() throws RecognitionException {
        /* 687 */
        return this.gParser.deleteOp();
        /*     */
    }

    public Term.Raw setOrMapLiteral(Term.Raw t) throws RecognitionException {
        /* 689 */
        return this.gParser.setOrMapLiteral(t);
        /*     */
    }

    public String unreserved_function_keyword() throws RecognitionException {
        /* 691 */
        return this.gParser.unreserved_function_keyword();
        /*     */
    }

    public String basic_unreserved_keyword() throws RecognitionException {
        /* 693 */
        return this.gParser.basic_unreserved_keyword();
        /*     */
    }

    public Term.Raw value() throws RecognitionException {
        /* 695 */
        return this.gParser.value();
        /*     */
    }

    public Operator containsOperator() throws RecognitionException {
        /* 697 */
        return this.gParser.containsOperator();
        /*     */
    }

    public CreateTableStatement.Raw createTableStatement() throws RecognitionException {
        /* 699 */
        return this.gParser.createTableStatement();
        /*     */
    }

    public CreateTriggerStatement.Raw createTriggerStatement() throws RecognitionException {
        /* 701 */
        return this.gParser.createTriggerStatement();
        /*     */
    }

    public void ksName(QualifiedName name) throws RecognitionException {
        /* 703 */
        this.gParser.ksName(name);
        /*     */
    }

    public Term.Raw selectionLiteral() throws RecognitionException {
        /* 705 */
        return this.gParser.selectionLiteral();
        /*     */
    }

    public DropTableStatement.Raw dropTableStatement() throws RecognitionException {
        /* 707 */
        return this.gParser.dropTableStatement();
        /*     */
    }

    public RoleName userOrRoleName() throws RecognitionException {
        /* 709 */
        return this.gParser.userOrRoleName();
        /*     */
    }

    public FieldIdentifier fident() throws RecognitionException {
        /* 711 */
        return this.gParser.fident();
        /*     */
    }

    public Term.Raw termMultiplication() throws RecognitionException {
        /* 713 */
        return this.gParser.termMultiplication();
        /*     */
    }

    public UpdateStatement.ParsedUpdate updateStatement() throws RecognitionException {
        /* 715 */
        return this.gParser.updateStatement();
        /*     */
    }

    public String keyspaceName() throws RecognitionException {
        /* 717 */
        return this.gParser.keyspaceName();
        /*     */
    }

    public AlterKeyspaceStatement.Raw alterKeyspaceStatement() throws RecognitionException {
        /* 719 */
        return this.gParser.alterKeyspaceStatement();
        /*     */
    }

    public List<Tuples.Literal> tupleOfTupleLiterals() throws RecognitionException {
        /* 721 */
        return this.gParser.tupleOfTupleLiterals();
        /*     */
    }

    public ColumnIdentifier non_type_ident() throws RecognitionException {
        /* 723 */
        return this.gParser.non_type_ident();
        /*     */
    }

    public DropViewStatement.Raw dropMaterializedViewStatement() throws RecognitionException {
        /* 725 */
        return this.gParser.dropMaterializedViewStatement();
        /*     */
    }

    public Selectable.Raw selectionTupleOrNestedSelector() throws RecognitionException {
        /* 727 */
        return this.gParser.selectionTupleOrNestedSelector();
        /*     */
    }

    public DropAggregateStatement.Raw dropAggregateStatement() throws RecognitionException {
        /* 729 */
        return this.gParser.dropAggregateStatement();
        /*     */
    }

    public void indexIdent(List<IndexTarget.Raw> targets) throws RecognitionException {
        /* 731 */
        this.gParser.indexIdent(targets);
        /*     */
    }

    public BatchStatement.Parsed batchStatement() throws RecognitionException {
        /* 733 */
        return this.gParser.batchStatement();
        /*     */
    }

    public AlterRoleStatement alterRoleStatement() throws RecognitionException {
        /* 735 */
        return this.gParser.alterRoleStatement();
        /*     */
    }

    /*     */
    /*     */
    /* 739 */   public static final BitSet FOLLOW_cqlStatement_in_query77 = new BitSet(new long[]{0L, 0L, 0L, 524288L});
    /* 740 */   public static final BitSet FOLLOW_211_in_query80 = new BitSet(new long[]{0L, 0L, 0L, 524288L});
    /* 741 */   public static final BitSet FOLLOW_EOF_in_query84 = new BitSet(new long[]{2L});
    /*     */
}


/* Location:              C:\Users\Leo\Desktop\temp\apache-cassandra-4.1.9.jar!\org\apache\cassandra\cql3\CqlParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */