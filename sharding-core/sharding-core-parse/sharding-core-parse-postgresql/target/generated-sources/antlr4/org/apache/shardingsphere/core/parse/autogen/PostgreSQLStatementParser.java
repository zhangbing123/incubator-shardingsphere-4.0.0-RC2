// Generated from org\apache\shardingsphere\core\parse\autogen\PostgreSQLStatement.g4 by ANTLR 4.7.1
package org.apache.shardingsphere.core.parse.autogen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PostgreSQLStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, AND_=3, OR_=4, NOT_=5, TILDE_=6, VERTICAL_BAR_=7, AMPERSAND_=8, 
		SIGNED_LEFT_SHIFT_=9, SIGNED_RIGHT_SHIFT_=10, CARET_=11, MOD_=12, COLON_=13, 
		PLUS_=14, MINUS_=15, ASTERISK_=16, SLASH_=17, BACKSLASH_=18, DOT_=19, 
		DOT_ASTERISK_=20, SAFE_EQ_=21, DEQ_=22, EQ_=23, NEQ_=24, GT_=25, GTE_=26, 
		LT_=27, LTE_=28, POUND_=29, LP_=30, RP_=31, LBE_=32, RBE_=33, LBT_=34, 
		RBT_=35, COMMA_=36, DQ_=37, SQ_=38, BQ_=39, QUESTION_=40, AT_=41, SEMI_=42, 
		BLOCK_COMMENT=43, INLINE_COMMENT=44, WS=45, SELECT=46, INSERT=47, UPDATE=48, 
		DELETE=49, CREATE=50, ALTER=51, DROP=52, TRUNCATE=53, SCHEMA=54, GRANT=55, 
		REVOKE=56, ADD=57, SET=58, TABLE=59, COLUMN=60, INDEX=61, CONSTRAINT=62, 
		PRIMARY=63, UNIQUE=64, FOREIGN=65, KEY=66, POSITION=67, PRECISION=68, 
		FUNCTION=69, TRIGGER=70, PROCEDURE=71, VIEW=72, INTO=73, VALUES=74, WITH=75, 
		UNION=76, DISTINCT=77, CASE=78, WHEN=79, CAST=80, TRIM=81, SUBSTRING=82, 
		FROM=83, NATURAL=84, JOIN=85, FULL=86, INNER=87, OUTER=88, LEFT=89, RIGHT=90, 
		CROSS=91, USING=92, WHERE=93, AS=94, ON=95, IF=96, ELSE=97, THEN=98, FOR=99, 
		TO=100, AND=101, OR=102, IS=103, NOT=104, NULL=105, TRUE=106, FALSE=107, 
		EXISTS=108, BETWEEN=109, IN=110, ALL=111, ANY=112, LIKE=113, ORDER=114, 
		GROUP=115, BY=116, ASC=117, DESC=118, HAVING=119, LIMIT=120, OFFSET=121, 
		BEGIN=122, COMMIT=123, ROLLBACK=124, SAVEPOINT=125, BOOLEAN=126, DOUBLE=127, 
		CHAR=128, CHARACTER=129, ARRAY=130, INTERVAL=131, DATE=132, TIME=133, 
		TIMESTAMP=134, LOCALTIME=135, LOCALTIMESTAMP=136, YEAR=137, QUARTER=138, 
		MONTH=139, WEEK=140, DAY=141, HOUR=142, MINUTE=143, SECOND=144, MICROSECOND=145, 
		MAX=146, MIN=147, SUM=148, COUNT=149, AVG=150, DEFAULT=151, CURRENT=152, 
		ENABLE=153, DISABLE=154, CALL=155, INSTANCE=156, PRESERVE=157, DO=158, 
		DEFINER=159, CURRENT_USER=160, SQL=161, CASCADED=162, LOCAL=163, CLOSE=164, 
		OPEN=165, NEXT=166, NAME=167, FOR_GENERATOR=168, ADMIN=169, BINARY=170, 
		ESCAPE=171, EXCLUDE=172, MOD=173, PARTITION=174, ROW=175, UNKNOWN=176, 
		ALWAYS=177, CASCADE=178, CHECK=179, GENERATED=180, ISOLATION=181, LEVEL=182, 
		NO=183, OPTION=184, PRIVILEGES=185, READ=186, REFERENCES=187, ROLE=188, 
		ROWS=189, START=190, TRANSACTION=191, USER=192, ACTION=193, CACHE=194, 
		CHARACTERISTICS=195, CLUSTER=196, COLLATE=197, COMMENTS=198, CONCURRENTLY=199, 
		CONNECT=200, CONSTRAINTS=201, CURRENT_TIMESTAMP=202, CYCLE=203, DATA=204, 
		DATABASE=205, DEFAULTS=206, DEFERRABLE=207, DEFERRED=208, DEPENDS=209, 
		DOMAIN=210, EXCLUDING=211, EXECUTE=212, EXTENDED=213, EXTENSION=214, EXTERNAL=215, 
		EXTRACT=216, FILTER=217, FIRST=218, FOLLOWING=219, FORCE=220, GLOBAL=221, 
		IDENTITY=222, IMMEDIATE=223, INCLUDING=224, INCREMENT=225, INDEXES=226, 
		INHERIT=227, INHERITS=228, INITIALLY=229, INCLUDE=230, LANGUAGE=231, LARGE=232, 
		LAST=233, LOGGED=234, MAIN=235, MATCH=236, MAXVALUE=237, MINVALUE=238, 
		NOTHING=239, NULLS=240, OBJECT=241, OIDS=242, ONLY=243, OVER=244, OWNED=245, 
		OWNER=246, PARTIAL=247, PLAIN=248, PRECEDING=249, RANGE=250, RENAME=251, 
		REPLICA=252, RESET=253, RESTART=254, RESTRICT=255, ROUTINE=256, RULE=257, 
		SECURITY=258, SEQUENCE=259, SESSION=260, SESSION_USER=261, SHOW=262, SIMPLE=263, 
		STATISTICS=264, STORAGE=265, TABLESPACE=266, TEMP=267, TEMPORARY=268, 
		TYPE=269, UNBOUNDED=270, UNLOGGED=271, USAGE=272, VALID=273, VALIDATE=274, 
		WITHIN=275, WITHOUT=276, ZONE=277, OF=278, UESCAPE=279, GROUPS=280, RECURSIVE=281, 
		IDENTIFIER_=282, STRING_=283, NUMBER_=284, HEX_DIGIT_=285, BIT_NUM_=286;
	public static final int
		RULE_execute = 0, RULE_insert = 1, RULE_insertValuesClause = 2, RULE_insertSelectClause = 3, 
		RULE_update = 4, RULE_updateSpecification_ = 5, RULE_assignment = 6, RULE_setAssignmentsClause = 7, 
		RULE_assignmentValues = 8, RULE_assignmentValue = 9, RULE_delete = 10, 
		RULE_deleteSpecification_ = 11, RULE_singleTableClause_ = 12, RULE_multipleTablesClause_ = 13, 
		RULE_multipleTableNames_ = 14, RULE_select = 15, RULE_unionClause_ = 16, 
		RULE_selectClause = 17, RULE_duplicateSpecification = 18, RULE_selectItems = 19, 
		RULE_selectItem = 20, RULE_alias = 21, RULE_unqualifiedShorthand = 22, 
		RULE_qualifiedShorthand = 23, RULE_fromClause = 24, RULE_tableReferences = 25, 
		RULE_tableReference = 26, RULE_tableFactor = 27, RULE_joinedTable = 28, 
		RULE_joinSpecification = 29, RULE_whereClause = 30, RULE_groupByClause = 31, 
		RULE_havingClause = 32, RULE_limitClause = 33, RULE_limitRowCountSyntax_ = 34, 
		RULE_limitRowCount = 35, RULE_limitOffsetSyntax_ = 36, RULE_limitOffset = 37, 
		RULE_subquery = 38, RULE_parameterMarker = 39, RULE_literals = 40, RULE_stringLiterals = 41, 
		RULE_numberLiterals = 42, RULE_hexadecimalLiterals = 43, RULE_bitValueLiterals = 44, 
		RULE_booleanLiterals = 45, RULE_nullValueLiterals = 46, RULE_literalsType_ = 47, 
		RULE_identifier_ = 48, RULE_unicodeEscapes_ = 49, RULE_uescape_ = 50, 
		RULE_unreservedWord_ = 51, RULE_schemaName = 52, RULE_tableName = 53, 
		RULE_columnName = 54, RULE_owner = 55, RULE_name = 56, RULE_tableNames = 57, 
		RULE_columnNames = 58, RULE_collationName = 59, RULE_indexName = 60, RULE_primaryKey = 61, 
		RULE_expr = 62, RULE_logicalOperator = 63, RULE_notOperator_ = 64, RULE_booleanPrimary_ = 65, 
		RULE_comparisonOperator = 66, RULE_predicate = 67, RULE_bitExpr = 68, 
		RULE_simpleExpr = 69, RULE_functionCall = 70, RULE_aggregationFunction = 71, 
		RULE_aggregationFunctionName_ = 72, RULE_distinct = 73, RULE_filterClause_ = 74, 
		RULE_windowFunction_ = 75, RULE_windowDefinition_ = 76, RULE_pratitionClause_ = 77, 
		RULE_frameClause_ = 78, RULE_frameStart_ = 79, RULE_frameEnd_ = 80, RULE_frameBetween_ = 81, 
		RULE_specialFunction_ = 82, RULE_castFunction_ = 83, RULE_charFunction_ = 84, 
		RULE_regularFunction_ = 85, RULE_regularFunctionName_ = 86, RULE_caseExpression_ = 87, 
		RULE_caseWhen_ = 88, RULE_caseElse_ = 89, RULE_orderByClause = 90, RULE_orderByItem = 91, 
		RULE_dataType = 92, RULE_dataTypeName_ = 93, RULE_dataTypeLength = 94, 
		RULE_characterSet_ = 95, RULE_collateClause_ = 96, RULE_ignoredIdentifier_ = 97, 
		RULE_ignoredIdentifiers_ = 98, RULE_createTable = 99, RULE_createIndex = 100, 
		RULE_alterTable = 101, RULE_alterIndex = 102, RULE_dropTable = 103, RULE_dropIndex = 104, 
		RULE_truncateTable = 105, RULE_createTableSpecification_ = 106, RULE_tableNotExistClause_ = 107, 
		RULE_createDefinitionClause_ = 108, RULE_createDefinition = 109, RULE_columnDefinition = 110, 
		RULE_columnConstraint = 111, RULE_constraintClause = 112, RULE_columnConstraintOption = 113, 
		RULE_checkOption = 114, RULE_defaultExpr = 115, RULE_sequenceOptions = 116, 
		RULE_sequenceOption = 117, RULE_indexParameters = 118, RULE_action = 119, 
		RULE_constraintOptionalParam = 120, RULE_likeOption = 121, RULE_tableConstraint = 122, 
		RULE_tableConstraintOption = 123, RULE_inheritClause_ = 124, RULE_createIndexSpecification_ = 125, 
		RULE_concurrentlyClause_ = 126, RULE_indexNotExistClause_ = 127, RULE_onlyClause_ = 128, 
		RULE_tableExistClause_ = 129, RULE_asteriskClause_ = 130, RULE_alterDefinitionClause_ = 131, 
		RULE_alterIndexDefinitionClause_ = 132, RULE_renameIndexSpecification = 133, 
		RULE_alterIndexDependsOnExtension = 134, RULE_alterIndexSetTableSpace = 135, 
		RULE_tableNamesClause = 136, RULE_tableNameClause = 137, RULE_alterTableActions = 138, 
		RULE_alterTableAction = 139, RULE_addColumnSpecification = 140, RULE_dropColumnSpecification = 141, 
		RULE_columnExistClause_ = 142, RULE_modifyColumnSpecification = 143, RULE_modifyColumn = 144, 
		RULE_alterColumnSetOption = 145, RULE_attributeOptions = 146, RULE_attributeOption = 147, 
		RULE_addConstraintSpecification = 148, RULE_tableConstraintUsingIndex = 149, 
		RULE_storageParameterWithValue = 150, RULE_storageParameter = 151, RULE_renameColumnSpecification = 152, 
		RULE_renameConstraint = 153, RULE_renameTableSpecification_ = 154, RULE_indexExistClause_ = 155, 
		RULE_indexNames = 156, RULE_setTransaction = 157, RULE_beginTransaction = 158, 
		RULE_commit = 159, RULE_rollback = 160, RULE_savepoint = 161, RULE_grant = 162, 
		RULE_revoke = 163, RULE_privilegeClause_ = 164, RULE_roleClause_ = 165, 
		RULE_optionForClause_ = 166, RULE_privileges_ = 167, RULE_privilegeType_ = 168, 
		RULE_onObjectClause_ = 169, RULE_createUser = 170, RULE_dropUser = 171, 
		RULE_alterUser = 172, RULE_createRole = 173, RULE_dropRole = 174, RULE_alterRole = 175, 
		RULE_show = 176, RULE_set = 177, RULE_runtimeScope_ = 178, RULE_timeZoneClause_ = 179, 
		RULE_configurationParameterClause_ = 180, RULE_resetParameter = 181, RULE_call = 182;
	public static final String[] ruleNames = {
		"execute", "insert", "insertValuesClause", "insertSelectClause", "update", 
		"updateSpecification_", "assignment", "setAssignmentsClause", "assignmentValues", 
		"assignmentValue", "delete", "deleteSpecification_", "singleTableClause_", 
		"multipleTablesClause_", "multipleTableNames_", "select", "unionClause_", 
		"selectClause", "duplicateSpecification", "selectItems", "selectItem", 
		"alias", "unqualifiedShorthand", "qualifiedShorthand", "fromClause", "tableReferences", 
		"tableReference", "tableFactor", "joinedTable", "joinSpecification", "whereClause", 
		"groupByClause", "havingClause", "limitClause", "limitRowCountSyntax_", 
		"limitRowCount", "limitOffsetSyntax_", "limitOffset", "subquery", "parameterMarker", 
		"literals", "stringLiterals", "numberLiterals", "hexadecimalLiterals", 
		"bitValueLiterals", "booleanLiterals", "nullValueLiterals", "literalsType_", 
		"identifier_", "unicodeEscapes_", "uescape_", "unreservedWord_", "schemaName", 
		"tableName", "columnName", "owner", "name", "tableNames", "columnNames", 
		"collationName", "indexName", "primaryKey", "expr", "logicalOperator", 
		"notOperator_", "booleanPrimary_", "comparisonOperator", "predicate", 
		"bitExpr", "simpleExpr", "functionCall", "aggregationFunction", "aggregationFunctionName_", 
		"distinct", "filterClause_", "windowFunction_", "windowDefinition_", "pratitionClause_", 
		"frameClause_", "frameStart_", "frameEnd_", "frameBetween_", "specialFunction_", 
		"castFunction_", "charFunction_", "regularFunction_", "regularFunctionName_", 
		"caseExpression_", "caseWhen_", "caseElse_", "orderByClause", "orderByItem", 
		"dataType", "dataTypeName_", "dataTypeLength", "characterSet_", "collateClause_", 
		"ignoredIdentifier_", "ignoredIdentifiers_", "createTable", "createIndex", 
		"alterTable", "alterIndex", "dropTable", "dropIndex", "truncateTable", 
		"createTableSpecification_", "tableNotExistClause_", "createDefinitionClause_", 
		"createDefinition", "columnDefinition", "columnConstraint", "constraintClause", 
		"columnConstraintOption", "checkOption", "defaultExpr", "sequenceOptions", 
		"sequenceOption", "indexParameters", "action", "constraintOptionalParam", 
		"likeOption", "tableConstraint", "tableConstraintOption", "inheritClause_", 
		"createIndexSpecification_", "concurrentlyClause_", "indexNotExistClause_", 
		"onlyClause_", "tableExistClause_", "asteriskClause_", "alterDefinitionClause_", 
		"alterIndexDefinitionClause_", "renameIndexSpecification", "alterIndexDependsOnExtension", 
		"alterIndexSetTableSpace", "tableNamesClause", "tableNameClause", "alterTableActions", 
		"alterTableAction", "addColumnSpecification", "dropColumnSpecification", 
		"columnExistClause_", "modifyColumnSpecification", "modifyColumn", "alterColumnSetOption", 
		"attributeOptions", "attributeOption", "addConstraintSpecification", "tableConstraintUsingIndex", 
		"storageParameterWithValue", "storageParameter", "renameColumnSpecification", 
		"renameConstraint", "renameTableSpecification_", "indexExistClause_", 
		"indexNames", "setTransaction", "beginTransaction", "commit", "rollback", 
		"savepoint", "grant", "revoke", "privilegeClause_", "roleClause_", "optionForClause_", 
		"privileges_", "privilegeType_", "onObjectClause_", "createUser", "dropUser", 
		"alterUser", "createRole", "dropRole", "alterRole", "show", "set", "runtimeScope_", 
		"timeZoneClause_", "configurationParameterClause_", "resetParameter", 
		"call"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'U'", "'u'", "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", 
		"'>>'", "'^'", "'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", 
		"'.*'", "'<=>'", "'=='", "'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", 
		"'?'", "'@'", "';'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "AND_", "OR_", "NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", 
		"SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", "COLON_", 
		"PLUS_", "MINUS_", "ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOT_ASTERISK_", 
		"SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", 
		"LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", 
		"BQ_", "QUESTION_", "AT_", "SEMI_", "BLOCK_COMMENT", "INLINE_COMMENT", 
		"WS", "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "ALTER", "DROP", 
		"TRUNCATE", "SCHEMA", "GRANT", "REVOKE", "ADD", "SET", "TABLE", "COLUMN", 
		"INDEX", "CONSTRAINT", "PRIMARY", "UNIQUE", "FOREIGN", "KEY", "POSITION", 
		"PRECISION", "FUNCTION", "TRIGGER", "PROCEDURE", "VIEW", "INTO", "VALUES", 
		"WITH", "UNION", "DISTINCT", "CASE", "WHEN", "CAST", "TRIM", "SUBSTRING", 
		"FROM", "NATURAL", "JOIN", "FULL", "INNER", "OUTER", "LEFT", "RIGHT", 
		"CROSS", "USING", "WHERE", "AS", "ON", "IF", "ELSE", "THEN", "FOR", "TO", 
		"AND", "OR", "IS", "NOT", "NULL", "TRUE", "FALSE", "EXISTS", "BETWEEN", 
		"IN", "ALL", "ANY", "LIKE", "ORDER", "GROUP", "BY", "ASC", "DESC", "HAVING", 
		"LIMIT", "OFFSET", "BEGIN", "COMMIT", "ROLLBACK", "SAVEPOINT", "BOOLEAN", 
		"DOUBLE", "CHAR", "CHARACTER", "ARRAY", "INTERVAL", "DATE", "TIME", "TIMESTAMP", 
		"LOCALTIME", "LOCALTIMESTAMP", "YEAR", "QUARTER", "MONTH", "WEEK", "DAY", 
		"HOUR", "MINUTE", "SECOND", "MICROSECOND", "MAX", "MIN", "SUM", "COUNT", 
		"AVG", "DEFAULT", "CURRENT", "ENABLE", "DISABLE", "CALL", "INSTANCE", 
		"PRESERVE", "DO", "DEFINER", "CURRENT_USER", "SQL", "CASCADED", "LOCAL", 
		"CLOSE", "OPEN", "NEXT", "NAME", "FOR_GENERATOR", "ADMIN", "BINARY", "ESCAPE", 
		"EXCLUDE", "MOD", "PARTITION", "ROW", "UNKNOWN", "ALWAYS", "CASCADE", 
		"CHECK", "GENERATED", "ISOLATION", "LEVEL", "NO", "OPTION", "PRIVILEGES", 
		"READ", "REFERENCES", "ROLE", "ROWS", "START", "TRANSACTION", "USER", 
		"ACTION", "CACHE", "CHARACTERISTICS", "CLUSTER", "COLLATE", "COMMENTS", 
		"CONCURRENTLY", "CONNECT", "CONSTRAINTS", "CURRENT_TIMESTAMP", "CYCLE", 
		"DATA", "DATABASE", "DEFAULTS", "DEFERRABLE", "DEFERRED", "DEPENDS", "DOMAIN", 
		"EXCLUDING", "EXECUTE", "EXTENDED", "EXTENSION", "EXTERNAL", "EXTRACT", 
		"FILTER", "FIRST", "FOLLOWING", "FORCE", "GLOBAL", "IDENTITY", "IMMEDIATE", 
		"INCLUDING", "INCREMENT", "INDEXES", "INHERIT", "INHERITS", "INITIALLY", 
		"INCLUDE", "LANGUAGE", "LARGE", "LAST", "LOGGED", "MAIN", "MATCH", "MAXVALUE", 
		"MINVALUE", "NOTHING", "NULLS", "OBJECT", "OIDS", "ONLY", "OVER", "OWNED", 
		"OWNER", "PARTIAL", "PLAIN", "PRECEDING", "RANGE", "RENAME", "REPLICA", 
		"RESET", "RESTART", "RESTRICT", "ROUTINE", "RULE", "SECURITY", "SEQUENCE", 
		"SESSION", "SESSION_USER", "SHOW", "SIMPLE", "STATISTICS", "STORAGE", 
		"TABLESPACE", "TEMP", "TEMPORARY", "TYPE", "UNBOUNDED", "UNLOGGED", "USAGE", 
		"VALID", "VALIDATE", "WITHIN", "WITHOUT", "ZONE", "OF", "UESCAPE", "GROUPS", 
		"RECURSIVE", "IDENTIFIER_", "STRING_", "NUMBER_", "HEX_DIGIT_", "BIT_NUM_"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PostgreSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PostgreSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExecuteContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public AlterIndexContext alterIndex() {
			return getRuleContext(AlterIndexContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public TruncateTableContext truncateTable() {
			return getRuleContext(TruncateTableContext.class,0);
		}
		public SetTransactionContext setTransaction() {
			return getRuleContext(SetTransactionContext.class,0);
		}
		public BeginTransactionContext beginTransaction() {
			return getRuleContext(BeginTransactionContext.class,0);
		}
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
		}
		public SavepointContext savepoint() {
			return getRuleContext(SavepointContext.class,0);
		}
		public GrantContext grant() {
			return getRuleContext(GrantContext.class,0);
		}
		public RevokeContext revoke() {
			return getRuleContext(RevokeContext.class,0);
		}
		public CreateUserContext createUser() {
			return getRuleContext(CreateUserContext.class,0);
		}
		public DropUserContext dropUser() {
			return getRuleContext(DropUserContext.class,0);
		}
		public AlterUserContext alterUser() {
			return getRuleContext(AlterUserContext.class,0);
		}
		public CreateRoleContext createRole() {
			return getRuleContext(CreateRoleContext.class,0);
		}
		public DropRoleContext dropRole() {
			return getRuleContext(DropRoleContext.class,0);
		}
		public AlterRoleContext alterRole() {
			return getRuleContext(AlterRoleContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public ResetParameterContext resetParameter() {
			return getRuleContext(ResetParameterContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(PostgreSQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_execute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(366);
				select();
				}
				break;
			case 2:
				{
				setState(367);
				insert();
				}
				break;
			case 3:
				{
				setState(368);
				update();
				}
				break;
			case 4:
				{
				setState(369);
				delete();
				}
				break;
			case 5:
				{
				setState(370);
				createIndex();
				}
				break;
			case 6:
				{
				setState(371);
				alterIndex();
				}
				break;
			case 7:
				{
				setState(372);
				dropIndex();
				}
				break;
			case 8:
				{
				setState(373);
				createTable();
				}
				break;
			case 9:
				{
				setState(374);
				alterTable();
				}
				break;
			case 10:
				{
				setState(375);
				dropTable();
				}
				break;
			case 11:
				{
				setState(376);
				truncateTable();
				}
				break;
			case 12:
				{
				setState(377);
				setTransaction();
				}
				break;
			case 13:
				{
				setState(378);
				beginTransaction();
				}
				break;
			case 14:
				{
				setState(379);
				commit();
				}
				break;
			case 15:
				{
				setState(380);
				rollback();
				}
				break;
			case 16:
				{
				setState(381);
				savepoint();
				}
				break;
			case 17:
				{
				setState(382);
				grant();
				}
				break;
			case 18:
				{
				setState(383);
				revoke();
				}
				break;
			case 19:
				{
				setState(384);
				createUser();
				}
				break;
			case 20:
				{
				setState(385);
				dropUser();
				}
				break;
			case 21:
				{
				setState(386);
				alterUser();
				}
				break;
			case 22:
				{
				setState(387);
				createRole();
				}
				break;
			case 23:
				{
				setState(388);
				dropRole();
				}
				break;
			case 24:
				{
				setState(389);
				alterRole();
				}
				break;
			case 25:
				{
				setState(390);
				show();
				}
				break;
			case 26:
				{
				setState(391);
				set();
				}
				break;
			case 27:
				{
				setState(392);
				resetParameter();
				}
				break;
			case 28:
				{
				setState(393);
				call();
				}
				break;
			}
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(396);
				match(SEMI_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(PostgreSQLStatementParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(PostgreSQLStatementParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public InsertValuesClauseContext insertValuesClause() {
			return getRuleContext(InsertValuesClauseContext.class,0);
		}
		public InsertSelectClauseContext insertSelectClause() {
			return getRuleContext(InsertSelectClauseContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(INSERT);
			setState(400);
			match(INTO);
			setState(401);
			tableName();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << ALTER) | (1L << DROP) | (1L << TRUNCATE) | (1L << SCHEMA) | (1L << REVOKE) | (1L << ADD) | (1L << SET) | (1L << INDEX))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (KEY - 66)) | (1L << (FUNCTION - 66)) | (1L << (TRIGGER - 66)) | (1L << (PROCEDURE - 66)) | (1L << (AS - 66)) | (1L << (IF - 66)) | (1L << (BEGIN - 66)) | (1L << (COMMIT - 66)) | (1L << (ROLLBACK - 66)) | (1L << (SAVEPOINT - 66)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (YEAR - 137)) | (1L << (MONTH - 137)) | (1L << (DAY - 137)) | (1L << (HOUR - 137)) | (1L << (MINUTE - 137)) | (1L << (SECOND - 137)) | (1L << (CURRENT - 137)) | (1L << (ENABLE - 137)) | (1L << (DISABLE - 137)) | (1L << (INSTANCE - 137)) | (1L << (PRESERVE - 137)) | (1L << (DEFINER - 137)) | (1L << (SQL - 137)) | (1L << (CASCADED - 137)) | (1L << (LOCAL - 137)) | (1L << (CLOSE - 137)) | (1L << (OPEN - 137)) | (1L << (NEXT - 137)) | (1L << (NAME - 137)) | (1L << (ADMIN - 137)) | (1L << (ESCAPE - 137)) | (1L << (EXCLUDE - 137)) | (1L << (PARTITION - 137)) | (1L << (UNKNOWN - 137)) | (1L << (ALWAYS - 137)) | (1L << (CASCADE - 137)) | (1L << (GENERATED - 137)) | (1L << (ISOLATION - 137)) | (1L << (LEVEL - 137)) | (1L << (OPTION - 137)) | (1L << (PRIVILEGES - 137)) | (1L << (READ - 137)) | (1L << (ROLE - 137)) | (1L << (ROWS - 137)) | (1L << (START - 137)) | (1L << (TRANSACTION - 137)) | (1L << (ACTION - 137)) | (1L << (CACHE - 137)) | (1L << (CHARACTERISTICS - 137)) | (1L << (CLUSTER - 137)) | (1L << (COMMENTS - 137)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (CONSTRAINTS - 201)) | (1L << (CYCLE - 201)) | (1L << (DATA - 201)) | (1L << (DATABASE - 201)) | (1L << (DEFAULTS - 201)) | (1L << (DEFERRED - 201)) | (1L << (DEPENDS - 201)) | (1L << (DOMAIN - 201)) | (1L << (EXCLUDING - 201)) | (1L << (EXECUTE - 201)) | (1L << (EXTENDED - 201)) | (1L << (EXTENSION - 201)) | (1L << (EXTERNAL - 201)) | (1L << (EXTRACT - 201)) | (1L << (FILTER - 201)) | (1L << (FIRST - 201)) | (1L << (FOLLOWING - 201)) | (1L << (FORCE - 201)) | (1L << (GLOBAL - 201)) | (1L << (IDENTITY - 201)) | (1L << (IMMEDIATE - 201)) | (1L << (INCLUDING - 201)) | (1L << (INCREMENT - 201)) | (1L << (INDEXES - 201)) | (1L << (INHERIT - 201)) | (1L << (INHERITS - 201)) | (1L << (INCLUDE - 201)) | (1L << (LANGUAGE - 201)) | (1L << (LARGE - 201)) | (1L << (LAST - 201)) | (1L << (LOGGED - 201)) | (1L << (MAIN - 201)) | (1L << (MATCH - 201)) | (1L << (MAXVALUE - 201)) | (1L << (MINVALUE - 201)) | (1L << (NOTHING - 201)) | (1L << (NULLS - 201)) | (1L << (OBJECT - 201)) | (1L << (OIDS - 201)) | (1L << (OVER - 201)) | (1L << (OWNED - 201)) | (1L << (OWNER - 201)) | (1L << (PARTIAL - 201)) | (1L << (PLAIN - 201)) | (1L << (PRECEDING - 201)) | (1L << (RANGE - 201)) | (1L << (RENAME - 201)) | (1L << (REPLICA - 201)) | (1L << (RESET - 201)) | (1L << (RESTART - 201)) | (1L << (RESTRICT - 201)) | (1L << (ROUTINE - 201)) | (1L << (RULE - 201)) | (1L << (SECURITY - 201)) | (1L << (SEQUENCE - 201)) | (1L << (SESSION - 201)) | (1L << (SHOW - 201)) | (1L << (SIMPLE - 201)) | (1L << (STATISTICS - 201)))) != 0) || ((((_la - 265)) & ~0x3f) == 0 && ((1L << (_la - 265)) & ((1L << (STORAGE - 265)) | (1L << (TABLESPACE - 265)) | (1L << (TEMP - 265)) | (1L << (TEMPORARY - 265)) | (1L << (TYPE - 265)) | (1L << (UNBOUNDED - 265)) | (1L << (UNLOGGED - 265)) | (1L << (USAGE - 265)) | (1L << (VALID - 265)) | (1L << (VALIDATE - 265)) | (1L << (WITHIN - 265)) | (1L << (WITHOUT - 265)) | (1L << (ZONE - 265)) | (1L << (OF - 265)) | (1L << (GROUPS - 265)) | (1L << (RECURSIVE - 265)) | (1L << (IDENTIFIER_ - 265)) | (1L << (STRING_ - 265)))) != 0)) {
				{
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(402);
					match(AS);
					}
				}

				setState(405);
				alias();
				}
			}

			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(408);
				insertValuesClause();
				}
				break;
			case 2:
				{
				setState(409);
				insertSelectClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertValuesClauseContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(PostgreSQLStatementParser.VALUES, 0); }
		public List<AssignmentValuesContext> assignmentValues() {
			return getRuleContexts(AssignmentValuesContext.class);
		}
		public AssignmentValuesContext assignmentValues(int i) {
			return getRuleContext(AssignmentValuesContext.class,i);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public InsertValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValuesClause; }
	}

	public final InsertValuesClauseContext insertValuesClause() throws RecognitionException {
		InsertValuesClauseContext _localctx = new InsertValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertValuesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(412);
				columnNames();
				}
			}

			setState(415);
			match(VALUES);
			setState(416);
			assignmentValues();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(417);
				match(COMMA_);
				setState(418);
				assignmentValues();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertSelectClauseContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public InsertSelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSelectClause; }
	}

	public final InsertSelectClauseContext insertSelectClause() throws RecognitionException {
		InsertSelectClauseContext _localctx = new InsertSelectClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_insertSelectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(424);
				columnNames();
				}
			}

			setState(427);
			select();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(PostgreSQLStatementParser.UPDATE, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
		}
		public UpdateSpecification_Context updateSpecification_() {
			return getRuleContext(UpdateSpecification_Context.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(UPDATE);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(430);
				updateSpecification_();
				}
			}

			setState(433);
			tableReferences();
			setState(434);
			setAssignmentsClause();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(435);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateSpecification_Context extends ParserRuleContext {
		public TerminalNode ONLY() { return getToken(PostgreSQLStatementParser.ONLY, 0); }
		public UpdateSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSpecification_; }
	}

	public final UpdateSpecification_Context updateSpecification_() throws RecognitionException {
		UpdateSpecification_Context _localctx = new UpdateSpecification_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_updateSpecification_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(ONLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public AssignmentValueContext assignmentValue() {
			return getRuleContext(AssignmentValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			columnName();
			setState(441);
			match(EQ_);
			setState(442);
			assignmentValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetAssignmentsClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public SetAssignmentsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAssignmentsClause; }
	}

	public final SetAssignmentsClauseContext setAssignmentsClause() throws RecognitionException {
		SetAssignmentsClauseContext _localctx = new SetAssignmentsClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setAssignmentsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(SET);
			setState(445);
			assignment();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(446);
				match(COMMA_);
				setState(447);
				assignment();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentValuesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<AssignmentValueContext> assignmentValue() {
			return getRuleContexts(AssignmentValueContext.class);
		}
		public AssignmentValueContext assignmentValue(int i) {
			return getRuleContext(AssignmentValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public AssignmentValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValues; }
	}

	public final AssignmentValuesContext assignmentValues() throws RecognitionException {
		AssignmentValuesContext _localctx = new AssignmentValuesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentValues);
		int _la;
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				match(LP_);
				setState(454);
				assignmentValue();
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(455);
					match(COMMA_);
					setState(456);
					assignmentValue();
					}
					}
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(462);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(LP_);
				setState(465);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValue; }
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentValue);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case CHAR:
			case INTERVAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case ADMIN:
			case BINARY:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CURRENT_TIMESTAMP:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case TYPE:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				expr(0);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(PostgreSQLStatementParser.DELETE, 0); }
		public SingleTableClause_Context singleTableClause_() {
			return getRuleContext(SingleTableClause_Context.class,0);
		}
		public MultipleTablesClause_Context multipleTablesClause_() {
			return getRuleContext(MultipleTablesClause_Context.class,0);
		}
		public DeleteSpecification_Context deleteSpecification_() {
			return getRuleContext(DeleteSpecification_Context.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(DELETE);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(473);
				deleteSpecification_();
				}
			}

			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(476);
				singleTableClause_();
				}
				break;
			case 2:
				{
				setState(477);
				multipleTablesClause_();
				}
				break;
			}
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(480);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteSpecification_Context extends ParserRuleContext {
		public TerminalNode ONLY() { return getToken(PostgreSQLStatementParser.ONLY, 0); }
		public DeleteSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteSpecification_; }
	}

	public final DeleteSpecification_Context deleteSpecification_() throws RecognitionException {
		DeleteSpecification_Context _localctx = new DeleteSpecification_Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_deleteSpecification_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(ONLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableClause_Context extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PostgreSQLStatementParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public SingleTableClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableClause_; }
	}

	public final SingleTableClause_Context singleTableClause_() throws RecognitionException {
		SingleTableClause_Context _localctx = new SingleTableClause_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_singleTableClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(FROM);
			setState(486);
			tableName();
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << ALTER) | (1L << DROP) | (1L << TRUNCATE) | (1L << SCHEMA) | (1L << REVOKE) | (1L << ADD) | (1L << SET) | (1L << INDEX))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (KEY - 66)) | (1L << (FUNCTION - 66)) | (1L << (TRIGGER - 66)) | (1L << (PROCEDURE - 66)) | (1L << (AS - 66)) | (1L << (IF - 66)) | (1L << (BEGIN - 66)) | (1L << (COMMIT - 66)) | (1L << (ROLLBACK - 66)) | (1L << (SAVEPOINT - 66)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (YEAR - 137)) | (1L << (MONTH - 137)) | (1L << (DAY - 137)) | (1L << (HOUR - 137)) | (1L << (MINUTE - 137)) | (1L << (SECOND - 137)) | (1L << (CURRENT - 137)) | (1L << (ENABLE - 137)) | (1L << (DISABLE - 137)) | (1L << (INSTANCE - 137)) | (1L << (PRESERVE - 137)) | (1L << (DEFINER - 137)) | (1L << (SQL - 137)) | (1L << (CASCADED - 137)) | (1L << (LOCAL - 137)) | (1L << (CLOSE - 137)) | (1L << (OPEN - 137)) | (1L << (NEXT - 137)) | (1L << (NAME - 137)) | (1L << (ADMIN - 137)) | (1L << (ESCAPE - 137)) | (1L << (EXCLUDE - 137)) | (1L << (PARTITION - 137)) | (1L << (UNKNOWN - 137)) | (1L << (ALWAYS - 137)) | (1L << (CASCADE - 137)) | (1L << (GENERATED - 137)) | (1L << (ISOLATION - 137)) | (1L << (LEVEL - 137)) | (1L << (OPTION - 137)) | (1L << (PRIVILEGES - 137)) | (1L << (READ - 137)) | (1L << (ROLE - 137)) | (1L << (ROWS - 137)) | (1L << (START - 137)) | (1L << (TRANSACTION - 137)) | (1L << (ACTION - 137)) | (1L << (CACHE - 137)) | (1L << (CHARACTERISTICS - 137)) | (1L << (CLUSTER - 137)) | (1L << (COMMENTS - 137)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (CONSTRAINTS - 201)) | (1L << (CYCLE - 201)) | (1L << (DATA - 201)) | (1L << (DATABASE - 201)) | (1L << (DEFAULTS - 201)) | (1L << (DEFERRED - 201)) | (1L << (DEPENDS - 201)) | (1L << (DOMAIN - 201)) | (1L << (EXCLUDING - 201)) | (1L << (EXECUTE - 201)) | (1L << (EXTENDED - 201)) | (1L << (EXTENSION - 201)) | (1L << (EXTERNAL - 201)) | (1L << (EXTRACT - 201)) | (1L << (FILTER - 201)) | (1L << (FIRST - 201)) | (1L << (FOLLOWING - 201)) | (1L << (FORCE - 201)) | (1L << (GLOBAL - 201)) | (1L << (IDENTITY - 201)) | (1L << (IMMEDIATE - 201)) | (1L << (INCLUDING - 201)) | (1L << (INCREMENT - 201)) | (1L << (INDEXES - 201)) | (1L << (INHERIT - 201)) | (1L << (INHERITS - 201)) | (1L << (INCLUDE - 201)) | (1L << (LANGUAGE - 201)) | (1L << (LARGE - 201)) | (1L << (LAST - 201)) | (1L << (LOGGED - 201)) | (1L << (MAIN - 201)) | (1L << (MATCH - 201)) | (1L << (MAXVALUE - 201)) | (1L << (MINVALUE - 201)) | (1L << (NOTHING - 201)) | (1L << (NULLS - 201)) | (1L << (OBJECT - 201)) | (1L << (OIDS - 201)) | (1L << (OVER - 201)) | (1L << (OWNED - 201)) | (1L << (OWNER - 201)) | (1L << (PARTIAL - 201)) | (1L << (PLAIN - 201)) | (1L << (PRECEDING - 201)) | (1L << (RANGE - 201)) | (1L << (RENAME - 201)) | (1L << (REPLICA - 201)) | (1L << (RESET - 201)) | (1L << (RESTART - 201)) | (1L << (RESTRICT - 201)) | (1L << (ROUTINE - 201)) | (1L << (RULE - 201)) | (1L << (SECURITY - 201)) | (1L << (SEQUENCE - 201)) | (1L << (SESSION - 201)) | (1L << (SHOW - 201)) | (1L << (SIMPLE - 201)) | (1L << (STATISTICS - 201)))) != 0) || ((((_la - 265)) & ~0x3f) == 0 && ((1L << (_la - 265)) & ((1L << (STORAGE - 265)) | (1L << (TABLESPACE - 265)) | (1L << (TEMP - 265)) | (1L << (TEMPORARY - 265)) | (1L << (TYPE - 265)) | (1L << (UNBOUNDED - 265)) | (1L << (UNLOGGED - 265)) | (1L << (USAGE - 265)) | (1L << (VALID - 265)) | (1L << (VALIDATE - 265)) | (1L << (WITHIN - 265)) | (1L << (WITHOUT - 265)) | (1L << (ZONE - 265)) | (1L << (OF - 265)) | (1L << (GROUPS - 265)) | (1L << (RECURSIVE - 265)) | (1L << (IDENTIFIER_ - 265)) | (1L << (STRING_ - 265)))) != 0)) {
				{
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(487);
					match(AS);
					}
				}

				setState(490);
				alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipleTablesClause_Context extends ParserRuleContext {
		public MultipleTableNames_Context multipleTableNames_() {
			return getRuleContext(MultipleTableNames_Context.class,0);
		}
		public TerminalNode FROM() { return getToken(PostgreSQLStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public MultipleTablesClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTablesClause_; }
	}

	public final MultipleTablesClause_Context multipleTablesClause_() throws RecognitionException {
		MultipleTablesClause_Context _localctx = new MultipleTablesClause_Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_multipleTablesClause_);
		try {
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case IF:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case ADMIN:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case TYPE:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				multipleTableNames_();
				setState(494);
				match(FROM);
				setState(495);
				tableReferences();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(FROM);
				setState(498);
				multipleTableNames_();
				setState(499);
				match(USING);
				setState(500);
				tableReferences();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipleTableNames_Context extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public List<TerminalNode> DOT_ASTERISK_() { return getTokens(PostgreSQLStatementParser.DOT_ASTERISK_); }
		public TerminalNode DOT_ASTERISK_(int i) {
			return getToken(PostgreSQLStatementParser.DOT_ASTERISK_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public MultipleTableNames_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTableNames_; }
	}

	public final MultipleTableNames_Context multipleTableNames_() throws RecognitionException {
		MultipleTableNames_Context _localctx = new MultipleTableNames_Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_multipleTableNames_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			tableName();
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_ASTERISK_) {
				{
				setState(505);
				match(DOT_ASTERISK_);
				}
			}

			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(508);
				match(COMMA_);
				setState(509);
				tableName();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_ASTERISK_) {
					{
					setState(510);
					match(DOT_ASTERISK_);
					}
				}

				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public UnionClause_Context unionClause_() {
			return getRuleContext(UnionClause_Context.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			unionClause_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionClause_Context extends ParserRuleContext {
		public List<SelectClauseContext> selectClause() {
			return getRuleContexts(SelectClauseContext.class);
		}
		public SelectClauseContext selectClause(int i) {
			return getRuleContext(SelectClauseContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(PostgreSQLStatementParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(PostgreSQLStatementParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(PostgreSQLStatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(PostgreSQLStatementParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(PostgreSQLStatementParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(PostgreSQLStatementParser.DISTINCT, i);
		}
		public UnionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionClause_; }
	}

	public final UnionClause_Context unionClause_() throws RecognitionException {
		UnionClause_Context _localctx = new UnionClause_Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_unionClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			selectClause();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(521);
				match(UNION);
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT || _la==ALL) {
					{
					setState(522);
					_la = _input.LA(1);
					if ( !(_la==DISTINCT || _la==ALL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(525);
				selectClause();
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(PostgreSQLStatementParser.SELECT, 0); }
		public SelectItemsContext selectItems() {
			return getRuleContext(SelectItemsContext.class,0);
		}
		public DuplicateSpecificationContext duplicateSpecification() {
			return getRuleContext(DuplicateSpecificationContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(SELECT);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(532);
				duplicateSpecification();
				}
			}

			setState(535);
			selectItems();
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(536);
				fromClause();
				}
			}

			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(539);
				whereClause();
				}
			}

			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(542);
				groupByClause();
				}
			}

			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(545);
				havingClause();
				}
			}

			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(548);
				orderByClause();
				}
			}

			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT || _la==OFFSET) {
				{
				setState(551);
				limitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DuplicateSpecificationContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(PostgreSQLStatementParser.DISTINCT, 0); }
		public DuplicateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplicateSpecification; }
	}

	public final DuplicateSpecificationContext duplicateSpecification() throws RecognitionException {
		DuplicateSpecificationContext _localctx = new DuplicateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_duplicateSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_la = _input.LA(1);
			if ( !(_la==DISTINCT || _la==ALL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemsContext extends ParserRuleContext {
		public UnqualifiedShorthandContext unqualifiedShorthand() {
			return getRuleContext(UnqualifiedShorthandContext.class,0);
		}
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public SelectItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItems; }
	}

	public final SelectItemsContext selectItems() throws RecognitionException {
		SelectItemsContext _localctx = new SelectItemsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_selectItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK_:
				{
				setState(556);
				unqualifiedShorthand();
				}
				break;
			case T__0:
			case T__1:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case CHAR:
			case INTERVAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case ADMIN:
			case BINARY:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CURRENT_TIMESTAMP:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case TYPE:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(557);
				selectItem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(560);
				match(COMMA_);
				setState(561);
				selectItem();
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public QualifiedShorthandContext qualifiedShorthand() {
			return getRuleContext(QualifiedShorthandContext.class,0);
		}
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_selectItem);
		int _la;
		try {
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(567);
					columnName();
					}
					break;
				case 2:
					{
					setState(568);
					expr(0);
					}
					break;
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << ALTER) | (1L << DROP) | (1L << TRUNCATE) | (1L << SCHEMA) | (1L << REVOKE) | (1L << ADD) | (1L << SET) | (1L << INDEX))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (KEY - 66)) | (1L << (FUNCTION - 66)) | (1L << (TRIGGER - 66)) | (1L << (PROCEDURE - 66)) | (1L << (AS - 66)) | (1L << (IF - 66)) | (1L << (BEGIN - 66)) | (1L << (COMMIT - 66)) | (1L << (ROLLBACK - 66)) | (1L << (SAVEPOINT - 66)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (YEAR - 137)) | (1L << (MONTH - 137)) | (1L << (DAY - 137)) | (1L << (HOUR - 137)) | (1L << (MINUTE - 137)) | (1L << (SECOND - 137)) | (1L << (CURRENT - 137)) | (1L << (ENABLE - 137)) | (1L << (DISABLE - 137)) | (1L << (INSTANCE - 137)) | (1L << (PRESERVE - 137)) | (1L << (DEFINER - 137)) | (1L << (SQL - 137)) | (1L << (CASCADED - 137)) | (1L << (LOCAL - 137)) | (1L << (CLOSE - 137)) | (1L << (OPEN - 137)) | (1L << (NEXT - 137)) | (1L << (NAME - 137)) | (1L << (ADMIN - 137)) | (1L << (ESCAPE - 137)) | (1L << (EXCLUDE - 137)) | (1L << (PARTITION - 137)) | (1L << (UNKNOWN - 137)) | (1L << (ALWAYS - 137)) | (1L << (CASCADE - 137)) | (1L << (GENERATED - 137)) | (1L << (ISOLATION - 137)) | (1L << (LEVEL - 137)) | (1L << (OPTION - 137)) | (1L << (PRIVILEGES - 137)) | (1L << (READ - 137)) | (1L << (ROLE - 137)) | (1L << (ROWS - 137)) | (1L << (START - 137)) | (1L << (TRANSACTION - 137)) | (1L << (ACTION - 137)) | (1L << (CACHE - 137)) | (1L << (CHARACTERISTICS - 137)) | (1L << (CLUSTER - 137)) | (1L << (COMMENTS - 137)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (CONSTRAINTS - 201)) | (1L << (CYCLE - 201)) | (1L << (DATA - 201)) | (1L << (DATABASE - 201)) | (1L << (DEFAULTS - 201)) | (1L << (DEFERRED - 201)) | (1L << (DEPENDS - 201)) | (1L << (DOMAIN - 201)) | (1L << (EXCLUDING - 201)) | (1L << (EXECUTE - 201)) | (1L << (EXTENDED - 201)) | (1L << (EXTENSION - 201)) | (1L << (EXTERNAL - 201)) | (1L << (EXTRACT - 201)) | (1L << (FILTER - 201)) | (1L << (FIRST - 201)) | (1L << (FOLLOWING - 201)) | (1L << (FORCE - 201)) | (1L << (GLOBAL - 201)) | (1L << (IDENTITY - 201)) | (1L << (IMMEDIATE - 201)) | (1L << (INCLUDING - 201)) | (1L << (INCREMENT - 201)) | (1L << (INDEXES - 201)) | (1L << (INHERIT - 201)) | (1L << (INHERITS - 201)) | (1L << (INCLUDE - 201)) | (1L << (LANGUAGE - 201)) | (1L << (LARGE - 201)) | (1L << (LAST - 201)) | (1L << (LOGGED - 201)) | (1L << (MAIN - 201)) | (1L << (MATCH - 201)) | (1L << (MAXVALUE - 201)) | (1L << (MINVALUE - 201)) | (1L << (NOTHING - 201)) | (1L << (NULLS - 201)) | (1L << (OBJECT - 201)) | (1L << (OIDS - 201)) | (1L << (OVER - 201)) | (1L << (OWNED - 201)) | (1L << (OWNER - 201)) | (1L << (PARTIAL - 201)) | (1L << (PLAIN - 201)) | (1L << (PRECEDING - 201)) | (1L << (RANGE - 201)) | (1L << (RENAME - 201)) | (1L << (REPLICA - 201)) | (1L << (RESET - 201)) | (1L << (RESTART - 201)) | (1L << (RESTRICT - 201)) | (1L << (ROUTINE - 201)) | (1L << (RULE - 201)) | (1L << (SECURITY - 201)) | (1L << (SEQUENCE - 201)) | (1L << (SESSION - 201)) | (1L << (SHOW - 201)) | (1L << (SIMPLE - 201)) | (1L << (STATISTICS - 201)))) != 0) || ((((_la - 265)) & ~0x3f) == 0 && ((1L << (_la - 265)) & ((1L << (STORAGE - 265)) | (1L << (TABLESPACE - 265)) | (1L << (TEMP - 265)) | (1L << (TEMPORARY - 265)) | (1L << (TYPE - 265)) | (1L << (UNBOUNDED - 265)) | (1L << (UNLOGGED - 265)) | (1L << (USAGE - 265)) | (1L << (VALID - 265)) | (1L << (VALIDATE - 265)) | (1L << (WITHIN - 265)) | (1L << (WITHOUT - 265)) | (1L << (ZONE - 265)) | (1L << (OF - 265)) | (1L << (GROUPS - 265)) | (1L << (RECURSIVE - 265)) | (1L << (IDENTIFIER_ - 265)) | (1L << (STRING_ - 265)))) != 0)) {
					{
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(571);
						match(AS);
						}
					}

					setState(574);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				qualifiedShorthand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_alias);
		try {
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case IF:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case ADMIN:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case TYPE:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				identifier_();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnqualifiedShorthandContext extends ParserRuleContext {
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public UnqualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedShorthand; }
	}

	public final UnqualifiedShorthandContext unqualifiedShorthand() throws RecognitionException {
		UnqualifiedShorthandContext _localctx = new UnqualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unqualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(ASTERISK_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedShorthandContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode DOT_ASTERISK_() { return getToken(PostgreSQLStatementParser.DOT_ASTERISK_, 0); }
		public QualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedShorthand; }
	}

	public final QualifiedShorthandContext qualifiedShorthand() throws RecognitionException {
		QualifiedShorthandContext _localctx = new QualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_qualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			identifier_();
			setState(587);
			match(DOT_ASTERISK_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PostgreSQLStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(FROM);
			setState(590);
			tableReferences();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableReferencesContext extends ParserRuleContext {
		public List<TableReferenceContext> tableReference() {
			return getRuleContexts(TableReferenceContext.class);
		}
		public TableReferenceContext tableReference(int i) {
			return getRuleContext(TableReferenceContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			tableReference();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(593);
				match(COMMA_);
				setState(594);
				tableReference();
				}
				}
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableReferenceContext extends ParserRuleContext {
		public List<TableFactorContext> tableFactor() {
			return getRuleContexts(TableFactorContext.class);
		}
		public TableFactorContext tableFactor(int i) {
			return getRuleContext(TableFactorContext.class,i);
		}
		public List<JoinedTableContext> joinedTable() {
			return getRuleContexts(JoinedTableContext.class);
		}
		public JoinedTableContext joinedTable(int i) {
			return getRuleContext(JoinedTableContext.class,i);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tableReference);
		int _la;
		try {
			int _alt;
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(603); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(600);
						tableFactor();
						setState(601);
						joinedTable();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(605); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				tableFactor();
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (NATURAL - 84)) | (1L << (JOIN - 84)) | (1L << (FULL - 84)) | (1L << (INNER - 84)) | (1L << (LEFT - 84)) | (1L << (RIGHT - 84)) | (1L << (CROSS - 84)))) != 0)) {
					{
					{
					setState(608);
					joinedTable();
					}
					}
					setState(613);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableFactorContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tableFactor);
		int _la;
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				tableName();
				setState(621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(618);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(617);
						match(AS);
						}
					}

					setState(620);
					alias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				subquery();
				setState(625);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(624);
					columnNames();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
				match(LP_);
				setState(628);
				tableReferences();
				setState(629);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinedTableContext extends ParserRuleContext {
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(PostgreSQLStatementParser.JOIN, 0); }
		public TerminalNode NATURAL() { return getToken(PostgreSQLStatementParser.NATURAL, 0); }
		public JoinSpecificationContext joinSpecification() {
			return getRuleContext(JoinSpecificationContext.class,0);
		}
		public TerminalNode INNER() { return getToken(PostgreSQLStatementParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(PostgreSQLStatementParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(PostgreSQLStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(PostgreSQLStatementParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(PostgreSQLStatementParser.OUTER, 0); }
		public JoinedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinedTable; }
	}

	public final JoinedTableContext joinedTable() throws RecognitionException {
		JoinedTableContext _localctx = new JoinedTableContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_joinedTable);
		int _la;
		try {
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(633);
					match(NATURAL);
					}
				}

				{
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(636);
					_la = _input.LA(1);
					if ( !(_la==INNER || _la==CROSS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(639);
				match(JOIN);
				}
				setState(641);
				tableFactor();
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(642);
					joinSpecification();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(645);
					match(NATURAL);
					}
				}

				setState(648);
				_la = _input.LA(1);
				if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (FULL - 86)) | (1L << (LEFT - 86)) | (1L << (RIGHT - 86)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(649);
					match(OUTER);
					}
				}

				setState(652);
				match(JOIN);
				setState(653);
				tableFactor();
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(654);
					joinSpecification();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinSpecificationContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public JoinSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSpecification; }
	}

	public final JoinSpecificationContext joinSpecification() throws RecognitionException {
		JoinSpecificationContext _localctx = new JoinSpecificationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_joinSpecification);
		try {
			setState(663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				match(ON);
				setState(660);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				match(USING);
				setState(662);
				columnNames();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(PostgreSQLStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(WHERE);
			setState(666);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(PostgreSQLStatementParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(GROUP);
			setState(669);
			match(BY);
			setState(670);
			orderByItem();
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(671);
				match(COMMA_);
				setState(672);
				orderByItem();
				}
				}
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(PostgreSQLStatementParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(HAVING);
			setState(679);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public LimitRowCountSyntax_Context limitRowCountSyntax_() {
			return getRuleContext(LimitRowCountSyntax_Context.class,0);
		}
		public LimitOffsetSyntax_Context limitOffsetSyntax_() {
			return getRuleContext(LimitOffsetSyntax_Context.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_limitClause);
		int _la;
		try {
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				limitRowCountSyntax_();
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(682);
					limitOffsetSyntax_();
					}
				}

				}
				break;
			case OFFSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				limitOffsetSyntax_();
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(686);
					limitRowCountSyntax_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitRowCountSyntax_Context extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(PostgreSQLStatementParser.LIMIT, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public LimitRowCountContext limitRowCount() {
			return getRuleContext(LimitRowCountContext.class,0);
		}
		public LimitRowCountSyntax_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitRowCountSyntax_; }
	}

	public final LimitRowCountSyntax_Context limitRowCountSyntax_() throws RecognitionException {
		LimitRowCountSyntax_Context _localctx = new LimitRowCountSyntax_Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_limitRowCountSyntax_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(LIMIT);
			setState(694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(692);
				match(ALL);
				}
				break;
			case MINUS_:
			case QUESTION_:
			case NUMBER_:
				{
				setState(693);
				limitRowCount();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitRowCountContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LimitRowCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitRowCount; }
	}

	public final LimitRowCountContext limitRowCount() throws RecognitionException {
		LimitRowCountContext _localctx = new LimitRowCountContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_limitRowCount);
		try {
			setState(698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				numberLiterals();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				parameterMarker();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitOffsetSyntax_Context extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(PostgreSQLStatementParser.OFFSET, 0); }
		public LimitOffsetContext limitOffset() {
			return getRuleContext(LimitOffsetContext.class,0);
		}
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(PostgreSQLStatementParser.ROWS, 0); }
		public LimitOffsetSyntax_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitOffsetSyntax_; }
	}

	public final LimitOffsetSyntax_Context limitOffsetSyntax_() throws RecognitionException {
		LimitOffsetSyntax_Context _localctx = new LimitOffsetSyntax_Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_limitOffsetSyntax_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(OFFSET);
			setState(701);
			limitOffset();
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(702);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitOffsetContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LimitOffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitOffset; }
	}

	public final LimitOffsetContext limitOffset() throws RecognitionException {
		LimitOffsetContext _localctx = new LimitOffsetContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_limitOffset);
		try {
			setState(707);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				numberLiterals();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				parameterMarker();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public UnionClause_Context unionClause_() {
			return getRuleContext(UnionClause_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(LP_);
			setState(710);
			unionClause_();
			setState(711);
			match(RP_);
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(712);
				match(AS);
				}
				break;
			}
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(715);
				alias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterMarkerContext extends ParserRuleContext {
		public TerminalNode QUESTION_() { return getToken(PostgreSQLStatementParser.QUESTION_, 0); }
		public LiteralsType_Context literalsType_() {
			return getRuleContext(LiteralsType_Context.class,0);
		}
		public ParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMarker; }
	}

	public final ParameterMarkerContext parameterMarker() throws RecognitionException {
		ParameterMarkerContext _localctx = new ParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(QUESTION_);
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(719);
				literalsType_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralsContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public HexadecimalLiteralsContext hexadecimalLiterals() {
			return getRuleContext(HexadecimalLiteralsContext.class,0);
		}
		public BitValueLiteralsContext bitValueLiterals() {
			return getRuleContext(BitValueLiteralsContext.class,0);
		}
		public BooleanLiteralsContext booleanLiterals() {
			return getRuleContext(BooleanLiteralsContext.class,0);
		}
		public NullValueLiteralsContext nullValueLiterals() {
			return getRuleContext(NullValueLiteralsContext.class,0);
		}
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_literals);
		try {
			setState(728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				stringLiterals();
				}
				break;
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				numberLiterals();
				}
				break;
			case HEX_DIGIT_:
				enterOuterAlt(_localctx, 3);
				{
				setState(724);
				hexadecimalLiterals();
				}
				break;
			case BIT_NUM_:
				enterOuterAlt(_localctx, 4);
				{
				setState(725);
				bitValueLiterals();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(726);
				booleanLiterals();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(727);
				nullValueLiterals();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public UnicodeEscapes_Context unicodeEscapes_() {
			return getRuleContext(UnicodeEscapes_Context.class,0);
		}
		public LiteralsType_Context literalsType_() {
			return getRuleContext(LiteralsType_Context.class,0);
		}
		public Uescape_Context uescape_() {
			return getRuleContext(Uescape_Context.class,0);
		}
		public StringLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiterals; }
	}

	public final StringLiteralsContext stringLiterals() throws RecognitionException {
		StringLiteralsContext _localctx = new StringLiteralsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_stringLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(730);
				unicodeEscapes_();
				}
			}

			setState(733);
			match(STRING_);
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(734);
				literalsType_();
				}
				break;
			}
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(737);
				uescape_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralsContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public TerminalNode MINUS_() { return getToken(PostgreSQLStatementParser.MINUS_, 0); }
		public LiteralsType_Context literalsType_() {
			return getRuleContext(LiteralsType_Context.class,0);
		}
		public NumberLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiterals; }
	}

	public final NumberLiteralsContext numberLiterals() throws RecognitionException {
		NumberLiteralsContext _localctx = new NumberLiteralsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_numberLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_) {
				{
				setState(740);
				match(MINUS_);
				}
			}

			setState(743);
			match(NUMBER_);
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(744);
				literalsType_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HexadecimalLiteralsContext extends ParserRuleContext {
		public TerminalNode HEX_DIGIT_() { return getToken(PostgreSQLStatementParser.HEX_DIGIT_, 0); }
		public HexadecimalLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiterals; }
	}

	public final HexadecimalLiteralsContext hexadecimalLiterals() throws RecognitionException {
		HexadecimalLiteralsContext _localctx = new HexadecimalLiteralsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_hexadecimalLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(HEX_DIGIT_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitValueLiteralsContext extends ParserRuleContext {
		public TerminalNode BIT_NUM_() { return getToken(PostgreSQLStatementParser.BIT_NUM_, 0); }
		public BitValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitValueLiterals; }
	}

	public final BitValueLiteralsContext bitValueLiterals() throws RecognitionException {
		BitValueLiteralsContext _localctx = new BitValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_bitValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(BIT_NUM_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralsContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PostgreSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PostgreSQLStatementParser.FALSE, 0); }
		public BooleanLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiterals; }
	}

	public final BooleanLiteralsContext booleanLiterals() throws RecognitionException {
		BooleanLiteralsContext _localctx = new BooleanLiteralsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_booleanLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullValueLiteralsContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public NullValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValueLiterals; }
	}

	public final NullValueLiteralsContext nullValueLiterals() throws RecognitionException {
		NullValueLiteralsContext _localctx = new NullValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_nullValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralsType_Context extends ParserRuleContext {
		public List<TerminalNode> COLON_() { return getTokens(PostgreSQLStatementParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(PostgreSQLStatementParser.COLON_, i);
		}
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public LiteralsType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalsType_; }
	}

	public final LiteralsType_Context literalsType_() throws RecognitionException {
		LiteralsType_Context _localctx = new LiteralsType_Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_literalsType_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(COLON_);
			setState(756);
			match(COLON_);
			setState(757);
			match(IDENTIFIER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public UnicodeEscapes_Context unicodeEscapes_() {
			return getRuleContext(UnicodeEscapes_Context.class,0);
		}
		public Uescape_Context uescape_() {
			return getRuleContext(Uescape_Context.class,0);
		}
		public UnreservedWord_Context unreservedWord_() {
			return getRuleContext(UnreservedWord_Context.class,0);
		}
		public Identifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_; }
	}

	public final Identifier_Context identifier_() throws RecognitionException {
		Identifier_Context _localctx = new Identifier_Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_identifier_);
		int _la;
		try {
			setState(767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==T__1) {
					{
					setState(759);
					unicodeEscapes_();
					}
				}

				setState(762);
				match(IDENTIFIER_);
				setState(764);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(763);
					uescape_();
					}
					break;
				}
				}
				break;
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case IF:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case ADMIN:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case TYPE:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				unreservedWord_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnicodeEscapes_Context extends ParserRuleContext {
		public TerminalNode AMPERSAND_() { return getToken(PostgreSQLStatementParser.AMPERSAND_, 0); }
		public UnicodeEscapes_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unicodeEscapes_; }
	}

	public final UnicodeEscapes_Context unicodeEscapes_() throws RecognitionException {
		UnicodeEscapes_Context _localctx = new UnicodeEscapes_Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_unicodeEscapes_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(770);
			match(AMPERSAND_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Uescape_Context extends ParserRuleContext {
		public TerminalNode UESCAPE() { return getToken(PostgreSQLStatementParser.UESCAPE, 0); }
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public Uescape_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uescape_; }
	}

	public final Uescape_Context uescape_() throws RecognitionException {
		Uescape_Context _localctx = new Uescape_Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_uescape_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(UESCAPE);
			setState(773);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnreservedWord_Context extends ParserRuleContext {
		public TerminalNode ADMIN() { return getToken(PostgreSQLStatementParser.ADMIN, 0); }
		public TerminalNode ESCAPE() { return getToken(PostgreSQLStatementParser.ESCAPE, 0); }
		public TerminalNode EXCLUDE() { return getToken(PostgreSQLStatementParser.EXCLUDE, 0); }
		public TerminalNode KEY() { return getToken(PostgreSQLStatementParser.KEY, 0); }
		public TerminalNode PARTITION() { return getToken(PostgreSQLStatementParser.PARTITION, 0); }
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode UNKNOWN() { return getToken(PostgreSQLStatementParser.UNKNOWN, 0); }
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode COMMIT() { return getToken(PostgreSQLStatementParser.COMMIT, 0); }
		public TerminalNode CURRENT() { return getToken(PostgreSQLStatementParser.CURRENT, 0); }
		public TerminalNode DAY() { return getToken(PostgreSQLStatementParser.DAY, 0); }
		public TerminalNode DELETE() { return getToken(PostgreSQLStatementParser.DELETE, 0); }
		public TerminalNode DISABLE() { return getToken(PostgreSQLStatementParser.DISABLE, 0); }
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode ENABLE() { return getToken(PostgreSQLStatementParser.ENABLE, 0); }
		public TerminalNode FUNCTION() { return getToken(PostgreSQLStatementParser.FUNCTION, 0); }
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public TerminalNode ISOLATION() { return getToken(PostgreSQLStatementParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(PostgreSQLStatementParser.LEVEL, 0); }
		public TerminalNode OPTION() { return getToken(PostgreSQLStatementParser.OPTION, 0); }
		public TerminalNode PRIVILEGES() { return getToken(PostgreSQLStatementParser.PRIVILEGES, 0); }
		public TerminalNode READ() { return getToken(PostgreSQLStatementParser.READ, 0); }
		public TerminalNode REVOKE() { return getToken(PostgreSQLStatementParser.REVOKE, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public TerminalNode ROLLBACK() { return getToken(PostgreSQLStatementParser.ROLLBACK, 0); }
		public TerminalNode ROWS() { return getToken(PostgreSQLStatementParser.ROWS, 0); }
		public TerminalNode START() { return getToken(PostgreSQLStatementParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public TerminalNode TRUNCATE() { return getToken(PostgreSQLStatementParser.TRUNCATE, 0); }
		public TerminalNode YEAR() { return getToken(PostgreSQLStatementParser.YEAR, 0); }
		public TerminalNode ACTION() { return getToken(PostgreSQLStatementParser.ACTION, 0); }
		public TerminalNode BEGIN() { return getToken(PostgreSQLStatementParser.BEGIN, 0); }
		public TerminalNode CACHE() { return getToken(PostgreSQLStatementParser.CACHE, 0); }
		public TerminalNode CHARACTERISTICS() { return getToken(PostgreSQLStatementParser.CHARACTERISTICS, 0); }
		public TerminalNode CLUSTER() { return getToken(PostgreSQLStatementParser.CLUSTER, 0); }
		public TerminalNode COMMENTS() { return getToken(PostgreSQLStatementParser.COMMENTS, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(PostgreSQLStatementParser.CONSTRAINTS, 0); }
		public TerminalNode CYCLE() { return getToken(PostgreSQLStatementParser.CYCLE, 0); }
		public TerminalNode DATA() { return getToken(PostgreSQLStatementParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(PostgreSQLStatementParser.DATABASE, 0); }
		public TerminalNode DEFAULTS() { return getToken(PostgreSQLStatementParser.DEFAULTS, 0); }
		public TerminalNode DEFERRED() { return getToken(PostgreSQLStatementParser.DEFERRED, 0); }
		public TerminalNode DEPENDS() { return getToken(PostgreSQLStatementParser.DEPENDS, 0); }
		public TerminalNode DOMAIN() { return getToken(PostgreSQLStatementParser.DOMAIN, 0); }
		public TerminalNode EXCLUDING() { return getToken(PostgreSQLStatementParser.EXCLUDING, 0); }
		public TerminalNode EXECUTE() { return getToken(PostgreSQLStatementParser.EXECUTE, 0); }
		public TerminalNode EXTENDED() { return getToken(PostgreSQLStatementParser.EXTENDED, 0); }
		public TerminalNode EXTENSION() { return getToken(PostgreSQLStatementParser.EXTENSION, 0); }
		public TerminalNode EXTERNAL() { return getToken(PostgreSQLStatementParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(PostgreSQLStatementParser.EXTRACT, 0); }
		public TerminalNode FILTER() { return getToken(PostgreSQLStatementParser.FILTER, 0); }
		public TerminalNode FIRST() { return getToken(PostgreSQLStatementParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(PostgreSQLStatementParser.FOLLOWING, 0); }
		public TerminalNode FORCE() { return getToken(PostgreSQLStatementParser.FORCE, 0); }
		public TerminalNode GLOBAL() { return getToken(PostgreSQLStatementParser.GLOBAL, 0); }
		public TerminalNode HOUR() { return getToken(PostgreSQLStatementParser.HOUR, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode IMMEDIATE() { return getToken(PostgreSQLStatementParser.IMMEDIATE, 0); }
		public TerminalNode INCLUDING() { return getToken(PostgreSQLStatementParser.INCLUDING, 0); }
		public TerminalNode INCREMENT() { return getToken(PostgreSQLStatementParser.INCREMENT, 0); }
		public TerminalNode INDEXES() { return getToken(PostgreSQLStatementParser.INDEXES, 0); }
		public TerminalNode INHERIT() { return getToken(PostgreSQLStatementParser.INHERIT, 0); }
		public TerminalNode INHERITS() { return getToken(PostgreSQLStatementParser.INHERITS, 0); }
		public TerminalNode INCLUDE() { return getToken(PostgreSQLStatementParser.INCLUDE, 0); }
		public TerminalNode INSERT() { return getToken(PostgreSQLStatementParser.INSERT, 0); }
		public TerminalNode LANGUAGE() { return getToken(PostgreSQLStatementParser.LANGUAGE, 0); }
		public TerminalNode LARGE() { return getToken(PostgreSQLStatementParser.LARGE, 0); }
		public TerminalNode LAST() { return getToken(PostgreSQLStatementParser.LAST, 0); }
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public TerminalNode LOGGED() { return getToken(PostgreSQLStatementParser.LOGGED, 0); }
		public TerminalNode MAIN() { return getToken(PostgreSQLStatementParser.MAIN, 0); }
		public TerminalNode MATCH() { return getToken(PostgreSQLStatementParser.MATCH, 0); }
		public TerminalNode MAXVALUE() { return getToken(PostgreSQLStatementParser.MAXVALUE, 0); }
		public TerminalNode MINVALUE() { return getToken(PostgreSQLStatementParser.MINVALUE, 0); }
		public TerminalNode MINUTE() { return getToken(PostgreSQLStatementParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(PostgreSQLStatementParser.MONTH, 0); }
		public TerminalNode NOTHING() { return getToken(PostgreSQLStatementParser.NOTHING, 0); }
		public TerminalNode NULLS() { return getToken(PostgreSQLStatementParser.NULLS, 0); }
		public TerminalNode OBJECT() { return getToken(PostgreSQLStatementParser.OBJECT, 0); }
		public TerminalNode OF() { return getToken(PostgreSQLStatementParser.OF, 0); }
		public TerminalNode OIDS() { return getToken(PostgreSQLStatementParser.OIDS, 0); }
		public TerminalNode OVER() { return getToken(PostgreSQLStatementParser.OVER, 0); }
		public TerminalNode OWNED() { return getToken(PostgreSQLStatementParser.OWNED, 0); }
		public TerminalNode OWNER() { return getToken(PostgreSQLStatementParser.OWNER, 0); }
		public TerminalNode PARTIAL() { return getToken(PostgreSQLStatementParser.PARTIAL, 0); }
		public TerminalNode PLAIN() { return getToken(PostgreSQLStatementParser.PLAIN, 0); }
		public TerminalNode PRECEDING() { return getToken(PostgreSQLStatementParser.PRECEDING, 0); }
		public TerminalNode PROCEDURE() { return getToken(PostgreSQLStatementParser.PROCEDURE, 0); }
		public TerminalNode RANGE() { return getToken(PostgreSQLStatementParser.RANGE, 0); }
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode REPLICA() { return getToken(PostgreSQLStatementParser.REPLICA, 0); }
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public TerminalNode RESTART() { return getToken(PostgreSQLStatementParser.RESTART, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode ROUTINE() { return getToken(PostgreSQLStatementParser.ROUTINE, 0); }
		public TerminalNode RULE() { return getToken(PostgreSQLStatementParser.RULE, 0); }
		public TerminalNode SAVEPOINT() { return getToken(PostgreSQLStatementParser.SAVEPOINT, 0); }
		public TerminalNode SCHEMA() { return getToken(PostgreSQLStatementParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(PostgreSQLStatementParser.SECOND, 0); }
		public TerminalNode SECURITY() { return getToken(PostgreSQLStatementParser.SECURITY, 0); }
		public TerminalNode SEQUENCE() { return getToken(PostgreSQLStatementParser.SEQUENCE, 0); }
		public TerminalNode SESSION() { return getToken(PostgreSQLStatementParser.SESSION, 0); }
		public TerminalNode SHOW() { return getToken(PostgreSQLStatementParser.SHOW, 0); }
		public TerminalNode SIMPLE() { return getToken(PostgreSQLStatementParser.SIMPLE, 0); }
		public TerminalNode STATISTICS() { return getToken(PostgreSQLStatementParser.STATISTICS, 0); }
		public TerminalNode STORAGE() { return getToken(PostgreSQLStatementParser.STORAGE, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public TerminalNode TEMP() { return getToken(PostgreSQLStatementParser.TEMP, 0); }
		public TerminalNode TEMPORARY() { return getToken(PostgreSQLStatementParser.TEMPORARY, 0); }
		public TerminalNode TRIGGER() { return getToken(PostgreSQLStatementParser.TRIGGER, 0); }
		public TerminalNode TYPE() { return getToken(PostgreSQLStatementParser.TYPE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(PostgreSQLStatementParser.UNBOUNDED, 0); }
		public TerminalNode UNLOGGED() { return getToken(PostgreSQLStatementParser.UNLOGGED, 0); }
		public TerminalNode UPDATE() { return getToken(PostgreSQLStatementParser.UPDATE, 0); }
		public TerminalNode USAGE() { return getToken(PostgreSQLStatementParser.USAGE, 0); }
		public TerminalNode VALID() { return getToken(PostgreSQLStatementParser.VALID, 0); }
		public TerminalNode VALIDATE() { return getToken(PostgreSQLStatementParser.VALIDATE, 0); }
		public TerminalNode WITHIN() { return getToken(PostgreSQLStatementParser.WITHIN, 0); }
		public TerminalNode WITHOUT() { return getToken(PostgreSQLStatementParser.WITHOUT, 0); }
		public TerminalNode ZONE() { return getToken(PostgreSQLStatementParser.ZONE, 0); }
		public TerminalNode GROUPS() { return getToken(PostgreSQLStatementParser.GROUPS, 0); }
		public TerminalNode RECURSIVE() { return getToken(PostgreSQLStatementParser.RECURSIVE, 0); }
		public TerminalNode INSTANCE() { return getToken(PostgreSQLStatementParser.INSTANCE, 0); }
		public TerminalNode DEFINER() { return getToken(PostgreSQLStatementParser.DEFINER, 0); }
		public TerminalNode PRESERVE() { return getToken(PostgreSQLStatementParser.PRESERVE, 0); }
		public TerminalNode SQL() { return getToken(PostgreSQLStatementParser.SQL, 0); }
		public TerminalNode CASCADED() { return getToken(PostgreSQLStatementParser.CASCADED, 0); }
		public TerminalNode CLOSE() { return getToken(PostgreSQLStatementParser.CLOSE, 0); }
		public TerminalNode OPEN() { return getToken(PostgreSQLStatementParser.OPEN, 0); }
		public TerminalNode NEXT() { return getToken(PostgreSQLStatementParser.NEXT, 0); }
		public TerminalNode NAME() { return getToken(PostgreSQLStatementParser.NAME, 0); }
		public UnreservedWord_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedWord_; }
	}

	public final UnreservedWord_Context unreservedWord_() throws RecognitionException {
		UnreservedWord_Context _localctx = new UnreservedWord_Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_unreservedWord_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (INSERT - 47)) | (1L << (UPDATE - 47)) | (1L << (DELETE - 47)) | (1L << (ALTER - 47)) | (1L << (DROP - 47)) | (1L << (TRUNCATE - 47)) | (1L << (SCHEMA - 47)) | (1L << (REVOKE - 47)) | (1L << (ADD - 47)) | (1L << (SET - 47)) | (1L << (INDEX - 47)) | (1L << (KEY - 47)) | (1L << (FUNCTION - 47)) | (1L << (TRIGGER - 47)) | (1L << (PROCEDURE - 47)) | (1L << (IF - 47)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (BEGIN - 122)) | (1L << (COMMIT - 122)) | (1L << (ROLLBACK - 122)) | (1L << (SAVEPOINT - 122)) | (1L << (YEAR - 122)) | (1L << (MONTH - 122)) | (1L << (DAY - 122)) | (1L << (HOUR - 122)) | (1L << (MINUTE - 122)) | (1L << (SECOND - 122)) | (1L << (CURRENT - 122)) | (1L << (ENABLE - 122)) | (1L << (DISABLE - 122)) | (1L << (INSTANCE - 122)) | (1L << (PRESERVE - 122)) | (1L << (DEFINER - 122)) | (1L << (SQL - 122)) | (1L << (CASCADED - 122)) | (1L << (LOCAL - 122)) | (1L << (CLOSE - 122)) | (1L << (OPEN - 122)) | (1L << (NEXT - 122)) | (1L << (NAME - 122)) | (1L << (ADMIN - 122)) | (1L << (ESCAPE - 122)) | (1L << (EXCLUDE - 122)) | (1L << (PARTITION - 122)) | (1L << (UNKNOWN - 122)) | (1L << (ALWAYS - 122)) | (1L << (CASCADE - 122)) | (1L << (GENERATED - 122)) | (1L << (ISOLATION - 122)) | (1L << (LEVEL - 122)) | (1L << (OPTION - 122)) | (1L << (PRIVILEGES - 122)))) != 0) || ((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (READ - 186)) | (1L << (ROLE - 186)) | (1L << (ROWS - 186)) | (1L << (START - 186)) | (1L << (TRANSACTION - 186)) | (1L << (ACTION - 186)) | (1L << (CACHE - 186)) | (1L << (CHARACTERISTICS - 186)) | (1L << (CLUSTER - 186)) | (1L << (COMMENTS - 186)) | (1L << (CONSTRAINTS - 186)) | (1L << (CYCLE - 186)) | (1L << (DATA - 186)) | (1L << (DATABASE - 186)) | (1L << (DEFAULTS - 186)) | (1L << (DEFERRED - 186)) | (1L << (DEPENDS - 186)) | (1L << (DOMAIN - 186)) | (1L << (EXCLUDING - 186)) | (1L << (EXECUTE - 186)) | (1L << (EXTENDED - 186)) | (1L << (EXTENSION - 186)) | (1L << (EXTERNAL - 186)) | (1L << (EXTRACT - 186)) | (1L << (FILTER - 186)) | (1L << (FIRST - 186)) | (1L << (FOLLOWING - 186)) | (1L << (FORCE - 186)) | (1L << (GLOBAL - 186)) | (1L << (IDENTITY - 186)) | (1L << (IMMEDIATE - 186)) | (1L << (INCLUDING - 186)) | (1L << (INCREMENT - 186)) | (1L << (INDEXES - 186)) | (1L << (INHERIT - 186)) | (1L << (INHERITS - 186)) | (1L << (INCLUDE - 186)) | (1L << (LANGUAGE - 186)) | (1L << (LARGE - 186)) | (1L << (LAST - 186)) | (1L << (LOGGED - 186)) | (1L << (MAIN - 186)) | (1L << (MATCH - 186)) | (1L << (MAXVALUE - 186)) | (1L << (MINVALUE - 186)) | (1L << (NOTHING - 186)) | (1L << (NULLS - 186)) | (1L << (OBJECT - 186)) | (1L << (OIDS - 186)) | (1L << (OVER - 186)) | (1L << (OWNED - 186)) | (1L << (OWNER - 186)) | (1L << (PARTIAL - 186)) | (1L << (PLAIN - 186)) | (1L << (PRECEDING - 186)))) != 0) || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (RANGE - 250)) | (1L << (RENAME - 250)) | (1L << (REPLICA - 250)) | (1L << (RESET - 250)) | (1L << (RESTART - 250)) | (1L << (RESTRICT - 250)) | (1L << (ROUTINE - 250)) | (1L << (RULE - 250)) | (1L << (SECURITY - 250)) | (1L << (SEQUENCE - 250)) | (1L << (SESSION - 250)) | (1L << (SHOW - 250)) | (1L << (SIMPLE - 250)) | (1L << (STATISTICS - 250)) | (1L << (STORAGE - 250)) | (1L << (TABLESPACE - 250)) | (1L << (TEMP - 250)) | (1L << (TEMPORARY - 250)) | (1L << (TYPE - 250)) | (1L << (UNBOUNDED - 250)) | (1L << (UNLOGGED - 250)) | (1L << (USAGE - 250)) | (1L << (VALID - 250)) | (1L << (VALIDATE - 250)) | (1L << (WITHIN - 250)) | (1L << (WITHOUT - 250)) | (1L << (ZONE - 250)) | (1L << (OF - 250)) | (1L << (GROUPS - 250)) | (1L << (RECURSIVE - 250)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaNameContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(PostgreSQLStatementParser.DOT_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(779);
				owner();
				setState(780);
				match(DOT_);
				}
				break;
			}
			setState(784);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(PostgreSQLStatementParser.DOT_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(786);
				owner();
				setState(787);
				match(DOT_);
				}
				break;
			}
			setState(791);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OwnerContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public OwnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_owner; }
	}

	public final OwnerContext owner() throws RecognitionException {
		OwnerContext _localctx = new OwnerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_owner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNamesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(797);
				match(LP_);
				}
			}

			setState(800);
			tableName();
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(801);
				match(COMMA_);
				setState(802);
				tableName();
				}
				}
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(808);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNamesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(LP_);
			setState(812);
			columnName();
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(813);
				match(COMMA_);
				setState(814);
				columnName();
				}
				}
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(820);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollationNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_collationName);
		try {
			setState(824);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				match(STRING_);
				}
				break;
			case T__0:
			case T__1:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case IF:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case ADMIN:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case TYPE:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				identifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexNameContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(PostgreSQLStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(PostgreSQLStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(828);
				match(PRIMARY);
				}
			}

			setState(831);
			match(KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public NotOperator_Context notOperator_() {
			return getRuleContext(NotOperator_Context.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public BooleanPrimary_Context booleanPrimary_() {
			return getRuleContext(BooleanPrimary_Context.class,0);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(834);
				notOperator_();
				setState(835);
				expr(3);
				}
				break;
			case 2:
				{
				setState(837);
				match(LP_);
				setState(838);
				expr(0);
				setState(839);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(841);
				booleanPrimary_(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(850);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(844);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(845);
					logicalOperator();
					setState(846);
					expr(5);
					}
					} 
				}
				setState(852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(PostgreSQLStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(PostgreSQLStatementParser.OR_, 0); }
		public TerminalNode AND() { return getToken(PostgreSQLStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(PostgreSQLStatementParser.AND_, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			_la = _input.LA(1);
			if ( !(_la==AND_ || _la==OR_ || _la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotOperator_Context extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(PostgreSQLStatementParser.NOT_, 0); }
		public NotOperator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator_; }
	}

	public final NotOperator_Context notOperator_() throws RecognitionException {
		NotOperator_Context _localctx = new NotOperator_Context(_ctx, getState());
		enterRule(_localctx, 128, RULE_notOperator_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			_la = _input.LA(1);
			if ( !(_la==NOT_ || _la==NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanPrimary_Context extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimary_Context booleanPrimary_() {
			return getRuleContext(BooleanPrimary_Context.class,0);
		}
		public TerminalNode IS() { return getToken(PostgreSQLStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(PostgreSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PostgreSQLStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(PostgreSQLStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(PostgreSQLStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(PostgreSQLStatementParser.ANY, 0); }
		public BooleanPrimary_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary_; }
	}

	public final BooleanPrimary_Context booleanPrimary_() throws RecognitionException {
		return booleanPrimary_(0);
	}

	private BooleanPrimary_Context booleanPrimary_(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanPrimary_Context _localctx = new BooleanPrimary_Context(_ctx, _parentState);
		BooleanPrimary_Context _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_booleanPrimary_, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(858);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(880);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(878);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(860);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(861);
						match(IS);
						setState(863);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(862);
							match(NOT);
							}
						}

						setState(865);
						_la = _input.LA(1);
						if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (NULL - 105)) | (1L << (TRUE - 105)) | (1L << (FALSE - 105)))) != 0) || _la==UNKNOWN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(866);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(867);
						match(SAFE_EQ_);
						setState(868);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(869);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(870);
						comparisonOperator();
						setState(871);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(873);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(874);
						comparisonOperator();
						setState(875);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(876);
						subquery();
						}
						break;
					}
					} 
				}
				setState(882);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(PostgreSQLStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(PostgreSQLStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(PostgreSQLStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(PostgreSQLStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(PostgreSQLStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ_) | (1L << NEQ_) | (1L << GT_) | (1L << GTE_) | (1L << LT_) | (1L << LTE_))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(PostgreSQLStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(PostgreSQLStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(PostgreSQLStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(PostgreSQLStatementParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(PostgreSQLStatementParser.ESCAPE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_predicate);
		int _la;
		try {
			setState(928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				bitExpr(0);
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(886);
					match(NOT);
					}
				}

				setState(889);
				match(IN);
				setState(890);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				bitExpr(0);
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(893);
					match(NOT);
					}
				}

				setState(896);
				match(IN);
				setState(897);
				match(LP_);
				setState(898);
				expr(0);
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(899);
					match(COMMA_);
					setState(900);
					expr(0);
					}
					}
					setState(905);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(906);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(908);
				bitExpr(0);
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(909);
					match(NOT);
					}
				}

				setState(912);
				match(BETWEEN);
				setState(913);
				bitExpr(0);
				setState(914);
				match(AND);
				setState(915);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(917);
				bitExpr(0);
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(918);
					match(NOT);
					}
				}

				setState(921);
				match(LIKE);
				setState(922);
				simpleExpr(0);
				setState(925);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(923);
					match(ESCAPE);
					setState(924);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(927);
				bitExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitExprContext extends ParserRuleContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode VERTICAL_BAR_() { return getToken(PostgreSQLStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(PostgreSQLStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(PostgreSQLStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(PostgreSQLStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(PostgreSQLStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(PostgreSQLStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(PostgreSQLStatementParser.SLASH_, 0); }
		public TerminalNode MOD_() { return getToken(PostgreSQLStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(PostgreSQLStatementParser.CARET_, 0); }
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		return bitExpr(0);
	}

	private BitExprContext bitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitExprContext _localctx = new BitExprContext(_ctx, _parentState);
		BitExprContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(931);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(965);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(963);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(933);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(934);
						match(VERTICAL_BAR_);
						setState(935);
						bitExpr(12);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(936);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(937);
						match(AMPERSAND_);
						setState(938);
						bitExpr(11);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(939);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(940);
						match(SIGNED_LEFT_SHIFT_);
						setState(941);
						bitExpr(10);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(942);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(943);
						match(SIGNED_RIGHT_SHIFT_);
						setState(944);
						bitExpr(9);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(945);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(946);
						match(PLUS_);
						setState(947);
						bitExpr(8);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(948);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(949);
						match(MINUS_);
						setState(950);
						bitExpr(7);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(951);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(952);
						match(ASTERISK_);
						setState(953);
						bitExpr(6);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(954);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(955);
						match(SLASH_);
						setState(956);
						bitExpr(5);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(957);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(958);
						match(MOD_);
						setState(959);
						bitExpr(4);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(960);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(961);
						match(CARET_);
						setState(962);
						bitExpr(3);
						}
						break;
					}
					} 
				}
				setState(967);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpleExprContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode PLUS_() { return getToken(PostgreSQLStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(PostgreSQLStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(PostgreSQLStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(PostgreSQLStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(PostgreSQLStatementParser.BINARY, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode LBE_() { return getToken(PostgreSQLStatementParser.LBE_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode RBE_() { return getToken(PostgreSQLStatementParser.RBE_, 0); }
		public CaseExpression_Context caseExpression_() {
			return getRuleContext(CaseExpression_Context.class,0);
		}
		public TerminalNode OR_() { return getToken(PostgreSQLStatementParser.OR_, 0); }
		public TerminalNode COLLATE() { return getToken(PostgreSQLStatementParser.COLLATE, 0); }
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(969);
				functionCall();
				}
				break;
			case 2:
				{
				setState(970);
				parameterMarker();
				}
				break;
			case 3:
				{
				setState(971);
				literals();
				}
				break;
			case 4:
				{
				setState(972);
				columnName();
				}
				break;
			case 5:
				{
				setState(973);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_))) != 0) || _la==BINARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(974);
				simpleExpr(5);
				}
				break;
			case 6:
				{
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(975);
					match(ROW);
					}
				}

				setState(978);
				match(LP_);
				setState(979);
				expr(0);
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(980);
					match(COMMA_);
					setState(981);
					expr(0);
					}
					}
					setState(986);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(987);
				match(RP_);
				}
				break;
			case 7:
				{
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS) {
					{
					setState(989);
					match(EXISTS);
					}
				}

				setState(992);
				subquery();
				}
				break;
			case 8:
				{
				setState(993);
				match(LBE_);
				setState(994);
				identifier_();
				setState(995);
				expr(0);
				setState(996);
				match(RBE_);
				}
				break;
			case 9:
				{
				setState(998);
				caseExpression_();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1012);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1010);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1001);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1002);
						match(OR_);
						setState(1003);
						simpleExpr(7);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1004);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1005);
						match(COLLATE);
						setState(1008);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STRING_:
							{
							setState(1006);
							match(STRING_);
							}
							break;
						case T__0:
						case T__1:
						case INSERT:
						case UPDATE:
						case DELETE:
						case ALTER:
						case DROP:
						case TRUNCATE:
						case SCHEMA:
						case REVOKE:
						case ADD:
						case SET:
						case INDEX:
						case KEY:
						case FUNCTION:
						case TRIGGER:
						case PROCEDURE:
						case IF:
						case BEGIN:
						case COMMIT:
						case ROLLBACK:
						case SAVEPOINT:
						case YEAR:
						case MONTH:
						case DAY:
						case HOUR:
						case MINUTE:
						case SECOND:
						case CURRENT:
						case ENABLE:
						case DISABLE:
						case INSTANCE:
						case PRESERVE:
						case DEFINER:
						case SQL:
						case CASCADED:
						case LOCAL:
						case CLOSE:
						case OPEN:
						case NEXT:
						case NAME:
						case ADMIN:
						case ESCAPE:
						case EXCLUDE:
						case PARTITION:
						case UNKNOWN:
						case ALWAYS:
						case CASCADE:
						case GENERATED:
						case ISOLATION:
						case LEVEL:
						case OPTION:
						case PRIVILEGES:
						case READ:
						case ROLE:
						case ROWS:
						case START:
						case TRANSACTION:
						case ACTION:
						case CACHE:
						case CHARACTERISTICS:
						case CLUSTER:
						case COMMENTS:
						case CONSTRAINTS:
						case CYCLE:
						case DATA:
						case DATABASE:
						case DEFAULTS:
						case DEFERRED:
						case DEPENDS:
						case DOMAIN:
						case EXCLUDING:
						case EXECUTE:
						case EXTENDED:
						case EXTENSION:
						case EXTERNAL:
						case EXTRACT:
						case FILTER:
						case FIRST:
						case FOLLOWING:
						case FORCE:
						case GLOBAL:
						case IDENTITY:
						case IMMEDIATE:
						case INCLUDING:
						case INCREMENT:
						case INDEXES:
						case INHERIT:
						case INHERITS:
						case INCLUDE:
						case LANGUAGE:
						case LARGE:
						case LAST:
						case LOGGED:
						case MAIN:
						case MATCH:
						case MAXVALUE:
						case MINVALUE:
						case NOTHING:
						case NULLS:
						case OBJECT:
						case OIDS:
						case OVER:
						case OWNED:
						case OWNER:
						case PARTIAL:
						case PLAIN:
						case PRECEDING:
						case RANGE:
						case RENAME:
						case REPLICA:
						case RESET:
						case RESTART:
						case RESTRICT:
						case ROUTINE:
						case RULE:
						case SECURITY:
						case SEQUENCE:
						case SESSION:
						case SHOW:
						case SIMPLE:
						case STATISTICS:
						case STORAGE:
						case TABLESPACE:
						case TEMP:
						case TEMPORARY:
						case TYPE:
						case UNBOUNDED:
						case UNLOGGED:
						case USAGE:
						case VALID:
						case VALIDATE:
						case WITHIN:
						case WITHOUT:
						case ZONE:
						case OF:
						case GROUPS:
						case RECURSIVE:
						case IDENTIFIER_:
							{
							setState(1007);
							identifier_();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(1014);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public AggregationFunctionContext aggregationFunction() {
			return getRuleContext(AggregationFunctionContext.class,0);
		}
		public SpecialFunction_Context specialFunction_() {
			return getRuleContext(SpecialFunction_Context.class,0);
		}
		public RegularFunction_Context regularFunction_() {
			return getRuleContext(RegularFunction_Context.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_functionCall);
		try {
			setState(1018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1015);
				aggregationFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016);
				specialFunction_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1017);
				regularFunction_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationFunctionContext extends ParserRuleContext {
		public AggregationFunctionName_Context aggregationFunctionName_() {
			return getRuleContext(AggregationFunctionName_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public FilterClause_Context filterClause_() {
			return getRuleContext(FilterClause_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			aggregationFunctionName_();
			setState(1021);
			match(LP_);
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1022);
				distinct();
				}
			}

			setState(1034);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case CHAR:
			case INTERVAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case ADMIN:
			case BINARY:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CURRENT_TIMESTAMP:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case TYPE:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1025);
				expr(0);
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1026);
					match(COMMA_);
					setState(1027);
					expr(0);
					}
					}
					setState(1032);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1033);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1036);
			match(RP_);
			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1037);
				filterClause_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationFunctionName_Context extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(PostgreSQLStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(PostgreSQLStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(PostgreSQLStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(PostgreSQLStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(PostgreSQLStatementParser.AVG, 0); }
		public AggregationFunctionName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionName_; }
	}

	public final AggregationFunctionName_Context aggregationFunctionName_() throws RecognitionException {
		AggregationFunctionName_Context _localctx = new AggregationFunctionName_Context(_ctx, getState());
		enterRule(_localctx, 144, RULE_aggregationFunctionName_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			_la = _input.LA(1);
			if ( !(((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (MAX - 146)) | (1L << (MIN - 146)) | (1L << (SUM - 146)) | (1L << (COUNT - 146)) | (1L << (AVG - 146)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(PostgreSQLStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(DISTINCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterClause_Context extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(PostgreSQLStatementParser.FILTER, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode WHERE() { return getToken(PostgreSQLStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public FilterClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterClause_; }
	}

	public final FilterClause_Context filterClause_() throws RecognitionException {
		FilterClause_Context _localctx = new FilterClause_Context(_ctx, getState());
		enterRule(_localctx, 148, RULE_filterClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			match(FILTER);
			setState(1045);
			match(LP_);
			setState(1046);
			match(WHERE);
			setState(1047);
			expr(0);
			setState(1048);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFunction_Context extends ParserRuleContext {
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public FilterClause_Context filterClause_() {
			return getRuleContext(FilterClause_Context.class,0);
		}
		public TerminalNode OVER() { return getToken(PostgreSQLStatementParser.OVER, 0); }
		public WindowDefinition_Context windowDefinition_() {
			return getRuleContext(WindowDefinition_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public WindowFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunction_; }
	}

	public final WindowFunction_Context windowFunction_() throws RecognitionException {
		WindowFunction_Context _localctx = new WindowFunction_Context(_ctx, getState());
		enterRule(_localctx, 150, RULE_windowFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			identifier_();
			setState(1051);
			match(LP_);
			setState(1052);
			expr(0);
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1053);
				match(COMMA_);
				setState(1054);
				expr(0);
				}
				}
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1060);
			match(RP_);
			setState(1061);
			filterClause_();
			setState(1062);
			match(OVER);
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1063);
				identifier_();
				}
				break;
			}
			setState(1066);
			windowDefinition_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowDefinition_Context extends ParserRuleContext {
		public PratitionClause_Context pratitionClause_() {
			return getRuleContext(PratitionClause_Context.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public FrameClause_Context frameClause_() {
			return getRuleContext(FrameClause_Context.class,0);
		}
		public WindowDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowDefinition_; }
	}

	public final WindowDefinition_Context windowDefinition_() throws RecognitionException {
		WindowDefinition_Context _localctx = new WindowDefinition_Context(_ctx, getState());
		enterRule(_localctx, 152, RULE_windowDefinition_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1068);
				pratitionClause_();
				}
				break;
			}
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1071);
				orderByClause();
				}
				break;
			}
			setState(1075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1074);
				frameClause_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PratitionClause_Context extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(PostgreSQLStatementParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public PratitionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pratitionClause_; }
	}

	public final PratitionClause_Context pratitionClause_() throws RecognitionException {
		PratitionClause_Context _localctx = new PratitionClause_Context(_ctx, getState());
		enterRule(_localctx, 154, RULE_pratitionClause_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			match(PARTITION);
			setState(1078);
			match(BY);
			setState(1079);
			expr(0);
			setState(1084);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1080);
					match(COMMA_);
					setState(1081);
					expr(0);
					}
					} 
				}
				setState(1086);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameClause_Context extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(PostgreSQLStatementParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(PostgreSQLStatementParser.ROWS, 0); }
		public TerminalNode GROUPS() { return getToken(PostgreSQLStatementParser.GROUPS, 0); }
		public FrameStart_Context frameStart_() {
			return getRuleContext(FrameStart_Context.class,0);
		}
		public FrameBetween_Context frameBetween_() {
			return getRuleContext(FrameBetween_Context.class,0);
		}
		public FrameClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameClause_; }
	}

	public final FrameClause_Context frameClause_() throws RecognitionException {
		FrameClause_Context _localctx = new FrameClause_Context(_ctx, getState());
		enterRule(_localctx, 156, RULE_frameClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			_la = _input.LA(1);
			if ( !(_la==ROWS || _la==RANGE || _la==GROUPS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1090);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case CHAR:
			case INTERVAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case ADMIN:
			case BINARY:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CURRENT_TIMESTAMP:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case TYPE:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1088);
				frameStart_();
				}
				break;
			case BETWEEN:
				{
				setState(1089);
				frameBetween_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameStart_Context extends ParserRuleContext {
		public TerminalNode CURRENT() { return getToken(PostgreSQLStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(PostgreSQLStatementParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(PostgreSQLStatementParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(PostgreSQLStatementParser.FOLLOWING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FrameStart_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameStart_; }
	}

	public final FrameStart_Context frameStart_() throws RecognitionException {
		FrameStart_Context _localctx = new FrameStart_Context(_ctx, getState());
		enterRule(_localctx, 158, RULE_frameStart_);
		try {
			setState(1104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1092);
				match(CURRENT);
				setState(1093);
				match(ROW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1094);
				match(UNBOUNDED);
				setState(1095);
				match(PRECEDING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1096);
				match(UNBOUNDED);
				setState(1097);
				match(FOLLOWING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1098);
				expr(0);
				setState(1099);
				match(PRECEDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1101);
				expr(0);
				setState(1102);
				match(FOLLOWING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameEnd_Context extends ParserRuleContext {
		public FrameStart_Context frameStart_() {
			return getRuleContext(FrameStart_Context.class,0);
		}
		public FrameEnd_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameEnd_; }
	}

	public final FrameEnd_Context frameEnd_() throws RecognitionException {
		FrameEnd_Context _localctx = new FrameEnd_Context(_ctx, getState());
		enterRule(_localctx, 160, RULE_frameEnd_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			frameStart_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBetween_Context extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(PostgreSQLStatementParser.BETWEEN, 0); }
		public FrameStart_Context frameStart_() {
			return getRuleContext(FrameStart_Context.class,0);
		}
		public TerminalNode AND() { return getToken(PostgreSQLStatementParser.AND, 0); }
		public FrameEnd_Context frameEnd_() {
			return getRuleContext(FrameEnd_Context.class,0);
		}
		public FrameBetween_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBetween_; }
	}

	public final FrameBetween_Context frameBetween_() throws RecognitionException {
		FrameBetween_Context _localctx = new FrameBetween_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_frameBetween_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			match(BETWEEN);
			setState(1109);
			frameStart_();
			setState(1110);
			match(AND);
			setState(1111);
			frameEnd_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialFunction_Context extends ParserRuleContext {
		public WindowFunction_Context windowFunction_() {
			return getRuleContext(WindowFunction_Context.class,0);
		}
		public CastFunction_Context castFunction_() {
			return getRuleContext(CastFunction_Context.class,0);
		}
		public CharFunction_Context charFunction_() {
			return getRuleContext(CharFunction_Context.class,0);
		}
		public SpecialFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunction_; }
	}

	public final SpecialFunction_Context specialFunction_() throws RecognitionException {
		SpecialFunction_Context _localctx = new SpecialFunction_Context(_ctx, getState());
		enterRule(_localctx, 164, RULE_specialFunction_);
		try {
			setState(1116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case IF:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case ADMIN:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case TYPE:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				windowFunction_();
				}
				break;
			case CAST:
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				castFunction_();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1115);
				charFunction_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastFunction_Context extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(PostgreSQLStatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public CastFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction_; }
	}

	public final CastFunction_Context castFunction_() throws RecognitionException {
		CastFunction_Context _localctx = new CastFunction_Context(_ctx, getState());
		enterRule(_localctx, 166, RULE_castFunction_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			match(CAST);
			setState(1119);
			match(LP_);
			setState(1120);
			expr(0);
			setState(1121);
			match(AS);
			setState(1122);
			dataType();
			setState(1123);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharFunction_Context extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(PostgreSQLStatementParser.CHAR, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public CharFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charFunction_; }
	}

	public final CharFunction_Context charFunction_() throws RecognitionException {
		CharFunction_Context _localctx = new CharFunction_Context(_ctx, getState());
		enterRule(_localctx, 168, RULE_charFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			match(CHAR);
			setState(1126);
			match(LP_);
			setState(1127);
			expr(0);
			setState(1132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1128);
				match(COMMA_);
				setState(1129);
				expr(0);
				}
				}
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1135);
				match(USING);
				setState(1136);
				ignoredIdentifier_();
				}
			}

			setState(1139);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularFunction_Context extends ParserRuleContext {
		public RegularFunctionName_Context regularFunctionName_() {
			return getRuleContext(RegularFunctionName_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public RegularFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction_; }
	}

	public final RegularFunction_Context regularFunction_() throws RecognitionException {
		RegularFunction_Context _localctx = new RegularFunction_Context(_ctx, getState());
		enterRule(_localctx, 170, RULE_regularFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			regularFunctionName_();
			setState(1142);
			match(LP_);
			setState(1152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case CHAR:
			case INTERVAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case ADMIN:
			case BINARY:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CURRENT_TIMESTAMP:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case TYPE:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1143);
				expr(0);
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1144);
					match(COMMA_);
					setState(1145);
					expr(0);
					}
					}
					setState(1150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1151);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1154);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularFunctionName_Context extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(PostgreSQLStatementParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(PostgreSQLStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(PostgreSQLStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(PostgreSQLStatementParser.INTERVAL, 0); }
		public RegularFunctionName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionName_; }
	}

	public final RegularFunctionName_Context regularFunctionName_() throws RecognitionException {
		RegularFunctionName_Context _localctx = new RegularFunctionName_Context(_ctx, getState());
		enterRule(_localctx, 172, RULE_regularFunctionName_);
		try {
			setState(1162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1156);
				identifier_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1157);
				match(IF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1158);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1159);
				match(LOCALTIME);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1160);
				match(LOCALTIMESTAMP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1161);
				match(INTERVAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExpression_Context extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(PostgreSQLStatementParser.CASE, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<CaseWhen_Context> caseWhen_() {
			return getRuleContexts(CaseWhen_Context.class);
		}
		public CaseWhen_Context caseWhen_(int i) {
			return getRuleContext(CaseWhen_Context.class,i);
		}
		public CaseElse_Context caseElse_() {
			return getRuleContext(CaseElse_Context.class,0);
		}
		public CaseExpression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression_; }
	}

	public final CaseExpression_Context caseExpression_() throws RecognitionException {
		CaseExpression_Context _localctx = new CaseExpression_Context(_ctx, getState());
		enterRule(_localctx, 174, RULE_caseExpression_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			match(CASE);
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_) | (1L << LP_) | (1L << LBE_) | (1L << QUESTION_) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << ALTER) | (1L << DROP) | (1L << TRUNCATE) | (1L << SCHEMA) | (1L << REVOKE) | (1L << ADD) | (1L << SET) | (1L << INDEX))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (KEY - 66)) | (1L << (FUNCTION - 66)) | (1L << (TRIGGER - 66)) | (1L << (PROCEDURE - 66)) | (1L << (CASE - 66)) | (1L << (CAST - 66)) | (1L << (IF - 66)) | (1L << (NULL - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (EXISTS - 66)) | (1L << (BEGIN - 66)) | (1L << (COMMIT - 66)) | (1L << (ROLLBACK - 66)) | (1L << (SAVEPOINT - 66)) | (1L << (CHAR - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (INTERVAL - 131)) | (1L << (LOCALTIME - 131)) | (1L << (LOCALTIMESTAMP - 131)) | (1L << (YEAR - 131)) | (1L << (MONTH - 131)) | (1L << (DAY - 131)) | (1L << (HOUR - 131)) | (1L << (MINUTE - 131)) | (1L << (SECOND - 131)) | (1L << (MAX - 131)) | (1L << (MIN - 131)) | (1L << (SUM - 131)) | (1L << (COUNT - 131)) | (1L << (AVG - 131)) | (1L << (CURRENT - 131)) | (1L << (ENABLE - 131)) | (1L << (DISABLE - 131)) | (1L << (INSTANCE - 131)) | (1L << (PRESERVE - 131)) | (1L << (DEFINER - 131)) | (1L << (SQL - 131)) | (1L << (CASCADED - 131)) | (1L << (LOCAL - 131)) | (1L << (CLOSE - 131)) | (1L << (OPEN - 131)) | (1L << (NEXT - 131)) | (1L << (NAME - 131)) | (1L << (ADMIN - 131)) | (1L << (BINARY - 131)) | (1L << (ESCAPE - 131)) | (1L << (EXCLUDE - 131)) | (1L << (PARTITION - 131)) | (1L << (ROW - 131)) | (1L << (UNKNOWN - 131)) | (1L << (ALWAYS - 131)) | (1L << (CASCADE - 131)) | (1L << (GENERATED - 131)) | (1L << (ISOLATION - 131)) | (1L << (LEVEL - 131)) | (1L << (OPTION - 131)) | (1L << (PRIVILEGES - 131)) | (1L << (READ - 131)) | (1L << (ROLE - 131)) | (1L << (ROWS - 131)) | (1L << (START - 131)) | (1L << (TRANSACTION - 131)) | (1L << (ACTION - 131)) | (1L << (CACHE - 131)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (CHARACTERISTICS - 195)) | (1L << (CLUSTER - 195)) | (1L << (COMMENTS - 195)) | (1L << (CONSTRAINTS - 195)) | (1L << (CURRENT_TIMESTAMP - 195)) | (1L << (CYCLE - 195)) | (1L << (DATA - 195)) | (1L << (DATABASE - 195)) | (1L << (DEFAULTS - 195)) | (1L << (DEFERRED - 195)) | (1L << (DEPENDS - 195)) | (1L << (DOMAIN - 195)) | (1L << (EXCLUDING - 195)) | (1L << (EXECUTE - 195)) | (1L << (EXTENDED - 195)) | (1L << (EXTENSION - 195)) | (1L << (EXTERNAL - 195)) | (1L << (EXTRACT - 195)) | (1L << (FILTER - 195)) | (1L << (FIRST - 195)) | (1L << (FOLLOWING - 195)) | (1L << (FORCE - 195)) | (1L << (GLOBAL - 195)) | (1L << (IDENTITY - 195)) | (1L << (IMMEDIATE - 195)) | (1L << (INCLUDING - 195)) | (1L << (INCREMENT - 195)) | (1L << (INDEXES - 195)) | (1L << (INHERIT - 195)) | (1L << (INHERITS - 195)) | (1L << (INCLUDE - 195)) | (1L << (LANGUAGE - 195)) | (1L << (LARGE - 195)) | (1L << (LAST - 195)) | (1L << (LOGGED - 195)) | (1L << (MAIN - 195)) | (1L << (MATCH - 195)) | (1L << (MAXVALUE - 195)) | (1L << (MINVALUE - 195)) | (1L << (NOTHING - 195)) | (1L << (NULLS - 195)) | (1L << (OBJECT - 195)) | (1L << (OIDS - 195)) | (1L << (OVER - 195)) | (1L << (OWNED - 195)) | (1L << (OWNER - 195)) | (1L << (PARTIAL - 195)) | (1L << (PLAIN - 195)) | (1L << (PRECEDING - 195)) | (1L << (RANGE - 195)) | (1L << (RENAME - 195)) | (1L << (REPLICA - 195)) | (1L << (RESET - 195)) | (1L << (RESTART - 195)) | (1L << (RESTRICT - 195)) | (1L << (ROUTINE - 195)) | (1L << (RULE - 195)) | (1L << (SECURITY - 195)))) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (SEQUENCE - 259)) | (1L << (SESSION - 259)) | (1L << (SHOW - 259)) | (1L << (SIMPLE - 259)) | (1L << (STATISTICS - 259)) | (1L << (STORAGE - 259)) | (1L << (TABLESPACE - 259)) | (1L << (TEMP - 259)) | (1L << (TEMPORARY - 259)) | (1L << (TYPE - 259)) | (1L << (UNBOUNDED - 259)) | (1L << (UNLOGGED - 259)) | (1L << (USAGE - 259)) | (1L << (VALID - 259)) | (1L << (VALIDATE - 259)) | (1L << (WITHIN - 259)) | (1L << (WITHOUT - 259)) | (1L << (ZONE - 259)) | (1L << (OF - 259)) | (1L << (GROUPS - 259)) | (1L << (RECURSIVE - 259)) | (1L << (IDENTIFIER_ - 259)) | (1L << (STRING_ - 259)) | (1L << (NUMBER_ - 259)) | (1L << (HEX_DIGIT_ - 259)) | (1L << (BIT_NUM_ - 259)))) != 0)) {
				{
				setState(1165);
				simpleExpr(0);
				}
			}

			setState(1169); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1168);
					caseWhen_();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1171); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1173);
				caseElse_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseWhen_Context extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(PostgreSQLStatementParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(PostgreSQLStatementParser.THEN, 0); }
		public CaseWhen_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen_; }
	}

	public final CaseWhen_Context caseWhen_() throws RecognitionException {
		CaseWhen_Context _localctx = new CaseWhen_Context(_ctx, getState());
		enterRule(_localctx, 176, RULE_caseWhen_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			match(WHEN);
			setState(1177);
			expr(0);
			setState(1178);
			match(THEN);
			setState(1179);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseElse_Context extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PostgreSQLStatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseElse_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseElse_; }
	}

	public final CaseElse_Context caseElse_() throws RecognitionException {
		CaseElse_Context _localctx = new CaseElse_Context(_ctx, getState());
		enterRule(_localctx, 178, RULE_caseElse_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			match(ELSE);
			setState(1182);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(PostgreSQLStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_orderByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			match(ORDER);
			setState(1185);
			match(BY);
			setState(1186);
			orderByItem();
			setState(1191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1187);
					match(COMMA_);
					setState(1188);
					orderByItem();
					}
					} 
				}
				setState(1193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(PostgreSQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PostgreSQLStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1194);
				columnName();
				}
				break;
			case 2:
				{
				setState(1195);
				numberLiterals();
				}
				break;
			case 3:
				{
				setState(1196);
				expr(0);
				}
				break;
			}
			setState(1200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1199);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public CharacterSet_Context characterSet_() {
			return getRuleContext(CharacterSet_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(PostgreSQLStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(PostgreSQLStatementParser.STRING_, i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_dataType);
		int _la;
		try {
			setState(1229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1202);
				dataTypeName_();
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1203);
					dataTypeLength();
					}
				}

				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHAR || _la==CHARACTER) {
					{
					setState(1206);
					characterSet_();
					}
				}

				setState(1210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1209);
					collateClause_();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1212);
				dataTypeName_();
				setState(1213);
				match(LP_);
				setState(1214);
				match(STRING_);
				setState(1219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1215);
					match(COMMA_);
					setState(1216);
					match(STRING_);
					}
					}
					setState(1221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1222);
				match(RP_);
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHAR || _la==CHARACTER) {
					{
					setState(1223);
					characterSet_();
					}
				}

				setState(1227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1226);
					collateClause_();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeName_Context extends ParserRuleContext {
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public DataTypeName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName_; }
	}

	public final DataTypeName_Context dataTypeName_() throws RecognitionException {
		DataTypeName_Context _localctx = new DataTypeName_Context(_ctx, getState());
		enterRule(_localctx, 186, RULE_dataTypeName_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			identifier_();
			setState(1233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1232);
				identifier_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeLengthContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(PostgreSQLStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(PostgreSQLStatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(PostgreSQLStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			match(LP_);
			setState(1236);
			match(NUMBER_);
			setState(1239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(1237);
				match(COMMA_);
				setState(1238);
				match(NUMBER_);
				}
			}

			setState(1241);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterSet_Context extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(PostgreSQLStatementParser.CHARACTER, 0); }
		public TerminalNode CHAR() { return getToken(PostgreSQLStatementParser.CHAR, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public CharacterSet_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSet_; }
	}

	public final CharacterSet_Context characterSet_() throws RecognitionException {
		CharacterSet_Context _localctx = new CharacterSet_Context(_ctx, getState());
		enterRule(_localctx, 190, RULE_characterSet_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			_la = _input.LA(1);
			if ( !(_la==CHAR || _la==CHARACTER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1244);
			match(SET);
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(1245);
				match(EQ_);
				}
			}

			setState(1248);
			ignoredIdentifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollateClause_Context extends ParserRuleContext {
		public TerminalNode COLLATE() { return getToken(PostgreSQLStatementParser.COLLATE, 0); }
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public CollateClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause_; }
	}

	public final CollateClause_Context collateClause_() throws RecognitionException {
		CollateClause_Context _localctx = new CollateClause_Context(_ctx, getState());
		enterRule(_localctx, 192, RULE_collateClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			match(COLLATE);
			setState(1252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(1251);
				match(EQ_);
				}
			}

			setState(1256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				{
				setState(1254);
				match(STRING_);
				}
				break;
			case T__0:
			case T__1:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case IF:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case ADMIN:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case TYPE:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case IDENTIFIER_:
				{
				setState(1255);
				ignoredIdentifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgnoredIdentifier_Context extends ParserRuleContext {
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode DOT_() { return getToken(PostgreSQLStatementParser.DOT_, 0); }
		public IgnoredIdentifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier_; }
	}

	public final IgnoredIdentifier_Context ignoredIdentifier_() throws RecognitionException {
		IgnoredIdentifier_Context _localctx = new IgnoredIdentifier_Context(_ctx, getState());
		enterRule(_localctx, 194, RULE_ignoredIdentifier_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			identifier_();
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_) {
				{
				setState(1259);
				match(DOT_);
				setState(1260);
				identifier_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgnoredIdentifiers_Context extends ParserRuleContext {
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public IgnoredIdentifiers_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers_; }
	}

	public final IgnoredIdentifiers_Context ignoredIdentifiers_() throws RecognitionException {
		IgnoredIdentifiers_Context _localctx = new IgnoredIdentifiers_Context(_ctx, getState());
		enterRule(_localctx, 196, RULE_ignoredIdentifiers_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			ignoredIdentifier_();
			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1264);
				match(COMMA_);
				setState(1265);
				ignoredIdentifier_();
				}
				}
				setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public CreateTableSpecification_Context createTableSpecification_() {
			return getRuleContext(CreateTableSpecification_Context.class,0);
		}
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TableNotExistClause_Context tableNotExistClause_() {
			return getRuleContext(TableNotExistClause_Context.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public CreateDefinitionClause_Context createDefinitionClause_() {
			return getRuleContext(CreateDefinitionClause_Context.class,0);
		}
		public InheritClause_Context inheritClause_() {
			return getRuleContext(InheritClause_Context.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_createTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			match(CREATE);
			setState(1272);
			createTableSpecification_();
			setState(1273);
			match(TABLE);
			setState(1274);
			tableNotExistClause_();
			setState(1275);
			tableName();
			setState(1276);
			createDefinitionClause_();
			setState(1277);
			inheritClause_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateIndexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public CreateIndexSpecification_Context createIndexSpecification_() {
			return getRuleContext(CreateIndexSpecification_Context.class,0);
		}
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public ConcurrentlyClause_Context concurrentlyClause_() {
			return getRuleContext(ConcurrentlyClause_Context.class,0);
		}
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public OnlyClause_Context onlyClause_() {
			return getRuleContext(OnlyClause_Context.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IndexNotExistClause_Context indexNotExistClause_() {
			return getRuleContext(IndexNotExistClause_Context.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_createIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			match(CREATE);
			setState(1280);
			createIndexSpecification_();
			setState(1281);
			match(INDEX);
			setState(1282);
			concurrentlyClause_();
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << ALTER) | (1L << DROP) | (1L << TRUNCATE) | (1L << SCHEMA) | (1L << REVOKE) | (1L << ADD) | (1L << SET) | (1L << INDEX))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (KEY - 66)) | (1L << (FUNCTION - 66)) | (1L << (TRIGGER - 66)) | (1L << (PROCEDURE - 66)) | (1L << (IF - 66)) | (1L << (BEGIN - 66)) | (1L << (COMMIT - 66)) | (1L << (ROLLBACK - 66)) | (1L << (SAVEPOINT - 66)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (YEAR - 137)) | (1L << (MONTH - 137)) | (1L << (DAY - 137)) | (1L << (HOUR - 137)) | (1L << (MINUTE - 137)) | (1L << (SECOND - 137)) | (1L << (CURRENT - 137)) | (1L << (ENABLE - 137)) | (1L << (DISABLE - 137)) | (1L << (INSTANCE - 137)) | (1L << (PRESERVE - 137)) | (1L << (DEFINER - 137)) | (1L << (SQL - 137)) | (1L << (CASCADED - 137)) | (1L << (LOCAL - 137)) | (1L << (CLOSE - 137)) | (1L << (OPEN - 137)) | (1L << (NEXT - 137)) | (1L << (NAME - 137)) | (1L << (ADMIN - 137)) | (1L << (ESCAPE - 137)) | (1L << (EXCLUDE - 137)) | (1L << (PARTITION - 137)) | (1L << (UNKNOWN - 137)) | (1L << (ALWAYS - 137)) | (1L << (CASCADE - 137)) | (1L << (GENERATED - 137)) | (1L << (ISOLATION - 137)) | (1L << (LEVEL - 137)) | (1L << (OPTION - 137)) | (1L << (PRIVILEGES - 137)) | (1L << (READ - 137)) | (1L << (ROLE - 137)) | (1L << (ROWS - 137)) | (1L << (START - 137)) | (1L << (TRANSACTION - 137)) | (1L << (ACTION - 137)) | (1L << (CACHE - 137)) | (1L << (CHARACTERISTICS - 137)) | (1L << (CLUSTER - 137)) | (1L << (COMMENTS - 137)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (CONSTRAINTS - 201)) | (1L << (CYCLE - 201)) | (1L << (DATA - 201)) | (1L << (DATABASE - 201)) | (1L << (DEFAULTS - 201)) | (1L << (DEFERRED - 201)) | (1L << (DEPENDS - 201)) | (1L << (DOMAIN - 201)) | (1L << (EXCLUDING - 201)) | (1L << (EXECUTE - 201)) | (1L << (EXTENDED - 201)) | (1L << (EXTENSION - 201)) | (1L << (EXTERNAL - 201)) | (1L << (EXTRACT - 201)) | (1L << (FILTER - 201)) | (1L << (FIRST - 201)) | (1L << (FOLLOWING - 201)) | (1L << (FORCE - 201)) | (1L << (GLOBAL - 201)) | (1L << (IDENTITY - 201)) | (1L << (IMMEDIATE - 201)) | (1L << (INCLUDING - 201)) | (1L << (INCREMENT - 201)) | (1L << (INDEXES - 201)) | (1L << (INHERIT - 201)) | (1L << (INHERITS - 201)) | (1L << (INCLUDE - 201)) | (1L << (LANGUAGE - 201)) | (1L << (LARGE - 201)) | (1L << (LAST - 201)) | (1L << (LOGGED - 201)) | (1L << (MAIN - 201)) | (1L << (MATCH - 201)) | (1L << (MAXVALUE - 201)) | (1L << (MINVALUE - 201)) | (1L << (NOTHING - 201)) | (1L << (NULLS - 201)) | (1L << (OBJECT - 201)) | (1L << (OIDS - 201)) | (1L << (OVER - 201)) | (1L << (OWNED - 201)) | (1L << (OWNER - 201)) | (1L << (PARTIAL - 201)) | (1L << (PLAIN - 201)) | (1L << (PRECEDING - 201)) | (1L << (RANGE - 201)) | (1L << (RENAME - 201)) | (1L << (REPLICA - 201)) | (1L << (RESET - 201)) | (1L << (RESTART - 201)) | (1L << (RESTRICT - 201)) | (1L << (ROUTINE - 201)) | (1L << (RULE - 201)) | (1L << (SECURITY - 201)) | (1L << (SEQUENCE - 201)) | (1L << (SESSION - 201)) | (1L << (SHOW - 201)) | (1L << (SIMPLE - 201)) | (1L << (STATISTICS - 201)))) != 0) || ((((_la - 265)) & ~0x3f) == 0 && ((1L << (_la - 265)) & ((1L << (STORAGE - 265)) | (1L << (TABLESPACE - 265)) | (1L << (TEMP - 265)) | (1L << (TEMPORARY - 265)) | (1L << (TYPE - 265)) | (1L << (UNBOUNDED - 265)) | (1L << (UNLOGGED - 265)) | (1L << (USAGE - 265)) | (1L << (VALID - 265)) | (1L << (VALIDATE - 265)) | (1L << (WITHIN - 265)) | (1L << (WITHOUT - 265)) | (1L << (ZONE - 265)) | (1L << (OF - 265)) | (1L << (GROUPS - 265)) | (1L << (RECURSIVE - 265)) | (1L << (IDENTIFIER_ - 265)))) != 0)) {
				{
				setState(1283);
				indexNotExistClause_();
				setState(1284);
				indexName();
				}
			}

			setState(1288);
			match(ON);
			setState(1289);
			onlyClause_();
			setState(1290);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TableExistClause_Context tableExistClause_() {
			return getRuleContext(TableExistClause_Context.class,0);
		}
		public OnlyClause_Context onlyClause_() {
			return getRuleContext(OnlyClause_Context.class,0);
		}
		public TableNameClauseContext tableNameClause() {
			return getRuleContext(TableNameClauseContext.class,0);
		}
		public AlterDefinitionClause_Context alterDefinitionClause_() {
			return getRuleContext(AlterDefinitionClause_Context.class,0);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_alterTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(ALTER);
			setState(1293);
			match(TABLE);
			setState(1294);
			tableExistClause_();
			setState(1295);
			onlyClause_();
			setState(1296);
			tableNameClause();
			setState(1297);
			alterDefinitionClause_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterIndexContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public IndexExistClause_Context indexExistClause_() {
			return getRuleContext(IndexExistClause_Context.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public AlterIndexDefinitionClause_Context alterIndexDefinitionClause_() {
			return getRuleContext(AlterIndexDefinitionClause_Context.class,0);
		}
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_alterIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			match(ALTER);
			setState(1300);
			match(INDEX);
			setState(1301);
			indexExistClause_();
			setState(1302);
			indexName();
			setState(1303);
			alterIndexDefinitionClause_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TableExistClause_Context tableExistClause_() {
			return getRuleContext(TableExistClause_Context.class,0);
		}
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			match(DROP);
			setState(1306);
			match(TABLE);
			setState(1307);
			tableExistClause_();
			setState(1308);
			tableNames();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropIndexContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public ConcurrentlyClause_Context concurrentlyClause_() {
			return getRuleContext(ConcurrentlyClause_Context.class,0);
		}
		public IndexExistClause_Context indexExistClause_() {
			return getRuleContext(IndexExistClause_Context.class,0);
		}
		public IndexNamesContext indexNames() {
			return getRuleContext(IndexNamesContext.class,0);
		}
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_dropIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			match(DROP);
			setState(1311);
			match(INDEX);
			setState(1312);
			concurrentlyClause_();
			setState(1313);
			indexExistClause_();
			setState(1314);
			indexNames();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(PostgreSQLStatementParser.TRUNCATE, 0); }
		public OnlyClause_Context onlyClause_() {
			return getRuleContext(OnlyClause_Context.class,0);
		}
		public TableNamesClauseContext tableNamesClause() {
			return getRuleContext(TableNamesClauseContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_truncateTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			match(TRUNCATE);
			setState(1318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(1317);
				match(TABLE);
				}
			}

			setState(1320);
			onlyClause_();
			setState(1321);
			tableNamesClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableSpecification_Context extends ParserRuleContext {
		public TerminalNode UNLOGGED() { return getToken(PostgreSQLStatementParser.UNLOGGED, 0); }
		public TerminalNode TEMPORARY() { return getToken(PostgreSQLStatementParser.TEMPORARY, 0); }
		public TerminalNode TEMP() { return getToken(PostgreSQLStatementParser.TEMP, 0); }
		public TerminalNode GLOBAL() { return getToken(PostgreSQLStatementParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public CreateTableSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableSpecification_; }
	}

	public final CreateTableSpecification_Context createTableSpecification_() throws RecognitionException {
		CreateTableSpecification_Context _localctx = new CreateTableSpecification_Context(_ctx, getState());
		enterRule(_localctx, 212, RULE_createTableSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOCAL:
			case GLOBAL:
			case TEMP:
			case TEMPORARY:
				{
				setState(1324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL || _la==GLOBAL) {
					{
					setState(1323);
					_la = _input.LA(1);
					if ( !(_la==LOCAL || _la==GLOBAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1326);
				_la = _input.LA(1);
				if ( !(_la==TEMP || _la==TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case UNLOGGED:
				{
				setState(1327);
				match(UNLOGGED);
				}
				break;
			case TABLE:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNotExistClause_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TableNotExistClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNotExistClause_; }
	}

	public final TableNotExistClause_Context tableNotExistClause_() throws RecognitionException {
		TableNotExistClause_Context _localctx = new TableNotExistClause_Context(_ctx, getState());
		enterRule(_localctx, 214, RULE_tableNotExistClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1330);
				match(IF);
				setState(1331);
				match(NOT);
				setState(1332);
				match(EXISTS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDefinitionClause_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<CreateDefinitionContext> createDefinition() {
			return getRuleContexts(CreateDefinitionContext.class);
		}
		public CreateDefinitionContext createDefinition(int i) {
			return getRuleContext(CreateDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public CreateDefinitionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitionClause_; }
	}

	public final CreateDefinitionClause_Context createDefinitionClause_() throws RecognitionException {
		CreateDefinitionClause_Context _localctx = new CreateDefinitionClause_Context(_ctx, getState());
		enterRule(_localctx, 216, RULE_createDefinitionClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			match(LP_);
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << ALTER) | (1L << DROP) | (1L << TRUNCATE) | (1L << SCHEMA) | (1L << REVOKE) | (1L << ADD) | (1L << SET) | (1L << INDEX) | (1L << CONSTRAINT) | (1L << PRIMARY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (UNIQUE - 64)) | (1L << (FOREIGN - 64)) | (1L << (KEY - 64)) | (1L << (FUNCTION - 64)) | (1L << (TRIGGER - 64)) | (1L << (PROCEDURE - 64)) | (1L << (IF - 64)) | (1L << (LIKE - 64)) | (1L << (BEGIN - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (SAVEPOINT - 64)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (YEAR - 137)) | (1L << (MONTH - 137)) | (1L << (DAY - 137)) | (1L << (HOUR - 137)) | (1L << (MINUTE - 137)) | (1L << (SECOND - 137)) | (1L << (CURRENT - 137)) | (1L << (ENABLE - 137)) | (1L << (DISABLE - 137)) | (1L << (INSTANCE - 137)) | (1L << (PRESERVE - 137)) | (1L << (DEFINER - 137)) | (1L << (SQL - 137)) | (1L << (CASCADED - 137)) | (1L << (LOCAL - 137)) | (1L << (CLOSE - 137)) | (1L << (OPEN - 137)) | (1L << (NEXT - 137)) | (1L << (NAME - 137)) | (1L << (ADMIN - 137)) | (1L << (ESCAPE - 137)) | (1L << (EXCLUDE - 137)) | (1L << (PARTITION - 137)) | (1L << (UNKNOWN - 137)) | (1L << (ALWAYS - 137)) | (1L << (CASCADE - 137)) | (1L << (CHECK - 137)) | (1L << (GENERATED - 137)) | (1L << (ISOLATION - 137)) | (1L << (LEVEL - 137)) | (1L << (OPTION - 137)) | (1L << (PRIVILEGES - 137)) | (1L << (READ - 137)) | (1L << (ROLE - 137)) | (1L << (ROWS - 137)) | (1L << (START - 137)) | (1L << (TRANSACTION - 137)) | (1L << (ACTION - 137)) | (1L << (CACHE - 137)) | (1L << (CHARACTERISTICS - 137)) | (1L << (CLUSTER - 137)) | (1L << (COMMENTS - 137)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (CONSTRAINTS - 201)) | (1L << (CYCLE - 201)) | (1L << (DATA - 201)) | (1L << (DATABASE - 201)) | (1L << (DEFAULTS - 201)) | (1L << (DEFERRED - 201)) | (1L << (DEPENDS - 201)) | (1L << (DOMAIN - 201)) | (1L << (EXCLUDING - 201)) | (1L << (EXECUTE - 201)) | (1L << (EXTENDED - 201)) | (1L << (EXTENSION - 201)) | (1L << (EXTERNAL - 201)) | (1L << (EXTRACT - 201)) | (1L << (FILTER - 201)) | (1L << (FIRST - 201)) | (1L << (FOLLOWING - 201)) | (1L << (FORCE - 201)) | (1L << (GLOBAL - 201)) | (1L << (IDENTITY - 201)) | (1L << (IMMEDIATE - 201)) | (1L << (INCLUDING - 201)) | (1L << (INCREMENT - 201)) | (1L << (INDEXES - 201)) | (1L << (INHERIT - 201)) | (1L << (INHERITS - 201)) | (1L << (INCLUDE - 201)) | (1L << (LANGUAGE - 201)) | (1L << (LARGE - 201)) | (1L << (LAST - 201)) | (1L << (LOGGED - 201)) | (1L << (MAIN - 201)) | (1L << (MATCH - 201)) | (1L << (MAXVALUE - 201)) | (1L << (MINVALUE - 201)) | (1L << (NOTHING - 201)) | (1L << (NULLS - 201)) | (1L << (OBJECT - 201)) | (1L << (OIDS - 201)) | (1L << (OVER - 201)) | (1L << (OWNED - 201)) | (1L << (OWNER - 201)) | (1L << (PARTIAL - 201)) | (1L << (PLAIN - 201)) | (1L << (PRECEDING - 201)) | (1L << (RANGE - 201)) | (1L << (RENAME - 201)) | (1L << (REPLICA - 201)) | (1L << (RESET - 201)) | (1L << (RESTART - 201)) | (1L << (RESTRICT - 201)) | (1L << (ROUTINE - 201)) | (1L << (RULE - 201)) | (1L << (SECURITY - 201)) | (1L << (SEQUENCE - 201)) | (1L << (SESSION - 201)) | (1L << (SHOW - 201)) | (1L << (SIMPLE - 201)) | (1L << (STATISTICS - 201)))) != 0) || ((((_la - 265)) & ~0x3f) == 0 && ((1L << (_la - 265)) & ((1L << (STORAGE - 265)) | (1L << (TABLESPACE - 265)) | (1L << (TEMP - 265)) | (1L << (TEMPORARY - 265)) | (1L << (TYPE - 265)) | (1L << (UNBOUNDED - 265)) | (1L << (UNLOGGED - 265)) | (1L << (USAGE - 265)) | (1L << (VALID - 265)) | (1L << (VALIDATE - 265)) | (1L << (WITHIN - 265)) | (1L << (WITHOUT - 265)) | (1L << (ZONE - 265)) | (1L << (OF - 265)) | (1L << (GROUPS - 265)) | (1L << (RECURSIVE - 265)) | (1L << (IDENTIFIER_ - 265)))) != 0)) {
				{
				setState(1336);
				createDefinition();
				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1337);
					match(COMMA_);
					setState(1338);
					createDefinition();
					}
					}
					setState(1343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1346);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(PostgreSQLStatementParser.LIKE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<LikeOptionContext> likeOption() {
			return getRuleContexts(LikeOptionContext.class);
		}
		public LikeOptionContext likeOption(int i) {
			return getRuleContext(LikeOptionContext.class,i);
		}
		public CreateDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinition; }
	}

	public final CreateDefinitionContext createDefinition() throws RecognitionException {
		CreateDefinitionContext _localctx = new CreateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_createDefinition);
		int _la;
		try {
			setState(1358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1348);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1349);
				tableConstraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1350);
				match(LIKE);
				setState(1351);
				tableName();
				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EXCLUDING || _la==INCLUDING) {
					{
					{
					setState(1352);
					likeOption();
					}
					}
					setState(1357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			columnName();
			setState(1361);
			dataType();
			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(1362);
				collateClause_();
				}
			}

			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (CONSTRAINT - 62)) | (1L << (PRIMARY - 62)) | (1L << (UNIQUE - 62)) | (1L << (KEY - 62)) | (1L << (NOT - 62)) | (1L << (NULL - 62)))) != 0) || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (DEFAULT - 151)) | (1L << (CHECK - 151)) | (1L << (GENERATED - 151)) | (1L << (REFERENCES - 151)))) != 0)) {
				{
				{
				setState(1365);
				columnConstraint();
				}
				}
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnConstraintContext extends ParserRuleContext {
		public ColumnConstraintOptionContext columnConstraintOption() {
			return getRuleContext(ColumnConstraintOptionContext.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public ConstraintClauseContext constraintClause() {
			return getRuleContext(ConstraintClauseContext.class,0);
		}
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_columnConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1371);
				constraintClause();
				}
			}

			setState(1374);
			columnConstraintOption();
			setState(1375);
			constraintOptionalParam();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintClauseContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintClause; }
	}

	public final ConstraintClauseContext constraintClause() throws RecognitionException {
		ConstraintClauseContext _localctx = new ConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_constraintClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			match(CONSTRAINT);
			setState(1378);
			ignoredIdentifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnConstraintOptionContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public CheckOptionContext checkOption() {
			return getRuleContext(CheckOptionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public DefaultExprContext defaultExpr() {
			return getRuleContext(DefaultExprContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public SequenceOptionsContext sequenceOptions() {
			return getRuleContext(SequenceOptionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public IndexParametersContext indexParameters() {
			return getRuleContext(IndexParametersContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode REFERENCES() { return getToken(PostgreSQLStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(PostgreSQLStatementParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(PostgreSQLStatementParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(PostgreSQLStatementParser.SIMPLE, 0); }
		public List<TerminalNode> ON() { return getTokens(PostgreSQLStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(PostgreSQLStatementParser.ON, i);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public List<TerminalNode> DELETE() { return getTokens(PostgreSQLStatementParser.DELETE); }
		public TerminalNode DELETE(int i) {
			return getToken(PostgreSQLStatementParser.DELETE, i);
		}
		public List<TerminalNode> UPDATE() { return getTokens(PostgreSQLStatementParser.UPDATE); }
		public TerminalNode UPDATE(int i) {
			return getToken(PostgreSQLStatementParser.UPDATE, i);
		}
		public ColumnConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraintOption; }
	}

	public final ColumnConstraintOptionContext columnConstraintOption() throws RecognitionException {
		ColumnConstraintOptionContext _localctx = new ColumnConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_columnConstraintOption);
		int _la;
		try {
			setState(1427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1380);
					match(NOT);
					}
				}

				setState(1383);
				match(NULL);
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1384);
				checkOption();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1385);
				match(DEFAULT);
				setState(1386);
				defaultExpr();
				}
				break;
			case GENERATED:
				enterOuterAlt(_localctx, 4);
				{
				setState(1387);
				match(GENERATED);
				setState(1391);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALWAYS:
					{
					setState(1388);
					match(ALWAYS);
					}
					break;
				case BY:
					{
					setState(1389);
					match(BY);
					setState(1390);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1393);
				match(AS);
				setState(1394);
				match(IDENTITY);
				setState(1399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1395);
					match(LP_);
					setState(1396);
					sequenceOptions();
					setState(1397);
					match(RP_);
					}
				}

				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1401);
				match(UNIQUE);
				setState(1402);
				indexParameters();
				}
				break;
			case PRIMARY:
			case KEY:
				enterOuterAlt(_localctx, 6);
				{
				setState(1403);
				primaryKey();
				setState(1404);
				indexParameters();
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 7);
				{
				setState(1406);
				match(REFERENCES);
				setState(1407);
				tableName();
				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1408);
					columnNames();
					}
				}

				setState(1417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1411);
					match(MATCH);
					setState(1412);
					match(FULL);
					}
					break;
				case 2:
					{
					setState(1413);
					match(MATCH);
					setState(1414);
					match(PARTIAL);
					}
					break;
				case 3:
					{
					setState(1415);
					match(MATCH);
					setState(1416);
					match(SIMPLE);
					}
					break;
				}
				setState(1424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(1419);
					match(ON);
					setState(1420);
					_la = _input.LA(1);
					if ( !(_la==UPDATE || _la==DELETE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1421);
					action();
					}
					}
					setState(1426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckOptionContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(PostgreSQLStatementParser.CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode INHERIT() { return getToken(PostgreSQLStatementParser.INHERIT, 0); }
		public CheckOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkOption; }
	}

	public final CheckOptionContext checkOption() throws RecognitionException {
		CheckOptionContext _localctx = new CheckOptionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_checkOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(CHECK);
			setState(1430);
			expr(0);
			setState(1433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NO) {
				{
				setState(1431);
				match(NO);
				setState(1432);
				match(INHERIT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultExprContext extends ParserRuleContext {
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(PostgreSQLStatementParser.CURRENT_TIMESTAMP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefaultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultExpr; }
	}

	public final DefaultExprContext defaultExpr() throws RecognitionException {
		DefaultExprContext _localctx = new DefaultExprContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_defaultExpr);
		try {
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1436);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceOptionsContext extends ParserRuleContext {
		public List<SequenceOptionContext> sequenceOption() {
			return getRuleContexts(SequenceOptionContext.class);
		}
		public SequenceOptionContext sequenceOption(int i) {
			return getRuleContext(SequenceOptionContext.class,i);
		}
		public SequenceOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceOptions; }
	}

	public final SequenceOptionsContext sequenceOptions() throws RecognitionException {
		SequenceOptionsContext _localctx = new SequenceOptionsContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_sequenceOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1439);
				sequenceOption();
				}
				}
				setState(1442); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (NO - 183)) | (1L << (START - 183)) | (1L << (CACHE - 183)) | (1L << (CYCLE - 183)) | (1L << (INCREMENT - 183)) | (1L << (MAXVALUE - 183)) | (1L << (MINVALUE - 183)) | (1L << (OWNED - 183)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceOptionContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(PostgreSQLStatementParser.START, 0); }
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public TerminalNode INCREMENT() { return getToken(PostgreSQLStatementParser.INCREMENT, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public TerminalNode MAXVALUE() { return getToken(PostgreSQLStatementParser.MAXVALUE, 0); }
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode MINVALUE() { return getToken(PostgreSQLStatementParser.MINVALUE, 0); }
		public TerminalNode CYCLE() { return getToken(PostgreSQLStatementParser.CYCLE, 0); }
		public TerminalNode CACHE() { return getToken(PostgreSQLStatementParser.CACHE, 0); }
		public TerminalNode OWNED() { return getToken(PostgreSQLStatementParser.OWNED, 0); }
		public SequenceOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceOption; }
	}

	public final SequenceOptionContext sequenceOption() throws RecognitionException {
		SequenceOptionContext _localctx = new SequenceOptionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_sequenceOption);
		int _la;
		try {
			setState(1469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1444);
				match(START);
				setState(1446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1445);
					match(WITH);
					}
				}

				setState(1448);
				match(NUMBER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1449);
				match(INCREMENT);
				setState(1451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(1450);
					match(BY);
					}
				}

				setState(1453);
				match(NUMBER_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1454);
				match(MAXVALUE);
				setState(1455);
				match(NUMBER_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1456);
				match(NO);
				setState(1457);
				match(MAXVALUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1458);
				match(MINVALUE);
				setState(1459);
				match(NUMBER_);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1460);
				match(NO);
				setState(1461);
				match(MINVALUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1462);
				match(CYCLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1463);
				match(NO);
				setState(1464);
				match(CYCLE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1465);
				match(CACHE);
				setState(1466);
				match(NUMBER_);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1467);
				match(OWNED);
				setState(1468);
				match(BY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexParametersContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode INCLUDE() { return getToken(PostgreSQLStatementParser.INCLUDE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public IndexParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexParameters; }
	}

	public final IndexParametersContext indexParameters() throws RecognitionException {
		IndexParametersContext _localctx = new IndexParametersContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_indexParameters);
		int _la;
		try {
			setState(1480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case RP_:
			case COMMA_:
			case SEMI_:
			case CONSTRAINT:
			case PRIMARY:
			case UNIQUE:
			case KEY:
			case USING:
			case NOT:
			case NULL:
			case DEFAULT:
			case CHECK:
			case GENERATED:
			case REFERENCES:
			case DEFERRABLE:
			case INITIALLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1471);
					match(USING);
					setState(1472);
					match(INDEX);
					setState(1473);
					match(TABLESPACE);
					setState(1474);
					ignoredIdentifier_();
					}
				}

				}
				break;
			case INCLUDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1477);
				match(INCLUDE);
				setState(1478);
				columnNames();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 3);
				{
				setState(1479);
				match(WITH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(PostgreSQLStatementParser.ACTION, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_action);
		int _la;
		try {
			setState(1488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1482);
				match(NO);
				setState(1483);
				match(ACTION);
				}
				break;
			case RESTRICT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1484);
				match(RESTRICT);
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1485);
				match(CASCADE);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(1486);
				match(SET);
				setState(1487);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==DEFAULT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintOptionalParamContext extends ParserRuleContext {
		public TerminalNode DEFERRABLE() { return getToken(PostgreSQLStatementParser.DEFERRABLE, 0); }
		public TerminalNode INITIALLY() { return getToken(PostgreSQLStatementParser.INITIALLY, 0); }
		public TerminalNode DEFERRED() { return getToken(PostgreSQLStatementParser.DEFERRED, 0); }
		public TerminalNode IMMEDIATE() { return getToken(PostgreSQLStatementParser.IMMEDIATE, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public ConstraintOptionalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintOptionalParam; }
	}

	public final ConstraintOptionalParamContext constraintOptionalParam() throws RecognitionException {
		ConstraintOptionalParamContext _localctx = new ConstraintOptionalParamContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_constraintOptionalParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1490);
					match(NOT);
					}
				}

				setState(1493);
				match(DEFERRABLE);
				}
				break;
			}
			setState(1498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIALLY) {
				{
				setState(1496);
				match(INITIALLY);
				setState(1497);
				_la = _input.LA(1);
				if ( !(_la==DEFERRED || _la==IMMEDIATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LikeOptionContext extends ParserRuleContext {
		public TerminalNode INCLUDING() { return getToken(PostgreSQLStatementParser.INCLUDING, 0); }
		public TerminalNode EXCLUDING() { return getToken(PostgreSQLStatementParser.EXCLUDING, 0); }
		public TerminalNode COMMENTS() { return getToken(PostgreSQLStatementParser.COMMENTS, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(PostgreSQLStatementParser.CONSTRAINTS, 0); }
		public TerminalNode DEFAULTS() { return getToken(PostgreSQLStatementParser.DEFAULTS, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode INDEXES() { return getToken(PostgreSQLStatementParser.INDEXES, 0); }
		public TerminalNode STATISTICS() { return getToken(PostgreSQLStatementParser.STATISTICS, 0); }
		public TerminalNode STORAGE() { return getToken(PostgreSQLStatementParser.STORAGE, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public LikeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeOption; }
	}

	public final LikeOptionContext likeOption() throws RecognitionException {
		LikeOptionContext _localctx = new LikeOptionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_likeOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			_la = _input.LA(1);
			if ( !(_la==EXCLUDING || _la==INCLUDING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1501);
			_la = _input.LA(1);
			if ( !(_la==ALL || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (COMMENTS - 198)) | (1L << (CONSTRAINTS - 198)) | (1L << (DEFAULTS - 198)) | (1L << (IDENTITY - 198)) | (1L << (INDEXES - 198)))) != 0) || _la==STATISTICS || _la==STORAGE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableConstraintContext extends ParserRuleContext {
		public TableConstraintOptionContext tableConstraintOption() {
			return getRuleContext(TableConstraintOptionContext.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public ConstraintClauseContext constraintClause() {
			return getRuleContext(ConstraintClauseContext.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_tableConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1503);
				constraintClause();
				}
			}

			setState(1506);
			tableConstraintOption();
			setState(1507);
			constraintOptionalParam();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableConstraintOptionContext extends ParserRuleContext {
		public CheckOptionContext checkOption() {
			return getRuleContext(CheckOptionContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public IndexParametersContext indexParameters() {
			return getRuleContext(IndexParametersContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode EXCLUDE() { return getToken(PostgreSQLStatementParser.EXCLUDE, 0); }
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(PostgreSQLStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(PostgreSQLStatementParser.KEY, 0); }
		public TerminalNode REFERENCES() { return getToken(PostgreSQLStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(PostgreSQLStatementParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(PostgreSQLStatementParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(PostgreSQLStatementParser.SIMPLE, 0); }
		public List<TerminalNode> ON() { return getTokens(PostgreSQLStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(PostgreSQLStatementParser.ON, i);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public List<TerminalNode> DELETE() { return getTokens(PostgreSQLStatementParser.DELETE); }
		public TerminalNode DELETE(int i) {
			return getToken(PostgreSQLStatementParser.DELETE, i);
		}
		public List<TerminalNode> UPDATE() { return getTokens(PostgreSQLStatementParser.UPDATE); }
		public TerminalNode UPDATE(int i) {
			return getToken(PostgreSQLStatementParser.UPDATE, i);
		}
		public TableConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraintOption; }
	}

	public final TableConstraintOptionContext tableConstraintOption() throws RecognitionException {
		TableConstraintOptionContext _localctx = new TableConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_tableConstraintOption);
		int _la;
		try {
			setState(1547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHECK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1509);
				checkOption();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1510);
				match(UNIQUE);
				setState(1511);
				columnNames();
				setState(1512);
				indexParameters();
				}
				break;
			case PRIMARY:
			case KEY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1514);
				primaryKey();
				setState(1515);
				columnNames();
				setState(1516);
				indexParameters();
				}
				break;
			case EXCLUDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1518);
				match(EXCLUDE);
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1519);
					match(USING);
					setState(1520);
					ignoredIdentifier_();
					}
				}

				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1523);
				match(FOREIGN);
				setState(1524);
				match(KEY);
				setState(1525);
				columnNames();
				setState(1526);
				match(REFERENCES);
				setState(1527);
				tableName();
				setState(1529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1528);
					columnNames();
					}
				}

				setState(1537);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1531);
					match(MATCH);
					setState(1532);
					match(FULL);
					}
					break;
				case 2:
					{
					setState(1533);
					match(MATCH);
					setState(1534);
					match(PARTIAL);
					}
					break;
				case 3:
					{
					setState(1535);
					match(MATCH);
					setState(1536);
					match(SIMPLE);
					}
					break;
				}
				setState(1544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(1539);
					match(ON);
					setState(1540);
					_la = _input.LA(1);
					if ( !(_la==UPDATE || _la==DELETE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1541);
					action();
					}
					}
					setState(1546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritClause_Context extends ParserRuleContext {
		public TerminalNode INHERITS() { return getToken(PostgreSQLStatementParser.INHERITS, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public InheritClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritClause_; }
	}

	public final InheritClause_Context inheritClause_() throws RecognitionException {
		InheritClause_Context _localctx = new InheritClause_Context(_ctx, getState());
		enterRule(_localctx, 248, RULE_inheritClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(1549);
				match(INHERITS);
				setState(1550);
				tableNames();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateIndexSpecification_Context extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public CreateIndexSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexSpecification_; }
	}

	public final CreateIndexSpecification_Context createIndexSpecification_() throws RecognitionException {
		CreateIndexSpecification_Context _localctx = new CreateIndexSpecification_Context(_ctx, getState());
		enterRule(_localctx, 250, RULE_createIndexSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(1553);
				match(UNIQUE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConcurrentlyClause_Context extends ParserRuleContext {
		public TerminalNode CONCURRENTLY() { return getToken(PostgreSQLStatementParser.CONCURRENTLY, 0); }
		public ConcurrentlyClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrentlyClause_; }
	}

	public final ConcurrentlyClause_Context concurrentlyClause_() throws RecognitionException {
		ConcurrentlyClause_Context _localctx = new ConcurrentlyClause_Context(_ctx, getState());
		enterRule(_localctx, 252, RULE_concurrentlyClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONCURRENTLY) {
				{
				setState(1556);
				match(CONCURRENTLY);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexNotExistClause_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public IndexNotExistClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexNotExistClause_; }
	}

	public final IndexNotExistClause_Context indexNotExistClause_() throws RecognitionException {
		IndexNotExistClause_Context _localctx = new IndexNotExistClause_Context(_ctx, getState());
		enterRule(_localctx, 254, RULE_indexNotExistClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1559);
				match(IF);
				setState(1560);
				match(NOT);
				setState(1561);
				match(EXISTS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnlyClause_Context extends ParserRuleContext {
		public TerminalNode ONLY() { return getToken(PostgreSQLStatementParser.ONLY, 0); }
		public OnlyClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onlyClause_; }
	}

	public final OnlyClause_Context onlyClause_() throws RecognitionException {
		OnlyClause_Context _localctx = new OnlyClause_Context(_ctx, getState());
		enterRule(_localctx, 256, RULE_onlyClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(1564);
				match(ONLY);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableExistClause_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TableExistClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExistClause_; }
	}

	public final TableExistClause_Context tableExistClause_() throws RecognitionException {
		TableExistClause_Context _localctx = new TableExistClause_Context(_ctx, getState());
		enterRule(_localctx, 258, RULE_tableExistClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1567);
				match(IF);
				setState(1568);
				match(EXISTS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsteriskClause_Context extends ParserRuleContext {
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public AsteriskClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asteriskClause_; }
	}

	public final AsteriskClause_Context asteriskClause_() throws RecognitionException {
		AsteriskClause_Context _localctx = new AsteriskClause_Context(_ctx, getState());
		enterRule(_localctx, 260, RULE_asteriskClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK_) {
				{
				setState(1571);
				match(ASTERISK_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterDefinitionClause_Context extends ParserRuleContext {
		public AlterTableActionsContext alterTableActions() {
			return getRuleContext(AlterTableActionsContext.class,0);
		}
		public RenameColumnSpecificationContext renameColumnSpecification() {
			return getRuleContext(RenameColumnSpecificationContext.class,0);
		}
		public RenameConstraintContext renameConstraint() {
			return getRuleContext(RenameConstraintContext.class,0);
		}
		public RenameTableSpecification_Context renameTableSpecification_() {
			return getRuleContext(RenameTableSpecification_Context.class,0);
		}
		public AlterDefinitionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDefinitionClause_; }
	}

	public final AlterDefinitionClause_Context alterDefinitionClause_() throws RecognitionException {
		AlterDefinitionClause_Context _localctx = new AlterDefinitionClause_Context(_ctx, getState());
		enterRule(_localctx, 262, RULE_alterDefinitionClause_);
		try {
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1574);
				alterTableActions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1575);
				renameColumnSpecification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1576);
				renameConstraint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1577);
				renameTableSpecification_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterIndexDefinitionClause_Context extends ParserRuleContext {
		public RenameIndexSpecificationContext renameIndexSpecification() {
			return getRuleContext(RenameIndexSpecificationContext.class,0);
		}
		public AlterIndexDependsOnExtensionContext alterIndexDependsOnExtension() {
			return getRuleContext(AlterIndexDependsOnExtensionContext.class,0);
		}
		public AlterIndexSetTableSpaceContext alterIndexSetTableSpace() {
			return getRuleContext(AlterIndexSetTableSpaceContext.class,0);
		}
		public AlterIndexDefinitionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexDefinitionClause_; }
	}

	public final AlterIndexDefinitionClause_Context alterIndexDefinitionClause_() throws RecognitionException {
		AlterIndexDefinitionClause_Context _localctx = new AlterIndexDefinitionClause_Context(_ctx, getState());
		enterRule(_localctx, 264, RULE_alterIndexDefinitionClause_);
		try {
			setState(1583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1580);
				renameIndexSpecification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1581);
				alterIndexDependsOnExtension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1582);
				alterIndexSetTableSpace();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public RenameIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameIndexSpecification; }
	}

	public final RenameIndexSpecificationContext renameIndexSpecification() throws RecognitionException {
		RenameIndexSpecificationContext _localctx = new RenameIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_renameIndexSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			match(RENAME);
			setState(1586);
			match(TO);
			setState(1587);
			indexName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterIndexDependsOnExtensionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode DEPENDS() { return getToken(PostgreSQLStatementParser.DEPENDS, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public TerminalNode EXTENSION() { return getToken(PostgreSQLStatementParser.EXTENSION, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public AlterIndexDependsOnExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexDependsOnExtension; }
	}

	public final AlterIndexDependsOnExtensionContext alterIndexDependsOnExtension() throws RecognitionException {
		AlterIndexDependsOnExtensionContext _localctx = new AlterIndexDependsOnExtensionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_alterIndexDependsOnExtension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			match(ALTER);
			setState(1590);
			match(INDEX);
			setState(1591);
			indexName();
			setState(1592);
			match(DEPENDS);
			setState(1593);
			match(ON);
			setState(1594);
			match(EXTENSION);
			setState(1595);
			ignoredIdentifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterIndexSetTableSpaceContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode IN() { return getToken(PostgreSQLStatementParser.IN, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode OWNED() { return getToken(PostgreSQLStatementParser.OWNED, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public AlterIndexSetTableSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexSetTableSpace; }
	}

	public final AlterIndexSetTableSpaceContext alterIndexSetTableSpace() throws RecognitionException {
		AlterIndexSetTableSpaceContext _localctx = new AlterIndexSetTableSpaceContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_alterIndexSetTableSpace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
			match(ALTER);
			setState(1598);
			match(INDEX);
			setState(1599);
			match(ALL);
			setState(1600);
			match(IN);
			setState(1601);
			match(TABLESPACE);
			setState(1602);
			indexName();
			setState(1606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OWNED) {
				{
				setState(1603);
				match(OWNED);
				setState(1604);
				match(BY);
				setState(1605);
				ignoredIdentifiers_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNamesClauseContext extends ParserRuleContext {
		public List<TableNameClauseContext> tableNameClause() {
			return getRuleContexts(TableNameClauseContext.class);
		}
		public TableNameClauseContext tableNameClause(int i) {
			return getRuleContext(TableNameClauseContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TableNamesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNamesClause; }
	}

	public final TableNamesClauseContext tableNamesClause() throws RecognitionException {
		TableNamesClauseContext _localctx = new TableNamesClauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_tableNamesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			tableNameClause();
			setState(1613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1609);
				match(COMMA_);
				setState(1610);
				tableNameClause();
				}
				}
				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameClauseContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public TableNameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNameClause; }
	}

	public final TableNameClauseContext tableNameClause() throws RecognitionException {
		TableNameClauseContext _localctx = new TableNameClauseContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_tableNameClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			tableName();
			setState(1618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK_) {
				{
				setState(1617);
				match(ASTERISK_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableActionsContext extends ParserRuleContext {
		public List<AlterTableActionContext> alterTableAction() {
			return getRuleContexts(AlterTableActionContext.class);
		}
		public AlterTableActionContext alterTableAction(int i) {
			return getRuleContext(AlterTableActionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public AlterTableActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableActions; }
	}

	public final AlterTableActionsContext alterTableActions() throws RecognitionException {
		AlterTableActionsContext _localctx = new AlterTableActionsContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_alterTableActions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			alterTableAction();
			setState(1625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1621);
				match(COMMA_);
				setState(1622);
				alterTableAction();
				}
				}
				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableActionContext extends ParserRuleContext {
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public AddConstraintSpecificationContext addConstraintSpecification() {
			return getRuleContext(AddConstraintSpecificationContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public TerminalNode VALIDATE() { return getToken(PostgreSQLStatementParser.VALIDATE, 0); }
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public IndexExistClause_Context indexExistClause_() {
			return getRuleContext(IndexExistClause_Context.class,0);
		}
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode TRIGGER() { return getToken(PostgreSQLStatementParser.TRIGGER, 0); }
		public TerminalNode DISABLE() { return getToken(PostgreSQLStatementParser.DISABLE, 0); }
		public TerminalNode ENABLE() { return getToken(PostgreSQLStatementParser.ENABLE, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public TerminalNode REPLICA() { return getToken(PostgreSQLStatementParser.REPLICA, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode RULE() { return getToken(PostgreSQLStatementParser.RULE, 0); }
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public TerminalNode LEVEL() { return getToken(PostgreSQLStatementParser.LEVEL, 0); }
		public TerminalNode SECURITY() { return getToken(PostgreSQLStatementParser.SECURITY, 0); }
		public TerminalNode FORCE() { return getToken(PostgreSQLStatementParser.FORCE, 0); }
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode CLUSTER() { return getToken(PostgreSQLStatementParser.CLUSTER, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode WITHOUT() { return getToken(PostgreSQLStatementParser.WITHOUT, 0); }
		public TerminalNode OIDS() { return getToken(PostgreSQLStatementParser.OIDS, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public TerminalNode LOGGED() { return getToken(PostgreSQLStatementParser.LOGGED, 0); }
		public TerminalNode UNLOGGED() { return getToken(PostgreSQLStatementParser.UNLOGGED, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<StorageParameterWithValueContext> storageParameterWithValue() {
			return getRuleContexts(StorageParameterWithValueContext.class);
		}
		public StorageParameterWithValueContext storageParameterWithValue(int i) {
			return getRuleContext(StorageParameterWithValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public List<StorageParameterContext> storageParameter() {
			return getRuleContexts(StorageParameterContext.class);
		}
		public StorageParameterContext storageParameter(int i) {
			return getRuleContext(StorageParameterContext.class,i);
		}
		public TerminalNode INHERIT() { return getToken(PostgreSQLStatementParser.INHERIT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode OF() { return getToken(PostgreSQLStatementParser.OF, 0); }
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode OWNER() { return getToken(PostgreSQLStatementParser.OWNER, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode CURRENT_USER() { return getToken(PostgreSQLStatementParser.CURRENT_USER, 0); }
		public TerminalNode SESSION_USER() { return getToken(PostgreSQLStatementParser.SESSION_USER, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode NOTHING() { return getToken(PostgreSQLStatementParser.NOTHING, 0); }
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public AlterTableActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAction; }
	}

	public final AlterTableActionContext alterTableAction() throws RecognitionException {
		AlterTableActionContext _localctx = new AlterTableActionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_alterTableAction);
		int _la;
		try {
			setState(1740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1628);
				addColumnSpecification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1629);
				dropColumnSpecification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1630);
				modifyColumnSpecification();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1631);
				addConstraintSpecification();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1632);
				match(ALTER);
				setState(1633);
				match(CONSTRAINT);
				setState(1634);
				ignoredIdentifier_();
				setState(1635);
				constraintOptionalParam();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1637);
				match(VALIDATE);
				setState(1638);
				match(CONSTRAINT);
				setState(1639);
				ignoredIdentifier_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1640);
				match(DROP);
				setState(1641);
				match(CONSTRAINT);
				setState(1642);
				indexExistClause_();
				setState(1643);
				ignoredIdentifier_();
				setState(1645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(1644);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1647);
				_la = _input.LA(1);
				if ( !(_la==ENABLE || _la==DISABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1648);
				match(TRIGGER);
				setState(1652);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case INSERT:
				case UPDATE:
				case DELETE:
				case ALTER:
				case DROP:
				case TRUNCATE:
				case SCHEMA:
				case REVOKE:
				case ADD:
				case SET:
				case INDEX:
				case KEY:
				case FUNCTION:
				case TRIGGER:
				case PROCEDURE:
				case IF:
				case BEGIN:
				case COMMIT:
				case ROLLBACK:
				case SAVEPOINT:
				case YEAR:
				case MONTH:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case CURRENT:
				case ENABLE:
				case DISABLE:
				case INSTANCE:
				case PRESERVE:
				case DEFINER:
				case SQL:
				case CASCADED:
				case LOCAL:
				case CLOSE:
				case OPEN:
				case NEXT:
				case NAME:
				case ADMIN:
				case ESCAPE:
				case EXCLUDE:
				case PARTITION:
				case UNKNOWN:
				case ALWAYS:
				case CASCADE:
				case GENERATED:
				case ISOLATION:
				case LEVEL:
				case OPTION:
				case PRIVILEGES:
				case READ:
				case ROLE:
				case ROWS:
				case START:
				case TRANSACTION:
				case ACTION:
				case CACHE:
				case CHARACTERISTICS:
				case CLUSTER:
				case COMMENTS:
				case CONSTRAINTS:
				case CYCLE:
				case DATA:
				case DATABASE:
				case DEFAULTS:
				case DEFERRED:
				case DEPENDS:
				case DOMAIN:
				case EXCLUDING:
				case EXECUTE:
				case EXTENDED:
				case EXTENSION:
				case EXTERNAL:
				case EXTRACT:
				case FILTER:
				case FIRST:
				case FOLLOWING:
				case FORCE:
				case GLOBAL:
				case IDENTITY:
				case IMMEDIATE:
				case INCLUDING:
				case INCREMENT:
				case INDEXES:
				case INHERIT:
				case INHERITS:
				case INCLUDE:
				case LANGUAGE:
				case LARGE:
				case LAST:
				case LOGGED:
				case MAIN:
				case MATCH:
				case MAXVALUE:
				case MINVALUE:
				case NOTHING:
				case NULLS:
				case OBJECT:
				case OIDS:
				case OVER:
				case OWNED:
				case OWNER:
				case PARTIAL:
				case PLAIN:
				case PRECEDING:
				case RANGE:
				case RENAME:
				case REPLICA:
				case RESET:
				case RESTART:
				case RESTRICT:
				case ROUTINE:
				case RULE:
				case SECURITY:
				case SEQUENCE:
				case SESSION:
				case SHOW:
				case SIMPLE:
				case STATISTICS:
				case STORAGE:
				case TABLESPACE:
				case TEMP:
				case TEMPORARY:
				case TYPE:
				case UNBOUNDED:
				case UNLOGGED:
				case USAGE:
				case VALID:
				case VALIDATE:
				case WITHIN:
				case WITHOUT:
				case ZONE:
				case OF:
				case GROUPS:
				case RECURSIVE:
				case IDENTIFIER_:
					{
					setState(1649);
					ignoredIdentifier_();
					}
					break;
				case ALL:
					{
					setState(1650);
					match(ALL);
					}
					break;
				case USER:
					{
					setState(1651);
					match(USER);
					}
					break;
				case EOF:
				case COMMA_:
				case SEMI_:
					break;
				default:
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1654);
				match(ENABLE);
				setState(1655);
				_la = _input.LA(1);
				if ( !(_la==ALWAYS || _la==REPLICA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1656);
				match(TRIGGER);
				setState(1657);
				ignoredIdentifier_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1658);
				_la = _input.LA(1);
				if ( !(_la==ENABLE || _la==DISABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1659);
				match(RULE);
				setState(1660);
				ignoredIdentifier_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1661);
				match(ENABLE);
				setState(1662);
				_la = _input.LA(1);
				if ( !(_la==ALWAYS || _la==REPLICA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1663);
				match(RULE);
				setState(1664);
				ignoredIdentifier_();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1671);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DISABLE:
					{
					setState(1665);
					match(DISABLE);
					}
					break;
				case ENABLE:
					{
					setState(1666);
					match(ENABLE);
					}
					break;
				case NO:
				case FORCE:
					{
					{
					setState(1668);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(1667);
						match(NO);
						}
					}

					setState(1670);
					match(FORCE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1673);
				match(ROW);
				setState(1674);
				match(LEVEL);
				setState(1675);
				match(SECURITY);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1676);
				match(CLUSTER);
				setState(1677);
				match(ON);
				setState(1678);
				indexName();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1679);
				match(SET);
				setState(1680);
				match(WITHOUT);
				setState(1681);
				match(CLUSTER);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1682);
				match(SET);
				setState(1683);
				_la = _input.LA(1);
				if ( !(_la==WITH || _la==WITHOUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1684);
				match(OIDS);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1685);
				match(SET);
				setState(1686);
				match(TABLESPACE);
				setState(1687);
				ignoredIdentifier_();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1688);
				match(SET);
				setState(1689);
				_la = _input.LA(1);
				if ( !(_la==LOGGED || _la==UNLOGGED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1690);
				match(SET);
				setState(1691);
				match(LP_);
				setState(1692);
				storageParameterWithValue();
				setState(1697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1693);
					match(COMMA_);
					setState(1694);
					storageParameterWithValue();
					}
					}
					setState(1699);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1700);
				match(RP_);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1702);
				match(RESET);
				setState(1703);
				match(LP_);
				setState(1704);
				storageParameter();
				setState(1709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1705);
					match(COMMA_);
					setState(1706);
					storageParameter();
					}
					}
					setState(1711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1712);
				match(RP_);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1714);
				match(INHERIT);
				setState(1715);
				tableName();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1716);
				match(NO);
				setState(1717);
				match(INHERIT);
				setState(1718);
				tableName();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1719);
				match(OF);
				setState(1720);
				dataTypeName_();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1721);
				match(NOT);
				setState(1722);
				match(OF);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1723);
				match(OWNER);
				setState(1724);
				match(TO);
				setState(1728);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case INSERT:
				case UPDATE:
				case DELETE:
				case ALTER:
				case DROP:
				case TRUNCATE:
				case SCHEMA:
				case REVOKE:
				case ADD:
				case SET:
				case INDEX:
				case KEY:
				case FUNCTION:
				case TRIGGER:
				case PROCEDURE:
				case IF:
				case BEGIN:
				case COMMIT:
				case ROLLBACK:
				case SAVEPOINT:
				case YEAR:
				case MONTH:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case CURRENT:
				case ENABLE:
				case DISABLE:
				case INSTANCE:
				case PRESERVE:
				case DEFINER:
				case SQL:
				case CASCADED:
				case LOCAL:
				case CLOSE:
				case OPEN:
				case NEXT:
				case NAME:
				case ADMIN:
				case ESCAPE:
				case EXCLUDE:
				case PARTITION:
				case UNKNOWN:
				case ALWAYS:
				case CASCADE:
				case GENERATED:
				case ISOLATION:
				case LEVEL:
				case OPTION:
				case PRIVILEGES:
				case READ:
				case ROLE:
				case ROWS:
				case START:
				case TRANSACTION:
				case ACTION:
				case CACHE:
				case CHARACTERISTICS:
				case CLUSTER:
				case COMMENTS:
				case CONSTRAINTS:
				case CYCLE:
				case DATA:
				case DATABASE:
				case DEFAULTS:
				case DEFERRED:
				case DEPENDS:
				case DOMAIN:
				case EXCLUDING:
				case EXECUTE:
				case EXTENDED:
				case EXTENSION:
				case EXTERNAL:
				case EXTRACT:
				case FILTER:
				case FIRST:
				case FOLLOWING:
				case FORCE:
				case GLOBAL:
				case IDENTITY:
				case IMMEDIATE:
				case INCLUDING:
				case INCREMENT:
				case INDEXES:
				case INHERIT:
				case INHERITS:
				case INCLUDE:
				case LANGUAGE:
				case LARGE:
				case LAST:
				case LOGGED:
				case MAIN:
				case MATCH:
				case MAXVALUE:
				case MINVALUE:
				case NOTHING:
				case NULLS:
				case OBJECT:
				case OIDS:
				case OVER:
				case OWNED:
				case OWNER:
				case PARTIAL:
				case PLAIN:
				case PRECEDING:
				case RANGE:
				case RENAME:
				case REPLICA:
				case RESET:
				case RESTART:
				case RESTRICT:
				case ROUTINE:
				case RULE:
				case SECURITY:
				case SEQUENCE:
				case SESSION:
				case SHOW:
				case SIMPLE:
				case STATISTICS:
				case STORAGE:
				case TABLESPACE:
				case TEMP:
				case TEMPORARY:
				case TYPE:
				case UNBOUNDED:
				case UNLOGGED:
				case USAGE:
				case VALID:
				case VALIDATE:
				case WITHIN:
				case WITHOUT:
				case ZONE:
				case OF:
				case GROUPS:
				case RECURSIVE:
				case IDENTIFIER_:
					{
					setState(1725);
					ignoredIdentifier_();
					}
					break;
				case CURRENT_USER:
					{
					setState(1726);
					match(CURRENT_USER);
					}
					break;
				case SESSION_USER:
					{
					setState(1727);
					match(SESSION_USER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1730);
				match(REPLICA);
				setState(1731);
				match(IDENTITY);
				setState(1738);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFAULT:
					{
					setState(1732);
					match(DEFAULT);
					}
					break;
				case USING:
					{
					{
					setState(1733);
					match(USING);
					setState(1734);
					match(INDEX);
					setState(1735);
					indexName();
					}
					}
					break;
				case FULL:
					{
					setState(1736);
					match(FULL);
					}
					break;
				case NOTHING:
					{
					setState(1737);
					match(NOTHING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			match(ADD);
			setState(1744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1743);
				match(COLUMN);
				}
			}

			setState(1749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1746);
				match(IF);
				setState(1747);
				match(NOT);
				setState(1748);
				match(EXISTS);
				}
				break;
			}
			setState(1751);
			columnDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public ColumnExistClause_Context columnExistClause_() {
			return getRuleContext(ColumnExistClause_Context.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_dropColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1753);
			match(DROP);
			setState(1755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1754);
				match(COLUMN);
				}
			}

			setState(1757);
			columnExistClause_();
			setState(1758);
			columnName();
			setState(1760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1759);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnExistClause_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public ColumnExistClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnExistClause_; }
	}

	public final ColumnExistClause_Context columnExistClause_() throws RecognitionException {
		ColumnExistClause_Context _localctx = new ColumnExistClause_Context(_ctx, getState());
		enterRule(_localctx, 284, RULE_columnExistClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1762);
				match(IF);
				setState(1763);
				match(EXISTS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public ModifyColumnContext modifyColumn() {
			return getRuleContext(ModifyColumnContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(PostgreSQLStatementParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode DATA() { return getToken(PostgreSQLStatementParser.DATA, 0); }
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public SequenceOptionsContext sequenceOptions() {
			return getRuleContext(SequenceOptionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public List<AlterColumnSetOptionContext> alterColumnSetOption() {
			return getRuleContexts(AlterColumnSetOptionContext.class);
		}
		public AlterColumnSetOptionContext alterColumnSetOption(int i) {
			return getRuleContext(AlterColumnSetOptionContext.class,i);
		}
		public ColumnExistClause_Context columnExistClause_() {
			return getRuleContext(ColumnExistClause_Context.class,0);
		}
		public TerminalNode STATISTICS() { return getToken(PostgreSQLStatementParser.STATISTICS, 0); }
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public AttributeOptionsContext attributeOptions() {
			return getRuleContext(AttributeOptionsContext.class,0);
		}
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public TerminalNode STORAGE() { return getToken(PostgreSQLStatementParser.STORAGE, 0); }
		public TerminalNode PLAIN() { return getToken(PostgreSQLStatementParser.PLAIN, 0); }
		public TerminalNode EXTERNAL() { return getToken(PostgreSQLStatementParser.EXTERNAL, 0); }
		public TerminalNode EXTENDED() { return getToken(PostgreSQLStatementParser.EXTENDED, 0); }
		public TerminalNode MAIN() { return getToken(PostgreSQLStatementParser.MAIN, 0); }
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_modifyColumnSpecification);
		int _la;
		try {
			setState(1845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1766);
				modifyColumn();
				setState(1769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(1767);
					match(SET);
					setState(1768);
					match(DATA);
					}
				}

				setState(1771);
				match(TYPE);
				setState(1772);
				dataType();
				setState(1774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(1773);
					collateClause_();
					}
				}

				setState(1778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1776);
					match(USING);
					setState(1777);
					simpleExpr(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1780);
				modifyColumn();
				setState(1781);
				match(SET);
				setState(1782);
				match(DEFAULT);
				setState(1783);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1785);
				modifyColumn();
				setState(1786);
				match(DROP);
				setState(1787);
				match(DEFAULT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1789);
				modifyColumn();
				setState(1790);
				_la = _input.LA(1);
				if ( !(_la==DROP || _la==SET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1791);
				match(NOT);
				setState(1792);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1794);
				modifyColumn();
				setState(1795);
				match(ADD);
				setState(1796);
				match(GENERATED);
				setState(1800);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALWAYS:
					{
					setState(1797);
					match(ALWAYS);
					}
					break;
				case BY:
					{
					{
					setState(1798);
					match(BY);
					setState(1799);
					match(DEFAULT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1802);
				match(AS);
				setState(1803);
				match(IDENTITY);
				setState(1808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1804);
					match(LP_);
					setState(1805);
					sequenceOptions();
					setState(1806);
					match(RP_);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1810);
				modifyColumn();
				setState(1811);
				alterColumnSetOption();
				setState(1815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SET || _la==RESTART) {
					{
					{
					setState(1812);
					alterColumnSetOption();
					}
					}
					setState(1817);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1818);
				modifyColumn();
				setState(1819);
				match(DROP);
				setState(1820);
				match(IDENTITY);
				setState(1821);
				columnExistClause_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1823);
				modifyColumn();
				setState(1824);
				match(SET);
				setState(1825);
				match(STATISTICS);
				setState(1826);
				match(NUMBER_);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1828);
				modifyColumn();
				setState(1829);
				match(SET);
				setState(1830);
				match(LP_);
				setState(1831);
				attributeOptions();
				setState(1832);
				match(RP_);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1834);
				modifyColumn();
				setState(1835);
				match(RESET);
				setState(1836);
				match(LP_);
				setState(1837);
				attributeOptions();
				setState(1838);
				match(RP_);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1840);
				modifyColumn();
				setState(1841);
				match(SET);
				setState(1842);
				match(STORAGE);
				setState(1843);
				_la = _input.LA(1);
				if ( !(((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (EXTENDED - 213)) | (1L << (EXTERNAL - 213)) | (1L << (MAIN - 213)) | (1L << (PLAIN - 213)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifyColumnContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public ModifyColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumn; }
	}

	public final ModifyColumnContext modifyColumn() throws RecognitionException {
		ModifyColumnContext _localctx = new ModifyColumnContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_modifyColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			match(ALTER);
			setState(1849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1848);
				match(COLUMN);
				}
			}

			setState(1851);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterColumnSetOptionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public SequenceOptionContext sequenceOption() {
			return getRuleContext(SequenceOptionContext.class,0);
		}
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public TerminalNode RESTART() { return getToken(PostgreSQLStatementParser.RESTART, 0); }
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public AlterColumnSetOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnSetOption; }
	}

	public final AlterColumnSetOptionContext alterColumnSetOption() throws RecognitionException {
		AlterColumnSetOptionContext _localctx = new AlterColumnSetOptionContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_alterColumnSetOption);
		int _la;
		try {
			setState(1870);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1853);
				match(SET);
				setState(1861);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GENERATED:
					{
					setState(1854);
					match(GENERATED);
					setState(1858);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ALWAYS:
						{
						setState(1855);
						match(ALWAYS);
						}
						break;
					case BY:
						{
						setState(1856);
						match(BY);
						setState(1857);
						match(DEFAULT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case NO:
				case START:
				case CACHE:
				case CYCLE:
				case INCREMENT:
				case MAXVALUE:
				case MINVALUE:
				case OWNED:
					{
					setState(1860);
					sequenceOption();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case RESTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(1863);
				match(RESTART);
				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH || _la==NUMBER_) {
					{
					setState(1865);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(1864);
						match(WITH);
						}
					}

					setState(1867);
					match(NUMBER_);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeOptionsContext extends ParserRuleContext {
		public List<AttributeOptionContext> attributeOption() {
			return getRuleContexts(AttributeOptionContext.class);
		}
		public AttributeOptionContext attributeOption(int i) {
			return getRuleContext(AttributeOptionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public AttributeOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOptions; }
	}

	public final AttributeOptionsContext attributeOptions() throws RecognitionException {
		AttributeOptionsContext _localctx = new AttributeOptionsContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_attributeOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			attributeOption();
			setState(1877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1873);
				match(COMMA_);
				setState(1874);
				attributeOption();
				}
				}
				setState(1879);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeOptionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public AttributeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOption; }
	}

	public final AttributeOptionContext attributeOption() throws RecognitionException {
		AttributeOptionContext _localctx = new AttributeOptionContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_attributeOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1880);
			match(IDENTIFIER_);
			setState(1881);
			match(EQ_);
			setState(1882);
			simpleExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddConstraintSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableConstraintUsingIndexContext tableConstraintUsingIndex() {
			return getRuleContext(TableConstraintUsingIndexContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode VALID() { return getToken(PostgreSQLStatementParser.VALID, 0); }
		public AddConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraintSpecification; }
	}

	public final AddConstraintSpecificationContext addConstraintSpecification() throws RecognitionException {
		AddConstraintSpecificationContext _localctx = new AddConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_addConstraintSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			match(ADD);
			setState(1891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1885);
				tableConstraint();
				setState(1888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1886);
					match(NOT);
					setState(1887);
					match(VALID);
					}
				}

				}
				break;
			case 2:
				{
				setState(1890);
				tableConstraintUsingIndex();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableConstraintUsingIndexContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TableConstraintUsingIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraintUsingIndex; }
	}

	public final TableConstraintUsingIndexContext tableConstraintUsingIndex() throws RecognitionException {
		TableConstraintUsingIndexContext _localctx = new TableConstraintUsingIndexContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_tableConstraintUsingIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1893);
				match(CONSTRAINT);
				setState(1894);
				ignoredIdentifier_();
				}
			}

			setState(1899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE:
				{
				setState(1897);
				match(UNIQUE);
				}
				break;
			case PRIMARY:
			case KEY:
				{
				setState(1898);
				primaryKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1901);
			match(USING);
			setState(1902);
			match(INDEX);
			setState(1903);
			indexName();
			setState(1904);
			constraintOptionalParam();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageParameterWithValueContext extends ParserRuleContext {
		public StorageParameterContext storageParameter() {
			return getRuleContext(StorageParameterContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public StorageParameterWithValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageParameterWithValue; }
	}

	public final StorageParameterWithValueContext storageParameterWithValue() throws RecognitionException {
		StorageParameterWithValueContext _localctx = new StorageParameterWithValueContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_storageParameterWithValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
			storageParameter();
			setState(1907);
			match(EQ_);
			setState(1908);
			simpleExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public StorageParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageParameter; }
	}

	public final StorageParameterContext storageParameter() throws RecognitionException {
		StorageParameterContext _localctx = new StorageParameterContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_storageParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1910);
			match(IDENTIFIER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public RenameColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameColumnSpecification; }
	}

	public final RenameColumnSpecificationContext renameColumnSpecification() throws RecognitionException {
		RenameColumnSpecificationContext _localctx = new RenameColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_renameColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1912);
			match(RENAME);
			setState(1914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1913);
				match(COLUMN);
				}
			}

			setState(1916);
			columnName();
			setState(1917);
			match(TO);
			setState(1918);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameConstraintContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public RenameConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameConstraint; }
	}

	public final RenameConstraintContext renameConstraint() throws RecognitionException {
		RenameConstraintContext _localctx = new RenameConstraintContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_renameConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1920);
			match(RENAME);
			setState(1921);
			match(CONSTRAINT);
			setState(1922);
			ignoredIdentifier_();
			setState(1923);
			match(TO);
			setState(1924);
			ignoredIdentifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameTableSpecification_Context extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public RenameTableSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameTableSpecification_; }
	}

	public final RenameTableSpecification_Context renameTableSpecification_() throws RecognitionException {
		RenameTableSpecification_Context _localctx = new RenameTableSpecification_Context(_ctx, getState());
		enterRule(_localctx, 308, RULE_renameTableSpecification_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1926);
			match(RENAME);
			setState(1927);
			match(TO);
			setState(1928);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexExistClause_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public IndexExistClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexExistClause_; }
	}

	public final IndexExistClause_Context indexExistClause_() throws RecognitionException {
		IndexExistClause_Context _localctx = new IndexExistClause_Context(_ctx, getState());
		enterRule(_localctx, 310, RULE_indexExistClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1930);
				match(IF);
				setState(1931);
				match(EXISTS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexNamesContext extends ParserRuleContext {
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public IndexNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexNames; }
	}

	public final IndexNamesContext indexNames() throws RecognitionException {
		IndexNamesContext _localctx = new IndexNamesContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_indexNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1934);
			indexName();
			setState(1939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1935);
				match(COMMA_);
				setState(1936);
				indexName();
				}
				}
				setState(1941);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetTransactionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public TerminalNode SESSION() { return getToken(PostgreSQLStatementParser.SESSION, 0); }
		public TerminalNode CHARACTERISTICS() { return getToken(PostgreSQLStatementParser.CHARACTERISTICS, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_setTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1942);
			match(SET);
			setState(1946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SESSION) {
				{
				setState(1943);
				match(SESSION);
				setState(1944);
				match(CHARACTERISTICS);
				setState(1945);
				match(AS);
				}
			}

			setState(1948);
			match(TRANSACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeginTransactionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PostgreSQLStatementParser.BEGIN, 0); }
		public TerminalNode START() { return getToken(PostgreSQLStatementParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public BeginTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginTransaction; }
	}

	public final BeginTransactionContext beginTransaction() throws RecognitionException {
		BeginTransactionContext _localctx = new BeginTransactionContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_beginTransaction);
		try {
			setState(1953);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1950);
				match(BEGIN);
				}
				break;
			case START:
				enterOuterAlt(_localctx, 2);
				{
				setState(1951);
				match(START);
				setState(1952);
				match(TRANSACTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(PostgreSQLStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			match(COMMIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RollbackContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(PostgreSQLStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			match(ROLLBACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SavepointContext extends ParserRuleContext {
		public TerminalNode SAVEPOINT() { return getToken(PostgreSQLStatementParser.SAVEPOINT, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_savepoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			match(SAVEPOINT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(PostgreSQLStatementParser.GRANT, 0); }
		public PrivilegeClause_Context privilegeClause_() {
			return getRuleContext(PrivilegeClause_Context.class,0);
		}
		public RoleClause_Context roleClause_() {
			return getRuleContext(RoleClause_Context.class,0);
		}
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1961);
			match(GRANT);
			setState(1964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1962);
				privilegeClause_();
				}
				break;
			case 2:
				{
				setState(1963);
				roleClause_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevokeContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(PostgreSQLStatementParser.REVOKE, 0); }
		public PrivilegeClause_Context privilegeClause_() {
			return getRuleContext(PrivilegeClause_Context.class,0);
		}
		public RoleClause_Context roleClause_() {
			return getRuleContext(RoleClause_Context.class,0);
		}
		public OptionForClause_Context optionForClause_() {
			return getRuleContext(OptionForClause_Context.class,0);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_revoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
			match(REVOKE);
			setState(1968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1967);
				optionForClause_();
				}
				break;
			}
			setState(1972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1970);
				privilegeClause_();
				}
				break;
			case 2:
				{
				setState(1971);
				roleClause_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeClause_Context extends ParserRuleContext {
		public Privileges_Context privileges_() {
			return getRuleContext(Privileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public OnObjectClause_Context onObjectClause_() {
			return getRuleContext(OnObjectClause_Context.class,0);
		}
		public PrivilegeClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeClause_; }
	}

	public final PrivilegeClause_Context privilegeClause_() throws RecognitionException {
		PrivilegeClause_Context _localctx = new PrivilegeClause_Context(_ctx, getState());
		enterRule(_localctx, 328, RULE_privilegeClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1974);
			privileges_();
			setState(1975);
			match(ON);
			setState(1976);
			onObjectClause_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleClause_Context extends ParserRuleContext {
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public RoleClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleClause_; }
	}

	public final RoleClause_Context roleClause_() throws RecognitionException {
		RoleClause_Context _localctx = new RoleClause_Context(_ctx, getState());
		enterRule(_localctx, 330, RULE_roleClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1978);
			ignoredIdentifiers_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionForClause_Context extends ParserRuleContext {
		public TerminalNode OPTION() { return getToken(PostgreSQLStatementParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(PostgreSQLStatementParser.FOR, 0); }
		public TerminalNode GRANT() { return getToken(PostgreSQLStatementParser.GRANT, 0); }
		public TerminalNode ADMIN() { return getToken(PostgreSQLStatementParser.ADMIN, 0); }
		public OptionForClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionForClause_; }
	}

	public final OptionForClause_Context optionForClause_() throws RecognitionException {
		OptionForClause_Context _localctx = new OptionForClause_Context(_ctx, getState());
		enterRule(_localctx, 332, RULE_optionForClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			_la = _input.LA(1);
			if ( !(_la==GRANT || _la==ADMIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1981);
			match(OPTION);
			setState(1982);
			match(FOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Privileges_Context extends ParserRuleContext {
		public List<PrivilegeType_Context> privilegeType_() {
			return getRuleContexts(PrivilegeType_Context.class);
		}
		public PrivilegeType_Context privilegeType_(int i) {
			return getRuleContext(PrivilegeType_Context.class,i);
		}
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public Privileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privileges_; }
	}

	public final Privileges_Context privileges_() throws RecognitionException {
		Privileges_Context _localctx = new Privileges_Context(_ctx, getState());
		enterRule(_localctx, 334, RULE_privileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1984);
			privilegeType_();
			setState(1986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1985);
				columnNames();
				}
			}

			setState(1995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1988);
				match(COMMA_);
				setState(1989);
				privilegeType_();
				setState(1991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1990);
					columnNames();
					}
				}

				}
				}
				setState(1997);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeType_Context extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(PostgreSQLStatementParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(PostgreSQLStatementParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(PostgreSQLStatementParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(PostgreSQLStatementParser.DELETE, 0); }
		public TerminalNode TRUNCATE() { return getToken(PostgreSQLStatementParser.TRUNCATE, 0); }
		public TerminalNode REFERENCES() { return getToken(PostgreSQLStatementParser.REFERENCES, 0); }
		public TerminalNode TRIGGER() { return getToken(PostgreSQLStatementParser.TRIGGER, 0); }
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode CONNECT() { return getToken(PostgreSQLStatementParser.CONNECT, 0); }
		public TerminalNode TEMPORARY() { return getToken(PostgreSQLStatementParser.TEMPORARY, 0); }
		public TerminalNode TEMP() { return getToken(PostgreSQLStatementParser.TEMP, 0); }
		public TerminalNode EXECUTE() { return getToken(PostgreSQLStatementParser.EXECUTE, 0); }
		public TerminalNode USAGE() { return getToken(PostgreSQLStatementParser.USAGE, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(PostgreSQLStatementParser.PRIVILEGES, 0); }
		public PrivilegeType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeType_; }
	}

	public final PrivilegeType_Context privilegeType_() throws RecognitionException {
		PrivilegeType_Context _localctx = new PrivilegeType_Context(_ctx, getState());
		enterRule(_localctx, 336, RULE_privilegeType_);
		int _la;
		try {
			setState(2015);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1998);
				match(SELECT);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1999);
				match(INSERT);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2000);
				match(UPDATE);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2001);
				match(DELETE);
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2002);
				match(TRUNCATE);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 6);
				{
				setState(2003);
				match(REFERENCES);
				}
				break;
			case TRIGGER:
				enterOuterAlt(_localctx, 7);
				{
				setState(2004);
				match(TRIGGER);
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2005);
				match(CREATE);
				}
				break;
			case CONNECT:
				enterOuterAlt(_localctx, 9);
				{
				setState(2006);
				match(CONNECT);
				}
				break;
			case TEMPORARY:
				enterOuterAlt(_localctx, 10);
				{
				setState(2007);
				match(TEMPORARY);
				}
				break;
			case TEMP:
				enterOuterAlt(_localctx, 11);
				{
				setState(2008);
				match(TEMP);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 12);
				{
				setState(2009);
				match(EXECUTE);
				}
				break;
			case USAGE:
				enterOuterAlt(_localctx, 13);
				{
				setState(2010);
				match(USAGE);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 14);
				{
				setState(2011);
				match(ALL);
				setState(2013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(2012);
					match(PRIVILEGES);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnObjectClause_Context extends ParserRuleContext {
		public TerminalNode DATABASE() { return getToken(PostgreSQLStatementParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(PostgreSQLStatementParser.SCHEMA, 0); }
		public TerminalNode DOMAIN() { return getToken(PostgreSQLStatementParser.DOMAIN, 0); }
		public TerminalNode FOREIGN() { return getToken(PostgreSQLStatementParser.FOREIGN, 0); }
		public TerminalNode FUNCTION() { return getToken(PostgreSQLStatementParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(PostgreSQLStatementParser.PROCEDURE, 0); }
		public TerminalNode ROUTINE() { return getToken(PostgreSQLStatementParser.ROUTINE, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode LANGUAGE() { return getToken(PostgreSQLStatementParser.LANGUAGE, 0); }
		public TerminalNode LARGE() { return getToken(PostgreSQLStatementParser.LARGE, 0); }
		public TerminalNode OBJECT() { return getToken(PostgreSQLStatementParser.OBJECT, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public TerminalNode TYPE() { return getToken(PostgreSQLStatementParser.TYPE, 0); }
		public TerminalNode SEQUENCE() { return getToken(PostgreSQLStatementParser.SEQUENCE, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public OnObjectClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onObjectClause_; }
	}

	public final OnObjectClause_Context onObjectClause_() throws RecognitionException {
		OnObjectClause_Context _localctx = new OnObjectClause_Context(_ctx, getState());
		enterRule(_localctx, 338, RULE_onObjectClause_);
		int _la;
		try {
			setState(2035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2017);
				match(DATABASE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2018);
				match(SCHEMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2019);
				match(DOMAIN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2020);
				match(FOREIGN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2021);
				match(FUNCTION);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2022);
				match(PROCEDURE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2023);
				match(ROUTINE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2024);
				match(ALL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2025);
				match(LANGUAGE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2026);
				match(LARGE);
				setState(2027);
				match(OBJECT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2028);
				match(TABLESPACE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2029);
				match(TYPE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2030);
				match(SEQUENCE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(2031);
					match(TABLE);
					}
				}

				setState(2034);
				tableNames();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateUserContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2037);
			match(CREATE);
			setState(2038);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropUserContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2040);
			match(DROP);
			setState(2041);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterUserContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2043);
			match(ALTER);
			setState(2044);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateRoleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2046);
			match(CREATE);
			setState(2047);
			match(ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropRoleContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2049);
			match(DROP);
			setState(2050);
			match(ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterRoleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_alterRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2052);
			match(ALTER);
			setState(2053);
			match(ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(PostgreSQLStatementParser.SHOW, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public TerminalNode ISOLATION() { return getToken(PostgreSQLStatementParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(PostgreSQLStatementParser.LEVEL, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			match(SHOW);
			setState(2061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(2056);
				match(ALL);
				}
				break;
			case 2:
				{
				setState(2057);
				match(TRANSACTION);
				setState(2058);
				match(ISOLATION);
				setState(2059);
				match(LEVEL);
				}
				break;
			case 3:
				{
				setState(2060);
				identifier_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TimeZoneClause_Context timeZoneClause_() {
			return getRuleContext(TimeZoneClause_Context.class,0);
		}
		public ConfigurationParameterClause_Context configurationParameterClause_() {
			return getRuleContext(ConfigurationParameterClause_Context.class,0);
		}
		public RuntimeScope_Context runtimeScope_() {
			return getRuleContext(RuntimeScope_Context.class,0);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2063);
			match(SET);
			setState(2065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(2064);
				runtimeScope_();
				}
				break;
			}
			setState(2069);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIME:
				{
				setState(2067);
				timeZoneClause_();
				}
				break;
			case T__0:
			case T__1:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case IF:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case ADMIN:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case TYPE:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case IDENTIFIER_:
				{
				setState(2068);
				configurationParameterClause_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuntimeScope_Context extends ParserRuleContext {
		public TerminalNode SESSION() { return getToken(PostgreSQLStatementParser.SESSION, 0); }
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public RuntimeScope_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runtimeScope_; }
	}

	public final RuntimeScope_Context runtimeScope_() throws RecognitionException {
		RuntimeScope_Context _localctx = new RuntimeScope_Context(_ctx, getState());
		enterRule(_localctx, 356, RULE_runtimeScope_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2071);
			_la = _input.LA(1);
			if ( !(_la==LOCAL || _la==SESSION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeZoneClause_Context extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(PostgreSQLStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(PostgreSQLStatementParser.ZONE, 0); }
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public TimeZoneClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneClause_; }
	}

	public final TimeZoneClause_Context timeZoneClause_() throws RecognitionException {
		TimeZoneClause_Context _localctx = new TimeZoneClause_Context(_ctx, getState());
		enterRule(_localctx, 358, RULE_timeZoneClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2073);
			match(TIME);
			setState(2074);
			match(ZONE);
			setState(2078);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS_:
			case NUMBER_:
				{
				setState(2075);
				numberLiterals();
				}
				break;
			case LOCAL:
				{
				setState(2076);
				match(LOCAL);
				}
				break;
			case DEFAULT:
				{
				setState(2077);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigurationParameterClause_Context extends ParserRuleContext {
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public ConfigurationParameterClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configurationParameterClause_; }
	}

	public final ConfigurationParameterClause_Context configurationParameterClause_() throws RecognitionException {
		ConfigurationParameterClause_Context _localctx = new ConfigurationParameterClause_Context(_ctx, getState());
		enterRule(_localctx, 360, RULE_configurationParameterClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2080);
			identifier_();
			setState(2081);
			_la = _input.LA(1);
			if ( !(_la==EQ_ || _la==TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2085);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case IF:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case ADMIN:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case TYPE:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case IDENTIFIER_:
				{
				setState(2082);
				identifier_();
				}
				break;
			case STRING_:
				{
				setState(2083);
				match(STRING_);
				}
				break;
			case DEFAULT:
				{
				setState(2084);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResetParameterContext extends ParserRuleContext {
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public ResetParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetParameter; }
	}

	public final ResetParameterContext resetParameter() throws RecognitionException {
		ResetParameterContext _localctx = new ResetParameterContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_resetParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2087);
			match(RESET);
			setState(2090);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(2088);
				match(ALL);
				}
				break;
			case T__0:
			case T__1:
			case INSERT:
			case UPDATE:
			case DELETE:
			case ALTER:
			case DROP:
			case TRUNCATE:
			case SCHEMA:
			case REVOKE:
			case ADD:
			case SET:
			case INDEX:
			case KEY:
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case IF:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case CURRENT:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case PRESERVE:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case ADMIN:
			case ESCAPE:
			case EXCLUDE:
			case PARTITION:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case ISOLATION:
			case LEVEL:
			case OPTION:
			case PRIVILEGES:
			case READ:
			case ROLE:
			case ROWS:
			case START:
			case TRANSACTION:
			case ACTION:
			case CACHE:
			case CHARACTERISTICS:
			case CLUSTER:
			case COMMENTS:
			case CONSTRAINTS:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DEFAULTS:
			case DEFERRED:
			case DEPENDS:
			case DOMAIN:
			case EXCLUDING:
			case EXECUTE:
			case EXTENDED:
			case EXTENSION:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case IMMEDIATE:
			case INCLUDING:
			case INCREMENT:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INCLUDE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LOGGED:
			case MAIN:
			case MATCH:
			case MAXVALUE:
			case MINVALUE:
			case NOTHING:
			case NULLS:
			case OBJECT:
			case OIDS:
			case OVER:
			case OWNED:
			case OWNER:
			case PARTIAL:
			case PLAIN:
			case PRECEDING:
			case RANGE:
			case RENAME:
			case REPLICA:
			case RESET:
			case RESTART:
			case RESTRICT:
			case ROUTINE:
			case RULE:
			case SECURITY:
			case SEQUENCE:
			case SESSION:
			case SHOW:
			case SIMPLE:
			case STATISTICS:
			case STORAGE:
			case TABLESPACE:
			case TEMP:
			case TEMPORARY:
			case TYPE:
			case UNBOUNDED:
			case UNLOGGED:
			case USAGE:
			case VALID:
			case VALIDATE:
			case WITHIN:
			case WITHOUT:
			case ZONE:
			case OF:
			case GROUPS:
			case RECURSIVE:
			case IDENTIFIER_:
				{
				setState(2089);
				identifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(PostgreSQLStatementParser.CALL, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2092);
			match(CALL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 62:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 65:
			return booleanPrimary__sempred((BooleanPrimary_Context)_localctx, predIndex);
		case 68:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 69:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean booleanPrimary__sempred(BooleanPrimary_Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 6);
		case 16:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0120\u0831\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2\u018d\n\2\3\2\5\2\u0190\n\2\3\3\3\3\3\3\3\3\5\3\u0196\n\3\3\3"+
		"\5\3\u0199\n\3\3\3\3\3\5\3\u019d\n\3\3\4\5\4\u01a0\n\4\3\4\3\4\3\4\3\4"+
		"\7\4\u01a6\n\4\f\4\16\4\u01a9\13\4\3\5\5\5\u01ac\n\5\3\5\3\5\3\6\3\6\5"+
		"\6\u01b2\n\6\3\6\3\6\3\6\5\6\u01b7\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\7\t\u01c3\n\t\f\t\16\t\u01c6\13\t\3\n\3\n\3\n\3\n\7\n\u01cc\n"+
		"\n\f\n\16\n\u01cf\13\n\3\n\3\n\3\n\3\n\5\n\u01d5\n\n\3\13\3\13\5\13\u01d9"+
		"\n\13\3\f\3\f\5\f\u01dd\n\f\3\f\3\f\5\f\u01e1\n\f\3\f\5\f\u01e4\n\f\3"+
		"\r\3\r\3\16\3\16\3\16\5\16\u01eb\n\16\3\16\5\16\u01ee\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u01f9\n\17\3\20\3\20\5\20\u01fd"+
		"\n\20\3\20\3\20\3\20\5\20\u0202\n\20\7\20\u0204\n\20\f\20\16\20\u0207"+
		"\13\20\3\21\3\21\3\22\3\22\3\22\5\22\u020e\n\22\3\22\7\22\u0211\n\22\f"+
		"\22\16\22\u0214\13\22\3\23\3\23\5\23\u0218\n\23\3\23\3\23\5\23\u021c\n"+
		"\23\3\23\5\23\u021f\n\23\3\23\5\23\u0222\n\23\3\23\5\23\u0225\n\23\3\23"+
		"\5\23\u0228\n\23\3\23\5\23\u022b\n\23\3\24\3\24\3\25\3\25\5\25\u0231\n"+
		"\25\3\25\3\25\7\25\u0235\n\25\f\25\16\25\u0238\13\25\3\26\3\26\5\26\u023c"+
		"\n\26\3\26\5\26\u023f\n\26\3\26\5\26\u0242\n\26\3\26\5\26\u0245\n\26\3"+
		"\27\3\27\5\27\u0249\n\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\7\33\u0256\n\33\f\33\16\33\u0259\13\33\3\34\3\34\3\34\6\34"+
		"\u025e\n\34\r\34\16\34\u025f\3\34\3\34\7\34\u0264\n\34\f\34\16\34\u0267"+
		"\13\34\5\34\u0269\n\34\3\35\3\35\5\35\u026d\n\35\3\35\5\35\u0270\n\35"+
		"\3\35\3\35\5\35\u0274\n\35\3\35\3\35\3\35\3\35\5\35\u027a\n\35\3\36\5"+
		"\36\u027d\n\36\3\36\5\36\u0280\n\36\3\36\3\36\3\36\3\36\5\36\u0286\n\36"+
		"\3\36\5\36\u0289\n\36\3\36\3\36\5\36\u028d\n\36\3\36\3\36\3\36\5\36\u0292"+
		"\n\36\5\36\u0294\n\36\3\37\3\37\3\37\3\37\5\37\u029a\n\37\3 \3 \3 \3!"+
		"\3!\3!\3!\3!\7!\u02a4\n!\f!\16!\u02a7\13!\3\"\3\"\3\"\3#\3#\5#\u02ae\n"+
		"#\3#\3#\5#\u02b2\n#\5#\u02b4\n#\3$\3$\3$\5$\u02b9\n$\3%\3%\5%\u02bd\n"+
		"%\3&\3&\3&\5&\u02c2\n&\3\'\3\'\5\'\u02c6\n\'\3(\3(\3(\3(\5(\u02cc\n(\3"+
		"(\5(\u02cf\n(\3)\3)\5)\u02d3\n)\3*\3*\3*\3*\3*\3*\5*\u02db\n*\3+\5+\u02de"+
		"\n+\3+\3+\5+\u02e2\n+\3+\5+\u02e5\n+\3,\5,\u02e8\n,\3,\3,\5,\u02ec\n,"+
		"\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\62\5\62\u02fb\n\62"+
		"\3\62\3\62\5\62\u02ff\n\62\3\62\5\62\u0302\n\62\3\63\3\63\3\63\3\64\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\5\67\u0311\n\67\3\67\3\67"+
		"\38\38\38\58\u0318\n8\38\38\39\39\3:\3:\3;\5;\u0321\n;\3;\3;\3;\7;\u0326"+
		"\n;\f;\16;\u0329\13;\3;\5;\u032c\n;\3<\3<\3<\3<\7<\u0332\n<\f<\16<\u0335"+
		"\13<\3<\3<\3=\3=\5=\u033b\n=\3>\3>\3?\5?\u0340\n?\3?\3?\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\5@\u034d\n@\3@\3@\3@\3@\7@\u0353\n@\f@\16@\u0356\13@\3A"+
		"\3A\3B\3B\3C\3C\3C\3C\3C\3C\5C\u0362\nC\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3C\7C\u0371\nC\fC\16C\u0374\13C\3D\3D\3E\3E\5E\u037a\nE\3E\3E\3"+
		"E\3E\3E\5E\u0381\nE\3E\3E\3E\3E\3E\7E\u0388\nE\fE\16E\u038b\13E\3E\3E"+
		"\3E\3E\5E\u0391\nE\3E\3E\3E\3E\3E\3E\3E\5E\u039a\nE\3E\3E\3E\3E\5E\u03a0"+
		"\nE\3E\5E\u03a3\nE\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\7F\u03c6\nF\fF\16F\u03c9"+
		"\13F\3G\3G\3G\3G\3G\3G\3G\3G\5G\u03d3\nG\3G\3G\3G\3G\7G\u03d9\nG\fG\16"+
		"G\u03dc\13G\3G\3G\3G\5G\u03e1\nG\3G\3G\3G\3G\3G\3G\3G\5G\u03ea\nG\3G\3"+
		"G\3G\3G\3G\3G\3G\5G\u03f3\nG\7G\u03f5\nG\fG\16G\u03f8\13G\3H\3H\3H\5H"+
		"\u03fd\nH\3I\3I\3I\5I\u0402\nI\3I\3I\3I\7I\u0407\nI\fI\16I\u040a\13I\3"+
		"I\5I\u040d\nI\3I\3I\5I\u0411\nI\3J\3J\3K\3K\3L\3L\3L\3L\3L\3L\3M\3M\3"+
		"M\3M\3M\7M\u0422\nM\fM\16M\u0425\13M\3M\3M\3M\3M\5M\u042b\nM\3M\3M\3N"+
		"\5N\u0430\nN\3N\5N\u0433\nN\3N\5N\u0436\nN\3O\3O\3O\3O\3O\7O\u043d\nO"+
		"\fO\16O\u0440\13O\3P\3P\3P\5P\u0445\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\5Q\u0453\nQ\3R\3R\3S\3S\3S\3S\3S\3T\3T\3T\5T\u045f\nT\3U\3U\3U\3"+
		"U\3U\3U\3U\3V\3V\3V\3V\3V\7V\u046d\nV\fV\16V\u0470\13V\3V\3V\5V\u0474"+
		"\nV\3V\3V\3W\3W\3W\3W\3W\7W\u047d\nW\fW\16W\u0480\13W\3W\5W\u0483\nW\3"+
		"W\3W\3X\3X\3X\3X\3X\3X\5X\u048d\nX\3Y\3Y\5Y\u0491\nY\3Y\6Y\u0494\nY\r"+
		"Y\16Y\u0495\3Y\5Y\u0499\nY\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\3\\\3\\"+
		"\7\\\u04a8\n\\\f\\\16\\\u04ab\13\\\3]\3]\3]\5]\u04b0\n]\3]\5]\u04b3\n"+
		"]\3^\3^\5^\u04b7\n^\3^\5^\u04ba\n^\3^\5^\u04bd\n^\3^\3^\3^\3^\3^\7^\u04c4"+
		"\n^\f^\16^\u04c7\13^\3^\3^\5^\u04cb\n^\3^\5^\u04ce\n^\5^\u04d0\n^\3_\3"+
		"_\5_\u04d4\n_\3`\3`\3`\3`\5`\u04da\n`\3`\3`\3a\3a\3a\5a\u04e1\na\3a\3"+
		"a\3b\3b\5b\u04e7\nb\3b\3b\5b\u04eb\nb\3c\3c\3c\5c\u04f0\nc\3d\3d\3d\7"+
		"d\u04f5\nd\fd\16d\u04f8\13d\3e\3e\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3f"+
		"\3f\5f\u0509\nf\3f\3f\3f\3f\3g\3g\3g\3g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3i"+
		"\3i\3i\3i\3i\3j\3j\3j\3j\3j\3j\3k\3k\5k\u0529\nk\3k\3k\3k\3l\5l\u052f"+
		"\nl\3l\3l\5l\u0533\nl\3m\3m\3m\5m\u0538\nm\3n\3n\3n\3n\7n\u053e\nn\fn"+
		"\16n\u0541\13n\5n\u0543\nn\3n\3n\3o\3o\3o\3o\3o\7o\u054c\no\fo\16o\u054f"+
		"\13o\5o\u0551\no\3p\3p\3p\5p\u0556\np\3p\7p\u0559\np\fp\16p\u055c\13p"+
		"\3q\5q\u055f\nq\3q\3q\3q\3r\3r\3r\3s\5s\u0568\ns\3s\3s\3s\3s\3s\3s\3s"+
		"\3s\5s\u0572\ns\3s\3s\3s\3s\3s\3s\5s\u057a\ns\3s\3s\3s\3s\3s\3s\3s\3s"+
		"\5s\u0584\ns\3s\3s\3s\3s\3s\3s\5s\u058c\ns\3s\3s\3s\7s\u0591\ns\fs\16"+
		"s\u0594\13s\5s\u0596\ns\3t\3t\3t\3t\5t\u059c\nt\3u\3u\5u\u05a0\nu\3v\6"+
		"v\u05a3\nv\rv\16v\u05a4\3w\3w\5w\u05a9\nw\3w\3w\3w\5w\u05ae\nw\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\5w\u05c0\nw\3x\3x\3x\3x\5x\u05c6"+
		"\nx\3x\3x\3x\5x\u05cb\nx\3y\3y\3y\3y\3y\3y\5y\u05d3\ny\3z\5z\u05d6\nz"+
		"\3z\5z\u05d9\nz\3z\3z\5z\u05dd\nz\3{\3{\3{\3|\5|\u05e3\n|\3|\3|\3|\3}"+
		"\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u05f4\n}\3}\3}\3}\3}\3}\3}\5}\u05fc"+
		"\n}\3}\3}\3}\3}\3}\3}\5}\u0604\n}\3}\3}\3}\7}\u0609\n}\f}\16}\u060c\13"+
		"}\5}\u060e\n}\3~\3~\5~\u0612\n~\3\177\5\177\u0615\n\177\3\u0080\5\u0080"+
		"\u0618\n\u0080\3\u0081\3\u0081\3\u0081\5\u0081\u061d\n\u0081\3\u0082\5"+
		"\u0082\u0620\n\u0082\3\u0083\3\u0083\5\u0083\u0624\n\u0083\3\u0084\5\u0084"+
		"\u0627\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u062d\n\u0085\3"+
		"\u0086\3\u0086\3\u0086\5\u0086\u0632\n\u0086\3\u0087\3\u0087\3\u0087\3"+
		"\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\5\u0089\u0649\n\u0089\3\u008a\3\u008a\3\u008a\7\u008a\u064e\n\u008a\f"+
		"\u008a\16\u008a\u0651\13\u008a\3\u008b\3\u008b\5\u008b\u0655\n\u008b\3"+
		"\u008c\3\u008c\3\u008c\7\u008c\u065a\n\u008c\f\u008c\16\u008c\u065d\13"+
		"\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\5\u008d\u0670\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d"+
		"\u0677\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0687"+
		"\n\u008d\3\u008d\5\u008d\u068a\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\7\u008d\u06a2\n\u008d\f\u008d\16\u008d\u06a5\13\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u06ae\n\u008d\f\u008d"+
		"\16\u008d\u06b1\13\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\5\u008d\u06c3\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\5\u008d\u06cd\n\u008d\5\u008d\u06cf\n\u008d\3"+
		"\u008e\3\u008e\5\u008e\u06d3\n\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u06d8"+
		"\n\u008e\3\u008e\3\u008e\3\u008f\3\u008f\5\u008f\u06de\n\u008f\3\u008f"+
		"\3\u008f\3\u008f\5\u008f\u06e3\n\u008f\3\u0090\3\u0090\5\u0090\u06e7\n"+
		"\u0090\3\u0091\3\u0091\3\u0091\5\u0091\u06ec\n\u0091\3\u0091\3\u0091\3"+
		"\u0091\5\u0091\u06f1\n\u0091\3\u0091\3\u0091\5\u0091\u06f5\n\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\5\u0091\u070b\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\5\u0091\u0713\n\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u0718\n"+
		"\u0091\f\u0091\16\u0091\u071b\13\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u0738\n\u0091\3\u0092"+
		"\3\u0092\5\u0092\u073c\n\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\5\u0093\u0745\n\u0093\3\u0093\5\u0093\u0748\n\u0093\3"+
		"\u0093\3\u0093\5\u0093\u074c\n\u0093\3\u0093\5\u0093\u074f\n\u0093\5\u0093"+
		"\u0751\n\u0093\3\u0094\3\u0094\3\u0094\7\u0094\u0756\n\u0094\f\u0094\16"+
		"\u0094\u0759\13\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\5\u0096\u0763\n\u0096\3\u0096\5\u0096\u0766\n\u0096\3"+
		"\u0097\3\u0097\5\u0097\u076a\n\u0097\3\u0097\3\u0097\5\u0097\u076e\n\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0099\3\u0099\3\u009a\3\u009a\5\u009a\u077d\n\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\5\u009d\u078f\n\u009d\3\u009e"+
		"\3\u009e\3\u009e\7\u009e\u0794\n\u009e\f\u009e\16\u009e\u0797\13\u009e"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u079d\n\u009f\3\u009f\3\u009f"+
		"\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u07a4\n\u00a0\3\u00a1\3\u00a1\3\u00a2"+
		"\3\u00a2\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u07af\n\u00a4"+
		"\3\u00a5\3\u00a5\5\u00a5\u07b3\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u07b7\n"+
		"\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a9\3\u00a9\5\u00a9\u07c5\n\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\5\u00a9\u07ca\n\u00a9\7\u00a9\u07cc\n\u00a9\f\u00a9\16\u00a9"+
		"\u07cf\13\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa"+
		"\u07e0\n\u00aa\5\u00aa\u07e2\n\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\5\u00ab\u07f3\n\u00ab\3\u00ab\5\u00ab\u07f6\n\u00ab\3"+
		"\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0810\n\u00b2"+
		"\3\u00b3\3\u00b3\5\u00b3\u0814\n\u00b3\3\u00b3\3\u00b3\5\u00b3\u0818\n"+
		"\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5"+
		"\u0821\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0828\n"+
		"\u00b6\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u082d\n\u00b7\3\u00b8\3\u00b8\3"+
		"\u00b8\2\6~\u0084\u008a\u008c\u00b9\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a"+
		"\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\2$\4\2OO"+
		"qq\4\2YY]]\4\2XX[\\\4\2\u00b1\u00b1\u00bf\u00bf\3\2lm\3\2\3\4!\2\61\63"+
		"\658:<??DDGIbb|\177\u008b\u008b\u008d\u008d\u008f\u0092\u009a\u009c\u009e"+
		"\u009f\u00a1\u00a1\u00a3\u00a9\u00ab\u00ab\u00ad\u00ae\u00b0\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c1\u00c3\u00c6\u00c8\u00c8\u00cb"+
		"\u00cb\u00cd\u00d0\u00d2\u00e6\u00e8\u00f4\u00f6\u0106\u0108\u0118\u011a"+
		"\u011b\4\2\5\6gh\4\2\7\7jj\4\2km\u00b2\u00b2\3\2qr\3\2\31\36\5\2\7\b\20"+
		"\21\u00ac\u00ac\3\2\u0094\u0098\5\2\u00bf\u00bf\u00fc\u00fc\u011a\u011a"+
		"\3\2wx\3\2\u0082\u0083\4\2\u00a5\u00a5\u00df\u00df\3\2\u010d\u010e\3\2"+
		"\62\63\4\2kk\u0099\u0099\4\2\u00d2\u00d2\u00e1\u00e1\4\2\u00d5\u00d5\u00e2"+
		"\u00e2\t\2qq\u00c8\u00c8\u00cb\u00cb\u00d0\u00d0\u00e0\u00e0\u00e4\u00e4"+
		"\u010a\u010b\4\2\u00b4\u00b4\u0101\u0101\3\2\u009b\u009c\4\2\u00b3\u00b3"+
		"\u00fe\u00fe\4\2MM\u0116\u0116\4\2\u00ec\u00ec\u0111\u0111\4\2\66\66<"+
		"<\6\2\u00d7\u00d7\u00d9\u00d9\u00ed\u00ed\u00fa\u00fa\4\299\u00ab\u00ab"+
		"\4\2\u00a5\u00a5\u0106\u0106\4\2\31\31ff\2\u090c\2\u018c\3\2\2\2\4\u0191"+
		"\3\2\2\2\6\u019f\3\2\2\2\b\u01ab\3\2\2\2\n\u01af\3\2\2\2\f\u01b8\3\2\2"+
		"\2\16\u01ba\3\2\2\2\20\u01be\3\2\2\2\22\u01d4\3\2\2\2\24\u01d8\3\2\2\2"+
		"\26\u01da\3\2\2\2\30\u01e5\3\2\2\2\32\u01e7\3\2\2\2\34\u01f8\3\2\2\2\36"+
		"\u01fa\3\2\2\2 \u0208\3\2\2\2\"\u020a\3\2\2\2$\u0215\3\2\2\2&\u022c\3"+
		"\2\2\2(\u0230\3\2\2\2*\u0244\3\2\2\2,\u0248\3\2\2\2.\u024a\3\2\2\2\60"+
		"\u024c\3\2\2\2\62\u024f\3\2\2\2\64\u0252\3\2\2\2\66\u0268\3\2\2\28\u0279"+
		"\3\2\2\2:\u0293\3\2\2\2<\u0299\3\2\2\2>\u029b\3\2\2\2@\u029e\3\2\2\2B"+
		"\u02a8\3\2\2\2D\u02b3\3\2\2\2F\u02b5\3\2\2\2H\u02bc\3\2\2\2J\u02be\3\2"+
		"\2\2L\u02c5\3\2\2\2N\u02c7\3\2\2\2P\u02d0\3\2\2\2R\u02da\3\2\2\2T\u02dd"+
		"\3\2\2\2V\u02e7\3\2\2\2X\u02ed\3\2\2\2Z\u02ef\3\2\2\2\\\u02f1\3\2\2\2"+
		"^\u02f3\3\2\2\2`\u02f5\3\2\2\2b\u0301\3\2\2\2d\u0303\3\2\2\2f\u0306\3"+
		"\2\2\2h\u0309\3\2\2\2j\u030b\3\2\2\2l\u0310\3\2\2\2n\u0317\3\2\2\2p\u031b"+
		"\3\2\2\2r\u031d\3\2\2\2t\u0320\3\2\2\2v\u032d\3\2\2\2x\u033a\3\2\2\2z"+
		"\u033c\3\2\2\2|\u033f\3\2\2\2~\u034c\3\2\2\2\u0080\u0357\3\2\2\2\u0082"+
		"\u0359\3\2\2\2\u0084\u035b\3\2\2\2\u0086\u0375\3\2\2\2\u0088\u03a2\3\2"+
		"\2\2\u008a\u03a4\3\2\2\2\u008c\u03e9\3\2\2\2\u008e\u03fc\3\2\2\2\u0090"+
		"\u03fe\3\2\2\2\u0092\u0412\3\2\2\2\u0094\u0414\3\2\2\2\u0096\u0416\3\2"+
		"\2\2\u0098\u041c\3\2\2\2\u009a\u042f\3\2\2\2\u009c\u0437\3\2\2\2\u009e"+
		"\u0441\3\2\2\2\u00a0\u0452\3\2\2\2\u00a2\u0454\3\2\2\2\u00a4\u0456\3\2"+
		"\2\2\u00a6\u045e\3\2\2\2\u00a8\u0460\3\2\2\2\u00aa\u0467\3\2\2\2\u00ac"+
		"\u0477\3\2\2\2\u00ae\u048c\3\2\2\2\u00b0\u048e\3\2\2\2\u00b2\u049a\3\2"+
		"\2\2\u00b4\u049f\3\2\2\2\u00b6\u04a2\3\2\2\2\u00b8\u04af\3\2\2\2\u00ba"+
		"\u04cf\3\2\2\2\u00bc\u04d1\3\2\2\2\u00be\u04d5\3\2\2\2\u00c0\u04dd\3\2"+
		"\2\2\u00c2\u04e4\3\2\2\2\u00c4\u04ec\3\2\2\2\u00c6\u04f1\3\2\2\2\u00c8"+
		"\u04f9\3\2\2\2\u00ca\u0501\3\2\2\2\u00cc\u050e\3\2\2\2\u00ce\u0515\3\2"+
		"\2\2\u00d0\u051b\3\2\2\2\u00d2\u0520\3\2\2\2\u00d4\u0526\3\2\2\2\u00d6"+
		"\u0532\3\2\2\2\u00d8\u0537\3\2\2\2\u00da\u0539\3\2\2\2\u00dc\u0550\3\2"+
		"\2\2\u00de\u0552\3\2\2\2\u00e0\u055e\3\2\2\2\u00e2\u0563\3\2\2\2\u00e4"+
		"\u0595\3\2\2\2\u00e6\u0597\3\2\2\2\u00e8\u059f\3\2\2\2\u00ea\u05a2\3\2"+
		"\2\2\u00ec\u05bf\3\2\2\2\u00ee\u05ca\3\2\2\2\u00f0\u05d2\3\2\2\2\u00f2"+
		"\u05d8\3\2\2\2\u00f4\u05de\3\2\2\2\u00f6\u05e2\3\2\2\2\u00f8\u060d\3\2"+
		"\2\2\u00fa\u0611\3\2\2\2\u00fc\u0614\3\2\2\2\u00fe\u0617\3\2\2\2\u0100"+
		"\u061c\3\2\2\2\u0102\u061f\3\2\2\2\u0104\u0623\3\2\2\2\u0106\u0626\3\2"+
		"\2\2\u0108\u062c\3\2\2\2\u010a\u0631\3\2\2\2\u010c\u0633\3\2\2\2\u010e"+
		"\u0637\3\2\2\2\u0110\u063f\3\2\2\2\u0112\u064a\3\2\2\2\u0114\u0652\3\2"+
		"\2\2\u0116\u0656\3\2\2\2\u0118\u06ce\3\2\2\2\u011a\u06d0\3\2\2\2\u011c"+
		"\u06db\3\2\2\2\u011e\u06e6\3\2\2\2\u0120\u0737\3\2\2\2\u0122\u0739\3\2"+
		"\2\2\u0124\u0750\3\2\2\2\u0126\u0752\3\2\2\2\u0128\u075a\3\2\2\2\u012a"+
		"\u075e\3\2\2\2\u012c\u0769\3\2\2\2\u012e\u0774\3\2\2\2\u0130\u0778\3\2"+
		"\2\2\u0132\u077a\3\2\2\2\u0134\u0782\3\2\2\2\u0136\u0788\3\2\2\2\u0138"+
		"\u078e\3\2\2\2\u013a\u0790\3\2\2\2\u013c\u0798\3\2\2\2\u013e\u07a3\3\2"+
		"\2\2\u0140\u07a5\3\2\2\2\u0142\u07a7\3\2\2\2\u0144\u07a9\3\2\2\2\u0146"+
		"\u07ab\3\2\2\2\u0148\u07b0\3\2\2\2\u014a\u07b8\3\2\2\2\u014c\u07bc\3\2"+
		"\2\2\u014e\u07be\3\2\2\2\u0150\u07c2\3\2\2\2\u0152\u07e1\3\2\2\2\u0154"+
		"\u07f5\3\2\2\2\u0156\u07f7\3\2\2\2\u0158\u07fa\3\2\2\2\u015a\u07fd\3\2"+
		"\2\2\u015c\u0800\3\2\2\2\u015e\u0803\3\2\2\2\u0160\u0806\3\2\2\2\u0162"+
		"\u0809\3\2\2\2\u0164\u0811\3\2\2\2\u0166\u0819\3\2\2\2\u0168\u081b\3\2"+
		"\2\2\u016a\u0822\3\2\2\2\u016c\u0829\3\2\2\2\u016e\u082e\3\2\2\2\u0170"+
		"\u018d\5 \21\2\u0171\u018d\5\4\3\2\u0172\u018d\5\n\6\2\u0173\u018d\5\26"+
		"\f\2\u0174\u018d\5\u00caf\2\u0175\u018d\5\u00ceh\2\u0176\u018d\5\u00d2"+
		"j\2\u0177\u018d\5\u00c8e\2\u0178\u018d\5\u00ccg\2\u0179\u018d\5\u00d0"+
		"i\2\u017a\u018d\5\u00d4k\2\u017b\u018d\5\u013c\u009f\2\u017c\u018d\5\u013e"+
		"\u00a0\2\u017d\u018d\5\u0140\u00a1\2\u017e\u018d\5\u0142\u00a2\2\u017f"+
		"\u018d\5\u0144\u00a3\2\u0180\u018d\5\u0146\u00a4\2\u0181\u018d\5\u0148"+
		"\u00a5\2\u0182\u018d\5\u0156\u00ac\2\u0183\u018d\5\u0158\u00ad\2\u0184"+
		"\u018d\5\u015a\u00ae\2\u0185\u018d\5\u015c\u00af\2\u0186\u018d\5\u015e"+
		"\u00b0\2\u0187\u018d\5\u0160\u00b1\2\u0188\u018d\5\u0162\u00b2\2\u0189"+
		"\u018d\5\u0164\u00b3\2\u018a\u018d\5\u016c\u00b7\2\u018b\u018d\5\u016e"+
		"\u00b8\2\u018c\u0170\3\2\2\2\u018c\u0171\3\2\2\2\u018c\u0172\3\2\2\2\u018c"+
		"\u0173\3\2\2\2\u018c\u0174\3\2\2\2\u018c\u0175\3\2\2\2\u018c\u0176\3\2"+
		"\2\2\u018c\u0177\3\2\2\2\u018c\u0178\3\2\2\2\u018c\u0179\3\2\2\2\u018c"+
		"\u017a\3\2\2\2\u018c\u017b\3\2\2\2\u018c\u017c\3\2\2\2\u018c\u017d\3\2"+
		"\2\2\u018c\u017e\3\2\2\2\u018c\u017f\3\2\2\2\u018c\u0180\3\2\2\2\u018c"+
		"\u0181\3\2\2\2\u018c\u0182\3\2\2\2\u018c\u0183\3\2\2\2\u018c\u0184\3\2"+
		"\2\2\u018c\u0185\3\2\2\2\u018c\u0186\3\2\2\2\u018c\u0187\3\2\2\2\u018c"+
		"\u0188\3\2\2\2\u018c\u0189\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018b\3\2"+
		"\2\2\u018d\u018f\3\2\2\2\u018e\u0190\7,\2\2\u018f\u018e\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\3\3\2\2\2\u0191\u0192\7\61\2\2\u0192\u0193\7K\2\2"+
		"\u0193\u0198\5l\67\2\u0194\u0196\7`\2\2\u0195\u0194\3\2\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\5,\27\2\u0198\u0195\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u019d\5\6\4\2\u019b\u019d\5\b"+
		"\5\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d\5\3\2\2\2\u019e\u01a0"+
		"\5v<\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a2\7L\2\2\u01a2\u01a7\5\22\n\2\u01a3\u01a4\7&\2\2\u01a4\u01a6\5\22"+
		"\n\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\7\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ac\5v<\2\u01ab"+
		"\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\5 "+
		"\21\2\u01ae\t\3\2\2\2\u01af\u01b1\7\62\2\2\u01b0\u01b2\5\f\7\2\u01b1\u01b0"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\5\64\33\2"+
		"\u01b4\u01b6\5\20\t\2\u01b5\u01b7\5> \2\u01b6\u01b5\3\2\2\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7\13\3\2\2\2\u01b8\u01b9\7\u00f5\2\2\u01b9\r\3\2\2\2\u01ba"+
		"\u01bb\5n8\2\u01bb\u01bc\7\31\2\2\u01bc\u01bd\5\24\13\2\u01bd\17\3\2\2"+
		"\2\u01be\u01bf\7<\2\2\u01bf\u01c4\5\16\b\2\u01c0\u01c1\7&\2\2\u01c1\u01c3"+
		"\5\16\b\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2"+
		"\u01c4\u01c5\3\2\2\2\u01c5\21\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8"+
		"\7 \2\2\u01c8\u01cd\5\24\13\2\u01c9\u01ca\7&\2\2\u01ca\u01cc\5\24\13\2"+
		"\u01cb\u01c9\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce"+
		"\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1\7!\2\2\u01d1"+
		"\u01d5\3\2\2\2\u01d2\u01d3\7 \2\2\u01d3\u01d5\7!\2\2\u01d4\u01c7\3\2\2"+
		"\2\u01d4\u01d2\3\2\2\2\u01d5\23\3\2\2\2\u01d6\u01d9\5~@\2\u01d7\u01d9"+
		"\7\u0099\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9\25\3\2\2\2"+
		"\u01da\u01dc\7\63\2\2\u01db\u01dd\5\30\r\2\u01dc\u01db\3\2\2\2\u01dc\u01dd"+
		"\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01e1\5\32\16\2\u01df\u01e1\5\34\17"+
		"\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e4"+
		"\5> \2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\27\3\2\2\2\u01e5"+
		"\u01e6\7\u00f5\2\2\u01e6\31\3\2\2\2\u01e7\u01e8\7U\2\2\u01e8\u01ed\5l"+
		"\67\2\u01e9\u01eb\7`\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ee\5,\27\2\u01ed\u01ea\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ee\33\3\2\2\2\u01ef\u01f0\5\36\20\2\u01f0\u01f1\7U\2\2\u01f1\u01f2"+
		"\5\64\33\2\u01f2\u01f9\3\2\2\2\u01f3\u01f4\7U\2\2\u01f4\u01f5\5\36\20"+
		"\2\u01f5\u01f6\7^\2\2\u01f6\u01f7\5\64\33\2\u01f7\u01f9\3\2\2\2\u01f8"+
		"\u01ef\3\2\2\2\u01f8\u01f3\3\2\2\2\u01f9\35\3\2\2\2\u01fa\u01fc\5l\67"+
		"\2\u01fb\u01fd\7\26\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u0205\3\2\2\2\u01fe\u01ff\7&\2\2\u01ff\u0201\5l\67\2\u0200\u0202\7\26"+
		"\2\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203"+
		"\u01fe\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206\37\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0209\5\"\22\2\u0209!"+
		"\3\2\2\2\u020a\u0212\5$\23\2\u020b\u020d\7N\2\2\u020c\u020e\t\2\2\2\u020d"+
		"\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\5$"+
		"\23\2\u0210\u020b\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213#\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0217\7\60\2\2"+
		"\u0216\u0218\5&\24\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219"+
		"\3\2\2\2\u0219\u021b\5(\25\2\u021a\u021c\5\62\32\2\u021b\u021a\3\2\2\2"+
		"\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021f\5> \2\u021e\u021d"+
		"\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u0222\5@!\2\u0221"+
		"\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0224\3\2\2\2\u0223\u0225\5B"+
		"\"\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\3\2\2\2\u0226"+
		"\u0228\5\u00b6\\\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a"+
		"\3\2\2\2\u0229\u022b\5D#\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"%\3\2\2\2\u022c\u022d\t\2\2\2\u022d\'\3\2\2\2\u022e\u0231\5.\30\2\u022f"+
		"\u0231\5*\26\2\u0230\u022e\3\2\2\2\u0230\u022f\3\2\2\2\u0231\u0236\3\2"+
		"\2\2\u0232\u0233\7&\2\2\u0233\u0235\5*\26\2\u0234\u0232\3\2\2\2\u0235"+
		"\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237)\3\2\2\2"+
		"\u0238\u0236\3\2\2\2\u0239\u023c\5n8\2\u023a\u023c\5~@\2\u023b\u0239\3"+
		"\2\2\2\u023b\u023a\3\2\2\2\u023c\u0241\3\2\2\2\u023d\u023f\7`\2\2\u023e"+
		"\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\5,"+
		"\27\2\u0241\u023e\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0245\3\2\2\2\u0243"+
		"\u0245\5\60\31\2\u0244\u023b\3\2\2\2\u0244\u0243\3\2\2\2\u0245+\3\2\2"+
		"\2\u0246\u0249\5b\62\2\u0247\u0249\7\u011d\2\2\u0248\u0246\3\2\2\2\u0248"+
		"\u0247\3\2\2\2\u0249-\3\2\2\2\u024a\u024b\7\22\2\2\u024b/\3\2\2\2\u024c"+
		"\u024d\5b\62\2\u024d\u024e\7\26\2\2\u024e\61\3\2\2\2\u024f\u0250\7U\2"+
		"\2\u0250\u0251\5\64\33\2\u0251\63\3\2\2\2\u0252\u0257\5\66\34\2\u0253"+
		"\u0254\7&\2\2\u0254\u0256\5\66\34\2\u0255\u0253\3\2\2\2\u0256\u0259\3"+
		"\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\65\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u025a\u025b\58\35\2\u025b\u025c\5:\36\2\u025c\u025e\3\2"+
		"\2\2\u025d\u025a\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u025d\3\2\2\2\u025f"+
		"\u0260\3\2\2\2\u0260\u0269\3\2\2\2\u0261\u0265\58\35\2\u0262\u0264\5:"+
		"\36\2\u0263\u0262\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u025d\3\2"+
		"\2\2\u0268\u0261\3\2\2\2\u0269\67\3\2\2\2\u026a\u026f\5l\67\2\u026b\u026d"+
		"\7`\2\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"\u0270\5,\27\2\u026f\u026c\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u027a\3\2"+
		"\2\2\u0271\u0273\5N(\2\u0272\u0274\5v<\2\u0273\u0272\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u027a\3\2\2\2\u0275\u0276\7 \2\2\u0276\u0277\5\64\33\2"+
		"\u0277\u0278\7!\2\2\u0278\u027a\3\2\2\2\u0279\u026a\3\2\2\2\u0279\u0271"+
		"\3\2\2\2\u0279\u0275\3\2\2\2\u027a9\3\2\2\2\u027b\u027d\7V\2\2\u027c\u027b"+
		"\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u0280\t\3\2\2\u027f"+
		"\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\7W"+
		"\2\2\u0282\u0283\3\2\2\2\u0283\u0285\58\35\2\u0284\u0286\5<\37\2\u0285"+
		"\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0294\3\2\2\2\u0287\u0289\7V"+
		"\2\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u028c\t\4\2\2\u028b\u028d\7Z\2\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2"+
		"\2\2\u028d\u028e\3\2\2\2\u028e\u028f\7W\2\2\u028f\u0291\58\35\2\u0290"+
		"\u0292\5<\37\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2"+
		"\2\2\u0293\u027c\3\2\2\2\u0293\u0288\3\2\2\2\u0294;\3\2\2\2\u0295\u0296"+
		"\7a\2\2\u0296\u029a\5~@\2\u0297\u0298\7^\2\2\u0298\u029a\5v<\2\u0299\u0295"+
		"\3\2\2\2\u0299\u0297\3\2\2\2\u029a=\3\2\2\2\u029b\u029c\7_\2\2\u029c\u029d"+
		"\5~@\2\u029d?\3\2\2\2\u029e\u029f\7u\2\2\u029f\u02a0\7v\2\2\u02a0\u02a5"+
		"\5\u00b8]\2\u02a1\u02a2\7&\2\2\u02a2\u02a4\5\u00b8]\2\u02a3\u02a1\3\2"+
		"\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"A\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\7y\2\2\u02a9\u02aa\5~@\2\u02aa"+
		"C\3\2\2\2\u02ab\u02ad\5F$\2\u02ac\u02ae\5J&\2\u02ad\u02ac\3\2\2\2\u02ad"+
		"\u02ae\3\2\2\2\u02ae\u02b4\3\2\2\2\u02af\u02b1\5J&\2\u02b0\u02b2\5F$\2"+
		"\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02ab"+
		"\3\2\2\2\u02b3\u02af\3\2\2\2\u02b4E\3\2\2\2\u02b5\u02b8\7z\2\2\u02b6\u02b9"+
		"\7q\2\2\u02b7\u02b9\5H%\2\u02b8\u02b6\3\2\2\2\u02b8\u02b7\3\2\2\2\u02b9"+
		"G\3\2\2\2\u02ba\u02bd\5V,\2\u02bb\u02bd\5P)\2\u02bc\u02ba\3\2\2\2\u02bc"+
		"\u02bb\3\2\2\2\u02bdI\3\2\2\2\u02be\u02bf\7{\2\2\u02bf\u02c1\5L\'\2\u02c0"+
		"\u02c2\t\5\2\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2K\3\2\2\2"+
		"\u02c3\u02c6\5V,\2\u02c4\u02c6\5P)\2\u02c5\u02c3\3\2\2\2\u02c5\u02c4\3"+
		"\2\2\2\u02c6M\3\2\2\2\u02c7\u02c8\7 \2\2\u02c8\u02c9\5\"\22\2\u02c9\u02cb"+
		"\7!\2\2\u02ca\u02cc\7`\2\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02ce\3\2\2\2\u02cd\u02cf\5,\27\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2"+
		"\2\2\u02cfO\3\2\2\2\u02d0\u02d2\7*\2\2\u02d1\u02d3\5`\61\2\u02d2\u02d1"+
		"\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3Q\3\2\2\2\u02d4\u02db\5T+\2\u02d5\u02db"+
		"\5V,\2\u02d6\u02db\5X-\2\u02d7\u02db\5Z.\2\u02d8\u02db\5\\/\2\u02d9\u02db"+
		"\5^\60\2\u02da\u02d4\3\2\2\2\u02da\u02d5\3\2\2\2\u02da\u02d6\3\2\2\2\u02da"+
		"\u02d7\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02d9\3\2\2\2\u02dbS\3\2\2\2"+
		"\u02dc\u02de\5d\63\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df"+
		"\3\2\2\2\u02df\u02e1\7\u011d\2\2\u02e0\u02e2\5`\61\2\u02e1\u02e0\3\2\2"+
		"\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\3\2\2\2\u02e3\u02e5\5f\64\2\u02e4\u02e3"+
		"\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5U\3\2\2\2\u02e6\u02e8\7\21\2\2\u02e7"+
		"\u02e6\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\7\u011e"+
		"\2\2\u02ea\u02ec\5`\61\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec"+
		"W\3\2\2\2\u02ed\u02ee\7\u011f\2\2\u02eeY\3\2\2\2\u02ef\u02f0\7\u0120\2"+
		"\2\u02f0[\3\2\2\2\u02f1\u02f2\t\6\2\2\u02f2]\3\2\2\2\u02f3\u02f4\7k\2"+
		"\2\u02f4_\3\2\2\2\u02f5\u02f6\7\17\2\2\u02f6\u02f7\7\17\2\2\u02f7\u02f8"+
		"\7\u011c\2\2\u02f8a\3\2\2\2\u02f9\u02fb\5d\63\2\u02fa\u02f9\3\2\2\2\u02fa"+
		"\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fe\7\u011c\2\2\u02fd\u02ff"+
		"\5f\64\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0302\3\2\2\2\u0300"+
		"\u0302\5h\65\2\u0301\u02fa\3\2\2\2\u0301\u0300\3\2\2\2\u0302c\3\2\2\2"+
		"\u0303\u0304\t\7\2\2\u0304\u0305\7\n\2\2\u0305e\3\2\2\2\u0306\u0307\7"+
		"\u0119\2\2\u0307\u0308\7\u011d\2\2\u0308g\3\2\2\2\u0309\u030a\t\b\2\2"+
		"\u030ai\3\2\2\2\u030b\u030c\5b\62\2\u030ck\3\2\2\2\u030d\u030e\5p9\2\u030e"+
		"\u030f\7\25\2\2\u030f\u0311\3\2\2\2\u0310\u030d\3\2\2\2\u0310\u0311\3"+
		"\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\5r:\2\u0313m\3\2\2\2\u0314\u0315"+
		"\5p9\2\u0315\u0316\7\25\2\2\u0316\u0318\3\2\2\2\u0317\u0314\3\2\2\2\u0317"+
		"\u0318\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\5r:\2\u031ao\3\2\2\2\u031b"+
		"\u031c\5b\62\2\u031cq\3\2\2\2\u031d\u031e\5b\62\2\u031es\3\2\2\2\u031f"+
		"\u0321\7 \2\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2"+
		"\2\2\u0322\u0327\5l\67\2\u0323\u0324\7&\2\2\u0324\u0326\5l\67\2\u0325"+
		"\u0323\3\2\2\2\u0326\u0329\3\2\2\2\u0327\u0325\3\2\2\2\u0327\u0328\3\2"+
		"\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u032a\u032c\7!\2\2\u032b"+
		"\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032cu\3\2\2\2\u032d\u032e\7 \2\2\u032e"+
		"\u0333\5n8\2\u032f\u0330\7&\2\2\u0330\u0332\5n8\2\u0331\u032f\3\2\2\2"+
		"\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336"+
		"\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u0337\7!\2\2\u0337w\3\2\2\2\u0338\u033b"+
		"\7\u011d\2\2\u0339\u033b\5b\62\2\u033a\u0338\3\2\2\2\u033a\u0339\3\2\2"+
		"\2\u033by\3\2\2\2\u033c\u033d\5b\62\2\u033d{\3\2\2\2\u033e\u0340\7A\2"+
		"\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0342"+
		"\7D\2\2\u0342}\3\2\2\2\u0343\u0344\b@\1\2\u0344\u0345\5\u0082B\2\u0345"+
		"\u0346\5~@\5\u0346\u034d\3\2\2\2\u0347\u0348\7 \2\2\u0348\u0349\5~@\2"+
		"\u0349\u034a\7!\2\2\u034a\u034d\3\2\2\2\u034b\u034d\5\u0084C\2\u034c\u0343"+
		"\3\2\2\2\u034c\u0347\3\2\2\2\u034c\u034b\3\2\2\2\u034d\u0354\3\2\2\2\u034e"+
		"\u034f\f\6\2\2\u034f\u0350\5\u0080A\2\u0350\u0351\5~@\7\u0351\u0353\3"+
		"\2\2\2\u0352\u034e\3\2\2\2\u0353\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0354"+
		"\u0355\3\2\2\2\u0355\177\3\2\2\2\u0356\u0354\3\2\2\2\u0357\u0358\t\t\2"+
		"\2\u0358\u0081\3\2\2\2\u0359\u035a\t\n\2\2\u035a\u0083\3\2\2\2\u035b\u035c"+
		"\bC\1\2\u035c\u035d\5\u0088E\2\u035d\u0372\3\2\2\2\u035e\u035f\f\7\2\2"+
		"\u035f\u0361\7i\2\2\u0360\u0362\7j\2\2\u0361\u0360\3\2\2\2\u0361\u0362"+
		"\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0371\t\13\2\2\u0364\u0365\f\6\2\2"+
		"\u0365\u0366\7\27\2\2\u0366\u0371\5\u0088E\2\u0367\u0368\f\5\2\2\u0368"+
		"\u0369\5\u0086D\2\u0369\u036a\5\u0088E\2\u036a\u0371\3\2\2\2\u036b\u036c"+
		"\f\4\2\2\u036c\u036d\5\u0086D\2\u036d\u036e\t\f\2\2\u036e\u036f\5N(\2"+
		"\u036f\u0371\3\2\2\2\u0370\u035e\3\2\2\2\u0370\u0364\3\2\2\2\u0370\u0367"+
		"\3\2\2\2\u0370\u036b\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372"+
		"\u0373\3\2\2\2\u0373\u0085\3\2\2\2\u0374\u0372\3\2\2\2\u0375\u0376\t\r"+
		"\2\2\u0376\u0087\3\2\2\2\u0377\u0379\5\u008aF\2\u0378\u037a\7j\2\2\u0379"+
		"\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c\7p"+
		"\2\2\u037c\u037d\5N(\2\u037d\u03a3\3\2\2\2\u037e\u0380\5\u008aF\2\u037f"+
		"\u0381\7j\2\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\3\2"+
		"\2\2\u0382\u0383\7p\2\2\u0383\u0384\7 \2\2\u0384\u0389\5~@\2\u0385\u0386"+
		"\7&\2\2\u0386\u0388\5~@\2\u0387\u0385\3\2\2\2\u0388\u038b\3\2\2\2\u0389"+
		"\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038c\3\2\2\2\u038b\u0389\3\2"+
		"\2\2\u038c\u038d\7!\2\2\u038d\u03a3\3\2\2\2\u038e\u0390\5\u008aF\2\u038f"+
		"\u0391\7j\2\2\u0390\u038f\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0392\3\2"+
		"\2\2\u0392\u0393\7o\2\2\u0393\u0394\5\u008aF\2\u0394\u0395\7g\2\2\u0395"+
		"\u0396\5\u0088E\2\u0396\u03a3\3\2\2\2\u0397\u0399\5\u008aF\2\u0398\u039a"+
		"\7j\2\2\u0399\u0398\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\3\2\2\2\u039b"+
		"\u039c\7s\2\2\u039c\u039f\5\u008cG\2\u039d\u039e\7\u00ad\2\2\u039e\u03a0"+
		"\5\u008cG\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a3\3\2\2"+
		"\2\u03a1\u03a3\5\u008aF\2\u03a2\u0377\3\2\2\2\u03a2\u037e\3\2\2\2\u03a2"+
		"\u038e\3\2\2\2\u03a2\u0397\3\2\2\2\u03a2\u03a1\3\2\2\2\u03a3\u0089\3\2"+
		"\2\2\u03a4\u03a5\bF\1\2\u03a5\u03a6\5\u008cG\2\u03a6\u03c7\3\2\2\2\u03a7"+
		"\u03a8\f\r\2\2\u03a8\u03a9\7\t\2\2\u03a9\u03c6\5\u008aF\16\u03aa\u03ab"+
		"\f\f\2\2\u03ab\u03ac\7\n\2\2\u03ac\u03c6\5\u008aF\r\u03ad\u03ae\f\13\2"+
		"\2\u03ae\u03af\7\13\2\2\u03af\u03c6\5\u008aF\f\u03b0\u03b1\f\n\2\2\u03b1"+
		"\u03b2\7\f\2\2\u03b2\u03c6\5\u008aF\13\u03b3\u03b4\f\t\2\2\u03b4\u03b5"+
		"\7\20\2\2\u03b5\u03c6\5\u008aF\n\u03b6\u03b7\f\b\2\2\u03b7\u03b8\7\21"+
		"\2\2\u03b8\u03c6\5\u008aF\t\u03b9\u03ba\f\7\2\2\u03ba\u03bb\7\22\2\2\u03bb"+
		"\u03c6\5\u008aF\b\u03bc\u03bd\f\6\2\2\u03bd\u03be\7\23\2\2\u03be\u03c6"+
		"\5\u008aF\7\u03bf\u03c0\f\5\2\2\u03c0\u03c1\7\16\2\2\u03c1\u03c6\5\u008a"+
		"F\6\u03c2\u03c3\f\4\2\2\u03c3\u03c4\7\r\2\2\u03c4\u03c6\5\u008aF\5\u03c5"+
		"\u03a7\3\2\2\2\u03c5\u03aa\3\2\2\2\u03c5\u03ad\3\2\2\2\u03c5\u03b0\3\2"+
		"\2\2\u03c5\u03b3\3\2\2\2\u03c5\u03b6\3\2\2\2\u03c5\u03b9\3\2\2\2\u03c5"+
		"\u03bc\3\2\2\2\u03c5\u03bf\3\2\2\2\u03c5\u03c2\3\2\2\2\u03c6\u03c9\3\2"+
		"\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u008b\3\2\2\2\u03c9"+
		"\u03c7\3\2\2\2\u03ca\u03cb\bG\1\2\u03cb\u03ea\5\u008eH\2\u03cc\u03ea\5"+
		"P)\2\u03cd\u03ea\5R*\2\u03ce\u03ea\5n8\2\u03cf\u03d0\t\16\2\2\u03d0\u03ea"+
		"\5\u008cG\7\u03d1\u03d3\7\u00b1\2\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3\3"+
		"\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\7 \2\2\u03d5\u03da\5~@\2\u03d6"+
		"\u03d7\7&\2\2\u03d7\u03d9\5~@\2\u03d8\u03d6\3\2\2\2\u03d9\u03dc\3\2\2"+
		"\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc\u03da"+
		"\3\2\2\2\u03dd\u03de\7!\2\2\u03de\u03ea\3\2\2\2\u03df\u03e1\7n\2\2\u03e0"+
		"\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03ea\5N"+
		"(\2\u03e3\u03e4\7\"\2\2\u03e4\u03e5\5b\62\2\u03e5\u03e6\5~@\2\u03e6\u03e7"+
		"\7#\2\2\u03e7\u03ea\3\2\2\2\u03e8\u03ea\5\u00b0Y\2\u03e9\u03ca\3\2\2\2"+
		"\u03e9\u03cc\3\2\2\2\u03e9\u03cd\3\2\2\2\u03e9\u03ce\3\2\2\2\u03e9\u03cf"+
		"\3\2\2\2\u03e9\u03d2\3\2\2\2\u03e9\u03e0\3\2\2\2\u03e9\u03e3\3\2\2\2\u03e9"+
		"\u03e8\3\2\2\2\u03ea\u03f6\3\2\2\2\u03eb\u03ec\f\b\2\2\u03ec\u03ed\7\6"+
		"\2\2\u03ed\u03f5\5\u008cG\t\u03ee\u03ef\f\t\2\2\u03ef\u03f2\7\u00c7\2"+
		"\2\u03f0\u03f3\7\u011d\2\2\u03f1\u03f3\5b\62\2\u03f2\u03f0\3\2\2\2\u03f2"+
		"\u03f1\3\2\2\2\u03f3\u03f5\3\2\2\2\u03f4\u03eb\3\2\2\2\u03f4\u03ee\3\2"+
		"\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7"+
		"\u008d\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f9\u03fd\5\u0090I\2\u03fa\u03fd"+
		"\5\u00a6T\2\u03fb\u03fd\5\u00acW\2\u03fc\u03f9\3\2\2\2\u03fc\u03fa\3\2"+
		"\2\2\u03fc\u03fb\3\2\2\2\u03fd\u008f\3\2\2\2\u03fe\u03ff\5\u0092J\2\u03ff"+
		"\u0401\7 \2\2\u0400\u0402\5\u0094K\2\u0401\u0400\3\2\2\2\u0401\u0402\3"+
		"\2\2\2\u0402\u040c\3\2\2\2\u0403\u0408\5~@\2\u0404\u0405\7&\2\2\u0405"+
		"\u0407\5~@\2\u0406\u0404\3\2\2\2\u0407\u040a\3\2\2\2\u0408\u0406\3\2\2"+
		"\2\u0408\u0409\3\2\2\2\u0409\u040d\3\2\2\2\u040a\u0408\3\2\2\2\u040b\u040d"+
		"\7\22\2\2\u040c\u0403\3\2\2\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2\2"+
		"\u040d\u040e\3\2\2\2\u040e\u0410\7!\2\2\u040f\u0411\5\u0096L\2\u0410\u040f"+
		"\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0091\3\2\2\2\u0412\u0413\t\17\2\2"+
		"\u0413\u0093\3\2\2\2\u0414\u0415\7O\2\2\u0415\u0095\3\2\2\2\u0416\u0417"+
		"\7\u00db\2\2\u0417\u0418\7 \2\2\u0418\u0419\7_\2\2\u0419\u041a\5~@\2\u041a"+
		"\u041b\7!\2\2\u041b\u0097\3\2\2\2\u041c\u041d\5b\62\2\u041d\u041e\7 \2"+
		"\2\u041e\u0423\5~@\2\u041f\u0420\7&\2\2\u0420\u0422\5~@\2\u0421\u041f"+
		"\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424"+
		"\u0426\3\2\2\2\u0425\u0423\3\2\2\2\u0426\u0427\7!\2\2\u0427\u0428\5\u0096"+
		"L\2\u0428\u042a\7\u00f6\2\2\u0429\u042b\5b\62\2\u042a\u0429\3\2\2\2\u042a"+
		"\u042b\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\5\u009aN\2\u042d\u0099"+
		"\3\2\2\2\u042e\u0430\5\u009cO\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2"+
		"\2\u0430\u0432\3\2\2\2\u0431\u0433\5\u00b6\\\2\u0432\u0431\3\2\2\2\u0432"+
		"\u0433\3\2\2\2\u0433\u0435\3\2\2\2\u0434\u0436\5\u009eP\2\u0435\u0434"+
		"\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u009b\3\2\2\2\u0437\u0438\7\u00b0\2"+
		"\2\u0438\u0439\7v\2\2\u0439\u043e\5~@\2\u043a\u043b\7&\2\2\u043b\u043d"+
		"\5~@\2\u043c\u043a\3\2\2\2\u043d\u0440\3\2\2\2\u043e\u043c\3\2\2\2\u043e"+
		"\u043f\3\2\2\2\u043f\u009d\3\2\2\2\u0440\u043e\3\2\2\2\u0441\u0444\t\20"+
		"\2\2\u0442\u0445\5\u00a0Q\2\u0443\u0445\5\u00a4S\2\u0444\u0442\3\2\2\2"+
		"\u0444\u0443\3\2\2\2\u0445\u009f\3\2\2\2\u0446\u0447\7\u009a\2\2\u0447"+
		"\u0453\7\u00b1\2\2\u0448\u0449\7\u0110\2\2\u0449\u0453\7\u00fb\2\2\u044a"+
		"\u044b\7\u0110\2\2\u044b\u0453\7\u00dd\2\2\u044c\u044d\5~@\2\u044d\u044e"+
		"\7\u00fb\2\2\u044e\u0453\3\2\2\2\u044f\u0450\5~@\2\u0450\u0451\7\u00dd"+
		"\2\2\u0451\u0453\3\2\2\2\u0452\u0446\3\2\2\2\u0452\u0448\3\2\2\2\u0452"+
		"\u044a\3\2\2\2\u0452\u044c\3\2\2\2\u0452\u044f\3\2\2\2\u0453\u00a1\3\2"+
		"\2\2\u0454\u0455\5\u00a0Q\2\u0455\u00a3\3\2\2\2\u0456\u0457\7o\2\2\u0457"+
		"\u0458\5\u00a0Q\2\u0458\u0459\7g\2\2\u0459\u045a\5\u00a2R\2\u045a\u00a5"+
		"\3\2\2\2\u045b\u045f\5\u0098M\2\u045c\u045f\5\u00a8U\2\u045d\u045f\5\u00aa"+
		"V\2\u045e\u045b\3\2\2\2\u045e\u045c\3\2\2\2\u045e\u045d\3\2\2\2\u045f"+
		"\u00a7\3\2\2\2\u0460\u0461\7R\2\2\u0461\u0462\7 \2\2\u0462\u0463\5~@\2"+
		"\u0463\u0464\7`\2\2\u0464\u0465\5\u00ba^\2\u0465\u0466\7!\2\2\u0466\u00a9"+
		"\3\2\2\2\u0467\u0468\7\u0082\2\2\u0468\u0469\7 \2\2\u0469\u046e\5~@\2"+
		"\u046a\u046b\7&\2\2\u046b\u046d\5~@\2\u046c\u046a\3\2\2\2\u046d\u0470"+
		"\3\2\2\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0473\3\2\2\2\u0470"+
		"\u046e\3\2\2\2\u0471\u0472\7^\2\2\u0472\u0474\5\u00c4c\2\u0473\u0471\3"+
		"\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476\7!\2\2\u0476"+
		"\u00ab\3\2\2\2\u0477\u0478\5\u00aeX\2\u0478\u0482\7 \2\2\u0479\u047e\5"+
		"~@\2\u047a\u047b\7&\2\2\u047b\u047d\5~@\2\u047c\u047a\3\2\2\2\u047d\u0480"+
		"\3\2\2\2\u047e\u047c\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0483\3\2\2\2\u0480"+
		"\u047e\3\2\2\2\u0481\u0483\7\22\2\2\u0482\u0479\3\2\2\2\u0482\u0481\3"+
		"\2\2\2\u0482\u0483\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0485\7!\2\2\u0485"+
		"\u00ad\3\2\2\2\u0486\u048d\5b\62\2\u0487\u048d\7b\2\2\u0488\u048d\7\u00cc"+
		"\2\2\u0489\u048d\7\u0089\2\2\u048a\u048d\7\u008a\2\2\u048b\u048d\7\u0085"+
		"\2\2\u048c\u0486\3\2\2\2\u048c\u0487\3\2\2\2\u048c\u0488\3\2\2\2\u048c"+
		"\u0489\3\2\2\2\u048c\u048a\3\2\2\2\u048c\u048b\3\2\2\2\u048d\u00af\3\2"+
		"\2\2\u048e\u0490\7P\2\2\u048f\u0491\5\u008cG\2\u0490\u048f\3\2\2\2\u0490"+
		"\u0491\3\2\2\2\u0491\u0493\3\2\2\2\u0492\u0494\5\u00b2Z\2\u0493\u0492"+
		"\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0493\3\2\2\2\u0495\u0496\3\2\2\2\u0496"+
		"\u0498\3\2\2\2\u0497\u0499\5\u00b4[\2\u0498\u0497\3\2\2\2\u0498\u0499"+
		"\3\2\2\2\u0499\u00b1\3\2\2\2\u049a\u049b\7Q\2\2\u049b\u049c\5~@\2\u049c"+
		"\u049d\7d\2\2\u049d\u049e\5~@\2\u049e\u00b3\3\2\2\2\u049f\u04a0\7c\2\2"+
		"\u04a0\u04a1\5~@\2\u04a1\u00b5\3\2\2\2\u04a2\u04a3\7t\2\2\u04a3\u04a4"+
		"\7v\2\2\u04a4\u04a9\5\u00b8]\2\u04a5\u04a6\7&\2\2\u04a6\u04a8\5\u00b8"+
		"]\2\u04a7\u04a5\3\2\2\2\u04a8\u04ab\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9"+
		"\u04aa\3\2\2\2\u04aa\u00b7\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ac\u04b0\5n"+
		"8\2\u04ad\u04b0\5V,\2\u04ae\u04b0\5~@\2\u04af\u04ac\3\2\2\2\u04af\u04ad"+
		"\3\2\2\2\u04af\u04ae\3\2\2\2\u04b0\u04b2\3\2\2\2\u04b1\u04b3\t\21\2\2"+
		"\u04b2\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u00b9\3\2\2\2\u04b4\u04b6"+
		"\5\u00bc_\2\u04b5\u04b7\5\u00be`\2\u04b6\u04b5\3\2\2\2\u04b6\u04b7\3\2"+
		"\2\2\u04b7\u04b9\3\2\2\2\u04b8\u04ba\5\u00c0a\2\u04b9\u04b8\3\2\2\2\u04b9"+
		"\u04ba\3\2\2\2\u04ba\u04bc\3\2\2\2\u04bb\u04bd\5\u00c2b\2\u04bc\u04bb"+
		"\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04d0\3\2\2\2\u04be\u04bf\5\u00bc_"+
		"\2\u04bf\u04c0\7 \2\2\u04c0\u04c5\7\u011d\2\2\u04c1\u04c2\7&\2\2\u04c2"+
		"\u04c4\7\u011d\2\2\u04c3\u04c1\3\2\2\2\u04c4\u04c7\3\2\2\2\u04c5\u04c3"+
		"\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c8\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c8"+
		"\u04ca\7!\2\2\u04c9\u04cb\5\u00c0a\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3"+
		"\2\2\2\u04cb\u04cd\3\2\2\2\u04cc\u04ce\5\u00c2b\2\u04cd\u04cc\3\2\2\2"+
		"\u04cd\u04ce\3\2\2\2\u04ce\u04d0\3\2\2\2\u04cf\u04b4\3\2\2\2\u04cf\u04be"+
		"\3\2\2\2\u04d0\u00bb\3\2\2\2\u04d1\u04d3\5b\62\2\u04d2\u04d4\5b\62\2\u04d3"+
		"\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u00bd\3\2\2\2\u04d5\u04d6\7 "+
		"\2\2\u04d6\u04d9\7\u011e\2\2\u04d7\u04d8\7&\2\2\u04d8\u04da\7\u011e\2"+
		"\2\u04d9\u04d7\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc"+
		"\7!\2\2\u04dc\u00bf\3\2\2\2\u04dd\u04de\t\22\2\2\u04de\u04e0\7<\2\2\u04df"+
		"\u04e1\7\31\2\2\u04e0\u04df\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\3"+
		"\2\2\2\u04e2\u04e3\5\u00c4c\2\u04e3\u00c1\3\2\2\2\u04e4\u04e6\7\u00c7"+
		"\2\2\u04e5\u04e7\7\31\2\2\u04e6\u04e5\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7"+
		"\u04ea\3\2\2\2\u04e8\u04eb\7\u011d\2\2\u04e9\u04eb\5\u00c4c\2\u04ea\u04e8"+
		"\3\2\2\2\u04ea\u04e9\3\2\2\2\u04eb\u00c3\3\2\2\2\u04ec\u04ef\5b\62\2\u04ed"+
		"\u04ee\7\25\2\2\u04ee\u04f0\5b\62\2\u04ef\u04ed\3\2\2\2\u04ef\u04f0\3"+
		"\2\2\2\u04f0\u00c5\3\2\2\2\u04f1\u04f6\5\u00c4c\2\u04f2\u04f3\7&\2\2\u04f3"+
		"\u04f5\5\u00c4c\2\u04f4\u04f2\3\2\2\2\u04f5\u04f8\3\2\2\2\u04f6\u04f4"+
		"\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u00c7\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f9"+
		"\u04fa\7\64\2\2\u04fa\u04fb\5\u00d6l\2\u04fb\u04fc\7=\2\2\u04fc\u04fd"+
		"\5\u00d8m\2\u04fd\u04fe\5l\67\2\u04fe\u04ff\5\u00dan\2\u04ff\u0500\5\u00fa"+
		"~\2\u0500\u00c9\3\2\2\2\u0501\u0502\7\64\2\2\u0502\u0503\5\u00fc\177\2"+
		"\u0503\u0504\7?\2\2\u0504\u0508\5\u00fe\u0080\2\u0505\u0506\5\u0100\u0081"+
		"\2\u0506\u0507\5z>\2\u0507\u0509\3\2\2\2\u0508\u0505\3\2\2\2\u0508\u0509"+
		"\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\7a\2\2\u050b\u050c\5\u0102\u0082"+
		"\2\u050c\u050d\5l\67\2\u050d\u00cb\3\2\2\2\u050e\u050f\7\65\2\2\u050f"+
		"\u0510\7=\2\2\u0510\u0511\5\u0104\u0083\2\u0511\u0512\5\u0102\u0082\2"+
		"\u0512\u0513\5\u0114\u008b\2\u0513\u0514\5\u0108\u0085\2\u0514\u00cd\3"+
		"\2\2\2\u0515\u0516\7\65\2\2\u0516\u0517\7?\2\2\u0517\u0518\5\u0138\u009d"+
		"\2\u0518\u0519\5z>\2\u0519\u051a\5\u010a\u0086\2\u051a\u00cf\3\2\2\2\u051b"+
		"\u051c\7\66\2\2\u051c\u051d\7=\2\2\u051d\u051e\5\u0104\u0083\2\u051e\u051f"+
		"\5t;\2\u051f\u00d1\3\2\2\2\u0520\u0521\7\66\2\2\u0521\u0522\7?\2\2\u0522"+
		"\u0523\5\u00fe\u0080\2\u0523\u0524\5\u0138\u009d\2\u0524\u0525\5\u013a"+
		"\u009e\2\u0525\u00d3\3\2\2\2\u0526\u0528\7\67\2\2\u0527\u0529\7=\2\2\u0528"+
		"\u0527\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052b\5\u0102"+
		"\u0082\2\u052b\u052c\5\u0112\u008a\2\u052c\u00d5\3\2\2\2\u052d\u052f\t"+
		"\23\2\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0530\3\2\2\2\u0530"+
		"\u0533\t\24\2\2\u0531\u0533\7\u0111\2\2\u0532\u052e\3\2\2\2\u0532\u0531"+
		"\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u00d7\3\2\2\2\u0534\u0535\7b\2\2\u0535"+
		"\u0536\7j\2\2\u0536\u0538\7n\2\2\u0537\u0534\3\2\2\2\u0537\u0538\3\2\2"+
		"\2\u0538\u00d9\3\2\2\2\u0539\u0542\7 \2\2\u053a\u053f\5\u00dco\2\u053b"+
		"\u053c\7&\2\2\u053c\u053e\5\u00dco\2\u053d\u053b\3\2\2\2\u053e\u0541\3"+
		"\2\2\2\u053f\u053d\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0543\3\2\2\2\u0541"+
		"\u053f\3\2\2\2\u0542\u053a\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0544\3\2"+
		"\2\2\u0544\u0545\7!\2\2\u0545\u00db\3\2\2\2\u0546\u0551\5\u00dep\2\u0547"+
		"\u0551\5\u00f6|\2\u0548\u0549\7s\2\2\u0549\u054d\5l\67\2\u054a\u054c\5"+
		"\u00f4{\2\u054b\u054a\3\2\2\2\u054c\u054f\3\2\2\2\u054d\u054b\3\2\2\2"+
		"\u054d\u054e\3\2\2\2\u054e\u0551\3\2\2\2\u054f\u054d\3\2\2\2\u0550\u0546"+
		"\3\2\2\2\u0550\u0547\3\2\2\2\u0550\u0548\3\2\2\2\u0551\u00dd\3\2\2\2\u0552"+
		"\u0553\5n8\2\u0553\u0555\5\u00ba^\2\u0554\u0556\5\u00c2b\2\u0555\u0554"+
		"\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u055a\3\2\2\2\u0557\u0559\5\u00e0q"+
		"\2\u0558\u0557\3\2\2\2\u0559\u055c\3\2\2\2\u055a\u0558\3\2\2\2\u055a\u055b"+
		"\3\2\2\2\u055b\u00df\3\2\2\2\u055c\u055a\3\2\2\2\u055d\u055f\5\u00e2r"+
		"\2\u055e\u055d\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0561"+
		"\5\u00e4s\2\u0561\u0562\5\u00f2z\2\u0562\u00e1\3\2\2\2\u0563\u0564\7@"+
		"\2\2\u0564\u0565\5\u00c4c\2\u0565\u00e3\3\2\2\2\u0566\u0568\7j\2\2\u0567"+
		"\u0566\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u0596\7k"+
		"\2\2\u056a\u0596\5\u00e6t\2\u056b\u056c\7\u0099\2\2\u056c\u0596\5\u00e8"+
		"u\2\u056d\u0571\7\u00b6\2\2\u056e\u0572\7\u00b3\2\2\u056f\u0570\7v\2\2"+
		"\u0570\u0572\7\u0099\2\2\u0571\u056e\3\2\2\2\u0571\u056f\3\2\2\2\u0572"+
		"\u0573\3\2\2\2\u0573\u0574\7`\2\2\u0574\u0579\7\u00e0\2\2\u0575\u0576"+
		"\7 \2\2\u0576\u0577\5\u00eav\2\u0577\u0578\7!\2\2\u0578\u057a\3\2\2\2"+
		"\u0579\u0575\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u0596\3\2\2\2\u057b\u057c"+
		"\7B\2\2\u057c\u0596\5\u00eex\2\u057d\u057e\5|?\2\u057e\u057f\5\u00eex"+
		"\2\u057f\u0596\3\2\2\2\u0580\u0581\7\u00bd\2\2\u0581\u0583\5l\67\2\u0582"+
		"\u0584\5v<\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u058b\3\2\2"+
		"\2\u0585\u0586\7\u00ee\2\2\u0586\u058c\7X\2\2\u0587\u0588\7\u00ee\2\2"+
		"\u0588\u058c\7\u00f9\2\2\u0589\u058a\7\u00ee\2\2\u058a\u058c\7\u0109\2"+
		"\2\u058b\u0585\3\2\2\2\u058b\u0587\3\2\2\2\u058b\u0589\3\2\2\2\u058b\u058c"+
		"\3\2\2\2\u058c\u0592\3\2\2\2\u058d\u058e\7a\2\2\u058e\u058f\t\25\2\2\u058f"+
		"\u0591\5\u00f0y\2\u0590\u058d\3\2\2\2\u0591\u0594\3\2\2\2\u0592\u0590"+
		"\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0596\3\2\2\2\u0594\u0592\3\2\2\2\u0595"+
		"\u0567\3\2\2\2\u0595\u056a\3\2\2\2\u0595\u056b\3\2\2\2\u0595\u056d\3\2"+
		"\2\2\u0595\u057b\3\2\2\2\u0595\u057d\3\2\2\2\u0595\u0580\3\2\2\2\u0596"+
		"\u00e5\3\2\2\2\u0597\u0598\7\u00b5\2\2\u0598\u059b\5~@\2\u0599\u059a\7"+
		"\u00b9\2\2\u059a\u059c\7\u00e5\2\2\u059b\u0599\3\2\2\2\u059b\u059c\3\2"+
		"\2\2\u059c\u00e7\3\2\2\2\u059d\u05a0\7\u00cc\2\2\u059e\u05a0\5~@\2\u059f"+
		"\u059d\3\2\2\2\u059f\u059e\3\2\2\2\u05a0\u00e9\3\2\2\2\u05a1\u05a3\5\u00ec"+
		"w\2\u05a2\u05a1\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a4"+
		"\u05a5\3\2\2\2\u05a5\u00eb\3\2\2\2\u05a6\u05a8\7\u00c0\2\2\u05a7\u05a9"+
		"\7M\2\2\u05a8\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa"+
		"\u05c0\7\u011e\2\2\u05ab\u05ad\7\u00e3\2\2\u05ac\u05ae\7v\2\2\u05ad\u05ac"+
		"\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05c0\7\u011e\2"+
		"\2\u05b0\u05b1\7\u00ef\2\2\u05b1\u05c0\7\u011e\2\2\u05b2\u05b3\7\u00b9"+
		"\2\2\u05b3\u05c0\7\u00ef\2\2\u05b4\u05b5\7\u00f0\2\2\u05b5\u05c0\7\u011e"+
		"\2\2\u05b6\u05b7\7\u00b9\2\2\u05b7\u05c0\7\u00f0\2\2\u05b8\u05c0\7\u00cd"+
		"\2\2\u05b9\u05ba\7\u00b9\2\2\u05ba\u05c0\7\u00cd\2\2\u05bb\u05bc\7\u00c4"+
		"\2\2\u05bc\u05c0\7\u011e\2\2\u05bd\u05be\7\u00f7\2\2\u05be\u05c0\7v\2"+
		"\2\u05bf\u05a6\3\2\2\2\u05bf\u05ab\3\2\2\2\u05bf\u05b0\3\2\2\2\u05bf\u05b2"+
		"\3\2\2\2\u05bf\u05b4\3\2\2\2\u05bf\u05b6\3\2\2\2\u05bf\u05b8\3\2\2\2\u05bf"+
		"\u05b9\3\2\2\2\u05bf\u05bb\3\2\2\2\u05bf\u05bd\3\2\2\2\u05c0\u00ed\3\2"+
		"\2\2\u05c1\u05c2\7^\2\2\u05c2\u05c3\7?\2\2\u05c3\u05c4\7\u010c\2\2\u05c4"+
		"\u05c6\5\u00c4c\2\u05c5\u05c1\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05cb"+
		"\3\2\2\2\u05c7\u05c8\7\u00e8\2\2\u05c8\u05cb\5v<\2\u05c9\u05cb\7M\2\2"+
		"\u05ca\u05c5\3\2\2\2\u05ca\u05c7\3\2\2\2\u05ca\u05c9\3\2\2\2\u05cb\u00ef"+
		"\3\2\2\2\u05cc\u05cd\7\u00b9\2\2\u05cd\u05d3\7\u00c3\2\2\u05ce\u05d3\7"+
		"\u0101\2\2\u05cf\u05d3\7\u00b4\2\2\u05d0\u05d1\7<\2\2\u05d1\u05d3\t\26"+
		"\2\2\u05d2\u05cc\3\2\2\2\u05d2\u05ce\3\2\2\2\u05d2\u05cf\3\2\2\2\u05d2"+
		"\u05d0\3\2\2\2\u05d3\u00f1\3\2\2\2\u05d4\u05d6\7j\2\2\u05d5\u05d4\3\2"+
		"\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d9\7\u00d1\2\2\u05d8"+
		"\u05d5\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05dc\3\2\2\2\u05da\u05db\7\u00e7"+
		"\2\2\u05db\u05dd\t\27\2\2\u05dc\u05da\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd"+
		"\u00f3\3\2\2\2\u05de\u05df\t\30\2\2\u05df\u05e0\t\31\2\2\u05e0\u00f5\3"+
		"\2\2\2\u05e1\u05e3\5\u00e2r\2\u05e2\u05e1\3\2\2\2\u05e2\u05e3\3\2\2\2"+
		"\u05e3\u05e4\3\2\2\2\u05e4\u05e5\5\u00f8}\2\u05e5\u05e6\5\u00f2z\2\u05e6"+
		"\u00f7\3\2\2\2\u05e7\u060e\5\u00e6t\2\u05e8\u05e9\7B\2\2\u05e9\u05ea\5"+
		"v<\2\u05ea\u05eb\5\u00eex\2\u05eb\u060e\3\2\2\2\u05ec\u05ed\5|?\2\u05ed"+
		"\u05ee\5v<\2\u05ee\u05ef\5\u00eex\2\u05ef\u060e\3\2\2\2\u05f0\u05f3\7"+
		"\u00ae\2\2\u05f1\u05f2\7^\2\2\u05f2\u05f4\5\u00c4c\2\u05f3\u05f1\3\2\2"+
		"\2\u05f3\u05f4\3\2\2\2\u05f4\u060e\3\2\2\2\u05f5\u05f6\7C\2\2\u05f6\u05f7"+
		"\7D\2\2\u05f7\u05f8\5v<\2\u05f8\u05f9\7\u00bd\2\2\u05f9\u05fb\5l\67\2"+
		"\u05fa\u05fc\5v<\2\u05fb\u05fa\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u0603"+
		"\3\2\2\2\u05fd\u05fe\7\u00ee\2\2\u05fe\u0604\7X\2\2\u05ff\u0600\7\u00ee"+
		"\2\2\u0600\u0604\7\u00f9\2\2\u0601\u0602\7\u00ee\2\2\u0602\u0604\7\u0109"+
		"\2\2\u0603\u05fd\3\2\2\2\u0603\u05ff\3\2\2\2\u0603\u0601\3\2\2\2\u0603"+
		"\u0604\3\2\2\2\u0604\u060a\3\2\2\2\u0605\u0606\7a\2\2\u0606\u0607\t\25"+
		"\2\2\u0607\u0609\5\u00f0y\2\u0608\u0605\3\2\2\2\u0609\u060c\3\2\2\2\u060a"+
		"\u0608\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060e\3\2\2\2\u060c\u060a\3\2"+
		"\2\2\u060d\u05e7\3\2\2\2\u060d\u05e8\3\2\2\2\u060d\u05ec\3\2\2\2\u060d"+
		"\u05f0\3\2\2\2\u060d\u05f5\3\2\2\2\u060e\u00f9\3\2\2\2\u060f\u0610\7\u00e6"+
		"\2\2\u0610\u0612\5t;\2\u0611\u060f\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u00fb"+
		"\3\2\2\2\u0613\u0615\7B\2\2\u0614\u0613\3\2\2\2\u0614\u0615\3\2\2\2\u0615"+
		"\u00fd\3\2\2\2\u0616\u0618\7\u00c9\2\2\u0617\u0616\3\2\2\2\u0617\u0618"+
		"\3\2\2\2\u0618\u00ff\3\2\2\2\u0619\u061a\7b\2\2\u061a\u061b\7j\2\2\u061b"+
		"\u061d\7n\2\2\u061c\u0619\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u0101\3\2"+
		"\2\2\u061e\u0620\7\u00f5\2\2\u061f\u061e\3\2\2\2\u061f\u0620\3\2\2\2\u0620"+
		"\u0103\3\2\2\2\u0621\u0622\7b\2\2\u0622\u0624\7n\2\2\u0623\u0621\3\2\2"+
		"\2\u0623\u0624\3\2\2\2\u0624\u0105\3\2\2\2\u0625\u0627\7\22\2\2\u0626"+
		"\u0625\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0107\3\2\2\2\u0628\u062d\5\u0116"+
		"\u008c\2\u0629\u062d\5\u0132\u009a\2\u062a\u062d\5\u0134\u009b\2\u062b"+
		"\u062d\5\u0136\u009c\2\u062c\u0628\3\2\2\2\u062c\u0629\3\2\2\2\u062c\u062a"+
		"\3\2\2\2\u062c\u062b\3\2\2\2\u062d\u0109\3\2\2\2\u062e\u0632\5\u010c\u0087"+
		"\2\u062f\u0632\5\u010e\u0088\2\u0630\u0632\5\u0110\u0089\2\u0631\u062e"+
		"\3\2\2\2\u0631\u062f\3\2\2\2\u0631\u0630\3\2\2\2\u0632\u010b\3\2\2\2\u0633"+
		"\u0634\7\u00fd\2\2\u0634\u0635\7f\2\2\u0635\u0636\5z>\2\u0636\u010d\3"+
		"\2\2\2\u0637\u0638\7\65\2\2\u0638\u0639\7?\2\2\u0639\u063a\5z>\2\u063a"+
		"\u063b\7\u00d3\2\2\u063b\u063c\7a\2\2\u063c\u063d\7\u00d8\2\2\u063d\u063e"+
		"\5\u00c4c\2\u063e\u010f\3\2\2\2\u063f\u0640\7\65\2\2\u0640\u0641\7?\2"+
		"\2\u0641\u0642\7q\2\2\u0642\u0643\7p\2\2\u0643\u0644\7\u010c\2\2\u0644"+
		"\u0648\5z>\2\u0645\u0646\7\u00f7\2\2\u0646\u0647\7v\2\2\u0647\u0649\5"+
		"\u00c6d\2\u0648\u0645\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u0111\3\2\2\2"+
		"\u064a\u064f\5\u0114\u008b\2\u064b\u064c\7&\2\2\u064c\u064e\5\u0114\u008b"+
		"\2\u064d\u064b\3\2\2\2\u064e\u0651\3\2\2\2\u064f\u064d\3\2\2\2\u064f\u0650"+
		"\3\2\2\2\u0650\u0113\3\2\2\2\u0651\u064f\3\2\2\2\u0652\u0654\5l\67\2\u0653"+
		"\u0655\7\22\2\2\u0654\u0653\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0115\3"+
		"\2\2\2\u0656\u065b\5\u0118\u008d\2\u0657\u0658\7&\2\2\u0658\u065a\5\u0118"+
		"\u008d\2\u0659\u0657\3\2\2\2\u065a\u065d\3\2\2\2\u065b\u0659\3\2\2\2\u065b"+
		"\u065c\3\2\2\2\u065c\u0117\3\2\2\2\u065d\u065b\3\2\2\2\u065e\u06cf\5\u011a"+
		"\u008e\2\u065f\u06cf\5\u011c\u008f\2\u0660\u06cf\5\u0120\u0091\2\u0661"+
		"\u06cf\5\u012a\u0096\2\u0662\u0663\7\65\2\2\u0663\u0664\7@\2\2\u0664\u0665"+
		"\5\u00c4c\2\u0665\u0666\5\u00f2z\2\u0666\u06cf\3\2\2\2\u0667\u0668\7\u0114"+
		"\2\2\u0668\u0669\7@\2\2\u0669\u06cf\5\u00c4c\2\u066a\u066b\7\66\2\2\u066b"+
		"\u066c\7@\2\2\u066c\u066d\5\u0138\u009d\2\u066d\u066f\5\u00c4c\2\u066e"+
		"\u0670\t\32\2\2\u066f\u066e\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u06cf\3"+
		"\2\2\2\u0671\u0672\t\33\2\2\u0672\u0676\7H\2\2\u0673\u0677\5\u00c4c\2"+
		"\u0674\u0677\7q\2\2\u0675\u0677\7\u00c2\2\2\u0676\u0673\3\2\2\2\u0676"+
		"\u0674\3\2\2\2\u0676\u0675\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u06cf\3\2"+
		"\2\2\u0678\u0679\7\u009b\2\2\u0679\u067a\t\34\2\2\u067a\u067b\7H\2\2\u067b"+
		"\u06cf\5\u00c4c\2\u067c\u067d\t\33\2\2\u067d\u067e\7\u0103\2\2\u067e\u06cf"+
		"\5\u00c4c\2\u067f\u0680\7\u009b\2\2\u0680\u0681\t\34\2\2\u0681\u0682\7"+
		"\u0103\2\2\u0682\u06cf\5\u00c4c\2\u0683\u068a\7\u009c\2\2\u0684\u068a"+
		"\7\u009b\2\2\u0685\u0687\7\u00b9\2\2\u0686\u0685\3\2\2\2\u0686\u0687\3"+
		"\2\2\2\u0687\u0688\3\2\2\2\u0688\u068a\7\u00de\2\2\u0689\u0683\3\2\2\2"+
		"\u0689\u0684\3\2\2\2\u0689\u0686\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068c"+
		"\7\u00b1\2\2\u068c\u068d\7\u00b8\2\2\u068d\u06cf\7\u0104\2\2\u068e\u068f"+
		"\7\u00c6\2\2\u068f\u0690\7a\2\2\u0690\u06cf\5z>\2\u0691\u0692\7<\2\2\u0692"+
		"\u0693\7\u0116\2\2\u0693\u06cf\7\u00c6\2\2\u0694\u0695\7<\2\2\u0695\u0696"+
		"\t\35\2\2\u0696\u06cf\7\u00f4\2\2\u0697\u0698\7<\2\2\u0698\u0699\7\u010c"+
		"\2\2\u0699\u06cf\5\u00c4c\2\u069a\u069b\7<\2\2\u069b\u06cf\t\36\2\2\u069c"+
		"\u069d\7<\2\2\u069d\u069e\7 \2\2\u069e\u06a3\5\u012e\u0098\2\u069f\u06a0"+
		"\7&\2\2\u06a0\u06a2\5\u012e\u0098\2\u06a1\u069f\3\2\2\2\u06a2\u06a5\3"+
		"\2\2\2\u06a3\u06a1\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a6\3\2\2\2\u06a5"+
		"\u06a3\3\2\2\2\u06a6\u06a7\7!\2\2\u06a7\u06cf\3\2\2\2\u06a8\u06a9\7\u00ff"+
		"\2\2\u06a9\u06aa\7 \2\2\u06aa\u06af\5\u0130\u0099\2\u06ab\u06ac\7&\2\2"+
		"\u06ac\u06ae\5\u0130\u0099\2\u06ad\u06ab\3\2\2\2\u06ae\u06b1\3\2\2\2\u06af"+
		"\u06ad\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b2\3\2\2\2\u06b1\u06af\3\2"+
		"\2\2\u06b2\u06b3\7!\2\2\u06b3\u06cf\3\2\2\2\u06b4\u06b5\7\u00e5\2\2\u06b5"+
		"\u06cf\5l\67\2\u06b6\u06b7\7\u00b9\2\2\u06b7\u06b8\7\u00e5\2\2\u06b8\u06cf"+
		"\5l\67\2\u06b9\u06ba\7\u0118\2\2\u06ba\u06cf\5\u00bc_\2\u06bb\u06bc\7"+
		"j\2\2\u06bc\u06cf\7\u0118\2\2\u06bd\u06be\7\u00f8\2\2\u06be\u06c2\7f\2"+
		"\2\u06bf\u06c3\5\u00c4c\2\u06c0\u06c3\7\u00a2\2\2\u06c1\u06c3\7\u0107"+
		"\2\2\u06c2\u06bf\3\2\2\2\u06c2\u06c0\3\2\2\2\u06c2\u06c1\3\2\2\2\u06c3"+
		"\u06cf\3\2\2\2\u06c4\u06c5\7\u00fe\2\2\u06c5\u06cc\7\u00e0\2\2\u06c6\u06cd"+
		"\7\u0099\2\2\u06c7\u06c8\7^\2\2\u06c8\u06c9\7?\2\2\u06c9\u06cd\5z>\2\u06ca"+
		"\u06cd\7X\2\2\u06cb\u06cd\7\u00f1\2\2\u06cc\u06c6\3\2\2\2\u06cc\u06c7"+
		"\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cc\u06cb\3\2\2\2\u06cd\u06cf\3\2\2\2\u06ce"+
		"\u065e\3\2\2\2\u06ce\u065f\3\2\2\2\u06ce\u0660\3\2\2\2\u06ce\u0661\3\2"+
		"\2\2\u06ce\u0662\3\2\2\2\u06ce\u0667\3\2\2\2\u06ce\u066a\3\2\2\2\u06ce"+
		"\u0671\3\2\2\2\u06ce\u0678\3\2\2\2\u06ce\u067c\3\2\2\2\u06ce\u067f\3\2"+
		"\2\2\u06ce\u0689\3\2\2\2\u06ce\u068e\3\2\2\2\u06ce\u0691\3\2\2\2\u06ce"+
		"\u0694\3\2\2\2\u06ce\u0697\3\2\2\2\u06ce\u069a\3\2\2\2\u06ce\u069c\3\2"+
		"\2\2\u06ce\u06a8\3\2\2\2\u06ce\u06b4\3\2\2\2\u06ce\u06b6\3\2\2\2\u06ce"+
		"\u06b9\3\2\2\2\u06ce\u06bb\3\2\2\2\u06ce\u06bd\3\2\2\2\u06ce\u06c4\3\2"+
		"\2\2\u06cf\u0119\3\2\2\2\u06d0\u06d2\7;\2\2\u06d1\u06d3\7>\2\2\u06d2\u06d1"+
		"\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d7\3\2\2\2\u06d4\u06d5\7b\2\2\u06d5"+
		"\u06d6\7j\2\2\u06d6\u06d8\7n\2\2\u06d7\u06d4\3\2\2\2\u06d7\u06d8\3\2\2"+
		"\2\u06d8\u06d9\3\2\2\2\u06d9\u06da\5\u00dep\2\u06da\u011b\3\2\2\2\u06db"+
		"\u06dd\7\66\2\2\u06dc\u06de\7>\2\2\u06dd\u06dc\3\2\2\2\u06dd\u06de\3\2"+
		"\2\2\u06de\u06df\3\2\2\2\u06df\u06e0\5\u011e\u0090\2\u06e0\u06e2\5n8\2"+
		"\u06e1\u06e3\t\32\2\2\u06e2\u06e1\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u011d"+
		"\3\2\2\2\u06e4\u06e5\7b\2\2\u06e5\u06e7\7n\2\2\u06e6\u06e4\3\2\2\2\u06e6"+
		"\u06e7\3\2\2\2\u06e7\u011f\3\2\2\2\u06e8\u06eb\5\u0122\u0092\2\u06e9\u06ea"+
		"\7<\2\2\u06ea\u06ec\7\u00ce\2\2\u06eb\u06e9\3\2\2\2\u06eb\u06ec\3\2\2"+
		"\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee\7\u010f\2\2\u06ee\u06f0\5\u00ba^\2"+
		"\u06ef\u06f1\5\u00c2b\2\u06f0\u06ef\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1"+
		"\u06f4\3\2\2\2\u06f2\u06f3\7^\2\2\u06f3\u06f5\5\u008cG\2\u06f4\u06f2\3"+
		"\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u0738\3\2\2\2\u06f6\u06f7\5\u0122\u0092"+
		"\2\u06f7\u06f8\7<\2\2\u06f8\u06f9\7\u0099\2\2\u06f9\u06fa\5~@\2\u06fa"+
		"\u0738\3\2\2\2\u06fb\u06fc\5\u0122\u0092\2\u06fc\u06fd\7\66\2\2\u06fd"+
		"\u06fe\7\u0099\2\2\u06fe\u0738\3\2\2\2\u06ff\u0700\5\u0122\u0092\2\u0700"+
		"\u0701\t\37\2\2\u0701\u0702\7j\2\2\u0702\u0703\7k\2\2\u0703\u0738\3\2"+
		"\2\2\u0704\u0705\5\u0122\u0092\2\u0705\u0706\7;\2\2\u0706\u070a\7\u00b6"+
		"\2\2\u0707\u070b\7\u00b3\2\2\u0708\u0709\7v\2\2\u0709\u070b\7\u0099\2"+
		"\2\u070a\u0707\3\2\2\2\u070a\u0708\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u070d"+
		"\7`\2\2\u070d\u0712\7\u00e0\2\2\u070e\u070f\7 \2\2\u070f\u0710\5\u00ea"+
		"v\2\u0710\u0711\7!\2\2\u0711\u0713\3\2\2\2\u0712\u070e\3\2\2\2\u0712\u0713"+
		"\3\2\2\2\u0713\u0738\3\2\2\2\u0714\u0715\5\u0122\u0092\2\u0715\u0719\5"+
		"\u0124\u0093\2\u0716\u0718\5\u0124\u0093\2\u0717\u0716\3\2\2\2\u0718\u071b"+
		"\3\2\2\2\u0719\u0717\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u0738\3\2\2\2\u071b"+
		"\u0719\3\2\2\2\u071c\u071d\5\u0122\u0092\2\u071d\u071e\7\66\2\2\u071e"+
		"\u071f\7\u00e0\2\2\u071f\u0720\5\u011e\u0090\2\u0720\u0738\3\2\2\2\u0721"+
		"\u0722\5\u0122\u0092\2\u0722\u0723\7<\2\2\u0723\u0724\7\u010a\2\2\u0724"+
		"\u0725\7\u011e\2\2\u0725\u0738\3\2\2\2\u0726\u0727\5\u0122\u0092\2\u0727"+
		"\u0728\7<\2\2\u0728\u0729\7 \2\2\u0729\u072a\5\u0126\u0094\2\u072a\u072b"+
		"\7!\2\2\u072b\u0738\3\2\2\2\u072c\u072d\5\u0122\u0092\2\u072d\u072e\7"+
		"\u00ff\2\2\u072e\u072f\7 \2\2\u072f\u0730\5\u0126\u0094\2\u0730\u0731"+
		"\7!\2\2\u0731\u0738\3\2\2\2\u0732\u0733\5\u0122\u0092\2\u0733\u0734\7"+
		"<\2\2\u0734\u0735\7\u010b\2\2\u0735\u0736\t \2\2\u0736\u0738\3\2\2\2\u0737"+
		"\u06e8\3\2\2\2\u0737\u06f6\3\2\2\2\u0737\u06fb\3\2\2\2\u0737\u06ff\3\2"+
		"\2\2\u0737\u0704\3\2\2\2\u0737\u0714\3\2\2\2\u0737\u071c\3\2\2\2\u0737"+
		"\u0721\3\2\2\2\u0737\u0726\3\2\2\2\u0737\u072c\3\2\2\2\u0737\u0732\3\2"+
		"\2\2\u0738\u0121\3\2\2\2\u0739\u073b\7\65\2\2\u073a\u073c\7>\2\2\u073b"+
		"\u073a\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073e\5n"+
		"8\2\u073e\u0123\3\2\2\2\u073f\u0747\7<\2\2\u0740\u0744\7\u00b6\2\2\u0741"+
		"\u0745\7\u00b3\2\2\u0742\u0743\7v\2\2\u0743\u0745\7\u0099\2\2\u0744\u0741"+
		"\3\2\2\2\u0744\u0742\3\2\2\2\u0745\u0748\3\2\2\2\u0746\u0748\5\u00ecw"+
		"\2\u0747\u0740\3\2\2\2\u0747\u0746\3\2\2\2\u0748\u0751\3\2\2\2\u0749\u074e"+
		"\7\u0100\2\2\u074a\u074c\7M\2\2\u074b\u074a\3\2\2\2\u074b\u074c\3\2\2"+
		"\2\u074c\u074d\3\2\2\2\u074d\u074f\7\u011e\2\2\u074e\u074b\3\2\2\2\u074e"+
		"\u074f\3\2\2\2\u074f\u0751\3\2\2\2\u0750\u073f\3\2\2\2\u0750\u0749\3\2"+
		"\2\2\u0751\u0125\3\2\2\2\u0752\u0757\5\u0128\u0095\2\u0753\u0754\7&\2"+
		"\2\u0754\u0756\5\u0128\u0095\2\u0755\u0753\3\2\2\2\u0756\u0759\3\2\2\2"+
		"\u0757\u0755\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u0127\3\2\2\2\u0759\u0757"+
		"\3\2\2\2\u075a\u075b\7\u011c\2\2\u075b\u075c\7\31\2\2\u075c\u075d\5\u008c"+
		"G\2\u075d\u0129\3\2\2\2\u075e\u0765\7;\2\2\u075f\u0762\5\u00f6|\2\u0760"+
		"\u0761\7j\2\2\u0761\u0763\7\u0113\2\2\u0762\u0760\3\2\2\2\u0762\u0763"+
		"\3\2\2\2\u0763\u0766\3\2\2\2\u0764\u0766\5\u012c\u0097\2\u0765\u075f\3"+
		"\2\2\2\u0765\u0764\3\2\2\2\u0766\u012b\3\2\2\2\u0767\u0768\7@\2\2\u0768"+
		"\u076a\5\u00c4c\2\u0769\u0767\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076d"+
		"\3\2\2\2\u076b\u076e\7B\2\2\u076c\u076e\5|?\2\u076d\u076b\3\2\2\2\u076d"+
		"\u076c\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0770\7^\2\2\u0770\u0771\7?\2"+
		"\2\u0771\u0772\5z>\2\u0772\u0773\5\u00f2z\2\u0773\u012d\3\2\2\2\u0774"+
		"\u0775\5\u0130\u0099\2\u0775\u0776\7\31\2\2\u0776\u0777\5\u008cG\2\u0777"+
		"\u012f\3\2\2\2\u0778\u0779\7\u011c\2\2\u0779\u0131\3\2\2\2\u077a\u077c"+
		"\7\u00fd\2\2\u077b\u077d\7>\2\2\u077c\u077b\3\2\2\2\u077c\u077d\3\2\2"+
		"\2\u077d\u077e\3\2\2\2\u077e\u077f\5n8\2\u077f\u0780\7f\2\2\u0780\u0781"+
		"\5n8\2\u0781\u0133\3\2\2\2\u0782\u0783\7\u00fd\2\2\u0783\u0784\7@\2\2"+
		"\u0784\u0785\5\u00c4c\2\u0785\u0786\7f\2\2\u0786\u0787\5\u00c4c\2\u0787"+
		"\u0135\3\2\2\2\u0788\u0789\7\u00fd\2\2\u0789\u078a\7f\2\2\u078a\u078b"+
		"\5b\62\2\u078b\u0137\3\2\2\2\u078c\u078d\7b\2\2\u078d\u078f\7n\2\2\u078e"+
		"\u078c\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0139\3\2\2\2\u0790\u0795\5z"+
		">\2\u0791\u0792\7&\2\2\u0792\u0794\5z>\2\u0793\u0791\3\2\2\2\u0794\u0797"+
		"\3\2\2\2\u0795\u0793\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u013b\3\2\2\2\u0797"+
		"\u0795\3\2\2\2\u0798\u079c\7<\2\2\u0799\u079a\7\u0106\2\2\u079a\u079b"+
		"\7\u00c5\2\2\u079b\u079d\7`\2\2\u079c\u0799\3\2\2\2\u079c\u079d\3\2\2"+
		"\2\u079d\u079e\3\2\2\2\u079e\u079f\7\u00c1\2\2\u079f\u013d\3\2\2\2\u07a0"+
		"\u07a4\7|\2\2\u07a1\u07a2\7\u00c0\2\2\u07a2\u07a4\7\u00c1\2\2\u07a3\u07a0"+
		"\3\2\2\2\u07a3\u07a1\3\2\2\2\u07a4\u013f\3\2\2\2\u07a5\u07a6\7}\2\2\u07a6"+
		"\u0141\3\2\2\2\u07a7\u07a8\7~\2\2\u07a8\u0143\3\2\2\2\u07a9\u07aa\7\177"+
		"\2\2\u07aa\u0145\3\2\2\2\u07ab\u07ae\79\2\2\u07ac\u07af\5\u014a\u00a6"+
		"\2\u07ad\u07af\5\u014c\u00a7\2\u07ae\u07ac\3\2\2\2\u07ae\u07ad\3\2\2\2"+
		"\u07af\u0147\3\2\2\2\u07b0\u07b2\7:\2\2\u07b1\u07b3\5\u014e\u00a8\2\u07b2"+
		"\u07b1\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b6\3\2\2\2\u07b4\u07b7\5\u014a"+
		"\u00a6\2\u07b5\u07b7\5\u014c\u00a7\2\u07b6\u07b4\3\2\2\2\u07b6\u07b5\3"+
		"\2\2\2\u07b7\u0149\3\2\2\2\u07b8\u07b9\5\u0150\u00a9\2\u07b9\u07ba\7a"+
		"\2\2\u07ba\u07bb\5\u0154\u00ab\2\u07bb\u014b\3\2\2\2\u07bc\u07bd\5\u00c6"+
		"d\2\u07bd\u014d\3\2\2\2\u07be\u07bf\t!\2\2\u07bf\u07c0\7\u00ba\2\2\u07c0"+
		"\u07c1\7e\2\2\u07c1\u014f\3\2\2\2\u07c2\u07c4\5\u0152\u00aa\2\u07c3\u07c5"+
		"\5v<\2\u07c4\u07c3\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07cd\3\2\2\2\u07c6"+
		"\u07c7\7&\2\2\u07c7\u07c9\5\u0152\u00aa\2\u07c8\u07ca\5v<\2\u07c9\u07c8"+
		"\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07cc\3\2\2\2\u07cb\u07c6\3\2\2\2\u07cc"+
		"\u07cf\3\2\2\2\u07cd\u07cb\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce\u0151\3\2"+
		"\2\2\u07cf\u07cd\3\2\2\2\u07d0\u07e2\7\60\2\2\u07d1\u07e2\7\61\2\2\u07d2"+
		"\u07e2\7\62\2\2\u07d3\u07e2\7\63\2\2\u07d4\u07e2\7\67\2\2\u07d5\u07e2"+
		"\7\u00bd\2\2\u07d6\u07e2\7H\2\2\u07d7\u07e2\7\64\2\2\u07d8\u07e2\7\u00ca"+
		"\2\2\u07d9\u07e2\7\u010e\2\2\u07da\u07e2\7\u010d\2\2\u07db\u07e2\7\u00d6"+
		"\2\2\u07dc\u07e2\7\u0112\2\2\u07dd\u07df\7q\2\2\u07de\u07e0\7\u00bb\2"+
		"\2\u07df\u07de\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e2\3\2\2\2\u07e1\u07d0"+
		"\3\2\2\2\u07e1\u07d1\3\2\2\2\u07e1\u07d2\3\2\2\2\u07e1\u07d3\3\2\2\2\u07e1"+
		"\u07d4\3\2\2\2\u07e1\u07d5\3\2\2\2\u07e1\u07d6\3\2\2\2\u07e1\u07d7\3\2"+
		"\2\2\u07e1\u07d8\3\2\2\2\u07e1\u07d9\3\2\2\2\u07e1\u07da\3\2\2\2\u07e1"+
		"\u07db\3\2\2\2\u07e1\u07dc\3\2\2\2\u07e1\u07dd\3\2\2\2\u07e2\u0153\3\2"+
		"\2\2\u07e3\u07f6\7\u00cf\2\2\u07e4\u07f6\78\2\2\u07e5\u07f6\7\u00d4\2"+
		"\2\u07e6\u07f6\7C\2\2\u07e7\u07f6\7G\2\2\u07e8\u07f6\7I\2\2\u07e9\u07f6"+
		"\7\u0102\2\2\u07ea\u07f6\7q\2\2\u07eb\u07f6\7\u00e9\2\2\u07ec\u07ed\7"+
		"\u00ea\2\2\u07ed\u07f6\7\u00f3\2\2\u07ee\u07f6\7\u010c\2\2\u07ef\u07f6"+
		"\7\u010f\2\2\u07f0\u07f6\7\u0105\2\2\u07f1\u07f3\7=\2\2\u07f2\u07f1\3"+
		"\2\2\2\u07f2\u07f3\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f6\5t;\2\u07f5"+
		"\u07e3\3\2\2\2\u07f5\u07e4\3\2\2\2\u07f5\u07e5\3\2\2\2\u07f5\u07e6\3\2"+
		"\2\2\u07f5\u07e7\3\2\2\2\u07f5\u07e8\3\2\2\2\u07f5\u07e9\3\2\2\2\u07f5"+
		"\u07ea\3\2\2\2\u07f5\u07eb\3\2\2\2\u07f5\u07ec\3\2\2\2\u07f5\u07ee\3\2"+
		"\2\2\u07f5\u07ef\3\2\2\2\u07f5\u07f0\3\2\2\2\u07f5\u07f2\3\2\2\2\u07f6"+
		"\u0155\3\2\2\2\u07f7\u07f8\7\64\2\2\u07f8\u07f9\7\u00c2\2\2\u07f9\u0157"+
		"\3\2\2\2\u07fa\u07fb\7\66\2\2\u07fb\u07fc\7\u00c2\2\2\u07fc\u0159\3\2"+
		"\2\2\u07fd\u07fe\7\65\2\2\u07fe\u07ff\7\u00c2\2\2\u07ff\u015b\3\2\2\2"+
		"\u0800\u0801\7\64\2\2\u0801\u0802\7\u00be\2\2\u0802\u015d\3\2\2\2\u0803"+
		"\u0804\7\66\2\2\u0804\u0805\7\u00be\2\2\u0805\u015f\3\2\2\2\u0806\u0807"+
		"\7\65\2\2\u0807\u0808\7\u00be\2\2\u0808\u0161\3\2\2\2\u0809\u080f\7\u0108"+
		"\2\2\u080a\u0810\7q\2\2\u080b\u080c\7\u00c1\2\2\u080c\u080d\7\u00b7\2"+
		"\2\u080d\u0810\7\u00b8\2\2\u080e\u0810\5b\62\2\u080f\u080a\3\2\2\2\u080f"+
		"\u080b\3\2\2\2\u080f\u080e\3\2\2\2\u0810\u0163\3\2\2\2\u0811\u0813\7<"+
		"\2\2\u0812\u0814\5\u0166\u00b4\2\u0813\u0812\3\2\2\2\u0813\u0814\3\2\2"+
		"\2\u0814\u0817\3\2\2\2\u0815\u0818\5\u0168\u00b5\2\u0816\u0818\5\u016a"+
		"\u00b6\2\u0817\u0815\3\2\2\2\u0817\u0816\3\2\2\2\u0818\u0165\3\2\2\2\u0819"+
		"\u081a\t\"\2\2\u081a\u0167\3\2\2\2\u081b\u081c\7\u0087\2\2\u081c\u0820"+
		"\7\u0117\2\2\u081d\u0821\5V,\2\u081e\u0821\7\u00a5\2\2\u081f\u0821\7\u0099"+
		"\2\2\u0820\u081d\3\2\2\2\u0820\u081e\3\2\2\2\u0820\u081f\3\2\2\2\u0821"+
		"\u0169\3\2\2\2\u0822\u0823\5b\62\2\u0823\u0827\t#\2\2\u0824\u0828\5b\62"+
		"\2\u0825\u0828\7\u011d\2\2\u0826\u0828\7\u0099\2\2\u0827\u0824\3\2\2\2"+
		"\u0827\u0825\3\2\2\2\u0827\u0826\3\2\2\2\u0828\u016b\3\2\2\2\u0829\u082c"+
		"\7\u00ff\2\2\u082a\u082d\7q\2\2\u082b\u082d\5b\62\2\u082c\u082a\3\2\2"+
		"\2\u082c\u082b\3\2\2\2\u082d\u016d\3\2\2\2\u082e\u082f\7\u009d\2\2\u082f"+
		"\u016f\3\2\2\2\u00f8\u018c\u018f\u0195\u0198\u019c\u019f\u01a7\u01ab\u01b1"+
		"\u01b6\u01c4\u01cd\u01d4\u01d8\u01dc\u01e0\u01e3\u01ea\u01ed\u01f8\u01fc"+
		"\u0201\u0205\u020d\u0212\u0217\u021b\u021e\u0221\u0224\u0227\u022a\u0230"+
		"\u0236\u023b\u023e\u0241\u0244\u0248\u0257\u025f\u0265\u0268\u026c\u026f"+
		"\u0273\u0279\u027c\u027f\u0285\u0288\u028c\u0291\u0293\u0299\u02a5\u02ad"+
		"\u02b1\u02b3\u02b8\u02bc\u02c1\u02c5\u02cb\u02ce\u02d2\u02da\u02dd\u02e1"+
		"\u02e4\u02e7\u02eb\u02fa\u02fe\u0301\u0310\u0317\u0320\u0327\u032b\u0333"+
		"\u033a\u033f\u034c\u0354\u0361\u0370\u0372\u0379\u0380\u0389\u0390\u0399"+
		"\u039f\u03a2\u03c5\u03c7\u03d2\u03da\u03e0\u03e9\u03f2\u03f4\u03f6\u03fc"+
		"\u0401\u0408\u040c\u0410\u0423\u042a\u042f\u0432\u0435\u043e\u0444\u0452"+
		"\u045e\u046e\u0473\u047e\u0482\u048c\u0490\u0495\u0498\u04a9\u04af\u04b2"+
		"\u04b6\u04b9\u04bc\u04c5\u04ca\u04cd\u04cf\u04d3\u04d9\u04e0\u04e6\u04ea"+
		"\u04ef\u04f6\u0508\u0528\u052e\u0532\u0537\u053f\u0542\u054d\u0550\u0555"+
		"\u055a\u055e\u0567\u0571\u0579\u0583\u058b\u0592\u0595\u059b\u059f\u05a4"+
		"\u05a8\u05ad\u05bf\u05c5\u05ca\u05d2\u05d5\u05d8\u05dc\u05e2\u05f3\u05fb"+
		"\u0603\u060a\u060d\u0611\u0614\u0617\u061c\u061f\u0623\u0626\u062c\u0631"+
		"\u0648\u064f\u0654\u065b\u066f\u0676\u0686\u0689\u06a3\u06af\u06c2\u06cc"+
		"\u06ce\u06d2\u06d7\u06dd\u06e2\u06e6\u06eb\u06f0\u06f4\u070a\u0712\u0719"+
		"\u0737\u073b\u0744\u0747\u074b\u074e\u0750\u0757\u0762\u0765\u0769\u076d"+
		"\u077c\u078e\u0795\u079c\u07a3\u07ae\u07b2\u07b6\u07c4\u07c9\u07cd\u07df"+
		"\u07e1\u07f2\u07f5\u080f\u0813\u0817\u0820\u0827\u082c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}