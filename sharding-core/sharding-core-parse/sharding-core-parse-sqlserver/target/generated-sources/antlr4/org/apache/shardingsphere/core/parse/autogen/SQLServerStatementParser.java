// Generated from org\apache\shardingsphere\core\parse\autogen\SQLServerStatement.g4 by ANTLR 4.7.1
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
public class SQLServerStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AND_=2, OR_=3, NOT_=4, TILDE_=5, VERTICAL_BAR_=6, AMPERSAND_=7, 
		SIGNED_LEFT_SHIFT_=8, SIGNED_RIGHT_SHIFT_=9, CARET_=10, MOD_=11, COLON_=12, 
		PLUS_=13, MINUS_=14, ASTERISK_=15, SLASH_=16, BACKSLASH_=17, DOT_=18, 
		DOT_ASTERISK_=19, SAFE_EQ_=20, DEQ_=21, EQ_=22, NEQ_=23, GT_=24, GTE_=25, 
		LT_=26, LTE_=27, POUND_=28, LP_=29, RP_=30, LBE_=31, RBE_=32, LBT_=33, 
		RBT_=34, COMMA_=35, DQ_=36, SQ_=37, BQ_=38, QUESTION_=39, AT_=40, SEMI_=41, 
		BLOCK_COMMENT=42, INLINE_COMMENT=43, WS=44, SELECT=45, INSERT=46, UPDATE=47, 
		DELETE=48, CREATE=49, ALTER=50, DROP=51, TRUNCATE=52, SCHEMA=53, GRANT=54, 
		REVOKE=55, ADD=56, SET=57, TABLE=58, COLUMN=59, INDEX=60, CONSTRAINT=61, 
		PRIMARY=62, UNIQUE=63, FOREIGN=64, KEY=65, POSITION=66, PRECISION=67, 
		FUNCTION=68, TRIGGER=69, PROCEDURE=70, VIEW=71, INTO=72, VALUES=73, WITH=74, 
		UNION=75, DISTINCT=76, CASE=77, WHEN=78, CAST=79, TRIM=80, SUBSTRING=81, 
		FROM=82, NATURAL=83, JOIN=84, FULL=85, INNER=86, OUTER=87, LEFT=88, RIGHT=89, 
		CROSS=90, USING=91, WHERE=92, AS=93, ON=94, IF=95, ELSE=96, THEN=97, FOR=98, 
		TO=99, AND=100, OR=101, IS=102, NOT=103, NULL=104, TRUE=105, FALSE=106, 
		EXISTS=107, BETWEEN=108, IN=109, ALL=110, ANY=111, LIKE=112, ORDER=113, 
		GROUP=114, BY=115, ASC=116, DESC=117, HAVING=118, LIMIT=119, OFFSET=120, 
		BEGIN=121, COMMIT=122, ROLLBACK=123, SAVEPOINT=124, BOOLEAN=125, DOUBLE=126, 
		CHAR=127, CHARACTER=128, ARRAY=129, INTERVAL=130, DATE=131, TIME=132, 
		TIMESTAMP=133, LOCALTIME=134, LOCALTIMESTAMP=135, YEAR=136, QUARTER=137, 
		MONTH=138, WEEK=139, DAY=140, HOUR=141, MINUTE=142, SECOND=143, MICROSECOND=144, 
		MAX=145, MIN=146, SUM=147, COUNT=148, AVG=149, DEFAULT=150, CURRENT=151, 
		ENABLE=152, DISABLE=153, CALL=154, INSTANCE=155, PRESERVE=156, DO=157, 
		DEFINER=158, CURRENT_USER=159, SQL=160, CASCADED=161, LOCAL=162, CLOSE=163, 
		OPEN=164, NEXT=165, NAME=166, FOR_GENERATOR=167, BINARY=168, ESCAPE=169, 
		HIDDEN_=170, MOD=171, PARTITION=172, PARTITIONS=173, TOP=174, ROW=175, 
		ROWS=176, UNKNOWN=177, XOR=178, ALWAYS=179, CASCADE=180, CHECK=181, GENERATED=182, 
		NO=183, OPTION=184, PRIVILEGES=185, REFERENCES=186, USER=187, ROLE=188, 
		START=189, TRANSACTION=190, ACTION=191, ALGORITHM=192, AUTO=193, BLOCKERS=194, 
		CLUSTERED=195, NONCLUSTERED=196, COLLATE=197, COLUMNSTORE=198, CONTENT=199, 
		CONVERT=200, DATABASE=201, YEARS=202, MONTHS=203, WEEKS=204, DAYS=205, 
		MINUTES=206, DENY=207, DETERMINISTIC=208, DISTRIBUTION=209, DOCUMENT=210, 
		DURABILITY=211, ENCRYPTED=212, END=213, FILESTREAM=214, FILETABLE=215, 
		FILLFACTOR=216, FOLLOWING=217, HASH=218, HEAP=219, IDENTITY=220, INBOUND=221, 
		OUTBOUND=222, UNBOUNDED=223, INFINITE=224, LOGIN=225, MASKED=226, MAXDOP=227, 
		MOVE=228, NOCHECK=229, NONE=230, OBJECT=231, OFF=232, ONLINE=233, OVER=234, 
		PAGE=235, PAUSED=236, PERIOD=237, PERSISTED=238, PRECEDING=239, RANDOMIZED=240, 
		RANGE=241, REBUILD=242, REPLICATE=243, REPLICATION=244, RESUMABLE=245, 
		ROWGUIDCOL=246, SAVE=247, SELF=248, SPARSE=249, SWITCH=250, TRAN=251, 
		TRANCOUNT=252, ZONE=253, EXECUTE=254, SESSION=255, CONNECT=256, CONNECTION=257, 
		CATALOG=258, CONTROL=259, TAKE=260, OWNERSHIP=261, DEFINITION=262, APPLICATION=263, 
		ASSEMBLY=264, SYMMETRIC=265, ASYMMETRIC=266, SERVER=267, RECEIVE=268, 
		CHANGE=269, TRACE=270, TRACKING=271, RESOURCES=272, SETTINGS=273, STATE=274, 
		AVAILABILITY=275, CREDENTIAL=276, ENDPOINT=277, EVENT=278, NOTIFICATION=279, 
		LINKED=280, AUDIT=281, DDL=282, XML=283, IMPERSONATE=284, SECURABLES=285, 
		AUTHENTICATE=286, EXTERNAL=287, ACCESS=288, ADMINISTER=289, BULK=290, 
		OPERATIONS=291, UNSAFE=292, SHUTDOWN=293, SCOPED=294, CONFIGURATION=295, 
		DATASPACE=296, SERVICE=297, CERTIFICATE=298, CONTRACT=299, ENCRYPTION=300, 
		MASTER=301, DATA=302, SOURCE=303, FILE=304, FORMAT=305, LIBRARY=306, FULLTEXT=307, 
		MASK=308, UNMASK=309, MESSAGE=310, TYPE=311, REMOTE=312, BINDING=313, 
		ROUTE=314, SECURITY=315, POLICY=316, AGGREGATE=317, QUEUE=318, RULE=319, 
		SYNONYM=320, COLLECTION=321, SCRIPT=322, KILL=323, BACKUP=324, LOG=325, 
		SHOWPLAN=326, SUBSCRIBE=327, QUERY=328, NOTIFICATIONS=329, CHECKPOINT=330, 
		SEQUENCE=331, ABORT_AFTER_WAIT=332, ALLOW_PAGE_LOCKS=333, ALLOW_ROW_LOCKS=334, 
		ALL_SPARSE_COLUMNS=335, BUCKET_COUNT=336, COLUMNSTORE_ARCHIVE=337, COLUMN_ENCRYPTION_KEY=338, 
		COLUMN_SET=339, COMPRESSION_DELAY=340, DATABASE_DEAULT=341, DATA_COMPRESSION=342, 
		DATA_CONSISTENCY_CHECK=343, ENCRYPTION_TYPE=344, SYSTEM_TIME=345, SYSTEM_VERSIONING=346, 
		TEXTIMAGE_ON=347, WAIT_AT_LOW_PRIORITY=348, STATISTICS_INCREMENTAL=349, 
		STATISTICS_NORECOMPUTE=350, ROUND_ROBIN=351, SCHEMA_AND_DATA=352, SCHEMA_ONLY=353, 
		SORT_IN_TEMPDB=354, IGNORE_DUP_KEY=355, IMPLICIT_TRANSACTIONS=356, MAX_DURATION=357, 
		MEMORY_OPTIMIZED=358, MIGRATION_STATE=359, PAD_INDEX=360, REMOTE_DATA_ARCHIVE=361, 
		FILESTREAM_ON=362, FILETABLE_COLLATE_FILENAME=363, FILETABLE_DIRECTORY=364, 
		FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME=365, FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME=366, 
		FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME=367, FILTER_PREDICATE=368, HISTORY_RETENTION_PERIOD=369, 
		HISTORY_TABLE=370, LOCK_ESCALATION=371, DROP_EXISTING=372, ROW_NUMBER=373, 
		IDENTIFIER_=374, STRING_=375, NUMBER_=376, HEX_DIGIT_=377, BIT_NUM_=378;
	public static final int
		RULE_execute = 0, RULE_insert = 1, RULE_insertValuesClause = 2, RULE_insertSelectClause = 3, 
		RULE_update = 4, RULE_assignment = 5, RULE_setAssignmentsClause = 6, RULE_assignmentValues = 7, 
		RULE_assignmentValue = 8, RULE_delete = 9, RULE_singleTableClause_ = 10, 
		RULE_multipleTablesClause_ = 11, RULE_multipleTableNames_ = 12, RULE_select = 13, 
		RULE_unionClause_ = 14, RULE_selectClause = 15, RULE_duplicateSpecification = 16, 
		RULE_selectItems = 17, RULE_selectItem = 18, RULE_top = 19, RULE_alias = 20, 
		RULE_unqualifiedShorthand = 21, RULE_qualifiedShorthand = 22, RULE_fromClause = 23, 
		RULE_tableReferences = 24, RULE_tableReference = 25, RULE_tableFactor = 26, 
		RULE_joinedTable = 27, RULE_joinSpecification = 28, RULE_whereClause = 29, 
		RULE_groupByClause = 30, RULE_havingClause = 31, RULE_subquery = 32, RULE_parameterMarker = 33, 
		RULE_literals = 34, RULE_stringLiterals = 35, RULE_numberLiterals = 36, 
		RULE_dateTimeLiterals = 37, RULE_hexadecimalLiterals = 38, RULE_bitValueLiterals = 39, 
		RULE_booleanLiterals = 40, RULE_nullValueLiterals = 41, RULE_identifier_ = 42, 
		RULE_unreservedWord_ = 43, RULE_schemaName = 44, RULE_tableName = 45, 
		RULE_columnName = 46, RULE_owner = 47, RULE_name = 48, RULE_columnNames = 49, 
		RULE_tableNames = 50, RULE_indexName = 51, RULE_collationName = 52, RULE_dataTypeLength = 53, 
		RULE_primaryKey = 54, RULE_expr = 55, RULE_logicalOperator = 56, RULE_notOperator_ = 57, 
		RULE_booleanPrimary_ = 58, RULE_comparisonOperator = 59, RULE_predicate = 60, 
		RULE_bitExpr = 61, RULE_simpleExpr = 62, RULE_functionCall = 63, RULE_aggregationFunction = 64, 
		RULE_aggregationFunctionName_ = 65, RULE_distinct = 66, RULE_specialFunction_ = 67, 
		RULE_castFunction_ = 68, RULE_charFunction_ = 69, RULE_regularFunction_ = 70, 
		RULE_regularFunctionName_ = 71, RULE_caseExpression_ = 72, RULE_caseWhen_ = 73, 
		RULE_caseElse_ = 74, RULE_privateExprOfDb = 75, RULE_orderByClause = 76, 
		RULE_orderByItem = 77, RULE_dataType = 78, RULE_dataTypeName_ = 79, RULE_atTimeZoneExpr = 80, 
		RULE_castExpr = 81, RULE_convertExpr = 82, RULE_windowedFunction = 83, 
		RULE_overClause = 84, RULE_partitionByClause = 85, RULE_rowRangeClause = 86, 
		RULE_windowFrameExtent = 87, RULE_windowFrameBetween = 88, RULE_windowFrameBound = 89, 
		RULE_windowFramePreceding = 90, RULE_windowFrameFollowing = 91, RULE_columnNameWithSort = 92, 
		RULE_indexOption = 93, RULE_compressionOption = 94, RULE_eqTime = 95, 
		RULE_eqOnOffOption = 96, RULE_eqKey = 97, RULE_eqOnOff = 98, RULE_onPartitionClause = 99, 
		RULE_partitionExpressions = 100, RULE_partitionExpression = 101, RULE_numberRange = 102, 
		RULE_lowPriorityLockWait = 103, RULE_onLowPriorLockWait = 104, RULE_ignoredIdentifier_ = 105, 
		RULE_ignoredIdentifiers_ = 106, RULE_matchNone = 107, RULE_createTable = 108, 
		RULE_createIndex = 109, RULE_alterTable = 110, RULE_alterIndex = 111, 
		RULE_dropTable = 112, RULE_dropIndex = 113, RULE_truncateTable = 114, 
		RULE_fileTableClause_ = 115, RULE_createDefinitionClause_ = 116, RULE_createTableDefinitions_ = 117, 
		RULE_createTableDefinition_ = 118, RULE_columnDefinition = 119, RULE_columnDefinitionOption = 120, 
		RULE_encryptedOptions_ = 121, RULE_columnConstraint = 122, RULE_primaryKeyConstraint = 123, 
		RULE_diskTablePrimaryKeyConstraintOption = 124, RULE_clusterOption_ = 125, 
		RULE_primaryKeyWithClause = 126, RULE_primaryKeyOnClause = 127, RULE_onSchemaColumn = 128, 
		RULE_onFileGroup = 129, RULE_onString = 130, RULE_memoryTablePrimaryKeyConstraintOption = 131, 
		RULE_withBucket = 132, RULE_columnForeignKeyConstraint = 133, RULE_foreignKeyOnAction = 134, 
		RULE_foreignKeyOn = 135, RULE_checkConstraint = 136, RULE_columnIndex = 137, 
		RULE_withIndexOption_ = 138, RULE_indexOnClause = 139, RULE_onDefault = 140, 
		RULE_fileStreamOn_ = 141, RULE_columnConstraints = 142, RULE_computedColumnDefinition = 143, 
		RULE_columnSetDefinition = 144, RULE_tableConstraint = 145, RULE_tablePrimaryConstraint = 146, 
		RULE_primaryKeyUnique = 147, RULE_diskTablePrimaryConstraintOption = 148, 
		RULE_memoryTablePrimaryConstraintOption = 149, RULE_hashWithBucket = 150, 
		RULE_tableForeignKeyConstraint = 151, RULE_tableIndex = 152, RULE_indexNameOption_ = 153, 
		RULE_indexOptions_ = 154, RULE_periodClause = 155, RULE_partitionScheme_ = 156, 
		RULE_fileGroup_ = 157, RULE_tableOptions = 158, RULE_tableOption = 159, 
		RULE_tableStretchOptions = 160, RULE_tableStretchOption = 161, RULE_migrationState_ = 162, 
		RULE_tableOperationOption = 163, RULE_distributionOption = 164, RULE_dataWareHouseTableOption = 165, 
		RULE_dataWareHousePartitionOption = 166, RULE_createIndexSpecification_ = 167, 
		RULE_alterDefinitionClause_ = 168, RULE_modifyColumnSpecification = 169, 
		RULE_alterColumnOperation = 170, RULE_addColumnSpecification = 171, RULE_alterColumnAddOptions = 172, 
		RULE_alterColumnAddOption = 173, RULE_constraintForColumn = 174, RULE_columnNameWithSortsWithParen = 175, 
		RULE_generatedColumnNamesClause = 176, RULE_generatedColumnNameClause = 177, 
		RULE_generatedColumnName = 178, RULE_alterDrop = 179, RULE_alterTableDropConstraint = 180, 
		RULE_dropConstraintName = 181, RULE_dropConstraintWithClause = 182, RULE_dropConstraintOption = 183, 
		RULE_onOffOption_ = 184, RULE_dropColumnSpecification = 185, RULE_dropIndexSpecification = 186, 
		RULE_alterCheckConstraint = 187, RULE_alterTrigger = 188, RULE_alterSwitch = 189, 
		RULE_alterSet = 190, RULE_setFileStreamClause = 191, RULE_setSystemVersionClause = 192, 
		RULE_alterSetOnClause = 193, RULE_dataConsistencyCheckClause_ = 194, RULE_historyRetentionPeriodClause_ = 195, 
		RULE_historyRetentionPeriod = 196, RULE_alterTableTableIndex = 197, RULE_indexWithName = 198, 
		RULE_indexNonClusterClause = 199, RULE_alterTableIndexOnClause = 200, 
		RULE_indexClusterClause = 201, RULE_alterTableOption = 202, RULE_onHistoryTableClause = 203, 
		RULE_ifExist_ = 204, RULE_setTransaction = 205, RULE_setImplicitTransactions = 206, 
		RULE_implicitTransactionsValue = 207, RULE_beginTransaction = 208, RULE_commit = 209, 
		RULE_rollback = 210, RULE_savepoint = 211, RULE_grant = 212, RULE_revoke = 213, 
		RULE_deny = 214, RULE_classPrivilegesClause_ = 215, RULE_classTypePrivilegesClause_ = 216, 
		RULE_optionForClause_ = 217, RULE_classPrivileges_ = 218, RULE_onClassClause_ = 219, 
		RULE_classTypePrivileges_ = 220, RULE_onClassTypeClause_ = 221, RULE_privilegeType_ = 222, 
		RULE_basicPermission_ = 223, RULE_objectPermission_ = 224, RULE_serverPermission_ = 225, 
		RULE_serverPrincipalPermission_ = 226, RULE_databasePermission_ = 227, 
		RULE_databasePrincipalPermission_ = 228, RULE_schemaPermission_ = 229, 
		RULE_serviceBrokerPermission_ = 230, RULE_endpointPermission_ = 231, RULE_certificatePermission_ = 232, 
		RULE_symmetricKeyPermission_ = 233, RULE_asymmetricKeyPermission_ = 234, 
		RULE_assemblyPermission_ = 235, RULE_availabilityGroupPermission_ = 236, 
		RULE_fullTextPermission_ = 237, RULE_class_ = 238, RULE_classType_ = 239, 
		RULE_roleClause_ = 240, RULE_createUser = 241, RULE_dropUser = 242, RULE_alterUser = 243, 
		RULE_createRole = 244, RULE_dropRole = 245, RULE_alterRole = 246, RULE_createLogin = 247, 
		RULE_dropLogin = 248, RULE_alterLogin = 249, RULE_call = 250;
	public static final String[] ruleNames = {
		"execute", "insert", "insertValuesClause", "insertSelectClause", "update", 
		"assignment", "setAssignmentsClause", "assignmentValues", "assignmentValue", 
		"delete", "singleTableClause_", "multipleTablesClause_", "multipleTableNames_", 
		"select", "unionClause_", "selectClause", "duplicateSpecification", "selectItems", 
		"selectItem", "top", "alias", "unqualifiedShorthand", "qualifiedShorthand", 
		"fromClause", "tableReferences", "tableReference", "tableFactor", "joinedTable", 
		"joinSpecification", "whereClause", "groupByClause", "havingClause", "subquery", 
		"parameterMarker", "literals", "stringLiterals", "numberLiterals", "dateTimeLiterals", 
		"hexadecimalLiterals", "bitValueLiterals", "booleanLiterals", "nullValueLiterals", 
		"identifier_", "unreservedWord_", "schemaName", "tableName", "columnName", 
		"owner", "name", "columnNames", "tableNames", "indexName", "collationName", 
		"dataTypeLength", "primaryKey", "expr", "logicalOperator", "notOperator_", 
		"booleanPrimary_", "comparisonOperator", "predicate", "bitExpr", "simpleExpr", 
		"functionCall", "aggregationFunction", "aggregationFunctionName_", "distinct", 
		"specialFunction_", "castFunction_", "charFunction_", "regularFunction_", 
		"regularFunctionName_", "caseExpression_", "caseWhen_", "caseElse_", "privateExprOfDb", 
		"orderByClause", "orderByItem", "dataType", "dataTypeName_", "atTimeZoneExpr", 
		"castExpr", "convertExpr", "windowedFunction", "overClause", "partitionByClause", 
		"rowRangeClause", "windowFrameExtent", "windowFrameBetween", "windowFrameBound", 
		"windowFramePreceding", "windowFrameFollowing", "columnNameWithSort", 
		"indexOption", "compressionOption", "eqTime", "eqOnOffOption", "eqKey", 
		"eqOnOff", "onPartitionClause", "partitionExpressions", "partitionExpression", 
		"numberRange", "lowPriorityLockWait", "onLowPriorLockWait", "ignoredIdentifier_", 
		"ignoredIdentifiers_", "matchNone", "createTable", "createIndex", "alterTable", 
		"alterIndex", "dropTable", "dropIndex", "truncateTable", "fileTableClause_", 
		"createDefinitionClause_", "createTableDefinitions_", "createTableDefinition_", 
		"columnDefinition", "columnDefinitionOption", "encryptedOptions_", "columnConstraint", 
		"primaryKeyConstraint", "diskTablePrimaryKeyConstraintOption", "clusterOption_", 
		"primaryKeyWithClause", "primaryKeyOnClause", "onSchemaColumn", "onFileGroup", 
		"onString", "memoryTablePrimaryKeyConstraintOption", "withBucket", "columnForeignKeyConstraint", 
		"foreignKeyOnAction", "foreignKeyOn", "checkConstraint", "columnIndex", 
		"withIndexOption_", "indexOnClause", "onDefault", "fileStreamOn_", "columnConstraints", 
		"computedColumnDefinition", "columnSetDefinition", "tableConstraint", 
		"tablePrimaryConstraint", "primaryKeyUnique", "diskTablePrimaryConstraintOption", 
		"memoryTablePrimaryConstraintOption", "hashWithBucket", "tableForeignKeyConstraint", 
		"tableIndex", "indexNameOption_", "indexOptions_", "periodClause", "partitionScheme_", 
		"fileGroup_", "tableOptions", "tableOption", "tableStretchOptions", "tableStretchOption", 
		"migrationState_", "tableOperationOption", "distributionOption", "dataWareHouseTableOption", 
		"dataWareHousePartitionOption", "createIndexSpecification_", "alterDefinitionClause_", 
		"modifyColumnSpecification", "alterColumnOperation", "addColumnSpecification", 
		"alterColumnAddOptions", "alterColumnAddOption", "constraintForColumn", 
		"columnNameWithSortsWithParen", "generatedColumnNamesClause", "generatedColumnNameClause", 
		"generatedColumnName", "alterDrop", "alterTableDropConstraint", "dropConstraintName", 
		"dropConstraintWithClause", "dropConstraintOption", "onOffOption_", "dropColumnSpecification", 
		"dropIndexSpecification", "alterCheckConstraint", "alterTrigger", "alterSwitch", 
		"alterSet", "setFileStreamClause", "setSystemVersionClause", "alterSetOnClause", 
		"dataConsistencyCheckClause_", "historyRetentionPeriodClause_", "historyRetentionPeriod", 
		"alterTableTableIndex", "indexWithName", "indexNonClusterClause", "alterTableIndexOnClause", 
		"indexClusterClause", "alterTableOption", "onHistoryTableClause", "ifExist_", 
		"setTransaction", "setImplicitTransactions", "implicitTransactionsValue", 
		"beginTransaction", "commit", "rollback", "savepoint", "grant", "revoke", 
		"deny", "classPrivilegesClause_", "classTypePrivilegesClause_", "optionForClause_", 
		"classPrivileges_", "onClassClause_", "classTypePrivileges_", "onClassTypeClause_", 
		"privilegeType_", "basicPermission_", "objectPermission_", "serverPermission_", 
		"serverPrincipalPermission_", "databasePermission_", "databasePrincipalPermission_", 
		"schemaPermission_", "serviceBrokerPermission_", "endpointPermission_", 
		"certificatePermission_", "symmetricKeyPermission_", "asymmetricKeyPermission_", 
		"assemblyPermission_", "availabilityGroupPermission_", "fullTextPermission_", 
		"class_", "classType_", "roleClause_", "createUser", "dropUser", "alterUser", 
		"createRole", "dropRole", "alterRole", "createLogin", "dropLogin", "alterLogin", 
		"call"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Default does not match anything'", "'&&'", "'||'", "'!'", "'~'", 
		"'|'", "'&'", "'<<'", "'>>'", "'^'", "'%'", "':'", "'+'", "'-'", "'*'", 
		"'/'", "'\\'", "'.'", "'.*'", "'<=>'", "'=='", "'='", null, "'>'", "'>='", 
		"'<'", "'<='", "'#'", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", 
		"'\"'", "'''", "'`'", "'?'", "'@'", "';'", null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "AND_", "OR_", "NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", 
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
		"CLOSE", "OPEN", "NEXT", "NAME", "FOR_GENERATOR", "BINARY", "ESCAPE", 
		"HIDDEN_", "MOD", "PARTITION", "PARTITIONS", "TOP", "ROW", "ROWS", "UNKNOWN", 
		"XOR", "ALWAYS", "CASCADE", "CHECK", "GENERATED", "NO", "OPTION", "PRIVILEGES", 
		"REFERENCES", "USER", "ROLE", "START", "TRANSACTION", "ACTION", "ALGORITHM", 
		"AUTO", "BLOCKERS", "CLUSTERED", "NONCLUSTERED", "COLLATE", "COLUMNSTORE", 
		"CONTENT", "CONVERT", "DATABASE", "YEARS", "MONTHS", "WEEKS", "DAYS", 
		"MINUTES", "DENY", "DETERMINISTIC", "DISTRIBUTION", "DOCUMENT", "DURABILITY", 
		"ENCRYPTED", "END", "FILESTREAM", "FILETABLE", "FILLFACTOR", "FOLLOWING", 
		"HASH", "HEAP", "IDENTITY", "INBOUND", "OUTBOUND", "UNBOUNDED", "INFINITE", 
		"LOGIN", "MASKED", "MAXDOP", "MOVE", "NOCHECK", "NONE", "OBJECT", "OFF", 
		"ONLINE", "OVER", "PAGE", "PAUSED", "PERIOD", "PERSISTED", "PRECEDING", 
		"RANDOMIZED", "RANGE", "REBUILD", "REPLICATE", "REPLICATION", "RESUMABLE", 
		"ROWGUIDCOL", "SAVE", "SELF", "SPARSE", "SWITCH", "TRAN", "TRANCOUNT", 
		"ZONE", "EXECUTE", "SESSION", "CONNECT", "CONNECTION", "CATALOG", "CONTROL", 
		"TAKE", "OWNERSHIP", "DEFINITION", "APPLICATION", "ASSEMBLY", "SYMMETRIC", 
		"ASYMMETRIC", "SERVER", "RECEIVE", "CHANGE", "TRACE", "TRACKING", "RESOURCES", 
		"SETTINGS", "STATE", "AVAILABILITY", "CREDENTIAL", "ENDPOINT", "EVENT", 
		"NOTIFICATION", "LINKED", "AUDIT", "DDL", "XML", "IMPERSONATE", "SECURABLES", 
		"AUTHENTICATE", "EXTERNAL", "ACCESS", "ADMINISTER", "BULK", "OPERATIONS", 
		"UNSAFE", "SHUTDOWN", "SCOPED", "CONFIGURATION", "DATASPACE", "SERVICE", 
		"CERTIFICATE", "CONTRACT", "ENCRYPTION", "MASTER", "DATA", "SOURCE", "FILE", 
		"FORMAT", "LIBRARY", "FULLTEXT", "MASK", "UNMASK", "MESSAGE", "TYPE", 
		"REMOTE", "BINDING", "ROUTE", "SECURITY", "POLICY", "AGGREGATE", "QUEUE", 
		"RULE", "SYNONYM", "COLLECTION", "SCRIPT", "KILL", "BACKUP", "LOG", "SHOWPLAN", 
		"SUBSCRIBE", "QUERY", "NOTIFICATIONS", "CHECKPOINT", "SEQUENCE", "ABORT_AFTER_WAIT", 
		"ALLOW_PAGE_LOCKS", "ALLOW_ROW_LOCKS", "ALL_SPARSE_COLUMNS", "BUCKET_COUNT", 
		"COLUMNSTORE_ARCHIVE", "COLUMN_ENCRYPTION_KEY", "COLUMN_SET", "COMPRESSION_DELAY", 
		"DATABASE_DEAULT", "DATA_COMPRESSION", "DATA_CONSISTENCY_CHECK", "ENCRYPTION_TYPE", 
		"SYSTEM_TIME", "SYSTEM_VERSIONING", "TEXTIMAGE_ON", "WAIT_AT_LOW_PRIORITY", 
		"STATISTICS_INCREMENTAL", "STATISTICS_NORECOMPUTE", "ROUND_ROBIN", "SCHEMA_AND_DATA", 
		"SCHEMA_ONLY", "SORT_IN_TEMPDB", "IGNORE_DUP_KEY", "IMPLICIT_TRANSACTIONS", 
		"MAX_DURATION", "MEMORY_OPTIMIZED", "MIGRATION_STATE", "PAD_INDEX", "REMOTE_DATA_ARCHIVE", 
		"FILESTREAM_ON", "FILETABLE_COLLATE_FILENAME", "FILETABLE_DIRECTORY", 
		"FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME", "FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME", 
		"FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME", "FILTER_PREDICATE", "HISTORY_RETENTION_PERIOD", 
		"HISTORY_TABLE", "LOCK_ESCALATION", "DROP_EXISTING", "ROW_NUMBER", "IDENTIFIER_", 
		"STRING_", "NUMBER_", "HEX_DIGIT_", "BIT_NUM_"
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
	public String getGrammarFileName() { return "SQLServerStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLServerStatementParser(TokenStream input) {
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
		public SetImplicitTransactionsContext setImplicitTransactions() {
			return getRuleContext(SetImplicitTransactionsContext.class,0);
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
		public DenyContext deny() {
			return getRuleContext(DenyContext.class,0);
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
		public CreateLoginContext createLogin() {
			return getRuleContext(CreateLoginContext.class,0);
		}
		public DropLoginContext dropLogin() {
			return getRuleContext(DropLoginContext.class,0);
		}
		public AlterLoginContext alterLogin() {
			return getRuleContext(AlterLoginContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(SQLServerStatementParser.SEMI_, 0); }
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
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(502);
				select();
				}
				break;
			case 2:
				{
				setState(503);
				insert();
				}
				break;
			case 3:
				{
				setState(504);
				update();
				}
				break;
			case 4:
				{
				setState(505);
				delete();
				}
				break;
			case 5:
				{
				setState(506);
				createIndex();
				}
				break;
			case 6:
				{
				setState(507);
				alterIndex();
				}
				break;
			case 7:
				{
				setState(508);
				dropIndex();
				}
				break;
			case 8:
				{
				setState(509);
				createTable();
				}
				break;
			case 9:
				{
				setState(510);
				alterTable();
				}
				break;
			case 10:
				{
				setState(511);
				dropTable();
				}
				break;
			case 11:
				{
				setState(512);
				truncateTable();
				}
				break;
			case 12:
				{
				setState(513);
				setTransaction();
				}
				break;
			case 13:
				{
				setState(514);
				beginTransaction();
				}
				break;
			case 14:
				{
				setState(515);
				setImplicitTransactions();
				}
				break;
			case 15:
				{
				setState(516);
				commit();
				}
				break;
			case 16:
				{
				setState(517);
				rollback();
				}
				break;
			case 17:
				{
				setState(518);
				savepoint();
				}
				break;
			case 18:
				{
				setState(519);
				grant();
				}
				break;
			case 19:
				{
				setState(520);
				revoke();
				}
				break;
			case 20:
				{
				setState(521);
				deny();
				}
				break;
			case 21:
				{
				setState(522);
				createUser();
				}
				break;
			case 22:
				{
				setState(523);
				dropUser();
				}
				break;
			case 23:
				{
				setState(524);
				alterUser();
				}
				break;
			case 24:
				{
				setState(525);
				createRole();
				}
				break;
			case 25:
				{
				setState(526);
				dropRole();
				}
				break;
			case 26:
				{
				setState(527);
				alterRole();
				}
				break;
			case 27:
				{
				setState(528);
				createLogin();
				}
				break;
			case 28:
				{
				setState(529);
				dropLogin();
				}
				break;
			case 29:
				{
				setState(530);
				alterLogin();
				}
				break;
			case 30:
				{
				setState(531);
				call();
				}
				break;
			}
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(534);
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
		public TerminalNode INSERT() { return getToken(SQLServerStatementParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SQLServerStatementParser.INTO, 0); }
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
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
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
			setState(537);
			match(INSERT);
			setState(538);
			match(INTO);
			setState(539);
			tableName();
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (FUNCTION - 52)) | (1L << (TRIGGER - 52)) | (1L << (AS - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (ARRAY - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (QUARTER - 119)) | (1L << (WEEK - 119)) | (1L << (MICROSECOND - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (INSTANCE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (BINARY - 119)) | (1L << (HIDDEN_ - 119)) | (1L << (MOD - 119)) | (1L << (PARTITION - 119)) | (1L << (PARTITIONS - 119)) | (1L << (TOP - 119)) | (1L << (ROW - 119)) | (1L << (XOR - 119)) | (1L << (ALWAYS - 119)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (ROLE - 188)) | (1L << (START - 188)) | (1L << (ALGORITHM - 188)) | (1L << (AUTO - 188)) | (1L << (BLOCKERS - 188)) | (1L << (CLUSTERED - 188)) | (1L << (NONCLUSTERED - 188)) | (1L << (COLUMNSTORE - 188)) | (1L << (CONTENT - 188)) | (1L << (DATABASE - 188)) | (1L << (YEARS - 188)) | (1L << (MONTHS - 188)) | (1L << (WEEKS - 188)) | (1L << (DAYS - 188)) | (1L << (MINUTES - 188)) | (1L << (DENY - 188)) | (1L << (DETERMINISTIC - 188)) | (1L << (DISTRIBUTION - 188)) | (1L << (DOCUMENT - 188)) | (1L << (DURABILITY - 188)) | (1L << (ENCRYPTED - 188)) | (1L << (FILESTREAM - 188)) | (1L << (FILETABLE - 188)) | (1L << (FILLFACTOR - 188)) | (1L << (FOLLOWING - 188)) | (1L << (HASH - 188)) | (1L << (HEAP - 188)) | (1L << (INBOUND - 188)) | (1L << (OUTBOUND - 188)) | (1L << (UNBOUNDED - 188)) | (1L << (INFINITE - 188)) | (1L << (LOGIN - 188)) | (1L << (MASKED - 188)) | (1L << (MAXDOP - 188)) | (1L << (MOVE - 188)) | (1L << (NOCHECK - 188)) | (1L << (OBJECT - 188)) | (1L << (OFF - 188)) | (1L << (ONLINE - 188)) | (1L << (OVER - 188)) | (1L << (PAGE - 188)) | (1L << (PAUSED - 188)) | (1L << (PERIOD - 188)) | (1L << (PERSISTED - 188)) | (1L << (PRECEDING - 188)) | (1L << (RANDOMIZED - 188)) | (1L << (RANGE - 188)) | (1L << (REBUILD - 188)) | (1L << (REPLICATE - 188)) | (1L << (REPLICATION - 188)) | (1L << (RESUMABLE - 188)) | (1L << (ROWGUIDCOL - 188)) | (1L << (SAVE - 188)) | (1L << (SELF - 188)) | (1L << (SPARSE - 188)) | (1L << (SWITCH - 188)) | (1L << (TRAN - 188)))) != 0) || ((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (TRANCOUNT - 252)) | (1L << (CONTROL - 252)) | (1L << (TAKE - 252)) | (1L << (OWNERSHIP - 252)) | (1L << (DEFINITION - 252)) | (1L << (APPLICATION - 252)) | (1L << (ASSEMBLY - 252)) | (1L << (SYMMETRIC - 252)) | (1L << (ASYMMETRIC - 252)) | (1L << (SERVER - 252)) | (1L << (RECEIVE - 252)) | (1L << (CHANGE - 252)) | (1L << (TRACE - 252)) | (1L << (TRACKING - 252)) | (1L << (RESOURCES - 252)) | (1L << (SETTINGS - 252)) | (1L << (STATE - 252)) | (1L << (AVAILABILITY - 252)) | (1L << (CREDENTIAL - 252)) | (1L << (ENDPOINT - 252)) | (1L << (EVENT - 252)) | (1L << (NOTIFICATION - 252)) | (1L << (LINKED - 252)) | (1L << (AUDIT - 252)) | (1L << (DDL - 252)) | (1L << (XML - 252)) | (1L << (IMPERSONATE - 252)) | (1L << (SECURABLES - 252)) | (1L << (AUTHENTICATE - 252)) | (1L << (EXTERNAL - 252)) | (1L << (ACCESS - 252)) | (1L << (ADMINISTER - 252)) | (1L << (BULK - 252)) | (1L << (OPERATIONS - 252)) | (1L << (UNSAFE - 252)) | (1L << (SHUTDOWN - 252)) | (1L << (SCOPED - 252)) | (1L << (CONFIGURATION - 252)) | (1L << (DATASPACE - 252)) | (1L << (SERVICE - 252)) | (1L << (CERTIFICATE - 252)) | (1L << (CONTRACT - 252)) | (1L << (ENCRYPTION - 252)) | (1L << (MASTER - 252)) | (1L << (DATA - 252)) | (1L << (SOURCE - 252)) | (1L << (FILE - 252)) | (1L << (FORMAT - 252)) | (1L << (LIBRARY - 252)) | (1L << (FULLTEXT - 252)) | (1L << (MASK - 252)) | (1L << (UNMASK - 252)) | (1L << (MESSAGE - 252)) | (1L << (TYPE - 252)) | (1L << (REMOTE - 252)) | (1L << (BINDING - 252)) | (1L << (ROUTE - 252)) | (1L << (SECURITY - 252)))) != 0) || ((((_la - 316)) & ~0x3f) == 0 && ((1L << (_la - 316)) & ((1L << (POLICY - 316)) | (1L << (AGGREGATE - 316)) | (1L << (QUEUE - 316)) | (1L << (RULE - 316)) | (1L << (SYNONYM - 316)) | (1L << (COLLECTION - 316)) | (1L << (SCRIPT - 316)) | (1L << (KILL - 316)) | (1L << (BACKUP - 316)) | (1L << (LOG - 316)) | (1L << (SHOWPLAN - 316)) | (1L << (SUBSCRIBE - 316)) | (1L << (QUERY - 316)) | (1L << (NOTIFICATIONS - 316)) | (1L << (CHECKPOINT - 316)) | (1L << (SEQUENCE - 316)) | (1L << (ABORT_AFTER_WAIT - 316)) | (1L << (ALLOW_PAGE_LOCKS - 316)) | (1L << (ALLOW_ROW_LOCKS - 316)) | (1L << (ALL_SPARSE_COLUMNS - 316)) | (1L << (BUCKET_COUNT - 316)) | (1L << (COLUMNSTORE_ARCHIVE - 316)) | (1L << (COLUMN_ENCRYPTION_KEY - 316)) | (1L << (COLUMN_SET - 316)) | (1L << (COMPRESSION_DELAY - 316)) | (1L << (DATABASE_DEAULT - 316)) | (1L << (DATA_COMPRESSION - 316)) | (1L << (DATA_CONSISTENCY_CHECK - 316)) | (1L << (ENCRYPTION_TYPE - 316)) | (1L << (SYSTEM_TIME - 316)) | (1L << (SYSTEM_VERSIONING - 316)) | (1L << (TEXTIMAGE_ON - 316)) | (1L << (WAIT_AT_LOW_PRIORITY - 316)) | (1L << (STATISTICS_INCREMENTAL - 316)) | (1L << (STATISTICS_NORECOMPUTE - 316)) | (1L << (ROUND_ROBIN - 316)) | (1L << (SCHEMA_AND_DATA - 316)) | (1L << (SCHEMA_ONLY - 316)) | (1L << (SORT_IN_TEMPDB - 316)) | (1L << (IGNORE_DUP_KEY - 316)) | (1L << (IMPLICIT_TRANSACTIONS - 316)) | (1L << (MAX_DURATION - 316)) | (1L << (MEMORY_OPTIMIZED - 316)) | (1L << (MIGRATION_STATE - 316)) | (1L << (PAD_INDEX - 316)) | (1L << (REMOTE_DATA_ARCHIVE - 316)) | (1L << (FILESTREAM_ON - 316)) | (1L << (FILETABLE_COLLATE_FILENAME - 316)) | (1L << (FILETABLE_DIRECTORY - 316)) | (1L << (FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME - 316)) | (1L << (FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME - 316)) | (1L << (FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME - 316)) | (1L << (FILTER_PREDICATE - 316)) | (1L << (HISTORY_RETENTION_PERIOD - 316)) | (1L << (HISTORY_TABLE - 316)) | (1L << (LOCK_ESCALATION - 316)) | (1L << (DROP_EXISTING - 316)) | (1L << (ROW_NUMBER - 316)) | (1L << (IDENTIFIER_ - 316)) | (1L << (STRING_ - 316)))) != 0)) {
				{
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(540);
					match(AS);
					}
				}

				setState(543);
				alias();
				}
			}

			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(546);
				insertValuesClause();
				}
				break;
			case 2:
				{
				setState(547);
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
		public TerminalNode VALUES() { return getToken(SQLServerStatementParser.VALUES, 0); }
		public List<AssignmentValuesContext> assignmentValues() {
			return getRuleContexts(AssignmentValuesContext.class);
		}
		public AssignmentValuesContext assignmentValues(int i) {
			return getRuleContext(AssignmentValuesContext.class,i);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
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
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(550);
				columnNames();
				}
			}

			setState(553);
			match(VALUES);
			setState(554);
			assignmentValues();
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(555);
				match(COMMA_);
				setState(556);
				assignmentValues();
				}
				}
				setState(561);
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
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(562);
				columnNames();
				}
			}

			setState(565);
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
		public TerminalNode UPDATE() { return getToken(SQLServerStatementParser.UPDATE, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
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
			setState(567);
			match(UPDATE);
			setState(568);
			tableReferences();
			setState(569);
			setAssignmentsClause();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(570);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
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
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			columnName();
			setState(574);
			match(EQ_);
			setState(575);
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
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public SetAssignmentsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAssignmentsClause; }
	}

	public final SetAssignmentsClauseContext setAssignmentsClause() throws RecognitionException {
		SetAssignmentsClauseContext _localctx = new SetAssignmentsClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_setAssignmentsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(SET);
			setState(578);
			assignment();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(579);
				match(COMMA_);
				setState(580);
				assignment();
				}
				}
				setState(585);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<AssignmentValueContext> assignmentValue() {
			return getRuleContexts(AssignmentValueContext.class);
		}
		public AssignmentValueContext assignmentValue(int i) {
			return getRuleContext(AssignmentValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AssignmentValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValues; }
	}

	public final AssignmentValuesContext assignmentValues() throws RecognitionException {
		AssignmentValuesContext _localctx = new AssignmentValuesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignmentValues);
		int _la;
		try {
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(LP_);
				setState(587);
				assignmentValue();
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(588);
					match(COMMA_);
					setState(589);
					assignmentValue();
					}
					}
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(595);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				match(LP_);
				setState(598);
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
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValue; }
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentValue);
		try {
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case CONVERT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case TYPE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				expr(0);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
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
		public TerminalNode DELETE() { return getToken(SQLServerStatementParser.DELETE, 0); }
		public SingleTableClause_Context singleTableClause_() {
			return getRuleContext(SingleTableClause_Context.class,0);
		}
		public MultipleTablesClause_Context multipleTablesClause_() {
			return getRuleContext(MultipleTablesClause_Context.class,0);
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
		enterRule(_localctx, 18, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(DELETE);
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(606);
				singleTableClause_();
				}
				break;
			case 2:
				{
				setState(607);
				multipleTablesClause_();
				}
				break;
			}
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(610);
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

	public static class SingleTableClause_Context extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLServerStatementParser.FROM, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public SingleTableClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableClause_; }
	}

	public final SingleTableClause_Context singleTableClause_() throws RecognitionException {
		SingleTableClause_Context _localctx = new SingleTableClause_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_singleTableClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(613);
				match(FROM);
				}
			}

			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(616);
				match(LP_);
				}
			}

			setState(619);
			tableName();
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(620);
				match(RP_);
				}
			}

			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (FUNCTION - 52)) | (1L << (TRIGGER - 52)) | (1L << (AS - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (ARRAY - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (QUARTER - 119)) | (1L << (WEEK - 119)) | (1L << (MICROSECOND - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (INSTANCE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (BINARY - 119)) | (1L << (HIDDEN_ - 119)) | (1L << (MOD - 119)) | (1L << (PARTITION - 119)) | (1L << (PARTITIONS - 119)) | (1L << (TOP - 119)) | (1L << (ROW - 119)) | (1L << (XOR - 119)) | (1L << (ALWAYS - 119)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (ROLE - 188)) | (1L << (START - 188)) | (1L << (ALGORITHM - 188)) | (1L << (AUTO - 188)) | (1L << (BLOCKERS - 188)) | (1L << (CLUSTERED - 188)) | (1L << (NONCLUSTERED - 188)) | (1L << (COLUMNSTORE - 188)) | (1L << (CONTENT - 188)) | (1L << (DATABASE - 188)) | (1L << (YEARS - 188)) | (1L << (MONTHS - 188)) | (1L << (WEEKS - 188)) | (1L << (DAYS - 188)) | (1L << (MINUTES - 188)) | (1L << (DENY - 188)) | (1L << (DETERMINISTIC - 188)) | (1L << (DISTRIBUTION - 188)) | (1L << (DOCUMENT - 188)) | (1L << (DURABILITY - 188)) | (1L << (ENCRYPTED - 188)) | (1L << (FILESTREAM - 188)) | (1L << (FILETABLE - 188)) | (1L << (FILLFACTOR - 188)) | (1L << (FOLLOWING - 188)) | (1L << (HASH - 188)) | (1L << (HEAP - 188)) | (1L << (INBOUND - 188)) | (1L << (OUTBOUND - 188)) | (1L << (UNBOUNDED - 188)) | (1L << (INFINITE - 188)) | (1L << (LOGIN - 188)) | (1L << (MASKED - 188)) | (1L << (MAXDOP - 188)) | (1L << (MOVE - 188)) | (1L << (NOCHECK - 188)) | (1L << (OBJECT - 188)) | (1L << (OFF - 188)) | (1L << (ONLINE - 188)) | (1L << (OVER - 188)) | (1L << (PAGE - 188)) | (1L << (PAUSED - 188)) | (1L << (PERIOD - 188)) | (1L << (PERSISTED - 188)) | (1L << (PRECEDING - 188)) | (1L << (RANDOMIZED - 188)) | (1L << (RANGE - 188)) | (1L << (REBUILD - 188)) | (1L << (REPLICATE - 188)) | (1L << (REPLICATION - 188)) | (1L << (RESUMABLE - 188)) | (1L << (ROWGUIDCOL - 188)) | (1L << (SAVE - 188)) | (1L << (SELF - 188)) | (1L << (SPARSE - 188)) | (1L << (SWITCH - 188)) | (1L << (TRAN - 188)))) != 0) || ((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (TRANCOUNT - 252)) | (1L << (CONTROL - 252)) | (1L << (TAKE - 252)) | (1L << (OWNERSHIP - 252)) | (1L << (DEFINITION - 252)) | (1L << (APPLICATION - 252)) | (1L << (ASSEMBLY - 252)) | (1L << (SYMMETRIC - 252)) | (1L << (ASYMMETRIC - 252)) | (1L << (SERVER - 252)) | (1L << (RECEIVE - 252)) | (1L << (CHANGE - 252)) | (1L << (TRACE - 252)) | (1L << (TRACKING - 252)) | (1L << (RESOURCES - 252)) | (1L << (SETTINGS - 252)) | (1L << (STATE - 252)) | (1L << (AVAILABILITY - 252)) | (1L << (CREDENTIAL - 252)) | (1L << (ENDPOINT - 252)) | (1L << (EVENT - 252)) | (1L << (NOTIFICATION - 252)) | (1L << (LINKED - 252)) | (1L << (AUDIT - 252)) | (1L << (DDL - 252)) | (1L << (XML - 252)) | (1L << (IMPERSONATE - 252)) | (1L << (SECURABLES - 252)) | (1L << (AUTHENTICATE - 252)) | (1L << (EXTERNAL - 252)) | (1L << (ACCESS - 252)) | (1L << (ADMINISTER - 252)) | (1L << (BULK - 252)) | (1L << (OPERATIONS - 252)) | (1L << (UNSAFE - 252)) | (1L << (SHUTDOWN - 252)) | (1L << (SCOPED - 252)) | (1L << (CONFIGURATION - 252)) | (1L << (DATASPACE - 252)) | (1L << (SERVICE - 252)) | (1L << (CERTIFICATE - 252)) | (1L << (CONTRACT - 252)) | (1L << (ENCRYPTION - 252)) | (1L << (MASTER - 252)) | (1L << (DATA - 252)) | (1L << (SOURCE - 252)) | (1L << (FILE - 252)) | (1L << (FORMAT - 252)) | (1L << (LIBRARY - 252)) | (1L << (FULLTEXT - 252)) | (1L << (MASK - 252)) | (1L << (UNMASK - 252)) | (1L << (MESSAGE - 252)) | (1L << (TYPE - 252)) | (1L << (REMOTE - 252)) | (1L << (BINDING - 252)) | (1L << (ROUTE - 252)) | (1L << (SECURITY - 252)))) != 0) || ((((_la - 316)) & ~0x3f) == 0 && ((1L << (_la - 316)) & ((1L << (POLICY - 316)) | (1L << (AGGREGATE - 316)) | (1L << (QUEUE - 316)) | (1L << (RULE - 316)) | (1L << (SYNONYM - 316)) | (1L << (COLLECTION - 316)) | (1L << (SCRIPT - 316)) | (1L << (KILL - 316)) | (1L << (BACKUP - 316)) | (1L << (LOG - 316)) | (1L << (SHOWPLAN - 316)) | (1L << (SUBSCRIBE - 316)) | (1L << (QUERY - 316)) | (1L << (NOTIFICATIONS - 316)) | (1L << (CHECKPOINT - 316)) | (1L << (SEQUENCE - 316)) | (1L << (ABORT_AFTER_WAIT - 316)) | (1L << (ALLOW_PAGE_LOCKS - 316)) | (1L << (ALLOW_ROW_LOCKS - 316)) | (1L << (ALL_SPARSE_COLUMNS - 316)) | (1L << (BUCKET_COUNT - 316)) | (1L << (COLUMNSTORE_ARCHIVE - 316)) | (1L << (COLUMN_ENCRYPTION_KEY - 316)) | (1L << (COLUMN_SET - 316)) | (1L << (COMPRESSION_DELAY - 316)) | (1L << (DATABASE_DEAULT - 316)) | (1L << (DATA_COMPRESSION - 316)) | (1L << (DATA_CONSISTENCY_CHECK - 316)) | (1L << (ENCRYPTION_TYPE - 316)) | (1L << (SYSTEM_TIME - 316)) | (1L << (SYSTEM_VERSIONING - 316)) | (1L << (TEXTIMAGE_ON - 316)) | (1L << (WAIT_AT_LOW_PRIORITY - 316)) | (1L << (STATISTICS_INCREMENTAL - 316)) | (1L << (STATISTICS_NORECOMPUTE - 316)) | (1L << (ROUND_ROBIN - 316)) | (1L << (SCHEMA_AND_DATA - 316)) | (1L << (SCHEMA_ONLY - 316)) | (1L << (SORT_IN_TEMPDB - 316)) | (1L << (IGNORE_DUP_KEY - 316)) | (1L << (IMPLICIT_TRANSACTIONS - 316)) | (1L << (MAX_DURATION - 316)) | (1L << (MEMORY_OPTIMIZED - 316)) | (1L << (MIGRATION_STATE - 316)) | (1L << (PAD_INDEX - 316)) | (1L << (REMOTE_DATA_ARCHIVE - 316)) | (1L << (FILESTREAM_ON - 316)) | (1L << (FILETABLE_COLLATE_FILENAME - 316)) | (1L << (FILETABLE_DIRECTORY - 316)) | (1L << (FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME - 316)) | (1L << (FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME - 316)) | (1L << (FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME - 316)) | (1L << (FILTER_PREDICATE - 316)) | (1L << (HISTORY_RETENTION_PERIOD - 316)) | (1L << (HISTORY_TABLE - 316)) | (1L << (LOCK_ESCALATION - 316)) | (1L << (DROP_EXISTING - 316)) | (1L << (ROW_NUMBER - 316)) | (1L << (IDENTIFIER_ - 316)) | (1L << (STRING_ - 316)))) != 0)) {
				{
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(623);
					match(AS);
					}
				}

				setState(626);
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
		public TerminalNode FROM() { return getToken(SQLServerStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQLServerStatementParser.USING, 0); }
		public MultipleTablesClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTablesClause_; }
	}

	public final MultipleTablesClause_Context multipleTablesClause_() throws RecognitionException {
		MultipleTablesClause_Context _localctx = new MultipleTablesClause_Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_multipleTablesClause_);
		try {
			setState(638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case ARRAY:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case TYPE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				multipleTableNames_();
				setState(630);
				match(FROM);
				setState(631);
				tableReferences();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(FROM);
				setState(634);
				multipleTableNames_();
				setState(635);
				match(USING);
				setState(636);
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
		public List<TerminalNode> DOT_ASTERISK_() { return getTokens(SQLServerStatementParser.DOT_ASTERISK_); }
		public TerminalNode DOT_ASTERISK_(int i) {
			return getToken(SQLServerStatementParser.DOT_ASTERISK_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public MultipleTableNames_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTableNames_; }
	}

	public final MultipleTableNames_Context multipleTableNames_() throws RecognitionException {
		MultipleTableNames_Context _localctx = new MultipleTableNames_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_multipleTableNames_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			tableName();
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_ASTERISK_) {
				{
				setState(641);
				match(DOT_ASTERISK_);
				}
			}

			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(644);
				match(COMMA_);
				setState(645);
				tableName();
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_ASTERISK_) {
					{
					setState(646);
					match(DOT_ASTERISK_);
					}
				}

				}
				}
				setState(653);
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
		enterRule(_localctx, 26, RULE_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
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
		public List<TerminalNode> UNION() { return getTokens(SQLServerStatementParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(SQLServerStatementParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(SQLServerStatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(SQLServerStatementParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(SQLServerStatementParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(SQLServerStatementParser.DISTINCT, i);
		}
		public UnionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionClause_; }
	}

	public final UnionClause_Context unionClause_() throws RecognitionException {
		UnionClause_Context _localctx = new UnionClause_Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_unionClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			selectClause();
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(657);
				match(UNION);
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT || _la==ALL) {
					{
					setState(658);
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

				setState(661);
				selectClause();
				}
				}
				setState(666);
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
		public TerminalNode SELECT() { return getToken(SQLServerStatementParser.SELECT, 0); }
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
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(SELECT);
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(668);
				duplicateSpecification();
				}
			}

			setState(671);
			selectItems();
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(672);
				fromClause();
				}
			}

			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(675);
				whereClause();
				}
			}

			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(678);
				groupByClause();
				}
			}

			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(681);
				havingClause();
				}
			}

			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(684);
				orderByClause();
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
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(SQLServerStatementParser.DISTINCT, 0); }
		public DuplicateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplicateSpecification; }
	}

	public final DuplicateSpecificationContext duplicateSpecification() throws RecognitionException {
		DuplicateSpecificationContext _localctx = new DuplicateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_duplicateSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
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
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public SelectItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItems; }
	}

	public final SelectItemsContext selectItems() throws RecognitionException {
		SelectItemsContext _localctx = new SelectItemsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_selectItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK_:
				{
				setState(689);
				unqualifiedShorthand();
				}
				break;
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case CONVERT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case TYPE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(690);
				selectItem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(693);
				match(COMMA_);
				setState(694);
				selectItem();
				}
				}
				setState(699);
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
		public TopContext top() {
			return getRuleContext(TopContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
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
		enterRule(_localctx, 36, RULE_selectItem);
		int _la;
		try {
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(700);
					top();
					}
					break;
				case 2:
					{
					setState(701);
					columnName();
					}
					break;
				case 3:
					{
					setState(702);
					expr(0);
					}
					break;
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (FUNCTION - 52)) | (1L << (TRIGGER - 52)) | (1L << (AS - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (ARRAY - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (QUARTER - 119)) | (1L << (WEEK - 119)) | (1L << (MICROSECOND - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (INSTANCE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (BINARY - 119)) | (1L << (HIDDEN_ - 119)) | (1L << (MOD - 119)) | (1L << (PARTITION - 119)) | (1L << (PARTITIONS - 119)) | (1L << (TOP - 119)) | (1L << (ROW - 119)) | (1L << (XOR - 119)) | (1L << (ALWAYS - 119)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (ROLE - 188)) | (1L << (START - 188)) | (1L << (ALGORITHM - 188)) | (1L << (AUTO - 188)) | (1L << (BLOCKERS - 188)) | (1L << (CLUSTERED - 188)) | (1L << (NONCLUSTERED - 188)) | (1L << (COLUMNSTORE - 188)) | (1L << (CONTENT - 188)) | (1L << (DATABASE - 188)) | (1L << (YEARS - 188)) | (1L << (MONTHS - 188)) | (1L << (WEEKS - 188)) | (1L << (DAYS - 188)) | (1L << (MINUTES - 188)) | (1L << (DENY - 188)) | (1L << (DETERMINISTIC - 188)) | (1L << (DISTRIBUTION - 188)) | (1L << (DOCUMENT - 188)) | (1L << (DURABILITY - 188)) | (1L << (ENCRYPTED - 188)) | (1L << (FILESTREAM - 188)) | (1L << (FILETABLE - 188)) | (1L << (FILLFACTOR - 188)) | (1L << (FOLLOWING - 188)) | (1L << (HASH - 188)) | (1L << (HEAP - 188)) | (1L << (INBOUND - 188)) | (1L << (OUTBOUND - 188)) | (1L << (UNBOUNDED - 188)) | (1L << (INFINITE - 188)) | (1L << (LOGIN - 188)) | (1L << (MASKED - 188)) | (1L << (MAXDOP - 188)) | (1L << (MOVE - 188)) | (1L << (NOCHECK - 188)) | (1L << (OBJECT - 188)) | (1L << (OFF - 188)) | (1L << (ONLINE - 188)) | (1L << (OVER - 188)) | (1L << (PAGE - 188)) | (1L << (PAUSED - 188)) | (1L << (PERIOD - 188)) | (1L << (PERSISTED - 188)) | (1L << (PRECEDING - 188)) | (1L << (RANDOMIZED - 188)) | (1L << (RANGE - 188)) | (1L << (REBUILD - 188)) | (1L << (REPLICATE - 188)) | (1L << (REPLICATION - 188)) | (1L << (RESUMABLE - 188)) | (1L << (ROWGUIDCOL - 188)) | (1L << (SAVE - 188)) | (1L << (SELF - 188)) | (1L << (SPARSE - 188)) | (1L << (SWITCH - 188)) | (1L << (TRAN - 188)))) != 0) || ((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (TRANCOUNT - 252)) | (1L << (CONTROL - 252)) | (1L << (TAKE - 252)) | (1L << (OWNERSHIP - 252)) | (1L << (DEFINITION - 252)) | (1L << (APPLICATION - 252)) | (1L << (ASSEMBLY - 252)) | (1L << (SYMMETRIC - 252)) | (1L << (ASYMMETRIC - 252)) | (1L << (SERVER - 252)) | (1L << (RECEIVE - 252)) | (1L << (CHANGE - 252)) | (1L << (TRACE - 252)) | (1L << (TRACKING - 252)) | (1L << (RESOURCES - 252)) | (1L << (SETTINGS - 252)) | (1L << (STATE - 252)) | (1L << (AVAILABILITY - 252)) | (1L << (CREDENTIAL - 252)) | (1L << (ENDPOINT - 252)) | (1L << (EVENT - 252)) | (1L << (NOTIFICATION - 252)) | (1L << (LINKED - 252)) | (1L << (AUDIT - 252)) | (1L << (DDL - 252)) | (1L << (XML - 252)) | (1L << (IMPERSONATE - 252)) | (1L << (SECURABLES - 252)) | (1L << (AUTHENTICATE - 252)) | (1L << (EXTERNAL - 252)) | (1L << (ACCESS - 252)) | (1L << (ADMINISTER - 252)) | (1L << (BULK - 252)) | (1L << (OPERATIONS - 252)) | (1L << (UNSAFE - 252)) | (1L << (SHUTDOWN - 252)) | (1L << (SCOPED - 252)) | (1L << (CONFIGURATION - 252)) | (1L << (DATASPACE - 252)) | (1L << (SERVICE - 252)) | (1L << (CERTIFICATE - 252)) | (1L << (CONTRACT - 252)) | (1L << (ENCRYPTION - 252)) | (1L << (MASTER - 252)) | (1L << (DATA - 252)) | (1L << (SOURCE - 252)) | (1L << (FILE - 252)) | (1L << (FORMAT - 252)) | (1L << (LIBRARY - 252)) | (1L << (FULLTEXT - 252)) | (1L << (MASK - 252)) | (1L << (UNMASK - 252)) | (1L << (MESSAGE - 252)) | (1L << (TYPE - 252)) | (1L << (REMOTE - 252)) | (1L << (BINDING - 252)) | (1L << (ROUTE - 252)) | (1L << (SECURITY - 252)))) != 0) || ((((_la - 316)) & ~0x3f) == 0 && ((1L << (_la - 316)) & ((1L << (POLICY - 316)) | (1L << (AGGREGATE - 316)) | (1L << (QUEUE - 316)) | (1L << (RULE - 316)) | (1L << (SYNONYM - 316)) | (1L << (COLLECTION - 316)) | (1L << (SCRIPT - 316)) | (1L << (KILL - 316)) | (1L << (BACKUP - 316)) | (1L << (LOG - 316)) | (1L << (SHOWPLAN - 316)) | (1L << (SUBSCRIBE - 316)) | (1L << (QUERY - 316)) | (1L << (NOTIFICATIONS - 316)) | (1L << (CHECKPOINT - 316)) | (1L << (SEQUENCE - 316)) | (1L << (ABORT_AFTER_WAIT - 316)) | (1L << (ALLOW_PAGE_LOCKS - 316)) | (1L << (ALLOW_ROW_LOCKS - 316)) | (1L << (ALL_SPARSE_COLUMNS - 316)) | (1L << (BUCKET_COUNT - 316)) | (1L << (COLUMNSTORE_ARCHIVE - 316)) | (1L << (COLUMN_ENCRYPTION_KEY - 316)) | (1L << (COLUMN_SET - 316)) | (1L << (COMPRESSION_DELAY - 316)) | (1L << (DATABASE_DEAULT - 316)) | (1L << (DATA_COMPRESSION - 316)) | (1L << (DATA_CONSISTENCY_CHECK - 316)) | (1L << (ENCRYPTION_TYPE - 316)) | (1L << (SYSTEM_TIME - 316)) | (1L << (SYSTEM_VERSIONING - 316)) | (1L << (TEXTIMAGE_ON - 316)) | (1L << (WAIT_AT_LOW_PRIORITY - 316)) | (1L << (STATISTICS_INCREMENTAL - 316)) | (1L << (STATISTICS_NORECOMPUTE - 316)) | (1L << (ROUND_ROBIN - 316)) | (1L << (SCHEMA_AND_DATA - 316)) | (1L << (SCHEMA_ONLY - 316)) | (1L << (SORT_IN_TEMPDB - 316)) | (1L << (IGNORE_DUP_KEY - 316)) | (1L << (IMPLICIT_TRANSACTIONS - 316)) | (1L << (MAX_DURATION - 316)) | (1L << (MEMORY_OPTIMIZED - 316)) | (1L << (MIGRATION_STATE - 316)) | (1L << (PAD_INDEX - 316)) | (1L << (REMOTE_DATA_ARCHIVE - 316)) | (1L << (FILESTREAM_ON - 316)) | (1L << (FILETABLE_COLLATE_FILENAME - 316)) | (1L << (FILETABLE_DIRECTORY - 316)) | (1L << (FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME - 316)) | (1L << (FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME - 316)) | (1L << (FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME - 316)) | (1L << (FILTER_PREDICATE - 316)) | (1L << (HISTORY_RETENTION_PERIOD - 316)) | (1L << (HISTORY_TABLE - 316)) | (1L << (LOCK_ESCALATION - 316)) | (1L << (DROP_EXISTING - 316)) | (1L << (ROW_NUMBER - 316)) | (1L << (IDENTIFIER_ - 316)) | (1L << (STRING_ - 316)))) != 0)) {
					{
					setState(706);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(705);
						match(AS);
						}
					}

					setState(708);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
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

	public static class TopContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(SQLServerStatementParser.TOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ROW_NUMBER() { return getToken(SQLServerStatementParser.ROW_NUMBER, 0); }
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public TerminalNode OVER() { return getToken(SQLServerStatementParser.OVER, 0); }
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public TopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top; }
	}

	public final TopContext top() throws RecognitionException {
		TopContext _localctx = new TopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_top);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(TOP);
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(715);
				match(LP_);
				}
				break;
			}
			setState(718);
			expr(0);
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(719);
				match(RP_);
				}
			}

			setState(722);
			match(ROW_NUMBER);
			setState(723);
			match(LP_);
			setState(724);
			match(RP_);
			setState(725);
			match(OVER);
			setState(726);
			match(LP_);
			setState(727);
			orderByClause();
			setState(728);
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

	public static class AliasContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_alias);
		try {
			setState(732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case ARRAY:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case TYPE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				identifier_();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
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
		public TerminalNode ASTERISK_() { return getToken(SQLServerStatementParser.ASTERISK_, 0); }
		public UnqualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedShorthand; }
	}

	public final UnqualifiedShorthandContext unqualifiedShorthand() throws RecognitionException {
		UnqualifiedShorthandContext _localctx = new UnqualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unqualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
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
		public TerminalNode DOT_ASTERISK_() { return getToken(SQLServerStatementParser.DOT_ASTERISK_, 0); }
		public QualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedShorthand; }
	}

	public final QualifiedShorthandContext qualifiedShorthand() throws RecognitionException {
		QualifiedShorthandContext _localctx = new QualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_qualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			identifier_();
			setState(737);
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
		public TerminalNode FROM() { return getToken(SQLServerStatementParser.FROM, 0); }
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
		enterRule(_localctx, 46, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(FROM);
			setState(740);
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
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			tableReference();
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(743);
				match(COMMA_);
				setState(744);
				tableReference();
				}
				}
				setState(749);
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
		enterRule(_localctx, 50, RULE_tableReference);
		int _la;
		try {
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(750);
					tableFactor();
					setState(751);
					joinedTable();
					}
					}
					setState(755); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (LP_ - 29)) | (1L << (TRUNCATE - 29)) | (1L << (FUNCTION - 29)) | (1L << (TRIGGER - 29)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (ARRAY - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (QUARTER - 119)) | (1L << (WEEK - 119)) | (1L << (MICROSECOND - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (INSTANCE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (BINARY - 119)) | (1L << (HIDDEN_ - 119)) | (1L << (MOD - 119)) | (1L << (PARTITION - 119)) | (1L << (PARTITIONS - 119)) | (1L << (TOP - 119)) | (1L << (ROW - 119)) | (1L << (XOR - 119)) | (1L << (ALWAYS - 119)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (ROLE - 188)) | (1L << (START - 188)) | (1L << (ALGORITHM - 188)) | (1L << (AUTO - 188)) | (1L << (BLOCKERS - 188)) | (1L << (CLUSTERED - 188)) | (1L << (NONCLUSTERED - 188)) | (1L << (COLUMNSTORE - 188)) | (1L << (CONTENT - 188)) | (1L << (DATABASE - 188)) | (1L << (YEARS - 188)) | (1L << (MONTHS - 188)) | (1L << (WEEKS - 188)) | (1L << (DAYS - 188)) | (1L << (MINUTES - 188)) | (1L << (DENY - 188)) | (1L << (DETERMINISTIC - 188)) | (1L << (DISTRIBUTION - 188)) | (1L << (DOCUMENT - 188)) | (1L << (DURABILITY - 188)) | (1L << (ENCRYPTED - 188)) | (1L << (FILESTREAM - 188)) | (1L << (FILETABLE - 188)) | (1L << (FILLFACTOR - 188)) | (1L << (FOLLOWING - 188)) | (1L << (HASH - 188)) | (1L << (HEAP - 188)) | (1L << (INBOUND - 188)) | (1L << (OUTBOUND - 188)) | (1L << (UNBOUNDED - 188)) | (1L << (INFINITE - 188)) | (1L << (LOGIN - 188)) | (1L << (MASKED - 188)) | (1L << (MAXDOP - 188)) | (1L << (MOVE - 188)) | (1L << (NOCHECK - 188)) | (1L << (OBJECT - 188)) | (1L << (OFF - 188)) | (1L << (ONLINE - 188)) | (1L << (OVER - 188)) | (1L << (PAGE - 188)) | (1L << (PAUSED - 188)) | (1L << (PERIOD - 188)) | (1L << (PERSISTED - 188)) | (1L << (PRECEDING - 188)) | (1L << (RANDOMIZED - 188)) | (1L << (RANGE - 188)) | (1L << (REBUILD - 188)) | (1L << (REPLICATE - 188)) | (1L << (REPLICATION - 188)) | (1L << (RESUMABLE - 188)) | (1L << (ROWGUIDCOL - 188)) | (1L << (SAVE - 188)) | (1L << (SELF - 188)) | (1L << (SPARSE - 188)) | (1L << (SWITCH - 188)) | (1L << (TRAN - 188)))) != 0) || ((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (TRANCOUNT - 252)) | (1L << (CONTROL - 252)) | (1L << (TAKE - 252)) | (1L << (OWNERSHIP - 252)) | (1L << (DEFINITION - 252)) | (1L << (APPLICATION - 252)) | (1L << (ASSEMBLY - 252)) | (1L << (SYMMETRIC - 252)) | (1L << (ASYMMETRIC - 252)) | (1L << (SERVER - 252)) | (1L << (RECEIVE - 252)) | (1L << (CHANGE - 252)) | (1L << (TRACE - 252)) | (1L << (TRACKING - 252)) | (1L << (RESOURCES - 252)) | (1L << (SETTINGS - 252)) | (1L << (STATE - 252)) | (1L << (AVAILABILITY - 252)) | (1L << (CREDENTIAL - 252)) | (1L << (ENDPOINT - 252)) | (1L << (EVENT - 252)) | (1L << (NOTIFICATION - 252)) | (1L << (LINKED - 252)) | (1L << (AUDIT - 252)) | (1L << (DDL - 252)) | (1L << (XML - 252)) | (1L << (IMPERSONATE - 252)) | (1L << (SECURABLES - 252)) | (1L << (AUTHENTICATE - 252)) | (1L << (EXTERNAL - 252)) | (1L << (ACCESS - 252)) | (1L << (ADMINISTER - 252)) | (1L << (BULK - 252)) | (1L << (OPERATIONS - 252)) | (1L << (UNSAFE - 252)) | (1L << (SHUTDOWN - 252)) | (1L << (SCOPED - 252)) | (1L << (CONFIGURATION - 252)) | (1L << (DATASPACE - 252)) | (1L << (SERVICE - 252)) | (1L << (CERTIFICATE - 252)) | (1L << (CONTRACT - 252)) | (1L << (ENCRYPTION - 252)) | (1L << (MASTER - 252)) | (1L << (DATA - 252)) | (1L << (SOURCE - 252)) | (1L << (FILE - 252)) | (1L << (FORMAT - 252)) | (1L << (LIBRARY - 252)) | (1L << (FULLTEXT - 252)) | (1L << (MASK - 252)) | (1L << (UNMASK - 252)) | (1L << (MESSAGE - 252)) | (1L << (TYPE - 252)) | (1L << (REMOTE - 252)) | (1L << (BINDING - 252)) | (1L << (ROUTE - 252)) | (1L << (SECURITY - 252)))) != 0) || ((((_la - 316)) & ~0x3f) == 0 && ((1L << (_la - 316)) & ((1L << (POLICY - 316)) | (1L << (AGGREGATE - 316)) | (1L << (QUEUE - 316)) | (1L << (RULE - 316)) | (1L << (SYNONYM - 316)) | (1L << (COLLECTION - 316)) | (1L << (SCRIPT - 316)) | (1L << (KILL - 316)) | (1L << (BACKUP - 316)) | (1L << (LOG - 316)) | (1L << (SHOWPLAN - 316)) | (1L << (SUBSCRIBE - 316)) | (1L << (QUERY - 316)) | (1L << (NOTIFICATIONS - 316)) | (1L << (CHECKPOINT - 316)) | (1L << (SEQUENCE - 316)) | (1L << (ABORT_AFTER_WAIT - 316)) | (1L << (ALLOW_PAGE_LOCKS - 316)) | (1L << (ALLOW_ROW_LOCKS - 316)) | (1L << (ALL_SPARSE_COLUMNS - 316)) | (1L << (BUCKET_COUNT - 316)) | (1L << (COLUMNSTORE_ARCHIVE - 316)) | (1L << (COLUMN_ENCRYPTION_KEY - 316)) | (1L << (COLUMN_SET - 316)) | (1L << (COMPRESSION_DELAY - 316)) | (1L << (DATABASE_DEAULT - 316)) | (1L << (DATA_COMPRESSION - 316)) | (1L << (DATA_CONSISTENCY_CHECK - 316)) | (1L << (ENCRYPTION_TYPE - 316)) | (1L << (SYSTEM_TIME - 316)) | (1L << (SYSTEM_VERSIONING - 316)) | (1L << (TEXTIMAGE_ON - 316)) | (1L << (WAIT_AT_LOW_PRIORITY - 316)) | (1L << (STATISTICS_INCREMENTAL - 316)) | (1L << (STATISTICS_NORECOMPUTE - 316)) | (1L << (ROUND_ROBIN - 316)) | (1L << (SCHEMA_AND_DATA - 316)) | (1L << (SCHEMA_ONLY - 316)) | (1L << (SORT_IN_TEMPDB - 316)) | (1L << (IGNORE_DUP_KEY - 316)) | (1L << (IMPLICIT_TRANSACTIONS - 316)) | (1L << (MAX_DURATION - 316)) | (1L << (MEMORY_OPTIMIZED - 316)) | (1L << (MIGRATION_STATE - 316)) | (1L << (PAD_INDEX - 316)) | (1L << (REMOTE_DATA_ARCHIVE - 316)) | (1L << (FILESTREAM_ON - 316)) | (1L << (FILETABLE_COLLATE_FILENAME - 316)) | (1L << (FILETABLE_DIRECTORY - 316)) | (1L << (FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME - 316)) | (1L << (FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME - 316)) | (1L << (FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME - 316)) | (1L << (FILTER_PREDICATE - 316)) | (1L << (HISTORY_RETENTION_PERIOD - 316)) | (1L << (HISTORY_TABLE - 316)) | (1L << (LOCK_ESCALATION - 316)) | (1L << (DROP_EXISTING - 316)) | (1L << (ROW_NUMBER - 316)) | (1L << (IDENTIFIER_ - 316)))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				tableFactor();
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NATURAL - 83)) | (1L << (JOIN - 83)) | (1L << (FULL - 83)) | (1L << (INNER - 83)) | (1L << (LEFT - 83)) | (1L << (RIGHT - 83)) | (1L << (CROSS - 83)))) != 0)) {
					{
					{
					setState(758);
					joinedTable();
					}
					}
					setState(763);
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
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tableFactor);
		int _la;
		try {
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				tableName();
				setState(771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(768);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(767);
						match(AS);
						}
					}

					setState(770);
					alias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				subquery();
				setState(775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(774);
					columnNames();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(777);
				match(LP_);
				setState(778);
				tableReferences();
				setState(779);
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
		public TerminalNode JOIN() { return getToken(SQLServerStatementParser.JOIN, 0); }
		public TerminalNode NATURAL() { return getToken(SQLServerStatementParser.NATURAL, 0); }
		public JoinSpecificationContext joinSpecification() {
			return getRuleContext(JoinSpecificationContext.class,0);
		}
		public TerminalNode INNER() { return getToken(SQLServerStatementParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SQLServerStatementParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SQLServerStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLServerStatementParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SQLServerStatementParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(SQLServerStatementParser.OUTER, 0); }
		public JoinedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinedTable; }
	}

	public final JoinedTableContext joinedTable() throws RecognitionException {
		JoinedTableContext _localctx = new JoinedTableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_joinedTable);
		int _la;
		try {
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(783);
					match(NATURAL);
					}
				}

				{
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(786);
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

				setState(789);
				match(JOIN);
				}
				setState(791);
				tableFactor();
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(792);
					joinSpecification();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(795);
					match(NATURAL);
					}
				}

				setState(798);
				_la = _input.LA(1);
				if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (FULL - 85)) | (1L << (LEFT - 85)) | (1L << (RIGHT - 85)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(799);
					match(OUTER);
					}
				}

				setState(802);
				match(JOIN);
				setState(803);
				tableFactor();
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(804);
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
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQLServerStatementParser.USING, 0); }
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
		enterRule(_localctx, 56, RULE_joinSpecification);
		try {
			setState(813);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				match(ON);
				setState(810);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				match(USING);
				setState(812);
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
		public TerminalNode WHERE() { return getToken(SQLServerStatementParser.WHERE, 0); }
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
		enterRule(_localctx, 58, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(WHERE);
			setState(816);
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
		public TerminalNode GROUP() { return getToken(SQLServerStatementParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SQLServerStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(GROUP);
			setState(819);
			match(BY);
			setState(820);
			orderByItem();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(821);
				match(COMMA_);
				setState(822);
				orderByItem();
				}
				}
				setState(827);
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
		public TerminalNode HAVING() { return getToken(SQLServerStatementParser.HAVING, 0); }
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
		enterRule(_localctx, 62, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(HAVING);
			setState(829);
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

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public UnionClause_Context unionClause_() {
			return getRuleContext(UnionClause_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
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
		enterRule(_localctx, 64, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(LP_);
			setState(832);
			unionClause_();
			setState(833);
			match(RP_);
			setState(835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(834);
				match(AS);
				}
				break;
			}
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(837);
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
		public TerminalNode QUESTION_() { return getToken(SQLServerStatementParser.QUESTION_, 0); }
		public ParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMarker; }
	}

	public final ParameterMarkerContext parameterMarker() throws RecognitionException {
		ParameterMarkerContext _localctx = new ParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(QUESTION_);
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
		public DateTimeLiteralsContext dateTimeLiterals() {
			return getRuleContext(DateTimeLiteralsContext.class,0);
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
		enterRule(_localctx, 68, RULE_literals);
		try {
			setState(849);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				stringLiterals();
				}
				break;
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				numberLiterals();
				}
				break;
			case LBE_:
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
				dateTimeLiterals();
				}
				break;
			case HEX_DIGIT_:
				enterOuterAlt(_localctx, 4);
				{
				setState(845);
				hexadecimalLiterals();
				}
				break;
			case BIT_NUM_:
				enterOuterAlt(_localctx, 5);
				{
				setState(846);
				bitValueLiterals();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(847);
				booleanLiterals();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(848);
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
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public StringLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiterals; }
	}

	public final StringLiteralsContext stringLiterals() throws RecognitionException {
		StringLiteralsContext _localctx = new StringLiteralsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_stringLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
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

	public static class NumberLiteralsContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode MINUS_() { return getToken(SQLServerStatementParser.MINUS_, 0); }
		public NumberLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiterals; }
	}

	public final NumberLiteralsContext numberLiterals() throws RecognitionException {
		NumberLiteralsContext _localctx = new NumberLiteralsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_numberLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_) {
				{
				setState(853);
				match(MINUS_);
				}
			}

			setState(856);
			match(NUMBER_);
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

	public static class DateTimeLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode DATE() { return getToken(SQLServerStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SQLServerStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SQLServerStatementParser.TIMESTAMP, 0); }
		public TerminalNode LBE_() { return getToken(SQLServerStatementParser.LBE_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode RBE_() { return getToken(SQLServerStatementParser.RBE_, 0); }
		public DateTimeLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeLiterals; }
	}

	public final DateTimeLiteralsContext dateTimeLiterals() throws RecognitionException {
		DateTimeLiteralsContext _localctx = new DateTimeLiteralsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_dateTimeLiterals);
		int _la;
		try {
			setState(865);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(858);
				_la = _input.LA(1);
				if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (DATE - 131)) | (1L << (TIME - 131)) | (1L << (TIMESTAMP - 131)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(859);
				match(STRING_);
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				match(LBE_);
				setState(861);
				identifier_();
				setState(862);
				match(STRING_);
				setState(863);
				match(RBE_);
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

	public static class HexadecimalLiteralsContext extends ParserRuleContext {
		public TerminalNode HEX_DIGIT_() { return getToken(SQLServerStatementParser.HEX_DIGIT_, 0); }
		public HexadecimalLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiterals; }
	}

	public final HexadecimalLiteralsContext hexadecimalLiterals() throws RecognitionException {
		HexadecimalLiteralsContext _localctx = new HexadecimalLiteralsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_hexadecimalLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
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
		public TerminalNode BIT_NUM_() { return getToken(SQLServerStatementParser.BIT_NUM_, 0); }
		public BitValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitValueLiterals; }
	}

	public final BitValueLiteralsContext bitValueLiterals() throws RecognitionException {
		BitValueLiteralsContext _localctx = new BitValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_bitValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
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
		public TerminalNode TRUE() { return getToken(SQLServerStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLServerStatementParser.FALSE, 0); }
		public BooleanLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiterals; }
	}

	public final BooleanLiteralsContext booleanLiterals() throws RecognitionException {
		BooleanLiteralsContext _localctx = new BooleanLiteralsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_booleanLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
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
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public NullValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValueLiterals; }
	}

	public final NullValueLiteralsContext nullValueLiterals() throws RecognitionException {
		NullValueLiteralsContext _localctx = new NullValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_nullValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
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

	public static class Identifier_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
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
		enterRule(_localctx, 84, RULE_identifier_);
		try {
			setState(877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(875);
				match(IDENTIFIER_);
				}
				break;
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case ARRAY:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case TYPE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
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

	public static class UnreservedWord_Context extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(SQLServerStatementParser.TRUNCATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SQLServerStatementParser.FUNCTION, 0); }
		public TerminalNode TRIGGER() { return getToken(SQLServerStatementParser.TRIGGER, 0); }
		public TerminalNode LIMIT() { return getToken(SQLServerStatementParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(SQLServerStatementParser.OFFSET, 0); }
		public TerminalNode SAVEPOINT() { return getToken(SQLServerStatementParser.SAVEPOINT, 0); }
		public TerminalNode BOOLEAN() { return getToken(SQLServerStatementParser.BOOLEAN, 0); }
		public TerminalNode ARRAY() { return getToken(SQLServerStatementParser.ARRAY, 0); }
		public TerminalNode LOCALTIME() { return getToken(SQLServerStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SQLServerStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode QUARTER() { return getToken(SQLServerStatementParser.QUARTER, 0); }
		public TerminalNode WEEK() { return getToken(SQLServerStatementParser.WEEK, 0); }
		public TerminalNode MICROSECOND() { return getToken(SQLServerStatementParser.MICROSECOND, 0); }
		public TerminalNode ENABLE() { return getToken(SQLServerStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(SQLServerStatementParser.DISABLE, 0); }
		public TerminalNode BINARY() { return getToken(SQLServerStatementParser.BINARY, 0); }
		public TerminalNode HIDDEN_() { return getToken(SQLServerStatementParser.HIDDEN_, 0); }
		public TerminalNode MOD() { return getToken(SQLServerStatementParser.MOD, 0); }
		public TerminalNode PARTITION() { return getToken(SQLServerStatementParser.PARTITION, 0); }
		public TerminalNode TOP() { return getToken(SQLServerStatementParser.TOP, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode XOR() { return getToken(SQLServerStatementParser.XOR, 0); }
		public TerminalNode ALWAYS() { return getToken(SQLServerStatementParser.ALWAYS, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode START() { return getToken(SQLServerStatementParser.START, 0); }
		public TerminalNode ALGORITHM() { return getToken(SQLServerStatementParser.ALGORITHM, 0); }
		public TerminalNode AUTO() { return getToken(SQLServerStatementParser.AUTO, 0); }
		public TerminalNode BLOCKERS() { return getToken(SQLServerStatementParser.BLOCKERS, 0); }
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode CONTENT() { return getToken(SQLServerStatementParser.CONTENT, 0); }
		public TerminalNode DATABASE() { return getToken(SQLServerStatementParser.DATABASE, 0); }
		public TerminalNode DAYS() { return getToken(SQLServerStatementParser.DAYS, 0); }
		public TerminalNode DENY() { return getToken(SQLServerStatementParser.DENY, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(SQLServerStatementParser.DETERMINISTIC, 0); }
		public TerminalNode DISTRIBUTION() { return getToken(SQLServerStatementParser.DISTRIBUTION, 0); }
		public TerminalNode DOCUMENT() { return getToken(SQLServerStatementParser.DOCUMENT, 0); }
		public TerminalNode DURABILITY() { return getToken(SQLServerStatementParser.DURABILITY, 0); }
		public TerminalNode ENCRYPTED() { return getToken(SQLServerStatementParser.ENCRYPTED, 0); }
		public TerminalNode FILESTREAM() { return getToken(SQLServerStatementParser.FILESTREAM, 0); }
		public TerminalNode FILETABLE() { return getToken(SQLServerStatementParser.FILETABLE, 0); }
		public TerminalNode FOLLOWING() { return getToken(SQLServerStatementParser.FOLLOWING, 0); }
		public TerminalNode HASH() { return getToken(SQLServerStatementParser.HASH, 0); }
		public TerminalNode HEAP() { return getToken(SQLServerStatementParser.HEAP, 0); }
		public TerminalNode INBOUND() { return getToken(SQLServerStatementParser.INBOUND, 0); }
		public TerminalNode INFINITE() { return getToken(SQLServerStatementParser.INFINITE, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode MASKED() { return getToken(SQLServerStatementParser.MASKED, 0); }
		public TerminalNode MAXDOP() { return getToken(SQLServerStatementParser.MAXDOP, 0); }
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public TerminalNode MONTHS() { return getToken(SQLServerStatementParser.MONTHS, 0); }
		public TerminalNode MOVE() { return getToken(SQLServerStatementParser.MOVE, 0); }
		public TerminalNode NOCHECK() { return getToken(SQLServerStatementParser.NOCHECK, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public TerminalNode OBJECT() { return getToken(SQLServerStatementParser.OBJECT, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public TerminalNode ONLINE() { return getToken(SQLServerStatementParser.ONLINE, 0); }
		public TerminalNode OUTBOUND() { return getToken(SQLServerStatementParser.OUTBOUND, 0); }
		public TerminalNode OVER() { return getToken(SQLServerStatementParser.OVER, 0); }
		public TerminalNode PAGE() { return getToken(SQLServerStatementParser.PAGE, 0); }
		public TerminalNode PARTITIONS() { return getToken(SQLServerStatementParser.PARTITIONS, 0); }
		public TerminalNode PAUSED() { return getToken(SQLServerStatementParser.PAUSED, 0); }
		public TerminalNode PERIOD() { return getToken(SQLServerStatementParser.PERIOD, 0); }
		public TerminalNode PERSISTED() { return getToken(SQLServerStatementParser.PERSISTED, 0); }
		public TerminalNode PRECEDING() { return getToken(SQLServerStatementParser.PRECEDING, 0); }
		public TerminalNode RANDOMIZED() { return getToken(SQLServerStatementParser.RANDOMIZED, 0); }
		public TerminalNode RANGE() { return getToken(SQLServerStatementParser.RANGE, 0); }
		public TerminalNode REBUILD() { return getToken(SQLServerStatementParser.REBUILD, 0); }
		public TerminalNode REPLICATE() { return getToken(SQLServerStatementParser.REPLICATE, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public TerminalNode RESUMABLE() { return getToken(SQLServerStatementParser.RESUMABLE, 0); }
		public TerminalNode ROWGUIDCOL() { return getToken(SQLServerStatementParser.ROWGUIDCOL, 0); }
		public TerminalNode SAVE() { return getToken(SQLServerStatementParser.SAVE, 0); }
		public TerminalNode SELF() { return getToken(SQLServerStatementParser.SELF, 0); }
		public TerminalNode SPARSE() { return getToken(SQLServerStatementParser.SPARSE, 0); }
		public TerminalNode SWITCH() { return getToken(SQLServerStatementParser.SWITCH, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public TerminalNode TRANCOUNT() { return getToken(SQLServerStatementParser.TRANCOUNT, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SQLServerStatementParser.UNBOUNDED, 0); }
		public TerminalNode YEARS() { return getToken(SQLServerStatementParser.YEARS, 0); }
		public TerminalNode WEEKS() { return getToken(SQLServerStatementParser.WEEKS, 0); }
		public TerminalNode ABORT_AFTER_WAIT() { return getToken(SQLServerStatementParser.ABORT_AFTER_WAIT, 0); }
		public TerminalNode ALLOW_PAGE_LOCKS() { return getToken(SQLServerStatementParser.ALLOW_PAGE_LOCKS, 0); }
		public TerminalNode ALLOW_ROW_LOCKS() { return getToken(SQLServerStatementParser.ALLOW_ROW_LOCKS, 0); }
		public TerminalNode ALL_SPARSE_COLUMNS() { return getToken(SQLServerStatementParser.ALL_SPARSE_COLUMNS, 0); }
		public TerminalNode BUCKET_COUNT() { return getToken(SQLServerStatementParser.BUCKET_COUNT, 0); }
		public TerminalNode COLUMNSTORE_ARCHIVE() { return getToken(SQLServerStatementParser.COLUMNSTORE_ARCHIVE, 0); }
		public TerminalNode COLUMN_ENCRYPTION_KEY() { return getToken(SQLServerStatementParser.COLUMN_ENCRYPTION_KEY, 0); }
		public TerminalNode COLUMN_SET() { return getToken(SQLServerStatementParser.COLUMN_SET, 0); }
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public TerminalNode DATABASE_DEAULT() { return getToken(SQLServerStatementParser.DATABASE_DEAULT, 0); }
		public TerminalNode DATA_COMPRESSION() { return getToken(SQLServerStatementParser.DATA_COMPRESSION, 0); }
		public TerminalNode DATA_CONSISTENCY_CHECK() { return getToken(SQLServerStatementParser.DATA_CONSISTENCY_CHECK, 0); }
		public TerminalNode ENCRYPTION_TYPE() { return getToken(SQLServerStatementParser.ENCRYPTION_TYPE, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SQLServerStatementParser.SYSTEM_TIME, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public TerminalNode TEXTIMAGE_ON() { return getToken(SQLServerStatementParser.TEXTIMAGE_ON, 0); }
		public TerminalNode WAIT_AT_LOW_PRIORITY() { return getToken(SQLServerStatementParser.WAIT_AT_LOW_PRIORITY, 0); }
		public TerminalNode STATISTICS_INCREMENTAL() { return getToken(SQLServerStatementParser.STATISTICS_INCREMENTAL, 0); }
		public TerminalNode STATISTICS_NORECOMPUTE() { return getToken(SQLServerStatementParser.STATISTICS_NORECOMPUTE, 0); }
		public TerminalNode ROUND_ROBIN() { return getToken(SQLServerStatementParser.ROUND_ROBIN, 0); }
		public TerminalNode SCHEMA_AND_DATA() { return getToken(SQLServerStatementParser.SCHEMA_AND_DATA, 0); }
		public TerminalNode SCHEMA_ONLY() { return getToken(SQLServerStatementParser.SCHEMA_ONLY, 0); }
		public TerminalNode SORT_IN_TEMPDB() { return getToken(SQLServerStatementParser.SORT_IN_TEMPDB, 0); }
		public TerminalNode IGNORE_DUP_KEY() { return getToken(SQLServerStatementParser.IGNORE_DUP_KEY, 0); }
		public TerminalNode IMPLICIT_TRANSACTIONS() { return getToken(SQLServerStatementParser.IMPLICIT_TRANSACTIONS, 0); }
		public TerminalNode MAX_DURATION() { return getToken(SQLServerStatementParser.MAX_DURATION, 0); }
		public TerminalNode MEMORY_OPTIMIZED() { return getToken(SQLServerStatementParser.MEMORY_OPTIMIZED, 0); }
		public TerminalNode MIGRATION_STATE() { return getToken(SQLServerStatementParser.MIGRATION_STATE, 0); }
		public TerminalNode PAD_INDEX() { return getToken(SQLServerStatementParser.PAD_INDEX, 0); }
		public TerminalNode REMOTE_DATA_ARCHIVE() { return getToken(SQLServerStatementParser.REMOTE_DATA_ARCHIVE, 0); }
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public TerminalNode FILETABLE_COLLATE_FILENAME() { return getToken(SQLServerStatementParser.FILETABLE_COLLATE_FILENAME, 0); }
		public TerminalNode FILETABLE_DIRECTORY() { return getToken(SQLServerStatementParser.FILETABLE_DIRECTORY, 0); }
		public TerminalNode FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME, 0); }
		public TerminalNode FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME, 0); }
		public TerminalNode FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME, 0); }
		public TerminalNode FILLFACTOR() { return getToken(SQLServerStatementParser.FILLFACTOR, 0); }
		public TerminalNode FILTER_PREDICATE() { return getToken(SQLServerStatementParser.FILTER_PREDICATE, 0); }
		public TerminalNode HISTORY_RETENTION_PERIOD() { return getToken(SQLServerStatementParser.HISTORY_RETENTION_PERIOD, 0); }
		public TerminalNode HISTORY_TABLE() { return getToken(SQLServerStatementParser.HISTORY_TABLE, 0); }
		public TerminalNode LOCK_ESCALATION() { return getToken(SQLServerStatementParser.LOCK_ESCALATION, 0); }
		public TerminalNode DROP_EXISTING() { return getToken(SQLServerStatementParser.DROP_EXISTING, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(SQLServerStatementParser.ROW_NUMBER, 0); }
		public TerminalNode CONTROL() { return getToken(SQLServerStatementParser.CONTROL, 0); }
		public TerminalNode TAKE() { return getToken(SQLServerStatementParser.TAKE, 0); }
		public TerminalNode OWNERSHIP() { return getToken(SQLServerStatementParser.OWNERSHIP, 0); }
		public TerminalNode DEFINITION() { return getToken(SQLServerStatementParser.DEFINITION, 0); }
		public TerminalNode APPLICATION() { return getToken(SQLServerStatementParser.APPLICATION, 0); }
		public TerminalNode ASSEMBLY() { return getToken(SQLServerStatementParser.ASSEMBLY, 0); }
		public TerminalNode SYMMETRIC() { return getToken(SQLServerStatementParser.SYMMETRIC, 0); }
		public TerminalNode ASYMMETRIC() { return getToken(SQLServerStatementParser.ASYMMETRIC, 0); }
		public TerminalNode SERVER() { return getToken(SQLServerStatementParser.SERVER, 0); }
		public TerminalNode RECEIVE() { return getToken(SQLServerStatementParser.RECEIVE, 0); }
		public TerminalNode CHANGE() { return getToken(SQLServerStatementParser.CHANGE, 0); }
		public TerminalNode TRACE() { return getToken(SQLServerStatementParser.TRACE, 0); }
		public TerminalNode TRACKING() { return getToken(SQLServerStatementParser.TRACKING, 0); }
		public TerminalNode RESOURCES() { return getToken(SQLServerStatementParser.RESOURCES, 0); }
		public TerminalNode SETTINGS() { return getToken(SQLServerStatementParser.SETTINGS, 0); }
		public TerminalNode STATE() { return getToken(SQLServerStatementParser.STATE, 0); }
		public TerminalNode AVAILABILITY() { return getToken(SQLServerStatementParser.AVAILABILITY, 0); }
		public TerminalNode CREDENTIAL() { return getToken(SQLServerStatementParser.CREDENTIAL, 0); }
		public TerminalNode ENDPOINT() { return getToken(SQLServerStatementParser.ENDPOINT, 0); }
		public TerminalNode EVENT() { return getToken(SQLServerStatementParser.EVENT, 0); }
		public TerminalNode NOTIFICATION() { return getToken(SQLServerStatementParser.NOTIFICATION, 0); }
		public TerminalNode LINKED() { return getToken(SQLServerStatementParser.LINKED, 0); }
		public TerminalNode AUDIT() { return getToken(SQLServerStatementParser.AUDIT, 0); }
		public TerminalNode DDL() { return getToken(SQLServerStatementParser.DDL, 0); }
		public TerminalNode SQL() { return getToken(SQLServerStatementParser.SQL, 0); }
		public TerminalNode XML() { return getToken(SQLServerStatementParser.XML, 0); }
		public TerminalNode IMPERSONATE() { return getToken(SQLServerStatementParser.IMPERSONATE, 0); }
		public TerminalNode SECURABLES() { return getToken(SQLServerStatementParser.SECURABLES, 0); }
		public TerminalNode AUTHENTICATE() { return getToken(SQLServerStatementParser.AUTHENTICATE, 0); }
		public TerminalNode EXTERNAL() { return getToken(SQLServerStatementParser.EXTERNAL, 0); }
		public TerminalNode ACCESS() { return getToken(SQLServerStatementParser.ACCESS, 0); }
		public TerminalNode ADMINISTER() { return getToken(SQLServerStatementParser.ADMINISTER, 0); }
		public TerminalNode BULK() { return getToken(SQLServerStatementParser.BULK, 0); }
		public TerminalNode OPERATIONS() { return getToken(SQLServerStatementParser.OPERATIONS, 0); }
		public TerminalNode UNSAFE() { return getToken(SQLServerStatementParser.UNSAFE, 0); }
		public TerminalNode SHUTDOWN() { return getToken(SQLServerStatementParser.SHUTDOWN, 0); }
		public TerminalNode SCOPED() { return getToken(SQLServerStatementParser.SCOPED, 0); }
		public TerminalNode CONFIGURATION() { return getToken(SQLServerStatementParser.CONFIGURATION, 0); }
		public TerminalNode DATASPACE() { return getToken(SQLServerStatementParser.DATASPACE, 0); }
		public TerminalNode SERVICE() { return getToken(SQLServerStatementParser.SERVICE, 0); }
		public TerminalNode CERTIFICATE() { return getToken(SQLServerStatementParser.CERTIFICATE, 0); }
		public TerminalNode CONTRACT() { return getToken(SQLServerStatementParser.CONTRACT, 0); }
		public TerminalNode ENCRYPTION() { return getToken(SQLServerStatementParser.ENCRYPTION, 0); }
		public TerminalNode MASTER() { return getToken(SQLServerStatementParser.MASTER, 0); }
		public TerminalNode DATA() { return getToken(SQLServerStatementParser.DATA, 0); }
		public TerminalNode SOURCE() { return getToken(SQLServerStatementParser.SOURCE, 0); }
		public TerminalNode FILE() { return getToken(SQLServerStatementParser.FILE, 0); }
		public TerminalNode FORMAT() { return getToken(SQLServerStatementParser.FORMAT, 0); }
		public TerminalNode LIBRARY() { return getToken(SQLServerStatementParser.LIBRARY, 0); }
		public TerminalNode FULLTEXT() { return getToken(SQLServerStatementParser.FULLTEXT, 0); }
		public TerminalNode MASK() { return getToken(SQLServerStatementParser.MASK, 0); }
		public TerminalNode UNMASK() { return getToken(SQLServerStatementParser.UNMASK, 0); }
		public TerminalNode MESSAGE() { return getToken(SQLServerStatementParser.MESSAGE, 0); }
		public TerminalNode TYPE() { return getToken(SQLServerStatementParser.TYPE, 0); }
		public TerminalNode REMOTE() { return getToken(SQLServerStatementParser.REMOTE, 0); }
		public TerminalNode BINDING() { return getToken(SQLServerStatementParser.BINDING, 0); }
		public TerminalNode ROUTE() { return getToken(SQLServerStatementParser.ROUTE, 0); }
		public TerminalNode SECURITY() { return getToken(SQLServerStatementParser.SECURITY, 0); }
		public TerminalNode POLICY() { return getToken(SQLServerStatementParser.POLICY, 0); }
		public TerminalNode AGGREGATE() { return getToken(SQLServerStatementParser.AGGREGATE, 0); }
		public TerminalNode QUEUE() { return getToken(SQLServerStatementParser.QUEUE, 0); }
		public TerminalNode RULE() { return getToken(SQLServerStatementParser.RULE, 0); }
		public TerminalNode SYNONYM() { return getToken(SQLServerStatementParser.SYNONYM, 0); }
		public TerminalNode COLLECTION() { return getToken(SQLServerStatementParser.COLLECTION, 0); }
		public TerminalNode SCRIPT() { return getToken(SQLServerStatementParser.SCRIPT, 0); }
		public TerminalNode KILL() { return getToken(SQLServerStatementParser.KILL, 0); }
		public TerminalNode BACKUP() { return getToken(SQLServerStatementParser.BACKUP, 0); }
		public TerminalNode LOG() { return getToken(SQLServerStatementParser.LOG, 0); }
		public TerminalNode SHOWPLAN() { return getToken(SQLServerStatementParser.SHOWPLAN, 0); }
		public TerminalNode SUBSCRIBE() { return getToken(SQLServerStatementParser.SUBSCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SQLServerStatementParser.QUERY, 0); }
		public TerminalNode NOTIFICATIONS() { return getToken(SQLServerStatementParser.NOTIFICATIONS, 0); }
		public TerminalNode CHECKPOINT() { return getToken(SQLServerStatementParser.CHECKPOINT, 0); }
		public TerminalNode SEQUENCE() { return getToken(SQLServerStatementParser.SEQUENCE, 0); }
		public TerminalNode INSTANCE() { return getToken(SQLServerStatementParser.INSTANCE, 0); }
		public TerminalNode DO() { return getToken(SQLServerStatementParser.DO, 0); }
		public TerminalNode DEFINER() { return getToken(SQLServerStatementParser.DEFINER, 0); }
		public TerminalNode LOCAL() { return getToken(SQLServerStatementParser.LOCAL, 0); }
		public TerminalNode CASCADED() { return getToken(SQLServerStatementParser.CASCADED, 0); }
		public TerminalNode NEXT() { return getToken(SQLServerStatementParser.NEXT, 0); }
		public TerminalNode NAME() { return getToken(SQLServerStatementParser.NAME, 0); }
		public UnreservedWord_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedWord_; }
	}

	public final UnreservedWord_Context unreservedWord_() throws RecognitionException {
		UnreservedWord_Context _localctx = new UnreservedWord_Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_unreservedWord_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (FUNCTION - 52)) | (1L << (TRIGGER - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (ARRAY - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (QUARTER - 119)) | (1L << (WEEK - 119)) | (1L << (MICROSECOND - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (INSTANCE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (BINARY - 119)) | (1L << (HIDDEN_ - 119)) | (1L << (MOD - 119)) | (1L << (PARTITION - 119)) | (1L << (PARTITIONS - 119)) | (1L << (TOP - 119)) | (1L << (ROW - 119)) | (1L << (XOR - 119)) | (1L << (ALWAYS - 119)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (ROLE - 188)) | (1L << (START - 188)) | (1L << (ALGORITHM - 188)) | (1L << (AUTO - 188)) | (1L << (BLOCKERS - 188)) | (1L << (CLUSTERED - 188)) | (1L << (NONCLUSTERED - 188)) | (1L << (COLUMNSTORE - 188)) | (1L << (CONTENT - 188)) | (1L << (DATABASE - 188)) | (1L << (YEARS - 188)) | (1L << (MONTHS - 188)) | (1L << (WEEKS - 188)) | (1L << (DAYS - 188)) | (1L << (MINUTES - 188)) | (1L << (DENY - 188)) | (1L << (DETERMINISTIC - 188)) | (1L << (DISTRIBUTION - 188)) | (1L << (DOCUMENT - 188)) | (1L << (DURABILITY - 188)) | (1L << (ENCRYPTED - 188)) | (1L << (FILESTREAM - 188)) | (1L << (FILETABLE - 188)) | (1L << (FILLFACTOR - 188)) | (1L << (FOLLOWING - 188)) | (1L << (HASH - 188)) | (1L << (HEAP - 188)) | (1L << (INBOUND - 188)) | (1L << (OUTBOUND - 188)) | (1L << (UNBOUNDED - 188)) | (1L << (INFINITE - 188)) | (1L << (LOGIN - 188)) | (1L << (MASKED - 188)) | (1L << (MAXDOP - 188)) | (1L << (MOVE - 188)) | (1L << (NOCHECK - 188)) | (1L << (OBJECT - 188)) | (1L << (OFF - 188)) | (1L << (ONLINE - 188)) | (1L << (OVER - 188)) | (1L << (PAGE - 188)) | (1L << (PAUSED - 188)) | (1L << (PERIOD - 188)) | (1L << (PERSISTED - 188)) | (1L << (PRECEDING - 188)) | (1L << (RANDOMIZED - 188)) | (1L << (RANGE - 188)) | (1L << (REBUILD - 188)) | (1L << (REPLICATE - 188)) | (1L << (REPLICATION - 188)) | (1L << (RESUMABLE - 188)) | (1L << (ROWGUIDCOL - 188)) | (1L << (SAVE - 188)) | (1L << (SELF - 188)) | (1L << (SPARSE - 188)) | (1L << (SWITCH - 188)) | (1L << (TRAN - 188)))) != 0) || ((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (TRANCOUNT - 252)) | (1L << (CONTROL - 252)) | (1L << (TAKE - 252)) | (1L << (OWNERSHIP - 252)) | (1L << (DEFINITION - 252)) | (1L << (APPLICATION - 252)) | (1L << (ASSEMBLY - 252)) | (1L << (SYMMETRIC - 252)) | (1L << (ASYMMETRIC - 252)) | (1L << (SERVER - 252)) | (1L << (RECEIVE - 252)) | (1L << (CHANGE - 252)) | (1L << (TRACE - 252)) | (1L << (TRACKING - 252)) | (1L << (RESOURCES - 252)) | (1L << (SETTINGS - 252)) | (1L << (STATE - 252)) | (1L << (AVAILABILITY - 252)) | (1L << (CREDENTIAL - 252)) | (1L << (ENDPOINT - 252)) | (1L << (EVENT - 252)) | (1L << (NOTIFICATION - 252)) | (1L << (LINKED - 252)) | (1L << (AUDIT - 252)) | (1L << (DDL - 252)) | (1L << (XML - 252)) | (1L << (IMPERSONATE - 252)) | (1L << (SECURABLES - 252)) | (1L << (AUTHENTICATE - 252)) | (1L << (EXTERNAL - 252)) | (1L << (ACCESS - 252)) | (1L << (ADMINISTER - 252)) | (1L << (BULK - 252)) | (1L << (OPERATIONS - 252)) | (1L << (UNSAFE - 252)) | (1L << (SHUTDOWN - 252)) | (1L << (SCOPED - 252)) | (1L << (CONFIGURATION - 252)) | (1L << (DATASPACE - 252)) | (1L << (SERVICE - 252)) | (1L << (CERTIFICATE - 252)) | (1L << (CONTRACT - 252)) | (1L << (ENCRYPTION - 252)) | (1L << (MASTER - 252)) | (1L << (DATA - 252)) | (1L << (SOURCE - 252)) | (1L << (FILE - 252)) | (1L << (FORMAT - 252)) | (1L << (LIBRARY - 252)) | (1L << (FULLTEXT - 252)) | (1L << (MASK - 252)) | (1L << (UNMASK - 252)) | (1L << (MESSAGE - 252)) | (1L << (TYPE - 252)) | (1L << (REMOTE - 252)) | (1L << (BINDING - 252)) | (1L << (ROUTE - 252)) | (1L << (SECURITY - 252)))) != 0) || ((((_la - 316)) & ~0x3f) == 0 && ((1L << (_la - 316)) & ((1L << (POLICY - 316)) | (1L << (AGGREGATE - 316)) | (1L << (QUEUE - 316)) | (1L << (RULE - 316)) | (1L << (SYNONYM - 316)) | (1L << (COLLECTION - 316)) | (1L << (SCRIPT - 316)) | (1L << (KILL - 316)) | (1L << (BACKUP - 316)) | (1L << (LOG - 316)) | (1L << (SHOWPLAN - 316)) | (1L << (SUBSCRIBE - 316)) | (1L << (QUERY - 316)) | (1L << (NOTIFICATIONS - 316)) | (1L << (CHECKPOINT - 316)) | (1L << (SEQUENCE - 316)) | (1L << (ABORT_AFTER_WAIT - 316)) | (1L << (ALLOW_PAGE_LOCKS - 316)) | (1L << (ALLOW_ROW_LOCKS - 316)) | (1L << (ALL_SPARSE_COLUMNS - 316)) | (1L << (BUCKET_COUNT - 316)) | (1L << (COLUMNSTORE_ARCHIVE - 316)) | (1L << (COLUMN_ENCRYPTION_KEY - 316)) | (1L << (COLUMN_SET - 316)) | (1L << (COMPRESSION_DELAY - 316)) | (1L << (DATABASE_DEAULT - 316)) | (1L << (DATA_COMPRESSION - 316)) | (1L << (DATA_CONSISTENCY_CHECK - 316)) | (1L << (ENCRYPTION_TYPE - 316)) | (1L << (SYSTEM_TIME - 316)) | (1L << (SYSTEM_VERSIONING - 316)) | (1L << (TEXTIMAGE_ON - 316)) | (1L << (WAIT_AT_LOW_PRIORITY - 316)) | (1L << (STATISTICS_INCREMENTAL - 316)) | (1L << (STATISTICS_NORECOMPUTE - 316)) | (1L << (ROUND_ROBIN - 316)) | (1L << (SCHEMA_AND_DATA - 316)) | (1L << (SCHEMA_ONLY - 316)) | (1L << (SORT_IN_TEMPDB - 316)) | (1L << (IGNORE_DUP_KEY - 316)) | (1L << (IMPLICIT_TRANSACTIONS - 316)) | (1L << (MAX_DURATION - 316)) | (1L << (MEMORY_OPTIMIZED - 316)) | (1L << (MIGRATION_STATE - 316)) | (1L << (PAD_INDEX - 316)) | (1L << (REMOTE_DATA_ARCHIVE - 316)) | (1L << (FILESTREAM_ON - 316)) | (1L << (FILETABLE_COLLATE_FILENAME - 316)) | (1L << (FILETABLE_DIRECTORY - 316)) | (1L << (FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME - 316)) | (1L << (FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME - 316)) | (1L << (FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME - 316)) | (1L << (FILTER_PREDICATE - 316)) | (1L << (HISTORY_RETENTION_PERIOD - 316)) | (1L << (HISTORY_TABLE - 316)) | (1L << (LOCK_ESCALATION - 316)) | (1L << (DROP_EXISTING - 316)) | (1L << (ROW_NUMBER - 316)))) != 0)) ) {
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
		enterRule(_localctx, 88, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
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
		public TerminalNode DOT_() { return getToken(SQLServerStatementParser.DOT_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(883);
				owner();
				setState(884);
				match(DOT_);
				}
				break;
			}
			setState(888);
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
		public TerminalNode DOT_() { return getToken(SQLServerStatementParser.DOT_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(890);
				owner();
				setState(891);
				match(DOT_);
				}
				break;
			}
			setState(895);
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
		enterRule(_localctx, 94, RULE_owner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
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
		enterRule(_localctx, 96, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
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

	public static class ColumnNamesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ColumnNameWithSortContext> columnNameWithSort() {
			return getRuleContexts(ColumnNameWithSortContext.class);
		}
		public ColumnNameWithSortContext columnNameWithSort(int i) {
			return getRuleContext(ColumnNameWithSortContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(LP_);
			setState(902);
			columnNameWithSort();
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(903);
				match(COMMA_);
				setState(904);
				columnNameWithSort();
				}
				}
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(910);
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

	public static class TableNamesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(912);
				match(LP_);
				}
			}

			setState(915);
			tableName();
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(916);
				match(COMMA_);
				setState(917);
				tableName();
				}
				}
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(923);
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
		enterRule(_localctx, 102, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
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

	public static class CollationNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_collationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER_ || _la==STRING_) ) {
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

	public static class DataTypeLengthContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(SQLServerStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQLServerStatementParser.NUMBER_, i);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(LP_);
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER_) {
				{
				setState(931);
				match(NUMBER_);
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(932);
					match(COMMA_);
					setState(933);
					match(NUMBER_);
					}
				}

				}
			}

			setState(938);
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

	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(SQLServerStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(940);
				match(PRIMARY);
				}
			}

			setState(943);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(946);
				notOperator_();
				setState(947);
				expr(3);
				}
				break;
			case 2:
				{
				setState(949);
				match(LP_);
				setState(950);
				expr(0);
				setState(951);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(953);
				booleanPrimary_(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(962);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(956);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(957);
					logicalOperator();
					setState(958);
					expr(5);
					}
					} 
				}
				setState(964);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		public TerminalNode OR() { return getToken(SQLServerStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(SQLServerStatementParser.OR_, 0); }
		public TerminalNode AND() { return getToken(SQLServerStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(SQLServerStatementParser.AND_, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
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
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(SQLServerStatementParser.NOT_, 0); }
		public NotOperator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator_; }
	}

	public final NotOperator_Context notOperator_() throws RecognitionException {
		NotOperator_Context _localctx = new NotOperator_Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_notOperator_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
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
		public TerminalNode IS() { return getToken(SQLServerStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(SQLServerStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLServerStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SQLServerStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(SQLServerStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_booleanPrimary_, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(970);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(990);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(972);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(973);
						match(IS);
						setState(975);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(974);
							match(NOT);
							}
						}

						setState(977);
						_la = _input.LA(1);
						if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (NULL - 104)) | (1L << (TRUE - 104)) | (1L << (FALSE - 104)))) != 0) || _la==UNKNOWN) ) {
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
						setState(978);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(979);
						match(SAFE_EQ_);
						setState(980);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(981);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(982);
						comparisonOperator();
						setState(983);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(985);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(986);
						comparisonOperator();
						setState(987);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(988);
						subquery();
						}
						break;
					}
					} 
				}
				setState(994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(SQLServerStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(SQLServerStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(SQLServerStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(SQLServerStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(SQLServerStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
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
		public TerminalNode IN() { return getToken(SQLServerStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(SQLServerStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SQLServerStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SQLServerStatementParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SQLServerStatementParser.ESCAPE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_predicate);
		int _la;
		try {
			setState(1040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				bitExpr(0);
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(998);
					match(NOT);
					}
				}

				setState(1001);
				match(IN);
				setState(1002);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				bitExpr(0);
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1005);
					match(NOT);
					}
				}

				setState(1008);
				match(IN);
				setState(1009);
				match(LP_);
				setState(1010);
				expr(0);
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1011);
					match(COMMA_);
					setState(1012);
					expr(0);
					}
					}
					setState(1017);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1018);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1020);
				bitExpr(0);
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1021);
					match(NOT);
					}
				}

				setState(1024);
				match(BETWEEN);
				setState(1025);
				bitExpr(0);
				setState(1026);
				match(AND);
				setState(1027);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1029);
				bitExpr(0);
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1030);
					match(NOT);
					}
				}

				setState(1033);
				match(LIKE);
				setState(1034);
				simpleExpr(0);
				setState(1037);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(1035);
					match(ESCAPE);
					setState(1036);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1039);
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
		public TerminalNode VERTICAL_BAR_() { return getToken(SQLServerStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(SQLServerStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(SQLServerStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(SQLServerStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(SQLServerStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(SQLServerStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(SQLServerStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(SQLServerStatementParser.SLASH_, 0); }
		public TerminalNode MOD_() { return getToken(SQLServerStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(SQLServerStatementParser.CARET_, 0); }
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
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1043);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1077);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1075);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1045);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1046);
						match(VERTICAL_BAR_);
						setState(1047);
						bitExpr(12);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1048);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1049);
						match(AMPERSAND_);
						setState(1050);
						bitExpr(11);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1051);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1052);
						match(SIGNED_LEFT_SHIFT_);
						setState(1053);
						bitExpr(10);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1054);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1055);
						match(SIGNED_RIGHT_SHIFT_);
						setState(1056);
						bitExpr(9);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1057);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1058);
						match(PLUS_);
						setState(1059);
						bitExpr(8);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1060);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1061);
						match(MINUS_);
						setState(1062);
						bitExpr(7);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1063);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1064);
						match(ASTERISK_);
						setState(1065);
						bitExpr(6);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1066);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1067);
						match(SLASH_);
						setState(1068);
						bitExpr(5);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1069);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1070);
						match(MOD_);
						setState(1071);
						bitExpr(4);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1072);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1073);
						match(CARET_);
						setState(1074);
						bitExpr(3);
						}
						break;
					}
					} 
				}
				setState(1079);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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
		public TerminalNode PLUS_() { return getToken(SQLServerStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(SQLServerStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(SQLServerStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(SQLServerStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(SQLServerStatementParser.BINARY, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public TerminalNode LBE_() { return getToken(SQLServerStatementParser.LBE_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode RBE_() { return getToken(SQLServerStatementParser.RBE_, 0); }
		public CaseExpression_Context caseExpression_() {
			return getRuleContext(CaseExpression_Context.class,0);
		}
		public PrivateExprOfDbContext privateExprOfDb() {
			return getRuleContext(PrivateExprOfDbContext.class,0);
		}
		public TerminalNode OR_() { return getToken(SQLServerStatementParser.OR_, 0); }
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
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(1081);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1082);
				parameterMarker();
				}
				break;
			case 3:
				{
				setState(1083);
				literals();
				}
				break;
			case 4:
				{
				setState(1084);
				columnName();
				}
				break;
			case 5:
				{
				setState(1085);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_))) != 0) || _la==BINARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1086);
				simpleExpr(6);
				}
				break;
			case 6:
				{
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1087);
					match(ROW);
					}
				}

				setState(1090);
				match(LP_);
				setState(1091);
				expr(0);
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1092);
					match(COMMA_);
					setState(1093);
					expr(0);
					}
					}
					setState(1098);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1099);
				match(RP_);
				}
				break;
			case 7:
				{
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS) {
					{
					setState(1101);
					match(EXISTS);
					}
				}

				setState(1104);
				subquery();
				}
				break;
			case 8:
				{
				setState(1105);
				match(LBE_);
				setState(1106);
				identifier_();
				setState(1107);
				expr(0);
				setState(1108);
				match(RBE_);
				}
				break;
			case 9:
				{
				setState(1110);
				caseExpression_();
				}
				break;
			case 10:
				{
				setState(1111);
				privateExprOfDb();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
					setState(1114);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(1115);
					match(OR_);
					setState(1116);
					simpleExpr(8);
					}
					} 
				}
				setState(1121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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
		enterRule(_localctx, 126, RULE_functionCall);
		try {
			setState(1125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(1122);
				aggregationFunction();
				}
				break;
			case CAST:
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				specialFunction_();
				}
				break;
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case IF:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case ARRAY:
			case INTERVAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case TYPE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1124);
				regularFunction_();
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

	public static class AggregationFunctionContext extends ParserRuleContext {
		public AggregationFunctionName_Context aggregationFunctionName_() {
			return getRuleContext(AggregationFunctionName_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(SQLServerStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			aggregationFunctionName_();
			setState(1128);
			match(LP_);
			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1129);
				distinct();
				}
			}

			setState(1141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case CONVERT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case TYPE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1132);
				expr(0);
				setState(1137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1133);
					match(COMMA_);
					setState(1134);
					expr(0);
					}
					}
					setState(1139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1140);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1143);
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

	public static class AggregationFunctionName_Context extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(SQLServerStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SQLServerStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(SQLServerStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(SQLServerStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(SQLServerStatementParser.AVG, 0); }
		public AggregationFunctionName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionName_; }
	}

	public final AggregationFunctionName_Context aggregationFunctionName_() throws RecognitionException {
		AggregationFunctionName_Context _localctx = new AggregationFunctionName_Context(_ctx, getState());
		enterRule(_localctx, 130, RULE_aggregationFunctionName_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			_la = _input.LA(1);
			if ( !(((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (MAX - 145)) | (1L << (MIN - 145)) | (1L << (SUM - 145)) | (1L << (COUNT - 145)) | (1L << (AVG - 145)))) != 0)) ) {
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
		public TerminalNode DISTINCT() { return getToken(SQLServerStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
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

	public static class SpecialFunction_Context extends ParserRuleContext {
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
		enterRule(_localctx, 134, RULE_specialFunction_);
		try {
			setState(1151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1149);
				castFunction_();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
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
		public TerminalNode CAST() { return getToken(SQLServerStatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public CastFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction_; }
	}

	public final CastFunction_Context castFunction_() throws RecognitionException {
		CastFunction_Context _localctx = new CastFunction_Context(_ctx, getState());
		enterRule(_localctx, 136, RULE_castFunction_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			match(CAST);
			setState(1154);
			match(LP_);
			setState(1155);
			expr(0);
			setState(1156);
			match(AS);
			setState(1157);
			dataType();
			setState(1158);
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
		public TerminalNode CHAR() { return getToken(SQLServerStatementParser.CHAR, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode USING() { return getToken(SQLServerStatementParser.USING, 0); }
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
		enterRule(_localctx, 138, RULE_charFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			match(CHAR);
			setState(1161);
			match(LP_);
			setState(1162);
			expr(0);
			setState(1167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1163);
				match(COMMA_);
				setState(1164);
				expr(0);
				}
				}
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1170);
				match(USING);
				setState(1171);
				ignoredIdentifier_();
				}
			}

			setState(1174);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(SQLServerStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public RegularFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction_; }
	}

	public final RegularFunction_Context regularFunction_() throws RecognitionException {
		RegularFunction_Context _localctx = new RegularFunction_Context(_ctx, getState());
		enterRule(_localctx, 140, RULE_regularFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			regularFunctionName_();
			setState(1177);
			match(LP_);
			setState(1187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case CONVERT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case TYPE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1178);
				expr(0);
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1179);
					match(COMMA_);
					setState(1180);
					expr(0);
					}
					}
					setState(1185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1186);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1189);
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
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode LOCALTIME() { return getToken(SQLServerStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SQLServerStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(SQLServerStatementParser.INTERVAL, 0); }
		public RegularFunctionName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionName_; }
	}

	public final RegularFunctionName_Context regularFunctionName_() throws RecognitionException {
		RegularFunctionName_Context _localctx = new RegularFunctionName_Context(_ctx, getState());
		enterRule(_localctx, 142, RULE_regularFunctionName_);
		try {
			setState(1196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1191);
				identifier_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192);
				match(IF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1193);
				match(LOCALTIME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1194);
				match(LOCALTIMESTAMP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1195);
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
		public TerminalNode CASE() { return getToken(SQLServerStatementParser.CASE, 0); }
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
		enterRule(_localctx, 144, RULE_caseExpression_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			match(CASE);
			setState(1200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_) | (1L << LP_) | (1L << LBE_) | (1L << QUESTION_) | (1L << TRUNCATE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (FUNCTION - 68)) | (1L << (TRIGGER - 68)) | (1L << (CASE - 68)) | (1L << (CAST - 68)) | (1L << (IF - 68)) | (1L << (NULL - 68)) | (1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (EXISTS - 68)) | (1L << (LIMIT - 68)) | (1L << (OFFSET - 68)) | (1L << (SAVEPOINT - 68)) | (1L << (BOOLEAN - 68)) | (1L << (CHAR - 68)) | (1L << (ARRAY - 68)) | (1L << (INTERVAL - 68)) | (1L << (DATE - 68)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (TIME - 132)) | (1L << (TIMESTAMP - 132)) | (1L << (LOCALTIME - 132)) | (1L << (LOCALTIMESTAMP - 132)) | (1L << (QUARTER - 132)) | (1L << (WEEK - 132)) | (1L << (MICROSECOND - 132)) | (1L << (MAX - 132)) | (1L << (MIN - 132)) | (1L << (SUM - 132)) | (1L << (COUNT - 132)) | (1L << (AVG - 132)) | (1L << (ENABLE - 132)) | (1L << (DISABLE - 132)) | (1L << (INSTANCE - 132)) | (1L << (DO - 132)) | (1L << (DEFINER - 132)) | (1L << (SQL - 132)) | (1L << (CASCADED - 132)) | (1L << (LOCAL - 132)) | (1L << (NEXT - 132)) | (1L << (NAME - 132)) | (1L << (BINARY - 132)) | (1L << (HIDDEN_ - 132)) | (1L << (MOD - 132)) | (1L << (PARTITION - 132)) | (1L << (PARTITIONS - 132)) | (1L << (TOP - 132)) | (1L << (ROW - 132)) | (1L << (XOR - 132)) | (1L << (ALWAYS - 132)) | (1L << (ROLE - 132)) | (1L << (START - 132)) | (1L << (ALGORITHM - 132)) | (1L << (AUTO - 132)) | (1L << (BLOCKERS - 132)) | (1L << (CLUSTERED - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (NONCLUSTERED - 196)) | (1L << (COLUMNSTORE - 196)) | (1L << (CONTENT - 196)) | (1L << (CONVERT - 196)) | (1L << (DATABASE - 196)) | (1L << (YEARS - 196)) | (1L << (MONTHS - 196)) | (1L << (WEEKS - 196)) | (1L << (DAYS - 196)) | (1L << (MINUTES - 196)) | (1L << (DENY - 196)) | (1L << (DETERMINISTIC - 196)) | (1L << (DISTRIBUTION - 196)) | (1L << (DOCUMENT - 196)) | (1L << (DURABILITY - 196)) | (1L << (ENCRYPTED - 196)) | (1L << (FILESTREAM - 196)) | (1L << (FILETABLE - 196)) | (1L << (FILLFACTOR - 196)) | (1L << (FOLLOWING - 196)) | (1L << (HASH - 196)) | (1L << (HEAP - 196)) | (1L << (INBOUND - 196)) | (1L << (OUTBOUND - 196)) | (1L << (UNBOUNDED - 196)) | (1L << (INFINITE - 196)) | (1L << (LOGIN - 196)) | (1L << (MASKED - 196)) | (1L << (MAXDOP - 196)) | (1L << (MOVE - 196)) | (1L << (NOCHECK - 196)) | (1L << (OBJECT - 196)) | (1L << (OFF - 196)) | (1L << (ONLINE - 196)) | (1L << (OVER - 196)) | (1L << (PAGE - 196)) | (1L << (PAUSED - 196)) | (1L << (PERIOD - 196)) | (1L << (PERSISTED - 196)) | (1L << (PRECEDING - 196)) | (1L << (RANDOMIZED - 196)) | (1L << (RANGE - 196)) | (1L << (REBUILD - 196)) | (1L << (REPLICATE - 196)) | (1L << (REPLICATION - 196)) | (1L << (RESUMABLE - 196)) | (1L << (ROWGUIDCOL - 196)) | (1L << (SAVE - 196)) | (1L << (SELF - 196)) | (1L << (SPARSE - 196)) | (1L << (SWITCH - 196)) | (1L << (TRAN - 196)) | (1L << (TRANCOUNT - 196)) | (1L << (CONTROL - 196)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (TAKE - 260)) | (1L << (OWNERSHIP - 260)) | (1L << (DEFINITION - 260)) | (1L << (APPLICATION - 260)) | (1L << (ASSEMBLY - 260)) | (1L << (SYMMETRIC - 260)) | (1L << (ASYMMETRIC - 260)) | (1L << (SERVER - 260)) | (1L << (RECEIVE - 260)) | (1L << (CHANGE - 260)) | (1L << (TRACE - 260)) | (1L << (TRACKING - 260)) | (1L << (RESOURCES - 260)) | (1L << (SETTINGS - 260)) | (1L << (STATE - 260)) | (1L << (AVAILABILITY - 260)) | (1L << (CREDENTIAL - 260)) | (1L << (ENDPOINT - 260)) | (1L << (EVENT - 260)) | (1L << (NOTIFICATION - 260)) | (1L << (LINKED - 260)) | (1L << (AUDIT - 260)) | (1L << (DDL - 260)) | (1L << (XML - 260)) | (1L << (IMPERSONATE - 260)) | (1L << (SECURABLES - 260)) | (1L << (AUTHENTICATE - 260)) | (1L << (EXTERNAL - 260)) | (1L << (ACCESS - 260)) | (1L << (ADMINISTER - 260)) | (1L << (BULK - 260)) | (1L << (OPERATIONS - 260)) | (1L << (UNSAFE - 260)) | (1L << (SHUTDOWN - 260)) | (1L << (SCOPED - 260)) | (1L << (CONFIGURATION - 260)) | (1L << (DATASPACE - 260)) | (1L << (SERVICE - 260)) | (1L << (CERTIFICATE - 260)) | (1L << (CONTRACT - 260)) | (1L << (ENCRYPTION - 260)) | (1L << (MASTER - 260)) | (1L << (DATA - 260)) | (1L << (SOURCE - 260)) | (1L << (FILE - 260)) | (1L << (FORMAT - 260)) | (1L << (LIBRARY - 260)) | (1L << (FULLTEXT - 260)) | (1L << (MASK - 260)) | (1L << (UNMASK - 260)) | (1L << (MESSAGE - 260)) | (1L << (TYPE - 260)) | (1L << (REMOTE - 260)) | (1L << (BINDING - 260)) | (1L << (ROUTE - 260)) | (1L << (SECURITY - 260)) | (1L << (POLICY - 260)) | (1L << (AGGREGATE - 260)) | (1L << (QUEUE - 260)) | (1L << (RULE - 260)) | (1L << (SYNONYM - 260)) | (1L << (COLLECTION - 260)) | (1L << (SCRIPT - 260)) | (1L << (KILL - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (BACKUP - 324)) | (1L << (LOG - 324)) | (1L << (SHOWPLAN - 324)) | (1L << (SUBSCRIBE - 324)) | (1L << (QUERY - 324)) | (1L << (NOTIFICATIONS - 324)) | (1L << (CHECKPOINT - 324)) | (1L << (SEQUENCE - 324)) | (1L << (ABORT_AFTER_WAIT - 324)) | (1L << (ALLOW_PAGE_LOCKS - 324)) | (1L << (ALLOW_ROW_LOCKS - 324)) | (1L << (ALL_SPARSE_COLUMNS - 324)) | (1L << (BUCKET_COUNT - 324)) | (1L << (COLUMNSTORE_ARCHIVE - 324)) | (1L << (COLUMN_ENCRYPTION_KEY - 324)) | (1L << (COLUMN_SET - 324)) | (1L << (COMPRESSION_DELAY - 324)) | (1L << (DATABASE_DEAULT - 324)) | (1L << (DATA_COMPRESSION - 324)) | (1L << (DATA_CONSISTENCY_CHECK - 324)) | (1L << (ENCRYPTION_TYPE - 324)) | (1L << (SYSTEM_TIME - 324)) | (1L << (SYSTEM_VERSIONING - 324)) | (1L << (TEXTIMAGE_ON - 324)) | (1L << (WAIT_AT_LOW_PRIORITY - 324)) | (1L << (STATISTICS_INCREMENTAL - 324)) | (1L << (STATISTICS_NORECOMPUTE - 324)) | (1L << (ROUND_ROBIN - 324)) | (1L << (SCHEMA_AND_DATA - 324)) | (1L << (SCHEMA_ONLY - 324)) | (1L << (SORT_IN_TEMPDB - 324)) | (1L << (IGNORE_DUP_KEY - 324)) | (1L << (IMPLICIT_TRANSACTIONS - 324)) | (1L << (MAX_DURATION - 324)) | (1L << (MEMORY_OPTIMIZED - 324)) | (1L << (MIGRATION_STATE - 324)) | (1L << (PAD_INDEX - 324)) | (1L << (REMOTE_DATA_ARCHIVE - 324)) | (1L << (FILESTREAM_ON - 324)) | (1L << (FILETABLE_COLLATE_FILENAME - 324)) | (1L << (FILETABLE_DIRECTORY - 324)) | (1L << (FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME - 324)) | (1L << (FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME - 324)) | (1L << (FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME - 324)) | (1L << (FILTER_PREDICATE - 324)) | (1L << (HISTORY_RETENTION_PERIOD - 324)) | (1L << (HISTORY_TABLE - 324)) | (1L << (LOCK_ESCALATION - 324)) | (1L << (DROP_EXISTING - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (IDENTIFIER_ - 324)) | (1L << (STRING_ - 324)) | (1L << (NUMBER_ - 324)) | (1L << (HEX_DIGIT_ - 324)) | (1L << (BIT_NUM_ - 324)))) != 0)) {
				{
				setState(1199);
				simpleExpr(0);
				}
			}

			setState(1203); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1202);
					caseWhen_();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1205); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1207);
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
		public TerminalNode WHEN() { return getToken(SQLServerStatementParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(SQLServerStatementParser.THEN, 0); }
		public CaseWhen_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen_; }
	}

	public final CaseWhen_Context caseWhen_() throws RecognitionException {
		CaseWhen_Context _localctx = new CaseWhen_Context(_ctx, getState());
		enterRule(_localctx, 146, RULE_caseWhen_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			match(WHEN);
			setState(1211);
			expr(0);
			setState(1212);
			match(THEN);
			setState(1213);
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
		public TerminalNode ELSE() { return getToken(SQLServerStatementParser.ELSE, 0); }
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
		enterRule(_localctx, 148, RULE_caseElse_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			match(ELSE);
			setState(1216);
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

	public static class PrivateExprOfDbContext extends ParserRuleContext {
		public WindowedFunctionContext windowedFunction() {
			return getRuleContext(WindowedFunctionContext.class,0);
		}
		public AtTimeZoneExprContext atTimeZoneExpr() {
			return getRuleContext(AtTimeZoneExprContext.class,0);
		}
		public CastExprContext castExpr() {
			return getRuleContext(CastExprContext.class,0);
		}
		public ConvertExprContext convertExpr() {
			return getRuleContext(ConvertExprContext.class,0);
		}
		public PrivateExprOfDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateExprOfDb; }
	}

	public final PrivateExprOfDbContext privateExprOfDb() throws RecognitionException {
		PrivateExprOfDbContext _localctx = new PrivateExprOfDbContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_privateExprOfDb);
		try {
			setState(1222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				windowedFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1219);
				atTimeZoneExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1220);
				castExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1221);
				convertExpr();
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SQLServerStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLServerStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			match(ORDER);
			setState(1225);
			match(BY);
			setState(1226);
			orderByItem();
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1227);
				match(COMMA_);
				setState(1228);
				orderByItem();
				}
				}
				setState(1233);
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
		public TerminalNode ASC() { return getToken(SQLServerStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLServerStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1234);
				columnName();
				}
				break;
			case 2:
				{
				setState(1235);
				numberLiterals();
				}
				break;
			case 3:
				{
				setState(1236);
				expr(0);
				}
				break;
			}
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1239);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode MAX() { return getToken(SQLServerStatementParser.MAX, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode CONTENT() { return getToken(SQLServerStatementParser.CONTENT, 0); }
		public TerminalNode DOCUMENT() { return getToken(SQLServerStatementParser.DOCUMENT, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			dataTypeName_();
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1243);
				dataTypeLength();
				}
				break;
			case 2:
				{
				setState(1244);
				match(LP_);
				setState(1245);
				match(MAX);
				setState(1246);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(1247);
				match(LP_);
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTENT || _la==DOCUMENT) {
					{
					setState(1248);
					_la = _input.LA(1);
					if ( !(_la==CONTENT || _la==DOCUMENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1251);
				ignoredIdentifier_();
				setState(1252);
				match(RP_);
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

	public static class DataTypeName_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public DataTypeName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName_; }
	}

	public final DataTypeName_Context dataTypeName_() throws RecognitionException {
		DataTypeName_Context _localctx = new DataTypeName_Context(_ctx, getState());
		enterRule(_localctx, 158, RULE_dataTypeName_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
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

	public static class AtTimeZoneExprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(SQLServerStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SQLServerStatementParser.ZONE, 0); }
		public AtTimeZoneExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atTimeZoneExpr; }
	}

	public final AtTimeZoneExprContext atTimeZoneExpr() throws RecognitionException {
		AtTimeZoneExprContext _localctx = new AtTimeZoneExprContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_atTimeZoneExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			match(IDENTIFIER_);
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1259);
				match(WITH);
				setState(1260);
				match(TIME);
				setState(1261);
				match(ZONE);
				}
			}

			setState(1264);
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

	public static class CastExprContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(SQLServerStatementParser.CAST, 0); }
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public CastExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpr; }
	}

	public final CastExprContext castExpr() throws RecognitionException {
		CastExprContext _localctx = new CastExprContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_castExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(CAST);
			setState(1267);
			match(LP_);
			setState(1268);
			expr(0);
			setState(1269);
			match(AS);
			setState(1270);
			dataType();
			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1271);
				match(LP_);
				setState(1272);
				match(NUMBER_);
				setState(1273);
				match(RP_);
				}
			}

			setState(1276);
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

	public static class ConvertExprContext extends ParserRuleContext {
		public TerminalNode CONVERT() { return getToken(SQLServerStatementParser.CONVERT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(SQLServerStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQLServerStatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public ConvertExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertExpr; }
	}

	public final ConvertExprContext convertExpr() throws RecognitionException {
		ConvertExprContext _localctx = new ConvertExprContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_convertExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			match(CONVERT);
			{
			setState(1279);
			dataType();
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1280);
				match(LP_);
				setState(1281);
				match(NUMBER_);
				setState(1282);
				match(RP_);
				}
			}

			setState(1285);
			match(COMMA_);
			setState(1286);
			expr(0);
			setState(1289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1287);
				match(COMMA_);
				setState(1288);
				match(NUMBER_);
				}
				break;
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

	public static class WindowedFunctionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public OverClauseContext overClause() {
			return getRuleContext(OverClauseContext.class,0);
		}
		public WindowedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowedFunction; }
	}

	public final WindowedFunctionContext windowedFunction() throws RecognitionException {
		WindowedFunctionContext _localctx = new WindowedFunctionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_windowedFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			functionCall();
			setState(1292);
			overClause();
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

	public static class OverClauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(SQLServerStatementParser.OVER, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public PartitionByClauseContext partitionByClause() {
			return getRuleContext(PartitionByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public RowRangeClauseContext rowRangeClause() {
			return getRuleContext(RowRangeClauseContext.class,0);
		}
		public OverClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overClause; }
	}

	public final OverClauseContext overClause() throws RecognitionException {
		OverClauseContext _localctx = new OverClauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_overClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			match(OVER);
			setState(1295);
			match(LP_);
			setState(1297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1296);
				partitionByClause();
				}
			}

			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1299);
				orderByClause();
				}
			}

			setState(1303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROWS || _la==RANGE) {
				{
				setState(1302);
				rowRangeClause();
				}
			}

			setState(1305);
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

	public static class PartitionByClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SQLServerStatementParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(SQLServerStatementParser.BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionByClause; }
	}

	public final PartitionByClauseContext partitionByClause() throws RecognitionException {
		PartitionByClauseContext _localctx = new PartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_partitionByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			match(PARTITION);
			setState(1308);
			match(BY);
			setState(1309);
			expr(0);
			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1310);
				match(COMMA_);
				setState(1311);
				expr(0);
				}
				}
				setState(1316);
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

	public static class RowRangeClauseContext extends ParserRuleContext {
		public WindowFrameExtentContext windowFrameExtent() {
			return getRuleContext(WindowFrameExtentContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SQLServerStatementParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(SQLServerStatementParser.RANGE, 0); }
		public RowRangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowRangeClause; }
	}

	public final RowRangeClauseContext rowRangeClause() throws RecognitionException {
		RowRangeClauseContext _localctx = new RowRangeClauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_rowRangeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1317);
			_la = _input.LA(1);
			if ( !(_la==ROWS || _la==RANGE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1318);
			windowFrameExtent();
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

	public static class WindowFrameExtentContext extends ParserRuleContext {
		public WindowFramePrecedingContext windowFramePreceding() {
			return getRuleContext(WindowFramePrecedingContext.class,0);
		}
		public WindowFrameBetweenContext windowFrameBetween() {
			return getRuleContext(WindowFrameBetweenContext.class,0);
		}
		public WindowFrameExtentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameExtent; }
	}

	public final WindowFrameExtentContext windowFrameExtent() throws RecognitionException {
		WindowFrameExtentContext _localctx = new WindowFrameExtentContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_windowFrameExtent);
		try {
			setState(1322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURRENT:
			case UNBOUNDED:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1320);
				windowFramePreceding();
				}
				break;
			case BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1321);
				windowFrameBetween();
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

	public static class WindowFrameBetweenContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(SQLServerStatementParser.BETWEEN, 0); }
		public List<WindowFrameBoundContext> windowFrameBound() {
			return getRuleContexts(WindowFrameBoundContext.class);
		}
		public WindowFrameBoundContext windowFrameBound(int i) {
			return getRuleContext(WindowFrameBoundContext.class,i);
		}
		public TerminalNode AND() { return getToken(SQLServerStatementParser.AND, 0); }
		public WindowFrameBetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameBetween; }
	}

	public final WindowFrameBetweenContext windowFrameBetween() throws RecognitionException {
		WindowFrameBetweenContext _localctx = new WindowFrameBetweenContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_windowFrameBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			match(BETWEEN);
			setState(1325);
			windowFrameBound();
			setState(1326);
			match(AND);
			setState(1327);
			windowFrameBound();
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

	public static class WindowFrameBoundContext extends ParserRuleContext {
		public WindowFramePrecedingContext windowFramePreceding() {
			return getRuleContext(WindowFramePrecedingContext.class,0);
		}
		public WindowFrameFollowingContext windowFrameFollowing() {
			return getRuleContext(WindowFrameFollowingContext.class,0);
		}
		public WindowFrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameBound; }
	}

	public final WindowFrameBoundContext windowFrameBound() throws RecognitionException {
		WindowFrameBoundContext _localctx = new WindowFrameBoundContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_windowFrameBound);
		try {
			setState(1331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1329);
				windowFramePreceding();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1330);
				windowFrameFollowing();
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

	public static class WindowFramePrecedingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(SQLServerStatementParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SQLServerStatementParser.PRECEDING, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode CURRENT() { return getToken(SQLServerStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public WindowFramePrecedingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFramePreceding; }
	}

	public final WindowFramePrecedingContext windowFramePreceding() throws RecognitionException {
		WindowFramePrecedingContext _localctx = new WindowFramePrecedingContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_windowFramePreceding);
		try {
			setState(1339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1333);
				match(UNBOUNDED);
				setState(1334);
				match(PRECEDING);
				}
				break;
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1335);
				match(NUMBER_);
				setState(1336);
				match(PRECEDING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1337);
				match(CURRENT);
				setState(1338);
				match(ROW);
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

	public static class WindowFrameFollowingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(SQLServerStatementParser.UNBOUNDED, 0); }
		public TerminalNode FOLLOWING() { return getToken(SQLServerStatementParser.FOLLOWING, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode CURRENT() { return getToken(SQLServerStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public WindowFrameFollowingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameFollowing; }
	}

	public final WindowFrameFollowingContext windowFrameFollowing() throws RecognitionException {
		WindowFrameFollowingContext _localctx = new WindowFrameFollowingContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_windowFrameFollowing);
		try {
			setState(1347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1341);
				match(UNBOUNDED);
				setState(1342);
				match(FOLLOWING);
				}
				break;
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1343);
				match(NUMBER_);
				setState(1344);
				match(FOLLOWING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1345);
				match(CURRENT);
				setState(1346);
				match(ROW);
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

	public static class ColumnNameWithSortContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLServerStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLServerStatementParser.DESC, 0); }
		public ColumnNameWithSortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameWithSort; }
	}

	public final ColumnNameWithSortContext columnNameWithSort() throws RecognitionException {
		ColumnNameWithSortContext _localctx = new ColumnNameWithSortContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_columnNameWithSort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			columnName();
			setState(1351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1350);
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

	public static class IndexOptionContext extends ParserRuleContext {
		public TerminalNode FILLFACTOR() { return getToken(SQLServerStatementParser.FILLFACTOR, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public EqOnOffOptionContext eqOnOffOption() {
			return getRuleContext(EqOnOffOptionContext.class,0);
		}
		public EqTimeContext eqTime() {
			return getRuleContext(EqTimeContext.class,0);
		}
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public TerminalNode MAX_DURATION() { return getToken(SQLServerStatementParser.MAX_DURATION, 0); }
		public TerminalNode MAXDOP() { return getToken(SQLServerStatementParser.MAXDOP, 0); }
		public CompressionOptionContext compressionOption() {
			return getRuleContext(CompressionOptionContext.class,0);
		}
		public OnPartitionClauseContext onPartitionClause() {
			return getRuleContext(OnPartitionClauseContext.class,0);
		}
		public IndexOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOption; }
	}

	public final IndexOptionContext indexOption() throws RecognitionException {
		IndexOptionContext _localctx = new IndexOptionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_indexOption);
		int _la;
		try {
			setState(1366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1353);
				match(FILLFACTOR);
				setState(1354);
				match(EQ_);
				setState(1355);
				match(NUMBER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1356);
				eqOnOffOption();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1357);
				_la = _input.LA(1);
				if ( !(_la==COMPRESSION_DELAY || _la==MAX_DURATION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1358);
				eqTime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1359);
				match(MAXDOP);
				setState(1360);
				match(EQ_);
				setState(1361);
				match(NUMBER_);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1362);
				compressionOption();
				setState(1364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1363);
					onPartitionClause();
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

	public static class CompressionOptionContext extends ParserRuleContext {
		public TerminalNode DATA_COMPRESSION() { return getToken(SQLServerStatementParser.DATA_COMPRESSION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NONE() { return getToken(SQLServerStatementParser.NONE, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode PAGE() { return getToken(SQLServerStatementParser.PAGE, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode COLUMNSTORE_ARCHIVE() { return getToken(SQLServerStatementParser.COLUMNSTORE_ARCHIVE, 0); }
		public CompressionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compressionOption; }
	}

	public final CompressionOptionContext compressionOption() throws RecognitionException {
		CompressionOptionContext _localctx = new CompressionOptionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_compressionOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			match(DATA_COMPRESSION);
			setState(1369);
			match(EQ_);
			setState(1370);
			_la = _input.LA(1);
			if ( !(((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (ROW - 175)) | (1L << (COLUMNSTORE - 175)) | (1L << (NONE - 175)) | (1L << (PAGE - 175)))) != 0) || _la==COLUMNSTORE_ARCHIVE) ) {
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

	public static class EqTimeContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public EqTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqTime; }
	}

	public final EqTimeContext eqTime() throws RecognitionException {
		EqTimeContext _localctx = new EqTimeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_eqTime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			match(EQ_);
			setState(1373);
			match(NUMBER_);
			setState(1375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUTES) {
				{
				setState(1374);
				match(MINUTES);
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

	public static class EqOnOffOptionContext extends ParserRuleContext {
		public EqKeyContext eqKey() {
			return getRuleContext(EqKeyContext.class,0);
		}
		public EqOnOffContext eqOnOff() {
			return getRuleContext(EqOnOffContext.class,0);
		}
		public EqOnOffOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOnOffOption; }
	}

	public final EqOnOffOptionContext eqOnOffOption() throws RecognitionException {
		EqOnOffOptionContext _localctx = new EqOnOffOptionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_eqOnOffOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			eqKey();
			setState(1378);
			eqOnOff();
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

	public static class EqKeyContext extends ParserRuleContext {
		public TerminalNode PAD_INDEX() { return getToken(SQLServerStatementParser.PAD_INDEX, 0); }
		public TerminalNode SORT_IN_TEMPDB() { return getToken(SQLServerStatementParser.SORT_IN_TEMPDB, 0); }
		public TerminalNode IGNORE_DUP_KEY() { return getToken(SQLServerStatementParser.IGNORE_DUP_KEY, 0); }
		public TerminalNode STATISTICS_NORECOMPUTE() { return getToken(SQLServerStatementParser.STATISTICS_NORECOMPUTE, 0); }
		public TerminalNode STATISTICS_INCREMENTAL() { return getToken(SQLServerStatementParser.STATISTICS_INCREMENTAL, 0); }
		public TerminalNode DROP_EXISTING() { return getToken(SQLServerStatementParser.DROP_EXISTING, 0); }
		public TerminalNode ONLINE() { return getToken(SQLServerStatementParser.ONLINE, 0); }
		public TerminalNode RESUMABLE() { return getToken(SQLServerStatementParser.RESUMABLE, 0); }
		public TerminalNode ALLOW_ROW_LOCKS() { return getToken(SQLServerStatementParser.ALLOW_ROW_LOCKS, 0); }
		public TerminalNode ALLOW_PAGE_LOCKS() { return getToken(SQLServerStatementParser.ALLOW_PAGE_LOCKS, 0); }
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public EqKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqKey; }
	}

	public final EqKeyContext eqKey() throws RecognitionException {
		EqKeyContext _localctx = new EqKeyContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_eqKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			_la = _input.LA(1);
			if ( !(_la==ONLINE || _la==RESUMABLE || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (ALLOW_PAGE_LOCKS - 333)) | (1L << (ALLOW_ROW_LOCKS - 333)) | (1L << (COMPRESSION_DELAY - 333)) | (1L << (STATISTICS_INCREMENTAL - 333)) | (1L << (STATISTICS_NORECOMPUTE - 333)) | (1L << (SORT_IN_TEMPDB - 333)) | (1L << (IGNORE_DUP_KEY - 333)) | (1L << (PAD_INDEX - 333)) | (1L << (DROP_EXISTING - 333)))) != 0)) ) {
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

	public static class EqOnOffContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public EqOnOffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOnOff; }
	}

	public final EqOnOffContext eqOnOff() throws RecognitionException {
		EqOnOffContext _localctx = new EqOnOffContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_eqOnOff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			match(EQ_);
			setState(1383);
			_la = _input.LA(1);
			if ( !(_la==ON || _la==OFF) ) {
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

	public static class OnPartitionClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode PARTITIONS() { return getToken(SQLServerStatementParser.PARTITIONS, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public PartitionExpressionsContext partitionExpressions() {
			return getRuleContext(PartitionExpressionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public OnPartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onPartitionClause; }
	}

	public final OnPartitionClauseContext onPartitionClause() throws RecognitionException {
		OnPartitionClauseContext _localctx = new OnPartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_onPartitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			match(ON);
			setState(1386);
			match(PARTITIONS);
			setState(1387);
			match(LP_);
			setState(1388);
			partitionExpressions();
			setState(1389);
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

	public static class PartitionExpressionsContext extends ParserRuleContext {
		public List<PartitionExpressionContext> partitionExpression() {
			return getRuleContexts(PartitionExpressionContext.class);
		}
		public PartitionExpressionContext partitionExpression(int i) {
			return getRuleContext(PartitionExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PartitionExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionExpressions; }
	}

	public final PartitionExpressionsContext partitionExpressions() throws RecognitionException {
		PartitionExpressionsContext _localctx = new PartitionExpressionsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_partitionExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			partitionExpression();
			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1392);
				match(COMMA_);
				setState(1393);
				partitionExpression();
				}
				}
				setState(1398);
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

	public static class PartitionExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public NumberRangeContext numberRange() {
			return getRuleContext(NumberRangeContext.class,0);
		}
		public PartitionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionExpression; }
	}

	public final PartitionExpressionContext partitionExpression() throws RecognitionException {
		PartitionExpressionContext _localctx = new PartitionExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_partitionExpression);
		try {
			setState(1401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1399);
				match(NUMBER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1400);
				numberRange();
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

	public static class NumberRangeContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER_() { return getTokens(SQLServerStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQLServerStatementParser.NUMBER_, i);
		}
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public NumberRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberRange; }
	}

	public final NumberRangeContext numberRange() throws RecognitionException {
		NumberRangeContext _localctx = new NumberRangeContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_numberRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			match(NUMBER_);
			setState(1404);
			match(TO);
			setState(1405);
			match(NUMBER_);
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

	public static class LowPriorityLockWaitContext extends ParserRuleContext {
		public TerminalNode WAIT_AT_LOW_PRIORITY() { return getToken(SQLServerStatementParser.WAIT_AT_LOW_PRIORITY, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode MAX_DURATION() { return getToken(SQLServerStatementParser.MAX_DURATION, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode ABORT_AFTER_WAIT() { return getToken(SQLServerStatementParser.ABORT_AFTER_WAIT, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode NONE() { return getToken(SQLServerStatementParser.NONE, 0); }
		public TerminalNode SELF() { return getToken(SQLServerStatementParser.SELF, 0); }
		public TerminalNode BLOCKERS() { return getToken(SQLServerStatementParser.BLOCKERS, 0); }
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public LowPriorityLockWaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowPriorityLockWait; }
	}

	public final LowPriorityLockWaitContext lowPriorityLockWait() throws RecognitionException {
		LowPriorityLockWaitContext _localctx = new LowPriorityLockWaitContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_lowPriorityLockWait);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			match(WAIT_AT_LOW_PRIORITY);
			setState(1408);
			match(LP_);
			setState(1409);
			match(MAX_DURATION);
			setState(1410);
			match(EQ_);
			setState(1411);
			match(NUMBER_);
			setState(1413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUTES) {
				{
				setState(1412);
				match(MINUTES);
				}
			}

			setState(1415);
			match(COMMA_);
			setState(1416);
			match(ABORT_AFTER_WAIT);
			setState(1417);
			match(EQ_);
			setState(1418);
			_la = _input.LA(1);
			if ( !(((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (BLOCKERS - 194)) | (1L << (NONE - 194)) | (1L << (SELF - 194)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1419);
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

	public static class OnLowPriorLockWaitContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public LowPriorityLockWaitContext lowPriorityLockWait() {
			return getRuleContext(LowPriorityLockWaitContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public OnLowPriorLockWaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onLowPriorLockWait; }
	}

	public final OnLowPriorLockWaitContext onLowPriorLockWait() throws RecognitionException {
		OnLowPriorLockWaitContext _localctx = new OnLowPriorLockWaitContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_onLowPriorLockWait);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			match(ON);
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1422);
				match(LP_);
				setState(1423);
				lowPriorityLockWait();
				setState(1424);
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

	public static class IgnoredIdentifier_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public IgnoredIdentifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier_; }
	}

	public final IgnoredIdentifier_Context ignoredIdentifier_() throws RecognitionException {
		IgnoredIdentifier_Context _localctx = new IgnoredIdentifier_Context(_ctx, getState());
		enterRule(_localctx, 210, RULE_ignoredIdentifier_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
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

	public static class IgnoredIdentifiers_Context extends ParserRuleContext {
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public IgnoredIdentifiers_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers_; }
	}

	public final IgnoredIdentifiers_Context ignoredIdentifiers_() throws RecognitionException {
		IgnoredIdentifiers_Context _localctx = new IgnoredIdentifiers_Context(_ctx, getState());
		enterRule(_localctx, 212, RULE_ignoredIdentifiers_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			ignoredIdentifier_();
			setState(1435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1431);
				match(COMMA_);
				setState(1432);
				ignoredIdentifier_();
				}
				}
				setState(1437);
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

	public static class MatchNoneContext extends ParserRuleContext {
		public MatchNoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchNone; }
	}

	public final MatchNoneContext matchNone() throws RecognitionException {
		MatchNoneContext _localctx = new MatchNoneContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_matchNone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1438);
			match(T__0);
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
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public FileTableClause_Context fileTableClause_() {
			return getRuleContext(FileTableClause_Context.class,0);
		}
		public CreateDefinitionClause_Context createDefinitionClause_() {
			return getRuleContext(CreateDefinitionClause_Context.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_createTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			match(CREATE);
			setState(1441);
			match(TABLE);
			setState(1442);
			tableName();
			setState(1443);
			fileTableClause_();
			setState(1444);
			createDefinitionClause_();
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
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public CreateIndexSpecification_Context createIndexSpecification_() {
			return getRuleContext(CreateIndexSpecification_Context.class,0);
		}
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_createIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			match(CREATE);
			setState(1447);
			createIndexSpecification_();
			setState(1448);
			match(INDEX);
			setState(1449);
			indexName();
			setState(1450);
			match(ON);
			setState(1451);
			tableName();
			setState(1452);
			columnNames();
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
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
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
		enterRule(_localctx, 220, RULE_alterTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			match(ALTER);
			setState(1455);
			match(TABLE);
			setState(1456);
			tableName();
			setState(1457);
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
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_alterIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			match(ALTER);
			setState(1460);
			match(INDEX);
			setState(1463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case ARRAY:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case TYPE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case IDENTIFIER_:
				{
				setState(1461);
				indexName();
				}
				break;
			case ALL:
				{
				setState(1462);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1465);
			match(ON);
			setState(1466);
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public IfExist_Context ifExist_() {
			return getRuleContext(IfExist_Context.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_dropTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			match(DROP);
			setState(1469);
			match(TABLE);
			setState(1471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1470);
				ifExist_();
				}
			}

			setState(1473);
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
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IfExist_Context ifExist_() {
			return getRuleContext(IfExist_Context.class,0);
		}
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_dropIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			match(DROP);
			setState(1476);
			match(INDEX);
			setState(1478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1477);
				ifExist_();
				}
			}

			setState(1480);
			indexName();
			setState(1481);
			match(ON);
			setState(1482);
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

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(SQLServerStatementParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_truncateTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			match(TRUNCATE);
			setState(1485);
			match(TABLE);
			setState(1486);
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

	public static class FileTableClause_Context extends ParserRuleContext {
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode FILETABLE() { return getToken(SQLServerStatementParser.FILETABLE, 0); }
		public FileTableClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileTableClause_; }
	}

	public final FileTableClause_Context fileTableClause_() throws RecognitionException {
		FileTableClause_Context _localctx = new FileTableClause_Context(_ctx, getState());
		enterRule(_localctx, 230, RULE_fileTableClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1488);
				match(AS);
				setState(1489);
				match(FILETABLE);
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

	public static class CreateDefinitionClause_Context extends ParserRuleContext {
		public CreateTableDefinitions_Context createTableDefinitions_() {
			return getRuleContext(CreateTableDefinitions_Context.class,0);
		}
		public PartitionScheme_Context partitionScheme_() {
			return getRuleContext(PartitionScheme_Context.class,0);
		}
		public FileGroup_Context fileGroup_() {
			return getRuleContext(FileGroup_Context.class,0);
		}
		public CreateDefinitionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitionClause_; }
	}

	public final CreateDefinitionClause_Context createDefinitionClause_() throws RecognitionException {
		CreateDefinitionClause_Context _localctx = new CreateDefinitionClause_Context(_ctx, getState());
		enterRule(_localctx, 232, RULE_createDefinitionClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			createTableDefinitions_();
			setState(1493);
			partitionScheme_();
			setState(1494);
			fileGroup_();
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

	public static class CreateTableDefinitions_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<CreateTableDefinition_Context> createTableDefinition_() {
			return getRuleContexts(CreateTableDefinition_Context.class);
		}
		public CreateTableDefinition_Context createTableDefinition_(int i) {
			return getRuleContext(CreateTableDefinition_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PeriodClauseContext periodClause() {
			return getRuleContext(PeriodClauseContext.class,0);
		}
		public CreateTableDefinitions_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableDefinitions_; }
	}

	public final CreateTableDefinitions_Context createTableDefinitions_() throws RecognitionException {
		CreateTableDefinitions_Context _localctx = new CreateTableDefinitions_Context(_ctx, getState());
		enterRule(_localctx, 234, RULE_createTableDefinitions_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			match(LP_);
			setState(1497);
			createTableDefinition_();
			setState(1502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1498);
					match(COMMA_);
					setState(1499);
					createTableDefinition_();
					}
					} 
				}
				setState(1504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(1505);
				match(COMMA_);
				setState(1506);
				periodClause();
				}
			}

			setState(1509);
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

	public static class CreateTableDefinition_Context extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public ComputedColumnDefinitionContext computedColumnDefinition() {
			return getRuleContext(ComputedColumnDefinitionContext.class,0);
		}
		public ColumnSetDefinitionContext columnSetDefinition() {
			return getRuleContext(ColumnSetDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableIndexContext tableIndex() {
			return getRuleContext(TableIndexContext.class,0);
		}
		public CreateTableDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableDefinition_; }
	}

	public final CreateTableDefinition_Context createTableDefinition_() throws RecognitionException {
		CreateTableDefinition_Context _localctx = new CreateTableDefinition_Context(_ctx, getState());
		enterRule(_localctx, 236, RULE_createTableDefinition_);
		try {
			setState(1516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1511);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1512);
				computedColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1513);
				columnSetDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1514);
				tableConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1515);
				tableIndex();
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
		public ColumnConstraintsContext columnConstraints() {
			return getRuleContext(ColumnConstraintsContext.class,0);
		}
		public List<ColumnDefinitionOptionContext> columnDefinitionOption() {
			return getRuleContexts(ColumnDefinitionOptionContext.class);
		}
		public ColumnDefinitionOptionContext columnDefinitionOption(int i) {
			return getRuleContext(ColumnDefinitionOptionContext.class,i);
		}
		public ColumnIndexContext columnIndex() {
			return getRuleContext(ColumnIndexContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_columnDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			columnName();
			setState(1519);
			dataType();
			setState(1523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1520);
					columnDefinitionOption();
					}
					} 
				}
				setState(1525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			setState(1526);
			columnConstraints();
			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX) {
				{
				setState(1527);
				columnIndex();
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

	public static class ColumnDefinitionOptionContext extends ParserRuleContext {
		public TerminalNode FILESTREAM() { return getToken(SQLServerStatementParser.FILESTREAM, 0); }
		public TerminalNode COLLATE() { return getToken(SQLServerStatementParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode SPARSE() { return getToken(SQLServerStatementParser.SPARSE, 0); }
		public TerminalNode MASKED() { return getToken(SQLServerStatementParser.MASKED, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode FUNCTION() { return getToken(SQLServerStatementParser.FUNCTION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode IDENTITY() { return getToken(SQLServerStatementParser.IDENTITY, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(SQLServerStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQLServerStatementParser.NUMBER_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public TerminalNode GENERATED() { return getToken(SQLServerStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(SQLServerStatementParser.ALWAYS, 0); }
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode START() { return getToken(SQLServerStatementParser.START, 0); }
		public TerminalNode END() { return getToken(SQLServerStatementParser.END, 0); }
		public TerminalNode HIDDEN_() { return getToken(SQLServerStatementParser.HIDDEN_, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode ROWGUIDCOL() { return getToken(SQLServerStatementParser.ROWGUIDCOL, 0); }
		public TerminalNode ENCRYPTED() { return getToken(SQLServerStatementParser.ENCRYPTED, 0); }
		public EncryptedOptions_Context encryptedOptions_() {
			return getRuleContext(EncryptedOptions_Context.class,0);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnIndexContext columnIndex() {
			return getRuleContext(ColumnIndexContext.class,0);
		}
		public ColumnDefinitionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinitionOption; }
	}

	public final ColumnDefinitionOptionContext columnDefinitionOption() throws RecognitionException {
		ColumnDefinitionOptionContext _localctx = new ColumnDefinitionOptionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_columnDefinitionOption);
		int _la;
		try {
			int _alt;
			setState(1583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1530);
				match(FILESTREAM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1531);
				match(COLLATE);
				setState(1532);
				collationName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1533);
				match(SPARSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1534);
				match(MASKED);
				setState(1535);
				match(WITH);
				setState(1536);
				match(LP_);
				setState(1537);
				match(FUNCTION);
				setState(1538);
				match(EQ_);
				setState(1539);
				match(STRING_);
				setState(1540);
				match(RP_);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1541);
					match(CONSTRAINT);
					setState(1542);
					ignoredIdentifier_();
					}
				}

				setState(1545);
				match(DEFAULT);
				setState(1546);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1547);
				match(IDENTITY);
				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1548);
					match(LP_);
					setState(1549);
					match(NUMBER_);
					setState(1550);
					match(COMMA_);
					setState(1551);
					match(NUMBER_);
					setState(1552);
					match(RP_);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1555);
				match(NOT);
				setState(1556);
				match(FOR);
				setState(1557);
				match(REPLICATION);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1558);
				match(GENERATED);
				setState(1559);
				match(ALWAYS);
				setState(1560);
				match(AS);
				setState(1561);
				match(ROW);
				setState(1562);
				_la = _input.LA(1);
				if ( !(_la==START || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HIDDEN_) {
					{
					setState(1563);
					match(HIDDEN_);
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1566);
					match(NOT);
					}
				}

				setState(1569);
				match(NULL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1570);
				match(ROWGUIDCOL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1571);
				match(ENCRYPTED);
				setState(1572);
				match(WITH);
				setState(1573);
				encryptedOptions_();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1574);
				columnConstraint();
				setState(1579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1575);
						match(COMMA_);
						setState(1576);
						columnConstraint();
						}
						} 
					}
					setState(1581);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1582);
				columnIndex();
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

	public static class EncryptedOptions_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode COLUMN_ENCRYPTION_KEY() { return getToken(SQLServerStatementParser.COLUMN_ENCRYPTION_KEY, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode ENCRYPTION_TYPE() { return getToken(SQLServerStatementParser.ENCRYPTION_TYPE, 0); }
		public TerminalNode ALGORITHM() { return getToken(SQLServerStatementParser.ALGORITHM, 0); }
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(SQLServerStatementParser.DETERMINISTIC, 0); }
		public TerminalNode RANDOMIZED() { return getToken(SQLServerStatementParser.RANDOMIZED, 0); }
		public EncryptedOptions_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encryptedOptions_; }
	}

	public final EncryptedOptions_Context encryptedOptions_() throws RecognitionException {
		EncryptedOptions_Context _localctx = new EncryptedOptions_Context(_ctx, getState());
		enterRule(_localctx, 242, RULE_encryptedOptions_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			match(LP_);
			setState(1586);
			match(COLUMN_ENCRYPTION_KEY);
			setState(1587);
			match(EQ_);
			setState(1588);
			ignoredIdentifier_();
			setState(1589);
			match(COMMA_);
			setState(1590);
			match(ENCRYPTION_TYPE);
			setState(1591);
			match(EQ_);
			setState(1592);
			_la = _input.LA(1);
			if ( !(_la==DETERMINISTIC || _la==RANDOMIZED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1593);
			match(COMMA_);
			setState(1594);
			match(ALGORITHM);
			setState(1595);
			match(EQ_);
			setState(1596);
			match(STRING_);
			setState(1597);
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

	public static class ColumnConstraintContext extends ParserRuleContext {
		public PrimaryKeyConstraintContext primaryKeyConstraint() {
			return getRuleContext(PrimaryKeyConstraintContext.class,0);
		}
		public ColumnForeignKeyConstraintContext columnForeignKeyConstraint() {
			return getRuleContext(ColumnForeignKeyConstraintContext.class,0);
		}
		public CheckConstraintContext checkConstraint() {
			return getRuleContext(CheckConstraintContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_columnConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1599);
				match(CONSTRAINT);
				setState(1600);
				ignoredIdentifier_();
				}
			}

			setState(1606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case UNIQUE:
			case KEY:
				{
				setState(1603);
				primaryKeyConstraint();
				}
				break;
			case FOREIGN:
			case REFERENCES:
				{
				setState(1604);
				columnForeignKeyConstraint();
				}
				break;
			case CHECK:
				{
				setState(1605);
				checkConstraint();
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

	public static class PrimaryKeyConstraintContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLServerStatementParser.UNIQUE, 0); }
		public DiskTablePrimaryKeyConstraintOptionContext diskTablePrimaryKeyConstraintOption() {
			return getRuleContext(DiskTablePrimaryKeyConstraintOptionContext.class,0);
		}
		public MemoryTablePrimaryKeyConstraintOptionContext memoryTablePrimaryKeyConstraintOption() {
			return getRuleContext(MemoryTablePrimaryKeyConstraintOptionContext.class,0);
		}
		public PrimaryKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyConstraint; }
	}

	public final PrimaryKeyConstraintContext primaryKeyConstraint() throws RecognitionException {
		PrimaryKeyConstraintContext _localctx = new PrimaryKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_primaryKeyConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case KEY:
				{
				setState(1608);
				primaryKey();
				}
				break;
			case UNIQUE:
				{
				setState(1609);
				match(UNIQUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1612);
				diskTablePrimaryKeyConstraintOption();
				}
				break;
			case 2:
				{
				setState(1613);
				memoryTablePrimaryKeyConstraintOption();
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

	public static class DiskTablePrimaryKeyConstraintOptionContext extends ParserRuleContext {
		public ClusterOption_Context clusterOption_() {
			return getRuleContext(ClusterOption_Context.class,0);
		}
		public PrimaryKeyWithClauseContext primaryKeyWithClause() {
			return getRuleContext(PrimaryKeyWithClauseContext.class,0);
		}
		public PrimaryKeyOnClauseContext primaryKeyOnClause() {
			return getRuleContext(PrimaryKeyOnClauseContext.class,0);
		}
		public DiskTablePrimaryKeyConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diskTablePrimaryKeyConstraintOption; }
	}

	public final DiskTablePrimaryKeyConstraintOptionContext diskTablePrimaryKeyConstraintOption() throws RecognitionException {
		DiskTablePrimaryKeyConstraintOptionContext _localctx = new DiskTablePrimaryKeyConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_diskTablePrimaryKeyConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(1616);
				clusterOption_();
				}
			}

			setState(1620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1619);
				primaryKeyWithClause();
				}
			}

			setState(1623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1622);
				primaryKeyOnClause();
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

	public static class ClusterOption_Context extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public ClusterOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterOption_; }
	}

	public final ClusterOption_Context clusterOption_() throws RecognitionException {
		ClusterOption_Context _localctx = new ClusterOption_Context(_ctx, getState());
		enterRule(_localctx, 250, RULE_clusterOption_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			_la = _input.LA(1);
			if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
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

	public static class PrimaryKeyWithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode FILLFACTOR() { return getToken(SQLServerStatementParser.FILLFACTOR, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PrimaryKeyWithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyWithClause; }
	}

	public final PrimaryKeyWithClauseContext primaryKeyWithClause() throws RecognitionException {
		PrimaryKeyWithClauseContext _localctx = new PrimaryKeyWithClauseContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_primaryKeyWithClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			match(WITH);
			setState(1642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILLFACTOR:
				{
				setState(1628);
				match(FILLFACTOR);
				setState(1629);
				match(EQ_);
				setState(1630);
				match(NUMBER_);
				}
				break;
			case LP_:
				{
				setState(1631);
				match(LP_);
				setState(1632);
				indexOption();
				setState(1637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1633);
					match(COMMA_);
					setState(1634);
					indexOption();
					}
					}
					setState(1639);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1640);
				match(RP_);
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

	public static class PrimaryKeyOnClauseContext extends ParserRuleContext {
		public OnSchemaColumnContext onSchemaColumn() {
			return getRuleContext(OnSchemaColumnContext.class,0);
		}
		public OnFileGroupContext onFileGroup() {
			return getRuleContext(OnFileGroupContext.class,0);
		}
		public OnStringContext onString() {
			return getRuleContext(OnStringContext.class,0);
		}
		public PrimaryKeyOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyOnClause; }
	}

	public final PrimaryKeyOnClauseContext primaryKeyOnClause() throws RecognitionException {
		PrimaryKeyOnClauseContext _localctx = new PrimaryKeyOnClauseContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_primaryKeyOnClause);
		try {
			setState(1647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1644);
				onSchemaColumn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1645);
				onFileGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1646);
				onString();
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

	public static class OnSchemaColumnContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public OnSchemaColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onSchemaColumn; }
	}

	public final OnSchemaColumnContext onSchemaColumn() throws RecognitionException {
		OnSchemaColumnContext _localctx = new OnSchemaColumnContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_onSchemaColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			match(ON);
			setState(1650);
			schemaName();
			setState(1651);
			match(LP_);
			setState(1652);
			columnName();
			setState(1653);
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

	public static class OnFileGroupContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public OnFileGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onFileGroup; }
	}

	public final OnFileGroupContext onFileGroup() throws RecognitionException {
		OnFileGroupContext _localctx = new OnFileGroupContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_onFileGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			match(ON);
			setState(1656);
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

	public static class OnStringContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public OnStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onString; }
	}

	public final OnStringContext onString() throws RecognitionException {
		OnStringContext _localctx = new OnStringContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_onString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1658);
			match(ON);
			setState(1659);
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

	public static class MemoryTablePrimaryKeyConstraintOptionContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public WithBucketContext withBucket() {
			return getRuleContext(WithBucketContext.class,0);
		}
		public MemoryTablePrimaryKeyConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryTablePrimaryKeyConstraintOption; }
	}

	public final MemoryTablePrimaryKeyConstraintOptionContext memoryTablePrimaryKeyConstraintOption() throws RecognitionException {
		MemoryTablePrimaryKeyConstraintOptionContext _localctx = new MemoryTablePrimaryKeyConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_memoryTablePrimaryKeyConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			match(CLUSTERED);
			setState(1663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1662);
				withBucket();
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

	public static class WithBucketContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode BUCKET_COUNT() { return getToken(SQLServerStatementParser.BUCKET_COUNT, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public WithBucketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withBucket; }
	}

	public final WithBucketContext withBucket() throws RecognitionException {
		WithBucketContext _localctx = new WithBucketContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_withBucket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			match(WITH);
			setState(1666);
			match(LP_);
			setState(1667);
			match(BUCKET_COUNT);
			setState(1668);
			match(EQ_);
			setState(1669);
			match(NUMBER_);
			setState(1670);
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

	public static class ColumnForeignKeyConstraintContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(SQLServerStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode FOREIGN() { return getToken(SQLServerStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public List<ForeignKeyOnActionContext> foreignKeyOnAction() {
			return getRuleContexts(ForeignKeyOnActionContext.class);
		}
		public ForeignKeyOnActionContext foreignKeyOnAction(int i) {
			return getRuleContext(ForeignKeyOnActionContext.class,i);
		}
		public ColumnForeignKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnForeignKeyConstraint; }
	}

	public final ColumnForeignKeyConstraintContext columnForeignKeyConstraint() throws RecognitionException {
		ColumnForeignKeyConstraintContext _localctx = new ColumnForeignKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_columnForeignKeyConstraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOREIGN) {
				{
				setState(1672);
				match(FOREIGN);
				setState(1673);
				match(KEY);
				}
			}

			setState(1676);
			match(REFERENCES);
			setState(1677);
			tableName();
			setState(1678);
			match(LP_);
			setState(1679);
			columnName();
			setState(1680);
			match(RP_);
			setState(1684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1681);
					foreignKeyOnAction();
					}
					} 
				}
				setState(1686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
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

	public static class ForeignKeyOnActionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public ForeignKeyOnContext foreignKeyOn() {
			return getRuleContext(ForeignKeyOnContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(SQLServerStatementParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SQLServerStatementParser.UPDATE, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public ForeignKeyOnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOnAction; }
	}

	public final ForeignKeyOnActionContext foreignKeyOnAction() throws RecognitionException {
		ForeignKeyOnActionContext _localctx = new ForeignKeyOnActionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_foreignKeyOnAction);
		int _la;
		try {
			setState(1693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1687);
				match(ON);
				setState(1688);
				_la = _input.LA(1);
				if ( !(_la==UPDATE || _la==DELETE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1689);
				foreignKeyOn();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1690);
				match(NOT);
				setState(1691);
				match(FOR);
				setState(1692);
				match(REPLICATION);
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

	public static class ForeignKeyOnContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(SQLServerStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(SQLServerStatementParser.ACTION, 0); }
		public TerminalNode CASCADE() { return getToken(SQLServerStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public ForeignKeyOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOn; }
	}

	public final ForeignKeyOnContext foreignKeyOn() throws RecognitionException {
		ForeignKeyOnContext _localctx = new ForeignKeyOnContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_foreignKeyOn);
		int _la;
		try {
			setState(1700);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1695);
				match(NO);
				setState(1696);
				match(ACTION);
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1697);
				match(CASCADE);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(1698);
				match(SET);
				setState(1699);
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

	public static class CheckConstraintContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(SQLServerStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public CheckConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkConstraint; }
	}

	public final CheckConstraintContext checkConstraint() throws RecognitionException {
		CheckConstraintContext _localctx = new CheckConstraintContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_checkConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
			match(CHECK);
			setState(1706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1703);
				match(NOT);
				setState(1704);
				match(FOR);
				setState(1705);
				match(REPLICATION);
				}
			}

			setState(1708);
			match(LP_);
			setState(1709);
			expr(0);
			setState(1710);
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

	public static class ColumnIndexContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public ClusterOption_Context clusterOption_() {
			return getRuleContext(ClusterOption_Context.class,0);
		}
		public WithIndexOption_Context withIndexOption_() {
			return getRuleContext(WithIndexOption_Context.class,0);
		}
		public IndexOnClauseContext indexOnClause() {
			return getRuleContext(IndexOnClauseContext.class,0);
		}
		public FileStreamOn_Context fileStreamOn_() {
			return getRuleContext(FileStreamOn_Context.class,0);
		}
		public ColumnIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnIndex; }
	}

	public final ColumnIndexContext columnIndex() throws RecognitionException {
		ColumnIndexContext _localctx = new ColumnIndexContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_columnIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			match(INDEX);
			setState(1713);
			indexName();
			setState(1715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(1714);
				clusterOption_();
				}
			}

			setState(1718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1717);
				withIndexOption_();
				}
			}

			setState(1721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1720);
				indexOnClause();
				}
			}

			setState(1724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILESTREAM_ON) {
				{
				setState(1723);
				fileStreamOn_();
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

	public static class WithIndexOption_Context extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public WithIndexOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withIndexOption_; }
	}

	public final WithIndexOption_Context withIndexOption_() throws RecognitionException {
		WithIndexOption_Context _localctx = new WithIndexOption_Context(_ctx, getState());
		enterRule(_localctx, 276, RULE_withIndexOption_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			match(WITH);
			setState(1727);
			match(LP_);
			setState(1728);
			indexOption();
			setState(1733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1729);
				match(COMMA_);
				setState(1730);
				indexOption();
				}
				}
				setState(1735);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1736);
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

	public static class IndexOnClauseContext extends ParserRuleContext {
		public OnSchemaColumnContext onSchemaColumn() {
			return getRuleContext(OnSchemaColumnContext.class,0);
		}
		public OnFileGroupContext onFileGroup() {
			return getRuleContext(OnFileGroupContext.class,0);
		}
		public OnDefaultContext onDefault() {
			return getRuleContext(OnDefaultContext.class,0);
		}
		public IndexOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOnClause; }
	}

	public final IndexOnClauseContext indexOnClause() throws RecognitionException {
		IndexOnClauseContext _localctx = new IndexOnClauseContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_indexOnClause);
		try {
			setState(1741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1738);
				onSchemaColumn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1739);
				onFileGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1740);
				onDefault();
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

	public static class OnDefaultContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public OnDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onDefault; }
	}

	public final OnDefaultContext onDefault() throws RecognitionException {
		OnDefaultContext _localctx = new OnDefaultContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_onDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			match(ON);
			setState(1744);
			match(DEFAULT);
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

	public static class FileStreamOn_Context extends ParserRuleContext {
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public FileStreamOn_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileStreamOn_; }
	}

	public final FileStreamOn_Context fileStreamOn_() throws RecognitionException {
		FileStreamOn_Context _localctx = new FileStreamOn_Context(_ctx, getState());
		enterRule(_localctx, 282, RULE_fileStreamOn_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			match(FILESTREAM_ON);
			setState(1750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1747);
				ignoredIdentifier_();
				}
				break;
			case 2:
				{
				setState(1748);
				schemaName();
				}
				break;
			case 3:
				{
				setState(1749);
				match(STRING_);
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

	public static class ColumnConstraintsContext extends ParserRuleContext {
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ColumnConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraints; }
	}

	public final ColumnConstraintsContext columnConstraints() throws RecognitionException {
		ColumnConstraintsContext _localctx = new ColumnConstraintsContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_columnConstraints);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (FOREIGN - 61)) | (1L << (KEY - 61)))) != 0) || _la==CHECK || _la==REFERENCES) {
				{
				setState(1752);
				columnConstraint();
				setState(1757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1753);
						match(COMMA_);
						setState(1754);
						columnConstraint();
						}
						} 
					}
					setState(1759);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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

	public static class ComputedColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PERSISTED() { return getToken(SQLServerStatementParser.PERSISTED, 0); }
		public ColumnConstraintContext columnConstraint() {
			return getRuleContext(ColumnConstraintContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public ComputedColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computedColumnDefinition; }
	}

	public final ComputedColumnDefinitionContext computedColumnDefinition() throws RecognitionException {
		ComputedColumnDefinitionContext _localctx = new ComputedColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_computedColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			columnName();
			setState(1763);
			match(AS);
			setState(1764);
			expr(0);
			setState(1770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERSISTED) {
				{
				setState(1765);
				match(PERSISTED);
				setState(1768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1766);
					match(NOT);
					setState(1767);
					match(NULL);
					}
				}

				}
			}

			setState(1773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (FOREIGN - 61)) | (1L << (KEY - 61)))) != 0) || _la==CHECK || _la==REFERENCES) {
				{
				setState(1772);
				columnConstraint();
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

	public static class ColumnSetDefinitionContext extends ParserRuleContext {
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public TerminalNode COLUMN_SET() { return getToken(SQLServerStatementParser.COLUMN_SET, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode ALL_SPARSE_COLUMNS() { return getToken(SQLServerStatementParser.ALL_SPARSE_COLUMNS, 0); }
		public ColumnSetDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSetDefinition; }
	}

	public final ColumnSetDefinitionContext columnSetDefinition() throws RecognitionException {
		ColumnSetDefinitionContext _localctx = new ColumnSetDefinitionContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_columnSetDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1775);
			ignoredIdentifier_();
			setState(1776);
			match(IDENTIFIER_);
			setState(1777);
			match(COLUMN_SET);
			setState(1778);
			match(FOR);
			setState(1779);
			match(ALL_SPARSE_COLUMNS);
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
		public TablePrimaryConstraintContext tablePrimaryConstraint() {
			return getRuleContext(TablePrimaryConstraintContext.class,0);
		}
		public TableForeignKeyConstraintContext tableForeignKeyConstraint() {
			return getRuleContext(TableForeignKeyConstraintContext.class,0);
		}
		public CheckConstraintContext checkConstraint() {
			return getRuleContext(CheckConstraintContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_tableConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1781);
				match(CONSTRAINT);
				setState(1782);
				ignoredIdentifier_();
				}
			}

			setState(1788);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case UNIQUE:
			case KEY:
				{
				setState(1785);
				tablePrimaryConstraint();
				}
				break;
			case LP_:
			case FOREIGN:
				{
				setState(1786);
				tableForeignKeyConstraint();
				}
				break;
			case CHECK:
				{
				setState(1787);
				checkConstraint();
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

	public static class TablePrimaryConstraintContext extends ParserRuleContext {
		public PrimaryKeyUniqueContext primaryKeyUnique() {
			return getRuleContext(PrimaryKeyUniqueContext.class,0);
		}
		public DiskTablePrimaryConstraintOptionContext diskTablePrimaryConstraintOption() {
			return getRuleContext(DiskTablePrimaryConstraintOptionContext.class,0);
		}
		public MemoryTablePrimaryConstraintOptionContext memoryTablePrimaryConstraintOption() {
			return getRuleContext(MemoryTablePrimaryConstraintOptionContext.class,0);
		}
		public TablePrimaryConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePrimaryConstraint; }
	}

	public final TablePrimaryConstraintContext tablePrimaryConstraint() throws RecognitionException {
		TablePrimaryConstraintContext _localctx = new TablePrimaryConstraintContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_tablePrimaryConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			primaryKeyUnique();
			setState(1793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1791);
				diskTablePrimaryConstraintOption();
				}
				break;
			case 2:
				{
				setState(1792);
				memoryTablePrimaryConstraintOption();
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

	public static class PrimaryKeyUniqueContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLServerStatementParser.UNIQUE, 0); }
		public PrimaryKeyUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyUnique; }
	}

	public final PrimaryKeyUniqueContext primaryKeyUnique() throws RecognitionException {
		PrimaryKeyUniqueContext _localctx = new PrimaryKeyUniqueContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_primaryKeyUnique);
		try {
			setState(1797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1795);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1796);
				match(UNIQUE);
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

	public static class DiskTablePrimaryConstraintOptionContext extends ParserRuleContext {
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ClusterOption_Context clusterOption_() {
			return getRuleContext(ClusterOption_Context.class,0);
		}
		public PrimaryKeyWithClauseContext primaryKeyWithClause() {
			return getRuleContext(PrimaryKeyWithClauseContext.class,0);
		}
		public PrimaryKeyOnClauseContext primaryKeyOnClause() {
			return getRuleContext(PrimaryKeyOnClauseContext.class,0);
		}
		public DiskTablePrimaryConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diskTablePrimaryConstraintOption; }
	}

	public final DiskTablePrimaryConstraintOptionContext diskTablePrimaryConstraintOption() throws RecognitionException {
		DiskTablePrimaryConstraintOptionContext _localctx = new DiskTablePrimaryConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_diskTablePrimaryConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(1799);
				clusterOption_();
				}
			}

			setState(1802);
			columnNames();
			setState(1804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1803);
				primaryKeyWithClause();
				}
			}

			setState(1807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1806);
				primaryKeyOnClause();
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

	public static class MemoryTablePrimaryConstraintOptionContext extends ParserRuleContext {
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public HashWithBucketContext hashWithBucket() {
			return getRuleContext(HashWithBucketContext.class,0);
		}
		public MemoryTablePrimaryConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryTablePrimaryConstraintOption; }
	}

	public final MemoryTablePrimaryConstraintOptionContext memoryTablePrimaryConstraintOption() throws RecognitionException {
		MemoryTablePrimaryConstraintOptionContext _localctx = new MemoryTablePrimaryConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_memoryTablePrimaryConstraintOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			match(NONCLUSTERED);
			setState(1812);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				{
				setState(1810);
				columnNames();
				}
				break;
			case HASH:
				{
				setState(1811);
				hashWithBucket();
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

	public static class HashWithBucketContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(SQLServerStatementParser.HASH, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public WithBucketContext withBucket() {
			return getRuleContext(WithBucketContext.class,0);
		}
		public HashWithBucketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashWithBucket; }
	}

	public final HashWithBucketContext hashWithBucket() throws RecognitionException {
		HashWithBucketContext _localctx = new HashWithBucketContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_hashWithBucket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			match(HASH);
			setState(1815);
			columnNames();
			setState(1816);
			withBucket();
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

	public static class TableForeignKeyConstraintContext extends ParserRuleContext {
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public TerminalNode REFERENCES() { return getToken(SQLServerStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(SQLServerStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public List<ForeignKeyOnActionContext> foreignKeyOnAction() {
			return getRuleContexts(ForeignKeyOnActionContext.class);
		}
		public ForeignKeyOnActionContext foreignKeyOnAction(int i) {
			return getRuleContext(ForeignKeyOnActionContext.class,i);
		}
		public TableForeignKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableForeignKeyConstraint; }
	}

	public final TableForeignKeyConstraintContext tableForeignKeyConstraint() throws RecognitionException {
		TableForeignKeyConstraintContext _localctx = new TableForeignKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_tableForeignKeyConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOREIGN) {
				{
				setState(1818);
				match(FOREIGN);
				setState(1819);
				match(KEY);
				}
			}

			setState(1822);
			columnNames();
			setState(1823);
			match(REFERENCES);
			setState(1824);
			tableName();
			setState(1825);
			columnNames();
			setState(1829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON || _la==NOT) {
				{
				{
				setState(1826);
				foreignKeyOnAction();
				}
				}
				setState(1831);
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

	public static class TableIndexContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IndexNameOption_Context indexNameOption_() {
			return getRuleContext(IndexNameOption_Context.class,0);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public IndexOptions_Context indexOptions_() {
			return getRuleContext(IndexOptions_Context.class,0);
		}
		public IndexOnClauseContext indexOnClause() {
			return getRuleContext(IndexOnClauseContext.class,0);
		}
		public FileStreamOn_Context fileStreamOn_() {
			return getRuleContext(FileStreamOn_Context.class,0);
		}
		public TableIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndex; }
	}

	public final TableIndexContext tableIndex() throws RecognitionException {
		TableIndexContext _localctx = new TableIndexContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_tableIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1832);
			match(INDEX);
			setState(1833);
			indexName();
			setState(1834);
			indexNameOption_();
			setState(1837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1835);
				match(WITH);
				setState(1836);
				indexOptions_();
				}
			}

			setState(1840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1839);
				indexOnClause();
				}
			}

			setState(1843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILESTREAM_ON) {
				{
				setState(1842);
				fileStreamOn_();
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

	public static class IndexNameOption_Context extends ParserRuleContext {
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ClusterOption_Context clusterOption_() {
			return getRuleContext(ClusterOption_Context.class,0);
		}
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public IndexNameOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexNameOption_; }
	}

	public final IndexNameOption_Context indexNameOption_() throws RecognitionException {
		IndexNameOption_Context _localctx = new IndexNameOption_Context(_ctx, getState());
		enterRule(_localctx, 306, RULE_indexNameOption_);
		int _la;
		try {
			setState(1856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(1845);
					clusterOption_();
					}
				}

				setState(1848);
				columnNames();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1849);
				match(CLUSTERED);
				setState(1850);
				match(COLUMNSTORE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NONCLUSTERED) {
					{
					setState(1851);
					match(NONCLUSTERED);
					}
				}

				setState(1854);
				match(COLUMNSTORE);
				setState(1855);
				columnNames();
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

	public static class IndexOptions_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public IndexOptions_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOptions_; }
	}

	public final IndexOptions_Context indexOptions_() throws RecognitionException {
		IndexOptions_Context _localctx = new IndexOptions_Context(_ctx, getState());
		enterRule(_localctx, 308, RULE_indexOptions_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			match(LP_);
			setState(1859);
			indexOption();
			setState(1864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1860);
				match(COMMA_);
				setState(1861);
				indexOption();
				}
				}
				setState(1866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1867);
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

	public static class PeriodClauseContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(SQLServerStatementParser.PERIOD, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SQLServerStatementParser.SYSTEM_TIME, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public PeriodClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_periodClause; }
	}

	public final PeriodClauseContext periodClause() throws RecognitionException {
		PeriodClauseContext _localctx = new PeriodClauseContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_periodClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			match(PERIOD);
			setState(1870);
			match(FOR);
			setState(1871);
			match(SYSTEM_TIME);
			setState(1872);
			match(LP_);
			setState(1873);
			columnName();
			setState(1874);
			match(COMMA_);
			setState(1875);
			columnName();
			setState(1876);
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

	public static class PartitionScheme_Context extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public PartitionScheme_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionScheme_; }
	}

	public final PartitionScheme_Context partitionScheme_() throws RecognitionException {
		PartitionScheme_Context _localctx = new PartitionScheme_Context(_ctx, getState());
		enterRule(_localctx, 312, RULE_partitionScheme_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1878);
				match(ON);
				setState(1886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1879);
					schemaName();
					setState(1880);
					match(LP_);
					setState(1881);
					columnName();
					setState(1882);
					match(RP_);
					}
					break;
				case 2:
					{
					setState(1884);
					ignoredIdentifier_();
					}
					break;
				case 3:
					{
					setState(1885);
					match(STRING_);
					}
					break;
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

	public static class FileGroup_Context extends ParserRuleContext {
		public TerminalNode TEXTIMAGE_ON() { return getToken(SQLServerStatementParser.TEXTIMAGE_ON, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TableOptionsContext tableOptions() {
			return getRuleContext(TableOptionsContext.class,0);
		}
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public List<TerminalNode> STRING_() { return getTokens(SQLServerStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(SQLServerStatementParser.STRING_, i);
		}
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public FileGroup_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileGroup_; }
	}

	public final FileGroup_Context fileGroup_() throws RecognitionException {
		FileGroup_Context _localctx = new FileGroup_Context(_ctx, getState());
		enterRule(_localctx, 314, RULE_fileGroup_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXTIMAGE_ON) {
				{
				setState(1890);
				match(TEXTIMAGE_ON);
				setState(1893);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER_:
					{
					setState(1891);
					ignoredIdentifier_();
					}
					break;
				case STRING_:
					{
					setState(1892);
					match(STRING_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(1904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILESTREAM_ON || _la==IDENTIFIER_) {
				{
				setState(1902);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FILESTREAM_ON:
					{
					setState(1897);
					match(FILESTREAM_ON);
					{
					setState(1898);
					schemaName();
					}
					}
					break;
				case IDENTIFIER_:
					{
					setState(1899);
					ignoredIdentifier_();
					setState(1900);
					match(STRING_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(1908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1906);
				match(WITH);
				setState(1907);
				tableOptions();
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

	public static class TableOptionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<TableOptionContext> tableOption() {
			return getRuleContexts(TableOptionContext.class);
		}
		public TableOptionContext tableOption(int i) {
			return getRuleContext(TableOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TableOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptions; }
	}

	public final TableOptionsContext tableOptions() throws RecognitionException {
		TableOptionsContext _localctx = new TableOptionsContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_tableOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1910);
			match(LP_);
			setState(1911);
			tableOption();
			setState(1916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1912);
				match(COMMA_);
				setState(1913);
				tableOption();
				}
				}
				setState(1918);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1919);
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

	public static class TableOptionContext extends ParserRuleContext {
		public TerminalNode DATA_COMPRESSION() { return getToken(SQLServerStatementParser.DATA_COMPRESSION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NONE() { return getToken(SQLServerStatementParser.NONE, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode PAGE() { return getToken(SQLServerStatementParser.PAGE, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode PARTITIONS() { return getToken(SQLServerStatementParser.PARTITIONS, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public PartitionExpressionsContext partitionExpressions() {
			return getRuleContext(PartitionExpressionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode FILETABLE_DIRECTORY() { return getToken(SQLServerStatementParser.FILETABLE_DIRECTORY, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode FILETABLE_COLLATE_FILENAME() { return getToken(SQLServerStatementParser.FILETABLE_COLLATE_FILENAME, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode DATABASE_DEAULT() { return getToken(SQLServerStatementParser.DATABASE_DEAULT, 0); }
		public TerminalNode FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME, 0); }
		public TerminalNode FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME, 0); }
		public TerminalNode FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public OnHistoryTableClauseContext onHistoryTableClause() {
			return getRuleContext(OnHistoryTableClauseContext.class,0);
		}
		public TerminalNode REMOTE_DATA_ARCHIVE() { return getToken(SQLServerStatementParser.REMOTE_DATA_ARCHIVE, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public MigrationState_Context migrationState_() {
			return getRuleContext(MigrationState_Context.class,0);
		}
		public TableStretchOptionsContext tableStretchOptions() {
			return getRuleContext(TableStretchOptionsContext.class,0);
		}
		public TableOperationOptionContext tableOperationOption() {
			return getRuleContext(TableOperationOptionContext.class,0);
		}
		public DistributionOptionContext distributionOption() {
			return getRuleContext(DistributionOptionContext.class,0);
		}
		public DataWareHouseTableOptionContext dataWareHouseTableOption() {
			return getRuleContext(DataWareHouseTableOptionContext.class,0);
		}
		public TableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOption; }
	}

	public final TableOptionContext tableOption() throws RecognitionException {
		TableOptionContext _localctx = new TableOptionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_tableOption);
		int _la;
		try {
			setState(1969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1921);
				match(DATA_COMPRESSION);
				setState(1922);
				match(EQ_);
				setState(1923);
				_la = _input.LA(1);
				if ( !(((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (ROW - 175)) | (1L << (NONE - 175)) | (1L << (PAGE - 175)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1924);
					match(ON);
					setState(1925);
					match(PARTITIONS);
					setState(1926);
					match(LP_);
					setState(1927);
					partitionExpressions();
					setState(1928);
					match(RP_);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1932);
				match(FILETABLE_DIRECTORY);
				setState(1933);
				match(EQ_);
				setState(1934);
				ignoredIdentifier_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1935);
				match(FILETABLE_COLLATE_FILENAME);
				setState(1936);
				match(EQ_);
				setState(1939);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER_:
				case STRING_:
					{
					setState(1937);
					collationName();
					}
					break;
				case DATABASE_DEAULT:
					{
					setState(1938);
					match(DATABASE_DEAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1941);
				match(FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME);
				setState(1942);
				match(EQ_);
				setState(1943);
				ignoredIdentifier_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1944);
				match(FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME);
				setState(1945);
				match(EQ_);
				setState(1946);
				ignoredIdentifier_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1947);
				match(FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME);
				setState(1948);
				match(EQ_);
				setState(1949);
				ignoredIdentifier_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1950);
				match(SYSTEM_VERSIONING);
				setState(1951);
				match(EQ_);
				setState(1952);
				match(ON);
				setState(1954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1953);
					onHistoryTableClause();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1956);
				match(REMOTE_DATA_ARCHIVE);
				setState(1957);
				match(EQ_);
				setState(1964);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON:
					{
					setState(1958);
					match(ON);
					setState(1960);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LP_) {
						{
						setState(1959);
						tableStretchOptions();
						}
					}

					}
					break;
				case OFF:
					{
					setState(1962);
					match(OFF);
					setState(1963);
					migrationState_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1966);
				tableOperationOption();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1967);
				distributionOption();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1968);
				dataWareHouseTableOption();
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

	public static class TableStretchOptionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<TableStretchOptionsContext> tableStretchOptions() {
			return getRuleContexts(TableStretchOptionsContext.class);
		}
		public TableStretchOptionsContext tableStretchOptions(int i) {
			return getRuleContext(TableStretchOptionsContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TableStretchOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableStretchOptions; }
	}

	public final TableStretchOptionsContext tableStretchOptions() throws RecognitionException {
		TableStretchOptionsContext _localctx = new TableStretchOptionsContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_tableStretchOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			match(LP_);
			setState(1972);
			tableStretchOptions();
			setState(1977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1973);
				match(COMMA_);
				setState(1974);
				tableStretchOptions();
				}
				}
				setState(1979);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1980);
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

	public static class TableStretchOptionContext extends ParserRuleContext {
		public TerminalNode MIGRATION_STATE() { return getToken(SQLServerStatementParser.MIGRATION_STATE, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TerminalNode OUTBOUND() { return getToken(SQLServerStatementParser.OUTBOUND, 0); }
		public TerminalNode INBOUND() { return getToken(SQLServerStatementParser.INBOUND, 0); }
		public TerminalNode PAUSED() { return getToken(SQLServerStatementParser.PAUSED, 0); }
		public TerminalNode FILTER_PREDICATE() { return getToken(SQLServerStatementParser.FILTER_PREDICATE, 0); }
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TableStretchOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableStretchOption; }
	}

	public final TableStretchOptionContext tableStretchOption() throws RecognitionException {
		TableStretchOptionContext _localctx = new TableStretchOptionContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_tableStretchOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER_PREDICATE) {
				{
				setState(1982);
				match(FILTER_PREDICATE);
				setState(1983);
				match(EQ_);
				setState(1986);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NULL:
					{
					setState(1984);
					match(NULL);
					}
					break;
				case TRUNCATE:
				case FUNCTION:
				case TRIGGER:
				case CAST:
				case IF:
				case LIMIT:
				case OFFSET:
				case SAVEPOINT:
				case BOOLEAN:
				case CHAR:
				case ARRAY:
				case INTERVAL:
				case LOCALTIME:
				case LOCALTIMESTAMP:
				case QUARTER:
				case WEEK:
				case MICROSECOND:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case ENABLE:
				case DISABLE:
				case INSTANCE:
				case DO:
				case DEFINER:
				case SQL:
				case CASCADED:
				case LOCAL:
				case NEXT:
				case NAME:
				case BINARY:
				case HIDDEN_:
				case MOD:
				case PARTITION:
				case PARTITIONS:
				case TOP:
				case ROW:
				case XOR:
				case ALWAYS:
				case ROLE:
				case START:
				case ALGORITHM:
				case AUTO:
				case BLOCKERS:
				case CLUSTERED:
				case NONCLUSTERED:
				case COLUMNSTORE:
				case CONTENT:
				case DATABASE:
				case YEARS:
				case MONTHS:
				case WEEKS:
				case DAYS:
				case MINUTES:
				case DENY:
				case DETERMINISTIC:
				case DISTRIBUTION:
				case DOCUMENT:
				case DURABILITY:
				case ENCRYPTED:
				case FILESTREAM:
				case FILETABLE:
				case FILLFACTOR:
				case FOLLOWING:
				case HASH:
				case HEAP:
				case INBOUND:
				case OUTBOUND:
				case UNBOUNDED:
				case INFINITE:
				case LOGIN:
				case MASKED:
				case MAXDOP:
				case MOVE:
				case NOCHECK:
				case OBJECT:
				case OFF:
				case ONLINE:
				case OVER:
				case PAGE:
				case PAUSED:
				case PERIOD:
				case PERSISTED:
				case PRECEDING:
				case RANDOMIZED:
				case RANGE:
				case REBUILD:
				case REPLICATE:
				case REPLICATION:
				case RESUMABLE:
				case ROWGUIDCOL:
				case SAVE:
				case SELF:
				case SPARSE:
				case SWITCH:
				case TRAN:
				case TRANCOUNT:
				case CONTROL:
				case TAKE:
				case OWNERSHIP:
				case DEFINITION:
				case APPLICATION:
				case ASSEMBLY:
				case SYMMETRIC:
				case ASYMMETRIC:
				case SERVER:
				case RECEIVE:
				case CHANGE:
				case TRACE:
				case TRACKING:
				case RESOURCES:
				case SETTINGS:
				case STATE:
				case AVAILABILITY:
				case CREDENTIAL:
				case ENDPOINT:
				case EVENT:
				case NOTIFICATION:
				case LINKED:
				case AUDIT:
				case DDL:
				case XML:
				case IMPERSONATE:
				case SECURABLES:
				case AUTHENTICATE:
				case EXTERNAL:
				case ACCESS:
				case ADMINISTER:
				case BULK:
				case OPERATIONS:
				case UNSAFE:
				case SHUTDOWN:
				case SCOPED:
				case CONFIGURATION:
				case DATASPACE:
				case SERVICE:
				case CERTIFICATE:
				case CONTRACT:
				case ENCRYPTION:
				case MASTER:
				case DATA:
				case SOURCE:
				case FILE:
				case FORMAT:
				case LIBRARY:
				case FULLTEXT:
				case MASK:
				case UNMASK:
				case MESSAGE:
				case TYPE:
				case REMOTE:
				case BINDING:
				case ROUTE:
				case SECURITY:
				case POLICY:
				case AGGREGATE:
				case QUEUE:
				case RULE:
				case SYNONYM:
				case COLLECTION:
				case SCRIPT:
				case KILL:
				case BACKUP:
				case LOG:
				case SHOWPLAN:
				case SUBSCRIBE:
				case QUERY:
				case NOTIFICATIONS:
				case CHECKPOINT:
				case SEQUENCE:
				case ABORT_AFTER_WAIT:
				case ALLOW_PAGE_LOCKS:
				case ALLOW_ROW_LOCKS:
				case ALL_SPARSE_COLUMNS:
				case BUCKET_COUNT:
				case COLUMNSTORE_ARCHIVE:
				case COLUMN_ENCRYPTION_KEY:
				case COLUMN_SET:
				case COMPRESSION_DELAY:
				case DATABASE_DEAULT:
				case DATA_COMPRESSION:
				case DATA_CONSISTENCY_CHECK:
				case ENCRYPTION_TYPE:
				case SYSTEM_TIME:
				case SYSTEM_VERSIONING:
				case TEXTIMAGE_ON:
				case WAIT_AT_LOW_PRIORITY:
				case STATISTICS_INCREMENTAL:
				case STATISTICS_NORECOMPUTE:
				case ROUND_ROBIN:
				case SCHEMA_AND_DATA:
				case SCHEMA_ONLY:
				case SORT_IN_TEMPDB:
				case IGNORE_DUP_KEY:
				case IMPLICIT_TRANSACTIONS:
				case MAX_DURATION:
				case MEMORY_OPTIMIZED:
				case MIGRATION_STATE:
				case PAD_INDEX:
				case REMOTE_DATA_ARCHIVE:
				case FILESTREAM_ON:
				case FILETABLE_COLLATE_FILENAME:
				case FILETABLE_DIRECTORY:
				case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
				case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
				case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
				case FILTER_PREDICATE:
				case HISTORY_RETENTION_PERIOD:
				case HISTORY_TABLE:
				case LOCK_ESCALATION:
				case DROP_EXISTING:
				case ROW_NUMBER:
				case IDENTIFIER_:
					{
					setState(1985);
					functionCall();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1988);
				match(COMMA_);
				}
			}

			setState(1991);
			match(MIGRATION_STATE);
			setState(1992);
			match(EQ_);
			setState(1993);
			_la = _input.LA(1);
			if ( !(((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (INBOUND - 221)) | (1L << (OUTBOUND - 221)) | (1L << (PAUSED - 221)))) != 0)) ) {
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

	public static class MigrationState_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode MIGRATION_STATE() { return getToken(SQLServerStatementParser.MIGRATION_STATE, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode PAUSED() { return getToken(SQLServerStatementParser.PAUSED, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public MigrationState_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_migrationState_; }
	}

	public final MigrationState_Context migrationState_() throws RecognitionException {
		MigrationState_Context _localctx = new MigrationState_Context(_ctx, getState());
		enterRule(_localctx, 324, RULE_migrationState_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			match(LP_);
			setState(1996);
			match(MIGRATION_STATE);
			setState(1997);
			match(EQ_);
			setState(1998);
			match(PAUSED);
			setState(1999);
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

	public static class TableOperationOptionContext extends ParserRuleContext {
		public TerminalNode MEMORY_OPTIMIZED() { return getToken(SQLServerStatementParser.MEMORY_OPTIMIZED, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode DURABILITY() { return getToken(SQLServerStatementParser.DURABILITY, 0); }
		public TerminalNode SCHEMA_ONLY() { return getToken(SQLServerStatementParser.SCHEMA_ONLY, 0); }
		public TerminalNode SCHEMA_AND_DATA() { return getToken(SQLServerStatementParser.SCHEMA_AND_DATA, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public OnHistoryTableClauseContext onHistoryTableClause() {
			return getRuleContext(OnHistoryTableClauseContext.class,0);
		}
		public TableOperationOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOperationOption; }
	}

	public final TableOperationOptionContext tableOperationOption() throws RecognitionException {
		TableOperationOptionContext _localctx = new TableOperationOptionContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_tableOperationOption);
		int _la;
		try {
			setState(2013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MEMORY_OPTIMIZED:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2001);
				match(MEMORY_OPTIMIZED);
				setState(2002);
				match(EQ_);
				setState(2003);
				match(ON);
				}
				}
				break;
			case DURABILITY:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2004);
				match(DURABILITY);
				setState(2005);
				match(EQ_);
				setState(2006);
				_la = _input.LA(1);
				if ( !(_la==SCHEMA_AND_DATA || _la==SCHEMA_ONLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case SYSTEM_VERSIONING:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2007);
				match(SYSTEM_VERSIONING);
				setState(2008);
				match(EQ_);
				setState(2009);
				match(ON);
				setState(2011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2010);
					onHistoryTableClause();
					}
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

	public static class DistributionOptionContext extends ParserRuleContext {
		public TerminalNode DISTRIBUTION() { return getToken(SQLServerStatementParser.DISTRIBUTION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode HASH() { return getToken(SQLServerStatementParser.HASH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode ROUND_ROBIN() { return getToken(SQLServerStatementParser.ROUND_ROBIN, 0); }
		public TerminalNode REPLICATE() { return getToken(SQLServerStatementParser.REPLICATE, 0); }
		public DistributionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distributionOption; }
	}

	public final DistributionOptionContext distributionOption() throws RecognitionException {
		DistributionOptionContext _localctx = new DistributionOptionContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_distributionOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2015);
			match(DISTRIBUTION);
			setState(2016);
			match(EQ_);
			setState(2024);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				{
				setState(2017);
				match(HASH);
				setState(2018);
				match(LP_);
				setState(2019);
				columnName();
				setState(2020);
				match(RP_);
				}
				break;
			case ROUND_ROBIN:
				{
				setState(2022);
				match(ROUND_ROBIN);
				}
				break;
			case REPLICATE:
				{
				setState(2023);
				match(REPLICATE);
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

	public static class DataWareHouseTableOptionContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public TerminalNode HEAP() { return getToken(SQLServerStatementParser.HEAP, 0); }
		public DataWareHousePartitionOptionContext dataWareHousePartitionOption() {
			return getRuleContext(DataWareHousePartitionOptionContext.class,0);
		}
		public DataWareHouseTableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataWareHouseTableOption; }
	}

	public final DataWareHouseTableOptionContext dataWareHouseTableOption() throws RecognitionException {
		DataWareHouseTableOptionContext _localctx = new DataWareHouseTableOptionContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_dataWareHouseTableOption);
		try {
			setState(2031);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLUSTERED:
				enterOuterAlt(_localctx, 1);
				{
				setState(2026);
				match(CLUSTERED);
				setState(2027);
				match(COLUMNSTORE);
				setState(2028);
				match(INDEX);
				}
				break;
			case HEAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(2029);
				match(HEAP);
				}
				break;
			case PARTITION:
				enterOuterAlt(_localctx, 3);
				{
				setState(2030);
				dataWareHousePartitionOption();
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

	public static class DataWareHousePartitionOptionContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SQLServerStatementParser.PARTITION, 0); }
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(SQLServerStatementParser.RANGE, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode VALUES() { return getToken(SQLServerStatementParser.VALUES, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode LEFT() { return getToken(SQLServerStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLServerStatementParser.RIGHT, 0); }
		public DataWareHousePartitionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataWareHousePartitionOption; }
	}

	public final DataWareHousePartitionOptionContext dataWareHousePartitionOption() throws RecognitionException {
		DataWareHousePartitionOptionContext _localctx = new DataWareHousePartitionOptionContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_dataWareHousePartitionOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2033);
			match(PARTITION);
			setState(2034);
			match(LP_);
			setState(2035);
			columnName();
			setState(2036);
			match(RANGE);
			setState(2038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT || _la==RIGHT) {
				{
				setState(2037);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2040);
			match(FOR);
			setState(2041);
			match(VALUES);
			setState(2042);
			match(LP_);
			setState(2043);
			simpleExpr(0);
			setState(2048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2044);
				match(COMMA_);
				setState(2045);
				simpleExpr(0);
				}
				}
				setState(2050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2051);
			match(RP_);
			setState(2052);
			match(RP_);
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
		public TerminalNode UNIQUE() { return getToken(SQLServerStatementParser.UNIQUE, 0); }
		public ClusterOption_Context clusterOption_() {
			return getRuleContext(ClusterOption_Context.class,0);
		}
		public CreateIndexSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexSpecification_; }
	}

	public final CreateIndexSpecification_Context createIndexSpecification_() throws RecognitionException {
		CreateIndexSpecification_Context _localctx = new CreateIndexSpecification_Context(_ctx, getState());
		enterRule(_localctx, 334, RULE_createIndexSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(2054);
				match(UNIQUE);
				}
			}

			setState(2058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(2057);
				clusterOption_();
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
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public AlterDropContext alterDrop() {
			return getRuleContext(AlterDropContext.class,0);
		}
		public AlterCheckConstraintContext alterCheckConstraint() {
			return getRuleContext(AlterCheckConstraintContext.class,0);
		}
		public AlterTriggerContext alterTrigger() {
			return getRuleContext(AlterTriggerContext.class,0);
		}
		public AlterSwitchContext alterSwitch() {
			return getRuleContext(AlterSwitchContext.class,0);
		}
		public AlterSetContext alterSet() {
			return getRuleContext(AlterSetContext.class,0);
		}
		public AlterTableOptionContext alterTableOption() {
			return getRuleContext(AlterTableOptionContext.class,0);
		}
		public TerminalNode REBUILD() { return getToken(SQLServerStatementParser.REBUILD, 0); }
		public AlterDefinitionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDefinitionClause_; }
	}

	public final AlterDefinitionClause_Context alterDefinitionClause_() throws RecognitionException {
		AlterDefinitionClause_Context _localctx = new AlterDefinitionClause_Context(_ctx, getState());
		enterRule(_localctx, 336, RULE_alterDefinitionClause_);
		try {
			setState(2069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2060);
				modifyColumnSpecification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2061);
				addColumnSpecification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2062);
				alterDrop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2063);
				alterCheckConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2064);
				alterTrigger();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2065);
				alterSwitch();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2066);
				alterSet();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2067);
				alterTableOption();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2068);
				match(REBUILD);
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

	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public AlterColumnOperationContext alterColumnOperation() {
			return getRuleContext(AlterColumnOperationContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(SQLServerStatementParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode SPARSE() { return getToken(SQLServerStatementParser.SPARSE, 0); }
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_modifyColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2071);
			alterColumnOperation();
			setState(2072);
			dataType();
			setState(2075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(2073);
				match(COLLATE);
				setState(2074);
				collationName();
				}
			}

			setState(2080);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				{
				setState(2077);
				match(NULL);
				}
				break;
			case NOT:
				{
				setState(2078);
				match(NOT);
				setState(2079);
				match(NULL);
				}
				break;
			case EOF:
			case SEMI_:
			case SPARSE:
				break;
			default:
				break;
			}
			setState(2083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPARSE) {
				{
				setState(2082);
				match(SPARSE);
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

	public static class AlterColumnOperationContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode COLUMN() { return getToken(SQLServerStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AlterColumnOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnOperation; }
	}

	public final AlterColumnOperationContext alterColumnOperation() throws RecognitionException {
		AlterColumnOperationContext _localctx = new AlterColumnOperationContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_alterColumnOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			match(ALTER);
			setState(2086);
			match(COLUMN);
			setState(2087);
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

	public static class AddColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SQLServerStatementParser.ADD, 0); }
		public AlterColumnAddOptionsContext alterColumnAddOptions() {
			return getRuleContext(AlterColumnAddOptionsContext.class,0);
		}
		public GeneratedColumnNamesClauseContext generatedColumnNamesClause() {
			return getRuleContext(GeneratedColumnNamesClauseContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode CHECK() { return getToken(SQLServerStatementParser.CHECK, 0); }
		public TerminalNode NOCHECK() { return getToken(SQLServerStatementParser.NOCHECK, 0); }
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2089);
				match(WITH);
				setState(2090);
				_la = _input.LA(1);
				if ( !(_la==CHECK || _la==NOCHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2093);
			match(ADD);
			setState(2096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(2094);
				alterColumnAddOptions();
				}
				break;
			case 2:
				{
				setState(2095);
				generatedColumnNamesClause();
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

	public static class AlterColumnAddOptionsContext extends ParserRuleContext {
		public List<AlterColumnAddOptionContext> alterColumnAddOption() {
			return getRuleContexts(AlterColumnAddOptionContext.class);
		}
		public AlterColumnAddOptionContext alterColumnAddOption(int i) {
			return getRuleContext(AlterColumnAddOptionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AlterColumnAddOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAddOptions; }
	}

	public final AlterColumnAddOptionsContext alterColumnAddOptions() throws RecognitionException {
		AlterColumnAddOptionsContext _localctx = new AlterColumnAddOptionsContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_alterColumnAddOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2098);
			alterColumnAddOption();
			setState(2103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2099);
				match(COMMA_);
				setState(2100);
				alterColumnAddOption();
				}
				}
				setState(2105);
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

	public static class AlterColumnAddOptionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public ComputedColumnDefinitionContext computedColumnDefinition() {
			return getRuleContext(ComputedColumnDefinitionContext.class,0);
		}
		public ColumnSetDefinitionContext columnSetDefinition() {
			return getRuleContext(ColumnSetDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public AlterTableTableIndexContext alterTableTableIndex() {
			return getRuleContext(AlterTableTableIndexContext.class,0);
		}
		public ConstraintForColumnContext constraintForColumn() {
			return getRuleContext(ConstraintForColumnContext.class,0);
		}
		public AlterColumnAddOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAddOption; }
	}

	public final AlterColumnAddOptionContext alterColumnAddOption() throws RecognitionException {
		AlterColumnAddOptionContext _localctx = new AlterColumnAddOptionContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_alterColumnAddOption);
		try {
			setState(2112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2106);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2107);
				computedColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2108);
				columnSetDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2109);
				tableConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2110);
				alterTableTableIndex();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2111);
				constraintForColumn();
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

	public static class ConstraintForColumnContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintForColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintForColumn; }
	}

	public final ConstraintForColumnContext constraintForColumn() throws RecognitionException {
		ConstraintForColumnContext _localctx = new ConstraintForColumnContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_constraintForColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(2114);
				match(CONSTRAINT);
				setState(2115);
				ignoredIdentifier_();
				}
			}

			setState(2118);
			match(DEFAULT);
			setState(2119);
			simpleExpr(0);
			setState(2120);
			match(FOR);
			setState(2121);
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

	public static class ColumnNameWithSortsWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ColumnNameWithSortContext> columnNameWithSort() {
			return getRuleContexts(ColumnNameWithSortContext.class);
		}
		public ColumnNameWithSortContext columnNameWithSort(int i) {
			return getRuleContext(ColumnNameWithSortContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ColumnNameWithSortsWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameWithSortsWithParen; }
	}

	public final ColumnNameWithSortsWithParenContext columnNameWithSortsWithParen() throws RecognitionException {
		ColumnNameWithSortsWithParenContext _localctx = new ColumnNameWithSortsWithParenContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_columnNameWithSortsWithParen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2123);
			match(LP_);
			setState(2124);
			columnNameWithSort();
			setState(2129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2125);
				match(COMMA_);
				setState(2126);
				columnNameWithSort();
				}
				}
				setState(2131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2132);
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

	public static class GeneratedColumnNamesClauseContext extends ParserRuleContext {
		public GeneratedColumnNameClauseContext generatedColumnNameClause() {
			return getRuleContext(GeneratedColumnNameClauseContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public PeriodClauseContext periodClause() {
			return getRuleContext(PeriodClauseContext.class,0);
		}
		public GeneratedColumnNamesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatedColumnNamesClause; }
	}

	public final GeneratedColumnNamesClauseContext generatedColumnNamesClause() throws RecognitionException {
		GeneratedColumnNamesClauseContext _localctx = new GeneratedColumnNamesClauseContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_generatedColumnNamesClause);
		try {
			setState(2142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2134);
				generatedColumnNameClause();
				setState(2135);
				match(COMMA_);
				setState(2136);
				periodClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2138);
				periodClause();
				setState(2139);
				match(COMMA_);
				setState(2140);
				generatedColumnNameClause();
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

	public static class GeneratedColumnNameClauseContext extends ParserRuleContext {
		public List<GeneratedColumnNameContext> generatedColumnName() {
			return getRuleContexts(GeneratedColumnNameContext.class);
		}
		public GeneratedColumnNameContext generatedColumnName(int i) {
			return getRuleContext(GeneratedColumnNameContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode VALUES() { return getToken(SQLServerStatementParser.VALUES, 0); }
		public GeneratedColumnNameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatedColumnNameClause; }
	}

	public final GeneratedColumnNameClauseContext generatedColumnNameClause() throws RecognitionException {
		GeneratedColumnNameClauseContext _localctx = new GeneratedColumnNameClauseContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_generatedColumnNameClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
			generatedColumnName();
			setState(2145);
			match(DEFAULT);
			setState(2146);
			simpleExpr(0);
			setState(2149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2147);
				match(WITH);
				setState(2148);
				match(VALUES);
				}
			}

			setState(2151);
			match(COMMA_);
			setState(2152);
			generatedColumnName();
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

	public static class GeneratedColumnNameContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public TerminalNode GENERATED() { return getToken(SQLServerStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(SQLServerStatementParser.ALWAYS, 0); }
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode HIDDEN_() { return getToken(SQLServerStatementParser.HIDDEN_, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode START() { return getToken(SQLServerStatementParser.START, 0); }
		public TerminalNode END() { return getToken(SQLServerStatementParser.END, 0); }
		public GeneratedColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatedColumnName; }
	}

	public final GeneratedColumnNameContext generatedColumnName() throws RecognitionException {
		GeneratedColumnNameContext _localctx = new GeneratedColumnNameContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_generatedColumnName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2154);
			columnName();
			setState(2155);
			dataTypeName_();
			setState(2156);
			match(GENERATED);
			setState(2157);
			match(ALWAYS);
			setState(2158);
			match(AS);
			setState(2159);
			match(ROW);
			setState(2161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START || _la==END) {
				{
				setState(2160);
				_la = _input.LA(1);
				if ( !(_la==START || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HIDDEN_) {
				{
				setState(2163);
				match(HIDDEN_);
				}
			}

			setState(2168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2166);
				match(NOT);
				setState(2167);
				match(NULL);
				}
			}

			setState(2172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(2170);
				match(CONSTRAINT);
				setState(2171);
				ignoredIdentifier_();
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

	public static class AlterDropContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public AlterTableDropConstraintContext alterTableDropConstraint() {
			return getRuleContext(AlterTableDropConstraintContext.class,0);
		}
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public DropIndexSpecificationContext dropIndexSpecification() {
			return getRuleContext(DropIndexSpecificationContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(SQLServerStatementParser.PERIOD, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SQLServerStatementParser.SYSTEM_TIME, 0); }
		public AlterDropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDrop; }
	}

	public final AlterDropContext alterDrop() throws RecognitionException {
		AlterDropContext _localctx = new AlterDropContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_alterDrop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2174);
			match(DROP);
			setState(2181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
			case IF:
			case IDENTIFIER_:
				{
				setState(2175);
				alterTableDropConstraint();
				}
				break;
			case COLUMN:
				{
				setState(2176);
				dropColumnSpecification();
				}
				break;
			case INDEX:
				{
				setState(2177);
				dropIndexSpecification();
				}
				break;
			case PERIOD:
				{
				setState(2178);
				match(PERIOD);
				setState(2179);
				match(FOR);
				setState(2180);
				match(SYSTEM_TIME);
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

	public static class AlterTableDropConstraintContext extends ParserRuleContext {
		public List<DropConstraintNameContext> dropConstraintName() {
			return getRuleContexts(DropConstraintNameContext.class);
		}
		public DropConstraintNameContext dropConstraintName(int i) {
			return getRuleContext(DropConstraintNameContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IfExist_Context ifExist_() {
			return getRuleContext(IfExist_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AlterTableDropConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableDropConstraint; }
	}

	public final AlterTableDropConstraintContext alterTableDropConstraint() throws RecognitionException {
		AlterTableDropConstraintContext _localctx = new AlterTableDropConstraintContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_alterTableDropConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(2183);
				match(CONSTRAINT);
				}
			}

			setState(2187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2186);
				ifExist_();
				}
			}

			setState(2189);
			dropConstraintName();
			setState(2194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2190);
				match(COMMA_);
				setState(2191);
				dropConstraintName();
				}
				}
				setState(2196);
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

	public static class DropConstraintNameContext extends ParserRuleContext {
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public DropConstraintWithClauseContext dropConstraintWithClause() {
			return getRuleContext(DropConstraintWithClauseContext.class,0);
		}
		public DropConstraintNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintName; }
	}

	public final DropConstraintNameContext dropConstraintName() throws RecognitionException {
		DropConstraintNameContext _localctx = new DropConstraintNameContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_dropConstraintName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			ignoredIdentifier_();
			setState(2199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2198);
				dropConstraintWithClause();
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

	public static class DropConstraintWithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<DropConstraintOptionContext> dropConstraintOption() {
			return getRuleContexts(DropConstraintOptionContext.class);
		}
		public DropConstraintOptionContext dropConstraintOption(int i) {
			return getRuleContext(DropConstraintOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public DropConstraintWithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintWithClause; }
	}

	public final DropConstraintWithClauseContext dropConstraintWithClause() throws RecognitionException {
		DropConstraintWithClauseContext _localctx = new DropConstraintWithClauseContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_dropConstraintWithClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			match(WITH);
			setState(2202);
			match(LP_);
			setState(2203);
			dropConstraintOption();
			setState(2208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2204);
				match(COMMA_);
				setState(2205);
				dropConstraintOption();
				}
				}
				setState(2210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2211);
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

	public static class DropConstraintOptionContext extends ParserRuleContext {
		public TerminalNode MAXDOP() { return getToken(SQLServerStatementParser.MAXDOP, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode ONLINE() { return getToken(SQLServerStatementParser.ONLINE, 0); }
		public OnOffOption_Context onOffOption_() {
			return getRuleContext(OnOffOption_Context.class,0);
		}
		public TerminalNode MOVE() { return getToken(SQLServerStatementParser.MOVE, 0); }
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public DropConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintOption; }
	}

	public final DropConstraintOptionContext dropConstraintOption() throws RecognitionException {
		DropConstraintOptionContext _localctx = new DropConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_dropConstraintOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAXDOP:
				{
				setState(2213);
				match(MAXDOP);
				setState(2214);
				match(EQ_);
				setState(2215);
				match(NUMBER_);
				}
				break;
			case ONLINE:
				{
				setState(2216);
				match(ONLINE);
				setState(2217);
				match(EQ_);
				setState(2218);
				onOffOption_();
				}
				break;
			case MOVE:
				{
				setState(2219);
				match(MOVE);
				setState(2220);
				match(TO);
				setState(2228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(2221);
					schemaName();
					setState(2222);
					match(LP_);
					setState(2223);
					columnName();
					setState(2224);
					match(RP_);
					}
					break;
				case 2:
					{
					setState(2226);
					ignoredIdentifier_();
					}
					break;
				case 3:
					{
					setState(2227);
					match(STRING_);
					}
					break;
				}
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

	public static class OnOffOption_Context extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public OnOffOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onOffOption_; }
	}

	public final OnOffOption_Context onOffOption_() throws RecognitionException {
		OnOffOption_Context _localctx = new OnOffOption_Context(_ctx, getState());
		enterRule(_localctx, 368, RULE_onOffOption_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2232);
			_la = _input.LA(1);
			if ( !(_la==ON || _la==OFF) ) {
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

	public static class DropColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(SQLServerStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public IfExist_Context ifExist_() {
			return getRuleContext(IfExist_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_dropColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2234);
			match(COLUMN);
			setState(2236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2235);
				ifExist_();
				}
			}

			setState(2238);
			columnName();
			setState(2243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2239);
				match(COMMA_);
				setState(2240);
				columnName();
				}
				}
				setState(2245);
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

	public static class DropIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public IfExist_Context ifExist_() {
			return getRuleContext(IfExist_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public DropIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndexSpecification; }
	}

	public final DropIndexSpecificationContext dropIndexSpecification() throws RecognitionException {
		DropIndexSpecificationContext _localctx = new DropIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_dropIndexSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2246);
			match(INDEX);
			setState(2248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2247);
				ifExist_();
				}
			}

			setState(2250);
			indexName();
			setState(2255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2251);
				match(COMMA_);
				setState(2252);
				indexName();
				}
				}
				setState(2257);
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

	public static class AlterCheckConstraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public TerminalNode CHECK() { return getToken(SQLServerStatementParser.CHECK, 0); }
		public TerminalNode NOCHECK() { return getToken(SQLServerStatementParser.NOCHECK, 0); }
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public AlterCheckConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterCheckConstraint; }
	}

	public final AlterCheckConstraintContext alterCheckConstraint() throws RecognitionException {
		AlterCheckConstraintContext _localctx = new AlterCheckConstraintContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_alterCheckConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2258);
				match(WITH);
				}
			}

			setState(2261);
			_la = _input.LA(1);
			if ( !(_la==CHECK || _la==NOCHECK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2262);
			match(CONSTRAINT);
			setState(2265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(2263);
				match(ALL);
				}
				break;
			case IDENTIFIER_:
				{
				setState(2264);
				ignoredIdentifiers_();
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

	public static class AlterTriggerContext extends ParserRuleContext {
		public TerminalNode TRIGGER() { return getToken(SQLServerStatementParser.TRIGGER, 0); }
		public TerminalNode ENABLE() { return getToken(SQLServerStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(SQLServerStatementParser.DISABLE, 0); }
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public AlterTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTrigger; }
	}

	public final AlterTriggerContext alterTrigger() throws RecognitionException {
		AlterTriggerContext _localctx = new AlterTriggerContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_alterTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2267);
			_la = _input.LA(1);
			if ( !(_la==ENABLE || _la==DISABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2268);
			match(TRIGGER);
			setState(2271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(2269);
				match(ALL);
				}
				break;
			case IDENTIFIER_:
				{
				setState(2270);
				ignoredIdentifiers_();
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

	public static class AlterSwitchContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(SQLServerStatementParser.SWITCH, 0); }
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<TerminalNode> PARTITION() { return getTokens(SQLServerStatementParser.PARTITION); }
		public TerminalNode PARTITION(int i) {
			return getToken(SQLServerStatementParser.PARTITION, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public LowPriorityLockWaitContext lowPriorityLockWait() {
			return getRuleContext(LowPriorityLockWaitContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public AlterSwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSwitch; }
	}

	public final AlterSwitchContext alterSwitch() throws RecognitionException {
		AlterSwitchContext _localctx = new AlterSwitchContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_alterSwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2273);
			match(SWITCH);
			setState(2276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(2274);
				match(PARTITION);
				setState(2275);
				expr(0);
				}
			}

			setState(2278);
			match(TO);
			setState(2279);
			tableName();
			setState(2282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(2280);
				match(PARTITION);
				setState(2281);
				expr(0);
				}
			}

			setState(2289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2284);
				match(WITH);
				setState(2285);
				match(LP_);
				setState(2286);
				lowPriorityLockWait();
				setState(2287);
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

	public static class AlterSetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public SetFileStreamClauseContext setFileStreamClause() {
			return getRuleContext(SetFileStreamClauseContext.class,0);
		}
		public SetSystemVersionClauseContext setSystemVersionClause() {
			return getRuleContext(SetSystemVersionClauseContext.class,0);
		}
		public AlterSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSet; }
	}

	public final AlterSetContext alterSet() throws RecognitionException {
		AlterSetContext _localctx = new AlterSetContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_alterSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2291);
			match(SET);
			setState(2292);
			match(LP_);
			setState(2295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILESTREAM_ON:
				{
				setState(2293);
				setFileStreamClause();
				}
				break;
			case SYSTEM_VERSIONING:
				{
				setState(2294);
				setSystemVersionClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2297);
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

	public static class SetFileStreamClauseContext extends ParserRuleContext {
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public SetFileStreamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setFileStreamClause; }
	}

	public final SetFileStreamClauseContext setFileStreamClause() throws RecognitionException {
		SetFileStreamClauseContext _localctx = new SetFileStreamClauseContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_setFileStreamClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2299);
			match(FILESTREAM_ON);
			setState(2300);
			match(EQ_);
			setState(2304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(2301);
				schemaName();
				}
				break;
			case 2:
				{
				setState(2302);
				ignoredIdentifier_();
				}
				break;
			case 3:
				{
				setState(2303);
				match(STRING_);
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

	public static class SetSystemVersionClauseContext extends ParserRuleContext {
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public AlterSetOnClauseContext alterSetOnClause() {
			return getRuleContext(AlterSetOnClauseContext.class,0);
		}
		public SetSystemVersionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setSystemVersionClause; }
	}

	public final SetSystemVersionClauseContext setSystemVersionClause() throws RecognitionException {
		SetSystemVersionClauseContext _localctx = new SetSystemVersionClauseContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_setSystemVersionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2306);
			match(SYSTEM_VERSIONING);
			setState(2307);
			match(EQ_);
			setState(2313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OFF:
				{
				setState(2308);
				match(OFF);
				}
				break;
			case ON:
				{
				setState(2309);
				match(ON);
				setState(2311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2310);
					alterSetOnClause();
					}
				}

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

	public static class AlterSetOnClauseContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode HISTORY_TABLE() { return getToken(SQLServerStatementParser.HISTORY_TABLE, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public DataConsistencyCheckClause_Context dataConsistencyCheckClause_() {
			return getRuleContext(DataConsistencyCheckClause_Context.class,0);
		}
		public HistoryRetentionPeriodClause_Context historyRetentionPeriodClause_() {
			return getRuleContext(HistoryRetentionPeriodClause_Context.class,0);
		}
		public AlterSetOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSetOnClause; }
	}

	public final AlterSetOnClauseContext alterSetOnClause() throws RecognitionException {
		AlterSetOnClauseContext _localctx = new AlterSetOnClauseContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_alterSetOnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
			match(LP_);
			setState(2319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HISTORY_TABLE) {
				{
				setState(2316);
				match(HISTORY_TABLE);
				setState(2317);
				match(EQ_);
				setState(2318);
				tableName();
				}
			}

			setState(2322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(2321);
				dataConsistencyCheckClause_();
				}
				break;
			}
			setState(2325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_ || _la==HISTORY_RETENTION_PERIOD) {
				{
				setState(2324);
				historyRetentionPeriodClause_();
				}
			}

			setState(2327);
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

	public static class DataConsistencyCheckClause_Context extends ParserRuleContext {
		public TerminalNode DATA_CONSISTENCY_CHECK() { return getToken(SQLServerStatementParser.DATA_CONSISTENCY_CHECK, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public OnOffOption_Context onOffOption_() {
			return getRuleContext(OnOffOption_Context.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public DataConsistencyCheckClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataConsistencyCheckClause_; }
	}

	public final DataConsistencyCheckClause_Context dataConsistencyCheckClause_() throws RecognitionException {
		DataConsistencyCheckClause_Context _localctx = new DataConsistencyCheckClause_Context(_ctx, getState());
		enterRule(_localctx, 388, RULE_dataConsistencyCheckClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(2329);
				match(COMMA_);
				}
			}

			setState(2332);
			match(DATA_CONSISTENCY_CHECK);
			setState(2333);
			match(EQ_);
			setState(2334);
			onOffOption_();
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

	public static class HistoryRetentionPeriodClause_Context extends ParserRuleContext {
		public TerminalNode HISTORY_RETENTION_PERIOD() { return getToken(SQLServerStatementParser.HISTORY_RETENTION_PERIOD, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public HistoryRetentionPeriodContext historyRetentionPeriod() {
			return getRuleContext(HistoryRetentionPeriodContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public HistoryRetentionPeriodClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_historyRetentionPeriodClause_; }
	}

	public final HistoryRetentionPeriodClause_Context historyRetentionPeriodClause_() throws RecognitionException {
		HistoryRetentionPeriodClause_Context _localctx = new HistoryRetentionPeriodClause_Context(_ctx, getState());
		enterRule(_localctx, 390, RULE_historyRetentionPeriodClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(2336);
				match(COMMA_);
				}
			}

			setState(2339);
			match(HISTORY_RETENTION_PERIOD);
			setState(2340);
			match(EQ_);
			setState(2341);
			historyRetentionPeriod();
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

	public static class HistoryRetentionPeriodContext extends ParserRuleContext {
		public TerminalNode INFINITE() { return getToken(SQLServerStatementParser.INFINITE, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode DAY() { return getToken(SQLServerStatementParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SQLServerStatementParser.DAYS, 0); }
		public TerminalNode WEEK() { return getToken(SQLServerStatementParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SQLServerStatementParser.WEEKS, 0); }
		public TerminalNode MONTH() { return getToken(SQLServerStatementParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SQLServerStatementParser.MONTHS, 0); }
		public TerminalNode YEAR() { return getToken(SQLServerStatementParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SQLServerStatementParser.YEARS, 0); }
		public HistoryRetentionPeriodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_historyRetentionPeriod; }
	}

	public final HistoryRetentionPeriodContext historyRetentionPeriod() throws RecognitionException {
		HistoryRetentionPeriodContext _localctx = new HistoryRetentionPeriodContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_historyRetentionPeriod);
		int _la;
		try {
			setState(2346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INFINITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2343);
				match(INFINITE);
				}
				break;
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2344);
				match(NUMBER_);
				setState(2345);
				_la = _input.LA(1);
				if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (YEAR - 136)) | (1L << (MONTH - 136)) | (1L << (WEEK - 136)) | (1L << (DAY - 136)))) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (YEARS - 202)) | (1L << (MONTHS - 202)) | (1L << (WEEKS - 202)) | (1L << (DAYS - 202)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class AlterTableTableIndexContext extends ParserRuleContext {
		public IndexWithNameContext indexWithName() {
			return getRuleContext(IndexWithNameContext.class,0);
		}
		public IndexNonClusterClauseContext indexNonClusterClause() {
			return getRuleContext(IndexNonClusterClauseContext.class,0);
		}
		public IndexClusterClauseContext indexClusterClause() {
			return getRuleContext(IndexClusterClauseContext.class,0);
		}
		public AlterTableTableIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableTableIndex; }
	}

	public final AlterTableTableIndexContext alterTableTableIndex() throws RecognitionException {
		AlterTableTableIndexContext _localctx = new AlterTableTableIndexContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_alterTableTableIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2348);
			indexWithName();
			setState(2351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONCLUSTERED:
				{
				setState(2349);
				indexNonClusterClause();
				}
				break;
			case CLUSTERED:
				{
				setState(2350);
				indexClusterClause();
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

	public static class IndexWithNameContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IndexWithNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexWithName; }
	}

	public final IndexWithNameContext indexWithName() throws RecognitionException {
		IndexWithNameContext _localctx = new IndexWithNameContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_indexWithName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2353);
			match(INDEX);
			setState(2354);
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

	public static class IndexNonClusterClauseContext extends ParserRuleContext {
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public HashWithBucketContext hashWithBucket() {
			return getRuleContext(HashWithBucketContext.class,0);
		}
		public ColumnNameWithSortsWithParenContext columnNameWithSortsWithParen() {
			return getRuleContext(ColumnNameWithSortsWithParenContext.class,0);
		}
		public AlterTableIndexOnClauseContext alterTableIndexOnClause() {
			return getRuleContext(AlterTableIndexOnClauseContext.class,0);
		}
		public IndexNonClusterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexNonClusterClause; }
	}

	public final IndexNonClusterClauseContext indexNonClusterClause() throws RecognitionException {
		IndexNonClusterClauseContext _localctx = new IndexNonClusterClauseContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_indexNonClusterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2356);
			match(NONCLUSTERED);
			setState(2362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				{
				setState(2357);
				hashWithBucket();
				}
				break;
			case LP_:
				{
				setState(2358);
				columnNameWithSortsWithParen();
				setState(2360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON || _la==DEFAULT) {
					{
					setState(2359);
					alterTableIndexOnClause();
					}
				}

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

	public static class AlterTableIndexOnClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public AlterTableIndexOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableIndexOnClause; }
	}

	public final AlterTableIndexOnClauseContext alterTableIndexOnClause() throws RecognitionException {
		AlterTableIndexOnClauseContext _localctx = new AlterTableIndexOnClauseContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_alterTableIndexOnClause);
		try {
			setState(2367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2364);
				match(ON);
				setState(2365);
				ignoredIdentifier_();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2366);
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

	public static class IndexClusterClauseContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public IndexOnClauseContext indexOnClause() {
			return getRuleContext(IndexOnClauseContext.class,0);
		}
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public IndexClusterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexClusterClause; }
	}

	public final IndexClusterClauseContext indexClusterClause() throws RecognitionException {
		IndexClusterClauseContext _localctx = new IndexClusterClauseContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_indexClusterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2369);
			match(CLUSTERED);
			setState(2370);
			match(COLUMNSTORE);
			setState(2378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2371);
				match(WITH);
				setState(2372);
				match(COMPRESSION_DELAY);
				setState(2373);
				match(EQ_);
				setState(2374);
				match(NUMBER_);
				setState(2376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUTES) {
					{
					setState(2375);
					match(MINUTES);
					}
				}

				}
			}

			setState(2381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2380);
				indexOnClause();
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

	public static class AlterTableOptionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode LOCK_ESCALATION() { return getToken(SQLServerStatementParser.LOCK_ESCALATION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode AUTO() { return getToken(SQLServerStatementParser.AUTO, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TerminalNode DISABLE() { return getToken(SQLServerStatementParser.DISABLE, 0); }
		public TerminalNode MEMORY_OPTIMIZED() { return getToken(SQLServerStatementParser.MEMORY_OPTIMIZED, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode DURABILITY() { return getToken(SQLServerStatementParser.DURABILITY, 0); }
		public TerminalNode SCHEMA_ONLY() { return getToken(SQLServerStatementParser.SCHEMA_ONLY, 0); }
		public TerminalNode SCHEMA_AND_DATA() { return getToken(SQLServerStatementParser.SCHEMA_AND_DATA, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public OnHistoryTableClauseContext onHistoryTableClause() {
			return getRuleContext(OnHistoryTableClauseContext.class,0);
		}
		public AlterTableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableOption; }
	}

	public final AlterTableOptionContext alterTableOption() throws RecognitionException {
		AlterTableOptionContext _localctx = new AlterTableOptionContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_alterTableOption);
		int _la;
		try {
			setState(2401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(2383);
				match(SET);
				setState(2384);
				match(LP_);
				setState(2385);
				match(LOCK_ESCALATION);
				setState(2386);
				match(EQ_);
				setState(2387);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==DISABLE || _la==AUTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2388);
				match(RP_);
				}
				break;
			case MEMORY_OPTIMIZED:
				enterOuterAlt(_localctx, 2);
				{
				setState(2389);
				match(MEMORY_OPTIMIZED);
				setState(2390);
				match(EQ_);
				setState(2391);
				match(ON);
				}
				break;
			case DURABILITY:
				enterOuterAlt(_localctx, 3);
				{
				setState(2392);
				match(DURABILITY);
				setState(2393);
				match(EQ_);
				setState(2394);
				_la = _input.LA(1);
				if ( !(_la==SCHEMA_AND_DATA || _la==SCHEMA_ONLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SYSTEM_VERSIONING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2395);
				match(SYSTEM_VERSIONING);
				setState(2396);
				match(EQ_);
				setState(2397);
				match(ON);
				setState(2399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2398);
					onHistoryTableClause();
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

	public static class OnHistoryTableClauseContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode HISTORY_TABLE() { return getToken(SQLServerStatementParser.HISTORY_TABLE, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode DATA_CONSISTENCY_CHECK() { return getToken(SQLServerStatementParser.DATA_CONSISTENCY_CHECK, 0); }
		public OnOffOption_Context onOffOption_() {
			return getRuleContext(OnOffOption_Context.class,0);
		}
		public OnHistoryTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onHistoryTableClause; }
	}

	public final OnHistoryTableClauseContext onHistoryTableClause() throws RecognitionException {
		OnHistoryTableClauseContext _localctx = new OnHistoryTableClauseContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_onHistoryTableClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2403);
			match(LP_);
			setState(2404);
			match(HISTORY_TABLE);
			setState(2405);
			match(EQ_);
			setState(2406);
			tableName();
			setState(2411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(2407);
				match(COMMA_);
				setState(2408);
				match(DATA_CONSISTENCY_CHECK);
				setState(2409);
				match(EQ_);
				setState(2410);
				onOffOption_();
				}
			}

			setState(2413);
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

	public static class IfExist_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public IfExist_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExist_; }
	}

	public final IfExist_Context ifExist_() throws RecognitionException {
		IfExist_Context _localctx = new IfExist_Context(_ctx, getState());
		enterRule(_localctx, 408, RULE_ifExist_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2415);
			match(IF);
			setState(2416);
			match(EXISTS);
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
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_setTransaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2418);
			match(SET);
			setState(2419);
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

	public static class SetImplicitTransactionsContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode IMPLICIT_TRANSACTIONS() { return getToken(SQLServerStatementParser.IMPLICIT_TRANSACTIONS, 0); }
		public ImplicitTransactionsValueContext implicitTransactionsValue() {
			return getRuleContext(ImplicitTransactionsValueContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public List<TerminalNode> AT_() { return getTokens(SQLServerStatementParser.AT_); }
		public TerminalNode AT_(int i) {
			return getToken(SQLServerStatementParser.AT_, i);
		}
		public TerminalNode TRANCOUNT() { return getToken(SQLServerStatementParser.TRANCOUNT, 0); }
		public TerminalNode GT_() { return getToken(SQLServerStatementParser.GT_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode COMMIT() { return getToken(SQLServerStatementParser.COMMIT, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public SetImplicitTransactionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setImplicitTransactions; }
	}

	public final SetImplicitTransactionsContext setImplicitTransactions() throws RecognitionException {
		SetImplicitTransactionsContext _localctx = new SetImplicitTransactionsContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_setImplicitTransactions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2421);
				match(IF);
				setState(2422);
				match(AT_);
				setState(2423);
				match(AT_);
				setState(2424);
				match(TRANCOUNT);
				setState(2425);
				match(GT_);
				setState(2426);
				match(NUMBER_);
				setState(2427);
				match(COMMIT);
				setState(2428);
				match(TRAN);
				}
			}

			setState(2431);
			match(SET);
			setState(2432);
			match(IMPLICIT_TRANSACTIONS);
			setState(2433);
			implicitTransactionsValue();
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

	public static class ImplicitTransactionsValueContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public ImplicitTransactionsValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitTransactionsValue; }
	}

	public final ImplicitTransactionsValueContext implicitTransactionsValue() throws RecognitionException {
		ImplicitTransactionsValueContext _localctx = new ImplicitTransactionsValueContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_implicitTransactionsValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2435);
			_la = _input.LA(1);
			if ( !(_la==ON || _la==OFF) ) {
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

	public static class BeginTransactionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(SQLServerStatementParser.BEGIN, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public BeginTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginTransaction; }
	}

	public final BeginTransactionContext beginTransaction() throws RecognitionException {
		BeginTransactionContext _localctx = new BeginTransactionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_beginTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2437);
			match(BEGIN);
			setState(2438);
			_la = _input.LA(1);
			if ( !(_la==TRANSACTION || _la==TRAN) ) {
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

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(SQLServerStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2440);
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
		public TerminalNode ROLLBACK() { return getToken(SQLServerStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2442);
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
		public TerminalNode SAVE() { return getToken(SQLServerStatementParser.SAVE, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_savepoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2444);
			match(SAVE);
			setState(2445);
			_la = _input.LA(1);
			if ( !(_la==TRANSACTION || _la==TRAN) ) {
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

	public static class GrantContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(SQLServerStatementParser.GRANT, 0); }
		public ClassPrivilegesClause_Context classPrivilegesClause_() {
			return getRuleContext(ClassPrivilegesClause_Context.class,0);
		}
		public ClassTypePrivilegesClause_Context classTypePrivilegesClause_() {
			return getRuleContext(ClassTypePrivilegesClause_Context.class,0);
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
		enterRule(_localctx, 424, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2447);
			match(GRANT);
			setState(2451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				setState(2448);
				classPrivilegesClause_();
				}
				break;
			case 2:
				{
				setState(2449);
				classTypePrivilegesClause_();
				}
				break;
			case 3:
				{
				setState(2450);
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
		public TerminalNode REVOKE() { return getToken(SQLServerStatementParser.REVOKE, 0); }
		public ClassPrivilegesClause_Context classPrivilegesClause_() {
			return getRuleContext(ClassPrivilegesClause_Context.class,0);
		}
		public ClassTypePrivilegesClause_Context classTypePrivilegesClause_() {
			return getRuleContext(ClassTypePrivilegesClause_Context.class,0);
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
		enterRule(_localctx, 426, RULE_revoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2453);
			match(REVOKE);
			setState(2460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(2455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANT) {
					{
					setState(2454);
					optionForClause_();
					}
				}

				setState(2457);
				classPrivilegesClause_();
				}
				break;
			case 2:
				{
				setState(2458);
				classTypePrivilegesClause_();
				}
				break;
			case 3:
				{
				setState(2459);
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

	public static class DenyContext extends ParserRuleContext {
		public TerminalNode DENY() { return getToken(SQLServerStatementParser.DENY, 0); }
		public ClassPrivilegesClause_Context classPrivilegesClause_() {
			return getRuleContext(ClassPrivilegesClause_Context.class,0);
		}
		public ClassTypePrivilegesClause_Context classTypePrivilegesClause_() {
			return getRuleContext(ClassTypePrivilegesClause_Context.class,0);
		}
		public DenyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deny; }
	}

	public final DenyContext deny() throws RecognitionException {
		DenyContext _localctx = new DenyContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_deny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2462);
			match(DENY);
			setState(2465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(2463);
				classPrivilegesClause_();
				}
				break;
			case 2:
				{
				setState(2464);
				classTypePrivilegesClause_();
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

	public static class ClassPrivilegesClause_Context extends ParserRuleContext {
		public ClassPrivileges_Context classPrivileges_() {
			return getRuleContext(ClassPrivileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public OnClassClause_Context onClassClause_() {
			return getRuleContext(OnClassClause_Context.class,0);
		}
		public ClassPrivilegesClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classPrivilegesClause_; }
	}

	public final ClassPrivilegesClause_Context classPrivilegesClause_() throws RecognitionException {
		ClassPrivilegesClause_Context _localctx = new ClassPrivilegesClause_Context(_ctx, getState());
		enterRule(_localctx, 430, RULE_classPrivilegesClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2467);
			classPrivileges_();
			setState(2470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2468);
				match(ON);
				setState(2469);
				onClassClause_();
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

	public static class ClassTypePrivilegesClause_Context extends ParserRuleContext {
		public ClassTypePrivileges_Context classTypePrivileges_() {
			return getRuleContext(ClassTypePrivileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public OnClassTypeClause_Context onClassTypeClause_() {
			return getRuleContext(OnClassTypeClause_Context.class,0);
		}
		public ClassTypePrivilegesClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTypePrivilegesClause_; }
	}

	public final ClassTypePrivilegesClause_Context classTypePrivilegesClause_() throws RecognitionException {
		ClassTypePrivilegesClause_Context _localctx = new ClassTypePrivilegesClause_Context(_ctx, getState());
		enterRule(_localctx, 432, RULE_classTypePrivilegesClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2472);
			classTypePrivileges_();
			setState(2475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2473);
				match(ON);
				setState(2474);
				onClassTypeClause_();
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

	public static class OptionForClause_Context extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(SQLServerStatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(SQLServerStatementParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public OptionForClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionForClause_; }
	}

	public final OptionForClause_Context optionForClause_() throws RecognitionException {
		OptionForClause_Context _localctx = new OptionForClause_Context(_ctx, getState());
		enterRule(_localctx, 434, RULE_optionForClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2477);
			match(GRANT);
			setState(2478);
			match(OPTION);
			setState(2479);
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

	public static class ClassPrivileges_Context extends ParserRuleContext {
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
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ClassPrivileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classPrivileges_; }
	}

	public final ClassPrivileges_Context classPrivileges_() throws RecognitionException {
		ClassPrivileges_Context _localctx = new ClassPrivileges_Context(_ctx, getState());
		enterRule(_localctx, 436, RULE_classPrivileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2481);
			privilegeType_();
			setState(2483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2482);
				columnNames();
				}
			}

			setState(2492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2485);
				match(COMMA_);
				setState(2486);
				privilegeType_();
				setState(2488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2487);
					columnNames();
					}
				}

				}
				}
				setState(2494);
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

	public static class OnClassClause_Context extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public Class_Context class_() {
			return getRuleContext(Class_Context.class,0);
		}
		public OnClassClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClassClause_; }
	}

	public final OnClassClause_Context onClassClause_() throws RecognitionException {
		OnClassClause_Context _localctx = new OnClassClause_Context(_ctx, getState());
		enterRule(_localctx, 438, RULE_onClassClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				{
				setState(2495);
				class_();
				}
				break;
			}
			setState(2498);
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

	public static class ClassTypePrivileges_Context extends ParserRuleContext {
		public List<PrivilegeType_Context> privilegeType_() {
			return getRuleContexts(PrivilegeType_Context.class);
		}
		public PrivilegeType_Context privilegeType_(int i) {
			return getRuleContext(PrivilegeType_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ClassTypePrivileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTypePrivileges_; }
	}

	public final ClassTypePrivileges_Context classTypePrivileges_() throws RecognitionException {
		ClassTypePrivileges_Context _localctx = new ClassTypePrivileges_Context(_ctx, getState());
		enterRule(_localctx, 440, RULE_classTypePrivileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2500);
			privilegeType_();
			setState(2505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2501);
				match(COMMA_);
				setState(2502);
				privilegeType_();
				}
				}
				setState(2507);
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

	public static class OnClassTypeClause_Context extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ClassType_Context classType_() {
			return getRuleContext(ClassType_Context.class,0);
		}
		public OnClassTypeClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClassTypeClause_; }
	}

	public final OnClassTypeClause_Context onClassTypeClause_() throws RecognitionException {
		OnClassTypeClause_Context _localctx = new OnClassTypeClause_Context(_ctx, getState());
		enterRule(_localctx, 442, RULE_onClassTypeClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(2508);
				classType_();
				}
				break;
			}
			setState(2511);
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

	public static class PrivilegeType_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SQLServerStatementParser.PRIVILEGES, 0); }
		public BasicPermission_Context basicPermission_() {
			return getRuleContext(BasicPermission_Context.class,0);
		}
		public ObjectPermission_Context objectPermission_() {
			return getRuleContext(ObjectPermission_Context.class,0);
		}
		public ServerPermission_Context serverPermission_() {
			return getRuleContext(ServerPermission_Context.class,0);
		}
		public ServerPrincipalPermission_Context serverPrincipalPermission_() {
			return getRuleContext(ServerPrincipalPermission_Context.class,0);
		}
		public DatabasePermission_Context databasePermission_() {
			return getRuleContext(DatabasePermission_Context.class,0);
		}
		public DatabasePrincipalPermission_Context databasePrincipalPermission_() {
			return getRuleContext(DatabasePrincipalPermission_Context.class,0);
		}
		public SchemaPermission_Context schemaPermission_() {
			return getRuleContext(SchemaPermission_Context.class,0);
		}
		public ServiceBrokerPermission_Context serviceBrokerPermission_() {
			return getRuleContext(ServiceBrokerPermission_Context.class,0);
		}
		public EndpointPermission_Context endpointPermission_() {
			return getRuleContext(EndpointPermission_Context.class,0);
		}
		public CertificatePermission_Context certificatePermission_() {
			return getRuleContext(CertificatePermission_Context.class,0);
		}
		public SymmetricKeyPermission_Context symmetricKeyPermission_() {
			return getRuleContext(SymmetricKeyPermission_Context.class,0);
		}
		public AsymmetricKeyPermission_Context asymmetricKeyPermission_() {
			return getRuleContext(AsymmetricKeyPermission_Context.class,0);
		}
		public AssemblyPermission_Context assemblyPermission_() {
			return getRuleContext(AssemblyPermission_Context.class,0);
		}
		public AvailabilityGroupPermission_Context availabilityGroupPermission_() {
			return getRuleContext(AvailabilityGroupPermission_Context.class,0);
		}
		public FullTextPermission_Context fullTextPermission_() {
			return getRuleContext(FullTextPermission_Context.class,0);
		}
		public PrivilegeType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeType_; }
	}

	public final PrivilegeType_Context privilegeType_() throws RecognitionException {
		PrivilegeType_Context _localctx = new PrivilegeType_Context(_ctx, getState());
		enterRule(_localctx, 444, RULE_privilegeType_);
		int _la;
		try {
			setState(2532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2513);
				match(ALL);
				setState(2515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(2514);
					match(PRIVILEGES);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2517);
				basicPermission_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2518);
				objectPermission_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2519);
				serverPermission_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2520);
				serverPrincipalPermission_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2521);
				databasePermission_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2522);
				databasePrincipalPermission_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2523);
				schemaPermission_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2524);
				serviceBrokerPermission_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2525);
				endpointPermission_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2526);
				certificatePermission_();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2527);
				symmetricKeyPermission_();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2528);
				asymmetricKeyPermission_();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2529);
				assemblyPermission_();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2530);
				availabilityGroupPermission_();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2531);
				fullTextPermission_();
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

	public static class BasicPermission_Context extends ParserRuleContext {
		public TerminalNode CONTROL() { return getToken(SQLServerStatementParser.CONTROL, 0); }
		public TerminalNode SERVER() { return getToken(SQLServerStatementParser.SERVER, 0); }
		public TerminalNode TAKE() { return getToken(SQLServerStatementParser.TAKE, 0); }
		public TerminalNode OWNERSHIP() { return getToken(SQLServerStatementParser.OWNERSHIP, 0); }
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SQLServerStatementParser.VIEW, 0); }
		public TerminalNode DEFINITION() { return getToken(SQLServerStatementParser.DEFINITION, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode REFERENCES() { return getToken(SQLServerStatementParser.REFERENCES, 0); }
		public TerminalNode SELECT() { return getToken(SQLServerStatementParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(SQLServerStatementParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(SQLServerStatementParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(SQLServerStatementParser.DELETE, 0); }
		public TerminalNode EXECUTE() { return getToken(SQLServerStatementParser.EXECUTE, 0); }
		public TerminalNode RECEIVE() { return getToken(SQLServerStatementParser.RECEIVE, 0); }
		public BasicPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicPermission_; }
	}

	public final BasicPermission_Context basicPermission_() throws RecognitionException {
		BasicPermission_Context _localctx = new BasicPermission_Context(_ctx, getState());
		enterRule(_localctx, 446, RULE_basicPermission_);
		int _la;
		try {
			setState(2553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTROL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2534);
				match(CONTROL);
				setState(2536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SERVER) {
					{
					setState(2535);
					match(SERVER);
					}
				}

				}
				break;
			case TAKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2538);
				match(TAKE);
				setState(2539);
				match(OWNERSHIP);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2540);
				match(ALTER);
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(2541);
				match(VIEW);
				setState(2543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANY) {
					{
					setState(2542);
					match(ANY);
					}
				}

				setState(2545);
				match(DEFINITION);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(2546);
				match(REFERENCES);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 6);
				{
				setState(2547);
				match(SELECT);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2548);
				match(INSERT);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2549);
				match(UPDATE);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2550);
				match(DELETE);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 10);
				{
				setState(2551);
				match(EXECUTE);
				}
				break;
			case RECEIVE:
				enterOuterAlt(_localctx, 11);
				{
				setState(2552);
				match(RECEIVE);
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

	public static class ObjectPermission_Context extends ParserRuleContext {
		public TerminalNode VIEW() { return getToken(SQLServerStatementParser.VIEW, 0); }
		public TerminalNode CHANGE() { return getToken(SQLServerStatementParser.CHANGE, 0); }
		public TerminalNode TRACKING() { return getToken(SQLServerStatementParser.TRACKING, 0); }
		public ObjectPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPermission_; }
	}

	public final ObjectPermission_Context objectPermission_() throws RecognitionException {
		ObjectPermission_Context _localctx = new ObjectPermission_Context(_ctx, getState());
		enterRule(_localctx, 448, RULE_objectPermission_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2555);
			match(VIEW);
			setState(2556);
			match(CHANGE);
			setState(2557);
			match(TRACKING);
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

	public static class ServerPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode RESOURCES() { return getToken(SQLServerStatementParser.RESOURCES, 0); }
		public TerminalNode SETTINGS() { return getToken(SQLServerStatementParser.SETTINGS, 0); }
		public TerminalNode TRACE() { return getToken(SQLServerStatementParser.TRACE, 0); }
		public TerminalNode SERVER() { return getToken(SQLServerStatementParser.SERVER, 0); }
		public TerminalNode STATE() { return getToken(SQLServerStatementParser.STATE, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode AVAILABILITY() { return getToken(SQLServerStatementParser.AVAILABILITY, 0); }
		public TerminalNode GROUP() { return getToken(SQLServerStatementParser.GROUP, 0); }
		public TerminalNode CONNECTION() { return getToken(SQLServerStatementParser.CONNECTION, 0); }
		public TerminalNode CREDENTIAL() { return getToken(SQLServerStatementParser.CREDENTIAL, 0); }
		public TerminalNode DATABASE() { return getToken(SQLServerStatementParser.DATABASE, 0); }
		public TerminalNode ENDPOINT() { return getToken(SQLServerStatementParser.ENDPOINT, 0); }
		public TerminalNode EVENT() { return getToken(SQLServerStatementParser.EVENT, 0); }
		public TerminalNode NOTIFICATION() { return getToken(SQLServerStatementParser.NOTIFICATION, 0); }
		public TerminalNode SESSION() { return getToken(SQLServerStatementParser.SESSION, 0); }
		public TerminalNode LINKED() { return getToken(SQLServerStatementParser.LINKED, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode AUDIT() { return getToken(SQLServerStatementParser.AUDIT, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode DDL() { return getToken(SQLServerStatementParser.DDL, 0); }
		public TerminalNode VIEW() { return getToken(SQLServerStatementParser.VIEW, 0); }
		public TerminalNode DEFINITION() { return getToken(SQLServerStatementParser.DEFINITION, 0); }
		public TerminalNode CONNECT() { return getToken(SQLServerStatementParser.CONNECT, 0); }
		public TerminalNode SQL() { return getToken(SQLServerStatementParser.SQL, 0); }
		public TerminalNode IMPERSONATE() { return getToken(SQLServerStatementParser.IMPERSONATE, 0); }
		public TerminalNode SELECT() { return getToken(SQLServerStatementParser.SELECT, 0); }
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public TerminalNode SECURABLES() { return getToken(SQLServerStatementParser.SECURABLES, 0); }
		public TerminalNode AUTHENTICATE() { return getToken(SQLServerStatementParser.AUTHENTICATE, 0); }
		public TerminalNode EXTERNAL() { return getToken(SQLServerStatementParser.EXTERNAL, 0); }
		public TerminalNode ACCESS() { return getToken(SQLServerStatementParser.ACCESS, 0); }
		public TerminalNode ASSEMBLY() { return getToken(SQLServerStatementParser.ASSEMBLY, 0); }
		public TerminalNode ADMINISTER() { return getToken(SQLServerStatementParser.ADMINISTER, 0); }
		public TerminalNode BULK() { return getToken(SQLServerStatementParser.BULK, 0); }
		public TerminalNode OPERATIONS() { return getToken(SQLServerStatementParser.OPERATIONS, 0); }
		public TerminalNode UNSAFE() { return getToken(SQLServerStatementParser.UNSAFE, 0); }
		public TerminalNode SHUTDOWN() { return getToken(SQLServerStatementParser.SHUTDOWN, 0); }
		public ServerPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverPermission_; }
	}

	public final ServerPermission_Context serverPermission_() throws RecognitionException {
		ServerPermission_Context _localctx = new ServerPermission_Context(_ctx, getState());
		enterRule(_localctx, 450, RULE_serverPermission_);
		int _la;
		try {
			setState(2634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2559);
				match(ALTER);
				setState(2565);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RESOURCES:
					{
					setState(2560);
					match(RESOURCES);
					}
					break;
				case SETTINGS:
					{
					setState(2561);
					match(SETTINGS);
					}
					break;
				case TRACE:
					{
					setState(2562);
					match(TRACE);
					}
					break;
				case SERVER:
					{
					setState(2563);
					match(SERVER);
					setState(2564);
					match(STATE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2567);
				match(ALTER);
				setState(2568);
				match(ANY);
				setState(2586);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2569);
					match(AVAILABILITY);
					setState(2570);
					match(GROUP);
					}
					break;
				case 2:
					{
					setState(2571);
					match(CONNECTION);
					}
					break;
				case 3:
					{
					setState(2572);
					match(CREDENTIAL);
					}
					break;
				case 4:
					{
					setState(2573);
					match(DATABASE);
					}
					break;
				case 5:
					{
					setState(2574);
					match(ENDPOINT);
					}
					break;
				case 6:
					{
					setState(2575);
					match(EVENT);
					setState(2576);
					match(NOTIFICATION);
					}
					break;
				case 7:
					{
					setState(2577);
					match(EVENT);
					setState(2578);
					match(SESSION);
					}
					break;
				case 8:
					{
					setState(2579);
					match(LINKED);
					setState(2580);
					match(SERVER);
					}
					break;
				case 9:
					{
					setState(2581);
					match(LOGIN);
					}
					break;
				case 10:
					{
					setState(2582);
					match(SERVER);
					setState(2583);
					match(AUDIT);
					}
					break;
				case 11:
					{
					setState(2584);
					match(SERVER);
					setState(2585);
					match(ROLE);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2588);
				match(CREATE);
				setState(2600);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AVAILABILITY:
					{
					setState(2589);
					match(AVAILABILITY);
					setState(2590);
					match(GROUP);
					}
					break;
				case DDL:
					{
					setState(2591);
					match(DDL);
					setState(2592);
					match(EVENT);
					setState(2593);
					match(NOTIFICATION);
					}
					break;
				case ENDPOINT:
					{
					setState(2594);
					match(ENDPOINT);
					}
					break;
				case SERVER:
					{
					setState(2595);
					match(SERVER);
					setState(2596);
					match(ROLE);
					}
					break;
				case TRACE:
					{
					setState(2597);
					match(TRACE);
					setState(2598);
					match(EVENT);
					setState(2599);
					match(NOTIFICATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2602);
				match(CREATE);
				setState(2603);
				match(ANY);
				setState(2604);
				match(DATABASE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2605);
				match(VIEW);
				setState(2606);
				match(SERVER);
				setState(2607);
				match(STATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2608);
				match(VIEW);
				setState(2609);
				match(ANY);
				setState(2610);
				_la = _input.LA(1);
				if ( !(_la==DATABASE || _la==DEFINITION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2611);
				match(CONNECT);
				setState(2612);
				match(ANY);
				setState(2613);
				match(DATABASE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2614);
				match(CONNECT);
				setState(2615);
				match(SQL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2616);
				match(IMPERSONATE);
				setState(2617);
				match(ANY);
				setState(2618);
				match(LOGIN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2619);
				match(SELECT);
				setState(2620);
				match(ALL);
				setState(2621);
				match(USER);
				setState(2622);
				match(SECURABLES);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2623);
				match(AUTHENTICATE);
				setState(2624);
				match(SERVER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2625);
				match(EXTERNAL);
				setState(2626);
				match(ACCESS);
				setState(2627);
				match(ASSEMBLY);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2628);
				match(ADMINISTER);
				setState(2629);
				match(BULK);
				setState(2630);
				match(OPERATIONS);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2631);
				match(UNSAFE);
				setState(2632);
				match(ASSEMBLY);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2633);
				match(SHUTDOWN);
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

	public static class ServerPrincipalPermission_Context extends ParserRuleContext {
		public TerminalNode IMPERSONATE() { return getToken(SQLServerStatementParser.IMPERSONATE, 0); }
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode SERVER() { return getToken(SQLServerStatementParser.SERVER, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public ServerPrincipalPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverPrincipalPermission_; }
	}

	public final ServerPrincipalPermission_Context serverPrincipalPermission_() throws RecognitionException {
		ServerPrincipalPermission_Context _localctx = new ServerPrincipalPermission_Context(_ctx, getState());
		enterRule(_localctx, 452, RULE_serverPrincipalPermission_);
		try {
			setState(2644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPERSONATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2636);
				match(IMPERSONATE);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2637);
				match(ALTER);
				setState(2638);
				match(ANY);
				setState(2642);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOGIN:
					{
					setState(2639);
					match(LOGIN);
					}
					break;
				case SERVER:
					{
					setState(2640);
					match(SERVER);
					setState(2641);
					match(ROLE);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class DatabasePermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode TRACE() { return getToken(SQLServerStatementParser.TRACE, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode DATABASE() { return getToken(SQLServerStatementParser.DATABASE, 0); }
		public TerminalNode DATASPACE() { return getToken(SQLServerStatementParser.DATASPACE, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLServerStatementParser.SCHEMA, 0); }
		public TerminalNode SERVICE() { return getToken(SQLServerStatementParser.SERVICE, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode CERTIFICATE() { return getToken(SQLServerStatementParser.CERTIFICATE, 0); }
		public TerminalNode CONTRACT() { return getToken(SQLServerStatementParser.CONTRACT, 0); }
		public TerminalNode ASSEMBLY() { return getToken(SQLServerStatementParser.ASSEMBLY, 0); }
		public TerminalNode CONNECTION() { return getToken(SQLServerStatementParser.CONNECTION, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public TerminalNode COLUMN() { return getToken(SQLServerStatementParser.COLUMN, 0); }
		public TerminalNode MASTER() { return getToken(SQLServerStatementParser.MASTER, 0); }
		public TerminalNode DEFINITION() { return getToken(SQLServerStatementParser.DEFINITION, 0); }
		public TerminalNode EXTERNAL() { return getToken(SQLServerStatementParser.EXTERNAL, 0); }
		public TerminalNode FULLTEXT() { return getToken(SQLServerStatementParser.FULLTEXT, 0); }
		public TerminalNode CATALOG() { return getToken(SQLServerStatementParser.CATALOG, 0); }
		public TerminalNode MASK() { return getToken(SQLServerStatementParser.MASK, 0); }
		public TerminalNode MESSAGE() { return getToken(SQLServerStatementParser.MESSAGE, 0); }
		public TerminalNode TYPE() { return getToken(SQLServerStatementParser.TYPE, 0); }
		public TerminalNode REMOTE() { return getToken(SQLServerStatementParser.REMOTE, 0); }
		public TerminalNode BINDING() { return getToken(SQLServerStatementParser.BINDING, 0); }
		public TerminalNode ROUTE() { return getToken(SQLServerStatementParser.ROUTE, 0); }
		public TerminalNode EVENT() { return getToken(SQLServerStatementParser.EVENT, 0); }
		public TerminalNode SESSION() { return getToken(SQLServerStatementParser.SESSION, 0); }
		public TerminalNode SECURITY() { return getToken(SQLServerStatementParser.SECURITY, 0); }
		public TerminalNode POLICY() { return getToken(SQLServerStatementParser.POLICY, 0); }
		public TerminalNode SYMMETRIC() { return getToken(SQLServerStatementParser.SYMMETRIC, 0); }
		public TerminalNode ASYMMETRIC() { return getToken(SQLServerStatementParser.ASYMMETRIC, 0); }
		public TerminalNode ENCRYPTION() { return getToken(SQLServerStatementParser.ENCRYPTION, 0); }
		public TerminalNode DATA() { return getToken(SQLServerStatementParser.DATA, 0); }
		public TerminalNode SOURCE() { return getToken(SQLServerStatementParser.SOURCE, 0); }
		public TerminalNode FILE() { return getToken(SQLServerStatementParser.FILE, 0); }
		public TerminalNode FORMAT() { return getToken(SQLServerStatementParser.FORMAT, 0); }
		public TerminalNode LIBRARY() { return getToken(SQLServerStatementParser.LIBRARY, 0); }
		public TerminalNode AUDIT() { return getToken(SQLServerStatementParser.AUDIT, 0); }
		public TerminalNode DDL() { return getToken(SQLServerStatementParser.DDL, 0); }
		public TerminalNode TRIGGER() { return getToken(SQLServerStatementParser.TRIGGER, 0); }
		public TerminalNode NOTIFICATION() { return getToken(SQLServerStatementParser.NOTIFICATION, 0); }
		public TerminalNode SCOPED() { return getToken(SQLServerStatementParser.SCOPED, 0); }
		public TerminalNode CONFIGURATION() { return getToken(SQLServerStatementParser.CONFIGURATION, 0); }
		public TerminalNode APPLICATION() { return getToken(SQLServerStatementParser.APPLICATION, 0); }
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SQLServerStatementParser.VIEW, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public TerminalNode AGGREGATE() { return getToken(SQLServerStatementParser.AGGREGATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SQLServerStatementParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(SQLServerStatementParser.PROCEDURE, 0); }
		public TerminalNode QUEUE() { return getToken(SQLServerStatementParser.QUEUE, 0); }
		public TerminalNode RULE() { return getToken(SQLServerStatementParser.RULE, 0); }
		public TerminalNode SYNONYM() { return getToken(SQLServerStatementParser.SYNONYM, 0); }
		public TerminalNode XML() { return getToken(SQLServerStatementParser.XML, 0); }
		public TerminalNode COLLECTION() { return getToken(SQLServerStatementParser.COLLECTION, 0); }
		public TerminalNode STATE() { return getToken(SQLServerStatementParser.STATE, 0); }
		public TerminalNode SERVER() { return getToken(SQLServerStatementParser.SERVER, 0); }
		public TerminalNode EXECUTE() { return getToken(SQLServerStatementParser.EXECUTE, 0); }
		public TerminalNode SCRIPT() { return getToken(SQLServerStatementParser.SCRIPT, 0); }
		public TerminalNode CONNECT() { return getToken(SQLServerStatementParser.CONNECT, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public TerminalNode KILL() { return getToken(SQLServerStatementParser.KILL, 0); }
		public TerminalNode BACKUP() { return getToken(SQLServerStatementParser.BACKUP, 0); }
		public TerminalNode LOG() { return getToken(SQLServerStatementParser.LOG, 0); }
		public TerminalNode AUTHENTICATE() { return getToken(SQLServerStatementParser.AUTHENTICATE, 0); }
		public TerminalNode SHOWPLAN() { return getToken(SQLServerStatementParser.SHOWPLAN, 0); }
		public TerminalNode SUBSCRIBE() { return getToken(SQLServerStatementParser.SUBSCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SQLServerStatementParser.QUERY, 0); }
		public TerminalNode NOTIFICATIONS() { return getToken(SQLServerStatementParser.NOTIFICATIONS, 0); }
		public TerminalNode UNMASK() { return getToken(SQLServerStatementParser.UNMASK, 0); }
		public TerminalNode CHECKPOINT() { return getToken(SQLServerStatementParser.CHECKPOINT, 0); }
		public TerminalNode ADMINISTER() { return getToken(SQLServerStatementParser.ADMINISTER, 0); }
		public TerminalNode BULK() { return getToken(SQLServerStatementParser.BULK, 0); }
		public TerminalNode OPERATIONS() { return getToken(SQLServerStatementParser.OPERATIONS, 0); }
		public DatabasePermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databasePermission_; }
	}

	public final DatabasePermission_Context databasePermission_() throws RecognitionException {
		DatabasePermission_Context _localctx = new DatabasePermission_Context(_ctx, getState());
		enterRule(_localctx, 454, RULE_databasePermission_);
		int _la;
		try {
			setState(2799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2646);
				match(ALTER);
				setState(2647);
				match(TRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2648);
				match(ALTER);
				setState(2649);
				match(ANY);
				setState(2709);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2650);
					match(DATABASE);
					setState(2660);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
					case 1:
						{
						setState(2651);
						match(AUDIT);
						}
						break;
					case 2:
						{
						setState(2652);
						match(DDL);
						setState(2653);
						match(TRIGGER);
						}
						break;
					case 3:
						{
						setState(2654);
						match(EVENT);
						setState(2655);
						match(NOTIFICATION);
						}
						break;
					case 4:
						{
						setState(2656);
						match(EVENT);
						setState(2657);
						match(SESSION);
						}
						break;
					case 5:
						{
						setState(2658);
						match(SCOPED);
						setState(2659);
						match(CONFIGURATION);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(2662);
					match(DATASPACE);
					}
					break;
				case 3:
					{
					setState(2663);
					match(SCHEMA);
					}
					break;
				case 4:
					{
					setState(2664);
					match(SERVICE);
					setState(2666);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AUDIT) {
						{
						setState(2665);
						match(AUDIT);
						}
					}

					}
					break;
				case 5:
					{
					setState(2668);
					match(USER);
					}
					break;
				case 6:
					{
					setState(2670);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==APPLICATION) {
						{
						setState(2669);
						match(APPLICATION);
						}
					}

					setState(2672);
					match(ROLE);
					}
					break;
				case 7:
					{
					setState(2673);
					match(CERTIFICATE);
					}
					break;
				case 8:
					{
					setState(2674);
					match(CONTRACT);
					}
					break;
				case 9:
					{
					setState(2675);
					match(ASSEMBLY);
					}
					break;
				case 10:
					{
					setState(2676);
					match(CONNECTION);
					}
					break;
				case 11:
					{
					setState(2681);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SYMMETRIC:
						{
						setState(2677);
						match(SYMMETRIC);
						}
						break;
					case ASYMMETRIC:
						{
						setState(2678);
						match(ASYMMETRIC);
						}
						break;
					case COLUMN:
						{
						setState(2679);
						match(COLUMN);
						setState(2680);
						match(ENCRYPTION);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2683);
					match(KEY);
					}
					break;
				case 12:
					{
					setState(2684);
					match(COLUMN);
					setState(2685);
					match(MASTER);
					setState(2686);
					match(KEY);
					setState(2687);
					match(DEFINITION);
					}
					break;
				case 13:
					{
					setState(2688);
					match(EXTERNAL);
					setState(2694);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DATA:
						{
						setState(2689);
						match(DATA);
						setState(2690);
						match(SOURCE);
						}
						break;
					case FILE:
						{
						setState(2691);
						match(FILE);
						setState(2692);
						match(FORMAT);
						}
						break;
					case LIBRARY:
						{
						setState(2693);
						match(LIBRARY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 14:
					{
					setState(2696);
					match(FULLTEXT);
					setState(2697);
					match(CATALOG);
					}
					break;
				case 15:
					{
					setState(2698);
					match(MASK);
					}
					break;
				case 16:
					{
					setState(2699);
					match(MESSAGE);
					setState(2700);
					match(TYPE);
					}
					break;
				case 17:
					{
					setState(2701);
					match(REMOTE);
					setState(2702);
					match(SERVICE);
					setState(2703);
					match(BINDING);
					}
					break;
				case 18:
					{
					setState(2704);
					match(ROUTE);
					}
					break;
				case 19:
					{
					setState(2705);
					match(EVENT);
					setState(2706);
					match(SESSION);
					}
					break;
				case 20:
					{
					setState(2707);
					match(SECURITY);
					setState(2708);
					match(POLICY);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2711);
				match(CREATE);
				setState(2746);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2712);
					match(DATABASE);
					}
					break;
				case 2:
					{
					setState(2713);
					match(DATABASE);
					setState(2714);
					match(DDL);
					setState(2715);
					match(EVENT);
					setState(2716);
					match(NOTIFICATION);
					}
					break;
				case 3:
					{
					setState(2717);
					match(SCHEMA);
					}
					break;
				case 4:
					{
					setState(2718);
					match(TABLE);
					}
					break;
				case 5:
					{
					setState(2719);
					match(VIEW);
					}
					break;
				case 6:
					{
					setState(2720);
					match(SERVICE);
					}
					break;
				case 7:
					{
					setState(2721);
					match(TYPE);
					}
					break;
				case 8:
					{
					setState(2722);
					match(DEFAULT);
					}
					break;
				case 9:
					{
					setState(2723);
					match(AGGREGATE);
					}
					break;
				case 10:
					{
					setState(2724);
					match(ASSEMBLY);
					}
					break;
				case 11:
					{
					setState(2725);
					_la = _input.LA(1);
					if ( !(_la==SYMMETRIC || _la==ASYMMETRIC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2726);
					match(KEY);
					}
					break;
				case 12:
					{
					setState(2727);
					match(CERTIFICATE);
					}
					break;
				case 13:
					{
					setState(2728);
					match(CONTRACT);
					}
					break;
				case 14:
					{
					setState(2729);
					match(FULLTEXT);
					setState(2730);
					match(CATALOG);
					}
					break;
				case 15:
					{
					setState(2731);
					match(FUNCTION);
					}
					break;
				case 16:
					{
					setState(2732);
					match(MESSAGE);
					setState(2733);
					match(TYPE);
					}
					break;
				case 17:
					{
					setState(2734);
					match(PROCEDURE);
					}
					break;
				case 18:
					{
					setState(2735);
					match(QUEUE);
					}
					break;
				case 19:
					{
					setState(2736);
					match(REMOTE);
					setState(2737);
					match(SERVICE);
					setState(2738);
					match(BINDING);
					}
					break;
				case 20:
					{
					setState(2739);
					match(ROLE);
					}
					break;
				case 21:
					{
					setState(2740);
					match(ROUTE);
					}
					break;
				case 22:
					{
					setState(2741);
					match(RULE);
					}
					break;
				case 23:
					{
					setState(2742);
					match(SYNONYM);
					}
					break;
				case 24:
					{
					setState(2743);
					match(XML);
					setState(2744);
					match(SCHEMA);
					setState(2745);
					match(COLLECTION);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2748);
				match(CREATE);
				setState(2749);
				match(ANY);
				setState(2753);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATABASE:
					{
					setState(2750);
					match(DATABASE);
					}
					break;
				case EXTERNAL:
					{
					setState(2751);
					match(EXTERNAL);
					setState(2752);
					match(LIBRARY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2755);
				match(VIEW);
				setState(2761);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATABASE:
				case SERVER:
					{
					setState(2756);
					_la = _input.LA(1);
					if ( !(_la==DATABASE || _la==SERVER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2757);
					match(STATE);
					}
					break;
				case DDL:
					{
					setState(2758);
					match(DDL);
					setState(2759);
					match(EVENT);
					setState(2760);
					match(NOTIFICATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2763);
				match(VIEW);
				setState(2764);
				match(ANY);
				setState(2770);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLUMN:
					{
					setState(2765);
					match(COLUMN);
					setState(2766);
					_la = _input.LA(1);
					if ( !(_la==ENCRYPTION || _la==MASTER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2767);
					match(KEY);
					setState(2768);
					match(DEFINITION);
					}
					break;
				case DEFINITION:
					{
					setState(2769);
					match(DEFINITION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2772);
				match(EXECUTE);
				setState(2773);
				match(ANY);
				setState(2774);
				match(EXTERNAL);
				setState(2775);
				match(SCRIPT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2776);
				match(CONNECT);
				setState(2778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REPLICATION) {
					{
					setState(2777);
					match(REPLICATION);
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2780);
				match(KILL);
				setState(2781);
				match(DATABASE);
				setState(2782);
				match(CONNECTION);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2783);
				match(BACKUP);
				setState(2784);
				_la = _input.LA(1);
				if ( !(_la==DATABASE || _la==LOG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2785);
				match(AUTHENTICATE);
				setState(2787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SERVER) {
					{
					setState(2786);
					match(SERVER);
					}
				}

				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2789);
				match(SHOWPLAN);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2790);
				match(SUBSCRIBE);
				setState(2791);
				match(QUERY);
				setState(2792);
				match(NOTIFICATIONS);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2793);
				match(UNMASK);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2794);
				match(CHECKPOINT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2795);
				match(ADMINISTER);
				setState(2796);
				match(DATABASE);
				setState(2797);
				match(BULK);
				setState(2798);
				match(OPERATIONS);
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

	public static class DatabasePrincipalPermission_Context extends ParserRuleContext {
		public TerminalNode IMPERSONATE() { return getToken(SQLServerStatementParser.IMPERSONATE, 0); }
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode APPLICATION() { return getToken(SQLServerStatementParser.APPLICATION, 0); }
		public DatabasePrincipalPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databasePrincipalPermission_; }
	}

	public final DatabasePrincipalPermission_Context databasePrincipalPermission_() throws RecognitionException {
		DatabasePrincipalPermission_Context _localctx = new DatabasePrincipalPermission_Context(_ctx, getState());
		enterRule(_localctx, 456, RULE_databasePrincipalPermission_);
		int _la;
		try {
			setState(2811);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPERSONATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2801);
				match(IMPERSONATE);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2802);
				match(ALTER);
				setState(2803);
				match(ANY);
				setState(2809);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USER:
					{
					setState(2804);
					match(USER);
					}
					break;
				case ROLE:
				case APPLICATION:
					{
					setState(2806);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==APPLICATION) {
						{
						setState(2805);
						match(APPLICATION);
						}
					}

					setState(2808);
					match(ROLE);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class SchemaPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLServerStatementParser.SCHEMA, 0); }
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode SEQUENCE() { return getToken(SQLServerStatementParser.SEQUENCE, 0); }
		public TerminalNode VIEW() { return getToken(SQLServerStatementParser.VIEW, 0); }
		public TerminalNode CHANGE() { return getToken(SQLServerStatementParser.CHANGE, 0); }
		public TerminalNode TRACKING() { return getToken(SQLServerStatementParser.TRACKING, 0); }
		public SchemaPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaPermission_; }
	}

	public final SchemaPermission_Context schemaPermission_() throws RecognitionException {
		SchemaPermission_Context _localctx = new SchemaPermission_Context(_ctx, getState());
		enterRule(_localctx, 458, RULE_schemaPermission_);
		try {
			setState(2821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2813);
				match(ALTER);
				setState(2814);
				match(ANY);
				setState(2815);
				match(SCHEMA);
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2816);
				match(CREATE);
				setState(2817);
				match(SEQUENCE);
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(2818);
				match(VIEW);
				setState(2819);
				match(CHANGE);
				setState(2820);
				match(TRACKING);
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

	public static class ServiceBrokerPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode CONTRACT() { return getToken(SQLServerStatementParser.CONTRACT, 0); }
		public TerminalNode MESSAGE() { return getToken(SQLServerStatementParser.MESSAGE, 0); }
		public TerminalNode TYPE() { return getToken(SQLServerStatementParser.TYPE, 0); }
		public TerminalNode REMOTE() { return getToken(SQLServerStatementParser.REMOTE, 0); }
		public TerminalNode SERVICE() { return getToken(SQLServerStatementParser.SERVICE, 0); }
		public TerminalNode BINDING() { return getToken(SQLServerStatementParser.BINDING, 0); }
		public TerminalNode ROUTE() { return getToken(SQLServerStatementParser.ROUTE, 0); }
		public ServiceBrokerPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceBrokerPermission_; }
	}

	public final ServiceBrokerPermission_Context serviceBrokerPermission_() throws RecognitionException {
		ServiceBrokerPermission_Context _localctx = new ServiceBrokerPermission_Context(_ctx, getState());
		enterRule(_localctx, 460, RULE_serviceBrokerPermission_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2823);
			match(ALTER);
			setState(2824);
			match(ANY);
			setState(2833);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTRACT:
				{
				setState(2825);
				match(CONTRACT);
				}
				break;
			case MESSAGE:
				{
				setState(2826);
				match(MESSAGE);
				setState(2827);
				match(TYPE);
				}
				break;
			case REMOTE:
				{
				setState(2828);
				match(REMOTE);
				setState(2829);
				match(SERVICE);
				setState(2830);
				match(BINDING);
				}
				break;
			case ROUTE:
				{
				setState(2831);
				match(ROUTE);
				}
				break;
			case SERVICE:
				{
				setState(2832);
				match(SERVICE);
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

	public static class EndpointPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode ENDPOINT() { return getToken(SQLServerStatementParser.ENDPOINT, 0); }
		public EndpointPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endpointPermission_; }
	}

	public final EndpointPermission_Context endpointPermission_() throws RecognitionException {
		EndpointPermission_Context _localctx = new EndpointPermission_Context(_ctx, getState());
		enterRule(_localctx, 462, RULE_endpointPermission_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2835);
			match(ALTER);
			setState(2836);
			match(ANY);
			setState(2837);
			match(ENDPOINT);
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

	public static class CertificatePermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode CERTIFICATE() { return getToken(SQLServerStatementParser.CERTIFICATE, 0); }
		public CertificatePermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_certificatePermission_; }
	}

	public final CertificatePermission_Context certificatePermission_() throws RecognitionException {
		CertificatePermission_Context _localctx = new CertificatePermission_Context(_ctx, getState());
		enterRule(_localctx, 464, RULE_certificatePermission_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2839);
			match(ALTER);
			setState(2840);
			match(ANY);
			setState(2841);
			match(CERTIFICATE);
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

	public static class SymmetricKeyPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode SYMMETRIC() { return getToken(SQLServerStatementParser.SYMMETRIC, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public SymmetricKeyPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symmetricKeyPermission_; }
	}

	public final SymmetricKeyPermission_Context symmetricKeyPermission_() throws RecognitionException {
		SymmetricKeyPermission_Context _localctx = new SymmetricKeyPermission_Context(_ctx, getState());
		enterRule(_localctx, 466, RULE_symmetricKeyPermission_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2843);
			match(ALTER);
			setState(2844);
			match(ANY);
			setState(2845);
			match(SYMMETRIC);
			setState(2846);
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

	public static class AsymmetricKeyPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode ASYMMETRIC() { return getToken(SQLServerStatementParser.ASYMMETRIC, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public AsymmetricKeyPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asymmetricKeyPermission_; }
	}

	public final AsymmetricKeyPermission_Context asymmetricKeyPermission_() throws RecognitionException {
		AsymmetricKeyPermission_Context _localctx = new AsymmetricKeyPermission_Context(_ctx, getState());
		enterRule(_localctx, 468, RULE_asymmetricKeyPermission_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2848);
			match(ALTER);
			setState(2849);
			match(ANY);
			setState(2850);
			match(ASYMMETRIC);
			setState(2851);
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

	public static class AssemblyPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode ASSEMBLY() { return getToken(SQLServerStatementParser.ASSEMBLY, 0); }
		public AssemblyPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyPermission_; }
	}

	public final AssemblyPermission_Context assemblyPermission_() throws RecognitionException {
		AssemblyPermission_Context _localctx = new AssemblyPermission_Context(_ctx, getState());
		enterRule(_localctx, 470, RULE_assemblyPermission_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2853);
			match(ALTER);
			setState(2854);
			match(ANY);
			setState(2855);
			match(ASSEMBLY);
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

	public static class AvailabilityGroupPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode AVAILABILITY() { return getToken(SQLServerStatementParser.AVAILABILITY, 0); }
		public TerminalNode GROUP() { return getToken(SQLServerStatementParser.GROUP, 0); }
		public TerminalNode CONNECT() { return getToken(SQLServerStatementParser.CONNECT, 0); }
		public AvailabilityGroupPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availabilityGroupPermission_; }
	}

	public final AvailabilityGroupPermission_Context availabilityGroupPermission_() throws RecognitionException {
		AvailabilityGroupPermission_Context _localctx = new AvailabilityGroupPermission_Context(_ctx, getState());
		enterRule(_localctx, 472, RULE_availabilityGroupPermission_);
		try {
			setState(2862);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2857);
				match(ALTER);
				setState(2858);
				match(ANY);
				setState(2859);
				match(AVAILABILITY);
				setState(2860);
				match(GROUP);
				}
				break;
			case CONNECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2861);
				match(CONNECT);
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

	public static class FullTextPermission_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode FULLTEXT() { return getToken(SQLServerStatementParser.FULLTEXT, 0); }
		public TerminalNode CATALOG() { return getToken(SQLServerStatementParser.CATALOG, 0); }
		public FullTextPermission_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullTextPermission_; }
	}

	public final FullTextPermission_Context fullTextPermission_() throws RecognitionException {
		FullTextPermission_Context _localctx = new FullTextPermission_Context(_ctx, getState());
		enterRule(_localctx, 474, RULE_fullTextPermission_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2864);
			match(ALTER);
			setState(2865);
			match(ANY);
			setState(2866);
			match(FULLTEXT);
			setState(2867);
			match(CATALOG);
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

	public static class Class_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public List<TerminalNode> COLON_() { return getTokens(SQLServerStatementParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(SQLServerStatementParser.COLON_, i);
		}
		public Class_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_; }
	}

	public final Class_Context class_() throws RecognitionException {
		Class_Context _localctx = new Class_Context(_ctx, getState());
		enterRule(_localctx, 476, RULE_class_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2869);
			match(IDENTIFIER_);
			setState(2870);
			match(COLON_);
			setState(2871);
			match(COLON_);
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

	public static class ClassType_Context extends ParserRuleContext {
		public List<TerminalNode> COLON_() { return getTokens(SQLServerStatementParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(SQLServerStatementParser.COLON_, i);
		}
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode DATABASE() { return getToken(SQLServerStatementParser.DATABASE, 0); }
		public TerminalNode OBJECT() { return getToken(SQLServerStatementParser.OBJECT, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLServerStatementParser.SCHEMA, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public ClassType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_; }
	}

	public final ClassType_Context classType_() throws RecognitionException {
		ClassType_Context _localctx = new ClassType_Context(_ctx, getState());
		enterRule(_localctx, 478, RULE_classType_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2873);
			_la = _input.LA(1);
			if ( !(_la==SCHEMA || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (USER - 187)) | (1L << (ROLE - 187)) | (1L << (DATABASE - 187)) | (1L << (LOGIN - 187)) | (1L << (OBJECT - 187)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2874);
			match(COLON_);
			setState(2875);
			match(COLON_);
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
		enterRule(_localctx, 480, RULE_roleClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2877);
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

	public static class CreateUserContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2879);
			match(CREATE);
			setState(2880);
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
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2882);
			match(DROP);
			setState(2883);
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
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2885);
			match(ALTER);
			setState(2886);
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
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2888);
			match(CREATE);
			setState(2889);
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
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2891);
			match(DROP);
			setState(2892);
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
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_alterRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2894);
			match(ALTER);
			setState(2895);
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

	public static class CreateLoginContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public CreateLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createLogin; }
	}

	public final CreateLoginContext createLogin() throws RecognitionException {
		CreateLoginContext _localctx = new CreateLoginContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_createLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2897);
			match(CREATE);
			setState(2898);
			match(LOGIN);
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

	public static class DropLoginContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public DropLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropLogin; }
	}

	public final DropLoginContext dropLogin() throws RecognitionException {
		DropLoginContext _localctx = new DropLoginContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_dropLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2900);
			match(DROP);
			setState(2901);
			match(LOGIN);
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

	public static class AlterLoginContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public AlterLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterLogin; }
	}

	public final AlterLoginContext alterLogin() throws RecognitionException {
		AlterLoginContext _localctx = new AlterLoginContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_alterLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2903);
			match(ALTER);
			setState(2904);
			match(LOGIN);
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
		public TerminalNode CALL() { return getToken(SQLServerStatementParser.CALL, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2906);
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
		case 55:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 58:
			return booleanPrimary__sempred((BooleanPrimary_Context)_localctx, predIndex);
		case 61:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 62:
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
			return precpred(_ctx, 7);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u017c\u0b5f\4\2\t"+
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
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2\u0217\n\2\3\2\5\2\u021a\n\2\3\3\3\3\3\3\3\3\5"+
		"\3\u0220\n\3\3\3\5\3\u0223\n\3\3\3\3\3\5\3\u0227\n\3\3\4\5\4\u022a\n\4"+
		"\3\4\3\4\3\4\3\4\7\4\u0230\n\4\f\4\16\4\u0233\13\4\3\5\5\5\u0236\n\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\5\6\u023e\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7"+
		"\b\u0248\n\b\f\b\16\b\u024b\13\b\3\t\3\t\3\t\3\t\7\t\u0251\n\t\f\t\16"+
		"\t\u0254\13\t\3\t\3\t\3\t\3\t\5\t\u025a\n\t\3\n\3\n\5\n\u025e\n\n\3\13"+
		"\3\13\3\13\5\13\u0263\n\13\3\13\5\13\u0266\n\13\3\f\5\f\u0269\n\f\3\f"+
		"\5\f\u026c\n\f\3\f\3\f\5\f\u0270\n\f\3\f\5\f\u0273\n\f\3\f\5\f\u0276\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0281\n\r\3\16\3\16\5\16\u0285"+
		"\n\16\3\16\3\16\3\16\5\16\u028a\n\16\7\16\u028c\n\16\f\16\16\16\u028f"+
		"\13\16\3\17\3\17\3\20\3\20\3\20\5\20\u0296\n\20\3\20\7\20\u0299\n\20\f"+
		"\20\16\20\u029c\13\20\3\21\3\21\5\21\u02a0\n\21\3\21\3\21\5\21\u02a4\n"+
		"\21\3\21\5\21\u02a7\n\21\3\21\5\21\u02aa\n\21\3\21\5\21\u02ad\n\21\3\21"+
		"\5\21\u02b0\n\21\3\22\3\22\3\23\3\23\5\23\u02b6\n\23\3\23\3\23\7\23\u02ba"+
		"\n\23\f\23\16\23\u02bd\13\23\3\24\3\24\3\24\5\24\u02c2\n\24\3\24\5\24"+
		"\u02c5\n\24\3\24\5\24\u02c8\n\24\3\24\5\24\u02cb\n\24\3\25\3\25\5\25\u02cf"+
		"\n\25\3\25\3\25\5\25\u02d3\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\5\26\u02df\n\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\7\32\u02ec\n\32\f\32\16\32\u02ef\13\32\3\33\3\33\3\33\6\33"+
		"\u02f4\n\33\r\33\16\33\u02f5\3\33\3\33\7\33\u02fa\n\33\f\33\16\33\u02fd"+
		"\13\33\5\33\u02ff\n\33\3\34\3\34\5\34\u0303\n\34\3\34\5\34\u0306\n\34"+
		"\3\34\3\34\5\34\u030a\n\34\3\34\3\34\3\34\3\34\5\34\u0310\n\34\3\35\5"+
		"\35\u0313\n\35\3\35\5\35\u0316\n\35\3\35\3\35\3\35\3\35\5\35\u031c\n\35"+
		"\3\35\5\35\u031f\n\35\3\35\3\35\5\35\u0323\n\35\3\35\3\35\3\35\5\35\u0328"+
		"\n\35\5\35\u032a\n\35\3\36\3\36\3\36\3\36\5\36\u0330\n\36\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \7 \u033a\n \f \16 \u033d\13 \3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\5\"\u0346\n\"\3\"\5\"\u0349\n\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\5$\u0354"+
		"\n$\3%\3%\3&\5&\u0359\n&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0364\n"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\5,\u0370\n,\3-\3-\3.\3.\3/\3/\3/\5/\u0379"+
		"\n/\3/\3/\3\60\3\60\3\60\5\60\u0380\n\60\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\7\63\u038c\n\63\f\63\16\63\u038f\13\63\3\63\3\63"+
		"\3\64\5\64\u0394\n\64\3\64\3\64\3\64\7\64\u0399\n\64\f\64\16\64\u039c"+
		"\13\64\3\64\5\64\u039f\n\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\5"+
		"\67\u03a9\n\67\5\67\u03ab\n\67\3\67\3\67\38\58\u03b0\n8\38\38\39\39\3"+
		"9\39\39\39\39\39\39\59\u03bd\n9\39\39\39\39\79\u03c3\n9\f9\169\u03c6\13"+
		"9\3:\3:\3;\3;\3<\3<\3<\3<\3<\3<\5<\u03d2\n<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\7<\u03e1\n<\f<\16<\u03e4\13<\3=\3=\3>\3>\5>\u03ea\n>\3>"+
		"\3>\3>\3>\3>\5>\u03f1\n>\3>\3>\3>\3>\3>\7>\u03f8\n>\f>\16>\u03fb\13>\3"+
		">\3>\3>\3>\5>\u0401\n>\3>\3>\3>\3>\3>\3>\3>\5>\u040a\n>\3>\3>\3>\3>\5"+
		">\u0410\n>\3>\5>\u0413\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\7?\u0436\n?\f"+
		"?\16?\u0439\13?\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0443\n@\3@\3@\3@\3@\7@\u0449"+
		"\n@\f@\16@\u044c\13@\3@\3@\3@\5@\u0451\n@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u045b"+
		"\n@\3@\3@\3@\7@\u0460\n@\f@\16@\u0463\13@\3A\3A\3A\5A\u0468\nA\3B\3B\3"+
		"B\5B\u046d\nB\3B\3B\3B\7B\u0472\nB\fB\16B\u0475\13B\3B\5B\u0478\nB\3B"+
		"\3B\3C\3C\3D\3D\3E\3E\5E\u0482\nE\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G"+
		"\7G\u0490\nG\fG\16G\u0493\13G\3G\3G\5G\u0497\nG\3G\3G\3H\3H\3H\3H\3H\7"+
		"H\u04a0\nH\fH\16H\u04a3\13H\3H\5H\u04a6\nH\3H\3H\3I\3I\3I\3I\3I\5I\u04af"+
		"\nI\3J\3J\5J\u04b3\nJ\3J\6J\u04b6\nJ\rJ\16J\u04b7\3J\5J\u04bb\nJ\3K\3"+
		"K\3K\3K\3K\3L\3L\3L\3M\3M\3M\3M\5M\u04c9\nM\3N\3N\3N\3N\3N\7N\u04d0\n"+
		"N\fN\16N\u04d3\13N\3O\3O\3O\5O\u04d8\nO\3O\5O\u04db\nO\3P\3P\3P\3P\3P"+
		"\3P\3P\5P\u04e4\nP\3P\3P\3P\5P\u04e9\nP\3Q\3Q\3R\3R\3R\3R\5R\u04f1\nR"+
		"\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\5S\u04fd\nS\3S\3S\3T\3T\3T\3T\3T\5T\u0506"+
		"\nT\3T\3T\3T\3T\5T\u050c\nT\3U\3U\3U\3V\3V\3V\5V\u0514\nV\3V\5V\u0517"+
		"\nV\3V\5V\u051a\nV\3V\3V\3W\3W\3W\3W\3W\7W\u0523\nW\fW\16W\u0526\13W\3"+
		"X\3X\3X\3Y\3Y\5Y\u052d\nY\3Z\3Z\3Z\3Z\3Z\3[\3[\5[\u0536\n[\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\5\\\u053e\n\\\3]\3]\3]\3]\3]\3]\5]\u0546\n]\3^\3^\5^\u054a"+
		"\n^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0557\n_\5_\u0559\n_\3`\3`\3`"+
		"\3`\3a\3a\3a\5a\u0562\na\3b\3b\3b\3c\3c\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f"+
		"\3f\3f\7f\u0575\nf\ff\16f\u0578\13f\3g\3g\5g\u057c\ng\3h\3h\3h\3h\3i\3"+
		"i\3i\3i\3i\3i\5i\u0588\ni\3i\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\5j\u0595\n"+
		"j\3k\3k\3l\3l\3l\7l\u059c\nl\fl\16l\u059f\13l\3m\3m\3n\3n\3n\3n\3n\3n"+
		"\3o\3o\3o\3o\3o\3o\3o\3o\3p\3p\3p\3p\3p\3q\3q\3q\3q\5q\u05ba\nq\3q\3q"+
		"\3q\3r\3r\3r\5r\u05c2\nr\3r\3r\3s\3s\3s\5s\u05c9\ns\3s\3s\3s\3s\3t\3t"+
		"\3t\3t\3u\3u\5u\u05d5\nu\3v\3v\3v\3v\3w\3w\3w\3w\7w\u05df\nw\fw\16w\u05e2"+
		"\13w\3w\3w\5w\u05e6\nw\3w\3w\3x\3x\3x\3x\3x\5x\u05ef\nx\3y\3y\3y\7y\u05f4"+
		"\ny\fy\16y\u05f7\13y\3y\3y\5y\u05fb\ny\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3"+
		"z\3z\3z\5z\u060a\nz\3z\3z\3z\3z\3z\3z\3z\3z\5z\u0614\nz\3z\3z\3z\3z\3"+
		"z\3z\3z\3z\3z\5z\u061f\nz\3z\5z\u0622\nz\3z\3z\3z\3z\3z\3z\3z\3z\7z\u062c"+
		"\nz\fz\16z\u062f\13z\3z\5z\u0632\nz\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3"+
		"{\3{\3{\3|\3|\5|\u0644\n|\3|\3|\3|\5|\u0649\n|\3}\3}\5}\u064d\n}\3}\3"+
		"}\5}\u0651\n}\3~\5~\u0654\n~\3~\5~\u0657\n~\3~\5~\u065a\n~\3\177\3\177"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080"+
		"\u0666\n\u0080\f\u0080\16\u0080\u0669\13\u0080\3\u0080\3\u0080\5\u0080"+
		"\u066d\n\u0080\3\u0081\3\u0081\3\u0081\5\u0081\u0672\n\u0081\3\u0082\3"+
		"\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0084"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\5\u0085\u0682\n\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\5\u0087\u068d"+
		"\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087\u0695"+
		"\n\u0087\f\u0087\16\u0087\u0698\13\u0087\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\5\u0088\u06a0\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\5\u0089\u06a7\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u06ad\n\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b"+
		"\5\u008b\u06b6\n\u008b\3\u008b\5\u008b\u06b9\n\u008b\3\u008b\5\u008b\u06bc"+
		"\n\u008b\3\u008b\5\u008b\u06bf\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\7\u008c\u06c6\n\u008c\f\u008c\16\u008c\u06c9\13\u008c\3\u008c"+
		"\3\u008c\3\u008d\3\u008d\3\u008d\5\u008d\u06d0\n\u008d\3\u008e\3\u008e"+
		"\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u06d9\n\u008f\3\u0090"+
		"\3\u0090\3\u0090\7\u0090\u06de\n\u0090\f\u0090\16\u0090\u06e1\13\u0090"+
		"\5\u0090\u06e3\n\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\5\u0091\u06eb\n\u0091\5\u0091\u06ed\n\u0091\3\u0091\5\u0091\u06f0\n\u0091"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\5\u0093"+
		"\u06fa\n\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u06ff\n\u0093\3\u0094\3"+
		"\u0094\3\u0094\5\u0094\u0704\n\u0094\3\u0095\3\u0095\5\u0095\u0708\n\u0095"+
		"\3\u0096\5\u0096\u070b\n\u0096\3\u0096\3\u0096\5\u0096\u070f\n\u0096\3"+
		"\u0096\5\u0096\u0712\n\u0096\3\u0097\3\u0097\3\u0097\5\u0097\u0717\n\u0097"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\5\u0099\u071f\n\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\7\u0099\u0726\n\u0099\f\u0099"+
		"\16\u0099\u0729\13\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a"+
		"\u0730\n\u009a\3\u009a\5\u009a\u0733\n\u009a\3\u009a\5\u009a\u0736\n\u009a"+
		"\3\u009b\5\u009b\u0739\n\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b"+
		"\u073f\n\u009b\3\u009b\3\u009b\5\u009b\u0743\n\u009b\3\u009c\3\u009c\3"+
		"\u009c\3\u009c\7\u009c\u0749\n\u009c\f\u009c\16\u009c\u074c\13\u009c\3"+
		"\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\5\u009e\u0761\n\u009e\5\u009e\u0763\n\u009e\3\u009f\3\u009f\3"+
		"\u009f\5\u009f\u0768\n\u009f\5\u009f\u076a\n\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\5\u009f\u0771\n\u009f\5\u009f\u0773\n\u009f\3\u009f\3"+
		"\u009f\5\u009f\u0777\n\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u077d"+
		"\n\u00a0\f\u00a0\16\u00a0\u0780\13\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u078d"+
		"\n\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1"+
		"\u0796\n\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u07a5\n\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u07ab\n\u00a1\3\u00a1\3\u00a1"+
		"\5\u00a1\u07af\n\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u07b4\n\u00a1\3"+
		"\u00a2\3\u00a2\3\u00a2\3\u00a2\7\u00a2\u07ba\n\u00a2\f\u00a2\16\u00a2"+
		"\u07bd\13\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3"+
		"\u07c5\n\u00a3\3\u00a3\5\u00a3\u07c8\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3"+
		"\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5"+
		"\u07de\n\u00a5\5\u00a5\u07e0\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u07eb\n\u00a6\3\u00a7\3"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u07f2\n\u00a7\3\u00a8\3\u00a8\3"+
		"\u00a8\3\u00a8\3\u00a8\5\u00a8\u07f9\n\u00a8\3\u00a8\3\u00a8\3\u00a8\3"+
		"\u00a8\3\u00a8\3\u00a8\7\u00a8\u0801\n\u00a8\f\u00a8\16\u00a8\u0804\13"+
		"\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\5\u00a9\u080a\n\u00a9\3\u00a9\5"+
		"\u00a9\u080d\n\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3"+
		"\u00aa\3\u00aa\3\u00aa\5\u00aa\u0818\n\u00aa\3\u00ab\3\u00ab\3\u00ab\3"+
		"\u00ab\5\u00ab\u081e\n\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0823\n\u00ab"+
		"\3\u00ab\5\u00ab\u0826\n\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad"+
		"\3\u00ad\5\u00ad\u082e\n\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0833\n"+
		"\u00ad\3\u00ae\3\u00ae\3\u00ae\7\u00ae\u0838\n\u00ae\f\u00ae\16\u00ae"+
		"\u083b\13\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af"+
		"\u0843\n\u00af\3\u00b0\3\u00b0\5\u00b0\u0847\n\u00b0\3\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u0852\n"+
		"\u00b1\f\u00b1\16\u00b1\u0855\13\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0861\n\u00b2"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0868\n\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\5\u00b4\u0874\n\u00b4\3\u00b4\5\u00b4\u0877\n\u00b4\3\u00b4\3\u00b4\5"+
		"\u00b4\u087b\n\u00b4\3\u00b4\3\u00b4\5\u00b4\u087f\n\u00b4\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0888\n\u00b5\3\u00b6"+
		"\5\u00b6\u088b\n\u00b6\3\u00b6\5\u00b6\u088e\n\u00b6\3\u00b6\3\u00b6\3"+
		"\u00b6\7\u00b6\u0893\n\u00b6\f\u00b6\16\u00b6\u0896\13\u00b6\3\u00b7\3"+
		"\u00b7\5\u00b7\u089a\n\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\7"+
		"\u00b8\u08a1\n\u00b8\f\u00b8\16\u00b8\u08a4\13\u00b8\3\u00b8\3\u00b8\3"+
		"\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u08b7\n\u00b9"+
		"\5\u00b9\u08b9\n\u00b9\3\u00ba\3\u00ba\3\u00bb\3\u00bb\5\u00bb\u08bf\n"+
		"\u00bb\3\u00bb\3\u00bb\3\u00bb\7\u00bb\u08c4\n\u00bb\f\u00bb\16\u00bb"+
		"\u08c7\13\u00bb\3\u00bc\3\u00bc\5\u00bc\u08cb\n\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\7\u00bc\u08d0\n\u00bc\f\u00bc\16\u00bc\u08d3\13\u00bc\3\u00bd"+
		"\5\u00bd\u08d6\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u08dc\n"+
		"\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u08e2\n\u00be\3\u00bf\3"+
		"\u00bf\3\u00bf\5\u00bf\u08e7\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5"+
		"\u00bf\u08ed\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u08f4"+
		"\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u08fa\n\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0903\n\u00c1"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u090a\n\u00c2\5\u00c2"+
		"\u090c\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0912\n\u00c3\3"+
		"\u00c3\5\u00c3\u0915\n\u00c3\3\u00c3\5\u00c3\u0918\n\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c4\5\u00c4\u091d\n\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c5"+
		"\5\u00c5\u0924\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c6\3\u00c6"+
		"\3\u00c6\5\u00c6\u092d\n\u00c6\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0932\n"+
		"\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9"+
		"\u093b\n\u00c9\5\u00c9\u093d\n\u00c9\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0942"+
		"\n\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb"+
		"\u094b\n\u00cb\5\u00cb\u094d\n\u00cb\3\u00cb\5\u00cb\u0950\n\u00cb\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0962\n\u00cc"+
		"\5\u00cc\u0964\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\5\u00cd\u096e\n\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0980\n\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d4"+
		"\3\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6"+
		"\u0996\n\u00d6\3\u00d7\3\u00d7\5\u00d7\u099a\n\u00d7\3\u00d7\3\u00d7\3"+
		"\u00d7\5\u00d7\u099f\n\u00d7\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u09a4\n\u00d8"+
		"\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u09a9\n\u00d9\3\u00da\3\u00da\3\u00da"+
		"\5\u00da\u09ae\n\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc"+
		"\5\u00dc\u09b6\n\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u09bb\n\u00dc\7"+
		"\u00dc\u09bd\n\u00dc\f\u00dc\16\u00dc\u09c0\13\u00dc\3\u00dd\5\u00dd\u09c3"+
		"\n\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de\3\u00de\7\u00de\u09ca\n\u00de"+
		"\f\u00de\16\u00de\u09cd\13\u00de\3\u00df\5\u00df\u09d0\n\u00df\3\u00df"+
		"\3\u00df\3\u00e0\3\u00e0\5\u00e0\u09d6\n\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u09e7\n\u00e0\3\u00e1\3\u00e1\5\u00e1"+
		"\u09eb\n\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u09f2\n"+
		"\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\5\u00e1\u09fc\n\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0a08\n\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3"+
		"\u0a1d\n\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0a2b\n\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0a4d\n\u00e3\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u0a55\n\u00e4\5\u00e4\u0a57\n"+
		"\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0a67\n\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0a6d\n\u00e5\3\u00e5\3\u00e5"+
		"\5\u00e5\u0a71\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0a7c\n\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5"+
		"\u0a89\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0a98\n\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5"+
		"\u0abd\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0ac4\n"+
		"\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0acc\n"+
		"\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5"+
		"\u0ad5\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5"+
		"\u0add\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\5\u00e5\u0ae6\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0af2\n\u00e5\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0af9\n\u00e6\3\u00e6\5\u00e6\u0afc\n"+
		"\u00e6\5\u00e6\u0afe\n\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3"+
		"\u00e7\3\u00e7\3\u00e7\5\u00e7\u0b08\n\u00e7\3\u00e8\3\u00e8\3\u00e8\3"+
		"\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0b14\n"+
		"\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\5\u00ee\u0b31\n\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f2"+
		"\3\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f4\3\u00f4\3\u00f4\3\u00f5\3\u00f5"+
		"\3\u00f5\3\u00f6\3\u00f6\3\u00f6\3\u00f7\3\u00f7\3\u00f7\3\u00f8\3\u00f8"+
		"\3\u00f8\3\u00f9\3\u00f9\3\u00f9\3\u00fa\3\u00fa\3\u00fa\3\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fc\3\u00fc\3\u00fc\2\6pv|~\u00fd\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c"+
		"\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154"+
		"\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c"+
		"\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184"+
		"\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c"+
		"\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4"+
		"\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc"+
		"\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4"+
		"\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\2,\4\2NNpp\4\2"+
		"XX\\\\\4\2WWZ[\3\2\u0085\u0087\3\2kl\33\2\66\66FGyz~\177\u0083\u0083\u0088"+
		"\u0089\u008b\u008b\u008d\u008d\u0092\u0092\u009a\u009b\u009d\u009d\u009f"+
		"\u00a0\u00a2\u00a4\u00a7\u00a8\u00aa\u00aa\u00ac\u00b1\u00b4\u00b5\u00be"+
		"\u00bf\u00c2\u00c6\u00c8\u00c9\u00cb\u00d6\u00d8\u00dd\u00df\u00e7\u00e9"+
		"\u00fe\u0105\u0177\3\2\u0178\u0179\4\2\4\5fg\4\2\6\6ii\4\2jl\u00b3\u00b3"+
		"\3\2pq\3\2\30\35\5\2\6\7\17\20\u00aa\u00aa\3\2\u0093\u0097\3\2vw\4\2\u00c9"+
		"\u00c9\u00d4\u00d4\4\2\u00b2\u00b2\u00f3\u00f3\4\2\u0156\u0156\u0167\u0167"+
		"\7\2\u00b1\u00b1\u00c8\u00c8\u00e8\u00e8\u00ed\u00ed\u0153\u0153\n\2\u00eb"+
		"\u00eb\u00f7\u00f7\u014f\u0150\u0156\u0156\u015f\u0160\u0164\u0165\u016a"+
		"\u016a\u0176\u0176\4\2``\u00ea\u00ea\5\2\u00c4\u00c4\u00e8\u00e8\u00fa"+
		"\u00fa\4\2\u00bf\u00bf\u00d7\u00d7\4\2\u00d2\u00d2\u00f2\u00f2\3\2\u00c5"+
		"\u00c6\3\2\61\62\4\2jj\u0098\u0098\5\2\u00b1\u00b1\u00e8\u00e8\u00ed\u00ed"+
		"\4\2\u00df\u00e0\u00ee\u00ee\3\2\u0162\u0163\3\2Z[\4\2\u00b7\u00b7\u00e7"+
		"\u00e7\3\2\u009a\u009b\5\2\u008a\u008a\u008c\u008e\u00cc\u00cf\5\2<<\u009b"+
		"\u009b\u00c3\u00c3\4\2\u00c0\u00c0\u00fd\u00fd\4\2\u00cb\u00cb\u0108\u0108"+
		"\3\2\u010b\u010c\4\2\u00cb\u00cb\u010d\u010d\3\2\u012e\u012f\4\2\u00cb"+
		"\u00cb\u0147\u0147\7\2\67\67\u00bd\u00be\u00cb\u00cb\u00e3\u00e3\u00e9"+
		"\u00e9\2\u0c8f\2\u0216\3\2\2\2\4\u021b\3\2\2\2\6\u0229\3\2\2\2\b\u0235"+
		"\3\2\2\2\n\u0239\3\2\2\2\f\u023f\3\2\2\2\16\u0243\3\2\2\2\20\u0259\3\2"+
		"\2\2\22\u025d\3\2\2\2\24\u025f\3\2\2\2\26\u0268\3\2\2\2\30\u0280\3\2\2"+
		"\2\32\u0282\3\2\2\2\34\u0290\3\2\2\2\36\u0292\3\2\2\2 \u029d\3\2\2\2\""+
		"\u02b1\3\2\2\2$\u02b5\3\2\2\2&\u02ca\3\2\2\2(\u02cc\3\2\2\2*\u02de\3\2"+
		"\2\2,\u02e0\3\2\2\2.\u02e2\3\2\2\2\60\u02e5\3\2\2\2\62\u02e8\3\2\2\2\64"+
		"\u02fe\3\2\2\2\66\u030f\3\2\2\28\u0329\3\2\2\2:\u032f\3\2\2\2<\u0331\3"+
		"\2\2\2>\u0334\3\2\2\2@\u033e\3\2\2\2B\u0341\3\2\2\2D\u034a\3\2\2\2F\u0353"+
		"\3\2\2\2H\u0355\3\2\2\2J\u0358\3\2\2\2L\u0363\3\2\2\2N\u0365\3\2\2\2P"+
		"\u0367\3\2\2\2R\u0369\3\2\2\2T\u036b\3\2\2\2V\u036f\3\2\2\2X\u0371\3\2"+
		"\2\2Z\u0373\3\2\2\2\\\u0378\3\2\2\2^\u037f\3\2\2\2`\u0383\3\2\2\2b\u0385"+
		"\3\2\2\2d\u0387\3\2\2\2f\u0393\3\2\2\2h\u03a0\3\2\2\2j\u03a2\3\2\2\2l"+
		"\u03a4\3\2\2\2n\u03af\3\2\2\2p\u03bc\3\2\2\2r\u03c7\3\2\2\2t\u03c9\3\2"+
		"\2\2v\u03cb\3\2\2\2x\u03e5\3\2\2\2z\u0412\3\2\2\2|\u0414\3\2\2\2~\u045a"+
		"\3\2\2\2\u0080\u0467\3\2\2\2\u0082\u0469\3\2\2\2\u0084\u047b\3\2\2\2\u0086"+
		"\u047d\3\2\2\2\u0088\u0481\3\2\2\2\u008a\u0483\3\2\2\2\u008c\u048a\3\2"+
		"\2\2\u008e\u049a\3\2\2\2\u0090\u04ae\3\2\2\2\u0092\u04b0\3\2\2\2\u0094"+
		"\u04bc\3\2\2\2\u0096\u04c1\3\2\2\2\u0098\u04c8\3\2\2\2\u009a\u04ca\3\2"+
		"\2\2\u009c\u04d7\3\2\2\2\u009e\u04dc\3\2\2\2\u00a0\u04ea\3\2\2\2\u00a2"+
		"\u04ec\3\2\2\2\u00a4\u04f4\3\2\2\2\u00a6\u0500\3\2\2\2\u00a8\u050d\3\2"+
		"\2\2\u00aa\u0510\3\2\2\2\u00ac\u051d\3\2\2\2\u00ae\u0527\3\2\2\2\u00b0"+
		"\u052c\3\2\2\2\u00b2\u052e\3\2\2\2\u00b4\u0535\3\2\2\2\u00b6\u053d\3\2"+
		"\2\2\u00b8\u0545\3\2\2\2\u00ba\u0547\3\2\2\2\u00bc\u0558\3\2\2\2\u00be"+
		"\u055a\3\2\2\2\u00c0\u055e\3\2\2\2\u00c2\u0563\3\2\2\2\u00c4\u0566\3\2"+
		"\2\2\u00c6\u0568\3\2\2\2\u00c8\u056b\3\2\2\2\u00ca\u0571\3\2\2\2\u00cc"+
		"\u057b\3\2\2\2\u00ce\u057d\3\2\2\2\u00d0\u0581\3\2\2\2\u00d2\u058f\3\2"+
		"\2\2\u00d4\u0596\3\2\2\2\u00d6\u0598\3\2\2\2\u00d8\u05a0\3\2\2\2\u00da"+
		"\u05a2\3\2\2\2\u00dc\u05a8\3\2\2\2\u00de\u05b0\3\2\2\2\u00e0\u05b5\3\2"+
		"\2\2\u00e2\u05be\3\2\2\2\u00e4\u05c5\3\2\2\2\u00e6\u05ce\3\2\2\2\u00e8"+
		"\u05d4\3\2\2\2\u00ea\u05d6\3\2\2\2\u00ec\u05da\3\2\2\2\u00ee\u05ee\3\2"+
		"\2\2\u00f0\u05f0\3\2\2\2\u00f2\u0631\3\2\2\2\u00f4\u0633\3\2\2\2\u00f6"+
		"\u0643\3\2\2\2\u00f8\u064c\3\2\2\2\u00fa\u0653\3\2\2\2\u00fc\u065b\3\2"+
		"\2\2\u00fe\u065d\3\2\2\2\u0100\u0671\3\2\2\2\u0102\u0673\3\2\2\2\u0104"+
		"\u0679\3\2\2\2\u0106\u067c\3\2\2\2\u0108\u067f\3\2\2\2\u010a\u0683\3\2"+
		"\2\2\u010c\u068c\3\2\2\2\u010e\u069f\3\2\2\2\u0110\u06a6\3\2\2\2\u0112"+
		"\u06a8\3\2\2\2\u0114\u06b2\3\2\2\2\u0116\u06c0\3\2\2\2\u0118\u06cf\3\2"+
		"\2\2\u011a\u06d1\3\2\2\2\u011c\u06d4\3\2\2\2\u011e\u06e2\3\2\2\2\u0120"+
		"\u06e4\3\2\2\2\u0122\u06f1\3\2\2\2\u0124\u06f9\3\2\2\2\u0126\u0700\3\2"+
		"\2\2\u0128\u0707\3\2\2\2\u012a\u070a\3\2\2\2\u012c\u0713\3\2\2\2\u012e"+
		"\u0718\3\2\2\2\u0130\u071e\3\2\2\2\u0132\u072a\3\2\2\2\u0134\u0742\3\2"+
		"\2\2\u0136\u0744\3\2\2\2\u0138\u074f\3\2\2\2\u013a\u0762\3\2\2\2\u013c"+
		"\u0769\3\2\2\2\u013e\u0778\3\2\2\2\u0140\u07b3\3\2\2\2\u0142\u07b5\3\2"+
		"\2\2\u0144\u07c7\3\2\2\2\u0146\u07cd\3\2\2\2\u0148\u07df\3\2\2\2\u014a"+
		"\u07e1\3\2\2\2\u014c\u07f1\3\2\2\2\u014e\u07f3\3\2\2\2\u0150\u0809\3\2"+
		"\2\2\u0152\u0817\3\2\2\2\u0154\u0819\3\2\2\2\u0156\u0827\3\2\2\2\u0158"+
		"\u082d\3\2\2\2\u015a\u0834\3\2\2\2\u015c\u0842\3\2\2\2\u015e\u0846\3\2"+
		"\2\2\u0160\u084d\3\2\2\2\u0162\u0860\3\2\2\2\u0164\u0862\3\2\2\2\u0166"+
		"\u086c\3\2\2\2\u0168\u0880\3\2\2\2\u016a\u088a\3\2\2\2\u016c\u0897\3\2"+
		"\2\2\u016e\u089b\3\2\2\2\u0170\u08b8\3\2\2\2\u0172\u08ba\3\2\2\2\u0174"+
		"\u08bc\3\2\2\2\u0176\u08c8\3\2\2\2\u0178\u08d5\3\2\2\2\u017a\u08dd\3\2"+
		"\2\2\u017c\u08e3\3\2\2\2\u017e\u08f5\3\2\2\2\u0180\u08fd\3\2\2\2\u0182"+
		"\u0904\3\2\2\2\u0184\u090d\3\2\2\2\u0186\u091c\3\2\2\2\u0188\u0923\3\2"+
		"\2\2\u018a\u092c\3\2\2\2\u018c\u092e\3\2\2\2\u018e\u0933\3\2\2\2\u0190"+
		"\u0936\3\2\2\2\u0192\u0941\3\2\2\2\u0194\u0943\3\2\2\2\u0196\u0963\3\2"+
		"\2\2\u0198\u0965\3\2\2\2\u019a\u0971\3\2\2\2\u019c\u0974\3\2\2\2\u019e"+
		"\u097f\3\2\2\2\u01a0\u0985\3\2\2\2\u01a2\u0987\3\2\2\2\u01a4\u098a\3\2"+
		"\2\2\u01a6\u098c\3\2\2\2\u01a8\u098e\3\2\2\2\u01aa\u0991\3\2\2\2\u01ac"+
		"\u0997\3\2\2\2\u01ae\u09a0\3\2\2\2\u01b0\u09a5\3\2\2\2\u01b2\u09aa\3\2"+
		"\2\2\u01b4\u09af\3\2\2\2\u01b6\u09b3\3\2\2\2\u01b8\u09c2\3\2\2\2\u01ba"+
		"\u09c6\3\2\2\2\u01bc\u09cf\3\2\2\2\u01be\u09e6\3\2\2\2\u01c0\u09fb\3\2"+
		"\2\2\u01c2\u09fd\3\2\2\2\u01c4\u0a4c\3\2\2\2\u01c6\u0a56\3\2\2\2\u01c8"+
		"\u0af1\3\2\2\2\u01ca\u0afd\3\2\2\2\u01cc\u0b07\3\2\2\2\u01ce\u0b09\3\2"+
		"\2\2\u01d0\u0b15\3\2\2\2\u01d2\u0b19\3\2\2\2\u01d4\u0b1d\3\2\2\2\u01d6"+
		"\u0b22\3\2\2\2\u01d8\u0b27\3\2\2\2\u01da\u0b30\3\2\2\2\u01dc\u0b32\3\2"+
		"\2\2\u01de\u0b37\3\2\2\2\u01e0\u0b3b\3\2\2\2\u01e2\u0b3f\3\2\2\2\u01e4"+
		"\u0b41\3\2\2\2\u01e6\u0b44\3\2\2\2\u01e8\u0b47\3\2\2\2\u01ea\u0b4a\3\2"+
		"\2\2\u01ec\u0b4d\3\2\2\2\u01ee\u0b50\3\2\2\2\u01f0\u0b53\3\2\2\2\u01f2"+
		"\u0b56\3\2\2\2\u01f4\u0b59\3\2\2\2\u01f6\u0b5c\3\2\2\2\u01f8\u0217\5\34"+
		"\17\2\u01f9\u0217\5\4\3\2\u01fa\u0217\5\n\6\2\u01fb\u0217\5\24\13\2\u01fc"+
		"\u0217\5\u00dco\2\u01fd\u0217\5\u00e0q\2\u01fe\u0217\5\u00e4s\2\u01ff"+
		"\u0217\5\u00dan\2\u0200\u0217\5\u00dep\2\u0201\u0217\5\u00e2r\2\u0202"+
		"\u0217\5\u00e6t\2\u0203\u0217\5\u019c\u00cf\2\u0204\u0217\5\u01a2\u00d2"+
		"\2\u0205\u0217\5\u019e\u00d0\2\u0206\u0217\5\u01a4\u00d3\2\u0207\u0217"+
		"\5\u01a6\u00d4\2\u0208\u0217\5\u01a8\u00d5\2\u0209\u0217\5\u01aa\u00d6"+
		"\2\u020a\u0217\5\u01ac\u00d7\2\u020b\u0217\5\u01ae\u00d8\2\u020c\u0217"+
		"\5\u01e4\u00f3\2\u020d\u0217\5\u01e6\u00f4\2\u020e\u0217\5\u01e8\u00f5"+
		"\2\u020f\u0217\5\u01ea\u00f6\2\u0210\u0217\5\u01ec\u00f7\2\u0211\u0217"+
		"\5\u01ee\u00f8\2\u0212\u0217\5\u01f0\u00f9\2\u0213\u0217\5\u01f2\u00fa"+
		"\2\u0214\u0217\5\u01f4\u00fb\2\u0215\u0217\5\u01f6\u00fc\2\u0216\u01f8"+
		"\3\2\2\2\u0216\u01f9\3\2\2\2\u0216\u01fa\3\2\2\2\u0216\u01fb\3\2\2\2\u0216"+
		"\u01fc\3\2\2\2\u0216\u01fd\3\2\2\2\u0216\u01fe\3\2\2\2\u0216\u01ff\3\2"+
		"\2\2\u0216\u0200\3\2\2\2\u0216\u0201\3\2\2\2\u0216\u0202\3\2\2\2\u0216"+
		"\u0203\3\2\2\2\u0216\u0204\3\2\2\2\u0216\u0205\3\2\2\2\u0216\u0206\3\2"+
		"\2\2\u0216\u0207\3\2\2\2\u0216\u0208\3\2\2\2\u0216\u0209\3\2\2\2\u0216"+
		"\u020a\3\2\2\2\u0216\u020b\3\2\2\2\u0216\u020c\3\2\2\2\u0216\u020d\3\2"+
		"\2\2\u0216\u020e\3\2\2\2\u0216\u020f\3\2\2\2\u0216\u0210\3\2\2\2\u0216"+
		"\u0211\3\2\2\2\u0216\u0212\3\2\2\2\u0216\u0213\3\2\2\2\u0216\u0214\3\2"+
		"\2\2\u0216\u0215\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u021a\7+\2\2\u0219"+
		"\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\3\3\2\2\2\u021b\u021c\7\60\2"+
		"\2\u021c\u021d\7J\2\2\u021d\u0222\5\\/\2\u021e\u0220\7_\2\2\u021f\u021e"+
		"\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\5*\26\2\u0222"+
		"\u021f\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0227\5\6"+
		"\4\2\u0225\u0227\5\b\5\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227"+
		"\5\3\2\2\2\u0228\u022a\5d\63\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2"+
		"\u022a\u022b\3\2\2\2\u022b\u022c\7K\2\2\u022c\u0231\5\20\t\2\u022d\u022e"+
		"\7%\2\2\u022e\u0230\5\20\t\2\u022f\u022d\3\2\2\2\u0230\u0233\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\7\3\2\2\2\u0233\u0231\3\2\2\2"+
		"\u0234\u0236\5d\63\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237"+
		"\3\2\2\2\u0237\u0238\5\34\17\2\u0238\t\3\2\2\2\u0239\u023a\7\61\2\2\u023a"+
		"\u023b\5\62\32\2\u023b\u023d\5\16\b\2\u023c\u023e\5<\37\2\u023d\u023c"+
		"\3\2\2\2\u023d\u023e\3\2\2\2\u023e\13\3\2\2\2\u023f\u0240\5^\60\2\u0240"+
		"\u0241\7\30\2\2\u0241\u0242\5\22\n\2\u0242\r\3\2\2\2\u0243\u0244\7;\2"+
		"\2\u0244\u0249\5\f\7\2\u0245\u0246\7%\2\2\u0246\u0248\5\f\7\2\u0247\u0245"+
		"\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\17\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024d\7\37\2\2\u024d\u0252\5\22"+
		"\n\2\u024e\u024f\7%\2\2\u024f\u0251\5\22\n\2\u0250\u024e\3\2\2\2\u0251"+
		"\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2"+
		"\2\2\u0254\u0252\3\2\2\2\u0255\u0256\7 \2\2\u0256\u025a\3\2\2\2\u0257"+
		"\u0258\7\37\2\2\u0258\u025a\7 \2\2\u0259\u024c\3\2\2\2\u0259\u0257\3\2"+
		"\2\2\u025a\21\3\2\2\2\u025b\u025e\5p9\2\u025c\u025e\7\u0098\2\2\u025d"+
		"\u025b\3\2\2\2\u025d\u025c\3\2\2\2\u025e\23\3\2\2\2\u025f\u0262\7\62\2"+
		"\2\u0260\u0263\5\26\f\2\u0261\u0263\5\30\r\2\u0262\u0260\3\2\2\2\u0262"+
		"\u0261\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u0266\5<\37\2\u0265\u0264\3\2"+
		"\2\2\u0265\u0266\3\2\2\2\u0266\25\3\2\2\2\u0267\u0269\7T\2\2\u0268\u0267"+
		"\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u026c\7\37\2\2"+
		"\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026f"+
		"\5\\/\2\u026e\u0270\7 \2\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"\u0275\3\2\2\2\u0271\u0273\7_\2\2\u0272\u0271\3\2\2\2\u0272\u0273\3\2"+
		"\2\2\u0273\u0274\3\2\2\2\u0274\u0276\5*\26\2\u0275\u0272\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276\27\3\2\2\2\u0277\u0278\5\32\16\2\u0278\u0279\7T\2"+
		"\2\u0279\u027a\5\62\32\2\u027a\u0281\3\2\2\2\u027b\u027c\7T\2\2\u027c"+
		"\u027d\5\32\16\2\u027d\u027e\7]\2\2\u027e\u027f\5\62\32\2\u027f\u0281"+
		"\3\2\2\2\u0280\u0277\3\2\2\2\u0280\u027b\3\2\2\2\u0281\31\3\2\2\2\u0282"+
		"\u0284\5\\/\2\u0283\u0285\7\25\2\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2"+
		"\2\2\u0285\u028d\3\2\2\2\u0286\u0287\7%\2\2\u0287\u0289\5\\/\2\u0288\u028a"+
		"\7\25\2\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\3\2\2\2"+
		"\u028b\u0286\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e"+
		"\3\2\2\2\u028e\33\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0291\5\36\20\2\u0291"+
		"\35\3\2\2\2\u0292\u029a\5 \21\2\u0293\u0295\7M\2\2\u0294\u0296\t\2\2\2"+
		"\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299"+
		"\5 \21\2\u0298\u0293\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\37\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029f\7/\2\2"+
		"\u029e\u02a0\5\"\22\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1"+
		"\3\2\2\2\u02a1\u02a3\5$\23\2\u02a2\u02a4\5\60\31\2\u02a3\u02a2\3\2\2\2"+
		"\u02a3\u02a4\3\2\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a7\5<\37\2\u02a6\u02a5"+
		"\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02aa\5> \2\u02a9"+
		"\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02ad\5@"+
		"!\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02af\3\2\2\2\u02ae"+
		"\u02b0\5\u009aN\2\u02af\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0!\3\2\2"+
		"\2\u02b1\u02b2\t\2\2\2\u02b2#\3\2\2\2\u02b3\u02b6\5,\27\2\u02b4\u02b6"+
		"\5&\24\2\u02b5\u02b3\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6\u02bb\3\2\2\2\u02b7"+
		"\u02b8\7%\2\2\u02b8\u02ba\5&\24\2\u02b9\u02b7\3\2\2\2\u02ba\u02bd\3\2"+
		"\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc%\3\2\2\2\u02bd\u02bb"+
		"\3\2\2\2\u02be\u02c2\5(\25\2\u02bf\u02c2\5^\60\2\u02c0\u02c2\5p9\2\u02c1"+
		"\u02be\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c0\3\2\2\2\u02c2\u02c7\3\2"+
		"\2\2\u02c3\u02c5\7_\2\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5"+
		"\u02c6\3\2\2\2\u02c6\u02c8\5*\26\2\u02c7\u02c4\3\2\2\2\u02c7\u02c8\3\2"+
		"\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02cb\5.\30\2\u02ca\u02c1\3\2\2\2\u02ca"+
		"\u02c9\3\2\2\2\u02cb\'\3\2\2\2\u02cc\u02ce\7\u00b0\2\2\u02cd\u02cf\7\37"+
		"\2\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0"+
		"\u02d2\5p9\2\u02d1\u02d3\7 \2\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2"+
		"\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\7\u0177\2\2\u02d5\u02d6\7\37\2\2\u02d6"+
		"\u02d7\7 \2\2\u02d7\u02d8\7\u00ec\2\2\u02d8\u02d9\7\37\2\2\u02d9\u02da"+
		"\5\u009aN\2\u02da\u02db\7 \2\2\u02db)\3\2\2\2\u02dc\u02df\5V,\2\u02dd"+
		"\u02df\7\u0179\2\2\u02de\u02dc\3\2\2\2\u02de\u02dd\3\2\2\2\u02df+\3\2"+
		"\2\2\u02e0\u02e1\7\21\2\2\u02e1-\3\2\2\2\u02e2\u02e3\5V,\2\u02e3\u02e4"+
		"\7\25\2\2\u02e4/\3\2\2\2\u02e5\u02e6\7T\2\2\u02e6\u02e7\5\62\32\2\u02e7"+
		"\61\3\2\2\2\u02e8\u02ed\5\64\33\2\u02e9\u02ea\7%\2\2\u02ea\u02ec\5\64"+
		"\33\2\u02eb\u02e9\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed"+
		"\u02ee\3\2\2\2\u02ee\63\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f1\5\66\34"+
		"\2\u02f1\u02f2\58\35\2\u02f2\u02f4\3\2\2\2\u02f3\u02f0\3\2\2\2\u02f4\u02f5"+
		"\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02ff\3\2\2\2\u02f7"+
		"\u02fb\5\66\34\2\u02f8\u02fa\58\35\2\u02f9\u02f8\3\2\2\2\u02fa\u02fd\3"+
		"\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd"+
		"\u02fb\3\2\2\2\u02fe\u02f3\3\2\2\2\u02fe\u02f7\3\2\2\2\u02ff\65\3\2\2"+
		"\2\u0300\u0305\5\\/\2\u0301\u0303\7_\2\2\u0302\u0301\3\2\2\2\u0302\u0303"+
		"\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0306\5*\26\2\u0305\u0302\3\2\2\2\u0305"+
		"\u0306\3\2\2\2\u0306\u0310\3\2\2\2\u0307\u0309\5B\"\2\u0308\u030a\5d\63"+
		"\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u0310\3\2\2\2\u030b\u030c"+
		"\7\37\2\2\u030c\u030d\5\62\32\2\u030d\u030e\7 \2\2\u030e\u0310\3\2\2\2"+
		"\u030f\u0300\3\2\2\2\u030f\u0307\3\2\2\2\u030f\u030b\3\2\2\2\u0310\67"+
		"\3\2\2\2\u0311\u0313\7U\2\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313"+
		"\u0315\3\2\2\2\u0314\u0316\t\3\2\2\u0315\u0314\3\2\2\2\u0315\u0316\3\2"+
		"\2\2\u0316\u0317\3\2\2\2\u0317\u0318\7V\2\2\u0318\u0319\3\2\2\2\u0319"+
		"\u031b\5\66\34\2\u031a\u031c\5:\36\2\u031b\u031a\3\2\2\2\u031b\u031c\3"+
		"\2\2\2\u031c\u032a\3\2\2\2\u031d\u031f\7U\2\2\u031e\u031d\3\2\2\2\u031e"+
		"\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\t\4\2\2\u0321\u0323\7Y"+
		"\2\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"\u0325\7V\2\2\u0325\u0327\5\66\34\2\u0326\u0328\5:\36\2\u0327\u0326\3"+
		"\2\2\2\u0327\u0328\3\2\2\2\u0328\u032a\3\2\2\2\u0329\u0312\3\2\2\2\u0329"+
		"\u031e\3\2\2\2\u032a9\3\2\2\2\u032b\u032c\7`\2\2\u032c\u0330\5p9\2\u032d"+
		"\u032e\7]\2\2\u032e\u0330\5d\63\2\u032f\u032b\3\2\2\2\u032f\u032d\3\2"+
		"\2\2\u0330;\3\2\2\2\u0331\u0332\7^\2\2\u0332\u0333\5p9\2\u0333=\3\2\2"+
		"\2\u0334\u0335\7t\2\2\u0335\u0336\7u\2\2\u0336\u033b\5\u009cO\2\u0337"+
		"\u0338\7%\2\2\u0338\u033a\5\u009cO\2\u0339\u0337\3\2\2\2\u033a\u033d\3"+
		"\2\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c?\3\2\2\2\u033d\u033b"+
		"\3\2\2\2\u033e\u033f\7x\2\2\u033f\u0340\5p9\2\u0340A\3\2\2\2\u0341\u0342"+
		"\7\37\2\2\u0342\u0343\5\36\20\2\u0343\u0345\7 \2\2\u0344\u0346\7_\2\2"+
		"\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\3\2\2\2\u0347\u0349"+
		"\5*\26\2\u0348\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349C\3\2\2\2\u034a"+
		"\u034b\7)\2\2\u034bE\3\2\2\2\u034c\u0354\5H%\2\u034d\u0354\5J&\2\u034e"+
		"\u0354\5L\'\2\u034f\u0354\5N(\2\u0350\u0354\5P)\2\u0351\u0354\5R*\2\u0352"+
		"\u0354\5T+\2\u0353\u034c\3\2\2\2\u0353\u034d\3\2\2\2\u0353\u034e\3\2\2"+
		"\2\u0353\u034f\3\2\2\2\u0353\u0350\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0352"+
		"\3\2\2\2\u0354G\3\2\2\2\u0355\u0356\7\u0179\2\2\u0356I\3\2\2\2\u0357\u0359"+
		"\7\20\2\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a\3\2\2\2"+
		"\u035a\u035b\7\u017a\2\2\u035bK\3\2\2\2\u035c\u035d\t\5\2\2\u035d\u0364"+
		"\7\u0179\2\2\u035e\u035f\7!\2\2\u035f\u0360\5V,\2\u0360\u0361\7\u0179"+
		"\2\2\u0361\u0362\7\"\2\2\u0362\u0364\3\2\2\2\u0363\u035c\3\2\2\2\u0363"+
		"\u035e\3\2\2\2\u0364M\3\2\2\2\u0365\u0366\7\u017b\2\2\u0366O\3\2\2\2\u0367"+
		"\u0368\7\u017c\2\2\u0368Q\3\2\2\2\u0369\u036a\t\6\2\2\u036aS\3\2\2\2\u036b"+
		"\u036c\7j\2\2\u036cU\3\2\2\2\u036d\u0370\7\u0178\2\2\u036e\u0370\5X-\2"+
		"\u036f\u036d\3\2\2\2\u036f\u036e\3\2\2\2\u0370W\3\2\2\2\u0371\u0372\t"+
		"\7\2\2\u0372Y\3\2\2\2\u0373\u0374\5V,\2\u0374[\3\2\2\2\u0375\u0376\5`"+
		"\61\2\u0376\u0377\7\24\2\2\u0377\u0379\3\2\2\2\u0378\u0375\3\2\2\2\u0378"+
		"\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\5b\62\2\u037b]\3\2\2\2"+
		"\u037c\u037d\5`\61\2\u037d\u037e\7\24\2\2\u037e\u0380\3\2\2\2\u037f\u037c"+
		"\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\5b\62\2\u0382"+
		"_\3\2\2\2\u0383\u0384\5V,\2\u0384a\3\2\2\2\u0385\u0386\5V,\2\u0386c\3"+
		"\2\2\2\u0387\u0388\7\37\2\2\u0388\u038d\5\u00ba^\2\u0389\u038a\7%\2\2"+
		"\u038a\u038c\5\u00ba^\2\u038b\u0389\3\2\2\2\u038c\u038f\3\2\2\2\u038d"+
		"\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0390\3\2\2\2\u038f\u038d\3\2"+
		"\2\2\u0390\u0391\7 \2\2\u0391e\3\2\2\2\u0392\u0394\7\37\2\2\u0393\u0392"+
		"\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u039a\5\\/\2\u0396"+
		"\u0397\7%\2\2\u0397\u0399\5\\/\2\u0398\u0396\3\2\2\2\u0399\u039c\3\2\2"+
		"\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039e\3\2\2\2\u039c\u039a"+
		"\3\2\2\2\u039d\u039f\7 \2\2\u039e\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"g\3\2\2\2\u03a0\u03a1\5V,\2\u03a1i\3\2\2\2\u03a2\u03a3\t\b\2\2\u03a3k"+
		"\3\2\2\2\u03a4\u03aa\7\37\2\2\u03a5\u03a8\7\u017a\2\2\u03a6\u03a7\7%\2"+
		"\2\u03a7\u03a9\7\u017a\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9"+
		"\u03ab\3\2\2\2\u03aa\u03a5\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ac\3\2"+
		"\2\2\u03ac\u03ad\7 \2\2\u03adm\3\2\2\2\u03ae\u03b0\7@\2\2\u03af\u03ae"+
		"\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2\7C\2\2\u03b2"+
		"o\3\2\2\2\u03b3\u03b4\b9\1\2\u03b4\u03b5\5t;\2\u03b5\u03b6\5p9\5\u03b6"+
		"\u03bd\3\2\2\2\u03b7\u03b8\7\37\2\2\u03b8\u03b9\5p9\2\u03b9\u03ba\7 \2"+
		"\2\u03ba\u03bd\3\2\2\2\u03bb\u03bd\5v<\2\u03bc\u03b3\3\2\2\2\u03bc\u03b7"+
		"\3\2\2\2\u03bc\u03bb\3\2\2\2\u03bd\u03c4\3\2\2\2\u03be\u03bf\f\6\2\2\u03bf"+
		"\u03c0\5r:\2\u03c0\u03c1\5p9\7\u03c1\u03c3\3\2\2\2\u03c2\u03be\3\2\2\2"+
		"\u03c3\u03c6\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5q\3"+
		"\2\2\2\u03c6\u03c4\3\2\2\2\u03c7\u03c8\t\t\2\2\u03c8s\3\2\2\2\u03c9\u03ca"+
		"\t\n\2\2\u03cau\3\2\2\2\u03cb\u03cc\b<\1\2\u03cc\u03cd\5z>\2\u03cd\u03e2"+
		"\3\2\2\2\u03ce\u03cf\f\7\2\2\u03cf\u03d1\7h\2\2\u03d0\u03d2\7i\2\2\u03d1"+
		"\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03e1\t\13"+
		"\2\2\u03d4\u03d5\f\6\2\2\u03d5\u03d6\7\26\2\2\u03d6\u03e1\5z>\2\u03d7"+
		"\u03d8\f\5\2\2\u03d8\u03d9\5x=\2\u03d9\u03da\5z>\2\u03da\u03e1\3\2\2\2"+
		"\u03db\u03dc\f\4\2\2\u03dc\u03dd\5x=\2\u03dd\u03de\t\f\2\2\u03de\u03df"+
		"\5B\"\2\u03df\u03e1\3\2\2\2\u03e0\u03ce\3\2\2\2\u03e0\u03d4\3\2\2\2\u03e0"+
		"\u03d7\3\2\2\2\u03e0\u03db\3\2\2\2\u03e1\u03e4\3\2\2\2\u03e2\u03e0\3\2"+
		"\2\2\u03e2\u03e3\3\2\2\2\u03e3w\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e5\u03e6"+
		"\t\r\2\2\u03e6y\3\2\2\2\u03e7\u03e9\5|?\2\u03e8\u03ea\7i\2\2\u03e9\u03e8"+
		"\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\7o\2\2\u03ec"+
		"\u03ed\5B\"\2\u03ed\u0413\3\2\2\2\u03ee\u03f0\5|?\2\u03ef\u03f1\7i\2\2"+
		"\u03f0\u03ef\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3"+
		"\7o\2\2\u03f3\u03f4\7\37\2\2\u03f4\u03f9\5p9\2\u03f5\u03f6\7%\2\2\u03f6"+
		"\u03f8\5p9\2\u03f7\u03f5\3\2\2\2\u03f8\u03fb\3\2\2\2\u03f9\u03f7\3\2\2"+
		"\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fc\u03fd"+
		"\7 \2\2\u03fd\u0413\3\2\2\2\u03fe\u0400\5|?\2\u03ff\u0401\7i\2\2\u0400"+
		"\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\7n"+
		"\2\2\u0403\u0404\5|?\2\u0404\u0405\7f\2\2\u0405\u0406\5z>\2\u0406\u0413"+
		"\3\2\2\2\u0407\u0409\5|?\2\u0408\u040a\7i\2\2\u0409\u0408\3\2\2\2\u0409"+
		"\u040a\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c\7r\2\2\u040c\u040f\5~@"+
		"\2\u040d\u040e\7\u00ab\2\2\u040e\u0410\5~@\2\u040f\u040d\3\2\2\2\u040f"+
		"\u0410\3\2\2\2\u0410\u0413\3\2\2\2\u0411\u0413\5|?\2\u0412\u03e7\3\2\2"+
		"\2\u0412\u03ee\3\2\2\2\u0412\u03fe\3\2\2\2\u0412\u0407\3\2\2\2\u0412\u0411"+
		"\3\2\2\2\u0413{\3\2\2\2\u0414\u0415\b?\1\2\u0415\u0416\5~@\2\u0416\u0437"+
		"\3\2\2\2\u0417\u0418\f\r\2\2\u0418\u0419\7\b\2\2\u0419\u0436\5|?\16\u041a"+
		"\u041b\f\f\2\2\u041b\u041c\7\t\2\2\u041c\u0436\5|?\r\u041d\u041e\f\13"+
		"\2\2\u041e\u041f\7\n\2\2\u041f\u0436\5|?\f\u0420\u0421\f\n\2\2\u0421\u0422"+
		"\7\13\2\2\u0422\u0436\5|?\13\u0423\u0424\f\t\2\2\u0424\u0425\7\17\2\2"+
		"\u0425\u0436\5|?\n\u0426\u0427\f\b\2\2\u0427\u0428\7\20\2\2\u0428\u0436"+
		"\5|?\t\u0429\u042a\f\7\2\2\u042a\u042b\7\21\2\2\u042b\u0436\5|?\b\u042c"+
		"\u042d\f\6\2\2\u042d\u042e\7\22\2\2\u042e\u0436\5|?\7\u042f\u0430\f\5"+
		"\2\2\u0430\u0431\7\r\2\2\u0431\u0436\5|?\6\u0432\u0433\f\4\2\2\u0433\u0434"+
		"\7\f\2\2\u0434\u0436\5|?\5\u0435\u0417\3\2\2\2\u0435\u041a\3\2\2\2\u0435"+
		"\u041d\3\2\2\2\u0435\u0420\3\2\2\2\u0435\u0423\3\2\2\2\u0435\u0426\3\2"+
		"\2\2\u0435\u0429\3\2\2\2\u0435\u042c\3\2\2\2\u0435\u042f\3\2\2\2\u0435"+
		"\u0432\3\2\2\2\u0436\u0439\3\2\2\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2"+
		"\2\2\u0438}\3\2\2\2\u0439\u0437\3\2\2\2\u043a\u043b\b@\1\2\u043b\u045b"+
		"\5\u0080A\2\u043c\u045b\5D#\2\u043d\u045b\5F$\2\u043e\u045b\5^\60\2\u043f"+
		"\u0440\t\16\2\2\u0440\u045b\5~@\b\u0441\u0443\7\u00b1\2\2\u0442\u0441"+
		"\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0445\7\37\2\2"+
		"\u0445\u044a\5p9\2\u0446\u0447\7%\2\2\u0447\u0449\5p9\2\u0448\u0446\3"+
		"\2\2\2\u0449\u044c\3\2\2\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2\2\2\u044b"+
		"\u044d\3\2\2\2\u044c\u044a\3\2\2\2\u044d\u044e\7 \2\2\u044e\u045b\3\2"+
		"\2\2\u044f\u0451\7m\2\2\u0450\u044f\3\2\2\2\u0450\u0451\3\2\2\2\u0451"+
		"\u0452\3\2\2\2\u0452\u045b\5B\"\2\u0453\u0454\7!\2\2\u0454\u0455\5V,\2"+
		"\u0455\u0456\5p9\2\u0456\u0457\7\"\2\2\u0457\u045b\3\2\2\2\u0458\u045b"+
		"\5\u0092J\2\u0459\u045b\5\u0098M\2\u045a\u043a\3\2\2\2\u045a\u043c\3\2"+
		"\2\2\u045a\u043d\3\2\2\2\u045a\u043e\3\2\2\2\u045a\u043f\3\2\2\2\u045a"+
		"\u0442\3\2\2\2\u045a\u0450\3\2\2\2\u045a\u0453\3\2\2\2\u045a\u0458\3\2"+
		"\2\2\u045a\u0459\3\2\2\2\u045b\u0461\3\2\2\2\u045c\u045d\f\t\2\2\u045d"+
		"\u045e\7\5\2\2\u045e\u0460\5~@\n\u045f\u045c\3\2\2\2\u0460\u0463\3\2\2"+
		"\2\u0461\u045f\3\2\2\2\u0461\u0462\3\2\2\2\u0462\177\3\2\2\2\u0463\u0461"+
		"\3\2\2\2\u0464\u0468\5\u0082B\2\u0465\u0468\5\u0088E\2\u0466\u0468\5\u008e"+
		"H\2\u0467\u0464\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0466\3\2\2\2\u0468"+
		"\u0081\3\2\2\2\u0469\u046a\5\u0084C\2\u046a\u046c\7\37\2\2\u046b\u046d"+
		"\5\u0086D\2\u046c\u046b\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u0477\3\2\2"+
		"\2\u046e\u0473\5p9\2\u046f\u0470\7%\2\2\u0470\u0472\5p9\2\u0471\u046f"+
		"\3\2\2\2\u0472\u0475\3\2\2\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2\2\2\u0474"+
		"\u0478\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u0478\7\21\2\2\u0477\u046e\3"+
		"\2\2\2\u0477\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479"+
		"\u047a\7 \2\2\u047a\u0083\3\2\2\2\u047b\u047c\t\17\2\2\u047c\u0085\3\2"+
		"\2\2\u047d\u047e\7N\2\2\u047e\u0087\3\2\2\2\u047f\u0482\5\u008aF\2\u0480"+
		"\u0482\5\u008cG\2\u0481\u047f\3\2\2\2\u0481\u0480\3\2\2\2\u0482\u0089"+
		"\3\2\2\2\u0483\u0484\7Q\2\2\u0484\u0485\7\37\2\2\u0485\u0486\5p9\2\u0486"+
		"\u0487\7_\2\2\u0487\u0488\5\u009eP\2\u0488\u0489\7 \2\2\u0489\u008b\3"+
		"\2\2\2\u048a\u048b\7\u0081\2\2\u048b\u048c\7\37\2\2\u048c\u0491\5p9\2"+
		"\u048d\u048e\7%\2\2\u048e\u0490\5p9\2\u048f\u048d\3\2\2\2\u0490\u0493"+
		"\3\2\2\2\u0491\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0496\3\2\2\2\u0493"+
		"\u0491\3\2\2\2\u0494\u0495\7]\2\2\u0495\u0497\5\u00d4k\2\u0496\u0494\3"+
		"\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0499\7 \2\2\u0499"+
		"\u008d\3\2\2\2\u049a\u049b\5\u0090I\2\u049b\u04a5\7\37\2\2\u049c\u04a1"+
		"\5p9\2\u049d\u049e\7%\2\2\u049e\u04a0\5p9\2\u049f\u049d\3\2\2\2\u04a0"+
		"\u04a3\3\2\2\2\u04a1\u049f\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a6\3\2"+
		"\2\2\u04a3\u04a1\3\2\2\2\u04a4\u04a6\7\21\2\2\u04a5\u049c\3\2\2\2\u04a5"+
		"\u04a4\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8\7 "+
		"\2\2\u04a8\u008f\3\2\2\2\u04a9\u04af\5V,\2\u04aa\u04af\7a\2\2\u04ab\u04af"+
		"\7\u0088\2\2\u04ac\u04af\7\u0089\2\2\u04ad\u04af\7\u0084\2\2\u04ae\u04a9"+
		"\3\2\2\2\u04ae\u04aa\3\2\2\2\u04ae\u04ab\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae"+
		"\u04ad\3\2\2\2\u04af\u0091\3\2\2\2\u04b0\u04b2\7O\2\2\u04b1\u04b3\5~@"+
		"\2\u04b2\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b5\3\2\2\2\u04b4\u04b6"+
		"\5\u0094K\2\u04b5\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b5\3\2\2"+
		"\2\u04b7\u04b8\3\2\2\2\u04b8\u04ba\3\2\2\2\u04b9\u04bb\5\u0096L\2\u04ba"+
		"\u04b9\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u0093\3\2\2\2\u04bc\u04bd\7P"+
		"\2\2\u04bd\u04be\5p9\2\u04be\u04bf\7c\2\2\u04bf\u04c0\5p9\2\u04c0\u0095"+
		"\3\2\2\2\u04c1\u04c2\7b\2\2\u04c2\u04c3\5p9\2\u04c3\u0097\3\2\2\2\u04c4"+
		"\u04c9\5\u00a8U\2\u04c5\u04c9\5\u00a2R\2\u04c6\u04c9\5\u00a4S\2\u04c7"+
		"\u04c9\5\u00a6T\2\u04c8\u04c4\3\2\2\2\u04c8\u04c5\3\2\2\2\u04c8\u04c6"+
		"\3\2\2\2\u04c8\u04c7\3\2\2\2\u04c9\u0099\3\2\2\2\u04ca\u04cb\7s\2\2\u04cb"+
		"\u04cc\7u\2\2\u04cc\u04d1\5\u009cO\2\u04cd\u04ce\7%\2\2\u04ce\u04d0\5"+
		"\u009cO\2\u04cf\u04cd\3\2\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2"+
		"\u04d1\u04d2\3\2\2\2\u04d2\u009b\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d8"+
		"\5^\60\2\u04d5\u04d8\5J&\2\u04d6\u04d8\5p9\2\u04d7\u04d4\3\2\2\2\u04d7"+
		"\u04d5\3\2\2\2\u04d7\u04d6\3\2\2\2\u04d8\u04da\3\2\2\2\u04d9\u04db\t\20"+
		"\2\2\u04da\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u009d\3\2\2\2\u04dc"+
		"\u04e8\5\u00a0Q\2\u04dd\u04e9\5l\67\2\u04de\u04df\7\37\2\2\u04df\u04e0"+
		"\7\u0093\2\2\u04e0\u04e9\7 \2\2\u04e1\u04e3\7\37\2\2\u04e2\u04e4\t\21"+
		"\2\2\u04e3\u04e2\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5"+
		"\u04e6\5\u00d4k\2\u04e6\u04e7\7 \2\2\u04e7\u04e9\3\2\2\2\u04e8\u04dd\3"+
		"\2\2\2\u04e8\u04de\3\2\2\2\u04e8\u04e1\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9"+
		"\u009f\3\2\2\2\u04ea\u04eb\7\u0178\2\2\u04eb\u00a1\3\2\2\2\u04ec\u04f0"+
		"\7\u0178\2\2\u04ed\u04ee\7L\2\2\u04ee\u04ef\7\u0086\2\2\u04ef\u04f1\7"+
		"\u00ff\2\2\u04f0\u04ed\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f2\3\2\2\2"+
		"\u04f2\u04f3\7\u0179\2\2\u04f3\u00a3\3\2\2\2\u04f4\u04f5\7Q\2\2\u04f5"+
		"\u04f6\7\37\2\2\u04f6\u04f7\5p9\2\u04f7\u04f8\7_\2\2\u04f8\u04fc\5\u009e"+
		"P\2\u04f9\u04fa\7\37\2\2\u04fa\u04fb\7\u017a\2\2\u04fb\u04fd\7 \2\2\u04fc"+
		"\u04f9\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\7 "+
		"\2\2\u04ff\u00a5\3\2\2\2\u0500\u0501\7\u00ca\2\2\u0501\u0505\5\u009eP"+
		"\2\u0502\u0503\7\37\2\2\u0503\u0504\7\u017a\2\2\u0504\u0506\7 \2\2\u0505"+
		"\u0502\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\7%"+
		"\2\2\u0508\u050b\5p9\2\u0509\u050a\7%\2\2\u050a\u050c\7\u017a\2\2\u050b"+
		"\u0509\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u00a7\3\2\2\2\u050d\u050e\5\u0080"+
		"A\2\u050e\u050f\5\u00aaV\2\u050f\u00a9\3\2\2\2\u0510\u0511\7\u00ec\2\2"+
		"\u0511\u0513\7\37\2\2\u0512\u0514\5\u00acW\2\u0513\u0512\3\2\2\2\u0513"+
		"\u0514\3\2\2\2\u0514\u0516\3\2\2\2\u0515\u0517\5\u009aN\2\u0516\u0515"+
		"\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0519\3\2\2\2\u0518\u051a\5\u00aeX"+
		"\2\u0519\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051c"+
		"\7 \2\2\u051c\u00ab\3\2\2\2\u051d\u051e\7\u00ae\2\2\u051e\u051f\7u\2\2"+
		"\u051f\u0524\5p9\2\u0520\u0521\7%\2\2\u0521\u0523\5p9\2\u0522\u0520\3"+
		"\2\2\2\u0523\u0526\3\2\2\2\u0524\u0522\3\2\2\2\u0524\u0525\3\2\2\2\u0525"+
		"\u00ad\3\2\2\2\u0526\u0524\3\2\2\2\u0527\u0528\t\22\2\2\u0528\u0529\5"+
		"\u00b0Y\2\u0529\u00af\3\2\2\2\u052a\u052d\5\u00b6\\\2\u052b\u052d\5\u00b2"+
		"Z\2\u052c\u052a\3\2\2\2\u052c\u052b\3\2\2\2\u052d\u00b1\3\2\2\2\u052e"+
		"\u052f\7n\2\2\u052f\u0530\5\u00b4[\2\u0530\u0531\7f\2\2\u0531\u0532\5"+
		"\u00b4[\2\u0532\u00b3\3\2\2\2\u0533\u0536\5\u00b6\\\2\u0534\u0536\5\u00b8"+
		"]\2\u0535\u0533\3\2\2\2\u0535\u0534\3\2\2\2\u0536\u00b5\3\2\2\2\u0537"+
		"\u0538\7\u00e1\2\2\u0538\u053e\7\u00f1\2\2\u0539\u053a\7\u017a\2\2\u053a"+
		"\u053e\7\u00f1\2\2\u053b\u053c\7\u0099\2\2\u053c\u053e\7\u00b1\2\2\u053d"+
		"\u0537\3\2\2\2\u053d\u0539\3\2\2\2\u053d\u053b\3\2\2\2\u053e\u00b7\3\2"+
		"\2\2\u053f\u0540\7\u00e1\2\2\u0540\u0546\7\u00db\2\2\u0541\u0542\7\u017a"+
		"\2\2\u0542\u0546\7\u00db\2\2\u0543\u0544\7\u0099\2\2\u0544\u0546\7\u00b1"+
		"\2\2\u0545\u053f\3\2\2\2\u0545\u0541\3\2\2\2\u0545\u0543\3\2\2\2\u0546"+
		"\u00b9\3\2\2\2\u0547\u0549\5^\60\2\u0548\u054a\t\20\2\2\u0549\u0548\3"+
		"\2\2\2\u0549\u054a\3\2\2\2\u054a\u00bb\3\2\2\2\u054b\u054c\7\u00da\2\2"+
		"\u054c\u054d\7\30\2\2\u054d\u0559\7\u017a\2\2\u054e\u0559\5\u00c2b\2\u054f"+
		"\u0550\t\23\2\2\u0550\u0559\5\u00c0a\2\u0551\u0552\7\u00e5\2\2\u0552\u0553"+
		"\7\30\2\2\u0553\u0559\7\u017a\2\2\u0554\u0556\5\u00be`\2\u0555\u0557\5"+
		"\u00c8e\2\u0556\u0555\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0559\3\2\2\2"+
		"\u0558\u054b\3\2\2\2\u0558\u054e\3\2\2\2\u0558\u054f\3\2\2\2\u0558\u0551"+
		"\3\2\2\2\u0558\u0554\3\2\2\2\u0559\u00bd\3\2\2\2\u055a\u055b\7\u0158\2"+
		"\2\u055b\u055c\7\30\2\2\u055c\u055d\t\24\2\2\u055d\u00bf\3\2\2\2\u055e"+
		"\u055f\7\30\2\2\u055f\u0561\7\u017a\2\2\u0560\u0562\7\u00d0\2\2\u0561"+
		"\u0560\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u00c1\3\2\2\2\u0563\u0564\5\u00c4"+
		"c\2\u0564\u0565\5\u00c6d\2\u0565\u00c3\3\2\2\2\u0566\u0567\t\25\2\2\u0567"+
		"\u00c5\3\2\2\2\u0568\u0569\7\30\2\2\u0569\u056a\t\26\2\2\u056a\u00c7\3"+
		"\2\2\2\u056b\u056c\7`\2\2\u056c\u056d\7\u00af\2\2\u056d\u056e\7\37\2\2"+
		"\u056e\u056f\5\u00caf\2\u056f\u0570\7 \2\2\u0570\u00c9\3\2\2\2\u0571\u0576"+
		"\5\u00ccg\2\u0572\u0573\7%\2\2\u0573\u0575\5\u00ccg\2\u0574\u0572\3\2"+
		"\2\2\u0575\u0578\3\2\2\2\u0576\u0574\3\2\2\2\u0576\u0577\3\2\2\2\u0577"+
		"\u00cb\3\2\2\2\u0578\u0576\3\2\2\2\u0579\u057c\7\u017a\2\2\u057a\u057c"+
		"\5\u00ceh\2\u057b\u0579\3\2\2\2\u057b\u057a\3\2\2\2\u057c\u00cd\3\2\2"+
		"\2\u057d\u057e\7\u017a\2\2\u057e\u057f\7e\2\2\u057f\u0580\7\u017a\2\2"+
		"\u0580\u00cf\3\2\2\2\u0581\u0582\7\u015e\2\2\u0582\u0583\7\37\2\2\u0583"+
		"\u0584\7\u0167\2\2\u0584\u0585\7\30\2\2\u0585\u0587\7\u017a\2\2\u0586"+
		"\u0588\7\u00d0\2\2\u0587\u0586\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589"+
		"\3\2\2\2\u0589\u058a\7%\2\2\u058a\u058b\7\u014e\2\2\u058b\u058c\7\30\2"+
		"\2\u058c\u058d\t\27\2\2\u058d\u058e\7 \2\2\u058e\u00d1\3\2\2\2\u058f\u0594"+
		"\7`\2\2\u0590\u0591\7\37\2\2\u0591\u0592\5\u00d0i\2\u0592\u0593\7 \2\2"+
		"\u0593\u0595\3\2\2\2\u0594\u0590\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u00d3"+
		"\3\2\2\2\u0596\u0597\7\u0178\2\2\u0597\u00d5\3\2\2\2\u0598\u059d\5\u00d4"+
		"k\2\u0599\u059a\7%\2\2\u059a\u059c\5\u00d4k\2\u059b\u0599\3\2\2\2\u059c"+
		"\u059f\3\2\2\2\u059d\u059b\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u00d7\3\2"+
		"\2\2\u059f\u059d\3\2\2\2\u05a0\u05a1\7\3\2\2\u05a1\u00d9\3\2\2\2\u05a2"+
		"\u05a3\7\63\2\2\u05a3\u05a4\7<\2\2\u05a4\u05a5\5\\/\2\u05a5\u05a6\5\u00e8"+
		"u\2\u05a6\u05a7\5\u00eav\2\u05a7\u00db\3\2\2\2\u05a8\u05a9\7\63\2\2\u05a9"+
		"\u05aa\5\u0150\u00a9\2\u05aa\u05ab\7>\2\2\u05ab\u05ac\5h\65\2\u05ac\u05ad"+
		"\7`\2\2\u05ad\u05ae\5\\/\2\u05ae\u05af\5d\63\2\u05af\u00dd\3\2\2\2\u05b0"+
		"\u05b1\7\64\2\2\u05b1\u05b2\7<\2\2\u05b2\u05b3\5\\/\2\u05b3\u05b4\5\u0152"+
		"\u00aa\2\u05b4\u00df\3\2\2\2\u05b5\u05b6\7\64\2\2\u05b6\u05b9\7>\2\2\u05b7"+
		"\u05ba\5h\65\2\u05b8\u05ba\7p\2\2\u05b9\u05b7\3\2\2\2\u05b9\u05b8\3\2"+
		"\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\7`\2\2\u05bc\u05bd\5\\/\2\u05bd\u00e1"+
		"\3\2\2\2\u05be\u05bf\7\65\2\2\u05bf\u05c1\7<\2\2\u05c0\u05c2\5\u019a\u00ce"+
		"\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4"+
		"\5f\64\2\u05c4\u00e3\3\2\2\2\u05c5\u05c6\7\65\2\2\u05c6\u05c8\7>\2\2\u05c7"+
		"\u05c9\5\u019a\u00ce\2\u05c8\u05c7\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca"+
		"\3\2\2\2\u05ca\u05cb\5h\65\2\u05cb\u05cc\7`\2\2\u05cc\u05cd\5\\/\2\u05cd"+
		"\u00e5\3\2\2\2\u05ce\u05cf\7\66\2\2\u05cf\u05d0\7<\2\2\u05d0\u05d1\5\\"+
		"/\2\u05d1\u00e7\3\2\2\2\u05d2\u05d3\7_\2\2\u05d3\u05d5\7\u00d9\2\2\u05d4"+
		"\u05d2\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u00e9\3\2\2\2\u05d6\u05d7\5\u00ec"+
		"w\2\u05d7\u05d8\5\u013a\u009e\2\u05d8\u05d9\5\u013c\u009f\2\u05d9\u00eb"+
		"\3\2\2\2\u05da\u05db\7\37\2\2\u05db\u05e0\5\u00eex\2\u05dc\u05dd\7%\2"+
		"\2\u05dd\u05df\5\u00eex\2\u05de\u05dc\3\2\2\2\u05df\u05e2\3\2\2\2\u05e0"+
		"\u05de\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e5\3\2\2\2\u05e2\u05e0\3\2"+
		"\2\2\u05e3\u05e4\7%\2\2\u05e4\u05e6\5\u0138\u009d\2\u05e5\u05e3\3\2\2"+
		"\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e8\7 \2\2\u05e8\u00ed"+
		"\3\2\2\2\u05e9\u05ef\5\u00f0y\2\u05ea\u05ef\5\u0120\u0091\2\u05eb\u05ef"+
		"\5\u0122\u0092\2\u05ec\u05ef\5\u0124\u0093\2\u05ed\u05ef\5\u0132\u009a"+
		"\2\u05ee\u05e9\3\2\2\2\u05ee\u05ea\3\2\2\2\u05ee\u05eb\3\2\2\2\u05ee\u05ec"+
		"\3\2\2\2\u05ee\u05ed\3\2\2\2\u05ef\u00ef\3\2\2\2\u05f0\u05f1\5^\60\2\u05f1"+
		"\u05f5\5\u009eP\2\u05f2\u05f4\5\u00f2z\2\u05f3\u05f2\3\2\2\2\u05f4\u05f7"+
		"\3\2\2\2\u05f5\u05f3\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f8\3\2\2\2\u05f7"+
		"\u05f5\3\2\2\2\u05f8\u05fa\5\u011e\u0090\2\u05f9\u05fb\5\u0114\u008b\2"+
		"\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u00f1\3\2\2\2\u05fc\u0632"+
		"\7\u00d8\2\2\u05fd\u05fe\7\u00c7\2\2\u05fe\u0632\5j\66\2\u05ff\u0632\7"+
		"\u00fb\2\2\u0600\u0601\7\u00e4\2\2\u0601\u0602\7L\2\2\u0602\u0603\7\37"+
		"\2\2\u0603\u0604\7F\2\2\u0604\u0605\7\30\2\2\u0605\u0606\7\u0179\2\2\u0606"+
		"\u0632\7 \2\2\u0607\u0608\7?\2\2\u0608\u060a\5\u00d4k\2\u0609\u0607\3"+
		"\2\2\2\u0609\u060a\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\7\u0098\2\2"+
		"\u060c\u0632\5p9\2\u060d\u0613\7\u00de\2\2\u060e\u060f\7\37\2\2\u060f"+
		"\u0610\7\u017a\2\2\u0610\u0611\7%\2\2\u0611\u0612\7\u017a\2\2\u0612\u0614"+
		"\7 \2\2\u0613\u060e\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0632\3\2\2\2\u0615"+
		"\u0616\7i\2\2\u0616\u0617\7d\2\2\u0617\u0632\7\u00f6\2\2\u0618\u0619\7"+
		"\u00b8\2\2\u0619\u061a\7\u00b5\2\2\u061a\u061b\7_\2\2\u061b\u061c\7\u00b1"+
		"\2\2\u061c\u061e\t\30\2\2\u061d\u061f\7\u00ac\2\2\u061e\u061d\3\2\2\2"+
		"\u061e\u061f\3\2\2\2\u061f\u0632\3\2\2\2\u0620\u0622\7i\2\2\u0621\u0620"+
		"\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0632\7j\2\2\u0624"+
		"\u0632\7\u00f8\2\2\u0625\u0626\7\u00d6\2\2\u0626\u0627\7L\2\2\u0627\u0632"+
		"\5\u00f4{\2\u0628\u062d\5\u00f6|\2\u0629\u062a\7%\2\2\u062a\u062c\5\u00f6"+
		"|\2\u062b\u0629\3\2\2\2\u062c\u062f\3\2\2\2\u062d\u062b\3\2\2\2\u062d"+
		"\u062e\3\2\2\2\u062e\u0632\3\2\2\2\u062f\u062d\3\2\2\2\u0630\u0632\5\u0114"+
		"\u008b\2\u0631\u05fc\3\2\2\2\u0631\u05fd\3\2\2\2\u0631\u05ff\3\2\2\2\u0631"+
		"\u0600\3\2\2\2\u0631\u0609\3\2\2\2\u0631\u060d\3\2\2\2\u0631\u0615\3\2"+
		"\2\2\u0631\u0618\3\2\2\2\u0631\u0621\3\2\2\2\u0631\u0624\3\2\2\2\u0631"+
		"\u0625\3\2\2\2\u0631\u0628\3\2\2\2\u0631\u0630\3\2\2\2\u0632\u00f3\3\2"+
		"\2\2\u0633\u0634\7\37\2\2\u0634\u0635\7\u0154\2\2\u0635\u0636\7\30\2\2"+
		"\u0636\u0637\5\u00d4k\2\u0637\u0638\7%\2\2\u0638\u0639\7\u015a\2\2\u0639"+
		"\u063a\7\30\2\2\u063a\u063b\t\31\2\2\u063b\u063c\7%\2\2\u063c\u063d\7"+
		"\u00c2\2\2\u063d\u063e\7\30\2\2\u063e\u063f\7\u0179\2\2\u063f\u0640\7"+
		" \2\2\u0640\u00f5\3\2\2\2\u0641\u0642\7?\2\2\u0642\u0644\5\u00d4k\2\u0643"+
		"\u0641\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0648\3\2\2\2\u0645\u0649\5\u00f8"+
		"}\2\u0646\u0649\5\u010c\u0087\2\u0647\u0649\5\u0112\u008a\2\u0648\u0645"+
		"\3\2\2\2\u0648\u0646\3\2\2\2\u0648\u0647\3\2\2\2\u0649\u00f7\3\2\2\2\u064a"+
		"\u064d\5n8\2\u064b\u064d\7A\2\2\u064c\u064a\3\2\2\2\u064c\u064b\3\2\2"+
		"\2\u064d\u0650\3\2\2\2\u064e\u0651\5\u00fa~\2\u064f\u0651\5\u0108\u0085"+
		"\2\u0650\u064e\3\2\2\2\u0650\u064f\3\2\2\2\u0651\u00f9\3\2\2\2\u0652\u0654"+
		"\5\u00fc\177\2\u0653\u0652\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0656\3\2"+
		"\2\2\u0655\u0657\5\u00fe\u0080\2\u0656\u0655\3\2\2\2\u0656\u0657\3\2\2"+
		"\2\u0657\u0659\3\2\2\2\u0658\u065a\5\u0100\u0081\2\u0659\u0658\3\2\2\2"+
		"\u0659\u065a\3\2\2\2\u065a\u00fb\3\2\2\2\u065b\u065c\t\32\2\2\u065c\u00fd"+
		"\3\2\2\2\u065d\u066c\7L\2\2\u065e\u065f\7\u00da\2\2\u065f\u0660\7\30\2"+
		"\2\u0660\u066d\7\u017a\2\2\u0661\u0662\7\37\2\2\u0662\u0667\5\u00bc_\2"+
		"\u0663\u0664\7%\2\2\u0664\u0666\5\u00bc_\2\u0665\u0663\3\2\2\2\u0666\u0669"+
		"\3\2\2\2\u0667\u0665\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u066a\3\2\2\2\u0669"+
		"\u0667\3\2\2\2\u066a\u066b\7 \2\2\u066b\u066d\3\2\2\2\u066c\u065e\3\2"+
		"\2\2\u066c\u0661\3\2\2\2\u066d\u00ff\3\2\2\2\u066e\u0672\5\u0102\u0082"+
		"\2\u066f\u0672\5\u0104\u0083\2\u0670\u0672\5\u0106\u0084\2\u0671\u066e"+
		"\3\2\2\2\u0671\u066f\3\2\2\2\u0671\u0670\3\2\2\2\u0672\u0101\3\2\2\2\u0673"+
		"\u0674\7`\2\2\u0674\u0675\5Z.\2\u0675\u0676\7\37\2\2\u0676\u0677\5^\60"+
		"\2\u0677\u0678\7 \2\2\u0678\u0103\3\2\2\2\u0679\u067a\7`\2\2\u067a\u067b"+
		"\5\u00d4k\2\u067b\u0105\3\2\2\2\u067c\u067d\7`\2\2\u067d\u067e\7\u0179"+
		"\2\2\u067e\u0107\3\2\2\2\u067f\u0681\7\u00c5\2\2\u0680\u0682\5\u010a\u0086"+
		"\2\u0681\u0680\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0109\3\2\2\2\u0683\u0684"+
		"\7L\2\2\u0684\u0685\7\37\2\2\u0685\u0686\7\u0152\2\2\u0686\u0687\7\30"+
		"\2\2\u0687\u0688\7\u017a\2\2\u0688\u0689\7 \2\2\u0689\u010b\3\2\2\2\u068a"+
		"\u068b\7B\2\2\u068b\u068d\7C\2\2\u068c\u068a\3\2\2\2\u068c\u068d\3\2\2"+
		"\2\u068d\u068e\3\2\2\2\u068e\u068f\7\u00bc\2\2\u068f\u0690\5\\/\2\u0690"+
		"\u0691\7\37\2\2\u0691\u0692\5^\60\2\u0692\u0696\7 \2\2\u0693\u0695\5\u010e"+
		"\u0088\2\u0694\u0693\3\2\2\2\u0695\u0698\3\2\2\2\u0696\u0694\3\2\2\2\u0696"+
		"\u0697\3\2\2\2\u0697\u010d\3\2\2\2\u0698\u0696\3\2\2\2\u0699\u069a\7`"+
		"\2\2\u069a\u069b\t\33\2\2\u069b\u06a0\5\u0110\u0089\2\u069c\u069d\7i\2"+
		"\2\u069d\u069e\7d\2\2\u069e\u06a0\7\u00f6\2\2\u069f\u0699\3\2\2\2\u069f"+
		"\u069c\3\2\2\2\u06a0\u010f\3\2\2\2\u06a1\u06a2\7\u00b9\2\2\u06a2\u06a7"+
		"\7\u00c1\2\2\u06a3\u06a7\7\u00b6\2\2\u06a4\u06a5\7;\2\2\u06a5\u06a7\t"+
		"\34\2\2\u06a6\u06a1\3\2\2\2\u06a6\u06a3\3\2\2\2\u06a6\u06a4\3\2\2\2\u06a7"+
		"\u0111\3\2\2\2\u06a8\u06ac\7\u00b7\2\2\u06a9\u06aa\7i\2\2\u06aa\u06ab"+
		"\7d\2\2\u06ab\u06ad\7\u00f6\2\2\u06ac\u06a9\3\2\2\2\u06ac\u06ad\3\2\2"+
		"\2\u06ad\u06ae\3\2\2\2\u06ae\u06af\7\37\2\2\u06af\u06b0\5p9\2\u06b0\u06b1"+
		"\7 \2\2\u06b1\u0113\3\2\2\2\u06b2\u06b3\7>\2\2\u06b3\u06b5\5h\65\2\u06b4"+
		"\u06b6\5\u00fc\177\2\u06b5\u06b4\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b8"+
		"\3\2\2\2\u06b7\u06b9\5\u0116\u008c\2\u06b8\u06b7\3\2\2\2\u06b8\u06b9\3"+
		"\2\2\2\u06b9\u06bb\3\2\2\2\u06ba\u06bc\5\u0118\u008d\2\u06bb\u06ba\3\2"+
		"\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06be\3\2\2\2\u06bd\u06bf\5\u011c\u008f"+
		"\2\u06be\u06bd\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u0115\3\2\2\2\u06c0\u06c1"+
		"\7L\2\2\u06c1\u06c2\7\37\2\2\u06c2\u06c7\5\u00bc_\2\u06c3\u06c4\7%\2\2"+
		"\u06c4\u06c6\5\u00bc_\2\u06c5\u06c3\3\2\2\2\u06c6\u06c9\3\2\2\2\u06c7"+
		"\u06c5\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06ca\3\2\2\2\u06c9\u06c7\3\2"+
		"\2\2\u06ca\u06cb\7 \2\2\u06cb\u0117\3\2\2\2\u06cc\u06d0\5\u0102\u0082"+
		"\2\u06cd\u06d0\5\u0104\u0083\2\u06ce\u06d0\5\u011a\u008e\2\u06cf\u06cc"+
		"\3\2\2\2\u06cf\u06cd\3\2\2\2\u06cf\u06ce\3\2\2\2\u06d0\u0119\3\2\2\2\u06d1"+
		"\u06d2\7`\2\2\u06d2\u06d3\7\u0098\2\2\u06d3\u011b\3\2\2\2\u06d4\u06d8"+
		"\7\u016c\2\2\u06d5\u06d9\5\u00d4k\2\u06d6\u06d9\5Z.\2\u06d7\u06d9\7\u0179"+
		"\2\2\u06d8\u06d5\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d8\u06d7\3\2\2\2\u06d9"+
		"\u011d\3\2\2\2\u06da\u06df\5\u00f6|\2\u06db\u06dc\7%\2\2\u06dc\u06de\5"+
		"\u00f6|\2\u06dd\u06db\3\2\2\2\u06de\u06e1\3\2\2\2\u06df\u06dd\3\2\2\2"+
		"\u06df\u06e0\3\2\2\2\u06e0\u06e3\3\2\2\2\u06e1\u06df\3\2\2\2\u06e2\u06da"+
		"\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u011f\3\2\2\2\u06e4\u06e5\5^\60\2\u06e5"+
		"\u06e6\7_\2\2\u06e6\u06ec\5p9\2\u06e7\u06ea\7\u00f0\2\2\u06e8\u06e9\7"+
		"i\2\2\u06e9\u06eb\7j\2\2\u06ea\u06e8\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb"+
		"\u06ed\3\2\2\2\u06ec\u06e7\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ef\3\2"+
		"\2\2\u06ee\u06f0\5\u00f6|\2\u06ef\u06ee\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0"+
		"\u0121\3\2\2\2\u06f1\u06f2\5\u00d4k\2\u06f2\u06f3\7\u0178\2\2\u06f3\u06f4"+
		"\7\u0155\2\2\u06f4\u06f5\7d\2\2\u06f5\u06f6\7\u0151\2\2\u06f6\u0123\3"+
		"\2\2\2\u06f7\u06f8\7?\2\2\u06f8\u06fa\5\u00d4k\2\u06f9\u06f7\3\2\2\2\u06f9"+
		"\u06fa\3\2\2\2\u06fa\u06fe\3\2\2\2\u06fb\u06ff\5\u0126\u0094\2\u06fc\u06ff"+
		"\5\u0130\u0099\2\u06fd\u06ff\5\u0112\u008a\2\u06fe\u06fb\3\2\2\2\u06fe"+
		"\u06fc\3\2\2\2\u06fe\u06fd\3\2\2\2\u06ff\u0125\3\2\2\2\u0700\u0703\5\u0128"+
		"\u0095\2\u0701\u0704\5\u012a\u0096\2\u0702\u0704\5\u012c\u0097\2\u0703"+
		"\u0701\3\2\2\2\u0703\u0702\3\2\2\2\u0704\u0127\3\2\2\2\u0705\u0708\5n"+
		"8\2\u0706\u0708\7A\2\2\u0707\u0705\3\2\2\2\u0707\u0706\3\2\2\2\u0708\u0129"+
		"\3\2\2\2\u0709\u070b\5\u00fc\177\2\u070a\u0709\3\2\2\2\u070a\u070b\3\2"+
		"\2\2\u070b\u070c\3\2\2\2\u070c\u070e\5d\63\2\u070d\u070f\5\u00fe\u0080"+
		"\2\u070e\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0711\3\2\2\2\u0710\u0712"+
		"\5\u0100\u0081\2\u0711\u0710\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u012b\3"+
		"\2\2\2\u0713\u0716\7\u00c6\2\2\u0714\u0717\5d\63\2\u0715\u0717\5\u012e"+
		"\u0098\2\u0716\u0714\3\2\2\2\u0716\u0715\3\2\2\2\u0717\u012d\3\2\2\2\u0718"+
		"\u0719\7\u00dc\2\2\u0719\u071a\5d\63\2\u071a\u071b\5\u010a\u0086\2\u071b"+
		"\u012f\3\2\2\2\u071c\u071d\7B\2\2\u071d\u071f\7C\2\2\u071e\u071c\3\2\2"+
		"\2\u071e\u071f\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0721\5d\63\2\u0721\u0722"+
		"\7\u00bc\2\2\u0722\u0723\5\\/\2\u0723\u0727\5d\63\2\u0724\u0726\5\u010e"+
		"\u0088\2\u0725\u0724\3\2\2\2\u0726\u0729\3\2\2\2\u0727\u0725\3\2\2\2\u0727"+
		"\u0728\3\2\2\2\u0728\u0131\3\2\2\2\u0729\u0727\3\2\2\2\u072a\u072b\7>"+
		"\2\2\u072b\u072c\5h\65\2\u072c\u072f\5\u0134\u009b\2\u072d\u072e\7L\2"+
		"\2\u072e\u0730\5\u0136\u009c\2\u072f\u072d\3\2\2\2\u072f\u0730\3\2\2\2"+
		"\u0730\u0732\3\2\2\2\u0731\u0733\5\u0118\u008d\2\u0732\u0731\3\2\2\2\u0732"+
		"\u0733\3\2\2\2\u0733\u0735\3\2\2\2\u0734\u0736\5\u011c\u008f\2\u0735\u0734"+
		"\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0133\3\2\2\2\u0737\u0739\5\u00fc\177"+
		"\2\u0738\u0737\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u0743"+
		"\5d\63\2\u073b\u073c\7\u00c5\2\2\u073c\u0743\7\u00c8\2\2\u073d\u073f\7"+
		"\u00c6\2\2\u073e\u073d\3\2\2\2\u073e\u073f\3\2\2\2\u073f\u0740\3\2\2\2"+
		"\u0740\u0741\7\u00c8\2\2\u0741\u0743\5d\63\2\u0742\u0738\3\2\2\2\u0742"+
		"\u073b\3\2\2\2\u0742\u073e\3\2\2\2\u0743\u0135\3\2\2\2\u0744\u0745\7\37"+
		"\2\2\u0745\u074a\5\u00bc_\2\u0746\u0747\7%\2\2\u0747\u0749\5\u00bc_\2"+
		"\u0748\u0746\3\2\2\2\u0749\u074c\3\2\2\2\u074a\u0748\3\2\2\2\u074a\u074b"+
		"\3\2\2\2\u074b\u074d\3\2\2\2\u074c\u074a\3\2\2\2\u074d\u074e\7 \2\2\u074e"+
		"\u0137\3\2\2\2\u074f\u0750\7\u00ef\2\2\u0750\u0751\7d\2\2\u0751\u0752"+
		"\7\u015b\2\2\u0752\u0753\7\37\2\2\u0753\u0754\5^\60\2\u0754\u0755\7%\2"+
		"\2\u0755\u0756\5^\60\2\u0756\u0757\7 \2\2\u0757\u0139\3\2\2\2\u0758\u0760"+
		"\7`\2\2\u0759\u075a\5Z.\2\u075a\u075b\7\37\2\2\u075b\u075c\5^\60\2\u075c"+
		"\u075d\7 \2\2\u075d\u0761\3\2\2\2\u075e\u0761\5\u00d4k\2\u075f\u0761\7"+
		"\u0179\2\2\u0760\u0759\3\2\2\2\u0760\u075e\3\2\2\2\u0760\u075f\3\2\2\2"+
		"\u0761\u0763\3\2\2\2\u0762\u0758\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u013b"+
		"\3\2\2\2\u0764\u0767\7\u015d\2\2\u0765\u0768\5\u00d4k\2\u0766\u0768\7"+
		"\u0179\2\2\u0767\u0765\3\2\2\2\u0767\u0766\3\2\2\2\u0768\u076a\3\2\2\2"+
		"\u0769\u0764\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u0772\3\2\2\2\u076b\u076c"+
		"\7\u016c\2\2\u076c\u0771\5Z.\2\u076d\u076e\5\u00d4k\2\u076e\u076f\7\u0179"+
		"\2\2\u076f\u0771\3\2\2\2\u0770\u076b\3\2\2\2\u0770\u076d\3\2\2\2\u0771"+
		"\u0773\3\2\2\2\u0772\u0770\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0776\3\2"+
		"\2\2\u0774\u0775\7L\2\2\u0775\u0777\5\u013e\u00a0\2\u0776\u0774\3\2\2"+
		"\2\u0776\u0777\3\2\2\2\u0777\u013d\3\2\2\2\u0778\u0779\7\37\2\2\u0779"+
		"\u077e\5\u0140\u00a1\2\u077a\u077b\7%\2\2\u077b\u077d\5\u0140\u00a1\2"+
		"\u077c\u077a\3\2\2\2\u077d\u0780\3\2\2\2\u077e\u077c\3\2\2\2\u077e\u077f"+
		"\3\2\2\2\u077f\u0781\3\2\2\2\u0780\u077e\3\2\2\2\u0781\u0782\7 \2\2\u0782"+
		"\u013f\3\2\2\2\u0783\u0784\7\u0158\2\2\u0784\u0785\7\30\2\2\u0785\u078c"+
		"\t\35\2\2\u0786\u0787\7`\2\2\u0787\u0788\7\u00af\2\2\u0788\u0789\7\37"+
		"\2\2\u0789\u078a\5\u00caf\2\u078a\u078b\7 \2\2\u078b\u078d\3\2\2\2\u078c"+
		"\u0786\3\2\2\2\u078c\u078d\3\2\2\2\u078d\u07b4\3\2\2\2\u078e\u078f\7\u016e"+
		"\2\2\u078f\u0790\7\30\2\2\u0790\u07b4\5\u00d4k\2\u0791\u0792\7\u016d\2"+
		"\2\u0792\u0795\7\30\2\2\u0793\u0796\5j\66\2\u0794\u0796\7\u0157\2\2\u0795"+
		"\u0793\3\2\2\2\u0795\u0794\3\2\2\2\u0796\u07b4\3\2\2\2\u0797\u0798\7\u0170"+
		"\2\2\u0798\u0799\7\30\2\2\u0799\u07b4\5\u00d4k\2\u079a\u079b\7\u0171\2"+
		"\2\u079b\u079c\7\30\2\2\u079c\u07b4\5\u00d4k\2\u079d\u079e\7\u016f\2\2"+
		"\u079e\u079f\7\30\2\2\u079f\u07b4\5\u00d4k\2\u07a0\u07a1\7\u015c\2\2\u07a1"+
		"\u07a2\7\30\2\2\u07a2\u07a4\7`\2\2\u07a3\u07a5\5\u0198\u00cd\2\u07a4\u07a3"+
		"\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u07b4\3\2\2\2\u07a6\u07a7\7\u016b\2"+
		"\2\u07a7\u07ae\7\30\2\2\u07a8\u07aa\7`\2\2\u07a9\u07ab\5\u0142\u00a2\2"+
		"\u07aa\u07a9\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07af\3\2\2\2\u07ac\u07ad"+
		"\7\u00ea\2\2\u07ad\u07af\5\u0146\u00a4\2\u07ae\u07a8\3\2\2\2\u07ae\u07ac"+
		"\3\2\2\2\u07af\u07b4\3\2\2\2\u07b0\u07b4\5\u0148\u00a5\2\u07b1\u07b4\5"+
		"\u014a\u00a6\2\u07b2\u07b4\5\u014c\u00a7\2\u07b3\u0783\3\2\2\2\u07b3\u078e"+
		"\3\2\2\2\u07b3\u0791\3\2\2\2\u07b3\u0797\3\2\2\2\u07b3\u079a\3\2\2\2\u07b3"+
		"\u079d\3\2\2\2\u07b3\u07a0\3\2\2\2\u07b3\u07a6\3\2\2\2\u07b3\u07b0\3\2"+
		"\2\2\u07b3\u07b1\3\2\2\2\u07b3\u07b2\3\2\2\2\u07b4\u0141\3\2\2\2\u07b5"+
		"\u07b6\7\37\2\2\u07b6\u07bb\5\u0142\u00a2\2\u07b7\u07b8\7%\2\2\u07b8\u07ba"+
		"\5\u0142\u00a2\2\u07b9\u07b7\3\2\2\2\u07ba\u07bd\3\2\2\2\u07bb\u07b9\3"+
		"\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07be\3\2\2\2\u07bd\u07bb\3\2\2\2\u07be"+
		"\u07bf\7 \2\2\u07bf\u0143\3\2\2\2\u07c0\u07c1\7\u0172\2\2\u07c1\u07c4"+
		"\7\30\2\2\u07c2\u07c5\7j\2\2\u07c3\u07c5\5\u0080A\2\u07c4\u07c2\3\2\2"+
		"\2\u07c4\u07c3\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u07c8\7%\2\2\u07c7\u07c0"+
		"\3\2\2\2\u07c7\u07c8\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07ca\7\u0169\2"+
		"\2\u07ca\u07cb\7\30\2\2\u07cb\u07cc\t\36\2\2\u07cc\u0145\3\2\2\2\u07cd"+
		"\u07ce\7\37\2\2\u07ce\u07cf\7\u0169\2\2\u07cf\u07d0\7\30\2\2\u07d0\u07d1"+
		"\7\u00ee\2\2\u07d1\u07d2\7 \2\2\u07d2\u0147\3\2\2\2\u07d3\u07d4\7\u0168"+
		"\2\2\u07d4\u07d5\7\30\2\2\u07d5\u07e0\7`\2\2\u07d6\u07d7\7\u00d5\2\2\u07d7"+
		"\u07d8\7\30\2\2\u07d8\u07e0\t\37\2\2\u07d9\u07da\7\u015c\2\2\u07da\u07db"+
		"\7\30\2\2\u07db\u07dd\7`\2\2\u07dc\u07de\5\u0198\u00cd\2\u07dd\u07dc\3"+
		"\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07e0\3\2\2\2\u07df\u07d3\3\2\2\2\u07df"+
		"\u07d6\3\2\2\2\u07df\u07d9\3\2\2\2\u07e0\u0149\3\2\2\2\u07e1\u07e2\7\u00d3"+
		"\2\2\u07e2\u07ea\7\30\2\2\u07e3\u07e4\7\u00dc\2\2\u07e4\u07e5\7\37\2\2"+
		"\u07e5\u07e6\5^\60\2\u07e6\u07e7\7 \2\2\u07e7\u07eb\3\2\2\2\u07e8\u07eb"+
		"\7\u0161\2\2\u07e9\u07eb\7\u00f5\2\2\u07ea\u07e3\3\2\2\2\u07ea\u07e8\3"+
		"\2\2\2\u07ea\u07e9\3\2\2\2\u07eb\u014b\3\2\2\2\u07ec\u07ed\7\u00c5\2\2"+
		"\u07ed\u07ee\7\u00c8\2\2\u07ee\u07f2\7>\2\2\u07ef\u07f2\7\u00dd\2\2\u07f0"+
		"\u07f2\5\u014e\u00a8\2\u07f1\u07ec\3\2\2\2\u07f1\u07ef\3\2\2\2\u07f1\u07f0"+
		"\3\2\2\2\u07f2\u014d\3\2\2\2\u07f3\u07f4\7\u00ae\2\2\u07f4\u07f5\7\37"+
		"\2\2\u07f5\u07f6\5^\60\2\u07f6\u07f8\7\u00f3\2\2\u07f7\u07f9\t \2\2\u07f8"+
		"\u07f7\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fb\7d"+
		"\2\2\u07fb\u07fc\7K\2\2\u07fc\u07fd\7\37\2\2\u07fd\u0802\5~@\2\u07fe\u07ff"+
		"\7%\2\2\u07ff\u0801\5~@\2\u0800\u07fe\3\2\2\2\u0801\u0804\3\2\2\2\u0802"+
		"\u0800\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0805\3\2\2\2\u0804\u0802\3\2"+
		"\2\2\u0805\u0806\7 \2\2\u0806\u0807\7 \2\2\u0807\u014f\3\2\2\2\u0808\u080a"+
		"\7A\2\2\u0809\u0808\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u080c\3\2\2\2\u080b"+
		"\u080d\5\u00fc\177\2\u080c\u080b\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u0151"+
		"\3\2\2\2\u080e\u0818\5\u0154\u00ab\2\u080f\u0818\5\u0158\u00ad\2\u0810"+
		"\u0818\5\u0168\u00b5\2\u0811\u0818\5\u0178\u00bd\2\u0812\u0818\5\u017a"+
		"\u00be\2\u0813\u0818\5\u017c\u00bf\2\u0814\u0818\5\u017e\u00c0\2\u0815"+
		"\u0818\5\u0196\u00cc\2\u0816\u0818\7\u00f4\2\2\u0817\u080e\3\2\2\2\u0817"+
		"\u080f\3\2\2\2\u0817\u0810\3\2\2\2\u0817\u0811\3\2\2\2\u0817\u0812\3\2"+
		"\2\2\u0817\u0813\3\2\2\2\u0817\u0814\3\2\2\2\u0817\u0815\3\2\2\2\u0817"+
		"\u0816\3\2\2\2\u0818\u0153\3\2\2\2\u0819\u081a\5\u0156\u00ac\2\u081a\u081d"+
		"\5\u009eP\2\u081b\u081c\7\u00c7\2\2\u081c\u081e\5j\66\2\u081d\u081b\3"+
		"\2\2\2\u081d\u081e\3\2\2\2\u081e\u0822\3\2\2\2\u081f\u0823\7j\2\2\u0820"+
		"\u0821\7i\2\2\u0821\u0823\7j\2\2\u0822\u081f\3\2\2\2\u0822\u0820\3\2\2"+
		"\2\u0822\u0823\3\2\2\2\u0823\u0825\3\2\2\2\u0824\u0826\7\u00fb\2\2\u0825"+
		"\u0824\3\2\2\2\u0825\u0826\3\2\2\2\u0826\u0155\3\2\2\2\u0827\u0828\7\64"+
		"\2\2\u0828\u0829\7=\2\2\u0829\u082a\5^\60\2\u082a\u0157\3\2\2\2\u082b"+
		"\u082c\7L\2\2\u082c\u082e\t!\2\2\u082d\u082b\3\2\2\2\u082d\u082e\3\2\2"+
		"\2\u082e\u082f\3\2\2\2\u082f\u0832\7:\2\2\u0830\u0833\5\u015a\u00ae\2"+
		"\u0831\u0833\5\u0162\u00b2\2\u0832\u0830\3\2\2\2\u0832\u0831\3\2\2\2\u0833"+
		"\u0159\3\2\2\2\u0834\u0839\5\u015c\u00af\2\u0835\u0836\7%\2\2\u0836\u0838"+
		"\5\u015c\u00af\2\u0837\u0835\3\2\2\2\u0838\u083b\3\2\2\2\u0839\u0837\3"+
		"\2\2\2\u0839\u083a\3\2\2\2\u083a\u015b\3\2\2\2\u083b\u0839\3\2\2\2\u083c"+
		"\u0843\5\u00f0y\2\u083d\u0843\5\u0120\u0091\2\u083e\u0843\5\u0122\u0092"+
		"\2\u083f\u0843\5\u0124\u0093\2\u0840\u0843\5\u018c\u00c7\2\u0841\u0843"+
		"\5\u015e\u00b0\2\u0842\u083c\3\2\2\2\u0842\u083d\3\2\2\2\u0842\u083e\3"+
		"\2\2\2\u0842\u083f\3\2\2\2\u0842\u0840\3\2\2\2\u0842\u0841\3\2\2\2\u0843"+
		"\u015d\3\2\2\2\u0844\u0845\7?\2\2\u0845\u0847\5\u00d4k\2\u0846\u0844\3"+
		"\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u0849\7\u0098\2\2"+
		"\u0849\u084a\5~@\2\u084a\u084b\7d\2\2\u084b\u084c\5^\60\2\u084c\u015f"+
		"\3\2\2\2\u084d\u084e\7\37\2\2\u084e\u0853\5\u00ba^\2\u084f\u0850\7%\2"+
		"\2\u0850\u0852\5\u00ba^\2\u0851\u084f\3\2\2\2\u0852\u0855\3\2\2\2\u0853"+
		"\u0851\3\2\2\2\u0853\u0854\3\2\2\2\u0854\u0856\3\2\2\2\u0855\u0853\3\2"+
		"\2\2\u0856\u0857\7 \2\2\u0857\u0161\3\2\2\2\u0858\u0859\5\u0164\u00b3"+
		"\2\u0859\u085a\7%\2\2\u085a\u085b\5\u0138\u009d\2\u085b\u0861\3\2\2\2"+
		"\u085c\u085d\5\u0138\u009d\2\u085d\u085e\7%\2\2\u085e\u085f\5\u0164\u00b3"+
		"\2\u085f\u0861\3\2\2\2\u0860\u0858\3\2\2\2\u0860\u085c\3\2\2\2\u0861\u0163"+
		"\3\2\2\2\u0862\u0863\5\u0166\u00b4\2\u0863\u0864\7\u0098\2\2\u0864\u0867"+
		"\5~@\2\u0865\u0866\7L\2\2\u0866\u0868\7K\2\2\u0867\u0865\3\2\2\2\u0867"+
		"\u0868\3\2\2\2\u0868\u0869\3\2\2\2\u0869\u086a\7%\2\2\u086a\u086b\5\u0166"+
		"\u00b4\2\u086b\u0165\3\2\2\2\u086c\u086d\5^\60\2\u086d\u086e\5\u00a0Q"+
		"\2\u086e\u086f\7\u00b8\2\2\u086f\u0870\7\u00b5\2\2\u0870\u0871\7_\2\2"+
		"\u0871\u0873\7\u00b1\2\2\u0872\u0874\t\30\2\2\u0873\u0872\3\2\2\2\u0873"+
		"\u0874\3\2\2\2\u0874\u0876\3\2\2\2\u0875\u0877\7\u00ac\2\2\u0876\u0875"+
		"\3\2\2\2\u0876\u0877\3\2\2\2\u0877\u087a\3\2\2\2\u0878\u0879\7i\2\2\u0879"+
		"\u087b\7j\2\2\u087a\u0878\3\2\2\2\u087a\u087b\3\2\2\2\u087b\u087e\3\2"+
		"\2\2\u087c\u087d\7?\2\2\u087d\u087f\5\u00d4k\2\u087e\u087c\3\2\2\2\u087e"+
		"\u087f\3\2\2\2\u087f\u0167\3\2\2\2\u0880\u0887\7\65\2\2\u0881\u0888\5"+
		"\u016a\u00b6\2\u0882\u0888\5\u0174\u00bb\2\u0883\u0888\5\u0176\u00bc\2"+
		"\u0884\u0885\7\u00ef\2\2\u0885\u0886\7d\2\2\u0886\u0888\7\u015b\2\2\u0887"+
		"\u0881\3\2\2\2\u0887\u0882\3\2\2\2\u0887\u0883\3\2\2\2\u0887\u0884\3\2"+
		"\2\2\u0888\u0169\3\2\2\2\u0889\u088b\7?\2\2\u088a\u0889\3\2\2\2\u088a"+
		"\u088b\3\2\2\2\u088b\u088d\3\2\2\2\u088c\u088e\5\u019a\u00ce\2\u088d\u088c"+
		"\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u088f\3\2\2\2\u088f\u0894\5\u016c\u00b7"+
		"\2\u0890\u0891\7%\2\2\u0891\u0893\5\u016c\u00b7\2\u0892\u0890\3\2\2\2"+
		"\u0893\u0896\3\2\2\2\u0894\u0892\3\2\2\2\u0894\u0895\3\2\2\2\u0895\u016b"+
		"\3\2\2\2\u0896\u0894\3\2\2\2\u0897\u0899\5\u00d4k\2\u0898\u089a\5\u016e"+
		"\u00b8\2\u0899\u0898\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u016d\3\2\2\2\u089b"+
		"\u089c\7L\2\2\u089c\u089d\7\37\2\2\u089d\u08a2\5\u0170\u00b9\2\u089e\u089f"+
		"\7%\2\2\u089f\u08a1\5\u0170\u00b9\2\u08a0\u089e\3\2\2\2\u08a1\u08a4\3"+
		"\2\2\2\u08a2\u08a0\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u08a5\3\2\2\2\u08a4"+
		"\u08a2\3\2\2\2\u08a5\u08a6\7 \2\2\u08a6\u016f\3\2\2\2\u08a7\u08a8\7\u00e5"+
		"\2\2\u08a8\u08a9\7\30\2\2\u08a9\u08b9\7\u017a\2\2\u08aa\u08ab\7\u00eb"+
		"\2\2\u08ab\u08ac\7\30\2\2\u08ac\u08b9\5\u0172\u00ba\2\u08ad\u08ae\7\u00e6"+
		"\2\2\u08ae\u08b6\7e\2\2\u08af\u08b0\5Z.\2\u08b0\u08b1\7\37\2\2\u08b1\u08b2"+
		"\5^\60\2\u08b2\u08b3\7 \2\2\u08b3\u08b7\3\2\2\2\u08b4\u08b7\5\u00d4k\2"+
		"\u08b5\u08b7\7\u0179\2\2\u08b6\u08af\3\2\2\2\u08b6\u08b4\3\2\2\2\u08b6"+
		"\u08b5\3\2\2\2\u08b7\u08b9\3\2\2\2\u08b8\u08a7\3\2\2\2\u08b8\u08aa\3\2"+
		"\2\2\u08b8\u08ad\3\2\2\2\u08b9\u0171\3\2\2\2\u08ba\u08bb\t\26\2\2\u08bb"+
		"\u0173\3\2\2\2\u08bc\u08be\7=\2\2\u08bd\u08bf\5\u019a\u00ce\2\u08be\u08bd"+
		"\3\2\2\2\u08be\u08bf\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u08c5\5^\60\2\u08c1"+
		"\u08c2\7%\2\2\u08c2\u08c4\5^\60\2\u08c3\u08c1\3\2\2\2\u08c4\u08c7\3\2"+
		"\2\2\u08c5\u08c3\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6\u0175\3\2\2\2\u08c7"+
		"\u08c5\3\2\2\2\u08c8\u08ca\7>\2\2\u08c9\u08cb\5\u019a\u00ce\2\u08ca\u08c9"+
		"\3\2\2\2\u08ca\u08cb\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc\u08d1\5h\65\2\u08cd"+
		"\u08ce\7%\2\2\u08ce\u08d0\5h\65\2\u08cf\u08cd\3\2\2\2\u08d0\u08d3\3\2"+
		"\2\2\u08d1\u08cf\3\2\2\2\u08d1\u08d2\3\2\2\2\u08d2\u0177\3\2\2\2\u08d3"+
		"\u08d1\3\2\2\2\u08d4\u08d6\7L\2\2\u08d5\u08d4\3\2\2\2\u08d5\u08d6\3\2"+
		"\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d8\t!\2\2\u08d8\u08db\7?\2\2\u08d9\u08dc"+
		"\7p\2\2\u08da\u08dc\5\u00d6l\2\u08db\u08d9\3\2\2\2\u08db\u08da\3\2\2\2"+
		"\u08dc\u0179\3\2\2\2\u08dd\u08de\t\"\2\2\u08de\u08e1\7G\2\2\u08df\u08e2"+
		"\7p\2\2\u08e0\u08e2\5\u00d6l\2\u08e1\u08df\3\2\2\2\u08e1\u08e0\3\2\2\2"+
		"\u08e2\u017b\3\2\2\2\u08e3\u08e6\7\u00fc\2\2\u08e4\u08e5\7\u00ae\2\2\u08e5"+
		"\u08e7\5p9\2\u08e6\u08e4\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u08e8\3\2\2"+
		"\2\u08e8\u08e9\7e\2\2\u08e9\u08ec\5\\/\2\u08ea\u08eb\7\u00ae\2\2\u08eb"+
		"\u08ed\5p9\2\u08ec\u08ea\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u08f3\3\2\2"+
		"\2\u08ee\u08ef\7L\2\2\u08ef\u08f0\7\37\2\2\u08f0\u08f1\5\u00d0i\2\u08f1"+
		"\u08f2\7 \2\2\u08f2\u08f4\3\2\2\2\u08f3\u08ee\3\2\2\2\u08f3\u08f4\3\2"+
		"\2\2\u08f4\u017d\3\2\2\2\u08f5\u08f6\7;\2\2\u08f6\u08f9\7\37\2\2\u08f7"+
		"\u08fa\5\u0180\u00c1\2\u08f8\u08fa\5\u0182\u00c2\2\u08f9\u08f7\3\2\2\2"+
		"\u08f9\u08f8\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u08fc\7 \2\2\u08fc\u017f"+
		"\3\2\2\2\u08fd\u08fe\7\u016c\2\2\u08fe\u0902\7\30\2\2\u08ff\u0903\5Z."+
		"\2\u0900\u0903\5\u00d4k\2\u0901\u0903\7\u0179\2\2\u0902\u08ff\3\2\2\2"+
		"\u0902\u0900\3\2\2\2\u0902\u0901\3\2\2\2\u0903\u0181\3\2\2\2\u0904\u0905"+
		"\7\u015c\2\2\u0905\u090b\7\30\2\2\u0906\u090c\7\u00ea\2\2\u0907\u0909"+
		"\7`\2\2\u0908\u090a\5\u0184\u00c3\2\u0909\u0908\3\2\2\2\u0909\u090a\3"+
		"\2\2\2\u090a\u090c\3\2\2\2\u090b\u0906\3\2\2\2\u090b\u0907\3\2\2\2\u090c"+
		"\u0183\3\2\2\2\u090d\u0911\7\37\2\2\u090e\u090f\7\u0174\2\2\u090f\u0910"+
		"\7\30\2\2\u0910\u0912\5\\/\2\u0911\u090e\3\2\2\2\u0911\u0912\3\2\2\2\u0912"+
		"\u0914\3\2\2\2\u0913\u0915\5\u0186\u00c4\2\u0914\u0913\3\2\2\2\u0914\u0915"+
		"\3\2\2\2\u0915\u0917\3\2\2\2\u0916\u0918\5\u0188\u00c5\2\u0917\u0916\3"+
		"\2\2\2\u0917\u0918\3\2\2\2\u0918\u0919\3\2\2\2\u0919\u091a\7 \2\2\u091a"+
		"\u0185\3\2\2\2\u091b\u091d\7%\2\2\u091c\u091b\3\2\2\2\u091c\u091d\3\2"+
		"\2\2\u091d\u091e\3\2\2\2\u091e\u091f\7\u0159\2\2\u091f\u0920\7\30\2\2"+
		"\u0920\u0921\5\u0172\u00ba\2\u0921\u0187\3\2\2\2\u0922\u0924\7%\2\2\u0923"+
		"\u0922\3\2\2\2\u0923\u0924\3\2\2\2\u0924\u0925\3\2\2\2\u0925\u0926\7\u0173"+
		"\2\2\u0926\u0927\7\30\2\2\u0927\u0928\5\u018a\u00c6\2\u0928\u0189\3\2"+
		"\2\2\u0929\u092d\7\u00e2\2\2\u092a\u092b\7\u017a\2\2\u092b\u092d\t#\2"+
		"\2\u092c\u0929\3\2\2\2\u092c\u092a\3\2\2\2\u092d\u018b\3\2\2\2\u092e\u0931"+
		"\5\u018e\u00c8\2\u092f\u0932\5\u0190\u00c9\2\u0930\u0932\5\u0194\u00cb"+
		"\2\u0931\u092f\3\2\2\2\u0931\u0930\3\2\2\2\u0932\u018d\3\2\2\2\u0933\u0934"+
		"\7>\2\2\u0934\u0935\5h\65\2\u0935\u018f\3\2\2\2\u0936\u093c\7\u00c6\2"+
		"\2\u0937\u093d\5\u012e\u0098\2\u0938\u093a\5\u0160\u00b1\2\u0939\u093b"+
		"\5\u0192\u00ca\2\u093a\u0939\3\2\2\2\u093a\u093b\3\2\2\2\u093b\u093d\3"+
		"\2\2\2\u093c\u0937\3\2\2\2\u093c\u0938\3\2\2\2\u093d\u0191\3\2\2\2\u093e"+
		"\u093f\7`\2\2\u093f\u0942\5\u00d4k\2\u0940\u0942\7\u0098\2\2\u0941\u093e"+
		"\3\2\2\2\u0941\u0940\3\2\2\2\u0942\u0193\3\2\2\2\u0943\u0944\7\u00c5\2"+
		"\2\u0944\u094c\7\u00c8\2\2\u0945\u0946\7L\2\2\u0946\u0947\7\u0156\2\2"+
		"\u0947\u0948\7\30\2\2\u0948\u094a\7\u017a\2\2\u0949\u094b\7\u00d0\2\2"+
		"\u094a\u0949\3\2\2\2\u094a";
	private static final String _serializedATNSegment1 =
		"\u094b\3\2\2\2\u094b\u094d\3\2\2\2\u094c\u0945\3\2\2\2\u094c\u094d\3\2"+
		"\2\2\u094d\u094f\3\2\2\2\u094e\u0950\5\u0118\u008d\2\u094f\u094e\3\2\2"+
		"\2\u094f\u0950\3\2\2\2\u0950\u0195\3\2\2\2\u0951\u0952\7;\2\2\u0952\u0953"+
		"\7\37\2\2\u0953\u0954\7\u0175\2\2\u0954\u0955\7\30\2\2\u0955\u0956\t$"+
		"\2\2\u0956\u0964\7 \2\2\u0957\u0958\7\u0168\2\2\u0958\u0959\7\30\2\2\u0959"+
		"\u0964\7`\2\2\u095a\u095b\7\u00d5\2\2\u095b\u095c\7\30\2\2\u095c\u0964"+
		"\t\37\2\2\u095d\u095e\7\u015c\2\2\u095e\u095f\7\30\2\2\u095f\u0961\7`"+
		"\2\2\u0960\u0962\5\u0198\u00cd\2\u0961\u0960\3\2\2\2\u0961\u0962\3\2\2"+
		"\2\u0962\u0964\3\2\2\2\u0963\u0951\3\2\2\2\u0963\u0957\3\2\2\2\u0963\u095a"+
		"\3\2\2\2\u0963\u095d\3\2\2\2\u0964\u0197\3\2\2\2\u0965\u0966\7\37\2\2"+
		"\u0966\u0967\7\u0174\2\2\u0967\u0968\7\30\2\2\u0968\u096d\5\\/\2\u0969"+
		"\u096a\7%\2\2\u096a\u096b\7\u0159\2\2\u096b\u096c\7\30\2\2\u096c\u096e"+
		"\5\u0172\u00ba\2\u096d\u0969\3\2\2\2\u096d\u096e\3\2\2\2\u096e\u096f\3"+
		"\2\2\2\u096f\u0970\7 \2\2\u0970\u0199\3\2\2\2\u0971\u0972\7a\2\2\u0972"+
		"\u0973\7m\2\2\u0973\u019b\3\2\2\2\u0974\u0975\7;\2\2\u0975\u0976\7\u00c0"+
		"\2\2\u0976\u019d\3\2\2\2\u0977\u0978\7a\2\2\u0978\u0979\7*\2\2\u0979\u097a"+
		"\7*\2\2\u097a\u097b\7\u00fe\2\2\u097b\u097c\7\32\2\2\u097c\u097d\7\u017a"+
		"\2\2\u097d\u097e\7|\2\2\u097e\u0980\7\u00fd\2\2\u097f\u0977\3\2\2\2\u097f"+
		"\u0980\3\2\2\2\u0980\u0981\3\2\2\2\u0981\u0982\7;\2\2\u0982\u0983\7\u0166"+
		"\2\2\u0983\u0984\5\u01a0\u00d1\2\u0984\u019f\3\2\2\2\u0985\u0986\t\26"+
		"\2\2\u0986\u01a1\3\2\2\2\u0987\u0988\7{\2\2\u0988\u0989\t%\2\2\u0989\u01a3"+
		"\3\2\2\2\u098a\u098b\7|\2\2\u098b\u01a5\3\2\2\2\u098c\u098d\7}\2\2\u098d"+
		"\u01a7\3\2\2\2\u098e\u098f\7\u00f9\2\2\u098f\u0990\t%\2\2\u0990\u01a9"+
		"\3\2\2\2\u0991\u0995\78\2\2\u0992\u0996\5\u01b0\u00d9\2\u0993\u0996\5"+
		"\u01b2\u00da\2\u0994\u0996\5\u01e2\u00f2\2\u0995\u0992\3\2\2\2\u0995\u0993"+
		"\3\2\2\2\u0995\u0994\3\2\2\2\u0996\u01ab\3\2\2\2\u0997\u099e\79\2\2\u0998"+
		"\u099a\5\u01b4\u00db\2\u0999\u0998\3\2\2\2\u0999\u099a\3\2\2\2\u099a\u099b"+
		"\3\2\2\2\u099b\u099f\5\u01b0\u00d9\2\u099c\u099f\5\u01b2\u00da\2\u099d"+
		"\u099f\5\u01e2\u00f2\2\u099e\u0999\3\2\2\2\u099e\u099c\3\2\2\2\u099e\u099d"+
		"\3\2\2\2\u099f\u01ad\3\2\2\2\u09a0\u09a3\7\u00d1\2\2\u09a1\u09a4\5\u01b0"+
		"\u00d9\2\u09a2\u09a4\5\u01b2\u00da\2\u09a3\u09a1\3\2\2\2\u09a3\u09a2\3"+
		"\2\2\2\u09a4\u01af\3\2\2\2\u09a5\u09a8\5\u01b6\u00dc\2\u09a6\u09a7\7`"+
		"\2\2\u09a7\u09a9\5\u01b8\u00dd\2\u09a8\u09a6\3\2\2\2\u09a8\u09a9\3\2\2"+
		"\2\u09a9\u01b1\3\2\2\2\u09aa\u09ad\5\u01ba\u00de\2\u09ab\u09ac\7`\2\2"+
		"\u09ac\u09ae\5\u01bc\u00df\2\u09ad\u09ab\3\2\2\2\u09ad\u09ae\3\2\2\2\u09ae"+
		"\u01b3\3\2\2\2\u09af\u09b0\78\2\2\u09b0\u09b1\7\u00ba\2\2\u09b1\u09b2"+
		"\7d\2\2\u09b2\u01b5\3\2\2\2\u09b3\u09b5\5\u01be\u00e0\2\u09b4\u09b6\5"+
		"d\63\2\u09b5\u09b4\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09be\3\2\2\2\u09b7"+
		"\u09b8\7%\2\2\u09b8\u09ba\5\u01be\u00e0\2\u09b9\u09bb\5d\63\2\u09ba\u09b9"+
		"\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb\u09bd\3\2\2\2\u09bc\u09b7\3\2\2\2\u09bd"+
		"\u09c0\3\2\2\2\u09be\u09bc\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf\u01b7\3\2"+
		"\2\2\u09c0\u09be\3\2\2\2\u09c1\u09c3\5\u01de\u00f0\2\u09c2\u09c1\3\2\2"+
		"\2\u09c2\u09c3\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c5\5\\/\2\u09c5\u01b9"+
		"\3\2\2\2\u09c6\u09cb\5\u01be\u00e0\2\u09c7\u09c8\7%\2\2\u09c8\u09ca\5"+
		"\u01be\u00e0\2\u09c9\u09c7\3\2\2\2\u09ca\u09cd\3\2\2\2\u09cb\u09c9\3\2"+
		"\2\2\u09cb\u09cc\3\2\2\2\u09cc\u01bb\3\2\2\2\u09cd\u09cb\3\2\2\2\u09ce"+
		"\u09d0\5\u01e0\u00f1\2\u09cf\u09ce\3\2\2\2\u09cf\u09d0\3\2\2\2\u09d0\u09d1"+
		"\3\2\2\2\u09d1\u09d2\5\\/\2\u09d2\u01bd\3\2\2\2\u09d3\u09d5\7p\2\2\u09d4"+
		"\u09d6\7\u00bb\2\2\u09d5\u09d4\3\2\2\2\u09d5\u09d6\3\2\2\2\u09d6\u09e7"+
		"\3\2\2\2\u09d7\u09e7\5\u01c0\u00e1\2\u09d8\u09e7\5\u01c2\u00e2\2\u09d9"+
		"\u09e7\5\u01c4\u00e3\2\u09da\u09e7\5\u01c6\u00e4\2\u09db\u09e7\5\u01c8"+
		"\u00e5\2\u09dc\u09e7\5\u01ca\u00e6\2\u09dd\u09e7\5\u01cc\u00e7\2\u09de"+
		"\u09e7\5\u01ce\u00e8\2\u09df\u09e7\5\u01d0\u00e9\2\u09e0\u09e7\5\u01d2"+
		"\u00ea\2\u09e1\u09e7\5\u01d4\u00eb\2\u09e2\u09e7\5\u01d6\u00ec\2\u09e3"+
		"\u09e7\5\u01d8\u00ed\2\u09e4\u09e7\5\u01da\u00ee\2\u09e5\u09e7\5\u01dc"+
		"\u00ef\2\u09e6\u09d3\3\2\2\2\u09e6\u09d7\3\2\2\2\u09e6\u09d8\3\2\2\2\u09e6"+
		"\u09d9\3\2\2\2\u09e6\u09da\3\2\2\2\u09e6\u09db\3\2\2\2\u09e6\u09dc\3\2"+
		"\2\2\u09e6\u09dd\3\2\2\2\u09e6\u09de\3\2\2\2\u09e6\u09df\3\2\2\2\u09e6"+
		"\u09e0\3\2\2\2\u09e6\u09e1\3\2\2\2\u09e6\u09e2\3\2\2\2\u09e6\u09e3\3\2"+
		"\2\2\u09e6\u09e4\3\2\2\2\u09e6\u09e5\3\2\2\2\u09e7\u01bf\3\2\2\2\u09e8"+
		"\u09ea\7\u0105\2\2\u09e9\u09eb\7\u010d\2\2\u09ea\u09e9\3\2\2\2\u09ea\u09eb"+
		"\3\2\2\2\u09eb\u09fc\3\2\2\2\u09ec\u09ed\7\u0106\2\2\u09ed\u09fc\7\u0107"+
		"\2\2\u09ee\u09fc\7\64\2\2\u09ef\u09f1\7I\2\2\u09f0\u09f2\7q\2\2\u09f1"+
		"\u09f0\3\2\2\2\u09f1\u09f2\3\2\2\2\u09f2\u09f3\3\2\2\2\u09f3\u09fc\7\u0108"+
		"\2\2\u09f4\u09fc\7\u00bc\2\2\u09f5\u09fc\7/\2\2\u09f6\u09fc\7\60\2\2\u09f7"+
		"\u09fc\7\61\2\2\u09f8\u09fc\7\62\2\2\u09f9\u09fc\7\u0100\2\2\u09fa\u09fc"+
		"\7\u010e\2\2\u09fb\u09e8\3\2\2\2\u09fb\u09ec\3\2\2\2\u09fb\u09ee\3\2\2"+
		"\2\u09fb\u09ef\3\2\2\2\u09fb\u09f4\3\2\2\2\u09fb\u09f5\3\2\2\2\u09fb\u09f6"+
		"\3\2\2\2\u09fb\u09f7\3\2\2\2\u09fb\u09f8\3\2\2\2\u09fb\u09f9\3\2\2\2\u09fb"+
		"\u09fa\3\2\2\2\u09fc\u01c1\3\2\2\2\u09fd\u09fe\7I\2\2\u09fe\u09ff\7\u010f"+
		"\2\2\u09ff\u0a00\7\u0111\2\2\u0a00\u01c3\3\2\2\2\u0a01\u0a07\7\64\2\2"+
		"\u0a02\u0a08\7\u0112\2\2\u0a03\u0a08\7\u0113\2\2\u0a04\u0a08\7\u0110\2"+
		"\2\u0a05\u0a06\7\u010d\2\2\u0a06\u0a08\7\u0114\2\2\u0a07\u0a02\3\2\2\2"+
		"\u0a07\u0a03\3\2\2\2\u0a07\u0a04\3\2\2\2\u0a07\u0a05\3\2\2\2\u0a08\u0a4d"+
		"\3\2\2\2\u0a09\u0a0a\7\64\2\2\u0a0a\u0a1c\7q\2\2\u0a0b\u0a0c\7\u0115\2"+
		"\2\u0a0c\u0a1d\7t\2\2\u0a0d\u0a1d\7\u0103\2\2\u0a0e\u0a1d\7\u0116\2\2"+
		"\u0a0f\u0a1d\7\u00cb\2\2\u0a10\u0a1d\7\u0117\2\2\u0a11\u0a12\7\u0118\2"+
		"\2\u0a12\u0a1d\7\u0119\2\2\u0a13\u0a14\7\u0118\2\2\u0a14\u0a1d\7\u0101"+
		"\2\2\u0a15\u0a16\7\u011a\2\2\u0a16\u0a1d\7\u010d\2\2\u0a17\u0a1d\7\u00e3"+
		"\2\2\u0a18\u0a19\7\u010d\2\2\u0a19\u0a1d\7\u011b\2\2\u0a1a\u0a1b\7\u010d"+
		"\2\2\u0a1b\u0a1d\7\u00be\2\2\u0a1c\u0a0b\3\2\2\2\u0a1c\u0a0d\3\2\2\2\u0a1c"+
		"\u0a0e\3\2\2\2\u0a1c\u0a0f\3\2\2\2\u0a1c\u0a10\3\2\2\2\u0a1c\u0a11\3\2"+
		"\2\2\u0a1c\u0a13\3\2\2\2\u0a1c\u0a15\3\2\2\2\u0a1c\u0a17\3\2\2\2\u0a1c"+
		"\u0a18\3\2\2\2\u0a1c\u0a1a\3\2\2\2\u0a1d\u0a4d\3\2\2\2\u0a1e\u0a2a\7\63"+
		"\2\2\u0a1f\u0a20\7\u0115\2\2\u0a20\u0a2b\7t\2\2\u0a21\u0a22\7\u011c\2"+
		"\2\u0a22\u0a23\7\u0118\2\2\u0a23\u0a2b\7\u0119\2\2\u0a24\u0a2b\7\u0117"+
		"\2\2\u0a25\u0a26\7\u010d\2\2\u0a26\u0a2b\7\u00be\2\2\u0a27\u0a28\7\u0110"+
		"\2\2\u0a28\u0a29\7\u0118\2\2\u0a29\u0a2b\7\u0119\2\2\u0a2a\u0a1f\3\2\2"+
		"\2\u0a2a\u0a21\3\2\2\2\u0a2a\u0a24\3\2\2\2\u0a2a\u0a25\3\2\2\2\u0a2a\u0a27"+
		"\3\2\2\2\u0a2b\u0a4d\3\2\2\2\u0a2c\u0a2d\7\63\2\2\u0a2d\u0a2e\7q\2\2\u0a2e"+
		"\u0a4d\7\u00cb\2\2\u0a2f\u0a30\7I\2\2\u0a30\u0a31\7\u010d\2\2\u0a31\u0a4d"+
		"\7\u0114\2\2\u0a32\u0a33\7I\2\2\u0a33\u0a34\7q\2\2\u0a34\u0a4d\t&\2\2"+
		"\u0a35\u0a36\7\u0102\2\2\u0a36\u0a37\7q\2\2\u0a37\u0a4d\7\u00cb\2\2\u0a38"+
		"\u0a39\7\u0102\2\2\u0a39\u0a4d\7\u00a2\2\2\u0a3a\u0a3b\7\u011e\2\2\u0a3b"+
		"\u0a3c\7q\2\2\u0a3c\u0a4d\7\u00e3\2\2\u0a3d\u0a3e\7/\2\2\u0a3e\u0a3f\7"+
		"p\2\2\u0a3f\u0a40\7\u00bd\2\2\u0a40\u0a4d\7\u011f\2\2\u0a41\u0a42\7\u0120"+
		"\2\2\u0a42\u0a4d\7\u010d\2\2\u0a43\u0a44\7\u0121\2\2\u0a44\u0a45\7\u0122"+
		"\2\2\u0a45\u0a4d\7\u010a\2\2\u0a46\u0a47\7\u0123\2\2\u0a47\u0a48\7\u0124"+
		"\2\2\u0a48\u0a4d\7\u0125\2\2\u0a49\u0a4a\7\u0126\2\2\u0a4a\u0a4d\7\u010a"+
		"\2\2\u0a4b\u0a4d\7\u0127\2\2\u0a4c\u0a01\3\2\2\2\u0a4c\u0a09\3\2\2\2\u0a4c"+
		"\u0a1e\3\2\2\2\u0a4c\u0a2c\3\2\2\2\u0a4c\u0a2f\3\2\2\2\u0a4c\u0a32\3\2"+
		"\2\2\u0a4c\u0a35\3\2\2\2\u0a4c\u0a38\3\2\2\2\u0a4c\u0a3a\3\2\2\2\u0a4c"+
		"\u0a3d\3\2\2\2\u0a4c\u0a41\3\2\2\2\u0a4c\u0a43\3\2\2\2\u0a4c\u0a46\3\2"+
		"\2\2\u0a4c\u0a49\3\2\2\2\u0a4c\u0a4b\3\2\2\2\u0a4d\u01c5\3\2\2\2\u0a4e"+
		"\u0a57\7\u011e\2\2\u0a4f\u0a50\7\64\2\2\u0a50\u0a54\7q\2\2\u0a51\u0a55"+
		"\7\u00e3\2\2\u0a52\u0a53\7\u010d\2\2\u0a53\u0a55\7\u00be\2\2\u0a54\u0a51"+
		"\3\2\2\2\u0a54\u0a52\3\2\2\2\u0a55\u0a57\3\2\2\2\u0a56\u0a4e\3\2\2\2\u0a56"+
		"\u0a4f\3\2\2\2\u0a57\u01c7\3\2\2\2\u0a58\u0a59\7\64\2\2\u0a59\u0af2\7"+
		"\u0110\2\2\u0a5a\u0a5b\7\64\2\2\u0a5b\u0a97\7q\2\2\u0a5c\u0a66\7\u00cb"+
		"\2\2\u0a5d\u0a67\7\u011b\2\2\u0a5e\u0a5f\7\u011c\2\2\u0a5f\u0a67\7G\2"+
		"\2\u0a60\u0a61\7\u0118\2\2\u0a61\u0a67\7\u0119\2\2\u0a62\u0a63\7\u0118"+
		"\2\2\u0a63\u0a67\7\u0101\2\2\u0a64\u0a65\7\u0128\2\2\u0a65\u0a67\7\u0129"+
		"\2\2\u0a66\u0a5d\3\2\2\2\u0a66\u0a5e\3\2\2\2\u0a66\u0a60\3\2\2\2\u0a66"+
		"\u0a62\3\2\2\2\u0a66\u0a64\3\2\2\2\u0a66\u0a67\3\2\2\2\u0a67\u0a98\3\2"+
		"\2\2\u0a68\u0a98\7\u012a\2\2\u0a69\u0a98\7\67\2\2\u0a6a\u0a6c\7\u012b"+
		"\2\2\u0a6b\u0a6d\7\u011b\2\2\u0a6c\u0a6b\3\2\2\2\u0a6c\u0a6d\3\2\2\2\u0a6d"+
		"\u0a98\3\2\2\2\u0a6e\u0a98\7\u00bd\2\2\u0a6f\u0a71\7\u0109\2\2\u0a70\u0a6f"+
		"\3\2\2\2\u0a70\u0a71\3\2\2\2\u0a71\u0a72\3\2\2\2\u0a72\u0a98\7\u00be\2"+
		"\2\u0a73\u0a98\7\u012c\2\2\u0a74\u0a98\7\u012d\2\2\u0a75\u0a98\7\u010a"+
		"\2\2\u0a76\u0a98\7\u0103\2\2\u0a77\u0a7c\7\u010b\2\2\u0a78\u0a7c\7\u010c"+
		"\2\2\u0a79\u0a7a\7=\2\2\u0a7a\u0a7c\7\u012e\2\2\u0a7b\u0a77\3\2\2\2\u0a7b"+
		"\u0a78\3\2\2\2\u0a7b\u0a79\3\2\2\2\u0a7c\u0a7d\3\2\2\2\u0a7d\u0a98\7C"+
		"\2\2\u0a7e\u0a7f\7=\2\2\u0a7f\u0a80\7\u012f\2\2\u0a80\u0a81\7C\2\2\u0a81"+
		"\u0a98\7\u0108\2\2\u0a82\u0a88\7\u0121\2\2\u0a83\u0a84\7\u0130\2\2\u0a84"+
		"\u0a89\7\u0131\2\2\u0a85\u0a86\7\u0132\2\2\u0a86\u0a89\7\u0133\2\2\u0a87"+
		"\u0a89\7\u0134\2\2\u0a88\u0a83\3\2\2\2\u0a88\u0a85\3\2\2\2\u0a88\u0a87"+
		"\3\2\2\2\u0a89\u0a98\3\2\2\2\u0a8a\u0a8b\7\u0135\2\2\u0a8b\u0a98\7\u0104"+
		"\2\2\u0a8c\u0a98\7\u0136\2\2\u0a8d\u0a8e\7\u0138\2\2\u0a8e\u0a98\7\u0139"+
		"\2\2\u0a8f\u0a90\7\u013a\2\2\u0a90\u0a91\7\u012b\2\2\u0a91\u0a98\7\u013b"+
		"\2\2\u0a92\u0a98\7\u013c\2\2\u0a93\u0a94\7\u0118\2\2\u0a94\u0a98\7\u0101"+
		"\2\2\u0a95\u0a96\7\u013d\2\2\u0a96\u0a98\7\u013e\2\2\u0a97\u0a5c\3\2\2"+
		"\2\u0a97\u0a68\3\2\2\2\u0a97\u0a69\3\2\2\2\u0a97\u0a6a\3\2\2\2\u0a97\u0a6e"+
		"\3\2\2\2\u0a97\u0a70\3\2\2\2\u0a97\u0a73\3\2\2\2\u0a97\u0a74\3\2\2\2\u0a97"+
		"\u0a75\3\2\2\2\u0a97\u0a76\3\2\2\2\u0a97\u0a7b\3\2\2\2\u0a97\u0a7e\3\2"+
		"\2\2\u0a97\u0a82\3\2\2\2\u0a97\u0a8a\3\2\2\2\u0a97\u0a8c\3\2\2\2\u0a97"+
		"\u0a8d\3\2\2\2\u0a97\u0a8f\3\2\2\2\u0a97\u0a92\3\2\2\2\u0a97\u0a93\3\2"+
		"\2\2\u0a97\u0a95\3\2\2\2\u0a98\u0af2\3\2\2\2\u0a99\u0abc\7\63\2\2\u0a9a"+
		"\u0abd\7\u00cb\2\2\u0a9b\u0a9c\7\u00cb\2\2\u0a9c\u0a9d\7\u011c\2\2\u0a9d"+
		"\u0a9e\7\u0118\2\2\u0a9e\u0abd\7\u0119\2\2\u0a9f\u0abd\7\67\2\2\u0aa0"+
		"\u0abd\7<\2\2\u0aa1\u0abd\7I\2\2\u0aa2\u0abd\7\u012b\2\2\u0aa3\u0abd\7"+
		"\u0139\2\2\u0aa4\u0abd\7\u0098\2\2\u0aa5\u0abd\7\u013f\2\2\u0aa6\u0abd"+
		"\7\u010a\2\2\u0aa7\u0aa8\t\'\2\2\u0aa8\u0abd\7C\2\2\u0aa9\u0abd\7\u012c"+
		"\2\2\u0aaa\u0abd\7\u012d\2\2\u0aab\u0aac\7\u0135\2\2\u0aac\u0abd\7\u0104"+
		"\2\2\u0aad\u0abd\7F\2\2\u0aae\u0aaf\7\u0138\2\2\u0aaf\u0abd\7\u0139\2"+
		"\2\u0ab0\u0abd\7H\2\2\u0ab1\u0abd\7\u0140\2\2\u0ab2\u0ab3\7\u013a\2\2"+
		"\u0ab3\u0ab4\7\u012b\2\2\u0ab4\u0abd\7\u013b\2\2\u0ab5\u0abd\7\u00be\2"+
		"\2\u0ab6\u0abd\7\u013c\2\2\u0ab7\u0abd\7\u0141\2\2\u0ab8\u0abd\7\u0142"+
		"\2\2\u0ab9\u0aba\7\u011d\2\2\u0aba\u0abb\7\67\2\2\u0abb\u0abd\7\u0143"+
		"\2\2\u0abc\u0a9a\3\2\2\2\u0abc\u0a9b\3\2\2\2\u0abc\u0a9f\3\2\2\2\u0abc"+
		"\u0aa0\3\2\2\2\u0abc\u0aa1\3\2\2\2\u0abc\u0aa2\3\2\2\2\u0abc\u0aa3\3\2"+
		"\2\2\u0abc\u0aa4\3\2\2\2\u0abc\u0aa5\3\2\2\2\u0abc\u0aa6\3\2\2\2\u0abc"+
		"\u0aa7\3\2\2\2\u0abc\u0aa9\3\2\2\2\u0abc\u0aaa\3\2\2\2\u0abc\u0aab\3\2"+
		"\2\2\u0abc\u0aad\3\2\2\2\u0abc\u0aae\3\2\2\2\u0abc\u0ab0\3\2\2\2\u0abc"+
		"\u0ab1\3\2\2\2\u0abc\u0ab2\3\2\2\2\u0abc\u0ab5\3\2\2\2\u0abc\u0ab6\3\2"+
		"\2\2\u0abc\u0ab7\3\2\2\2\u0abc\u0ab8\3\2\2\2\u0abc\u0ab9\3\2\2\2\u0abd"+
		"\u0af2\3\2\2\2\u0abe\u0abf\7\63\2\2\u0abf\u0ac3\7q\2\2\u0ac0\u0ac4\7\u00cb"+
		"\2\2\u0ac1\u0ac2\7\u0121\2\2\u0ac2\u0ac4\7\u0134\2\2\u0ac3\u0ac0\3\2\2"+
		"\2\u0ac3\u0ac1\3\2\2\2\u0ac4\u0af2\3\2\2\2\u0ac5\u0acb\7I\2\2\u0ac6\u0ac7"+
		"\t(\2\2\u0ac7\u0acc\7\u0114\2\2\u0ac8\u0ac9\7\u011c\2\2\u0ac9\u0aca\7"+
		"\u0118\2\2\u0aca\u0acc\7\u0119\2\2\u0acb\u0ac6\3\2\2\2\u0acb\u0ac8\3\2"+
		"\2\2\u0acc\u0af2\3\2\2\2\u0acd\u0ace\7I\2\2\u0ace\u0ad4\7q\2\2\u0acf\u0ad0"+
		"\7=\2\2\u0ad0\u0ad1\t)\2\2\u0ad1\u0ad2\7C\2\2\u0ad2\u0ad5\7\u0108\2\2"+
		"\u0ad3\u0ad5\7\u0108\2\2\u0ad4\u0acf\3\2\2\2\u0ad4\u0ad3\3\2\2\2\u0ad5"+
		"\u0af2\3\2\2\2\u0ad6\u0ad7\7\u0100\2\2\u0ad7\u0ad8\7q\2\2\u0ad8\u0ad9"+
		"\7\u0121\2\2\u0ad9\u0af2\7\u0144\2\2\u0ada\u0adc\7\u0102\2\2\u0adb\u0add"+
		"\7\u00f6\2\2\u0adc\u0adb\3\2\2\2\u0adc\u0add\3\2\2\2\u0add\u0af2\3\2\2"+
		"\2\u0ade\u0adf\7\u0145\2\2\u0adf\u0ae0\7\u00cb\2\2\u0ae0\u0af2\7\u0103"+
		"\2\2\u0ae1\u0ae2\7\u0146\2\2\u0ae2\u0af2\t*\2\2\u0ae3\u0ae5\7\u0120\2"+
		"\2\u0ae4\u0ae6\7\u010d\2\2\u0ae5\u0ae4\3\2\2\2\u0ae5\u0ae6\3\2\2\2\u0ae6"+
		"\u0af2\3\2\2\2\u0ae7\u0af2\7\u0148\2\2\u0ae8\u0ae9\7\u0149\2\2\u0ae9\u0aea"+
		"\7\u014a\2\2\u0aea\u0af2\7\u014b\2\2\u0aeb\u0af2\7\u0137\2\2\u0aec\u0af2"+
		"\7\u014c\2\2\u0aed\u0aee\7\u0123\2\2\u0aee\u0aef\7\u00cb\2\2\u0aef\u0af0"+
		"\7\u0124\2\2\u0af0\u0af2\7\u0125\2\2\u0af1\u0a58\3\2\2\2\u0af1\u0a5a\3"+
		"\2\2\2\u0af1\u0a99\3\2\2\2\u0af1\u0abe\3\2\2\2\u0af1\u0ac5\3\2\2\2\u0af1"+
		"\u0acd\3\2\2\2\u0af1\u0ad6\3\2\2\2\u0af1\u0ada\3\2\2\2\u0af1\u0ade\3\2"+
		"\2\2\u0af1\u0ae1\3\2\2\2\u0af1\u0ae3\3\2\2\2\u0af1\u0ae7\3\2\2\2\u0af1"+
		"\u0ae8\3\2\2\2\u0af1\u0aeb\3\2\2\2\u0af1\u0aec\3\2\2\2\u0af1\u0aed\3\2"+
		"\2\2\u0af2\u01c9\3\2\2\2\u0af3\u0afe\7\u011e\2\2\u0af4\u0af5\7\64\2\2"+
		"\u0af5\u0afb\7q\2\2\u0af6\u0afc\7\u00bd\2\2\u0af7\u0af9\7\u0109\2\2\u0af8"+
		"\u0af7\3\2\2\2\u0af8\u0af9\3\2\2\2\u0af9\u0afa\3\2\2\2\u0afa\u0afc\7\u00be"+
		"\2\2\u0afb\u0af6\3\2\2\2\u0afb\u0af8\3\2\2\2\u0afc\u0afe\3\2\2\2\u0afd"+
		"\u0af3\3\2\2\2\u0afd\u0af4\3\2\2\2\u0afe\u01cb\3\2\2\2\u0aff\u0b00\7\64"+
		"\2\2\u0b00\u0b01\7q\2\2\u0b01\u0b08\7\67\2\2\u0b02\u0b03\7\63\2\2\u0b03"+
		"\u0b08\7\u014d\2\2\u0b04\u0b05\7I\2\2\u0b05\u0b06\7\u010f\2\2\u0b06\u0b08"+
		"\7\u0111\2\2\u0b07\u0aff\3\2\2\2\u0b07\u0b02\3\2\2\2\u0b07\u0b04\3\2\2"+
		"\2\u0b08\u01cd\3\2\2\2\u0b09\u0b0a\7\64\2\2\u0b0a\u0b13\7q\2\2\u0b0b\u0b14"+
		"\7\u012d\2\2\u0b0c\u0b0d\7\u0138\2\2\u0b0d\u0b14\7\u0139\2\2\u0b0e\u0b0f"+
		"\7\u013a\2\2\u0b0f\u0b10\7\u012b\2\2\u0b10\u0b14\7\u013b\2\2\u0b11\u0b14"+
		"\7\u013c\2\2\u0b12\u0b14\7\u012b\2\2\u0b13\u0b0b\3\2\2\2\u0b13\u0b0c\3"+
		"\2\2\2\u0b13\u0b0e\3\2\2\2\u0b13\u0b11\3\2\2\2\u0b13\u0b12\3\2\2\2\u0b14"+
		"\u01cf\3\2\2\2\u0b15\u0b16\7\64\2\2\u0b16\u0b17\7q\2\2\u0b17\u0b18\7\u0117"+
		"\2\2\u0b18\u01d1\3\2\2\2\u0b19\u0b1a\7\64\2\2\u0b1a\u0b1b\7q\2\2\u0b1b"+
		"\u0b1c\7\u012c\2\2\u0b1c\u01d3\3\2\2\2\u0b1d\u0b1e\7\64\2\2\u0b1e\u0b1f"+
		"\7q\2\2\u0b1f\u0b20\7\u010b\2\2\u0b20\u0b21\7C\2\2\u0b21\u01d5\3\2\2\2"+
		"\u0b22\u0b23\7\64\2\2\u0b23\u0b24\7q\2\2\u0b24\u0b25\7\u010c\2\2\u0b25"+
		"\u0b26\7C\2\2\u0b26\u01d7\3\2\2\2\u0b27\u0b28\7\64\2\2\u0b28\u0b29\7q"+
		"\2\2\u0b29\u0b2a\7\u010a\2\2\u0b2a\u01d9\3\2\2\2\u0b2b\u0b2c\7\64\2\2"+
		"\u0b2c\u0b2d\7q\2\2\u0b2d\u0b2e\7\u0115\2\2\u0b2e\u0b31\7t\2\2\u0b2f\u0b31"+
		"\7\u0102\2\2\u0b30\u0b2b\3\2\2\2\u0b30\u0b2f\3\2\2\2\u0b31\u01db\3\2\2"+
		"\2\u0b32\u0b33\7\64\2\2\u0b33\u0b34\7q\2\2\u0b34\u0b35\7\u0135\2\2\u0b35"+
		"\u0b36\7\u0104\2\2\u0b36\u01dd\3\2\2\2\u0b37\u0b38\7\u0178\2\2\u0b38\u0b39"+
		"\7\16\2\2\u0b39\u0b3a\7\16\2\2\u0b3a\u01df\3\2\2\2\u0b3b\u0b3c\t+\2\2"+
		"\u0b3c\u0b3d\7\16\2\2\u0b3d\u0b3e\7\16\2\2\u0b3e\u01e1\3\2\2\2\u0b3f\u0b40"+
		"\5\u00d6l\2\u0b40\u01e3\3\2\2\2\u0b41\u0b42\7\63\2\2\u0b42\u0b43\7\u00bd"+
		"\2\2\u0b43\u01e5\3\2\2\2\u0b44\u0b45\7\65\2\2\u0b45\u0b46\7\u00bd\2\2"+
		"\u0b46\u01e7\3\2\2\2\u0b47\u0b48\7\64\2\2\u0b48\u0b49\7\u00bd\2\2\u0b49"+
		"\u01e9\3\2\2\2\u0b4a\u0b4b\7\63\2\2\u0b4b\u0b4c\7\u00be\2\2\u0b4c\u01eb"+
		"\3\2\2\2\u0b4d\u0b4e\7\65\2\2\u0b4e\u0b4f\7\u00be\2\2\u0b4f\u01ed\3\2"+
		"\2\2\u0b50\u0b51\7\64\2\2\u0b51\u0b52\7\u00be\2\2\u0b52\u01ef\3\2\2\2"+
		"\u0b53\u0b54\7\63\2\2\u0b54\u0b55\7\u00e3\2\2\u0b55\u01f1\3\2\2\2\u0b56"+
		"\u0b57\7\65\2\2\u0b57\u0b58\7\u00e3\2\2\u0b58\u01f3\3\2\2\2\u0b59\u0b5a"+
		"\7\64\2\2\u0b5a\u0b5b\7\u00e3\2\2\u0b5b\u01f5\3\2\2\2\u0b5c\u0b5d\7\u009c"+
		"\2\2\u0b5d\u01f7\3\2\2\2\u013c\u0216\u0219\u021f\u0222\u0226\u0229\u0231"+
		"\u0235\u023d\u0249\u0252\u0259\u025d\u0262\u0265\u0268\u026b\u026f\u0272"+
		"\u0275\u0280\u0284\u0289\u028d\u0295\u029a\u029f\u02a3\u02a6\u02a9\u02ac"+
		"\u02af\u02b5\u02bb\u02c1\u02c4\u02c7\u02ca\u02ce\u02d2\u02de\u02ed\u02f5"+
		"\u02fb\u02fe\u0302\u0305\u0309\u030f\u0312\u0315\u031b\u031e\u0322\u0327"+
		"\u0329\u032f\u033b\u0345\u0348\u0353\u0358\u0363\u036f\u0378\u037f\u038d"+
		"\u0393\u039a\u039e\u03a8\u03aa\u03af\u03bc\u03c4\u03d1\u03e0\u03e2\u03e9"+
		"\u03f0\u03f9\u0400\u0409\u040f\u0412\u0435\u0437\u0442\u044a\u0450\u045a"+
		"\u0461\u0467\u046c\u0473\u0477\u0481\u0491\u0496\u04a1\u04a5\u04ae\u04b2"+
		"\u04b7\u04ba\u04c8\u04d1\u04d7\u04da\u04e3\u04e8\u04f0\u04fc\u0505\u050b"+
		"\u0513\u0516\u0519\u0524\u052c\u0535\u053d\u0545\u0549\u0556\u0558\u0561"+
		"\u0576\u057b\u0587\u0594\u059d\u05b9\u05c1\u05c8\u05d4\u05e0\u05e5\u05ee"+
		"\u05f5\u05fa\u0609\u0613\u061e\u0621\u062d\u0631\u0643\u0648\u064c\u0650"+
		"\u0653\u0656\u0659\u0667\u066c\u0671\u0681\u068c\u0696\u069f\u06a6\u06ac"+
		"\u06b5\u06b8\u06bb\u06be\u06c7\u06cf\u06d8\u06df\u06e2\u06ea\u06ec\u06ef"+
		"\u06f9\u06fe\u0703\u0707\u070a\u070e\u0711\u0716\u071e\u0727\u072f\u0732"+
		"\u0735\u0738\u073e\u0742\u074a\u0760\u0762\u0767\u0769\u0770\u0772\u0776"+
		"\u077e\u078c\u0795\u07a4\u07aa\u07ae\u07b3\u07bb\u07c4\u07c7\u07dd\u07df"+
		"\u07ea\u07f1\u07f8\u0802\u0809\u080c\u0817\u081d\u0822\u0825\u082d\u0832"+
		"\u0839\u0842\u0846\u0853\u0860\u0867\u0873\u0876\u087a\u087e\u0887\u088a"+
		"\u088d\u0894\u0899\u08a2\u08b6\u08b8\u08be\u08c5\u08ca\u08d1\u08d5\u08db"+
		"\u08e1\u08e6\u08ec\u08f3\u08f9\u0902\u0909\u090b\u0911\u0914\u0917\u091c"+
		"\u0923\u092c\u0931\u093a\u093c\u0941\u094a\u094c\u094f\u0961\u0963\u096d"+
		"\u097f\u0995\u0999\u099e\u09a3\u09a8\u09ad\u09b5\u09ba\u09be\u09c2\u09cb"+
		"\u09cf\u09d5\u09e6\u09ea\u09f1\u09fb\u0a07\u0a1c\u0a2a\u0a4c\u0a54\u0a56"+
		"\u0a66\u0a6c\u0a70\u0a7b\u0a88\u0a97\u0abc\u0ac3\u0acb\u0ad4\u0adc\u0ae5"+
		"\u0af1\u0af8\u0afb\u0afd\u0b07\u0b13\u0b30";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}