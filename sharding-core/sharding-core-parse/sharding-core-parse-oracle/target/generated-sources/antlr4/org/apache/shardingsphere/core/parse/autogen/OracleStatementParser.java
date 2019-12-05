// Generated from org\apache\shardingsphere\core\parse\autogen\OracleStatement.g4 by ANTLR 4.7.1
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
public class OracleStatementParser extends Parser {
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
		MOD=170, XOR=171, ROW=172, ROWS=173, UNKNOWN=174, ALWAYS=175, CASCADE=176, 
		CHECK=177, GENERATED=178, PRIVILEGES=179, READ=180, WRITE=181, REFERENCES=182, 
		START=183, TRANSACTION=184, USER=185, ROLE=186, VISIBLE=187, INVISIBLE=188, 
		EXECUTE=189, USE=190, DEBUG=191, UNDER=192, FLASHBACK=193, ARCHIVE=194, 
		REFRESH=195, QUERY=196, REWRITE=197, KEEP=198, SEQUENCE=199, INHERIT=200, 
		TRANSLATE=201, MERGE=202, AT=203, BITMAP=204, CACHE=205, NOCACHE=206, 
		CHECKPOINT=207, CONNECT=208, CONSTRAINTS=209, CYCLE=210, NOCYCLE=211, 
		DBTIMEZONE=212, ENCRYPT=213, DECRYPT=214, DEFERRABLE=215, DEFERRED=216, 
		DIRECTORY=217, EDITION=218, ELEMENT=219, END=220, EXCEPTIONS=221, FORCE=222, 
		GLOBAL=223, IDENTIFIED=224, IDENTITY=225, IMMEDIATE=226, INCREMENT=227, 
		INITIALLY=228, INVALIDATE=229, JAVA=230, LEVELS=231, MAXVALUE=232, MINVALUE=233, 
		NOMAXVALUE=234, NOMINVALUE=235, MINING=236, MODEL=237, MODIFY=238, NATIONAL=239, 
		NEW=240, NOORDER=241, NORELY=242, OF=243, ONLY=244, PRIOR=245, PROFILE=246, 
		REF=247, REKEY=248, RELY=249, RENAME=250, REPLACE=251, RESOURCE=252, ROWID=253, 
		SALT=254, SCOPE=255, SORT=256, SOURCE=257, SUBSTITUTABLE=258, TABLESPACE=259, 
		TEMPORARY=260, TRANSLATION=261, TREAT=262, NO=263, TYPE=264, UNUSED=265, 
		VALIDATE=266, NOVALIDATE=267, VALUE=268, VARYING=269, VIRTUAL=270, ZONE=271, 
		PUBLIC=272, SESSION=273, COMMENT=274, LOCK=275, ADVISOR=276, ADMINISTER=277, 
		TUNING=278, MANAGE=279, MANAGEMENT=280, OBJECT=281, CLUSTER=282, CONTEXT=283, 
		EXEMPT=284, REDACTION=285, POLICY=286, DATABASE=287, SYSTEM=288, AUDIT=289, 
		LINK=290, ANALYZE=291, DICTIONARY=292, DIMENSION=293, INDEXTYPE=294, EXTERNAL=295, 
		JOB=296, CLASS=297, PROGRAM=298, SCHEDULER=299, LIBRARY=300, LOGMINING=301, 
		MATERIALIZED=302, CUBE=303, MEASURE=304, FOLDER=305, BUILD=306, PROCESS=307, 
		OPERATOR=308, OUTLINE=309, PLUGGABLE=310, CONTAINER=311, SEGMENT=312, 
		RESTRICTED=313, COST=314, SYNONYM=315, BACKUP=316, UNLIMITED=317, BECOME=318, 
		CHANGE=319, NOTIFICATION=320, ACCESS=321, PRIVILEGE=322, PURGE=323, RESUMABLE=324, 
		SYSGUID=325, SYSBACKUP=326, SYSDBA=327, SYSDG=328, SYSKM=329, SYSOPER=330, 
		DBA_RECYCLEBIN=331, IDENTIFIER_=332, STRING_=333, NUMBER_=334, HEX_DIGIT_=335, 
		BIT_NUM_=336;
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
		RULE_havingClause = 32, RULE_subquery = 33, RULE_parameterMarker = 34, 
		RULE_literals = 35, RULE_stringLiterals = 36, RULE_numberLiterals = 37, 
		RULE_dateTimeLiterals = 38, RULE_hexadecimalLiterals = 39, RULE_bitValueLiterals = 40, 
		RULE_booleanLiterals = 41, RULE_nullValueLiterals = 42, RULE_identifier_ = 43, 
		RULE_unreservedWord_ = 44, RULE_schemaName = 45, RULE_tableName = 46, 
		RULE_columnName = 47, RULE_owner = 48, RULE_name = 49, RULE_columnNames = 50, 
		RULE_tableNames = 51, RULE_indexName = 52, RULE_oracleId = 53, RULE_collationName = 54, 
		RULE_dataTypeLength = 55, RULE_primaryKey = 56, RULE_exprs = 57, RULE_exprList = 58, 
		RULE_expr = 59, RULE_logicalOperator = 60, RULE_notOperator_ = 61, RULE_booleanPrimary_ = 62, 
		RULE_comparisonOperator = 63, RULE_predicate = 64, RULE_bitExpr = 65, 
		RULE_simpleExpr = 66, RULE_functionCall = 67, RULE_aggregationFunction = 68, 
		RULE_aggregationFunctionName_ = 69, RULE_distinct = 70, RULE_specialFunction_ = 71, 
		RULE_castFunction_ = 72, RULE_charFunction_ = 73, RULE_regularFunction_ = 74, 
		RULE_regularFunctionName_ = 75, RULE_caseExpression_ = 76, RULE_caseWhen_ = 77, 
		RULE_caseElse_ = 78, RULE_orderByClause = 79, RULE_orderByItem = 80, RULE_attributeName = 81, 
		RULE_indexTypeName = 82, RULE_simpleExprs = 83, RULE_lobItem = 84, RULE_lobItems = 85, 
		RULE_lobItemList = 86, RULE_dataType = 87, RULE_specialDatatype = 88, 
		RULE_dataTypeName_ = 89, RULE_datetimeTypeSuffix = 90, RULE_treatFunction = 91, 
		RULE_privateExprOfDb = 92, RULE_caseExpr = 93, RULE_simpleCaseExpr = 94, 
		RULE_searchedCaseExpr = 95, RULE_elseClause = 96, RULE_intervalExpression = 97, 
		RULE_objectAccessExpression = 98, RULE_constructorExpr = 99, RULE_ignoredIdentifier_ = 100, 
		RULE_ignoredIdentifiers_ = 101, RULE_matchNone = 102, RULE_createTable = 103, 
		RULE_createIndex = 104, RULE_alterTable = 105, RULE_alterIndex = 106, 
		RULE_dropTable = 107, RULE_dropIndex = 108, RULE_truncateTable = 109, 
		RULE_createTableSpecification_ = 110, RULE_tablespaceClauseWithParen = 111, 
		RULE_tablespaceClause = 112, RULE_domainIndexClause = 113, RULE_createDefinitionClause_ = 114, 
		RULE_relationalProperties = 115, RULE_relationalProperty = 116, RULE_columnDefinition = 117, 
		RULE_visibleClause_ = 118, RULE_defaultNullClause_ = 119, RULE_identityClause = 120, 
		RULE_identifyOptions = 121, RULE_identityOption = 122, RULE_encryptionSpecification_ = 123, 
		RULE_inlineConstraint = 124, RULE_referencesClause = 125, RULE_constraintState = 126, 
		RULE_notDeferrable = 127, RULE_initiallyClause = 128, RULE_exceptionsClause = 129, 
		RULE_usingIndexClause = 130, RULE_createIndexClause_ = 131, RULE_inlineRefConstraint = 132, 
		RULE_virtualColumnDefinition = 133, RULE_outOfLineConstraint = 134, RULE_outOfLineRefConstraint = 135, 
		RULE_createIndexSpecification_ = 136, RULE_tableIndexClause_ = 137, RULE_indexExpressions_ = 138, 
		RULE_indexExpression_ = 139, RULE_bitmapJoinIndexClause_ = 140, RULE_columnSortsClause_ = 141, 
		RULE_columnSortClause_ = 142, RULE_createIndexDefinitionClause_ = 143, 
		RULE_tableAlias = 144, RULE_alterDefinitionClause_ = 145, RULE_alterTableProperties = 146, 
		RULE_renameTableSpecification_ = 147, RULE_columnClauses = 148, RULE_operateColumnClause = 149, 
		RULE_addColumnSpecification = 150, RULE_columnOrVirtualDefinitions = 151, 
		RULE_columnOrVirtualDefinition = 152, RULE_columnProperties = 153, RULE_columnProperty = 154, 
		RULE_objectTypeColProperties = 155, RULE_substitutableColumnClause = 156, 
		RULE_modifyColumnSpecification = 157, RULE_modifyColProperties = 158, 
		RULE_modifyColSubstitutable = 159, RULE_dropColumnClause = 160, RULE_dropColumnSpecification = 161, 
		RULE_columnOrColumnList = 162, RULE_cascadeOrInvalidate = 163, RULE_checkpointNumber = 164, 
		RULE_renameColumnClause = 165, RULE_constraintClauses = 166, RULE_addConstraintSpecification = 167, 
		RULE_modifyConstraintClause = 168, RULE_constraintWithName = 169, RULE_constraintOption = 170, 
		RULE_constraintPrimaryOrUnique = 171, RULE_renameConstraintClause = 172, 
		RULE_dropConstraintClause = 173, RULE_alterExternalTable = 174, RULE_objectProperties = 175, 
		RULE_objectProperty = 176, RULE_renameIndexClause_ = 177, RULE_setTransaction = 178, 
		RULE_commit = 179, RULE_rollback = 180, RULE_savepoint = 181, RULE_grant = 182, 
		RULE_revoke = 183, RULE_objectPrivilegeClause_ = 184, RULE_systemPrivilegeClause_ = 185, 
		RULE_roleClause_ = 186, RULE_objectPrivileges_ = 187, RULE_objectPrivilegeType_ = 188, 
		RULE_onObjectClause_ = 189, RULE_systemPrivilege_ = 190, RULE_systemPrivilegeOperation_ = 191, 
		RULE_advisorFrameworkSystemPrivilege_ = 192, RULE_clustersSystemPrivilege_ = 193, 
		RULE_contextsSystemPrivilege_ = 194, RULE_dataRedactionSystemPrivilege_ = 195, 
		RULE_databaseSystemPrivilege_ = 196, RULE_databaseLinksSystemPrivilege_ = 197, 
		RULE_debuggingSystemPrivilege_ = 198, RULE_dictionariesSystemPrivilege_ = 199, 
		RULE_dimensionsSystemPrivilege_ = 200, RULE_directoriesSystemPrivilege_ = 201, 
		RULE_editionsSystemPrivilege_ = 202, RULE_flashbackDataArchivesPrivilege_ = 203, 
		RULE_indexesSystemPrivilege_ = 204, RULE_indexTypesSystemPrivilege_ = 205, 
		RULE_jobSchedulerObjectsSystemPrivilege_ = 206, RULE_keyManagementFrameworkSystemPrivilege_ = 207, 
		RULE_librariesFrameworkSystemPrivilege_ = 208, RULE_logminerFrameworkSystemPrivilege_ = 209, 
		RULE_materizlizedViewsSystemPrivilege_ = 210, RULE_miningModelsSystemPrivilege_ = 211, 
		RULE_olapCubesSystemPrivilege_ = 212, RULE_olapCubeMeasureFoldersSystemPrivilege_ = 213, 
		RULE_olapCubeDiminsionsSystemPrivilege_ = 214, RULE_olapCubeBuildProcessesSystemPrivilege_ = 215, 
		RULE_operatorsSystemPrivilege_ = 216, RULE_outlinesSystemPrivilege_ = 217, 
		RULE_planManagementSystemPrivilege_ = 218, RULE_pluggableDatabasesSystemPrivilege_ = 219, 
		RULE_proceduresSystemPrivilege_ = 220, RULE_profilesSystemPrivilege_ = 221, 
		RULE_rolesSystemPrivilege_ = 222, RULE_rollbackSegmentsSystemPrivilege_ = 223, 
		RULE_sequencesSystemPrivilege_ = 224, RULE_sessionsSystemPrivilege_ = 225, 
		RULE_sqlTranslationProfilesSystemPrivilege_ = 226, RULE_synonymsSystemPrivilege_ = 227, 
		RULE_tablesSystemPrivilege_ = 228, RULE_tablespacesSystemPrivilege_ = 229, 
		RULE_triggersSystemPrivilege_ = 230, RULE_typesSystemPrivilege_ = 231, 
		RULE_usersSystemPrivilege_ = 232, RULE_viewsSystemPrivilege_ = 233, RULE_miscellaneousSystemPrivilege_ = 234, 
		RULE_createUser = 235, RULE_dropUser = 236, RULE_alterUser = 237, RULE_createRole = 238, 
		RULE_dropRole = 239, RULE_alterRole = 240, RULE_call = 241;
	public static final String[] ruleNames = {
		"execute", "insert", "insertValuesClause", "insertSelectClause", "update", 
		"updateSpecification_", "assignment", "setAssignmentsClause", "assignmentValues", 
		"assignmentValue", "delete", "deleteSpecification_", "singleTableClause_", 
		"multipleTablesClause_", "multipleTableNames_", "select", "unionClause_", 
		"selectClause", "duplicateSpecification", "selectItems", "selectItem", 
		"alias", "unqualifiedShorthand", "qualifiedShorthand", "fromClause", "tableReferences", 
		"tableReference", "tableFactor", "joinedTable", "joinSpecification", "whereClause", 
		"groupByClause", "havingClause", "subquery", "parameterMarker", "literals", 
		"stringLiterals", "numberLiterals", "dateTimeLiterals", "hexadecimalLiterals", 
		"bitValueLiterals", "booleanLiterals", "nullValueLiterals", "identifier_", 
		"unreservedWord_", "schemaName", "tableName", "columnName", "owner", "name", 
		"columnNames", "tableNames", "indexName", "oracleId", "collationName", 
		"dataTypeLength", "primaryKey", "exprs", "exprList", "expr", "logicalOperator", 
		"notOperator_", "booleanPrimary_", "comparisonOperator", "predicate", 
		"bitExpr", "simpleExpr", "functionCall", "aggregationFunction", "aggregationFunctionName_", 
		"distinct", "specialFunction_", "castFunction_", "charFunction_", "regularFunction_", 
		"regularFunctionName_", "caseExpression_", "caseWhen_", "caseElse_", "orderByClause", 
		"orderByItem", "attributeName", "indexTypeName", "simpleExprs", "lobItem", 
		"lobItems", "lobItemList", "dataType", "specialDatatype", "dataTypeName_", 
		"datetimeTypeSuffix", "treatFunction", "privateExprOfDb", "caseExpr", 
		"simpleCaseExpr", "searchedCaseExpr", "elseClause", "intervalExpression", 
		"objectAccessExpression", "constructorExpr", "ignoredIdentifier_", "ignoredIdentifiers_", 
		"matchNone", "createTable", "createIndex", "alterTable", "alterIndex", 
		"dropTable", "dropIndex", "truncateTable", "createTableSpecification_", 
		"tablespaceClauseWithParen", "tablespaceClause", "domainIndexClause", 
		"createDefinitionClause_", "relationalProperties", "relationalProperty", 
		"columnDefinition", "visibleClause_", "defaultNullClause_", "identityClause", 
		"identifyOptions", "identityOption", "encryptionSpecification_", "inlineConstraint", 
		"referencesClause", "constraintState", "notDeferrable", "initiallyClause", 
		"exceptionsClause", "usingIndexClause", "createIndexClause_", "inlineRefConstraint", 
		"virtualColumnDefinition", "outOfLineConstraint", "outOfLineRefConstraint", 
		"createIndexSpecification_", "tableIndexClause_", "indexExpressions_", 
		"indexExpression_", "bitmapJoinIndexClause_", "columnSortsClause_", "columnSortClause_", 
		"createIndexDefinitionClause_", "tableAlias", "alterDefinitionClause_", 
		"alterTableProperties", "renameTableSpecification_", "columnClauses", 
		"operateColumnClause", "addColumnSpecification", "columnOrVirtualDefinitions", 
		"columnOrVirtualDefinition", "columnProperties", "columnProperty", "objectTypeColProperties", 
		"substitutableColumnClause", "modifyColumnSpecification", "modifyColProperties", 
		"modifyColSubstitutable", "dropColumnClause", "dropColumnSpecification", 
		"columnOrColumnList", "cascadeOrInvalidate", "checkpointNumber", "renameColumnClause", 
		"constraintClauses", "addConstraintSpecification", "modifyConstraintClause", 
		"constraintWithName", "constraintOption", "constraintPrimaryOrUnique", 
		"renameConstraintClause", "dropConstraintClause", "alterExternalTable", 
		"objectProperties", "objectProperty", "renameIndexClause_", "setTransaction", 
		"commit", "rollback", "savepoint", "grant", "revoke", "objectPrivilegeClause_", 
		"systemPrivilegeClause_", "roleClause_", "objectPrivileges_", "objectPrivilegeType_", 
		"onObjectClause_", "systemPrivilege_", "systemPrivilegeOperation_", "advisorFrameworkSystemPrivilege_", 
		"clustersSystemPrivilege_", "contextsSystemPrivilege_", "dataRedactionSystemPrivilege_", 
		"databaseSystemPrivilege_", "databaseLinksSystemPrivilege_", "debuggingSystemPrivilege_", 
		"dictionariesSystemPrivilege_", "dimensionsSystemPrivilege_", "directoriesSystemPrivilege_", 
		"editionsSystemPrivilege_", "flashbackDataArchivesPrivilege_", "indexesSystemPrivilege_", 
		"indexTypesSystemPrivilege_", "jobSchedulerObjectsSystemPrivilege_", "keyManagementFrameworkSystemPrivilege_", 
		"librariesFrameworkSystemPrivilege_", "logminerFrameworkSystemPrivilege_", 
		"materizlizedViewsSystemPrivilege_", "miningModelsSystemPrivilege_", "olapCubesSystemPrivilege_", 
		"olapCubeMeasureFoldersSystemPrivilege_", "olapCubeDiminsionsSystemPrivilege_", 
		"olapCubeBuildProcessesSystemPrivilege_", "operatorsSystemPrivilege_", 
		"outlinesSystemPrivilege_", "planManagementSystemPrivilege_", "pluggableDatabasesSystemPrivilege_", 
		"proceduresSystemPrivilege_", "profilesSystemPrivilege_", "rolesSystemPrivilege_", 
		"rollbackSegmentsSystemPrivilege_", "sequencesSystemPrivilege_", "sessionsSystemPrivilege_", 
		"sqlTranslationProfilesSystemPrivilege_", "synonymsSystemPrivilege_", 
		"tablesSystemPrivilege_", "tablespacesSystemPrivilege_", "triggersSystemPrivilege_", 
		"typesSystemPrivilege_", "usersSystemPrivilege_", "viewsSystemPrivilege_", 
		"miscellaneousSystemPrivilege_", "createUser", "dropUser", "alterUser", 
		"createRole", "dropRole", "alterRole", "call"
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
		"MOD", "XOR", "ROW", "ROWS", "UNKNOWN", "ALWAYS", "CASCADE", "CHECK", 
		"GENERATED", "PRIVILEGES", "READ", "WRITE", "REFERENCES", "START", "TRANSACTION", 
		"USER", "ROLE", "VISIBLE", "INVISIBLE", "EXECUTE", "USE", "DEBUG", "UNDER", 
		"FLASHBACK", "ARCHIVE", "REFRESH", "QUERY", "REWRITE", "KEEP", "SEQUENCE", 
		"INHERIT", "TRANSLATE", "MERGE", "AT", "BITMAP", "CACHE", "NOCACHE", "CHECKPOINT", 
		"CONNECT", "CONSTRAINTS", "CYCLE", "NOCYCLE", "DBTIMEZONE", "ENCRYPT", 
		"DECRYPT", "DEFERRABLE", "DEFERRED", "DIRECTORY", "EDITION", "ELEMENT", 
		"END", "EXCEPTIONS", "FORCE", "GLOBAL", "IDENTIFIED", "IDENTITY", "IMMEDIATE", 
		"INCREMENT", "INITIALLY", "INVALIDATE", "JAVA", "LEVELS", "MAXVALUE", 
		"MINVALUE", "NOMAXVALUE", "NOMINVALUE", "MINING", "MODEL", "MODIFY", "NATIONAL", 
		"NEW", "NOORDER", "NORELY", "OF", "ONLY", "PRIOR", "PROFILE", "REF", "REKEY", 
		"RELY", "RENAME", "REPLACE", "RESOURCE", "ROWID", "SALT", "SCOPE", "SORT", 
		"SOURCE", "SUBSTITUTABLE", "TABLESPACE", "TEMPORARY", "TRANSLATION", "TREAT", 
		"NO", "TYPE", "UNUSED", "VALIDATE", "NOVALIDATE", "VALUE", "VARYING", 
		"VIRTUAL", "ZONE", "PUBLIC", "SESSION", "COMMENT", "LOCK", "ADVISOR", 
		"ADMINISTER", "TUNING", "MANAGE", "MANAGEMENT", "OBJECT", "CLUSTER", "CONTEXT", 
		"EXEMPT", "REDACTION", "POLICY", "DATABASE", "SYSTEM", "AUDIT", "LINK", 
		"ANALYZE", "DICTIONARY", "DIMENSION", "INDEXTYPE", "EXTERNAL", "JOB", 
		"CLASS", "PROGRAM", "SCHEDULER", "LIBRARY", "LOGMINING", "MATERIALIZED", 
		"CUBE", "MEASURE", "FOLDER", "BUILD", "PROCESS", "OPERATOR", "OUTLINE", 
		"PLUGGABLE", "CONTAINER", "SEGMENT", "RESTRICTED", "COST", "SYNONYM", 
		"BACKUP", "UNLIMITED", "BECOME", "CHANGE", "NOTIFICATION", "ACCESS", "PRIVILEGE", 
		"PURGE", "RESUMABLE", "SYSGUID", "SYSBACKUP", "SYSDBA", "SYSDG", "SYSKM", 
		"SYSOPER", "DBA_RECYCLEBIN", "IDENTIFIER_", "STRING_", "NUMBER_", "HEX_DIGIT_", 
		"BIT_NUM_"
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
	public String getGrammarFileName() { return "OracleStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OracleStatementParser(TokenStream input) {
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
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
		}
		public AlterIndexContext alterIndex() {
			return getRuleContext(AlterIndexContext.class,0);
		}
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
		}
		public SetTransactionContext setTransaction() {
			return getRuleContext(SetTransactionContext.class,0);
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
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(OracleStatementParser.SEMI_, 0); }
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
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(484);
				select();
				}
				break;
			case 2:
				{
				setState(485);
				insert();
				}
				break;
			case 3:
				{
				setState(486);
				update();
				}
				break;
			case 4:
				{
				setState(487);
				delete();
				}
				break;
			case 5:
				{
				setState(488);
				createTable();
				}
				break;
			case 6:
				{
				setState(489);
				alterTable();
				}
				break;
			case 7:
				{
				setState(490);
				dropTable();
				}
				break;
			case 8:
				{
				setState(491);
				truncateTable();
				}
				break;
			case 9:
				{
				setState(492);
				createIndex();
				}
				break;
			case 10:
				{
				setState(493);
				dropIndex();
				}
				break;
			case 11:
				{
				setState(494);
				alterIndex();
				}
				break;
			case 12:
				{
				setState(495);
				commit();
				}
				break;
			case 13:
				{
				setState(496);
				rollback();
				}
				break;
			case 14:
				{
				setState(497);
				setTransaction();
				}
				break;
			case 15:
				{
				setState(498);
				savepoint();
				}
				break;
			case 16:
				{
				setState(499);
				grant();
				}
				break;
			case 17:
				{
				setState(500);
				revoke();
				}
				break;
			case 18:
				{
				setState(501);
				createUser();
				}
				break;
			case 19:
				{
				setState(502);
				dropUser();
				}
				break;
			case 20:
				{
				setState(503);
				alterUser();
				}
				break;
			case 21:
				{
				setState(504);
				createRole();
				}
				break;
			case 22:
				{
				setState(505);
				dropRole();
				}
				break;
			case 23:
				{
				setState(506);
				alterRole();
				}
				break;
			case 24:
				{
				setState(507);
				call();
				}
				break;
			}
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(510);
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
		public TerminalNode INSERT() { return getToken(OracleStatementParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(OracleStatementParser.INTO, 0); }
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
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
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
			setState(513);
			match(INSERT);
			setState(514);
			match(INTO);
			setState(515);
			tableName();
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(516);
					match(AS);
					}
				}

				setState(519);
				alias();
				}
				break;
			}
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(522);
				insertValuesClause();
				}
				break;
			case 2:
				{
				setState(523);
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
		public TerminalNode VALUES() { return getToken(OracleStatementParser.VALUES, 0); }
		public List<AssignmentValuesContext> assignmentValues() {
			return getRuleContexts(AssignmentValuesContext.class);
		}
		public AssignmentValuesContext assignmentValues(int i) {
			return getRuleContext(AssignmentValuesContext.class,i);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
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
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (LP_ - 29)) | (1L << (TRUNCATE - 29)) | (1L << (SCHEMA - 29)) | (1L << (FUNCTION - 29)) | (1L << (PROCEDURE - 29)) | (1L << (CASE - 29)) | (1L << (WHEN - 29)) | (1L << (CAST - 29)) | (1L << (TRIM - 29)) | (1L << (SUBSTRING - 29)) | (1L << (NATURAL - 29)) | (1L << (JOIN - 29)) | (1L << (FULL - 29)) | (1L << (INNER - 29)) | (1L << (OUTER - 29)) | (1L << (LEFT - 29)) | (1L << (RIGHT - 29)) | (1L << (CROSS - 29)) | (1L << (USING - 29)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (IF - 95)) | (1L << (TRUE - 95)) | (1L << (FALSE - 95)) | (1L << (LIMIT - 95)) | (1L << (OFFSET - 95)) | (1L << (BEGIN - 95)) | (1L << (COMMIT - 95)) | (1L << (ROLLBACK - 95)) | (1L << (SAVEPOINT - 95)) | (1L << (BOOLEAN - 95)) | (1L << (DOUBLE - 95)) | (1L << (CHARACTER - 95)) | (1L << (ARRAY - 95)) | (1L << (INTERVAL - 95)) | (1L << (TIME - 95)) | (1L << (TIMESTAMP - 95)) | (1L << (LOCALTIME - 95)) | (1L << (LOCALTIMESTAMP - 95)) | (1L << (YEAR - 95)) | (1L << (QUARTER - 95)) | (1L << (MONTH - 95)) | (1L << (WEEK - 95)) | (1L << (DAY - 95)) | (1L << (HOUR - 95)) | (1L << (MINUTE - 95)) | (1L << (SECOND - 95)) | (1L << (MICROSECOND - 95)) | (1L << (MAX - 95)) | (1L << (MIN - 95)) | (1L << (SUM - 95)) | (1L << (COUNT - 95)) | (1L << (AVG - 95)) | (1L << (ENABLE - 95)) | (1L << (DISABLE - 95)) | (1L << (PRESERVE - 95)) | (1L << (DO - 95)) | (1L << (DEFINER - 95)))) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & ((1L << (CURRENT_USER - 159)) | (1L << (SQL - 159)) | (1L << (CASCADED - 159)) | (1L << (LOCAL - 159)) | (1L << (CLOSE - 159)) | (1L << (OPEN - 159)) | (1L << (NEXT - 159)) | (1L << (NAME - 159)) | (1L << (BINARY - 159)) | (1L << (ESCAPE - 159)) | (1L << (MOD - 159)) | (1L << (XOR - 159)) | (1L << (UNKNOWN - 159)) | (1L << (ALWAYS - 159)) | (1L << (CASCADE - 159)) | (1L << (GENERATED - 159)) | (1L << (PRIVILEGES - 159)) | (1L << (READ - 159)) | (1L << (WRITE - 159)) | (1L << (REFERENCES - 159)) | (1L << (TRANSACTION - 159)) | (1L << (ROLE - 159)) | (1L << (VISIBLE - 159)) | (1L << (INVISIBLE - 159)) | (1L << (EXECUTE - 159)) | (1L << (USE - 159)) | (1L << (DEBUG - 159)) | (1L << (UNDER - 159)) | (1L << (FLASHBACK - 159)) | (1L << (ARCHIVE - 159)) | (1L << (REFRESH - 159)) | (1L << (QUERY - 159)) | (1L << (REWRITE - 159)) | (1L << (KEEP - 159)) | (1L << (SEQUENCE - 159)) | (1L << (INHERIT - 159)) | (1L << (TRANSLATE - 159)) | (1L << (MERGE - 159)) | (1L << (AT - 159)) | (1L << (BITMAP - 159)) | (1L << (CACHE - 159)) | (1L << (NOCACHE - 159)) | (1L << (CHECKPOINT - 159)) | (1L << (CONNECT - 159)) | (1L << (CONSTRAINTS - 159)) | (1L << (CYCLE - 159)) | (1L << (NOCYCLE - 159)) | (1L << (DBTIMEZONE - 159)) | (1L << (ENCRYPT - 159)) | (1L << (DECRYPT - 159)) | (1L << (DEFERRABLE - 159)) | (1L << (DEFERRED - 159)) | (1L << (EDITION - 159)) | (1L << (ELEMENT - 159)) | (1L << (END - 159)) | (1L << (EXCEPTIONS - 159)) | (1L << (FORCE - 159)))) != 0) || ((((_la - 223)) & ~0x3f) == 0 && ((1L << (_la - 223)) & ((1L << (GLOBAL - 223)) | (1L << (IDENTITY - 223)) | (1L << (INITIALLY - 223)) | (1L << (INVALIDATE - 223)) | (1L << (JAVA - 223)) | (1L << (LEVELS - 223)) | (1L << (MAXVALUE - 223)) | (1L << (MINVALUE - 223)) | (1L << (NOMAXVALUE - 223)) | (1L << (NOMINVALUE - 223)) | (1L << (MINING - 223)) | (1L << (MODEL - 223)) | (1L << (NATIONAL - 223)) | (1L << (NEW - 223)) | (1L << (NOORDER - 223)) | (1L << (NORELY - 223)) | (1L << (ONLY - 223)) | (1L << (PROFILE - 223)) | (1L << (REF - 223)) | (1L << (REKEY - 223)) | (1L << (RELY - 223)) | (1L << (REPLACE - 223)) | (1L << (SALT - 223)) | (1L << (SCOPE - 223)) | (1L << (SORT - 223)) | (1L << (SOURCE - 223)) | (1L << (SUBSTITUTABLE - 223)) | (1L << (TABLESPACE - 223)) | (1L << (TEMPORARY - 223)) | (1L << (TRANSLATION - 223)) | (1L << (TREAT - 223)) | (1L << (NO - 223)) | (1L << (TYPE - 223)) | (1L << (UNUSED - 223)) | (1L << (NOVALIDATE - 223)) | (1L << (VALUE - 223)) | (1L << (VARYING - 223)) | (1L << (VIRTUAL - 223)) | (1L << (ZONE - 223)) | (1L << (ADVISOR - 223)) | (1L << (ADMINISTER - 223)) | (1L << (TUNING - 223)) | (1L << (MANAGE - 223)) | (1L << (MANAGEMENT - 223)) | (1L << (OBJECT - 223)) | (1L << (CLUSTER - 223)) | (1L << (CONTEXT - 223)) | (1L << (EXEMPT - 223)) | (1L << (REDACTION - 223)) | (1L << (POLICY - 223)))) != 0) || ((((_la - 287)) & ~0x3f) == 0 && ((1L << (_la - 287)) & ((1L << (DATABASE - 287)) | (1L << (SYSTEM - 287)) | (1L << (AUDIT - 287)) | (1L << (LINK - 287)) | (1L << (ANALYZE - 287)) | (1L << (DICTIONARY - 287)) | (1L << (DIMENSION - 287)) | (1L << (INDEXTYPE - 287)) | (1L << (EXTERNAL - 287)) | (1L << (JOB - 287)) | (1L << (CLASS - 287)) | (1L << (PROGRAM - 287)) | (1L << (SCHEDULER - 287)) | (1L << (LIBRARY - 287)) | (1L << (LOGMINING - 287)) | (1L << (MATERIALIZED - 287)) | (1L << (CUBE - 287)) | (1L << (MEASURE - 287)) | (1L << (FOLDER - 287)) | (1L << (BUILD - 287)) | (1L << (PROCESS - 287)) | (1L << (OPERATOR - 287)) | (1L << (OUTLINE - 287)) | (1L << (PLUGGABLE - 287)) | (1L << (CONTAINER - 287)) | (1L << (SEGMENT - 287)) | (1L << (RESTRICTED - 287)) | (1L << (COST - 287)) | (1L << (SYNONYM - 287)) | (1L << (BACKUP - 287)) | (1L << (UNLIMITED - 287)) | (1L << (BECOME - 287)) | (1L << (CHANGE - 287)) | (1L << (NOTIFICATION - 287)) | (1L << (ACCESS - 287)) | (1L << (PRIVILEGE - 287)) | (1L << (PURGE - 287)) | (1L << (RESUMABLE - 287)) | (1L << (SYSGUID - 287)) | (1L << (SYSBACKUP - 287)) | (1L << (SYSDBA - 287)) | (1L << (SYSDG - 287)) | (1L << (SYSKM - 287)) | (1L << (SYSOPER - 287)) | (1L << (DBA_RECYCLEBIN - 287)) | (1L << (IDENTIFIER_ - 287)))) != 0)) {
				{
				setState(526);
				columnNames();
				}
			}

			setState(529);
			match(VALUES);
			setState(530);
			assignmentValues();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(531);
				match(COMMA_);
				setState(532);
				assignmentValues();
				}
				}
				setState(537);
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
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (LP_ - 29)) | (1L << (TRUNCATE - 29)) | (1L << (SCHEMA - 29)) | (1L << (FUNCTION - 29)) | (1L << (PROCEDURE - 29)) | (1L << (CASE - 29)) | (1L << (WHEN - 29)) | (1L << (CAST - 29)) | (1L << (TRIM - 29)) | (1L << (SUBSTRING - 29)) | (1L << (NATURAL - 29)) | (1L << (JOIN - 29)) | (1L << (FULL - 29)) | (1L << (INNER - 29)) | (1L << (OUTER - 29)) | (1L << (LEFT - 29)) | (1L << (RIGHT - 29)) | (1L << (CROSS - 29)) | (1L << (USING - 29)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (IF - 95)) | (1L << (TRUE - 95)) | (1L << (FALSE - 95)) | (1L << (LIMIT - 95)) | (1L << (OFFSET - 95)) | (1L << (BEGIN - 95)) | (1L << (COMMIT - 95)) | (1L << (ROLLBACK - 95)) | (1L << (SAVEPOINT - 95)) | (1L << (BOOLEAN - 95)) | (1L << (DOUBLE - 95)) | (1L << (CHARACTER - 95)) | (1L << (ARRAY - 95)) | (1L << (INTERVAL - 95)) | (1L << (TIME - 95)) | (1L << (TIMESTAMP - 95)) | (1L << (LOCALTIME - 95)) | (1L << (LOCALTIMESTAMP - 95)) | (1L << (YEAR - 95)) | (1L << (QUARTER - 95)) | (1L << (MONTH - 95)) | (1L << (WEEK - 95)) | (1L << (DAY - 95)) | (1L << (HOUR - 95)) | (1L << (MINUTE - 95)) | (1L << (SECOND - 95)) | (1L << (MICROSECOND - 95)) | (1L << (MAX - 95)) | (1L << (MIN - 95)) | (1L << (SUM - 95)) | (1L << (COUNT - 95)) | (1L << (AVG - 95)) | (1L << (ENABLE - 95)) | (1L << (DISABLE - 95)) | (1L << (PRESERVE - 95)) | (1L << (DO - 95)) | (1L << (DEFINER - 95)))) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & ((1L << (CURRENT_USER - 159)) | (1L << (SQL - 159)) | (1L << (CASCADED - 159)) | (1L << (LOCAL - 159)) | (1L << (CLOSE - 159)) | (1L << (OPEN - 159)) | (1L << (NEXT - 159)) | (1L << (NAME - 159)) | (1L << (BINARY - 159)) | (1L << (ESCAPE - 159)) | (1L << (MOD - 159)) | (1L << (XOR - 159)) | (1L << (UNKNOWN - 159)) | (1L << (ALWAYS - 159)) | (1L << (CASCADE - 159)) | (1L << (GENERATED - 159)) | (1L << (PRIVILEGES - 159)) | (1L << (READ - 159)) | (1L << (WRITE - 159)) | (1L << (REFERENCES - 159)) | (1L << (TRANSACTION - 159)) | (1L << (ROLE - 159)) | (1L << (VISIBLE - 159)) | (1L << (INVISIBLE - 159)) | (1L << (EXECUTE - 159)) | (1L << (USE - 159)) | (1L << (DEBUG - 159)) | (1L << (UNDER - 159)) | (1L << (FLASHBACK - 159)) | (1L << (ARCHIVE - 159)) | (1L << (REFRESH - 159)) | (1L << (QUERY - 159)) | (1L << (REWRITE - 159)) | (1L << (KEEP - 159)) | (1L << (SEQUENCE - 159)) | (1L << (INHERIT - 159)) | (1L << (TRANSLATE - 159)) | (1L << (MERGE - 159)) | (1L << (AT - 159)) | (1L << (BITMAP - 159)) | (1L << (CACHE - 159)) | (1L << (NOCACHE - 159)) | (1L << (CHECKPOINT - 159)) | (1L << (CONNECT - 159)) | (1L << (CONSTRAINTS - 159)) | (1L << (CYCLE - 159)) | (1L << (NOCYCLE - 159)) | (1L << (DBTIMEZONE - 159)) | (1L << (ENCRYPT - 159)) | (1L << (DECRYPT - 159)) | (1L << (DEFERRABLE - 159)) | (1L << (DEFERRED - 159)) | (1L << (EDITION - 159)) | (1L << (ELEMENT - 159)) | (1L << (END - 159)) | (1L << (EXCEPTIONS - 159)) | (1L << (FORCE - 159)))) != 0) || ((((_la - 223)) & ~0x3f) == 0 && ((1L << (_la - 223)) & ((1L << (GLOBAL - 223)) | (1L << (IDENTITY - 223)) | (1L << (INITIALLY - 223)) | (1L << (INVALIDATE - 223)) | (1L << (JAVA - 223)) | (1L << (LEVELS - 223)) | (1L << (MAXVALUE - 223)) | (1L << (MINVALUE - 223)) | (1L << (NOMAXVALUE - 223)) | (1L << (NOMINVALUE - 223)) | (1L << (MINING - 223)) | (1L << (MODEL - 223)) | (1L << (NATIONAL - 223)) | (1L << (NEW - 223)) | (1L << (NOORDER - 223)) | (1L << (NORELY - 223)) | (1L << (ONLY - 223)) | (1L << (PROFILE - 223)) | (1L << (REF - 223)) | (1L << (REKEY - 223)) | (1L << (RELY - 223)) | (1L << (REPLACE - 223)) | (1L << (SALT - 223)) | (1L << (SCOPE - 223)) | (1L << (SORT - 223)) | (1L << (SOURCE - 223)) | (1L << (SUBSTITUTABLE - 223)) | (1L << (TABLESPACE - 223)) | (1L << (TEMPORARY - 223)) | (1L << (TRANSLATION - 223)) | (1L << (TREAT - 223)) | (1L << (NO - 223)) | (1L << (TYPE - 223)) | (1L << (UNUSED - 223)) | (1L << (NOVALIDATE - 223)) | (1L << (VALUE - 223)) | (1L << (VARYING - 223)) | (1L << (VIRTUAL - 223)) | (1L << (ZONE - 223)) | (1L << (ADVISOR - 223)) | (1L << (ADMINISTER - 223)) | (1L << (TUNING - 223)) | (1L << (MANAGE - 223)) | (1L << (MANAGEMENT - 223)) | (1L << (OBJECT - 223)) | (1L << (CLUSTER - 223)) | (1L << (CONTEXT - 223)) | (1L << (EXEMPT - 223)) | (1L << (REDACTION - 223)) | (1L << (POLICY - 223)))) != 0) || ((((_la - 287)) & ~0x3f) == 0 && ((1L << (_la - 287)) & ((1L << (DATABASE - 287)) | (1L << (SYSTEM - 287)) | (1L << (AUDIT - 287)) | (1L << (LINK - 287)) | (1L << (ANALYZE - 287)) | (1L << (DICTIONARY - 287)) | (1L << (DIMENSION - 287)) | (1L << (INDEXTYPE - 287)) | (1L << (EXTERNAL - 287)) | (1L << (JOB - 287)) | (1L << (CLASS - 287)) | (1L << (PROGRAM - 287)) | (1L << (SCHEDULER - 287)) | (1L << (LIBRARY - 287)) | (1L << (LOGMINING - 287)) | (1L << (MATERIALIZED - 287)) | (1L << (CUBE - 287)) | (1L << (MEASURE - 287)) | (1L << (FOLDER - 287)) | (1L << (BUILD - 287)) | (1L << (PROCESS - 287)) | (1L << (OPERATOR - 287)) | (1L << (OUTLINE - 287)) | (1L << (PLUGGABLE - 287)) | (1L << (CONTAINER - 287)) | (1L << (SEGMENT - 287)) | (1L << (RESTRICTED - 287)) | (1L << (COST - 287)) | (1L << (SYNONYM - 287)) | (1L << (BACKUP - 287)) | (1L << (UNLIMITED - 287)) | (1L << (BECOME - 287)) | (1L << (CHANGE - 287)) | (1L << (NOTIFICATION - 287)) | (1L << (ACCESS - 287)) | (1L << (PRIVILEGE - 287)) | (1L << (PURGE - 287)) | (1L << (RESUMABLE - 287)) | (1L << (SYSGUID - 287)) | (1L << (SYSBACKUP - 287)) | (1L << (SYSDBA - 287)) | (1L << (SYSDG - 287)) | (1L << (SYSKM - 287)) | (1L << (SYSOPER - 287)) | (1L << (DBA_RECYCLEBIN - 287)) | (1L << (IDENTIFIER_ - 287)))) != 0)) {
				{
				setState(538);
				columnNames();
				}
			}

			setState(541);
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
		public TerminalNode UPDATE() { return getToken(OracleStatementParser.UPDATE, 0); }
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
			setState(543);
			match(UPDATE);
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(544);
				updateSpecification_();
				}
				break;
			}
			setState(547);
			tableReferences();
			setState(548);
			setAssignmentsClause();
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(549);
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
		public TerminalNode ONLY() { return getToken(OracleStatementParser.ONLY, 0); }
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
			setState(552);
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
		public TerminalNode EQ_() { return getToken(OracleStatementParser.EQ_, 0); }
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
			setState(554);
			columnName();
			setState(555);
			match(EQ_);
			setState(556);
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
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
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
			setState(558);
			match(SET);
			setState(559);
			assignment();
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(560);
				match(COMMA_);
				setState(561);
				assignment();
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

	public static class AssignmentValuesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<AssignmentValueContext> assignmentValue() {
			return getRuleContexts(AssignmentValueContext.class);
		}
		public AssignmentValueContext assignmentValue(int i) {
			return getRuleContext(AssignmentValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
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
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				match(LP_);
				setState(568);
				assignmentValue();
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(569);
					match(COMMA_);
					setState(570);
					assignmentValue();
					}
					}
					setState(575);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(576);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				match(LP_);
				setState(579);
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
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValue; }
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentValue);
		try {
			setState(584);
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
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHAR:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case TYPE:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				expr(0);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
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
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
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
			setState(586);
			match(DELETE);
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(587);
				deleteSpecification_();
				}
				break;
			}
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(590);
				singleTableClause_();
				}
				break;
			case 2:
				{
				setState(591);
				multipleTablesClause_();
				}
				break;
			}
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(594);
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
		public TerminalNode ONLY() { return getToken(OracleStatementParser.ONLY, 0); }
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
			setState(597);
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
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
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
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(599);
				match(FROM);
				}
			}

			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(602);
				match(LP_);
				}
			}

			setState(605);
			tableName();
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(606);
				match(RP_);
				}
			}

			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (AS - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)) | (1L << (UNKNOWN - 119)) | (1L << (ALWAYS - 119)) | (1L << (CASCADE - 119)) | (1L << (GENERATED - 119)) | (1L << (PRIVILEGES - 119)) | (1L << (READ - 119)) | (1L << (WRITE - 119)) | (1L << (REFERENCES - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)) | (1L << (NATIONAL - 184)) | (1L << (NEW - 184)) | (1L << (NOORDER - 184)) | (1L << (NORELY - 184)) | (1L << (ONLY - 184)) | (1L << (PROFILE - 184)) | (1L << (REF - 184)))) != 0) || ((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & ((1L << (REKEY - 248)) | (1L << (RELY - 248)) | (1L << (REPLACE - 248)) | (1L << (SALT - 248)) | (1L << (SCOPE - 248)) | (1L << (SORT - 248)) | (1L << (SOURCE - 248)) | (1L << (SUBSTITUTABLE - 248)) | (1L << (TABLESPACE - 248)) | (1L << (TEMPORARY - 248)) | (1L << (TRANSLATION - 248)) | (1L << (TREAT - 248)) | (1L << (NO - 248)) | (1L << (TYPE - 248)) | (1L << (UNUSED - 248)) | (1L << (NOVALIDATE - 248)) | (1L << (VALUE - 248)) | (1L << (VARYING - 248)) | (1L << (VIRTUAL - 248)) | (1L << (ZONE - 248)) | (1L << (ADVISOR - 248)) | (1L << (ADMINISTER - 248)) | (1L << (TUNING - 248)) | (1L << (MANAGE - 248)) | (1L << (MANAGEMENT - 248)) | (1L << (OBJECT - 248)) | (1L << (CLUSTER - 248)) | (1L << (CONTEXT - 248)) | (1L << (EXEMPT - 248)) | (1L << (REDACTION - 248)) | (1L << (POLICY - 248)) | (1L << (DATABASE - 248)) | (1L << (SYSTEM - 248)) | (1L << (AUDIT - 248)) | (1L << (LINK - 248)) | (1L << (ANALYZE - 248)) | (1L << (DICTIONARY - 248)) | (1L << (DIMENSION - 248)) | (1L << (INDEXTYPE - 248)) | (1L << (EXTERNAL - 248)) | (1L << (JOB - 248)) | (1L << (CLASS - 248)) | (1L << (PROGRAM - 248)) | (1L << (SCHEDULER - 248)) | (1L << (LIBRARY - 248)) | (1L << (LOGMINING - 248)) | (1L << (MATERIALIZED - 248)) | (1L << (CUBE - 248)) | (1L << (MEASURE - 248)) | (1L << (FOLDER - 248)) | (1L << (BUILD - 248)) | (1L << (PROCESS - 248)) | (1L << (OPERATOR - 248)) | (1L << (OUTLINE - 248)) | (1L << (PLUGGABLE - 248)) | (1L << (CONTAINER - 248)))) != 0) || ((((_la - 312)) & ~0x3f) == 0 && ((1L << (_la - 312)) & ((1L << (SEGMENT - 312)) | (1L << (RESTRICTED - 312)) | (1L << (COST - 312)) | (1L << (SYNONYM - 312)) | (1L << (BACKUP - 312)) | (1L << (UNLIMITED - 312)) | (1L << (BECOME - 312)) | (1L << (CHANGE - 312)) | (1L << (NOTIFICATION - 312)) | (1L << (ACCESS - 312)) | (1L << (PRIVILEGE - 312)) | (1L << (PURGE - 312)) | (1L << (RESUMABLE - 312)) | (1L << (SYSGUID - 312)) | (1L << (SYSBACKUP - 312)) | (1L << (SYSDBA - 312)) | (1L << (SYSDG - 312)) | (1L << (SYSKM - 312)) | (1L << (SYSOPER - 312)) | (1L << (DBA_RECYCLEBIN - 312)) | (1L << (IDENTIFIER_ - 312)) | (1L << (STRING_ - 312)))) != 0)) {
				{
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(609);
					match(AS);
					}
				}

				setState(612);
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
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public MultipleTablesClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTablesClause_; }
	}

	public final MultipleTablesClause_Context multipleTablesClause_() throws RecognitionException {
		MultipleTablesClause_Context _localctx = new MultipleTablesClause_Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_multipleTablesClause_);
		try {
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case TYPE:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				multipleTableNames_();
				setState(616);
				match(FROM);
				setState(617);
				tableReferences();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				match(FROM);
				setState(620);
				multipleTableNames_();
				setState(621);
				match(USING);
				setState(622);
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
		public List<TerminalNode> DOT_ASTERISK_() { return getTokens(OracleStatementParser.DOT_ASTERISK_); }
		public TerminalNode DOT_ASTERISK_(int i) {
			return getToken(OracleStatementParser.DOT_ASTERISK_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
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
			setState(626);
			tableName();
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_ASTERISK_) {
				{
				setState(627);
				match(DOT_ASTERISK_);
				}
			}

			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(630);
				match(COMMA_);
				setState(631);
				tableName();
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_ASTERISK_) {
					{
					setState(632);
					match(DOT_ASTERISK_);
					}
				}

				}
				}
				setState(639);
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
			setState(640);
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
		public List<TerminalNode> UNION() { return getTokens(OracleStatementParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(OracleStatementParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(OracleStatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(OracleStatementParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(OracleStatementParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(OracleStatementParser.DISTINCT, i);
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
			setState(642);
			selectClause();
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(643);
				match(UNION);
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT || _la==ALL) {
					{
					setState(644);
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

				setState(647);
				selectClause();
				}
				}
				setState(652);
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
		public TerminalNode SELECT() { return getToken(OracleStatementParser.SELECT, 0); }
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
		enterRule(_localctx, 34, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(SELECT);
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(654);
				duplicateSpecification();
				}
			}

			setState(657);
			selectItems();
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(658);
				fromClause();
				}
			}

			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(661);
				whereClause();
				}
			}

			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(664);
				groupByClause();
				}
			}

			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(667);
				havingClause();
				}
			}

			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(670);
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
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(OracleStatementParser.DISTINCT, 0); }
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
			setState(673);
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
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
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
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK_:
				{
				setState(675);
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
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHAR:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case TYPE:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(676);
				selectItem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(679);
				match(COMMA_);
				setState(680);
				selectItem();
				}
				}
				setState(685);
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
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
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
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(686);
					columnName();
					}
					break;
				case 2:
					{
					setState(687);
					expr(0);
					}
					break;
				}
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (AS - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)) | (1L << (UNKNOWN - 119)) | (1L << (ALWAYS - 119)) | (1L << (CASCADE - 119)) | (1L << (GENERATED - 119)) | (1L << (PRIVILEGES - 119)) | (1L << (READ - 119)) | (1L << (WRITE - 119)) | (1L << (REFERENCES - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)) | (1L << (NATIONAL - 184)) | (1L << (NEW - 184)) | (1L << (NOORDER - 184)) | (1L << (NORELY - 184)) | (1L << (ONLY - 184)) | (1L << (PROFILE - 184)) | (1L << (REF - 184)))) != 0) || ((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & ((1L << (REKEY - 248)) | (1L << (RELY - 248)) | (1L << (REPLACE - 248)) | (1L << (SALT - 248)) | (1L << (SCOPE - 248)) | (1L << (SORT - 248)) | (1L << (SOURCE - 248)) | (1L << (SUBSTITUTABLE - 248)) | (1L << (TABLESPACE - 248)) | (1L << (TEMPORARY - 248)) | (1L << (TRANSLATION - 248)) | (1L << (TREAT - 248)) | (1L << (NO - 248)) | (1L << (TYPE - 248)) | (1L << (UNUSED - 248)) | (1L << (NOVALIDATE - 248)) | (1L << (VALUE - 248)) | (1L << (VARYING - 248)) | (1L << (VIRTUAL - 248)) | (1L << (ZONE - 248)) | (1L << (ADVISOR - 248)) | (1L << (ADMINISTER - 248)) | (1L << (TUNING - 248)) | (1L << (MANAGE - 248)) | (1L << (MANAGEMENT - 248)) | (1L << (OBJECT - 248)) | (1L << (CLUSTER - 248)) | (1L << (CONTEXT - 248)) | (1L << (EXEMPT - 248)) | (1L << (REDACTION - 248)) | (1L << (POLICY - 248)) | (1L << (DATABASE - 248)) | (1L << (SYSTEM - 248)) | (1L << (AUDIT - 248)) | (1L << (LINK - 248)) | (1L << (ANALYZE - 248)) | (1L << (DICTIONARY - 248)) | (1L << (DIMENSION - 248)) | (1L << (INDEXTYPE - 248)) | (1L << (EXTERNAL - 248)) | (1L << (JOB - 248)) | (1L << (CLASS - 248)) | (1L << (PROGRAM - 248)) | (1L << (SCHEDULER - 248)) | (1L << (LIBRARY - 248)) | (1L << (LOGMINING - 248)) | (1L << (MATERIALIZED - 248)) | (1L << (CUBE - 248)) | (1L << (MEASURE - 248)) | (1L << (FOLDER - 248)) | (1L << (BUILD - 248)) | (1L << (PROCESS - 248)) | (1L << (OPERATOR - 248)) | (1L << (OUTLINE - 248)) | (1L << (PLUGGABLE - 248)) | (1L << (CONTAINER - 248)))) != 0) || ((((_la - 312)) & ~0x3f) == 0 && ((1L << (_la - 312)) & ((1L << (SEGMENT - 312)) | (1L << (RESTRICTED - 312)) | (1L << (COST - 312)) | (1L << (SYNONYM - 312)) | (1L << (BACKUP - 312)) | (1L << (UNLIMITED - 312)) | (1L << (BECOME - 312)) | (1L << (CHANGE - 312)) | (1L << (NOTIFICATION - 312)) | (1L << (ACCESS - 312)) | (1L << (PRIVILEGE - 312)) | (1L << (PURGE - 312)) | (1L << (RESUMABLE - 312)) | (1L << (SYSGUID - 312)) | (1L << (SYSBACKUP - 312)) | (1L << (SYSDBA - 312)) | (1L << (SYSDG - 312)) | (1L << (SYSKM - 312)) | (1L << (SYSOPER - 312)) | (1L << (DBA_RECYCLEBIN - 312)) | (1L << (IDENTIFIER_ - 312)) | (1L << (STRING_ - 312)))) != 0)) {
					{
					setState(691);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(690);
						match(AS);
						}
					}

					setState(693);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
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
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_alias);
		try {
			setState(701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case TYPE:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				identifier_();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
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
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
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
			setState(703);
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
		public TerminalNode DOT_ASTERISK_() { return getToken(OracleStatementParser.DOT_ASTERISK_, 0); }
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
			setState(705);
			identifier_();
			setState(706);
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
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
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
			setState(708);
			match(FROM);
			setState(709);
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
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
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
			setState(711);
			tableReference();
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(712);
				match(COMMA_);
				setState(713);
				tableReference();
				}
				}
				setState(718);
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
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(722); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(719);
					tableFactor();
					setState(720);
					joinedTable();
					}
					}
					setState(724); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (LP_ - 29)) | (1L << (TRUNCATE - 29)) | (1L << (SCHEMA - 29)) | (1L << (FUNCTION - 29)) | (1L << (PROCEDURE - 29)) | (1L << (CASE - 29)) | (1L << (WHEN - 29)) | (1L << (CAST - 29)) | (1L << (TRIM - 29)) | (1L << (SUBSTRING - 29)) | (1L << (NATURAL - 29)) | (1L << (JOIN - 29)) | (1L << (FULL - 29)) | (1L << (INNER - 29)) | (1L << (OUTER - 29)) | (1L << (LEFT - 29)) | (1L << (RIGHT - 29)) | (1L << (CROSS - 29)) | (1L << (USING - 29)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (IF - 95)) | (1L << (TRUE - 95)) | (1L << (FALSE - 95)) | (1L << (LIMIT - 95)) | (1L << (OFFSET - 95)) | (1L << (BEGIN - 95)) | (1L << (COMMIT - 95)) | (1L << (ROLLBACK - 95)) | (1L << (SAVEPOINT - 95)) | (1L << (BOOLEAN - 95)) | (1L << (DOUBLE - 95)) | (1L << (CHARACTER - 95)) | (1L << (ARRAY - 95)) | (1L << (INTERVAL - 95)) | (1L << (TIME - 95)) | (1L << (TIMESTAMP - 95)) | (1L << (LOCALTIME - 95)) | (1L << (LOCALTIMESTAMP - 95)) | (1L << (YEAR - 95)) | (1L << (QUARTER - 95)) | (1L << (MONTH - 95)) | (1L << (WEEK - 95)) | (1L << (DAY - 95)) | (1L << (HOUR - 95)) | (1L << (MINUTE - 95)) | (1L << (SECOND - 95)) | (1L << (MICROSECOND - 95)) | (1L << (MAX - 95)) | (1L << (MIN - 95)) | (1L << (SUM - 95)) | (1L << (COUNT - 95)) | (1L << (AVG - 95)) | (1L << (ENABLE - 95)) | (1L << (DISABLE - 95)) | (1L << (PRESERVE - 95)) | (1L << (DO - 95)) | (1L << (DEFINER - 95)))) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & ((1L << (CURRENT_USER - 159)) | (1L << (SQL - 159)) | (1L << (CASCADED - 159)) | (1L << (LOCAL - 159)) | (1L << (CLOSE - 159)) | (1L << (OPEN - 159)) | (1L << (NEXT - 159)) | (1L << (NAME - 159)) | (1L << (BINARY - 159)) | (1L << (ESCAPE - 159)) | (1L << (MOD - 159)) | (1L << (XOR - 159)) | (1L << (UNKNOWN - 159)) | (1L << (ALWAYS - 159)) | (1L << (CASCADE - 159)) | (1L << (GENERATED - 159)) | (1L << (PRIVILEGES - 159)) | (1L << (READ - 159)) | (1L << (WRITE - 159)) | (1L << (REFERENCES - 159)) | (1L << (TRANSACTION - 159)) | (1L << (ROLE - 159)) | (1L << (VISIBLE - 159)) | (1L << (INVISIBLE - 159)) | (1L << (EXECUTE - 159)) | (1L << (USE - 159)) | (1L << (DEBUG - 159)) | (1L << (UNDER - 159)) | (1L << (FLASHBACK - 159)) | (1L << (ARCHIVE - 159)) | (1L << (REFRESH - 159)) | (1L << (QUERY - 159)) | (1L << (REWRITE - 159)) | (1L << (KEEP - 159)) | (1L << (SEQUENCE - 159)) | (1L << (INHERIT - 159)) | (1L << (TRANSLATE - 159)) | (1L << (MERGE - 159)) | (1L << (AT - 159)) | (1L << (BITMAP - 159)) | (1L << (CACHE - 159)) | (1L << (NOCACHE - 159)) | (1L << (CHECKPOINT - 159)) | (1L << (CONNECT - 159)) | (1L << (CONSTRAINTS - 159)) | (1L << (CYCLE - 159)) | (1L << (NOCYCLE - 159)) | (1L << (DBTIMEZONE - 159)) | (1L << (ENCRYPT - 159)) | (1L << (DECRYPT - 159)) | (1L << (DEFERRABLE - 159)) | (1L << (DEFERRED - 159)) | (1L << (EDITION - 159)) | (1L << (ELEMENT - 159)) | (1L << (END - 159)) | (1L << (EXCEPTIONS - 159)) | (1L << (FORCE - 159)))) != 0) || ((((_la - 223)) & ~0x3f) == 0 && ((1L << (_la - 223)) & ((1L << (GLOBAL - 223)) | (1L << (IDENTITY - 223)) | (1L << (INITIALLY - 223)) | (1L << (INVALIDATE - 223)) | (1L << (JAVA - 223)) | (1L << (LEVELS - 223)) | (1L << (MAXVALUE - 223)) | (1L << (MINVALUE - 223)) | (1L << (NOMAXVALUE - 223)) | (1L << (NOMINVALUE - 223)) | (1L << (MINING - 223)) | (1L << (MODEL - 223)) | (1L << (NATIONAL - 223)) | (1L << (NEW - 223)) | (1L << (NOORDER - 223)) | (1L << (NORELY - 223)) | (1L << (ONLY - 223)) | (1L << (PROFILE - 223)) | (1L << (REF - 223)) | (1L << (REKEY - 223)) | (1L << (RELY - 223)) | (1L << (REPLACE - 223)) | (1L << (SALT - 223)) | (1L << (SCOPE - 223)) | (1L << (SORT - 223)) | (1L << (SOURCE - 223)) | (1L << (SUBSTITUTABLE - 223)) | (1L << (TABLESPACE - 223)) | (1L << (TEMPORARY - 223)) | (1L << (TRANSLATION - 223)) | (1L << (TREAT - 223)) | (1L << (NO - 223)) | (1L << (TYPE - 223)) | (1L << (UNUSED - 223)) | (1L << (NOVALIDATE - 223)) | (1L << (VALUE - 223)) | (1L << (VARYING - 223)) | (1L << (VIRTUAL - 223)) | (1L << (ZONE - 223)) | (1L << (ADVISOR - 223)) | (1L << (ADMINISTER - 223)) | (1L << (TUNING - 223)) | (1L << (MANAGE - 223)) | (1L << (MANAGEMENT - 223)) | (1L << (OBJECT - 223)) | (1L << (CLUSTER - 223)) | (1L << (CONTEXT - 223)) | (1L << (EXEMPT - 223)) | (1L << (REDACTION - 223)) | (1L << (POLICY - 223)))) != 0) || ((((_la - 287)) & ~0x3f) == 0 && ((1L << (_la - 287)) & ((1L << (DATABASE - 287)) | (1L << (SYSTEM - 287)) | (1L << (AUDIT - 287)) | (1L << (LINK - 287)) | (1L << (ANALYZE - 287)) | (1L << (DICTIONARY - 287)) | (1L << (DIMENSION - 287)) | (1L << (INDEXTYPE - 287)) | (1L << (EXTERNAL - 287)) | (1L << (JOB - 287)) | (1L << (CLASS - 287)) | (1L << (PROGRAM - 287)) | (1L << (SCHEDULER - 287)) | (1L << (LIBRARY - 287)) | (1L << (LOGMINING - 287)) | (1L << (MATERIALIZED - 287)) | (1L << (CUBE - 287)) | (1L << (MEASURE - 287)) | (1L << (FOLDER - 287)) | (1L << (BUILD - 287)) | (1L << (PROCESS - 287)) | (1L << (OPERATOR - 287)) | (1L << (OUTLINE - 287)) | (1L << (PLUGGABLE - 287)) | (1L << (CONTAINER - 287)) | (1L << (SEGMENT - 287)) | (1L << (RESTRICTED - 287)) | (1L << (COST - 287)) | (1L << (SYNONYM - 287)) | (1L << (BACKUP - 287)) | (1L << (UNLIMITED - 287)) | (1L << (BECOME - 287)) | (1L << (CHANGE - 287)) | (1L << (NOTIFICATION - 287)) | (1L << (ACCESS - 287)) | (1L << (PRIVILEGE - 287)) | (1L << (PURGE - 287)) | (1L << (RESUMABLE - 287)) | (1L << (SYSGUID - 287)) | (1L << (SYSBACKUP - 287)) | (1L << (SYSDBA - 287)) | (1L << (SYSDG - 287)) | (1L << (SYSKM - 287)) | (1L << (SYSOPER - 287)) | (1L << (DBA_RECYCLEBIN - 287)) | (1L << (IDENTIFIER_ - 287)))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				tableFactor();
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NATURAL - 83)) | (1L << (JOIN - 83)) | (1L << (FULL - 83)) | (1L << (INNER - 83)) | (1L << (LEFT - 83)) | (1L << (RIGHT - 83)) | (1L << (CROSS - 83)))) != 0)) {
					{
					{
					setState(727);
					joinedTable();
					}
					}
					setState(732);
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
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
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
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				tableName();
				setState(740);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(736);
						match(AS);
						}
					}

					setState(739);
					alias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				subquery();
				setState(744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(743);
					columnNames();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(746);
				match(LP_);
				setState(747);
				tableReferences();
				setState(748);
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
		public TerminalNode JOIN() { return getToken(OracleStatementParser.JOIN, 0); }
		public TerminalNode NATURAL() { return getToken(OracleStatementParser.NATURAL, 0); }
		public JoinSpecificationContext joinSpecification() {
			return getRuleContext(JoinSpecificationContext.class,0);
		}
		public TerminalNode INNER() { return getToken(OracleStatementParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(OracleStatementParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(OracleStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(OracleStatementParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(OracleStatementParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(OracleStatementParser.OUTER, 0); }
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
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(752);
					match(NATURAL);
					}
				}

				{
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(755);
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

				setState(758);
				match(JOIN);
				}
				setState(760);
				tableFactor();
				setState(762);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(761);
					joinSpecification();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(764);
					match(NATURAL);
					}
				}

				setState(767);
				_la = _input.LA(1);
				if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (FULL - 85)) | (1L << (LEFT - 85)) | (1L << (RIGHT - 85)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(768);
					match(OUTER);
					}
				}

				setState(771);
				match(JOIN);
				setState(772);
				tableFactor();
				setState(774);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(773);
					joinSpecification();
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

	public static class JoinSpecificationContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
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
			setState(782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				match(ON);
				setState(779);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				match(USING);
				setState(781);
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
		public TerminalNode WHERE() { return getToken(OracleStatementParser.WHERE, 0); }
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
			setState(784);
			match(WHERE);
			setState(785);
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
		public TerminalNode GROUP() { return getToken(OracleStatementParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
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
			setState(787);
			match(GROUP);
			setState(788);
			match(BY);
			setState(789);
			orderByItem();
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(790);
				match(COMMA_);
				setState(791);
				orderByItem();
				}
				}
				setState(796);
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
		public TerminalNode HAVING() { return getToken(OracleStatementParser.HAVING, 0); }
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
			setState(797);
			match(HAVING);
			setState(798);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public UnionClause_Context unionClause_() {
			return getRuleContext(UnionClause_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
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
		enterRule(_localctx, 66, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(LP_);
			setState(801);
			unionClause_();
			setState(802);
			match(RP_);
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(803);
				match(AS);
				}
				break;
			}
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(806);
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
		public TerminalNode QUESTION_() { return getToken(OracleStatementParser.QUESTION_, 0); }
		public ParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMarker; }
	}

	public final ParameterMarkerContext parameterMarker() throws RecognitionException {
		ParameterMarkerContext _localctx = new ParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
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
		enterRule(_localctx, 70, RULE_literals);
		try {
			setState(818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				stringLiterals();
				}
				break;
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				numberLiterals();
				}
				break;
			case LBE_:
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(813);
				dateTimeLiterals();
				}
				break;
			case HEX_DIGIT_:
				enterOuterAlt(_localctx, 4);
				{
				setState(814);
				hexadecimalLiterals();
				}
				break;
			case BIT_NUM_:
				enterOuterAlt(_localctx, 5);
				{
				setState(815);
				bitValueLiterals();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(816);
				booleanLiterals();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(817);
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
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public StringLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiterals; }
	}

	public final StringLiteralsContext stringLiterals() throws RecognitionException {
		StringLiteralsContext _localctx = new StringLiteralsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_stringLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
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
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public NumberLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiterals; }
	}

	public final NumberLiteralsContext numberLiterals() throws RecognitionException {
		NumberLiteralsContext _localctx = new NumberLiteralsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_numberLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_) {
				{
				setState(822);
				match(MINUS_);
				}
			}

			setState(825);
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
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public TerminalNode DATE() { return getToken(OracleStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(OracleStatementParser.TIMESTAMP, 0); }
		public TerminalNode LBE_() { return getToken(OracleStatementParser.LBE_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode RBE_() { return getToken(OracleStatementParser.RBE_, 0); }
		public DateTimeLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeLiterals; }
	}

	public final DateTimeLiteralsContext dateTimeLiterals() throws RecognitionException {
		DateTimeLiteralsContext _localctx = new DateTimeLiteralsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dateTimeLiterals);
		int _la;
		try {
			setState(834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				_la = _input.LA(1);
				if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (DATE - 131)) | (1L << (TIME - 131)) | (1L << (TIMESTAMP - 131)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(828);
				match(STRING_);
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				match(LBE_);
				setState(830);
				identifier_();
				setState(831);
				match(STRING_);
				setState(832);
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
		public TerminalNode HEX_DIGIT_() { return getToken(OracleStatementParser.HEX_DIGIT_, 0); }
		public HexadecimalLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiterals; }
	}

	public final HexadecimalLiteralsContext hexadecimalLiterals() throws RecognitionException {
		HexadecimalLiteralsContext _localctx = new HexadecimalLiteralsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hexadecimalLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
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
		public TerminalNode BIT_NUM_() { return getToken(OracleStatementParser.BIT_NUM_, 0); }
		public BitValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitValueLiterals; }
	}

	public final BitValueLiteralsContext bitValueLiterals() throws RecognitionException {
		BitValueLiteralsContext _localctx = new BitValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_bitValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
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
		public TerminalNode TRUE() { return getToken(OracleStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OracleStatementParser.FALSE, 0); }
		public BooleanLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiterals; }
	}

	public final BooleanLiteralsContext booleanLiterals() throws RecognitionException {
		BooleanLiteralsContext _localctx = new BooleanLiteralsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_booleanLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
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
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public NullValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValueLiterals; }
	}

	public final NullValueLiteralsContext nullValueLiterals() throws RecognitionException {
		NullValueLiteralsContext _localctx = new NullValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_nullValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
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
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
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
		enterRule(_localctx, 86, RULE_identifier_);
		try {
			setState(846);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				match(IDENTIFIER_);
				}
				break;
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case TYPE:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
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
		public TerminalNode TRUNCATE() { return getToken(OracleStatementParser.TRUNCATE, 0); }
		public TerminalNode FUNCTION() { return getToken(OracleStatementParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(OracleStatementParser.PROCEDURE, 0); }
		public TerminalNode CASE() { return getToken(OracleStatementParser.CASE, 0); }
		public TerminalNode WHEN() { return getToken(OracleStatementParser.WHEN, 0); }
		public TerminalNode CAST() { return getToken(OracleStatementParser.CAST, 0); }
		public TerminalNode TRIM() { return getToken(OracleStatementParser.TRIM, 0); }
		public TerminalNode SUBSTRING() { return getToken(OracleStatementParser.SUBSTRING, 0); }
		public TerminalNode NATURAL() { return getToken(OracleStatementParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(OracleStatementParser.JOIN, 0); }
		public TerminalNode FULL() { return getToken(OracleStatementParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(OracleStatementParser.INNER, 0); }
		public TerminalNode OUTER() { return getToken(OracleStatementParser.OUTER, 0); }
		public TerminalNode LEFT() { return getToken(OracleStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(OracleStatementParser.RIGHT, 0); }
		public TerminalNode CROSS() { return getToken(OracleStatementParser.CROSS, 0); }
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public TerminalNode IF() { return getToken(OracleStatementParser.IF, 0); }
		public TerminalNode TRUE() { return getToken(OracleStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OracleStatementParser.FALSE, 0); }
		public TerminalNode LIMIT() { return getToken(OracleStatementParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(OracleStatementParser.OFFSET, 0); }
		public TerminalNode BEGIN() { return getToken(OracleStatementParser.BEGIN, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(OracleStatementParser.ROLLBACK, 0); }
		public TerminalNode SAVEPOINT() { return getToken(OracleStatementParser.SAVEPOINT, 0); }
		public TerminalNode BOOLEAN() { return getToken(OracleStatementParser.BOOLEAN, 0); }
		public TerminalNode DOUBLE() { return getToken(OracleStatementParser.DOUBLE, 0); }
		public TerminalNode CHARACTER() { return getToken(OracleStatementParser.CHARACTER, 0); }
		public TerminalNode ARRAY() { return getToken(OracleStatementParser.ARRAY, 0); }
		public TerminalNode INTERVAL() { return getToken(OracleStatementParser.INTERVAL, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(OracleStatementParser.TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(OracleStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(OracleStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode YEAR() { return getToken(OracleStatementParser.YEAR, 0); }
		public TerminalNode QUARTER() { return getToken(OracleStatementParser.QUARTER, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public TerminalNode WEEK() { return getToken(OracleStatementParser.WEEK, 0); }
		public TerminalNode DAY() { return getToken(OracleStatementParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(OracleStatementParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(OracleStatementParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode MICROSECOND() { return getToken(OracleStatementParser.MICROSECOND, 0); }
		public TerminalNode MAX() { return getToken(OracleStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(OracleStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(OracleStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(OracleStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(OracleStatementParser.AVG, 0); }
		public TerminalNode ENABLE() { return getToken(OracleStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(OracleStatementParser.DISABLE, 0); }
		public TerminalNode BINARY() { return getToken(OracleStatementParser.BINARY, 0); }
		public TerminalNode ESCAPE() { return getToken(OracleStatementParser.ESCAPE, 0); }
		public TerminalNode MOD() { return getToken(OracleStatementParser.MOD, 0); }
		public TerminalNode UNKNOWN() { return getToken(OracleStatementParser.UNKNOWN, 0); }
		public TerminalNode XOR() { return getToken(OracleStatementParser.XOR, 0); }
		public TerminalNode ALWAYS() { return getToken(OracleStatementParser.ALWAYS, 0); }
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode GENERATED() { return getToken(OracleStatementParser.GENERATED, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public TerminalNode READ() { return getToken(OracleStatementParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(OracleStatementParser.WRITE, 0); }
		public TerminalNode REFERENCES() { return getToken(OracleStatementParser.REFERENCES, 0); }
		public TerminalNode TRANSACTION() { return getToken(OracleStatementParser.TRANSACTION, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public TerminalNode VISIBLE() { return getToken(OracleStatementParser.VISIBLE, 0); }
		public TerminalNode INVISIBLE() { return getToken(OracleStatementParser.INVISIBLE, 0); }
		public TerminalNode EXECUTE() { return getToken(OracleStatementParser.EXECUTE, 0); }
		public TerminalNode USE() { return getToken(OracleStatementParser.USE, 0); }
		public TerminalNode DEBUG() { return getToken(OracleStatementParser.DEBUG, 0); }
		public TerminalNode UNDER() { return getToken(OracleStatementParser.UNDER, 0); }
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TerminalNode ARCHIVE() { return getToken(OracleStatementParser.ARCHIVE, 0); }
		public TerminalNode REFRESH() { return getToken(OracleStatementParser.REFRESH, 0); }
		public TerminalNode QUERY() { return getToken(OracleStatementParser.QUERY, 0); }
		public TerminalNode REWRITE() { return getToken(OracleStatementParser.REWRITE, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public TerminalNode SEQUENCE() { return getToken(OracleStatementParser.SEQUENCE, 0); }
		public TerminalNode INHERIT() { return getToken(OracleStatementParser.INHERIT, 0); }
		public TerminalNode TRANSLATE() { return getToken(OracleStatementParser.TRANSLATE, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode MERGE() { return getToken(OracleStatementParser.MERGE, 0); }
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode BITMAP() { return getToken(OracleStatementParser.BITMAP, 0); }
		public TerminalNode CACHE() { return getToken(OracleStatementParser.CACHE, 0); }
		public TerminalNode CHECKPOINT() { return getToken(OracleStatementParser.CHECKPOINT, 0); }
		public TerminalNode CONNECT() { return getToken(OracleStatementParser.CONNECT, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(OracleStatementParser.CONSTRAINTS, 0); }
		public TerminalNode CYCLE() { return getToken(OracleStatementParser.CYCLE, 0); }
		public TerminalNode DBTIMEZONE() { return getToken(OracleStatementParser.DBTIMEZONE, 0); }
		public TerminalNode ENCRYPT() { return getToken(OracleStatementParser.ENCRYPT, 0); }
		public TerminalNode DECRYPT() { return getToken(OracleStatementParser.DECRYPT, 0); }
		public TerminalNode DEFERRABLE() { return getToken(OracleStatementParser.DEFERRABLE, 0); }
		public TerminalNode DEFERRED() { return getToken(OracleStatementParser.DEFERRED, 0); }
		public TerminalNode EDITION() { return getToken(OracleStatementParser.EDITION, 0); }
		public TerminalNode ELEMENT() { return getToken(OracleStatementParser.ELEMENT, 0); }
		public TerminalNode END() { return getToken(OracleStatementParser.END, 0); }
		public TerminalNode EXCEPTIONS() { return getToken(OracleStatementParser.EXCEPTIONS, 0); }
		public TerminalNode FORCE() { return getToken(OracleStatementParser.FORCE, 0); }
		public TerminalNode GLOBAL() { return getToken(OracleStatementParser.GLOBAL, 0); }
		public TerminalNode IDENTITY() { return getToken(OracleStatementParser.IDENTITY, 0); }
		public TerminalNode INITIALLY() { return getToken(OracleStatementParser.INITIALLY, 0); }
		public TerminalNode INVALIDATE() { return getToken(OracleStatementParser.INVALIDATE, 0); }
		public TerminalNode JAVA() { return getToken(OracleStatementParser.JAVA, 0); }
		public TerminalNode LEVELS() { return getToken(OracleStatementParser.LEVELS, 0); }
		public TerminalNode LOCAL() { return getToken(OracleStatementParser.LOCAL, 0); }
		public TerminalNode MAXVALUE() { return getToken(OracleStatementParser.MAXVALUE, 0); }
		public TerminalNode MINVALUE() { return getToken(OracleStatementParser.MINVALUE, 0); }
		public TerminalNode NOMAXVALUE() { return getToken(OracleStatementParser.NOMAXVALUE, 0); }
		public TerminalNode NOMINVALUE() { return getToken(OracleStatementParser.NOMINVALUE, 0); }
		public TerminalNode MINING() { return getToken(OracleStatementParser.MINING, 0); }
		public TerminalNode MODEL() { return getToken(OracleStatementParser.MODEL, 0); }
		public TerminalNode NATIONAL() { return getToken(OracleStatementParser.NATIONAL, 0); }
		public TerminalNode NEW() { return getToken(OracleStatementParser.NEW, 0); }
		public TerminalNode NOCACHE() { return getToken(OracleStatementParser.NOCACHE, 0); }
		public TerminalNode NOCYCLE() { return getToken(OracleStatementParser.NOCYCLE, 0); }
		public TerminalNode NOORDER() { return getToken(OracleStatementParser.NOORDER, 0); }
		public TerminalNode NORELY() { return getToken(OracleStatementParser.NORELY, 0); }
		public TerminalNode NOVALIDATE() { return getToken(OracleStatementParser.NOVALIDATE, 0); }
		public TerminalNode ONLY() { return getToken(OracleStatementParser.ONLY, 0); }
		public TerminalNode PRESERVE() { return getToken(OracleStatementParser.PRESERVE, 0); }
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public TerminalNode REF() { return getToken(OracleStatementParser.REF, 0); }
		public TerminalNode REKEY() { return getToken(OracleStatementParser.REKEY, 0); }
		public TerminalNode RELY() { return getToken(OracleStatementParser.RELY, 0); }
		public TerminalNode REPLACE() { return getToken(OracleStatementParser.REPLACE, 0); }
		public TerminalNode SOURCE() { return getToken(OracleStatementParser.SOURCE, 0); }
		public TerminalNode SALT() { return getToken(OracleStatementParser.SALT, 0); }
		public TerminalNode SCOPE() { return getToken(OracleStatementParser.SCOPE, 0); }
		public TerminalNode SORT() { return getToken(OracleStatementParser.SORT, 0); }
		public TerminalNode SUBSTITUTABLE() { return getToken(OracleStatementParser.SUBSTITUTABLE, 0); }
		public TerminalNode TABLESPACE() { return getToken(OracleStatementParser.TABLESPACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(OracleStatementParser.TEMPORARY, 0); }
		public TerminalNode TRANSLATION() { return getToken(OracleStatementParser.TRANSLATION, 0); }
		public TerminalNode TREAT() { return getToken(OracleStatementParser.TREAT, 0); }
		public TerminalNode NO() { return getToken(OracleStatementParser.NO, 0); }
		public TerminalNode TYPE() { return getToken(OracleStatementParser.TYPE, 0); }
		public TerminalNode UNUSED() { return getToken(OracleStatementParser.UNUSED, 0); }
		public TerminalNode VALUE() { return getToken(OracleStatementParser.VALUE, 0); }
		public TerminalNode VARYING() { return getToken(OracleStatementParser.VARYING, 0); }
		public TerminalNode VIRTUAL() { return getToken(OracleStatementParser.VIRTUAL, 0); }
		public TerminalNode ZONE() { return getToken(OracleStatementParser.ZONE, 0); }
		public TerminalNode ADVISOR() { return getToken(OracleStatementParser.ADVISOR, 0); }
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public TerminalNode TUNING() { return getToken(OracleStatementParser.TUNING, 0); }
		public TerminalNode MANAGE() { return getToken(OracleStatementParser.MANAGE, 0); }
		public TerminalNode MANAGEMENT() { return getToken(OracleStatementParser.MANAGEMENT, 0); }
		public TerminalNode OBJECT() { return getToken(OracleStatementParser.OBJECT, 0); }
		public TerminalNode CLUSTER() { return getToken(OracleStatementParser.CLUSTER, 0); }
		public TerminalNode CONTEXT() { return getToken(OracleStatementParser.CONTEXT, 0); }
		public TerminalNode EXEMPT() { return getToken(OracleStatementParser.EXEMPT, 0); }
		public TerminalNode REDACTION() { return getToken(OracleStatementParser.REDACTION, 0); }
		public TerminalNode POLICY() { return getToken(OracleStatementParser.POLICY, 0); }
		public TerminalNode DATABASE() { return getToken(OracleStatementParser.DATABASE, 0); }
		public TerminalNode SYSTEM() { return getToken(OracleStatementParser.SYSTEM, 0); }
		public TerminalNode AUDIT() { return getToken(OracleStatementParser.AUDIT, 0); }
		public TerminalNode LINK() { return getToken(OracleStatementParser.LINK, 0); }
		public TerminalNode ANALYZE() { return getToken(OracleStatementParser.ANALYZE, 0); }
		public TerminalNode DICTIONARY() { return getToken(OracleStatementParser.DICTIONARY, 0); }
		public TerminalNode DIMENSION() { return getToken(OracleStatementParser.DIMENSION, 0); }
		public TerminalNode INDEXTYPE() { return getToken(OracleStatementParser.INDEXTYPE, 0); }
		public TerminalNode EXTERNAL() { return getToken(OracleStatementParser.EXTERNAL, 0); }
		public TerminalNode JOB() { return getToken(OracleStatementParser.JOB, 0); }
		public TerminalNode CLASS() { return getToken(OracleStatementParser.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(OracleStatementParser.PROGRAM, 0); }
		public TerminalNode SCHEDULER() { return getToken(OracleStatementParser.SCHEDULER, 0); }
		public TerminalNode LIBRARY() { return getToken(OracleStatementParser.LIBRARY, 0); }
		public TerminalNode LOGMINING() { return getToken(OracleStatementParser.LOGMINING, 0); }
		public TerminalNode MATERIALIZED() { return getToken(OracleStatementParser.MATERIALIZED, 0); }
		public TerminalNode CUBE() { return getToken(OracleStatementParser.CUBE, 0); }
		public TerminalNode MEASURE() { return getToken(OracleStatementParser.MEASURE, 0); }
		public TerminalNode FOLDER() { return getToken(OracleStatementParser.FOLDER, 0); }
		public TerminalNode BUILD() { return getToken(OracleStatementParser.BUILD, 0); }
		public TerminalNode PROCESS() { return getToken(OracleStatementParser.PROCESS, 0); }
		public TerminalNode OPERATOR() { return getToken(OracleStatementParser.OPERATOR, 0); }
		public TerminalNode OUTLINE() { return getToken(OracleStatementParser.OUTLINE, 0); }
		public TerminalNode PLUGGABLE() { return getToken(OracleStatementParser.PLUGGABLE, 0); }
		public TerminalNode CONTAINER() { return getToken(OracleStatementParser.CONTAINER, 0); }
		public TerminalNode SEGMENT() { return getToken(OracleStatementParser.SEGMENT, 0); }
		public TerminalNode RESTRICTED() { return getToken(OracleStatementParser.RESTRICTED, 0); }
		public TerminalNode COST() { return getToken(OracleStatementParser.COST, 0); }
		public TerminalNode SYNONYM() { return getToken(OracleStatementParser.SYNONYM, 0); }
		public TerminalNode BACKUP() { return getToken(OracleStatementParser.BACKUP, 0); }
		public TerminalNode UNLIMITED() { return getToken(OracleStatementParser.UNLIMITED, 0); }
		public TerminalNode BECOME() { return getToken(OracleStatementParser.BECOME, 0); }
		public TerminalNode CHANGE() { return getToken(OracleStatementParser.CHANGE, 0); }
		public TerminalNode NOTIFICATION() { return getToken(OracleStatementParser.NOTIFICATION, 0); }
		public TerminalNode ACCESS() { return getToken(OracleStatementParser.ACCESS, 0); }
		public TerminalNode PRIVILEGE() { return getToken(OracleStatementParser.PRIVILEGE, 0); }
		public TerminalNode PURGE() { return getToken(OracleStatementParser.PURGE, 0); }
		public TerminalNode RESUMABLE() { return getToken(OracleStatementParser.RESUMABLE, 0); }
		public TerminalNode SYSGUID() { return getToken(OracleStatementParser.SYSGUID, 0); }
		public TerminalNode SYSBACKUP() { return getToken(OracleStatementParser.SYSBACKUP, 0); }
		public TerminalNode SYSDBA() { return getToken(OracleStatementParser.SYSDBA, 0); }
		public TerminalNode SYSDG() { return getToken(OracleStatementParser.SYSDG, 0); }
		public TerminalNode SYSKM() { return getToken(OracleStatementParser.SYSKM, 0); }
		public TerminalNode SYSOPER() { return getToken(OracleStatementParser.SYSOPER, 0); }
		public TerminalNode DBA_RECYCLEBIN() { return getToken(OracleStatementParser.DBA_RECYCLEBIN, 0); }
		public TerminalNode SCHEMA() { return getToken(OracleStatementParser.SCHEMA, 0); }
		public TerminalNode DO() { return getToken(OracleStatementParser.DO, 0); }
		public TerminalNode DEFINER() { return getToken(OracleStatementParser.DEFINER, 0); }
		public TerminalNode CURRENT_USER() { return getToken(OracleStatementParser.CURRENT_USER, 0); }
		public TerminalNode CASCADED() { return getToken(OracleStatementParser.CASCADED, 0); }
		public TerminalNode CLOSE() { return getToken(OracleStatementParser.CLOSE, 0); }
		public TerminalNode OPEN() { return getToken(OracleStatementParser.OPEN, 0); }
		public TerminalNode NEXT() { return getToken(OracleStatementParser.NEXT, 0); }
		public TerminalNode NAME() { return getToken(OracleStatementParser.NAME, 0); }
		public UnreservedWord_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedWord_; }
	}

	public final UnreservedWord_Context unreservedWord_() throws RecognitionException {
		UnreservedWord_Context _localctx = new UnreservedWord_Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_unreservedWord_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)) | (1L << (UNKNOWN - 119)) | (1L << (ALWAYS - 119)) | (1L << (CASCADE - 119)) | (1L << (GENERATED - 119)) | (1L << (PRIVILEGES - 119)) | (1L << (READ - 119)) | (1L << (WRITE - 119)) | (1L << (REFERENCES - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)) | (1L << (NATIONAL - 184)) | (1L << (NEW - 184)) | (1L << (NOORDER - 184)) | (1L << (NORELY - 184)) | (1L << (ONLY - 184)) | (1L << (PROFILE - 184)) | (1L << (REF - 184)))) != 0) || ((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & ((1L << (REKEY - 248)) | (1L << (RELY - 248)) | (1L << (REPLACE - 248)) | (1L << (SALT - 248)) | (1L << (SCOPE - 248)) | (1L << (SORT - 248)) | (1L << (SOURCE - 248)) | (1L << (SUBSTITUTABLE - 248)) | (1L << (TABLESPACE - 248)) | (1L << (TEMPORARY - 248)) | (1L << (TRANSLATION - 248)) | (1L << (TREAT - 248)) | (1L << (NO - 248)) | (1L << (TYPE - 248)) | (1L << (UNUSED - 248)) | (1L << (NOVALIDATE - 248)) | (1L << (VALUE - 248)) | (1L << (VARYING - 248)) | (1L << (VIRTUAL - 248)) | (1L << (ZONE - 248)) | (1L << (ADVISOR - 248)) | (1L << (ADMINISTER - 248)) | (1L << (TUNING - 248)) | (1L << (MANAGE - 248)) | (1L << (MANAGEMENT - 248)) | (1L << (OBJECT - 248)) | (1L << (CLUSTER - 248)) | (1L << (CONTEXT - 248)) | (1L << (EXEMPT - 248)) | (1L << (REDACTION - 248)) | (1L << (POLICY - 248)) | (1L << (DATABASE - 248)) | (1L << (SYSTEM - 248)) | (1L << (AUDIT - 248)) | (1L << (LINK - 248)) | (1L << (ANALYZE - 248)) | (1L << (DICTIONARY - 248)) | (1L << (DIMENSION - 248)) | (1L << (INDEXTYPE - 248)) | (1L << (EXTERNAL - 248)) | (1L << (JOB - 248)) | (1L << (CLASS - 248)) | (1L << (PROGRAM - 248)) | (1L << (SCHEDULER - 248)) | (1L << (LIBRARY - 248)) | (1L << (LOGMINING - 248)) | (1L << (MATERIALIZED - 248)) | (1L << (CUBE - 248)) | (1L << (MEASURE - 248)) | (1L << (FOLDER - 248)) | (1L << (BUILD - 248)) | (1L << (PROCESS - 248)) | (1L << (OPERATOR - 248)) | (1L << (OUTLINE - 248)) | (1L << (PLUGGABLE - 248)) | (1L << (CONTAINER - 248)))) != 0) || ((((_la - 312)) & ~0x3f) == 0 && ((1L << (_la - 312)) & ((1L << (SEGMENT - 312)) | (1L << (RESTRICTED - 312)) | (1L << (COST - 312)) | (1L << (SYNONYM - 312)) | (1L << (BACKUP - 312)) | (1L << (UNLIMITED - 312)) | (1L << (BECOME - 312)) | (1L << (CHANGE - 312)) | (1L << (NOTIFICATION - 312)) | (1L << (ACCESS - 312)) | (1L << (PRIVILEGE - 312)) | (1L << (PURGE - 312)) | (1L << (RESUMABLE - 312)) | (1L << (SYSGUID - 312)) | (1L << (SYSBACKUP - 312)) | (1L << (SYSDBA - 312)) | (1L << (SYSDG - 312)) | (1L << (SYSKM - 312)) | (1L << (SYSOPER - 312)) | (1L << (DBA_RECYCLEBIN - 312)))) != 0)) ) {
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
		enterRule(_localctx, 90, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
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
		public TerminalNode DOT_() { return getToken(OracleStatementParser.DOT_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(852);
				owner();
				setState(853);
				match(DOT_);
				}
				break;
			}
			setState(857);
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
		public TerminalNode DOT_() { return getToken(OracleStatementParser.DOT_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(859);
				owner();
				setState(860);
				match(DOT_);
				}
				break;
			}
			setState(864);
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
		enterRule(_localctx, 96, RULE_owner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
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
		enterRule(_localctx, 98, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
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
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_columnNames);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(870);
				match(LP_);
				}
			}

			setState(873);
			columnName();
			setState(878);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(874);
					match(COMMA_);
					setState(875);
					columnName();
					}
					} 
				}
				setState(880);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(881);
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

	public static class TableNamesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(884);
				match(LP_);
				}
			}

			setState(887);
			tableName();
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(888);
				match(COMMA_);
				setState(889);
				tableName();
				}
				}
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(895);
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
		enterRule(_localctx, 104, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
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

	public static class OracleIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(OracleStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(OracleStatementParser.STRING_, i);
		}
		public List<TerminalNode> DOT_() { return getTokens(OracleStatementParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(OracleStatementParser.DOT_, i);
		}
		public OracleIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oracleId; }
	}

	public final OracleIdContext oracleId() throws RecognitionException {
		OracleIdContext _localctx = new OracleIdContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_oracleId);
		try {
			int _alt;
			setState(909);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				match(IDENTIFIER_);
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(901);
						match(STRING_);
						setState(902);
						match(DOT_);
						}
						} 
					}
					setState(907);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(908);
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

	public static class CollationNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_collationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(OracleStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(OracleStatementParser.NUMBER_, i);
		}
		public TerminalNode COMMA_() { return getToken(OracleStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(LP_);
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER_) {
				{
				setState(914);
				match(NUMBER_);
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(915);
					match(COMMA_);
					setState(916);
					match(NUMBER_);
					}
				}

				}
			}

			setState(921);
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
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(OracleStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(923);
				match(PRIMARY);
				}
			}

			setState(926);
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

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			expr(0);
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(929);
				match(COMMA_);
				setState(930);
				expr(0);
				}
				}
				setState(935);
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

	public static class ExprListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_exprList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(LP_);
			setState(937);
			exprs();
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(941);
				notOperator_();
				setState(942);
				expr(3);
				}
				break;
			case 2:
				{
				setState(944);
				match(LP_);
				setState(945);
				expr(0);
				setState(946);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(948);
				booleanPrimary_(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(957);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(951);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(952);
					logicalOperator();
					setState(953);
					expr(5);
					}
					} 
				}
				setState(959);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
		public TerminalNode OR() { return getToken(OracleStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(OracleStatementParser.OR_, 0); }
		public TerminalNode AND() { return getToken(OracleStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(OracleStatementParser.AND_, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
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
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(OracleStatementParser.NOT_, 0); }
		public NotOperator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator_; }
	}

	public final NotOperator_Context notOperator_() throws RecognitionException {
		NotOperator_Context _localctx = new NotOperator_Context(_ctx, getState());
		enterRule(_localctx, 122, RULE_notOperator_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
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
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(OracleStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OracleStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(OracleStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(OracleStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
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
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_booleanPrimary_, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(965);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(987);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(985);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(967);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(968);
						match(IS);
						setState(970);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(969);
							match(NOT);
							}
						}

						setState(972);
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
						setState(973);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(974);
						match(SAFE_EQ_);
						setState(975);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(976);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(977);
						comparisonOperator();
						setState(978);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(980);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(981);
						comparisonOperator();
						setState(982);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(983);
						subquery();
						}
						break;
					}
					} 
				}
				setState(989);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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
		public TerminalNode EQ_() { return getToken(OracleStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(OracleStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(OracleStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(OracleStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(OracleStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(OracleStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
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
		public TerminalNode IN() { return getToken(OracleStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(OracleStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(OracleStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(OracleStatementParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(OracleStatementParser.ESCAPE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_predicate);
		int _la;
		try {
			setState(1035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(992);
				bitExpr(0);
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(993);
					match(NOT);
					}
				}

				setState(996);
				match(IN);
				setState(997);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				bitExpr(0);
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1000);
					match(NOT);
					}
				}

				setState(1003);
				match(IN);
				setState(1004);
				match(LP_);
				setState(1005);
				expr(0);
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1006);
					match(COMMA_);
					setState(1007);
					expr(0);
					}
					}
					setState(1012);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1013);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1015);
				bitExpr(0);
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1016);
					match(NOT);
					}
				}

				setState(1019);
				match(BETWEEN);
				setState(1020);
				bitExpr(0);
				setState(1021);
				match(AND);
				setState(1022);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1024);
				bitExpr(0);
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1025);
					match(NOT);
					}
				}

				setState(1028);
				match(LIKE);
				setState(1029);
				simpleExpr(0);
				setState(1032);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(1030);
					match(ESCAPE);
					setState(1031);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1034);
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
		public TerminalNode VERTICAL_BAR_() { return getToken(OracleStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(OracleStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(OracleStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(OracleStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(OracleStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(OracleStatementParser.SLASH_, 0); }
		public TerminalNode MOD_() { return getToken(OracleStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(OracleStatementParser.CARET_, 0); }
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
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1038);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1072);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1070);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1040);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1041);
						match(VERTICAL_BAR_);
						setState(1042);
						bitExpr(12);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1043);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1044);
						match(AMPERSAND_);
						setState(1045);
						bitExpr(11);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1046);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1047);
						match(SIGNED_LEFT_SHIFT_);
						setState(1048);
						bitExpr(10);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1049);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1050);
						match(SIGNED_RIGHT_SHIFT_);
						setState(1051);
						bitExpr(9);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1052);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1053);
						match(PLUS_);
						setState(1054);
						bitExpr(8);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1055);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1056);
						match(MINUS_);
						setState(1057);
						bitExpr(7);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1058);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1059);
						match(ASTERISK_);
						setState(1060);
						bitExpr(6);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1061);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1062);
						match(SLASH_);
						setState(1063);
						bitExpr(5);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1064);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1065);
						match(MOD_);
						setState(1066);
						bitExpr(4);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1067);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1068);
						match(CARET_);
						setState(1069);
						bitExpr(3);
						}
						break;
					}
					} 
				}
				setState(1074);
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
		public TerminalNode PLUS_() { return getToken(OracleStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(OracleStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(OracleStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(OracleStatementParser.BINARY, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ROW() { return getToken(OracleStatementParser.ROW, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(OracleStatementParser.EXISTS, 0); }
		public TerminalNode LBE_() { return getToken(OracleStatementParser.LBE_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode RBE_() { return getToken(OracleStatementParser.RBE_, 0); }
		public CaseExpression_Context caseExpression_() {
			return getRuleContext(CaseExpression_Context.class,0);
		}
		public PrivateExprOfDbContext privateExprOfDb() {
			return getRuleContext(PrivateExprOfDbContext.class,0);
		}
		public TerminalNode OR_() { return getToken(OracleStatementParser.OR_, 0); }
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
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(1076);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1077);
				parameterMarker();
				}
				break;
			case 3:
				{
				setState(1078);
				literals();
				}
				break;
			case 4:
				{
				setState(1079);
				columnName();
				}
				break;
			case 5:
				{
				setState(1080);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_))) != 0) || _la==BINARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1081);
				simpleExpr(6);
				}
				break;
			case 6:
				{
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1082);
					match(ROW);
					}
				}

				setState(1085);
				match(LP_);
				setState(1086);
				expr(0);
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1087);
					match(COMMA_);
					setState(1088);
					expr(0);
					}
					}
					setState(1093);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1094);
				match(RP_);
				}
				break;
			case 7:
				{
				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS) {
					{
					setState(1096);
					match(EXISTS);
					}
				}

				setState(1099);
				subquery();
				}
				break;
			case 8:
				{
				setState(1100);
				match(LBE_);
				setState(1101);
				identifier_();
				setState(1102);
				expr(0);
				setState(1103);
				match(RBE_);
				}
				break;
			case 9:
				{
				setState(1105);
				caseExpression_();
				}
				break;
			case 10:
				{
				setState(1106);
				privateExprOfDb();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
					setState(1109);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(1110);
					match(OR_);
					setState(1111);
					simpleExpr(8);
					}
					} 
				}
				setState(1116);
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
		enterRule(_localctx, 134, RULE_functionCall);
		try {
			setState(1120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1117);
				aggregationFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1118);
				specialFunction_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1119);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			aggregationFunctionName_();
			setState(1123);
			match(LP_);
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1124);
				distinct();
				}
			}

			setState(1136);
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
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHAR:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case TYPE:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
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
				}
				break;
			case ASTERISK_:
				{
				setState(1135);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1138);
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
		public TerminalNode MAX() { return getToken(OracleStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(OracleStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(OracleStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(OracleStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(OracleStatementParser.AVG, 0); }
		public AggregationFunctionName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionName_; }
	}

	public final AggregationFunctionName_Context aggregationFunctionName_() throws RecognitionException {
		AggregationFunctionName_Context _localctx = new AggregationFunctionName_Context(_ctx, getState());
		enterRule(_localctx, 138, RULE_aggregationFunctionName_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
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
		public TerminalNode DISTINCT() { return getToken(OracleStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
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
		enterRule(_localctx, 142, RULE_specialFunction_);
		try {
			setState(1146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1144);
				castFunction_();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1145);
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
		public TerminalNode CAST() { return getToken(OracleStatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public CastFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction_; }
	}

	public final CastFunction_Context castFunction_() throws RecognitionException {
		CastFunction_Context _localctx = new CastFunction_Context(_ctx, getState());
		enterRule(_localctx, 144, RULE_castFunction_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			match(CAST);
			setState(1149);
			match(LP_);
			setState(1150);
			expr(0);
			setState(1151);
			match(AS);
			setState(1152);
			dataType();
			setState(1153);
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
		public TerminalNode CHAR() { return getToken(OracleStatementParser.CHAR, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
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
		enterRule(_localctx, 146, RULE_charFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(CHAR);
			setState(1156);
			match(LP_);
			setState(1157);
			expr(0);
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1158);
				match(COMMA_);
				setState(1159);
				expr(0);
				}
				}
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1165);
				match(USING);
				setState(1166);
				ignoredIdentifier_();
				}
			}

			setState(1169);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public RegularFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction_; }
	}

	public final RegularFunction_Context regularFunction_() throws RecognitionException {
		RegularFunction_Context _localctx = new RegularFunction_Context(_ctx, getState());
		enterRule(_localctx, 148, RULE_regularFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			regularFunctionName_();
			setState(1172);
			match(LP_);
			setState(1182);
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
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHAR:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case TYPE:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1173);
				expr(0);
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1174);
					match(COMMA_);
					setState(1175);
					expr(0);
					}
					}
					setState(1180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1181);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1184);
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
		public TerminalNode IF() { return getToken(OracleStatementParser.IF, 0); }
		public TerminalNode LOCALTIME() { return getToken(OracleStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(OracleStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(OracleStatementParser.INTERVAL, 0); }
		public RegularFunctionName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionName_; }
	}

	public final RegularFunctionName_Context regularFunctionName_() throws RecognitionException {
		RegularFunctionName_Context _localctx = new RegularFunctionName_Context(_ctx, getState());
		enterRule(_localctx, 150, RULE_regularFunctionName_);
		try {
			setState(1191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1186);
				identifier_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1187);
				match(IF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1188);
				match(LOCALTIME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1189);
				match(LOCALTIMESTAMP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1190);
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
		public TerminalNode CASE() { return getToken(OracleStatementParser.CASE, 0); }
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
		enterRule(_localctx, 152, RULE_caseExpression_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			match(CASE);
			setState(1195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1194);
				simpleExpr(0);
				}
				break;
			}
			setState(1198); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1197);
					caseWhen_();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1200); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1202);
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
		public TerminalNode WHEN() { return getToken(OracleStatementParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(OracleStatementParser.THEN, 0); }
		public CaseWhen_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen_; }
	}

	public final CaseWhen_Context caseWhen_() throws RecognitionException {
		CaseWhen_Context _localctx = new CaseWhen_Context(_ctx, getState());
		enterRule(_localctx, 154, RULE_caseWhen_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			match(WHEN);
			setState(1206);
			expr(0);
			setState(1207);
			match(THEN);
			setState(1208);
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
		public TerminalNode ELSE() { return getToken(OracleStatementParser.ELSE, 0); }
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
		enterRule(_localctx, 156, RULE_caseElse_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			match(ELSE);
			setState(1211);
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
		public TerminalNode ORDER() { return getToken(OracleStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			match(ORDER);
			setState(1214);
			match(BY);
			setState(1215);
			orderByItem();
			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1216);
				match(COMMA_);
				setState(1217);
				orderByItem();
				}
				}
				setState(1222);
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
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1223);
				columnName();
				}
				break;
			case 2:
				{
				setState(1224);
				numberLiterals();
				}
				break;
			case 3:
				{
				setState(1225);
				expr(0);
				}
				break;
			}
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1228);
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

	public static class AttributeNameContext extends ParserRuleContext {
		public OracleIdContext oracleId() {
			return getRuleContext(OracleIdContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			oracleId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexTypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public IndexTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexTypeName; }
	}

	public final IndexTypeNameContext indexTypeName() throws RecognitionException {
		IndexTypeNameContext _localctx = new IndexTypeNameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_indexTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
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

	public static class SimpleExprsContext extends ParserRuleContext {
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public SimpleExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExprs; }
	}

	public final SimpleExprsContext simpleExprs() throws RecognitionException {
		SimpleExprsContext _localctx = new SimpleExprsContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_simpleExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			simpleExpr(0);
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1236);
				match(COMMA_);
				setState(1237);
				simpleExpr(0);
				}
				}
				setState(1242);
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

	public static class LobItemContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public LobItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItem; }
	}

	public final LobItemContext lobItem() throws RecognitionException {
		LobItemContext _localctx = new LobItemContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_lobItem);
		try {
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1243);
				attributeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1244);
				columnName();
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

	public static class LobItemsContext extends ParserRuleContext {
		public List<LobItemContext> lobItem() {
			return getRuleContexts(LobItemContext.class);
		}
		public LobItemContext lobItem(int i) {
			return getRuleContext(LobItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public LobItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItems; }
	}

	public final LobItemsContext lobItems() throws RecognitionException {
		LobItemsContext _localctx = new LobItemsContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_lobItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			lobItem();
			setState(1252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1248);
				match(COMMA_);
				setState(1249);
				lobItem();
				}
				}
				setState(1254);
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

	public static class LobItemListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public LobItemsContext lobItems() {
			return getRuleContext(LobItemsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public LobItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItemList; }
	}

	public final LobItemListContext lobItemList() throws RecognitionException {
		LobItemListContext _localctx = new LobItemListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_lobItemList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			match(LP_);
			setState(1256);
			lobItems();
			setState(1257);
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public SpecialDatatypeContext specialDatatype() {
			return getRuleContext(SpecialDatatypeContext.class,0);
		}
		public DatetimeTypeSuffixContext datetimeTypeSuffix() {
			return getRuleContext(DatetimeTypeSuffixContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_dataType);
		int _la;
		try {
			setState(1270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1259);
				dataTypeName_();
				setState(1261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1260);
					dataTypeLength();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1263);
				specialDatatype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1264);
				dataTypeName_();
				setState(1266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1265);
					dataTypeLength();
					}
				}

				setState(1268);
				datetimeTypeSuffix();
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

	public static class SpecialDatatypeContext extends ParserRuleContext {
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode NATIONAL() { return getToken(OracleStatementParser.NATIONAL, 0); }
		public TerminalNode VARYING() { return getToken(OracleStatementParser.VARYING, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SpecialDatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialDatatype; }
	}

	public final SpecialDatatypeContext specialDatatype() throws RecognitionException {
		SpecialDatatypeContext _localctx = new SpecialDatatypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_specialDatatype);
		int _la;
		try {
			setState(1295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				dataTypeName_();
				{
				setState(1273);
				match(LP_);
				setState(1274);
				match(NUMBER_);
				setState(1275);
				match(IDENTIFIER_);
				setState(1276);
				match(RP_);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1278);
				match(NATIONAL);
				setState(1279);
				dataTypeName_();
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARYING) {
					{
					setState(1280);
					match(VARYING);
					}
				}

				setState(1283);
				match(LP_);
				setState(1284);
				match(NUMBER_);
				setState(1285);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1287);
				dataTypeName_();
				setState(1289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1288);
					match(LP_);
					}
				}

				setState(1291);
				columnName();
				setState(1293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1292);
					match(RP_);
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
		public List<TerminalNode> IDENTIFIER_() { return getTokens(OracleStatementParser.IDENTIFIER_); }
		public TerminalNode IDENTIFIER_(int i) {
			return getToken(OracleStatementParser.IDENTIFIER_, i);
		}
		public DataTypeName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName_; }
	}

	public final DataTypeName_Context dataTypeName_() throws RecognitionException {
		DataTypeName_Context _localctx = new DataTypeName_Context(_ctx, getState());
		enterRule(_localctx, 178, RULE_dataTypeName_);
		try {
			setState(1300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1297);
				match(IDENTIFIER_);
				setState(1298);
				match(IDENTIFIER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1299);
				match(IDENTIFIER_);
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

	public static class DatetimeTypeSuffixContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(OracleStatementParser.ZONE, 0); }
		public TerminalNode LOCAL() { return getToken(OracleStatementParser.LOCAL, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DatetimeTypeSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeTypeSuffix; }
	}

	public final DatetimeTypeSuffixContext datetimeTypeSuffix() throws RecognitionException {
		DatetimeTypeSuffixContext _localctx = new DatetimeTypeSuffixContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_datetimeTypeSuffix);
		int _la;
		try {
			setState(1319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1302);
					match(WITH);
					setState(1304);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LOCAL) {
						{
						setState(1303);
						match(LOCAL);
						}
					}

					setState(1306);
					match(TIME);
					setState(1307);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1310);
				match(TO);
				setState(1311);
				match(MONTH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1312);
				match(TO);
				setState(1313);
				match(SECOND);
				setState(1317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1314);
					match(LP_);
					setState(1315);
					match(NUMBER_);
					setState(1316);
					match(RP_);
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

	public static class TreatFunctionContext extends ParserRuleContext {
		public TerminalNode TREAT() { return getToken(OracleStatementParser.TREAT, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode REF() { return getToken(OracleStatementParser.REF, 0); }
		public TreatFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treatFunction; }
	}

	public final TreatFunctionContext treatFunction() throws RecognitionException {
		TreatFunctionContext _localctx = new TreatFunctionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_treatFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			match(TREAT);
			setState(1322);
			match(LP_);
			setState(1323);
			expr(0);
			setState(1324);
			match(AS);
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(1325);
				match(REF);
				}
			}

			setState(1328);
			dataTypeName_();
			setState(1329);
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

	public static class PrivateExprOfDbContext extends ParserRuleContext {
		public TreatFunctionContext treatFunction() {
			return getRuleContext(TreatFunctionContext.class,0);
		}
		public CaseExprContext caseExpr() {
			return getRuleContext(CaseExprContext.class,0);
		}
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public ObjectAccessExpressionContext objectAccessExpression() {
			return getRuleContext(ObjectAccessExpressionContext.class,0);
		}
		public ConstructorExprContext constructorExpr() {
			return getRuleContext(ConstructorExprContext.class,0);
		}
		public PrivateExprOfDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateExprOfDb; }
	}

	public final PrivateExprOfDbContext privateExprOfDb() throws RecognitionException {
		PrivateExprOfDbContext _localctx = new PrivateExprOfDbContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_privateExprOfDb);
		try {
			setState(1336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1331);
				treatFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1332);
				caseExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1333);
				intervalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1334);
				objectAccessExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1335);
				constructorExpr();
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

	public static class CaseExprContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(OracleStatementParser.CASE, 0); }
		public TerminalNode END() { return getToken(OracleStatementParser.END, 0); }
		public SimpleCaseExprContext simpleCaseExpr() {
			return getRuleContext(SimpleCaseExprContext.class,0);
		}
		public SearchedCaseExprContext searchedCaseExpr() {
			return getRuleContext(SearchedCaseExprContext.class,0);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public CaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpr; }
	}

	public final CaseExprContext caseExpr() throws RecognitionException {
		CaseExprContext _localctx = new CaseExprContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_caseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			match(CASE);
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1339);
				simpleCaseExpr();
				}
				break;
			case 2:
				{
				setState(1340);
				searchedCaseExpr();
				}
				break;
			}
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1343);
				elseClause();
				}
			}

			setState(1346);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleCaseExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SearchedCaseExprContext> searchedCaseExpr() {
			return getRuleContexts(SearchedCaseExprContext.class);
		}
		public SearchedCaseExprContext searchedCaseExpr(int i) {
			return getRuleContext(SearchedCaseExprContext.class,i);
		}
		public SimpleCaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCaseExpr; }
	}

	public final SimpleCaseExprContext simpleCaseExpr() throws RecognitionException {
		SimpleCaseExprContext _localctx = new SimpleCaseExprContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_simpleCaseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			expr(0);
			setState(1350); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1349);
				searchedCaseExpr();
				}
				}
				setState(1352); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchedCaseExprContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(OracleStatementParser.WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(OracleStatementParser.THEN, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public SearchedCaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchedCaseExpr; }
	}

	public final SearchedCaseExprContext searchedCaseExpr() throws RecognitionException {
		SearchedCaseExprContext _localctx = new SearchedCaseExprContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_searchedCaseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			match(WHEN);
			setState(1355);
			expr(0);
			setState(1356);
			match(THEN);
			setState(1357);
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

	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(OracleStatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			match(ELSE);
			setState(1360);
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

	public static class IntervalExpressionContext extends ParserRuleContext {
		public List<TerminalNode> LP_() { return getTokens(OracleStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(OracleStatementParser.LP_, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public List<TerminalNode> RP_() { return getTokens(OracleStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(OracleStatementParser.RP_, i);
		}
		public TerminalNode DAY() { return getToken(OracleStatementParser.DAY, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode YEAR() { return getToken(OracleStatementParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(OracleStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(OracleStatementParser.NUMBER_, i);
		}
		public IntervalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpression; }
	}

	public final IntervalExpressionContext intervalExpression() throws RecognitionException {
		IntervalExpressionContext _localctx = new IntervalExpressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_intervalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			match(LP_);
			setState(1363);
			expr(0);
			setState(1364);
			match(MINUS_);
			setState(1365);
			expr(0);
			setState(1366);
			match(RP_);
			setState(1388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DAY:
				{
				setState(1367);
				match(DAY);
				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1368);
					match(LP_);
					setState(1369);
					match(NUMBER_);
					setState(1370);
					match(RP_);
					}
				}

				setState(1373);
				match(TO);
				setState(1374);
				match(SECOND);
				setState(1378);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1375);
					match(LP_);
					setState(1376);
					match(NUMBER_);
					setState(1377);
					match(RP_);
					}
					break;
				}
				}
				break;
			case YEAR:
				{
				setState(1380);
				match(YEAR);
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1381);
					match(LP_);
					setState(1382);
					match(NUMBER_);
					setState(1383);
					match(RP_);
					}
				}

				setState(1386);
				match(TO);
				setState(1387);
				match(MONTH);
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

	public static class ObjectAccessExpressionContext extends ParserRuleContext {
		public List<TerminalNode> DOT_() { return getTokens(OracleStatementParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(OracleStatementParser.DOT_, i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TreatFunctionContext treatFunction() {
			return getRuleContext(TreatFunctionContext.class,0);
		}
		public List<AttributeNameContext> attributeName() {
			return getRuleContexts(AttributeNameContext.class);
		}
		public AttributeNameContext attributeName(int i) {
			return getRuleContext(AttributeNameContext.class,i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ObjectAccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectAccessExpression; }
	}

	public final ObjectAccessExpressionContext objectAccessExpression() throws RecognitionException {
		ObjectAccessExpressionContext _localctx = new ObjectAccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_objectAccessExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				{
				setState(1390);
				match(LP_);
				setState(1391);
				simpleExpr(0);
				setState(1392);
				match(RP_);
				}
				break;
			case TREAT:
				{
				setState(1394);
				treatFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1397);
			match(DOT_);
			setState(1411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1398);
				attributeName();
				setState(1403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1399);
						match(DOT_);
						setState(1400);
						attributeName();
						}
						} 
					}
					setState(1405);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
				}
				setState(1408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1406);
					match(DOT_);
					setState(1407);
					functionCall();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1410);
				functionCall();
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

	public static class ConstructorExprContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(OracleStatementParser.NEW, 0); }
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ConstructorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorExpr; }
	}

	public final ConstructorExprContext constructorExpr() throws RecognitionException {
		ConstructorExprContext _localctx = new ConstructorExprContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_constructorExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			match(NEW);
			setState(1414);
			dataTypeName_();
			setState(1415);
			exprList();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public IgnoredIdentifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier_; }
	}

	public final IgnoredIdentifier_Context ignoredIdentifier_() throws RecognitionException {
		IgnoredIdentifier_Context _localctx = new IgnoredIdentifier_Context(_ctx, getState());
		enterRule(_localctx, 200, RULE_ignoredIdentifier_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
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
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public IgnoredIdentifiers_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers_; }
	}

	public final IgnoredIdentifiers_Context ignoredIdentifiers_() throws RecognitionException {
		IgnoredIdentifiers_Context _localctx = new IgnoredIdentifiers_Context(_ctx, getState());
		enterRule(_localctx, 202, RULE_ignoredIdentifiers_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			ignoredIdentifier_();
			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1420);
				match(COMMA_);
				setState(1421);
				ignoredIdentifier_();
				}
				}
				setState(1426);
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
		enterRule(_localctx, 204, RULE_matchNone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
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
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public CreateTableSpecification_Context createTableSpecification_() {
			return getRuleContext(CreateTableSpecification_Context.class,0);
		}
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
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
		enterRule(_localctx, 206, RULE_createTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(CREATE);
			setState(1430);
			createTableSpecification_();
			setState(1431);
			match(TABLE);
			setState(1432);
			tableName();
			setState(1433);
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
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public CreateIndexSpecification_Context createIndexSpecification_() {
			return getRuleContext(CreateIndexSpecification_Context.class,0);
		}
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public CreateIndexDefinitionClause_Context createIndexDefinitionClause_() {
			return getRuleContext(CreateIndexDefinitionClause_Context.class,0);
		}
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_createIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			match(CREATE);
			setState(1436);
			createIndexSpecification_();
			setState(1437);
			match(INDEX);
			setState(1438);
			indexName();
			setState(1439);
			match(ON);
			setState(1440);
			createIndexDefinitionClause_();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
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
		enterRule(_localctx, 210, RULE_alterTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			match(ALTER);
			setState(1443);
			match(TABLE);
			setState(1444);
			tableName();
			setState(1445);
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
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public RenameIndexClause_Context renameIndexClause_() {
			return getRuleContext(RenameIndexClause_Context.class,0);
		}
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_alterIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			match(ALTER);
			setState(1448);
			match(INDEX);
			setState(1449);
			indexName();
			setState(1450);
			renameIndexClause_();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			match(DROP);
			setState(1453);
			match(TABLE);
			setState(1454);
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

	public static class DropIndexContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_dropIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			match(DROP);
			setState(1457);
			match(INDEX);
			setState(1458);
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

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(OracleStatementParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
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
		enterRule(_localctx, 218, RULE_truncateTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			match(TRUNCATE);
			setState(1461);
			match(TABLE);
			setState(1462);
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

	public static class CreateTableSpecification_Context extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(OracleStatementParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(OracleStatementParser.TEMPORARY, 0); }
		public CreateTableSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableSpecification_; }
	}

	public final CreateTableSpecification_Context createTableSpecification_() throws RecognitionException {
		CreateTableSpecification_Context _localctx = new CreateTableSpecification_Context(_ctx, getState());
		enterRule(_localctx, 220, RULE_createTableSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(1464);
				match(GLOBAL);
				setState(1465);
				match(TEMPORARY);
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

	public static class TablespaceClauseWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TablespaceClauseContext tablespaceClause() {
			return getRuleContext(TablespaceClauseContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TablespaceClauseWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceClauseWithParen; }
	}

	public final TablespaceClauseWithParenContext tablespaceClauseWithParen() throws RecognitionException {
		TablespaceClauseWithParenContext _localctx = new TablespaceClauseWithParenContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_tablespaceClauseWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			match(LP_);
			setState(1469);
			tablespaceClause();
			setState(1470);
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

	public static class TablespaceClauseContext extends ParserRuleContext {
		public TerminalNode TABLESPACE() { return getToken(OracleStatementParser.TABLESPACE, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TablespaceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceClause; }
	}

	public final TablespaceClauseContext tablespaceClause() throws RecognitionException {
		TablespaceClauseContext _localctx = new TablespaceClauseContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_tablespaceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			match(TABLESPACE);
			setState(1473);
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

	public static class DomainIndexClauseContext extends ParserRuleContext {
		public IndexTypeNameContext indexTypeName() {
			return getRuleContext(IndexTypeNameContext.class,0);
		}
		public DomainIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainIndexClause; }
	}

	public final DomainIndexClauseContext domainIndexClause() throws RecognitionException {
		DomainIndexClauseContext _localctx = new DomainIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_domainIndexClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			indexTypeName();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public RelationalPropertiesContext relationalProperties() {
			return getRuleContext(RelationalPropertiesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode ROWS() { return getToken(OracleStatementParser.ROWS, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode PRESERVE() { return getToken(OracleStatementParser.PRESERVE, 0); }
		public CreateDefinitionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitionClause_; }
	}

	public final CreateDefinitionClause_Context createDefinitionClause_() throws RecognitionException {
		CreateDefinitionClause_Context _localctx = new CreateDefinitionClause_Context(_ctx, getState());
		enterRule(_localctx, 228, RULE_createDefinitionClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1477);
				match(LP_);
				setState(1478);
				relationalProperties();
				setState(1479);
				match(RP_);
				}
			}

			setState(1487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1483);
				match(ON);
				setState(1484);
				match(COMMIT);
				setState(1485);
				_la = _input.LA(1);
				if ( !(_la==DELETE || _la==PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1486);
				match(ROWS);
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

	public static class RelationalPropertiesContext extends ParserRuleContext {
		public List<RelationalPropertyContext> relationalProperty() {
			return getRuleContexts(RelationalPropertyContext.class);
		}
		public RelationalPropertyContext relationalProperty(int i) {
			return getRuleContext(RelationalPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public RelationalPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalProperties; }
	}

	public final RelationalPropertiesContext relationalProperties() throws RecognitionException {
		RelationalPropertiesContext _localctx = new RelationalPropertiesContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_relationalProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			relationalProperty();
			setState(1494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1490);
				match(COMMA_);
				setState(1491);
				relationalProperty();
				}
				}
				setState(1496);
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

	public static class RelationalPropertyContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public VirtualColumnDefinitionContext virtualColumnDefinition() {
			return getRuleContext(VirtualColumnDefinitionContext.class,0);
		}
		public OutOfLineConstraintContext outOfLineConstraint() {
			return getRuleContext(OutOfLineConstraintContext.class,0);
		}
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public RelationalPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalProperty; }
	}

	public final RelationalPropertyContext relationalProperty() throws RecognitionException {
		RelationalPropertyContext _localctx = new RelationalPropertyContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_relationalProperty);
		try {
			setState(1501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1497);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1498);
				virtualColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1499);
				outOfLineConstraint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1500);
				outOfLineRefConstraint();
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
		public VisibleClause_Context visibleClause_() {
			return getRuleContext(VisibleClause_Context.class,0);
		}
		public TerminalNode SORT() { return getToken(OracleStatementParser.SORT, 0); }
		public DefaultNullClause_Context defaultNullClause_() {
			return getRuleContext(DefaultNullClause_Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentityClauseContext identityClause() {
			return getRuleContext(IdentityClauseContext.class,0);
		}
		public TerminalNode ENCRYPT() { return getToken(OracleStatementParser.ENCRYPT, 0); }
		public EncryptionSpecification_Context encryptionSpecification_() {
			return getRuleContext(EncryptionSpecification_Context.class,0);
		}
		public InlineRefConstraintContext inlineRefConstraint() {
			return getRuleContext(InlineRefConstraintContext.class,0);
		}
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			columnName();
			setState(1504);
			dataType();
			setState(1506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1505);
				match(SORT);
				}
			}

			setState(1508);
			visibleClause_();
			setState(1513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(1509);
				defaultNullClause_();
				setState(1510);
				expr(0);
				}
				break;
			case GENERATED:
				{
				setState(1512);
				identityClause();
				}
				break;
			case EOF:
			case RP_:
			case COMMA_:
			case SEMI_:
			case DROP:
			case ADD:
			case SET:
			case COLUMN:
			case CONSTRAINT:
			case PRIMARY:
			case UNIQUE:
			case KEY:
			case WITH:
			case NOT:
			case NULL:
			case CHECK:
			case REFERENCES:
			case ENCRYPT:
			case MODIFY:
			case SCOPE:
				break;
			default:
				break;
			}
			setState(1517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENCRYPT) {
				{
				setState(1515);
				match(ENCRYPT);
				setState(1516);
				encryptionSpecification_();
				}
			}

			setState(1525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1520); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1519);
					inlineConstraint();
					}
					}
					setState(1522); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (KEY - 61)) | (1L << (NOT - 61)) | (1L << (NULL - 61)))) != 0) || _la==CHECK || _la==REFERENCES );
				}
				break;
			case 2:
				{
				setState(1524);
				inlineRefConstraint();
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

	public static class VisibleClause_Context extends ParserRuleContext {
		public TerminalNode VISIBLE() { return getToken(OracleStatementParser.VISIBLE, 0); }
		public TerminalNode INVISIBLE() { return getToken(OracleStatementParser.INVISIBLE, 0); }
		public VisibleClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibleClause_; }
	}

	public final VisibleClause_Context visibleClause_() throws RecognitionException {
		VisibleClause_Context _localctx = new VisibleClause_Context(_ctx, getState());
		enterRule(_localctx, 236, RULE_visibleClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBLE || _la==INVISIBLE) {
				{
				setState(1527);
				_la = _input.LA(1);
				if ( !(_la==VISIBLE || _la==INVISIBLE) ) {
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

	public static class DefaultNullClause_Context extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public DefaultNullClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultNullClause_; }
	}

	public final DefaultNullClause_Context defaultNullClause_() throws RecognitionException {
		DefaultNullClause_Context _localctx = new DefaultNullClause_Context(_ctx, getState());
		enterRule(_localctx, 238, RULE_defaultNullClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			match(DEFAULT);
			setState(1533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1531);
				match(ON);
				setState(1532);
				match(NULL);
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

	public static class IdentityClauseContext extends ParserRuleContext {
		public TerminalNode GENERATED() { return getToken(OracleStatementParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(OracleStatementParser.IDENTITY, 0); }
		public IdentifyOptionsContext identifyOptions() {
			return getRuleContext(IdentifyOptionsContext.class,0);
		}
		public TerminalNode ALWAYS() { return getToken(OracleStatementParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public IdentityClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityClause; }
	}

	public final IdentityClauseContext identityClause() throws RecognitionException {
		IdentityClauseContext _localctx = new IdentityClauseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_identityClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			match(GENERATED);
			setState(1543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALWAYS:
				{
				setState(1536);
				match(ALWAYS);
				}
				break;
			case BY:
				{
				setState(1537);
				match(BY);
				setState(1538);
				match(DEFAULT);
				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1539);
					match(ON);
					setState(1540);
					match(NULL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1545);
			match(AS);
			setState(1546);
			match(IDENTITY);
			setState(1547);
			identifyOptions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifyOptionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<IdentityOptionContext> identityOption() {
			return getRuleContexts(IdentityOptionContext.class);
		}
		public IdentityOptionContext identityOption(int i) {
			return getRuleContext(IdentityOptionContext.class,i);
		}
		public IdentifyOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifyOptions; }
	}

	public final IdentifyOptionsContext identifyOptions() throws RecognitionException {
		IdentifyOptionsContext _localctx = new IdentifyOptionsContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_identifyOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1549);
				match(LP_);
				}
			}

			setState(1557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (START - 183)) | (1L << (CACHE - 183)) | (1L << (NOCACHE - 183)) | (1L << (CYCLE - 183)) | (1L << (NOCYCLE - 183)) | (1L << (INCREMENT - 183)) | (1L << (MAXVALUE - 183)) | (1L << (MINVALUE - 183)) | (1L << (NOMAXVALUE - 183)) | (1L << (NOMINVALUE - 183)) | (1L << (NOORDER - 183)))) != 0)) {
				{
				setState(1553); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1552);
					identityOption();
					}
					}
					setState(1555); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ORDER || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (START - 183)) | (1L << (CACHE - 183)) | (1L << (NOCACHE - 183)) | (1L << (CYCLE - 183)) | (1L << (NOCYCLE - 183)) | (1L << (INCREMENT - 183)) | (1L << (MAXVALUE - 183)) | (1L << (MINVALUE - 183)) | (1L << (NOMAXVALUE - 183)) | (1L << (NOMINVALUE - 183)) | (1L << (NOORDER - 183)))) != 0) );
				}
			}

			setState(1560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1559);
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

	public static class IdentityOptionContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(OracleStatementParser.START, 0); }
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode LIMIT() { return getToken(OracleStatementParser.LIMIT, 0); }
		public TerminalNode VALUE() { return getToken(OracleStatementParser.VALUE, 0); }
		public TerminalNode INCREMENT() { return getToken(OracleStatementParser.INCREMENT, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode MAXVALUE() { return getToken(OracleStatementParser.MAXVALUE, 0); }
		public TerminalNode NOMAXVALUE() { return getToken(OracleStatementParser.NOMAXVALUE, 0); }
		public TerminalNode MINVALUE() { return getToken(OracleStatementParser.MINVALUE, 0); }
		public TerminalNode NOMINVALUE() { return getToken(OracleStatementParser.NOMINVALUE, 0); }
		public TerminalNode CYCLE() { return getToken(OracleStatementParser.CYCLE, 0); }
		public TerminalNode NOCYCLE() { return getToken(OracleStatementParser.NOCYCLE, 0); }
		public TerminalNode CACHE() { return getToken(OracleStatementParser.CACHE, 0); }
		public TerminalNode NOCACHE() { return getToken(OracleStatementParser.NOCACHE, 0); }
		public TerminalNode ORDER() { return getToken(OracleStatementParser.ORDER, 0); }
		public TerminalNode NOORDER() { return getToken(OracleStatementParser.NOORDER, 0); }
		public IdentityOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityOption; }
	}

	public final IdentityOptionContext identityOption() throws RecognitionException {
		IdentityOptionContext _localctx = new IdentityOptionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_identityOption);
		try {
			setState(1585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START:
				enterOuterAlt(_localctx, 1);
				{
				setState(1562);
				match(START);
				setState(1563);
				match(WITH);
				setState(1567);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER_:
					{
					setState(1564);
					match(NUMBER_);
					}
					break;
				case LIMIT:
					{
					setState(1565);
					match(LIMIT);
					setState(1566);
					match(VALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case INCREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1569);
				match(INCREMENT);
				setState(1570);
				match(BY);
				setState(1571);
				match(NUMBER_);
				}
				break;
			case MAXVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1572);
				match(MAXVALUE);
				setState(1573);
				match(NUMBER_);
				}
				break;
			case NOMAXVALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1574);
				match(NOMAXVALUE);
				}
				break;
			case MINVALUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1575);
				match(MINVALUE);
				setState(1576);
				match(NUMBER_);
				}
				break;
			case NOMINVALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1577);
				match(NOMINVALUE);
				}
				break;
			case CYCLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1578);
				match(CYCLE);
				}
				break;
			case NOCYCLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1579);
				match(NOCYCLE);
				}
				break;
			case CACHE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1580);
				match(CACHE);
				setState(1581);
				match(NUMBER_);
				}
				break;
			case NOCACHE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1582);
				match(NOCACHE);
				}
				break;
			case ORDER:
				enterOuterAlt(_localctx, 11);
				{
				setState(1583);
				match(ORDER);
				}
				break;
			case NOORDER:
				enterOuterAlt(_localctx, 12);
				{
				setState(1584);
				match(NOORDER);
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

	public static class EncryptionSpecification_Context extends ParserRuleContext {
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public List<TerminalNode> STRING_() { return getTokens(OracleStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(OracleStatementParser.STRING_, i);
		}
		public TerminalNode IDENTIFIED() { return getToken(OracleStatementParser.IDENTIFIED, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode SALT() { return getToken(OracleStatementParser.SALT, 0); }
		public TerminalNode NO() { return getToken(OracleStatementParser.NO, 0); }
		public EncryptionSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encryptionSpecification_; }
	}

	public final EncryptionSpecification_Context encryptionSpecification_() throws RecognitionException {
		EncryptionSpecification_Context _localctx = new EncryptionSpecification_Context(_ctx, getState());
		enterRule(_localctx, 246, RULE_encryptionSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1587);
				match(USING);
				setState(1588);
				match(STRING_);
				}
			}

			setState(1594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIED) {
				{
				setState(1591);
				match(IDENTIFIED);
				setState(1592);
				match(BY);
				setState(1593);
				match(STRING_);
				}
			}

			setState(1597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_) {
				{
				setState(1596);
				match(STRING_);
				}
			}

			setState(1603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SALT || _la==NO) {
				{
				setState(1600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1599);
					match(NO);
					}
				}

				setState(1602);
				match(SALT);
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

	public static class InlineConstraintContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(OracleStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public InlineConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineConstraint; }
	}

	public final InlineConstraintContext inlineConstraint() throws RecognitionException {
		InlineConstraintContext _localctx = new InlineConstraintContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_inlineConstraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1605);
				match(CONSTRAINT);
				setState(1606);
				ignoredIdentifier_();
				}
			}

			setState(1621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NULL:
				{
				setState(1610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1609);
					match(NOT);
					}
				}

				setState(1612);
				match(NULL);
				}
				break;
			case UNIQUE:
				{
				setState(1613);
				match(UNIQUE);
				}
				break;
			case PRIMARY:
			case KEY:
				{
				setState(1614);
				primaryKey();
				}
				break;
			case REFERENCES:
				{
				setState(1615);
				referencesClause();
				}
				break;
			case CHECK:
				{
				setState(1616);
				match(CHECK);
				setState(1617);
				match(LP_);
				setState(1618);
				expr(0);
				setState(1619);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1623);
					constraintState();
					}
					} 
				}
				setState(1628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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

	public static class ReferencesClauseContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(OracleStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public ReferencesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencesClause; }
	}

	public final ReferencesClauseContext referencesClause() throws RecognitionException {
		ReferencesClauseContext _localctx = new ReferencesClauseContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_referencesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			match(REFERENCES);
			setState(1630);
			tableName();
			setState(1632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1631);
				columnNames();
				}
				break;
			}
			setState(1641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1634);
				match(ON);
				setState(1635);
				match(DELETE);
				setState(1639);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASCADE:
					{
					setState(1636);
					match(CASCADE);
					}
					break;
				case SET:
					{
					setState(1637);
					match(SET);
					setState(1638);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ConstraintStateContext extends ParserRuleContext {
		public NotDeferrableContext notDeferrable() {
			return getRuleContext(NotDeferrableContext.class,0);
		}
		public InitiallyClauseContext initiallyClause() {
			return getRuleContext(InitiallyClauseContext.class,0);
		}
		public TerminalNode RELY() { return getToken(OracleStatementParser.RELY, 0); }
		public TerminalNode NORELY() { return getToken(OracleStatementParser.NORELY, 0); }
		public UsingIndexClauseContext usingIndexClause() {
			return getRuleContext(UsingIndexClauseContext.class,0);
		}
		public TerminalNode ENABLE() { return getToken(OracleStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(OracleStatementParser.DISABLE, 0); }
		public TerminalNode VALIDATE() { return getToken(OracleStatementParser.VALIDATE, 0); }
		public TerminalNode NOVALIDATE() { return getToken(OracleStatementParser.NOVALIDATE, 0); }
		public ExceptionsClauseContext exceptionsClause() {
			return getRuleContext(ExceptionsClauseContext.class,0);
		}
		public ConstraintStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintState; }
	}

	public final ConstraintStateContext constraintState() throws RecognitionException {
		ConstraintStateContext _localctx = new ConstraintStateContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_constraintState);
		try {
			setState(1653);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case DEFERRABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1643);
				notDeferrable();
				}
				break;
			case INITIALLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1644);
				initiallyClause();
				}
				break;
			case RELY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1645);
				match(RELY);
				}
				break;
			case NORELY:
				enterOuterAlt(_localctx, 4);
				{
				setState(1646);
				match(NORELY);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 5);
				{
				setState(1647);
				usingIndexClause();
				}
				break;
			case ENABLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1648);
				match(ENABLE);
				}
				break;
			case DISABLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1649);
				match(DISABLE);
				}
				break;
			case VALIDATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1650);
				match(VALIDATE);
				}
				break;
			case NOVALIDATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1651);
				match(NOVALIDATE);
				}
				break;
			case EXCEPTIONS:
				enterOuterAlt(_localctx, 10);
				{
				setState(1652);
				exceptionsClause();
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

	public static class NotDeferrableContext extends ParserRuleContext {
		public TerminalNode DEFERRABLE() { return getToken(OracleStatementParser.DEFERRABLE, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public NotDeferrableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notDeferrable; }
	}

	public final NotDeferrableContext notDeferrable() throws RecognitionException {
		NotDeferrableContext _localctx = new NotDeferrableContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_notDeferrable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1655);
				match(NOT);
				}
			}

			setState(1658);
			match(DEFERRABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitiallyClauseContext extends ParserRuleContext {
		public TerminalNode INITIALLY() { return getToken(OracleStatementParser.INITIALLY, 0); }
		public TerminalNode IMMEDIATE() { return getToken(OracleStatementParser.IMMEDIATE, 0); }
		public TerminalNode DEFERRED() { return getToken(OracleStatementParser.DEFERRED, 0); }
		public InitiallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initiallyClause; }
	}

	public final InitiallyClauseContext initiallyClause() throws RecognitionException {
		InitiallyClauseContext _localctx = new InitiallyClauseContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_initiallyClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			match(INITIALLY);
			setState(1661);
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
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionsClauseContext extends ParserRuleContext {
		public TerminalNode EXCEPTIONS() { return getToken(OracleStatementParser.EXCEPTIONS, 0); }
		public TerminalNode INTO() { return getToken(OracleStatementParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ExceptionsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionsClause; }
	}

	public final ExceptionsClauseContext exceptionsClause() throws RecognitionException {
		ExceptionsClauseContext _localctx = new ExceptionsClauseContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_exceptionsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			match(EXCEPTIONS);
			setState(1664);
			match(INTO);
			setState(1665);
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

	public static class UsingIndexClauseContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public CreateIndexClause_Context createIndexClause_() {
			return getRuleContext(CreateIndexClause_Context.class,0);
		}
		public UsingIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingIndexClause; }
	}

	public final UsingIndexClauseContext usingIndexClause() throws RecognitionException {
		UsingIndexClauseContext _localctx = new UsingIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_usingIndexClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			match(USING);
			setState(1668);
			match(INDEX);
			setState(1671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1669);
				indexName();
				}
				break;
			case 2:
				{
				setState(1670);
				createIndexClause_();
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

	public static class CreateIndexClause_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public CreateIndexClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexClause_; }
	}

	public final CreateIndexClause_Context createIndexClause_() throws RecognitionException {
		CreateIndexClause_Context _localctx = new CreateIndexClause_Context(_ctx, getState());
		enterRule(_localctx, 262, RULE_createIndexClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			match(LP_);
			setState(1674);
			createIndex();
			setState(1675);
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

	public static class InlineRefConstraintContext extends ParserRuleContext {
		public TerminalNode SCOPE() { return getToken(OracleStatementParser.SCOPE, 0); }
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode ROWID() { return getToken(OracleStatementParser.ROWID, 0); }
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public InlineRefConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineRefConstraint; }
	}

	public final InlineRefConstraintContext inlineRefConstraint() throws RecognitionException {
		InlineRefConstraintContext _localctx = new InlineRefConstraintContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_inlineRefConstraint);
		int _la;
		try {
			setState(1693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1677);
				match(SCOPE);
				setState(1678);
				match(IS);
				setState(1679);
				tableName();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1680);
				match(WITH);
				setState(1681);
				match(ROWID);
				}
				break;
			case CONSTRAINT:
			case REFERENCES:
				enterOuterAlt(_localctx, 3);
				{
				setState(1684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1682);
					match(CONSTRAINT);
					setState(1683);
					ignoredIdentifier_();
					}
				}

				setState(1686);
				referencesClause();
				setState(1690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (USING - 91)) | (1L << (NOT - 91)) | (1L << (ENABLE - 91)) | (1L << (DISABLE - 91)))) != 0) || ((((_la - 215)) & ~0x3f) == 0 && ((1L << (_la - 215)) & ((1L << (DEFERRABLE - 215)) | (1L << (EXCEPTIONS - 215)) | (1L << (INITIALLY - 215)) | (1L << (NORELY - 215)) | (1L << (RELY - 215)) | (1L << (VALIDATE - 215)) | (1L << (NOVALIDATE - 215)))) != 0)) {
					{
					{
					setState(1687);
					constraintState();
					}
					}
					setState(1692);
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

	public static class VirtualColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(OracleStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(OracleStatementParser.ALWAYS, 0); }
		public TerminalNode VIRTUAL() { return getToken(OracleStatementParser.VIRTUAL, 0); }
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public VirtualColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualColumnDefinition; }
	}

	public final VirtualColumnDefinitionContext virtualColumnDefinition() throws RecognitionException {
		VirtualColumnDefinitionContext _localctx = new VirtualColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_virtualColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			columnName();
			setState(1697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIONAL || _la==IDENTIFIER_) {
				{
				setState(1696);
				dataType();
				}
			}

			setState(1701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GENERATED) {
				{
				setState(1699);
				match(GENERATED);
				setState(1700);
				match(ALWAYS);
				}
			}

			setState(1703);
			match(AS);
			setState(1704);
			match(LP_);
			setState(1705);
			expr(0);
			setState(1706);
			match(RP_);
			setState(1708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(1707);
				match(VIRTUAL);
				}
			}

			setState(1713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (KEY - 61)) | (1L << (NOT - 61)) | (1L << (NULL - 61)))) != 0) || _la==CHECK || _la==REFERENCES) {
				{
				{
				setState(1710);
				inlineConstraint();
				}
				}
				setState(1715);
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

	public static class OutOfLineConstraintContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(OracleStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(OracleStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public OutOfLineConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outOfLineConstraint; }
	}

	public final OutOfLineConstraintContext outOfLineConstraint() throws RecognitionException {
		OutOfLineConstraintContext _localctx = new OutOfLineConstraintContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_outOfLineConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1716);
				match(CONSTRAINT);
				setState(1717);
				ignoredIdentifier_();
				}
			}

			setState(1735);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE:
				{
				setState(1720);
				match(UNIQUE);
				setState(1721);
				columnNames();
				}
				break;
			case PRIMARY:
			case KEY:
				{
				setState(1722);
				primaryKey();
				setState(1723);
				columnNames();
				}
				break;
			case FOREIGN:
				{
				setState(1725);
				match(FOREIGN);
				setState(1726);
				match(KEY);
				setState(1727);
				columnNames();
				setState(1728);
				referencesClause();
				}
				break;
			case CHECK:
				{
				setState(1730);
				match(CHECK);
				setState(1731);
				match(LP_);
				setState(1732);
				expr(0);
				setState(1733);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (USING - 91)) | (1L << (NOT - 91)) | (1L << (ENABLE - 91)) | (1L << (DISABLE - 91)))) != 0) || ((((_la - 215)) & ~0x3f) == 0 && ((1L << (_la - 215)) & ((1L << (DEFERRABLE - 215)) | (1L << (EXCEPTIONS - 215)) | (1L << (INITIALLY - 215)) | (1L << (NORELY - 215)) | (1L << (RELY - 215)) | (1L << (VALIDATE - 215)) | (1L << (NOVALIDATE - 215)))) != 0)) {
				{
				{
				setState(1737);
				constraintState();
				}
				}
				setState(1742);
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

	public static class OutOfLineRefConstraintContext extends ParserRuleContext {
		public TerminalNode SCOPE() { return getToken(OracleStatementParser.SCOPE, 0); }
		public TerminalNode FOR() { return getToken(OracleStatementParser.FOR, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public LobItemContext lobItem() {
			return getRuleContext(LobItemContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode REF() { return getToken(OracleStatementParser.REF, 0); }
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode ROWID() { return getToken(OracleStatementParser.ROWID, 0); }
		public TerminalNode FOREIGN() { return getToken(OracleStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public LobItemListContext lobItemList() {
			return getRuleContext(LobItemListContext.class,0);
		}
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public OutOfLineRefConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outOfLineRefConstraint; }
	}

	public final OutOfLineRefConstraintContext outOfLineRefConstraint() throws RecognitionException {
		OutOfLineRefConstraintContext _localctx = new OutOfLineRefConstraintContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_outOfLineRefConstraint);
		int _la;
		try {
			setState(1772);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1743);
				match(SCOPE);
				setState(1744);
				match(FOR);
				setState(1745);
				match(LP_);
				setState(1746);
				lobItem();
				setState(1747);
				match(RP_);
				setState(1748);
				match(IS);
				setState(1749);
				tableName();
				}
				break;
			case REF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1751);
				match(REF);
				setState(1752);
				match(LP_);
				setState(1753);
				lobItem();
				setState(1754);
				match(RP_);
				setState(1755);
				match(WITH);
				setState(1756);
				match(ROWID);
				}
				break;
			case CONSTRAINT:
			case FOREIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1758);
					match(CONSTRAINT);
					setState(1759);
					ignoredIdentifier_();
					}
				}

				setState(1762);
				match(FOREIGN);
				setState(1763);
				match(KEY);
				setState(1764);
				lobItemList();
				setState(1765);
				referencesClause();
				setState(1769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (USING - 91)) | (1L << (NOT - 91)) | (1L << (ENABLE - 91)) | (1L << (DISABLE - 91)))) != 0) || ((((_la - 215)) & ~0x3f) == 0 && ((1L << (_la - 215)) & ((1L << (DEFERRABLE - 215)) | (1L << (EXCEPTIONS - 215)) | (1L << (INITIALLY - 215)) | (1L << (NORELY - 215)) | (1L << (RELY - 215)) | (1L << (VALIDATE - 215)) | (1L << (NOVALIDATE - 215)))) != 0)) {
					{
					{
					setState(1766);
					constraintState();
					}
					}
					setState(1771);
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

	public static class CreateIndexSpecification_Context extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public TerminalNode BITMAP() { return getToken(OracleStatementParser.BITMAP, 0); }
		public CreateIndexSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexSpecification_; }
	}

	public final CreateIndexSpecification_Context createIndexSpecification_() throws RecognitionException {
		CreateIndexSpecification_Context _localctx = new CreateIndexSpecification_Context(_ctx, getState());
		enterRule(_localctx, 272, RULE_createIndexSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE || _la==BITMAP) {
				{
				setState(1774);
				_la = _input.LA(1);
				if ( !(_la==UNIQUE || _la==BITMAP) ) {
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

	public static class TableIndexClause_Context extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IndexExpressions_Context indexExpressions_() {
			return getRuleContext(IndexExpressions_Context.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TableIndexClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndexClause_; }
	}

	public final TableIndexClause_Context tableIndexClause_() throws RecognitionException {
		TableIndexClause_Context _localctx = new TableIndexClause_Context(_ctx, getState());
		enterRule(_localctx, 274, RULE_tableIndexClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			tableName();
			setState(1779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)) | (1L << (UNKNOWN - 119)) | (1L << (ALWAYS - 119)) | (1L << (CASCADE - 119)) | (1L << (GENERATED - 119)) | (1L << (PRIVILEGES - 119)) | (1L << (READ - 119)) | (1L << (WRITE - 119)) | (1L << (REFERENCES - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)) | (1L << (NATIONAL - 184)) | (1L << (NEW - 184)) | (1L << (NOORDER - 184)) | (1L << (NORELY - 184)) | (1L << (ONLY - 184)) | (1L << (PROFILE - 184)) | (1L << (REF - 184)))) != 0) || ((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & ((1L << (REKEY - 248)) | (1L << (RELY - 248)) | (1L << (REPLACE - 248)) | (1L << (SALT - 248)) | (1L << (SCOPE - 248)) | (1L << (SORT - 248)) | (1L << (SOURCE - 248)) | (1L << (SUBSTITUTABLE - 248)) | (1L << (TABLESPACE - 248)) | (1L << (TEMPORARY - 248)) | (1L << (TRANSLATION - 248)) | (1L << (TREAT - 248)) | (1L << (NO - 248)) | (1L << (TYPE - 248)) | (1L << (UNUSED - 248)) | (1L << (NOVALIDATE - 248)) | (1L << (VALUE - 248)) | (1L << (VARYING - 248)) | (1L << (VIRTUAL - 248)) | (1L << (ZONE - 248)) | (1L << (ADVISOR - 248)) | (1L << (ADMINISTER - 248)) | (1L << (TUNING - 248)) | (1L << (MANAGE - 248)) | (1L << (MANAGEMENT - 248)) | (1L << (OBJECT - 248)) | (1L << (CLUSTER - 248)) | (1L << (CONTEXT - 248)) | (1L << (EXEMPT - 248)) | (1L << (REDACTION - 248)) | (1L << (POLICY - 248)) | (1L << (DATABASE - 248)) | (1L << (SYSTEM - 248)) | (1L << (AUDIT - 248)) | (1L << (LINK - 248)) | (1L << (ANALYZE - 248)) | (1L << (DICTIONARY - 248)) | (1L << (DIMENSION - 248)) | (1L << (INDEXTYPE - 248)) | (1L << (EXTERNAL - 248)) | (1L << (JOB - 248)) | (1L << (CLASS - 248)) | (1L << (PROGRAM - 248)) | (1L << (SCHEDULER - 248)) | (1L << (LIBRARY - 248)) | (1L << (LOGMINING - 248)) | (1L << (MATERIALIZED - 248)) | (1L << (CUBE - 248)) | (1L << (MEASURE - 248)) | (1L << (FOLDER - 248)) | (1L << (BUILD - 248)) | (1L << (PROCESS - 248)) | (1L << (OPERATOR - 248)) | (1L << (OUTLINE - 248)) | (1L << (PLUGGABLE - 248)) | (1L << (CONTAINER - 248)))) != 0) || ((((_la - 312)) & ~0x3f) == 0 && ((1L << (_la - 312)) & ((1L << (SEGMENT - 312)) | (1L << (RESTRICTED - 312)) | (1L << (COST - 312)) | (1L << (SYNONYM - 312)) | (1L << (BACKUP - 312)) | (1L << (UNLIMITED - 312)) | (1L << (BECOME - 312)) | (1L << (CHANGE - 312)) | (1L << (NOTIFICATION - 312)) | (1L << (ACCESS - 312)) | (1L << (PRIVILEGE - 312)) | (1L << (PURGE - 312)) | (1L << (RESUMABLE - 312)) | (1L << (SYSGUID - 312)) | (1L << (SYSBACKUP - 312)) | (1L << (SYSDBA - 312)) | (1L << (SYSDG - 312)) | (1L << (SYSKM - 312)) | (1L << (SYSOPER - 312)) | (1L << (DBA_RECYCLEBIN - 312)) | (1L << (IDENTIFIER_ - 312)) | (1L << (STRING_ - 312)))) != 0)) {
				{
				setState(1778);
				alias();
				}
			}

			setState(1781);
			indexExpressions_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexExpressions_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<IndexExpression_Context> indexExpression_() {
			return getRuleContexts(IndexExpression_Context.class);
		}
		public IndexExpression_Context indexExpression_(int i) {
			return getRuleContext(IndexExpression_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public IndexExpressions_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexExpressions_; }
	}

	public final IndexExpressions_Context indexExpressions_() throws RecognitionException {
		IndexExpressions_Context _localctx = new IndexExpressions_Context(_ctx, getState());
		enterRule(_localctx, 276, RULE_indexExpressions_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			match(LP_);
			setState(1784);
			indexExpression_();
			setState(1789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1785);
				match(COMMA_);
				setState(1786);
				indexExpression_();
				}
				}
				setState(1791);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1792);
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

	public static class IndexExpression_Context extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public IndexExpression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexExpression_; }
	}

	public final IndexExpression_Context indexExpression_() throws RecognitionException {
		IndexExpression_Context _localctx = new IndexExpression_Context(_ctx, getState());
		enterRule(_localctx, 278, RULE_indexExpression_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1794);
				columnName();
				}
				break;
			case 2:
				{
				setState(1795);
				expr(0);
				}
				break;
			}
			setState(1799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1798);
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

	public static class BitmapJoinIndexClause_Context extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnSortsClause_Context columnSortsClause_() {
			return getRuleContext(ColumnSortsClause_Context.class,0);
		}
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(OracleStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BitmapJoinIndexClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitmapJoinIndexClause_; }
	}

	public final BitmapJoinIndexClause_Context bitmapJoinIndexClause_() throws RecognitionException {
		BitmapJoinIndexClause_Context _localctx = new BitmapJoinIndexClause_Context(_ctx, getState());
		enterRule(_localctx, 280, RULE_bitmapJoinIndexClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801);
			tableName();
			setState(1802);
			columnSortsClause_();
			setState(1803);
			match(FROM);
			setState(1804);
			tableAlias();
			setState(1805);
			match(WHERE);
			setState(1806);
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

	public static class ColumnSortsClause_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ColumnSortClause_Context> columnSortClause_() {
			return getRuleContexts(ColumnSortClause_Context.class);
		}
		public ColumnSortClause_Context columnSortClause_(int i) {
			return getRuleContext(ColumnSortClause_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ColumnSortsClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSortsClause_; }
	}

	public final ColumnSortsClause_Context columnSortsClause_() throws RecognitionException {
		ColumnSortsClause_Context _localctx = new ColumnSortsClause_Context(_ctx, getState());
		enterRule(_localctx, 282, RULE_columnSortsClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			match(LP_);
			setState(1809);
			columnSortClause_();
			setState(1814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1810);
				match(COMMA_);
				setState(1811);
				columnSortClause_();
				}
				}
				setState(1816);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1817);
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

	public static class ColumnSortClause_Context extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public ColumnSortClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSortClause_; }
	}

	public final ColumnSortClause_Context columnSortClause_() throws RecognitionException {
		ColumnSortClause_Context _localctx = new ColumnSortClause_Context(_ctx, getState());
		enterRule(_localctx, 284, RULE_columnSortClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1819);
				tableName();
				}
				break;
			case 2:
				{
				setState(1820);
				alias();
				}
				break;
			}
			setState(1823);
			columnName();
			setState(1825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1824);
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

	public static class CreateIndexDefinitionClause_Context extends ParserRuleContext {
		public TableIndexClause_Context tableIndexClause_() {
			return getRuleContext(TableIndexClause_Context.class,0);
		}
		public BitmapJoinIndexClause_Context bitmapJoinIndexClause_() {
			return getRuleContext(BitmapJoinIndexClause_Context.class,0);
		}
		public CreateIndexDefinitionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexDefinitionClause_; }
	}

	public final CreateIndexDefinitionClause_Context createIndexDefinitionClause_() throws RecognitionException {
		CreateIndexDefinitionClause_Context _localctx = new CreateIndexDefinitionClause_Context(_ctx, getState());
		enterRule(_localctx, 286, RULE_createIndexDefinitionClause_);
		try {
			setState(1829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1827);
				tableIndexClause_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1828);
				bitmapJoinIndexClause_();
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

	public static class TableAliasContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public List<AliasContext> alias() {
			return getRuleContexts(AliasContext.class);
		}
		public AliasContext alias(int i) {
			return getRuleContext(AliasContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_tableAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			tableName();
			setState(1833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)) | (1L << (UNKNOWN - 119)) | (1L << (ALWAYS - 119)) | (1L << (CASCADE - 119)) | (1L << (GENERATED - 119)) | (1L << (PRIVILEGES - 119)) | (1L << (READ - 119)) | (1L << (WRITE - 119)) | (1L << (REFERENCES - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)) | (1L << (NATIONAL - 184)) | (1L << (NEW - 184)) | (1L << (NOORDER - 184)) | (1L << (NORELY - 184)) | (1L << (ONLY - 184)) | (1L << (PROFILE - 184)) | (1L << (REF - 184)))) != 0) || ((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & ((1L << (REKEY - 248)) | (1L << (RELY - 248)) | (1L << (REPLACE - 248)) | (1L << (SALT - 248)) | (1L << (SCOPE - 248)) | (1L << (SORT - 248)) | (1L << (SOURCE - 248)) | (1L << (SUBSTITUTABLE - 248)) | (1L << (TABLESPACE - 248)) | (1L << (TEMPORARY - 248)) | (1L << (TRANSLATION - 248)) | (1L << (TREAT - 248)) | (1L << (NO - 248)) | (1L << (TYPE - 248)) | (1L << (UNUSED - 248)) | (1L << (NOVALIDATE - 248)) | (1L << (VALUE - 248)) | (1L << (VARYING - 248)) | (1L << (VIRTUAL - 248)) | (1L << (ZONE - 248)) | (1L << (ADVISOR - 248)) | (1L << (ADMINISTER - 248)) | (1L << (TUNING - 248)) | (1L << (MANAGE - 248)) | (1L << (MANAGEMENT - 248)) | (1L << (OBJECT - 248)) | (1L << (CLUSTER - 248)) | (1L << (CONTEXT - 248)) | (1L << (EXEMPT - 248)) | (1L << (REDACTION - 248)) | (1L << (POLICY - 248)) | (1L << (DATABASE - 248)) | (1L << (SYSTEM - 248)) | (1L << (AUDIT - 248)) | (1L << (LINK - 248)) | (1L << (ANALYZE - 248)) | (1L << (DICTIONARY - 248)) | (1L << (DIMENSION - 248)) | (1L << (INDEXTYPE - 248)) | (1L << (EXTERNAL - 248)) | (1L << (JOB - 248)) | (1L << (CLASS - 248)) | (1L << (PROGRAM - 248)) | (1L << (SCHEDULER - 248)) | (1L << (LIBRARY - 248)) | (1L << (LOGMINING - 248)) | (1L << (MATERIALIZED - 248)) | (1L << (CUBE - 248)) | (1L << (MEASURE - 248)) | (1L << (FOLDER - 248)) | (1L << (BUILD - 248)) | (1L << (PROCESS - 248)) | (1L << (OPERATOR - 248)) | (1L << (OUTLINE - 248)) | (1L << (PLUGGABLE - 248)) | (1L << (CONTAINER - 248)))) != 0) || ((((_la - 312)) & ~0x3f) == 0 && ((1L << (_la - 312)) & ((1L << (SEGMENT - 312)) | (1L << (RESTRICTED - 312)) | (1L << (COST - 312)) | (1L << (SYNONYM - 312)) | (1L << (BACKUP - 312)) | (1L << (UNLIMITED - 312)) | (1L << (BECOME - 312)) | (1L << (CHANGE - 312)) | (1L << (NOTIFICATION - 312)) | (1L << (ACCESS - 312)) | (1L << (PRIVILEGE - 312)) | (1L << (PURGE - 312)) | (1L << (RESUMABLE - 312)) | (1L << (SYSGUID - 312)) | (1L << (SYSBACKUP - 312)) | (1L << (SYSDBA - 312)) | (1L << (SYSDG - 312)) | (1L << (SYSKM - 312)) | (1L << (SYSOPER - 312)) | (1L << (DBA_RECYCLEBIN - 312)) | (1L << (IDENTIFIER_ - 312)) | (1L << (STRING_ - 312)))) != 0)) {
				{
				setState(1832);
				alias();
				}
			}

			setState(1842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1835);
				match(COMMA_);
				setState(1836);
				tableName();
				setState(1838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)) | (1L << (UNKNOWN - 119)) | (1L << (ALWAYS - 119)) | (1L << (CASCADE - 119)) | (1L << (GENERATED - 119)) | (1L << (PRIVILEGES - 119)) | (1L << (READ - 119)) | (1L << (WRITE - 119)) | (1L << (REFERENCES - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)) | (1L << (NATIONAL - 184)) | (1L << (NEW - 184)) | (1L << (NOORDER - 184)) | (1L << (NORELY - 184)) | (1L << (ONLY - 184)) | (1L << (PROFILE - 184)) | (1L << (REF - 184)))) != 0) || ((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & ((1L << (REKEY - 248)) | (1L << (RELY - 248)) | (1L << (REPLACE - 248)) | (1L << (SALT - 248)) | (1L << (SCOPE - 248)) | (1L << (SORT - 248)) | (1L << (SOURCE - 248)) | (1L << (SUBSTITUTABLE - 248)) | (1L << (TABLESPACE - 248)) | (1L << (TEMPORARY - 248)) | (1L << (TRANSLATION - 248)) | (1L << (TREAT - 248)) | (1L << (NO - 248)) | (1L << (TYPE - 248)) | (1L << (UNUSED - 248)) | (1L << (NOVALIDATE - 248)) | (1L << (VALUE - 248)) | (1L << (VARYING - 248)) | (1L << (VIRTUAL - 248)) | (1L << (ZONE - 248)) | (1L << (ADVISOR - 248)) | (1L << (ADMINISTER - 248)) | (1L << (TUNING - 248)) | (1L << (MANAGE - 248)) | (1L << (MANAGEMENT - 248)) | (1L << (OBJECT - 248)) | (1L << (CLUSTER - 248)) | (1L << (CONTEXT - 248)) | (1L << (EXEMPT - 248)) | (1L << (REDACTION - 248)) | (1L << (POLICY - 248)) | (1L << (DATABASE - 248)) | (1L << (SYSTEM - 248)) | (1L << (AUDIT - 248)) | (1L << (LINK - 248)) | (1L << (ANALYZE - 248)) | (1L << (DICTIONARY - 248)) | (1L << (DIMENSION - 248)) | (1L << (INDEXTYPE - 248)) | (1L << (EXTERNAL - 248)) | (1L << (JOB - 248)) | (1L << (CLASS - 248)) | (1L << (PROGRAM - 248)) | (1L << (SCHEDULER - 248)) | (1L << (LIBRARY - 248)) | (1L << (LOGMINING - 248)) | (1L << (MATERIALIZED - 248)) | (1L << (CUBE - 248)) | (1L << (MEASURE - 248)) | (1L << (FOLDER - 248)) | (1L << (BUILD - 248)) | (1L << (PROCESS - 248)) | (1L << (OPERATOR - 248)) | (1L << (OUTLINE - 248)) | (1L << (PLUGGABLE - 248)) | (1L << (CONTAINER - 248)))) != 0) || ((((_la - 312)) & ~0x3f) == 0 && ((1L << (_la - 312)) & ((1L << (SEGMENT - 312)) | (1L << (RESTRICTED - 312)) | (1L << (COST - 312)) | (1L << (SYNONYM - 312)) | (1L << (BACKUP - 312)) | (1L << (UNLIMITED - 312)) | (1L << (BECOME - 312)) | (1L << (CHANGE - 312)) | (1L << (NOTIFICATION - 312)) | (1L << (ACCESS - 312)) | (1L << (PRIVILEGE - 312)) | (1L << (PURGE - 312)) | (1L << (RESUMABLE - 312)) | (1L << (SYSGUID - 312)) | (1L << (SYSBACKUP - 312)) | (1L << (SYSDBA - 312)) | (1L << (SYSDG - 312)) | (1L << (SYSKM - 312)) | (1L << (SYSOPER - 312)) | (1L << (DBA_RECYCLEBIN - 312)) | (1L << (IDENTIFIER_ - 312)) | (1L << (STRING_ - 312)))) != 0)) {
					{
					setState(1837);
					alias();
					}
				}

				}
				}
				setState(1844);
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

	public static class AlterDefinitionClause_Context extends ParserRuleContext {
		public AlterTablePropertiesContext alterTableProperties() {
			return getRuleContext(AlterTablePropertiesContext.class,0);
		}
		public ColumnClausesContext columnClauses() {
			return getRuleContext(ColumnClausesContext.class,0);
		}
		public ConstraintClausesContext constraintClauses() {
			return getRuleContext(ConstraintClausesContext.class,0);
		}
		public AlterExternalTableContext alterExternalTable() {
			return getRuleContext(AlterExternalTableContext.class,0);
		}
		public AlterDefinitionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDefinitionClause_; }
	}

	public final AlterDefinitionClause_Context alterDefinitionClause_() throws RecognitionException {
		AlterDefinitionClause_Context _localctx = new AlterDefinitionClause_Context(_ctx, getState());
		enterRule(_localctx, 290, RULE_alterDefinitionClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1845);
				alterTableProperties();
				}
				break;
			case 2:
				{
				setState(1846);
				columnClauses();
				}
				break;
			case 3:
				{
				setState(1847);
				constraintClauses();
				}
				break;
			case 4:
				{
				setState(1848);
				alterExternalTable();
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

	public static class AlterTablePropertiesContext extends ParserRuleContext {
		public RenameTableSpecification_Context renameTableSpecification_() {
			return getRuleContext(RenameTableSpecification_Context.class,0);
		}
		public TerminalNode REKEY() { return getToken(OracleStatementParser.REKEY, 0); }
		public EncryptionSpecification_Context encryptionSpecification_() {
			return getRuleContext(EncryptionSpecification_Context.class,0);
		}
		public AlterTablePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableProperties; }
	}

	public final AlterTablePropertiesContext alterTableProperties() throws RecognitionException {
		AlterTablePropertiesContext _localctx = new AlterTablePropertiesContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_alterTableProperties);
		try {
			setState(1854);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1851);
				renameTableSpecification_();
				}
				break;
			case REKEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1852);
				match(REKEY);
				setState(1853);
				encryptionSpecification_();
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

	public static class RenameTableSpecification_Context extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
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
		enterRule(_localctx, 294, RULE_renameTableSpecification_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1856);
			match(RENAME);
			setState(1857);
			match(TO);
			setState(1858);
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

	public static class ColumnClausesContext extends ParserRuleContext {
		public List<OperateColumnClauseContext> operateColumnClause() {
			return getRuleContexts(OperateColumnClauseContext.class);
		}
		public OperateColumnClauseContext operateColumnClause(int i) {
			return getRuleContext(OperateColumnClauseContext.class,i);
		}
		public RenameColumnClauseContext renameColumnClause() {
			return getRuleContext(RenameColumnClauseContext.class,0);
		}
		public ColumnClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnClauses; }
	}

	public final ColumnClausesContext columnClauses() throws RecognitionException {
		ColumnClausesContext _localctx = new ColumnClausesContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_columnClauses);
		int _la;
		try {
			setState(1866);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DROP:
			case ADD:
			case SET:
			case MODIFY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1861); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1860);
					operateColumnClause();
					}
					}
					setState(1863); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DROP) | (1L << ADD) | (1L << SET))) != 0) || _la==MODIFY );
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1865);
				renameColumnClause();
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

	public static class OperateColumnClauseContext extends ParserRuleContext {
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public DropColumnClauseContext dropColumnClause() {
			return getRuleContext(DropColumnClauseContext.class,0);
		}
		public OperateColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operateColumnClause; }
	}

	public final OperateColumnClauseContext operateColumnClause() throws RecognitionException {
		OperateColumnClauseContext _localctx = new OperateColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_operateColumnClause);
		try {
			setState(1871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1868);
				addColumnSpecification();
				}
				break;
			case MODIFY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1869);
				modifyColumnSpecification();
				}
				break;
			case DROP:
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(1870);
				dropColumnClause();
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

	public static class AddColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(OracleStatementParser.ADD, 0); }
		public ColumnOrVirtualDefinitionsContext columnOrVirtualDefinitions() {
			return getRuleContext(ColumnOrVirtualDefinitionsContext.class,0);
		}
		public ColumnPropertiesContext columnProperties() {
			return getRuleContext(ColumnPropertiesContext.class,0);
		}
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
			match(ADD);
			setState(1874);
			columnOrVirtualDefinitions();
			setState(1876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1875);
				columnProperties();
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

	public static class ColumnOrVirtualDefinitionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ColumnOrVirtualDefinitionContext> columnOrVirtualDefinition() {
			return getRuleContexts(ColumnOrVirtualDefinitionContext.class);
		}
		public ColumnOrVirtualDefinitionContext columnOrVirtualDefinition(int i) {
			return getRuleContext(ColumnOrVirtualDefinitionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ColumnOrVirtualDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrVirtualDefinitions; }
	}

	public final ColumnOrVirtualDefinitionsContext columnOrVirtualDefinitions() throws RecognitionException {
		ColumnOrVirtualDefinitionsContext _localctx = new ColumnOrVirtualDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_columnOrVirtualDefinitions);
		int _la;
		try {
			setState(1890);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1878);
				match(LP_);
				setState(1879);
				columnOrVirtualDefinition();
				setState(1884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1880);
					match(COMMA_);
					setState(1881);
					columnOrVirtualDefinition();
					}
					}
					setState(1886);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1887);
				match(RP_);
				}
				break;
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case TYPE:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1889);
				columnOrVirtualDefinition();
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

	public static class ColumnOrVirtualDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public VirtualColumnDefinitionContext virtualColumnDefinition() {
			return getRuleContext(VirtualColumnDefinitionContext.class,0);
		}
		public ColumnOrVirtualDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrVirtualDefinition; }
	}

	public final ColumnOrVirtualDefinitionContext columnOrVirtualDefinition() throws RecognitionException {
		ColumnOrVirtualDefinitionContext _localctx = new ColumnOrVirtualDefinitionContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_columnOrVirtualDefinition);
		try {
			setState(1894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1892);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1893);
				virtualColumnDefinition();
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

	public static class ColumnPropertiesContext extends ParserRuleContext {
		public List<ColumnPropertyContext> columnProperty() {
			return getRuleContexts(ColumnPropertyContext.class);
		}
		public ColumnPropertyContext columnProperty(int i) {
			return getRuleContext(ColumnPropertyContext.class,i);
		}
		public ColumnPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProperties; }
	}

	public final ColumnPropertiesContext columnProperties() throws RecognitionException {
		ColumnPropertiesContext _localctx = new ColumnPropertiesContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_columnProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1896);
				columnProperty();
				}
				}
				setState(1899); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLUMN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnPropertyContext extends ParserRuleContext {
		public ObjectTypeColPropertiesContext objectTypeColProperties() {
			return getRuleContext(ObjectTypeColPropertiesContext.class,0);
		}
		public ColumnPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProperty; }
	}

	public final ColumnPropertyContext columnProperty() throws RecognitionException {
		ColumnPropertyContext _localctx = new ColumnPropertyContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_columnProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
			objectTypeColProperties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectTypeColPropertiesContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SubstitutableColumnClauseContext substitutableColumnClause() {
			return getRuleContext(SubstitutableColumnClauseContext.class,0);
		}
		public ObjectTypeColPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectTypeColProperties; }
	}

	public final ObjectTypeColPropertiesContext objectTypeColProperties() throws RecognitionException {
		ObjectTypeColPropertiesContext _localctx = new ObjectTypeColPropertiesContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_objectTypeColProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			match(COLUMN);
			setState(1904);
			columnName();
			setState(1905);
			substitutableColumnClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubstitutableColumnClauseContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TerminalNode OF() { return getToken(OracleStatementParser.OF, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ELEMENT() { return getToken(OracleStatementParser.ELEMENT, 0); }
		public TerminalNode TYPE() { return getToken(OracleStatementParser.TYPE, 0); }
		public TerminalNode ONLY() { return getToken(OracleStatementParser.ONLY, 0); }
		public TerminalNode SUBSTITUTABLE() { return getToken(OracleStatementParser.SUBSTITUTABLE, 0); }
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode LEVELS() { return getToken(OracleStatementParser.LEVELS, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public SubstitutableColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substitutableColumnClause; }
	}

	public final SubstitutableColumnClauseContext substitutableColumnClause() throws RecognitionException {
		SubstitutableColumnClauseContext _localctx = new SubstitutableColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_substitutableColumnClause);
		int _la;
		try {
			setState(1929);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS:
			case ELEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELEMENT) {
					{
					setState(1907);
					match(ELEMENT);
					}
				}

				setState(1910);
				match(IS);
				setState(1911);
				match(OF);
				setState(1913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(1912);
					match(TYPE);
					}
				}

				setState(1915);
				match(LP_);
				setState(1917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ONLY) {
					{
					setState(1916);
					match(ONLY);
					}
				}

				setState(1919);
				dataTypeName_();
				setState(1920);
				match(RP_);
				}
				break;
			case NOT:
			case SUBSTITUTABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1922);
					match(NOT);
					}
				}

				setState(1925);
				match(SUBSTITUTABLE);
				setState(1926);
				match(AT);
				setState(1927);
				match(ALL);
				setState(1928);
				match(LEVELS);
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

	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(OracleStatementParser.MODIFY, 0); }
		public List<ModifyColPropertiesContext> modifyColProperties() {
			return getRuleContexts(ModifyColPropertiesContext.class);
		}
		public ModifyColPropertiesContext modifyColProperties(int i) {
			return getRuleContext(ModifyColPropertiesContext.class,i);
		}
		public ModifyColSubstitutableContext modifyColSubstitutable() {
			return getRuleContext(ModifyColSubstitutableContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_modifyColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1931);
			match(MODIFY);
			setState(1947);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case TYPE:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case IDENTIFIER_:
				{
				setState(1933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1932);
					match(LP_);
					}
				}

				setState(1935);
				modifyColProperties();
				setState(1940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1936);
					match(COMMA_);
					setState(1937);
					modifyColProperties();
					}
					}
					setState(1942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RP_) {
					{
					setState(1943);
					match(RP_);
					}
				}

				}
				break;
			case COLUMN:
				{
				setState(1946);
				modifyColSubstitutable();
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

	public static class ModifyColPropertiesContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENCRYPT() { return getToken(OracleStatementParser.ENCRYPT, 0); }
		public EncryptionSpecification_Context encryptionSpecification_() {
			return getRuleContext(EncryptionSpecification_Context.class,0);
		}
		public TerminalNode DECRYPT() { return getToken(OracleStatementParser.DECRYPT, 0); }
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public ModifyColPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColProperties; }
	}

	public final ModifyColPropertiesContext modifyColProperties() throws RecognitionException {
		ModifyColPropertiesContext _localctx = new ModifyColPropertiesContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_modifyColProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1949);
			columnName();
			setState(1951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIONAL || _la==IDENTIFIER_) {
				{
				setState(1950);
				dataType();
				}
			}

			setState(1955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1953);
				match(DEFAULT);
				setState(1954);
				expr(0);
				}
			}

			setState(1960);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENCRYPT:
				{
				setState(1957);
				match(ENCRYPT);
				setState(1958);
				encryptionSpecification_();
				}
				break;
			case DECRYPT:
				{
				setState(1959);
				match(DECRYPT);
				}
				break;
			case EOF:
			case RP_:
			case COMMA_:
			case SEMI_:
			case DROP:
			case ADD:
			case SET:
			case CONSTRAINT:
			case PRIMARY:
			case UNIQUE:
			case KEY:
			case NOT:
			case NULL:
			case CHECK:
			case REFERENCES:
			case MODIFY:
				break;
			default:
				break;
			}
			setState(1965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (KEY - 61)) | (1L << (NOT - 61)) | (1L << (NULL - 61)))) != 0) || _la==CHECK || _la==REFERENCES) {
				{
				{
				setState(1962);
				inlineConstraint();
				}
				}
				setState(1967);
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

	public static class ModifyColSubstitutableContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode SUBSTITUTABLE() { return getToken(OracleStatementParser.SUBSTITUTABLE, 0); }
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode LEVELS() { return getToken(OracleStatementParser.LEVELS, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode FORCE() { return getToken(OracleStatementParser.FORCE, 0); }
		public ModifyColSubstitutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColSubstitutable; }
	}

	public final ModifyColSubstitutableContext modifyColSubstitutable() throws RecognitionException {
		ModifyColSubstitutableContext _localctx = new ModifyColSubstitutableContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_modifyColSubstitutable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			match(COLUMN);
			setState(1969);
			columnName();
			setState(1971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1970);
				match(NOT);
				}
			}

			setState(1973);
			match(SUBSTITUTABLE);
			setState(1974);
			match(AT);
			setState(1975);
			match(ALL);
			setState(1976);
			match(LEVELS);
			setState(1978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORCE) {
				{
				setState(1977);
				match(FORCE);
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

	public static class DropColumnClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode UNUSED() { return getToken(OracleStatementParser.UNUSED, 0); }
		public ColumnOrColumnListContext columnOrColumnList() {
			return getRuleContext(ColumnOrColumnListContext.class,0);
		}
		public List<CascadeOrInvalidateContext> cascadeOrInvalidate() {
			return getRuleContexts(CascadeOrInvalidateContext.class);
		}
		public CascadeOrInvalidateContext cascadeOrInvalidate(int i) {
			return getRuleContext(CascadeOrInvalidateContext.class,i);
		}
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public DropColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnClause; }
	}

	public final DropColumnClauseContext dropColumnClause() throws RecognitionException {
		DropColumnClauseContext _localctx = new DropColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_dropColumnClause);
		int _la;
		try {
			setState(1990);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1980);
				match(SET);
				setState(1981);
				match(UNUSED);
				setState(1982);
				columnOrColumnList();
				setState(1986);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASCADE || _la==INVALIDATE) {
					{
					{
					setState(1983);
					cascadeOrInvalidate();
					}
					}
					setState(1988);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1989);
				dropColumnSpecification();
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

	public static class DropColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public ColumnOrColumnListContext columnOrColumnList() {
			return getRuleContext(ColumnOrColumnListContext.class,0);
		}
		public List<CascadeOrInvalidateContext> cascadeOrInvalidate() {
			return getRuleContexts(CascadeOrInvalidateContext.class);
		}
		public CascadeOrInvalidateContext cascadeOrInvalidate(int i) {
			return getRuleContext(CascadeOrInvalidateContext.class,i);
		}
		public CheckpointNumberContext checkpointNumber() {
			return getRuleContext(CheckpointNumberContext.class,0);
		}
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_dropColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1992);
			match(DROP);
			setState(1993);
			columnOrColumnList();
			setState(1997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASCADE || _la==INVALIDATE) {
				{
				{
				setState(1994);
				cascadeOrInvalidate();
				}
				}
				setState(1999);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHECKPOINT) {
				{
				setState(2000);
				checkpointNumber();
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

	public static class ColumnOrColumnListContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ColumnOrColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrColumnList; }
	}

	public final ColumnOrColumnListContext columnOrColumnList() throws RecognitionException {
		ColumnOrColumnListContext _localctx = new ColumnOrColumnListContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_columnOrColumnList);
		int _la;
		try {
			setState(2016);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLUMN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2003);
				match(COLUMN);
				setState(2004);
				columnName();
				}
				break;
			case LP_:
				enterOuterAlt(_localctx, 2);
				{
				setState(2005);
				match(LP_);
				setState(2006);
				columnName();
				setState(2011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2007);
					match(COMMA_);
					setState(2008);
					columnName();
					}
					}
					setState(2013);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2014);
				match(RP_);
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

	public static class CascadeOrInvalidateContext extends ParserRuleContext {
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(OracleStatementParser.CONSTRAINTS, 0); }
		public TerminalNode INVALIDATE() { return getToken(OracleStatementParser.INVALIDATE, 0); }
		public CascadeOrInvalidateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cascadeOrInvalidate; }
	}

	public final CascadeOrInvalidateContext cascadeOrInvalidate() throws RecognitionException {
		CascadeOrInvalidateContext _localctx = new CascadeOrInvalidateContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_cascadeOrInvalidate);
		try {
			setState(2021);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASCADE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2018);
				match(CASCADE);
				setState(2019);
				match(CONSTRAINTS);
				}
				break;
			case INVALIDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2020);
				match(INVALIDATE);
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

	public static class CheckpointNumberContext extends ParserRuleContext {
		public TerminalNode CHECKPOINT() { return getToken(OracleStatementParser.CHECKPOINT, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public CheckpointNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkpointNumber; }
	}

	public final CheckpointNumberContext checkpointNumber() throws RecognitionException {
		CheckpointNumberContext _localctx = new CheckpointNumberContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_checkpointNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
			match(CHECKPOINT);
			setState(2024);
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

	public static class RenameColumnClauseContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public RenameColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameColumnClause; }
	}

	public final RenameColumnClauseContext renameColumnClause() throws RecognitionException {
		RenameColumnClauseContext _localctx = new RenameColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_renameColumnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2026);
			match(RENAME);
			setState(2027);
			match(COLUMN);
			setState(2028);
			columnName();
			setState(2029);
			match(TO);
			setState(2030);
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

	public static class ConstraintClausesContext extends ParserRuleContext {
		public AddConstraintSpecificationContext addConstraintSpecification() {
			return getRuleContext(AddConstraintSpecificationContext.class,0);
		}
		public ModifyConstraintClauseContext modifyConstraintClause() {
			return getRuleContext(ModifyConstraintClauseContext.class,0);
		}
		public RenameConstraintClauseContext renameConstraintClause() {
			return getRuleContext(RenameConstraintClauseContext.class,0);
		}
		public List<DropConstraintClauseContext> dropConstraintClause() {
			return getRuleContexts(DropConstraintClauseContext.class);
		}
		public DropConstraintClauseContext dropConstraintClause(int i) {
			return getRuleContext(DropConstraintClauseContext.class,i);
		}
		public ConstraintClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintClauses; }
	}

	public final ConstraintClausesContext constraintClauses() throws RecognitionException {
		ConstraintClausesContext _localctx = new ConstraintClausesContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_constraintClauses);
		int _la;
		try {
			setState(2040);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(2032);
				addConstraintSpecification();
				}
				break;
			case MODIFY:
				enterOuterAlt(_localctx, 2);
				{
				setState(2033);
				modifyConstraintClause();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(2034);
				renameConstraintClause();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 4);
				{
				setState(2036); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2035);
					dropConstraintClause();
					}
					}
					setState(2038); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DROP );
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

	public static class AddConstraintSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(OracleStatementParser.ADD, 0); }
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public List<OutOfLineConstraintContext> outOfLineConstraint() {
			return getRuleContexts(OutOfLineConstraintContext.class);
		}
		public OutOfLineConstraintContext outOfLineConstraint(int i) {
			return getRuleContext(OutOfLineConstraintContext.class,i);
		}
		public AddConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraintSpecification; }
	}

	public final AddConstraintSpecificationContext addConstraintSpecification() throws RecognitionException {
		AddConstraintSpecificationContext _localctx = new AddConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_addConstraintSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			match(ADD);
			setState(2049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(2044); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2043);
					outOfLineConstraint();
					}
					}
					setState(2046); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (FOREIGN - 61)) | (1L << (KEY - 61)))) != 0) || _la==CHECK );
				}
				break;
			case 2:
				{
				setState(2048);
				outOfLineRefConstraint();
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

	public static class ModifyConstraintClauseContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(OracleStatementParser.MODIFY, 0); }
		public ConstraintOptionContext constraintOption() {
			return getRuleContext(ConstraintOptionContext.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public ModifyConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyConstraintClause; }
	}

	public final ModifyConstraintClauseContext modifyConstraintClause() throws RecognitionException {
		ModifyConstraintClauseContext _localctx = new ModifyConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_modifyConstraintClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2051);
			match(MODIFY);
			setState(2052);
			constraintOption();
			setState(2054); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2053);
				constraintState();
				}
				}
				setState(2056); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (USING - 91)) | (1L << (NOT - 91)) | (1L << (ENABLE - 91)) | (1L << (DISABLE - 91)))) != 0) || ((((_la - 215)) & ~0x3f) == 0 && ((1L << (_la - 215)) & ((1L << (DEFERRABLE - 215)) | (1L << (EXCEPTIONS - 215)) | (1L << (INITIALLY - 215)) | (1L << (NORELY - 215)) | (1L << (RELY - 215)) | (1L << (VALIDATE - 215)) | (1L << (NOVALIDATE - 215)))) != 0) );
			setState(2059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE) {
				{
				setState(2058);
				match(CASCADE);
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

	public static class ConstraintWithNameContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintWithNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintWithName; }
	}

	public final ConstraintWithNameContext constraintWithName() throws RecognitionException {
		ConstraintWithNameContext _localctx = new ConstraintWithNameContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_constraintWithName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			match(CONSTRAINT);
			setState(2062);
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

	public static class ConstraintOptionContext extends ParserRuleContext {
		public ConstraintWithNameContext constraintWithName() {
			return getRuleContext(ConstraintWithNameContext.class,0);
		}
		public ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() {
			return getRuleContext(ConstraintPrimaryOrUniqueContext.class,0);
		}
		public ConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintOption; }
	}

	public final ConstraintOptionContext constraintOption() throws RecognitionException {
		ConstraintOptionContext _localctx = new ConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_constraintOption);
		try {
			setState(2066);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2064);
				constraintWithName();
				}
				break;
			case PRIMARY:
			case UNIQUE:
			case KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(2065);
				constraintPrimaryOrUnique();
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

	public static class ConstraintPrimaryOrUniqueContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ConstraintPrimaryOrUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintPrimaryOrUnique; }
	}

	public final ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() throws RecognitionException {
		ConstraintPrimaryOrUniqueContext _localctx = new ConstraintPrimaryOrUniqueContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_constraintPrimaryOrUnique);
		try {
			setState(2071);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(2068);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2069);
				match(UNIQUE);
				setState(2070);
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

	public static class RenameConstraintClauseContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public ConstraintWithNameContext constraintWithName() {
			return getRuleContext(ConstraintWithNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public RenameConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameConstraintClause; }
	}

	public final RenameConstraintClauseContext renameConstraintClause() throws RecognitionException {
		RenameConstraintClauseContext _localctx = new RenameConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_renameConstraintClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2073);
			match(RENAME);
			setState(2074);
			constraintWithName();
			setState(2075);
			match(TO);
			setState(2076);
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

	public static class DropConstraintClauseContext extends ParserRuleContext {
		public List<TerminalNode> DROP() { return getTokens(OracleStatementParser.DROP); }
		public TerminalNode DROP(int i) {
			return getToken(OracleStatementParser.DROP, i);
		}
		public ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() {
			return getRuleContext(ConstraintPrimaryOrUniqueContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public DropConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintClause; }
	}

	public final DropConstraintClauseContext dropConstraintClause() throws RecognitionException {
		DropConstraintClauseContext _localctx = new DropConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_dropConstraintClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2078);
			match(DROP);
			setState(2092);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case UNIQUE:
			case KEY:
				{
				setState(2079);
				constraintPrimaryOrUnique();
				setState(2081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE) {
					{
					setState(2080);
					match(CASCADE);
					}
				}

				setState(2085);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(2083);
					_la = _input.LA(1);
					if ( !(_la==DROP || _la==KEEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2084);
					match(INDEX);
					}
					break;
				}
				}
				break;
			case CONSTRAINT:
				{
				{
				setState(2087);
				match(CONSTRAINT);
				setState(2088);
				ignoredIdentifier_();
				setState(2090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE) {
					{
					setState(2089);
					match(CASCADE);
					}
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

	public static class AlterExternalTableContext extends ParserRuleContext {
		public List<AddColumnSpecificationContext> addColumnSpecification() {
			return getRuleContexts(AddColumnSpecificationContext.class);
		}
		public AddColumnSpecificationContext addColumnSpecification(int i) {
			return getRuleContext(AddColumnSpecificationContext.class,i);
		}
		public List<ModifyColumnSpecificationContext> modifyColumnSpecification() {
			return getRuleContexts(ModifyColumnSpecificationContext.class);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification(int i) {
			return getRuleContext(ModifyColumnSpecificationContext.class,i);
		}
		public List<DropColumnSpecificationContext> dropColumnSpecification() {
			return getRuleContexts(DropColumnSpecificationContext.class);
		}
		public DropColumnSpecificationContext dropColumnSpecification(int i) {
			return getRuleContext(DropColumnSpecificationContext.class,i);
		}
		public AlterExternalTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterExternalTable; }
	}

	public final AlterExternalTableContext alterExternalTable() throws RecognitionException {
		AlterExternalTableContext _localctx = new AlterExternalTableContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_alterExternalTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2097); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(2097);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(2094);
					addColumnSpecification();
					}
					break;
				case MODIFY:
					{
					setState(2095);
					modifyColumnSpecification();
					}
					break;
				case DROP:
					{
					setState(2096);
					dropColumnSpecification();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2099); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DROP || _la==ADD || _la==MODIFY );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectPropertiesContext extends ParserRuleContext {
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ObjectPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperties; }
	}

	public final ObjectPropertiesContext objectProperties() throws RecognitionException {
		ObjectPropertiesContext _localctx = new ObjectPropertiesContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_objectProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2101);
			objectProperty();
			setState(2106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2102);
				match(COMMA_);
				setState(2103);
				objectProperty();
				}
				}
				setState(2108);
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

	public static class ObjectPropertyContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public InlineRefConstraintContext inlineRefConstraint() {
			return getRuleContext(InlineRefConstraintContext.class,0);
		}
		public OutOfLineConstraintContext outOfLineConstraint() {
			return getRuleContext(OutOfLineConstraintContext.class,0);
		}
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_objectProperty);
		int _la;
		try {
			setState(2130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(2109);
					columnName();
					}
					break;
				case 2:
					{
					setState(2110);
					attributeName();
					}
					break;
				}
				setState(2115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2113);
					match(DEFAULT);
					setState(2114);
					expr(0);
					}
				}

				setState(2126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(2120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (KEY - 61)) | (1L << (NOT - 61)) | (1L << (NULL - 61)))) != 0) || _la==CHECK || _la==REFERENCES) {
						{
						{
						setState(2117);
						inlineConstraint();
						}
						}
						setState(2122);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(2124);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CONSTRAINT || _la==WITH || _la==REFERENCES || _la==SCOPE) {
						{
						setState(2123);
						inlineRefConstraint();
						}
					}

					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2128);
				outOfLineConstraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2129);
				outOfLineRefConstraint();
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

	public static class RenameIndexClause_Context extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public RenameIndexClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameIndexClause_; }
	}

	public final RenameIndexClause_Context renameIndexClause_() throws RecognitionException {
		RenameIndexClause_Context _localctx = new RenameIndexClause_Context(_ctx, getState());
		enterRule(_localctx, 354, RULE_renameIndexClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RENAME) {
				{
				setState(2132);
				match(RENAME);
				setState(2133);
				match(TO);
				setState(2134);
				indexName();
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

	public static class SetTransactionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(OracleStatementParser.TRANSACTION, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_setTransaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2137);
			match(SET);
			setState(2138);
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

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2140);
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
		public TerminalNode ROLLBACK() { return getToken(OracleStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2142);
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
		public TerminalNode SAVEPOINT() { return getToken(OracleStatementParser.SAVEPOINT, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_savepoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
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
		public TerminalNode GRANT() { return getToken(OracleStatementParser.GRANT, 0); }
		public ObjectPrivilegeClause_Context objectPrivilegeClause_() {
			return getRuleContext(ObjectPrivilegeClause_Context.class,0);
		}
		public SystemPrivilegeClause_Context systemPrivilegeClause_() {
			return getRuleContext(SystemPrivilegeClause_Context.class,0);
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
		enterRule(_localctx, 364, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2146);
			match(GRANT);
			setState(2150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(2147);
				objectPrivilegeClause_();
				}
				break;
			case 2:
				{
				setState(2148);
				systemPrivilegeClause_();
				}
				break;
			case 3:
				{
				setState(2149);
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
		public TerminalNode REVOKE() { return getToken(OracleStatementParser.REVOKE, 0); }
		public ObjectPrivilegeClause_Context objectPrivilegeClause_() {
			return getRuleContext(ObjectPrivilegeClause_Context.class,0);
		}
		public SystemPrivilegeClause_Context systemPrivilegeClause_() {
			return getRuleContext(SystemPrivilegeClause_Context.class,0);
		}
		public RoleClause_Context roleClause_() {
			return getRuleContext(RoleClause_Context.class,0);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_revoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2152);
			match(REVOKE);
			setState(2156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2153);
				objectPrivilegeClause_();
				}
				break;
			case 2:
				{
				setState(2154);
				systemPrivilegeClause_();
				}
				break;
			case 3:
				{
				setState(2155);
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

	public static class ObjectPrivilegeClause_Context extends ParserRuleContext {
		public ObjectPrivileges_Context objectPrivileges_() {
			return getRuleContext(ObjectPrivileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public OnObjectClause_Context onObjectClause_() {
			return getRuleContext(OnObjectClause_Context.class,0);
		}
		public ObjectPrivilegeClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPrivilegeClause_; }
	}

	public final ObjectPrivilegeClause_Context objectPrivilegeClause_() throws RecognitionException {
		ObjectPrivilegeClause_Context _localctx = new ObjectPrivilegeClause_Context(_ctx, getState());
		enterRule(_localctx, 368, RULE_objectPrivilegeClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2158);
			objectPrivileges_();
			setState(2159);
			match(ON);
			setState(2160);
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

	public static class SystemPrivilegeClause_Context extends ParserRuleContext {
		public SystemPrivilege_Context systemPrivilege_() {
			return getRuleContext(SystemPrivilege_Context.class,0);
		}
		public SystemPrivilegeClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemPrivilegeClause_; }
	}

	public final SystemPrivilegeClause_Context systemPrivilegeClause_() throws RecognitionException {
		SystemPrivilegeClause_Context _localctx = new SystemPrivilegeClause_Context(_ctx, getState());
		enterRule(_localctx, 370, RULE_systemPrivilegeClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2162);
			systemPrivilege_();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 372, RULE_roleClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2164);
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

	public static class ObjectPrivileges_Context extends ParserRuleContext {
		public List<ObjectPrivilegeType_Context> objectPrivilegeType_() {
			return getRuleContexts(ObjectPrivilegeType_Context.class);
		}
		public ObjectPrivilegeType_Context objectPrivilegeType_(int i) {
			return getRuleContext(ObjectPrivilegeType_Context.class,i);
		}
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ObjectPrivileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPrivileges_; }
	}

	public final ObjectPrivileges_Context objectPrivileges_() throws RecognitionException {
		ObjectPrivileges_Context _localctx = new ObjectPrivileges_Context(_ctx, getState());
		enterRule(_localctx, 374, RULE_objectPrivileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2166);
			objectPrivilegeType_();
			setState(2168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (LP_ - 29)) | (1L << (TRUNCATE - 29)) | (1L << (SCHEMA - 29)) | (1L << (FUNCTION - 29)) | (1L << (PROCEDURE - 29)) | (1L << (CASE - 29)) | (1L << (WHEN - 29)) | (1L << (CAST - 29)) | (1L << (TRIM - 29)) | (1L << (SUBSTRING - 29)) | (1L << (NATURAL - 29)) | (1L << (JOIN - 29)) | (1L << (FULL - 29)) | (1L << (INNER - 29)) | (1L << (OUTER - 29)) | (1L << (LEFT - 29)) | (1L << (RIGHT - 29)) | (1L << (CROSS - 29)) | (1L << (USING - 29)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (IF - 95)) | (1L << (TRUE - 95)) | (1L << (FALSE - 95)) | (1L << (LIMIT - 95)) | (1L << (OFFSET - 95)) | (1L << (BEGIN - 95)) | (1L << (COMMIT - 95)) | (1L << (ROLLBACK - 95)) | (1L << (SAVEPOINT - 95)) | (1L << (BOOLEAN - 95)) | (1L << (DOUBLE - 95)) | (1L << (CHARACTER - 95)) | (1L << (ARRAY - 95)) | (1L << (INTERVAL - 95)) | (1L << (TIME - 95)) | (1L << (TIMESTAMP - 95)) | (1L << (LOCALTIME - 95)) | (1L << (LOCALTIMESTAMP - 95)) | (1L << (YEAR - 95)) | (1L << (QUARTER - 95)) | (1L << (MONTH - 95)) | (1L << (WEEK - 95)) | (1L << (DAY - 95)) | (1L << (HOUR - 95)) | (1L << (MINUTE - 95)) | (1L << (SECOND - 95)) | (1L << (MICROSECOND - 95)) | (1L << (MAX - 95)) | (1L << (MIN - 95)) | (1L << (SUM - 95)) | (1L << (COUNT - 95)) | (1L << (AVG - 95)) | (1L << (ENABLE - 95)) | (1L << (DISABLE - 95)) | (1L << (PRESERVE - 95)) | (1L << (DO - 95)) | (1L << (DEFINER - 95)))) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & ((1L << (CURRENT_USER - 159)) | (1L << (SQL - 159)) | (1L << (CASCADED - 159)) | (1L << (LOCAL - 159)) | (1L << (CLOSE - 159)) | (1L << (OPEN - 159)) | (1L << (NEXT - 159)) | (1L << (NAME - 159)) | (1L << (BINARY - 159)) | (1L << (ESCAPE - 159)) | (1L << (MOD - 159)) | (1L << (XOR - 159)) | (1L << (UNKNOWN - 159)) | (1L << (ALWAYS - 159)) | (1L << (CASCADE - 159)) | (1L << (GENERATED - 159)) | (1L << (PRIVILEGES - 159)) | (1L << (READ - 159)) | (1L << (WRITE - 159)) | (1L << (REFERENCES - 159)) | (1L << (TRANSACTION - 159)) | (1L << (ROLE - 159)) | (1L << (VISIBLE - 159)) | (1L << (INVISIBLE - 159)) | (1L << (EXECUTE - 159)) | (1L << (USE - 159)) | (1L << (DEBUG - 159)) | (1L << (UNDER - 159)) | (1L << (FLASHBACK - 159)) | (1L << (ARCHIVE - 159)) | (1L << (REFRESH - 159)) | (1L << (QUERY - 159)) | (1L << (REWRITE - 159)) | (1L << (KEEP - 159)) | (1L << (SEQUENCE - 159)) | (1L << (INHERIT - 159)) | (1L << (TRANSLATE - 159)) | (1L << (MERGE - 159)) | (1L << (AT - 159)) | (1L << (BITMAP - 159)) | (1L << (CACHE - 159)) | (1L << (NOCACHE - 159)) | (1L << (CHECKPOINT - 159)) | (1L << (CONNECT - 159)) | (1L << (CONSTRAINTS - 159)) | (1L << (CYCLE - 159)) | (1L << (NOCYCLE - 159)) | (1L << (DBTIMEZONE - 159)) | (1L << (ENCRYPT - 159)) | (1L << (DECRYPT - 159)) | (1L << (DEFERRABLE - 159)) | (1L << (DEFERRED - 159)) | (1L << (EDITION - 159)) | (1L << (ELEMENT - 159)) | (1L << (END - 159)) | (1L << (EXCEPTIONS - 159)) | (1L << (FORCE - 159)))) != 0) || ((((_la - 223)) & ~0x3f) == 0 && ((1L << (_la - 223)) & ((1L << (GLOBAL - 223)) | (1L << (IDENTITY - 223)) | (1L << (INITIALLY - 223)) | (1L << (INVALIDATE - 223)) | (1L << (JAVA - 223)) | (1L << (LEVELS - 223)) | (1L << (MAXVALUE - 223)) | (1L << (MINVALUE - 223)) | (1L << (NOMAXVALUE - 223)) | (1L << (NOMINVALUE - 223)) | (1L << (MINING - 223)) | (1L << (MODEL - 223)) | (1L << (NATIONAL - 223)) | (1L << (NEW - 223)) | (1L << (NOORDER - 223)) | (1L << (NORELY - 223)) | (1L << (ONLY - 223)) | (1L << (PROFILE - 223)) | (1L << (REF - 223)) | (1L << (REKEY - 223)) | (1L << (RELY - 223)) | (1L << (REPLACE - 223)) | (1L << (SALT - 223)) | (1L << (SCOPE - 223)) | (1L << (SORT - 223)) | (1L << (SOURCE - 223)) | (1L << (SUBSTITUTABLE - 223)) | (1L << (TABLESPACE - 223)) | (1L << (TEMPORARY - 223)) | (1L << (TRANSLATION - 223)) | (1L << (TREAT - 223)) | (1L << (NO - 223)) | (1L << (TYPE - 223)) | (1L << (UNUSED - 223)) | (1L << (NOVALIDATE - 223)) | (1L << (VALUE - 223)) | (1L << (VARYING - 223)) | (1L << (VIRTUAL - 223)) | (1L << (ZONE - 223)) | (1L << (ADVISOR - 223)) | (1L << (ADMINISTER - 223)) | (1L << (TUNING - 223)) | (1L << (MANAGE - 223)) | (1L << (MANAGEMENT - 223)) | (1L << (OBJECT - 223)) | (1L << (CLUSTER - 223)) | (1L << (CONTEXT - 223)) | (1L << (EXEMPT - 223)) | (1L << (REDACTION - 223)) | (1L << (POLICY - 223)))) != 0) || ((((_la - 287)) & ~0x3f) == 0 && ((1L << (_la - 287)) & ((1L << (DATABASE - 287)) | (1L << (SYSTEM - 287)) | (1L << (AUDIT - 287)) | (1L << (LINK - 287)) | (1L << (ANALYZE - 287)) | (1L << (DICTIONARY - 287)) | (1L << (DIMENSION - 287)) | (1L << (INDEXTYPE - 287)) | (1L << (EXTERNAL - 287)) | (1L << (JOB - 287)) | (1L << (CLASS - 287)) | (1L << (PROGRAM - 287)) | (1L << (SCHEDULER - 287)) | (1L << (LIBRARY - 287)) | (1L << (LOGMINING - 287)) | (1L << (MATERIALIZED - 287)) | (1L << (CUBE - 287)) | (1L << (MEASURE - 287)) | (1L << (FOLDER - 287)) | (1L << (BUILD - 287)) | (1L << (PROCESS - 287)) | (1L << (OPERATOR - 287)) | (1L << (OUTLINE - 287)) | (1L << (PLUGGABLE - 287)) | (1L << (CONTAINER - 287)) | (1L << (SEGMENT - 287)) | (1L << (RESTRICTED - 287)) | (1L << (COST - 287)) | (1L << (SYNONYM - 287)) | (1L << (BACKUP - 287)) | (1L << (UNLIMITED - 287)) | (1L << (BECOME - 287)) | (1L << (CHANGE - 287)) | (1L << (NOTIFICATION - 287)) | (1L << (ACCESS - 287)) | (1L << (PRIVILEGE - 287)) | (1L << (PURGE - 287)) | (1L << (RESUMABLE - 287)) | (1L << (SYSGUID - 287)) | (1L << (SYSBACKUP - 287)) | (1L << (SYSDBA - 287)) | (1L << (SYSDG - 287)) | (1L << (SYSKM - 287)) | (1L << (SYSOPER - 287)) | (1L << (DBA_RECYCLEBIN - 287)) | (1L << (IDENTIFIER_ - 287)))) != 0)) {
				{
				setState(2167);
				columnNames();
				}
			}

			setState(2177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2170);
				match(COMMA_);
				setState(2171);
				objectPrivilegeType_();
				setState(2173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (LP_ - 29)) | (1L << (TRUNCATE - 29)) | (1L << (SCHEMA - 29)) | (1L << (FUNCTION - 29)) | (1L << (PROCEDURE - 29)) | (1L << (CASE - 29)) | (1L << (WHEN - 29)) | (1L << (CAST - 29)) | (1L << (TRIM - 29)) | (1L << (SUBSTRING - 29)) | (1L << (NATURAL - 29)) | (1L << (JOIN - 29)) | (1L << (FULL - 29)) | (1L << (INNER - 29)) | (1L << (OUTER - 29)) | (1L << (LEFT - 29)) | (1L << (RIGHT - 29)) | (1L << (CROSS - 29)) | (1L << (USING - 29)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (IF - 95)) | (1L << (TRUE - 95)) | (1L << (FALSE - 95)) | (1L << (LIMIT - 95)) | (1L << (OFFSET - 95)) | (1L << (BEGIN - 95)) | (1L << (COMMIT - 95)) | (1L << (ROLLBACK - 95)) | (1L << (SAVEPOINT - 95)) | (1L << (BOOLEAN - 95)) | (1L << (DOUBLE - 95)) | (1L << (CHARACTER - 95)) | (1L << (ARRAY - 95)) | (1L << (INTERVAL - 95)) | (1L << (TIME - 95)) | (1L << (TIMESTAMP - 95)) | (1L << (LOCALTIME - 95)) | (1L << (LOCALTIMESTAMP - 95)) | (1L << (YEAR - 95)) | (1L << (QUARTER - 95)) | (1L << (MONTH - 95)) | (1L << (WEEK - 95)) | (1L << (DAY - 95)) | (1L << (HOUR - 95)) | (1L << (MINUTE - 95)) | (1L << (SECOND - 95)) | (1L << (MICROSECOND - 95)) | (1L << (MAX - 95)) | (1L << (MIN - 95)) | (1L << (SUM - 95)) | (1L << (COUNT - 95)) | (1L << (AVG - 95)) | (1L << (ENABLE - 95)) | (1L << (DISABLE - 95)) | (1L << (PRESERVE - 95)) | (1L << (DO - 95)) | (1L << (DEFINER - 95)))) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & ((1L << (CURRENT_USER - 159)) | (1L << (SQL - 159)) | (1L << (CASCADED - 159)) | (1L << (LOCAL - 159)) | (1L << (CLOSE - 159)) | (1L << (OPEN - 159)) | (1L << (NEXT - 159)) | (1L << (NAME - 159)) | (1L << (BINARY - 159)) | (1L << (ESCAPE - 159)) | (1L << (MOD - 159)) | (1L << (XOR - 159)) | (1L << (UNKNOWN - 159)) | (1L << (ALWAYS - 159)) | (1L << (CASCADE - 159)) | (1L << (GENERATED - 159)) | (1L << (PRIVILEGES - 159)) | (1L << (READ - 159)) | (1L << (WRITE - 159)) | (1L << (REFERENCES - 159)) | (1L << (TRANSACTION - 159)) | (1L << (ROLE - 159)) | (1L << (VISIBLE - 159)) | (1L << (INVISIBLE - 159)) | (1L << (EXECUTE - 159)) | (1L << (USE - 159)) | (1L << (DEBUG - 159)) | (1L << (UNDER - 159)) | (1L << (FLASHBACK - 159)) | (1L << (ARCHIVE - 159)) | (1L << (REFRESH - 159)) | (1L << (QUERY - 159)) | (1L << (REWRITE - 159)) | (1L << (KEEP - 159)) | (1L << (SEQUENCE - 159)) | (1L << (INHERIT - 159)) | (1L << (TRANSLATE - 159)) | (1L << (MERGE - 159)) | (1L << (AT - 159)) | (1L << (BITMAP - 159)) | (1L << (CACHE - 159)) | (1L << (NOCACHE - 159)) | (1L << (CHECKPOINT - 159)) | (1L << (CONNECT - 159)) | (1L << (CONSTRAINTS - 159)) | (1L << (CYCLE - 159)) | (1L << (NOCYCLE - 159)) | (1L << (DBTIMEZONE - 159)) | (1L << (ENCRYPT - 159)) | (1L << (DECRYPT - 159)) | (1L << (DEFERRABLE - 159)) | (1L << (DEFERRED - 159)) | (1L << (EDITION - 159)) | (1L << (ELEMENT - 159)) | (1L << (END - 159)) | (1L << (EXCEPTIONS - 159)) | (1L << (FORCE - 159)))) != 0) || ((((_la - 223)) & ~0x3f) == 0 && ((1L << (_la - 223)) & ((1L << (GLOBAL - 223)) | (1L << (IDENTITY - 223)) | (1L << (INITIALLY - 223)) | (1L << (INVALIDATE - 223)) | (1L << (JAVA - 223)) | (1L << (LEVELS - 223)) | (1L << (MAXVALUE - 223)) | (1L << (MINVALUE - 223)) | (1L << (NOMAXVALUE - 223)) | (1L << (NOMINVALUE - 223)) | (1L << (MINING - 223)) | (1L << (MODEL - 223)) | (1L << (NATIONAL - 223)) | (1L << (NEW - 223)) | (1L << (NOORDER - 223)) | (1L << (NORELY - 223)) | (1L << (ONLY - 223)) | (1L << (PROFILE - 223)) | (1L << (REF - 223)) | (1L << (REKEY - 223)) | (1L << (RELY - 223)) | (1L << (REPLACE - 223)) | (1L << (SALT - 223)) | (1L << (SCOPE - 223)) | (1L << (SORT - 223)) | (1L << (SOURCE - 223)) | (1L << (SUBSTITUTABLE - 223)) | (1L << (TABLESPACE - 223)) | (1L << (TEMPORARY - 223)) | (1L << (TRANSLATION - 223)) | (1L << (TREAT - 223)) | (1L << (NO - 223)) | (1L << (TYPE - 223)) | (1L << (UNUSED - 223)) | (1L << (NOVALIDATE - 223)) | (1L << (VALUE - 223)) | (1L << (VARYING - 223)) | (1L << (VIRTUAL - 223)) | (1L << (ZONE - 223)) | (1L << (ADVISOR - 223)) | (1L << (ADMINISTER - 223)) | (1L << (TUNING - 223)) | (1L << (MANAGE - 223)) | (1L << (MANAGEMENT - 223)) | (1L << (OBJECT - 223)) | (1L << (CLUSTER - 223)) | (1L << (CONTEXT - 223)) | (1L << (EXEMPT - 223)) | (1L << (REDACTION - 223)) | (1L << (POLICY - 223)))) != 0) || ((((_la - 287)) & ~0x3f) == 0 && ((1L << (_la - 287)) & ((1L << (DATABASE - 287)) | (1L << (SYSTEM - 287)) | (1L << (AUDIT - 287)) | (1L << (LINK - 287)) | (1L << (ANALYZE - 287)) | (1L << (DICTIONARY - 287)) | (1L << (DIMENSION - 287)) | (1L << (INDEXTYPE - 287)) | (1L << (EXTERNAL - 287)) | (1L << (JOB - 287)) | (1L << (CLASS - 287)) | (1L << (PROGRAM - 287)) | (1L << (SCHEDULER - 287)) | (1L << (LIBRARY - 287)) | (1L << (LOGMINING - 287)) | (1L << (MATERIALIZED - 287)) | (1L << (CUBE - 287)) | (1L << (MEASURE - 287)) | (1L << (FOLDER - 287)) | (1L << (BUILD - 287)) | (1L << (PROCESS - 287)) | (1L << (OPERATOR - 287)) | (1L << (OUTLINE - 287)) | (1L << (PLUGGABLE - 287)) | (1L << (CONTAINER - 287)) | (1L << (SEGMENT - 287)) | (1L << (RESTRICTED - 287)) | (1L << (COST - 287)) | (1L << (SYNONYM - 287)) | (1L << (BACKUP - 287)) | (1L << (UNLIMITED - 287)) | (1L << (BECOME - 287)) | (1L << (CHANGE - 287)) | (1L << (NOTIFICATION - 287)) | (1L << (ACCESS - 287)) | (1L << (PRIVILEGE - 287)) | (1L << (PURGE - 287)) | (1L << (RESUMABLE - 287)) | (1L << (SYSGUID - 287)) | (1L << (SYSBACKUP - 287)) | (1L << (SYSDBA - 287)) | (1L << (SYSDG - 287)) | (1L << (SYSKM - 287)) | (1L << (SYSOPER - 287)) | (1L << (DBA_RECYCLEBIN - 287)) | (1L << (IDENTIFIER_ - 287)))) != 0)) {
					{
					setState(2172);
					columnNames();
					}
				}

				}
				}
				setState(2179);
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

	public static class ObjectPrivilegeType_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public TerminalNode SELECT() { return getToken(OracleStatementParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(OracleStatementParser.INSERT, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(OracleStatementParser.UPDATE, 0); }
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode READ() { return getToken(OracleStatementParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(OracleStatementParser.WRITE, 0); }
		public TerminalNode EXECUTE() { return getToken(OracleStatementParser.EXECUTE, 0); }
		public TerminalNode USE() { return getToken(OracleStatementParser.USE, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public TerminalNode REFERENCES() { return getToken(OracleStatementParser.REFERENCES, 0); }
		public TerminalNode DEBUG() { return getToken(OracleStatementParser.DEBUG, 0); }
		public TerminalNode UNDER() { return getToken(OracleStatementParser.UNDER, 0); }
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TerminalNode ARCHIVE() { return getToken(OracleStatementParser.ARCHIVE, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode REFRESH() { return getToken(OracleStatementParser.REFRESH, 0); }
		public TerminalNode QUERY() { return getToken(OracleStatementParser.QUERY, 0); }
		public TerminalNode REWRITE() { return getToken(OracleStatementParser.REWRITE, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public TerminalNode SEQUENCE() { return getToken(OracleStatementParser.SEQUENCE, 0); }
		public TerminalNode INHERIT() { return getToken(OracleStatementParser.INHERIT, 0); }
		public TerminalNode TRANSLATE() { return getToken(OracleStatementParser.TRANSLATE, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode MERGE() { return getToken(OracleStatementParser.MERGE, 0); }
		public TerminalNode VIEW() { return getToken(OracleStatementParser.VIEW, 0); }
		public ObjectPrivilegeType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPrivilegeType_; }
	}

	public final ObjectPrivilegeType_Context objectPrivilegeType_() throws RecognitionException {
		ObjectPrivilegeType_Context _localctx = new ObjectPrivilegeType_Context(_ctx, getState());
		enterRule(_localctx, 376, RULE_objectPrivilegeType_);
		try {
			setState(2212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2180);
				match(ALL);
				setState(2182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(2181);
					match(PRIVILEGES);
					}
					break;
				}
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2184);
				match(SELECT);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2185);
				match(INSERT);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2186);
				match(DELETE);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2187);
				match(UPDATE);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(2188);
				match(ALTER);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 7);
				{
				setState(2189);
				match(READ);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2190);
				match(WRITE);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2191);
				match(EXECUTE);
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 10);
				{
				setState(2192);
				match(USE);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 11);
				{
				setState(2193);
				match(INDEX);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 12);
				{
				setState(2194);
				match(REFERENCES);
				}
				break;
			case DEBUG:
				enterOuterAlt(_localctx, 13);
				{
				setState(2195);
				match(DEBUG);
				}
				break;
			case UNDER:
				enterOuterAlt(_localctx, 14);
				{
				setState(2196);
				match(UNDER);
				}
				break;
			case FLASHBACK:
				enterOuterAlt(_localctx, 15);
				{
				setState(2197);
				match(FLASHBACK);
				setState(2198);
				match(ARCHIVE);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 16);
				{
				setState(2199);
				match(ON);
				setState(2200);
				match(COMMIT);
				setState(2201);
				match(REFRESH);
				}
				break;
			case QUERY:
				enterOuterAlt(_localctx, 17);
				{
				setState(2202);
				match(QUERY);
				setState(2203);
				match(REWRITE);
				}
				break;
			case KEEP:
				enterOuterAlt(_localctx, 18);
				{
				setState(2204);
				match(KEEP);
				setState(2205);
				match(SEQUENCE);
				}
				break;
			case INHERIT:
				enterOuterAlt(_localctx, 19);
				{
				setState(2206);
				match(INHERIT);
				setState(2207);
				match(PRIVILEGES);
				}
				break;
			case TRANSLATE:
				enterOuterAlt(_localctx, 20);
				{
				setState(2208);
				match(TRANSLATE);
				setState(2209);
				match(SQL);
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 21);
				{
				setState(2210);
				match(MERGE);
				setState(2211);
				match(VIEW);
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
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public TerminalNode DIRECTORY() { return getToken(OracleStatementParser.DIRECTORY, 0); }
		public TerminalNode EDITION() { return getToken(OracleStatementParser.EDITION, 0); }
		public TerminalNode MINING() { return getToken(OracleStatementParser.MINING, 0); }
		public TerminalNode MODEL() { return getToken(OracleStatementParser.MODEL, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode TRANSLATION() { return getToken(OracleStatementParser.TRANSLATION, 0); }
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public TerminalNode JAVA() { return getToken(OracleStatementParser.JAVA, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SOURCE() { return getToken(OracleStatementParser.SOURCE, 0); }
		public TerminalNode RESOURCE() { return getToken(OracleStatementParser.RESOURCE, 0); }
		public OnObjectClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onObjectClause_; }
	}

	public final OnObjectClause_Context onObjectClause_() throws RecognitionException {
		OnObjectClause_Context _localctx = new OnObjectClause_Context(_ctx, getState());
		enterRule(_localctx, 378, RULE_onObjectClause_);
		int _la;
		try {
			setState(2226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2214);
				match(USER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2215);
				match(DIRECTORY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2216);
				match(EDITION);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2217);
				match(MINING);
				setState(2218);
				match(MODEL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2219);
				match(SQL);
				setState(2220);
				match(TRANSLATION);
				setState(2221);
				match(PROFILE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2222);
				match(JAVA);
				setState(2223);
				_la = _input.LA(1);
				if ( !(_la==RESOURCE || _la==SOURCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2224);
				tableName();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2225);
				tableName();
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

	public static class SystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public AdvisorFrameworkSystemPrivilege_Context advisorFrameworkSystemPrivilege_() {
			return getRuleContext(AdvisorFrameworkSystemPrivilege_Context.class,0);
		}
		public ClustersSystemPrivilege_Context clustersSystemPrivilege_() {
			return getRuleContext(ClustersSystemPrivilege_Context.class,0);
		}
		public ContextsSystemPrivilege_Context contextsSystemPrivilege_() {
			return getRuleContext(ContextsSystemPrivilege_Context.class,0);
		}
		public DataRedactionSystemPrivilege_Context dataRedactionSystemPrivilege_() {
			return getRuleContext(DataRedactionSystemPrivilege_Context.class,0);
		}
		public DatabaseSystemPrivilege_Context databaseSystemPrivilege_() {
			return getRuleContext(DatabaseSystemPrivilege_Context.class,0);
		}
		public DatabaseLinksSystemPrivilege_Context databaseLinksSystemPrivilege_() {
			return getRuleContext(DatabaseLinksSystemPrivilege_Context.class,0);
		}
		public DebuggingSystemPrivilege_Context debuggingSystemPrivilege_() {
			return getRuleContext(DebuggingSystemPrivilege_Context.class,0);
		}
		public DictionariesSystemPrivilege_Context dictionariesSystemPrivilege_() {
			return getRuleContext(DictionariesSystemPrivilege_Context.class,0);
		}
		public DimensionsSystemPrivilege_Context dimensionsSystemPrivilege_() {
			return getRuleContext(DimensionsSystemPrivilege_Context.class,0);
		}
		public DirectoriesSystemPrivilege_Context directoriesSystemPrivilege_() {
			return getRuleContext(DirectoriesSystemPrivilege_Context.class,0);
		}
		public EditionsSystemPrivilege_Context editionsSystemPrivilege_() {
			return getRuleContext(EditionsSystemPrivilege_Context.class,0);
		}
		public FlashbackDataArchivesPrivilege_Context flashbackDataArchivesPrivilege_() {
			return getRuleContext(FlashbackDataArchivesPrivilege_Context.class,0);
		}
		public IndexesSystemPrivilege_Context indexesSystemPrivilege_() {
			return getRuleContext(IndexesSystemPrivilege_Context.class,0);
		}
		public IndexTypesSystemPrivilege_Context indexTypesSystemPrivilege_() {
			return getRuleContext(IndexTypesSystemPrivilege_Context.class,0);
		}
		public JobSchedulerObjectsSystemPrivilege_Context jobSchedulerObjectsSystemPrivilege_() {
			return getRuleContext(JobSchedulerObjectsSystemPrivilege_Context.class,0);
		}
		public KeyManagementFrameworkSystemPrivilege_Context keyManagementFrameworkSystemPrivilege_() {
			return getRuleContext(KeyManagementFrameworkSystemPrivilege_Context.class,0);
		}
		public LibrariesFrameworkSystemPrivilege_Context librariesFrameworkSystemPrivilege_() {
			return getRuleContext(LibrariesFrameworkSystemPrivilege_Context.class,0);
		}
		public LogminerFrameworkSystemPrivilege_Context logminerFrameworkSystemPrivilege_() {
			return getRuleContext(LogminerFrameworkSystemPrivilege_Context.class,0);
		}
		public MaterizlizedViewsSystemPrivilege_Context materizlizedViewsSystemPrivilege_() {
			return getRuleContext(MaterizlizedViewsSystemPrivilege_Context.class,0);
		}
		public MiningModelsSystemPrivilege_Context miningModelsSystemPrivilege_() {
			return getRuleContext(MiningModelsSystemPrivilege_Context.class,0);
		}
		public OlapCubesSystemPrivilege_Context olapCubesSystemPrivilege_() {
			return getRuleContext(OlapCubesSystemPrivilege_Context.class,0);
		}
		public OlapCubeMeasureFoldersSystemPrivilege_Context olapCubeMeasureFoldersSystemPrivilege_() {
			return getRuleContext(OlapCubeMeasureFoldersSystemPrivilege_Context.class,0);
		}
		public OlapCubeDiminsionsSystemPrivilege_Context olapCubeDiminsionsSystemPrivilege_() {
			return getRuleContext(OlapCubeDiminsionsSystemPrivilege_Context.class,0);
		}
		public OlapCubeBuildProcessesSystemPrivilege_Context olapCubeBuildProcessesSystemPrivilege_() {
			return getRuleContext(OlapCubeBuildProcessesSystemPrivilege_Context.class,0);
		}
		public OperatorsSystemPrivilege_Context operatorsSystemPrivilege_() {
			return getRuleContext(OperatorsSystemPrivilege_Context.class,0);
		}
		public OutlinesSystemPrivilege_Context outlinesSystemPrivilege_() {
			return getRuleContext(OutlinesSystemPrivilege_Context.class,0);
		}
		public PlanManagementSystemPrivilege_Context planManagementSystemPrivilege_() {
			return getRuleContext(PlanManagementSystemPrivilege_Context.class,0);
		}
		public PluggableDatabasesSystemPrivilege_Context pluggableDatabasesSystemPrivilege_() {
			return getRuleContext(PluggableDatabasesSystemPrivilege_Context.class,0);
		}
		public ProceduresSystemPrivilege_Context proceduresSystemPrivilege_() {
			return getRuleContext(ProceduresSystemPrivilege_Context.class,0);
		}
		public ProfilesSystemPrivilege_Context profilesSystemPrivilege_() {
			return getRuleContext(ProfilesSystemPrivilege_Context.class,0);
		}
		public RolesSystemPrivilege_Context rolesSystemPrivilege_() {
			return getRuleContext(RolesSystemPrivilege_Context.class,0);
		}
		public RollbackSegmentsSystemPrivilege_Context rollbackSegmentsSystemPrivilege_() {
			return getRuleContext(RollbackSegmentsSystemPrivilege_Context.class,0);
		}
		public SequencesSystemPrivilege_Context sequencesSystemPrivilege_() {
			return getRuleContext(SequencesSystemPrivilege_Context.class,0);
		}
		public SessionsSystemPrivilege_Context sessionsSystemPrivilege_() {
			return getRuleContext(SessionsSystemPrivilege_Context.class,0);
		}
		public SqlTranslationProfilesSystemPrivilege_Context sqlTranslationProfilesSystemPrivilege_() {
			return getRuleContext(SqlTranslationProfilesSystemPrivilege_Context.class,0);
		}
		public SynonymsSystemPrivilege_Context synonymsSystemPrivilege_() {
			return getRuleContext(SynonymsSystemPrivilege_Context.class,0);
		}
		public TablesSystemPrivilege_Context tablesSystemPrivilege_() {
			return getRuleContext(TablesSystemPrivilege_Context.class,0);
		}
		public TablespacesSystemPrivilege_Context tablespacesSystemPrivilege_() {
			return getRuleContext(TablespacesSystemPrivilege_Context.class,0);
		}
		public TriggersSystemPrivilege_Context triggersSystemPrivilege_() {
			return getRuleContext(TriggersSystemPrivilege_Context.class,0);
		}
		public TypesSystemPrivilege_Context typesSystemPrivilege_() {
			return getRuleContext(TypesSystemPrivilege_Context.class,0);
		}
		public UsersSystemPrivilege_Context usersSystemPrivilege_() {
			return getRuleContext(UsersSystemPrivilege_Context.class,0);
		}
		public ViewsSystemPrivilege_Context viewsSystemPrivilege_() {
			return getRuleContext(ViewsSystemPrivilege_Context.class,0);
		}
		public MiscellaneousSystemPrivilege_Context miscellaneousSystemPrivilege_() {
			return getRuleContext(MiscellaneousSystemPrivilege_Context.class,0);
		}
		public SystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemPrivilege_; }
	}

	public final SystemPrivilege_Context systemPrivilege_() throws RecognitionException {
		SystemPrivilege_Context _localctx = new SystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 380, RULE_systemPrivilege_);
		try {
			setState(2273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2228);
				match(ALL);
				setState(2229);
				match(PRIVILEGES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2230);
				advisorFrameworkSystemPrivilege_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2231);
				clustersSystemPrivilege_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2232);
				contextsSystemPrivilege_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2233);
				dataRedactionSystemPrivilege_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2234);
				databaseSystemPrivilege_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2235);
				databaseLinksSystemPrivilege_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2236);
				debuggingSystemPrivilege_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2237);
				dictionariesSystemPrivilege_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2238);
				dimensionsSystemPrivilege_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2239);
				directoriesSystemPrivilege_();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2240);
				editionsSystemPrivilege_();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2241);
				flashbackDataArchivesPrivilege_();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2242);
				indexesSystemPrivilege_();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2243);
				indexTypesSystemPrivilege_();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2244);
				jobSchedulerObjectsSystemPrivilege_();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2245);
				keyManagementFrameworkSystemPrivilege_();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2246);
				librariesFrameworkSystemPrivilege_();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2247);
				logminerFrameworkSystemPrivilege_();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2248);
				materizlizedViewsSystemPrivilege_();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2249);
				miningModelsSystemPrivilege_();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2250);
				olapCubesSystemPrivilege_();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2251);
				olapCubeMeasureFoldersSystemPrivilege_();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2252);
				olapCubeDiminsionsSystemPrivilege_();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2253);
				olapCubeBuildProcessesSystemPrivilege_();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2254);
				operatorsSystemPrivilege_();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2255);
				outlinesSystemPrivilege_();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2256);
				planManagementSystemPrivilege_();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2257);
				pluggableDatabasesSystemPrivilege_();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2258);
				proceduresSystemPrivilege_();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2259);
				profilesSystemPrivilege_();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2260);
				rolesSystemPrivilege_();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2261);
				rollbackSegmentsSystemPrivilege_();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2262);
				sequencesSystemPrivilege_();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2263);
				sessionsSystemPrivilege_();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2264);
				sqlTranslationProfilesSystemPrivilege_();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2265);
				synonymsSystemPrivilege_();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2266);
				tablesSystemPrivilege_();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2267);
				tablespacesSystemPrivilege_();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2268);
				triggersSystemPrivilege_();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2269);
				typesSystemPrivilege_();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2270);
				usersSystemPrivilege_();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2271);
				viewsSystemPrivilege_();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(2272);
				miscellaneousSystemPrivilege_();
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

	public static class SystemPrivilegeOperation_Context extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode SELECT() { return getToken(OracleStatementParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(OracleStatementParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(OracleStatementParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode EXECUTE() { return getToken(OracleStatementParser.EXECUTE, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public SystemPrivilegeOperation_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemPrivilegeOperation_; }
	}

	public final SystemPrivilegeOperation_Context systemPrivilegeOperation_() throws RecognitionException {
		SystemPrivilegeOperation_Context _localctx = new SystemPrivilegeOperation_Context(_ctx, getState());
		enterRule(_localctx, 382, RULE_systemPrivilegeOperation_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << CREATE) | (1L << ALTER) | (1L << DROP))) != 0) || _la==EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANY) {
				{
				setState(2276);
				match(ANY);
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

	public static class AdvisorFrameworkSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode ADVISOR() { return getToken(OracleStatementParser.ADVISOR, 0); }
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public TerminalNode TUNING() { return getToken(OracleStatementParser.TUNING, 0); }
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode MANAGEMENT() { return getToken(OracleStatementParser.MANAGEMENT, 0); }
		public TerminalNode OBJECT() { return getToken(OracleStatementParser.OBJECT, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public AdvisorFrameworkSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_advisorFrameworkSystemPrivilege_; }
	}

	public final AdvisorFrameworkSystemPrivilege_Context advisorFrameworkSystemPrivilege_() throws RecognitionException {
		AdvisorFrameworkSystemPrivilege_Context _localctx = new AdvisorFrameworkSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 384, RULE_advisorFrameworkSystemPrivilege_);
		int _la;
		try {
			setState(2296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case SQL:
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << CREATE) | (1L << ALTER) | (1L << DROP))) != 0) || _la==EXECUTE) {
					{
					setState(2279);
					systemPrivilegeOperation_();
					}
				}

				setState(2282);
				match(SQL);
				setState(2283);
				match(PROFILE);
				}
				break;
			case ADVISOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2284);
				match(ADVISOR);
				}
				break;
			case ADMINISTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2285);
				match(ADMINISTER);
				setState(2287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANY) {
					{
					setState(2286);
					match(ANY);
					}
				}

				setState(2289);
				match(SQL);
				setState(2294);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TUNING:
					{
					setState(2290);
					match(TUNING);
					setState(2291);
					match(SET);
					}
					break;
				case MANAGEMENT:
					{
					setState(2292);
					match(MANAGEMENT);
					setState(2293);
					match(OBJECT);
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

	public static class ClustersSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode CLUSTER() { return getToken(OracleStatementParser.CLUSTER, 0); }
		public ClustersSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clustersSystemPrivilege_; }
	}

	public final ClustersSystemPrivilege_Context clustersSystemPrivilege_() throws RecognitionException {
		ClustersSystemPrivilege_Context _localctx = new ClustersSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 386, RULE_clustersSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2298);
			systemPrivilegeOperation_();
			setState(2299);
			match(CLUSTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContextsSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode CONTEXT() { return getToken(OracleStatementParser.CONTEXT, 0); }
		public ContextsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextsSystemPrivilege_; }
	}

	public final ContextsSystemPrivilege_Context contextsSystemPrivilege_() throws RecognitionException {
		ContextsSystemPrivilege_Context _localctx = new ContextsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 388, RULE_contextsSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			systemPrivilegeOperation_();
			setState(2302);
			match(CONTEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataRedactionSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode EXEMPT() { return getToken(OracleStatementParser.EXEMPT, 0); }
		public TerminalNode REDACTION() { return getToken(OracleStatementParser.REDACTION, 0); }
		public TerminalNode POLICY() { return getToken(OracleStatementParser.POLICY, 0); }
		public DataRedactionSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataRedactionSystemPrivilege_; }
	}

	public final DataRedactionSystemPrivilege_Context dataRedactionSystemPrivilege_() throws RecognitionException {
		DataRedactionSystemPrivilege_Context _localctx = new DataRedactionSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 390, RULE_dataRedactionSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2304);
			match(EXEMPT);
			setState(2305);
			match(REDACTION);
			setState(2306);
			match(POLICY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(OracleStatementParser.DATABASE, 0); }
		public TerminalNode SYSTEM() { return getToken(OracleStatementParser.SYSTEM, 0); }
		public TerminalNode AUDIT() { return getToken(OracleStatementParser.AUDIT, 0); }
		public DatabaseSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseSystemPrivilege_; }
	}

	public final DatabaseSystemPrivilege_Context databaseSystemPrivilege_() throws RecognitionException {
		DatabaseSystemPrivilege_Context _localctx = new DatabaseSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 392, RULE_databaseSystemPrivilege_);
		int _la;
		try {
			setState(2312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2308);
				match(ALTER);
				setState(2309);
				_la = _input.LA(1);
				if ( !(_la==DATABASE || _la==SYSTEM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case AUDIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2310);
				match(AUDIT);
				setState(2311);
				match(SYSTEM);
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

	public static class DatabaseLinksSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode DATABASE() { return getToken(OracleStatementParser.DATABASE, 0); }
		public TerminalNode LINK() { return getToken(OracleStatementParser.LINK, 0); }
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode PUBLIC() { return getToken(OracleStatementParser.PUBLIC, 0); }
		public DatabaseLinksSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseLinksSystemPrivilege_; }
	}

	public final DatabaseLinksSystemPrivilege_Context databaseLinksSystemPrivilege_() throws RecognitionException {
		DatabaseLinksSystemPrivilege_Context _localctx = new DatabaseLinksSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 394, RULE_databaseLinksSystemPrivilege_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2314);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << ALTER) | (1L << DROP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(2315);
				match(PUBLIC);
				}
			}

			setState(2318);
			match(DATABASE);
			setState(2319);
			match(LINK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DebuggingSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode DEBUG() { return getToken(OracleStatementParser.DEBUG, 0); }
		public TerminalNode CONNECT() { return getToken(OracleStatementParser.CONNECT, 0); }
		public TerminalNode SESSION() { return getToken(OracleStatementParser.SESSION, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode PROCEDURE() { return getToken(OracleStatementParser.PROCEDURE, 0); }
		public DebuggingSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debuggingSystemPrivilege_; }
	}

	public final DebuggingSystemPrivilege_Context debuggingSystemPrivilege_() throws RecognitionException {
		DebuggingSystemPrivilege_Context _localctx = new DebuggingSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 396, RULE_debuggingSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2321);
			match(DEBUG);
			setState(2326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONNECT:
				{
				setState(2322);
				match(CONNECT);
				setState(2323);
				match(SESSION);
				}
				break;
			case ANY:
				{
				setState(2324);
				match(ANY);
				setState(2325);
				match(PROCEDURE);
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

	public static class DictionariesSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode ANALYZE() { return getToken(OracleStatementParser.ANALYZE, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode DICTIONARY() { return getToken(OracleStatementParser.DICTIONARY, 0); }
		public DictionariesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionariesSystemPrivilege_; }
	}

	public final DictionariesSystemPrivilege_Context dictionariesSystemPrivilege_() throws RecognitionException {
		DictionariesSystemPrivilege_Context _localctx = new DictionariesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 398, RULE_dictionariesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			match(ANALYZE);
			setState(2329);
			match(ANY);
			setState(2330);
			match(DICTIONARY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionsSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode DIMENSION() { return getToken(OracleStatementParser.DIMENSION, 0); }
		public DimensionsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionsSystemPrivilege_; }
	}

	public final DimensionsSystemPrivilege_Context dimensionsSystemPrivilege_() throws RecognitionException {
		DimensionsSystemPrivilege_Context _localctx = new DimensionsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 400, RULE_dimensionsSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2332);
			systemPrivilegeOperation_();
			setState(2333);
			match(DIMENSION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectoriesSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode DIRECTORY() { return getToken(OracleStatementParser.DIRECTORY, 0); }
		public DirectoriesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directoriesSystemPrivilege_; }
	}

	public final DirectoriesSystemPrivilege_Context directoriesSystemPrivilege_() throws RecognitionException {
		DirectoriesSystemPrivilege_Context _localctx = new DirectoriesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 402, RULE_directoriesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
			systemPrivilegeOperation_();
			setState(2336);
			match(DIRECTORY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EditionsSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode EDITION() { return getToken(OracleStatementParser.EDITION, 0); }
		public EditionsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_editionsSystemPrivilege_; }
	}

	public final EditionsSystemPrivilege_Context editionsSystemPrivilege_() throws RecognitionException {
		EditionsSystemPrivilege_Context _localctx = new EditionsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 404, RULE_editionsSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2338);
			systemPrivilegeOperation_();
			setState(2339);
			match(EDITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlashbackDataArchivesPrivilege_Context extends ParserRuleContext {
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TerminalNode ARCHIVE() { return getToken(OracleStatementParser.ARCHIVE, 0); }
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public FlashbackDataArchivesPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flashbackDataArchivesPrivilege_; }
	}

	public final FlashbackDataArchivesPrivilege_Context flashbackDataArchivesPrivilege_() throws RecognitionException {
		FlashbackDataArchivesPrivilege_Context _localctx = new FlashbackDataArchivesPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 406, RULE_flashbackDataArchivesPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2341);
			match(FLASHBACK);
			setState(2342);
			match(ARCHIVE);
			setState(2343);
			match(ADMINISTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexesSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexesSystemPrivilege_; }
	}

	public final IndexesSystemPrivilege_Context indexesSystemPrivilege_() throws RecognitionException {
		IndexesSystemPrivilege_Context _localctx = new IndexesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 408, RULE_indexesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2345);
			systemPrivilegeOperation_();
			setState(2346);
			match(INDEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexTypesSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode INDEXTYPE() { return getToken(OracleStatementParser.INDEXTYPE, 0); }
		public IndexTypesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexTypesSystemPrivilege_; }
	}

	public final IndexTypesSystemPrivilege_Context indexTypesSystemPrivilege_() throws RecognitionException {
		IndexTypesSystemPrivilege_Context _localctx = new IndexTypesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 410, RULE_indexTypesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2348);
			systemPrivilegeOperation_();
			setState(2349);
			match(INDEXTYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JobSchedulerObjectsSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode JOB() { return getToken(OracleStatementParser.JOB, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode EXTERNAL() { return getToken(OracleStatementParser.EXTERNAL, 0); }
		public TerminalNode EXECUTE() { return getToken(OracleStatementParser.EXECUTE, 0); }
		public TerminalNode CLASS() { return getToken(OracleStatementParser.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(OracleStatementParser.PROGRAM, 0); }
		public TerminalNode MANAGE() { return getToken(OracleStatementParser.MANAGE, 0); }
		public TerminalNode SCHEDULER() { return getToken(OracleStatementParser.SCHEDULER, 0); }
		public JobSchedulerObjectsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobSchedulerObjectsSystemPrivilege_; }
	}

	public final JobSchedulerObjectsSystemPrivilege_Context jobSchedulerObjectsSystemPrivilege_() throws RecognitionException {
		JobSchedulerObjectsSystemPrivilege_Context _localctx = new JobSchedulerObjectsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 412, RULE_jobSchedulerObjectsSystemPrivilege_);
		int _la;
		try {
			setState(2361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2351);
				match(CREATE);
				setState(2353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANY || _la==EXTERNAL) {
					{
					setState(2352);
					_la = _input.LA(1);
					if ( !(_la==ANY || _la==EXTERNAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2355);
				match(JOB);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2356);
				match(EXECUTE);
				setState(2357);
				match(ANY);
				setState(2358);
				_la = _input.LA(1);
				if ( !(_la==CLASS || _la==PROGRAM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case MANAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2359);
				match(MANAGE);
				setState(2360);
				match(SCHEDULER);
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

	public static class KeyManagementFrameworkSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public TerminalNode MANAGEMENT() { return getToken(OracleStatementParser.MANAGEMENT, 0); }
		public KeyManagementFrameworkSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyManagementFrameworkSystemPrivilege_; }
	}

	public final KeyManagementFrameworkSystemPrivilege_Context keyManagementFrameworkSystemPrivilege_() throws RecognitionException {
		KeyManagementFrameworkSystemPrivilege_Context _localctx = new KeyManagementFrameworkSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 414, RULE_keyManagementFrameworkSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2363);
			match(ADMINISTER);
			setState(2364);
			match(KEY);
			setState(2365);
			match(MANAGEMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibrariesFrameworkSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode LIBRARY() { return getToken(OracleStatementParser.LIBRARY, 0); }
		public LibrariesFrameworkSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_librariesFrameworkSystemPrivilege_; }
	}

	public final LibrariesFrameworkSystemPrivilege_Context librariesFrameworkSystemPrivilege_() throws RecognitionException {
		LibrariesFrameworkSystemPrivilege_Context _localctx = new LibrariesFrameworkSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 416, RULE_librariesFrameworkSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2367);
			systemPrivilegeOperation_();
			setState(2368);
			match(LIBRARY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogminerFrameworkSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode LOGMINING() { return getToken(OracleStatementParser.LOGMINING, 0); }
		public LogminerFrameworkSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logminerFrameworkSystemPrivilege_; }
	}

	public final LogminerFrameworkSystemPrivilege_Context logminerFrameworkSystemPrivilege_() throws RecognitionException {
		LogminerFrameworkSystemPrivilege_Context _localctx = new LogminerFrameworkSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 418, RULE_logminerFrameworkSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2370);
			match(LOGMINING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaterizlizedViewsSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode MATERIALIZED() { return getToken(OracleStatementParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(OracleStatementParser.VIEW, 0); }
		public TerminalNode QUERY() { return getToken(OracleStatementParser.QUERY, 0); }
		public TerminalNode REWRITE() { return getToken(OracleStatementParser.REWRITE, 0); }
		public TerminalNode GLOBAL() { return getToken(OracleStatementParser.GLOBAL, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode REFRESH() { return getToken(OracleStatementParser.REFRESH, 0); }
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public MaterizlizedViewsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materizlizedViewsSystemPrivilege_; }
	}

	public final MaterizlizedViewsSystemPrivilege_Context materizlizedViewsSystemPrivilege_() throws RecognitionException {
		MaterizlizedViewsSystemPrivilege_Context _localctx = new MaterizlizedViewsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 420, RULE_materizlizedViewsSystemPrivilege_);
		int _la;
		try {
			setState(2387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2372);
				systemPrivilegeOperation_();
				setState(2373);
				match(MATERIALIZED);
				setState(2374);
				match(VIEW);
				}
				break;
			case QUERY:
			case GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(2376);
					match(GLOBAL);
					}
				}

				setState(2379);
				match(QUERY);
				setState(2380);
				match(REWRITE);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 3);
				{
				setState(2381);
				match(ON);
				setState(2382);
				match(COMMIT);
				setState(2383);
				match(REFRESH);
				}
				break;
			case FLASHBACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(2384);
				match(FLASHBACK);
				setState(2385);
				match(ANY);
				setState(2386);
				match(TABLE);
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

	public static class MiningModelsSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode MINING() { return getToken(OracleStatementParser.MINING, 0); }
		public TerminalNode MODEL() { return getToken(OracleStatementParser.MODEL, 0); }
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode COMMENT() { return getToken(OracleStatementParser.COMMENT, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public MiningModelsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miningModelsSystemPrivilege_; }
	}

	public final MiningModelsSystemPrivilege_Context miningModelsSystemPrivilege_() throws RecognitionException {
		MiningModelsSystemPrivilege_Context _localctx = new MiningModelsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 422, RULE_miningModelsSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2389);
				systemPrivilegeOperation_();
				}
				break;
			case COMMENT:
				{
				setState(2390);
				match(COMMENT);
				setState(2391);
				match(ANY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2394);
			match(MINING);
			setState(2395);
			match(MODEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OlapCubesSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode CUBE() { return getToken(OracleStatementParser.CUBE, 0); }
		public OlapCubesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olapCubesSystemPrivilege_; }
	}

	public final OlapCubesSystemPrivilege_Context olapCubesSystemPrivilege_() throws RecognitionException {
		OlapCubesSystemPrivilege_Context _localctx = new OlapCubesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 424, RULE_olapCubesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2397);
			systemPrivilegeOperation_();
			setState(2398);
			match(CUBE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OlapCubeMeasureFoldersSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode MEASURE() { return getToken(OracleStatementParser.MEASURE, 0); }
		public TerminalNode FOLDER() { return getToken(OracleStatementParser.FOLDER, 0); }
		public OlapCubeMeasureFoldersSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olapCubeMeasureFoldersSystemPrivilege_; }
	}

	public final OlapCubeMeasureFoldersSystemPrivilege_Context olapCubeMeasureFoldersSystemPrivilege_() throws RecognitionException {
		OlapCubeMeasureFoldersSystemPrivilege_Context _localctx = new OlapCubeMeasureFoldersSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 426, RULE_olapCubeMeasureFoldersSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2400);
			systemPrivilegeOperation_();
			setState(2401);
			match(MEASURE);
			setState(2402);
			match(FOLDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OlapCubeDiminsionsSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode CUBE() { return getToken(OracleStatementParser.CUBE, 0); }
		public TerminalNode DIMENSION() { return getToken(OracleStatementParser.DIMENSION, 0); }
		public OlapCubeDiminsionsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olapCubeDiminsionsSystemPrivilege_; }
	}

	public final OlapCubeDiminsionsSystemPrivilege_Context olapCubeDiminsionsSystemPrivilege_() throws RecognitionException {
		OlapCubeDiminsionsSystemPrivilege_Context _localctx = new OlapCubeDiminsionsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 428, RULE_olapCubeDiminsionsSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2404);
			systemPrivilegeOperation_();
			setState(2405);
			match(CUBE);
			setState(2406);
			match(DIMENSION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OlapCubeBuildProcessesSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode CUBE() { return getToken(OracleStatementParser.CUBE, 0); }
		public TerminalNode BUILD() { return getToken(OracleStatementParser.BUILD, 0); }
		public TerminalNode PROCESS() { return getToken(OracleStatementParser.PROCESS, 0); }
		public OlapCubeBuildProcessesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olapCubeBuildProcessesSystemPrivilege_; }
	}

	public final OlapCubeBuildProcessesSystemPrivilege_Context olapCubeBuildProcessesSystemPrivilege_() throws RecognitionException {
		OlapCubeBuildProcessesSystemPrivilege_Context _localctx = new OlapCubeBuildProcessesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 430, RULE_olapCubeBuildProcessesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2408);
			systemPrivilegeOperation_();
			setState(2409);
			match(CUBE);
			setState(2410);
			match(BUILD);
			setState(2411);
			match(PROCESS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorsSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(OracleStatementParser.OPERATOR, 0); }
		public OperatorsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorsSystemPrivilege_; }
	}

	public final OperatorsSystemPrivilege_Context operatorsSystemPrivilege_() throws RecognitionException {
		OperatorsSystemPrivilege_Context _localctx = new OperatorsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 432, RULE_operatorsSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2413);
			systemPrivilegeOperation_();
			setState(2414);
			match(OPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutlinesSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode OUTLINE() { return getToken(OracleStatementParser.OUTLINE, 0); }
		public OutlinesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outlinesSystemPrivilege_; }
	}

	public final OutlinesSystemPrivilege_Context outlinesSystemPrivilege_() throws RecognitionException {
		OutlinesSystemPrivilege_Context _localctx = new OutlinesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 434, RULE_outlinesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2416);
			systemPrivilegeOperation_();
			setState(2417);
			match(OUTLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlanManagementSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode MANAGEMENT() { return getToken(OracleStatementParser.MANAGEMENT, 0); }
		public TerminalNode OBJECT() { return getToken(OracleStatementParser.OBJECT, 0); }
		public PlanManagementSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_planManagementSystemPrivilege_; }
	}

	public final PlanManagementSystemPrivilege_Context planManagementSystemPrivilege_() throws RecognitionException {
		PlanManagementSystemPrivilege_Context _localctx = new PlanManagementSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 436, RULE_planManagementSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2419);
			match(ADMINISTER);
			setState(2420);
			match(SQL);
			setState(2421);
			match(MANAGEMENT);
			setState(2422);
			match(OBJECT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PluggableDatabasesSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode PLUGGABLE() { return getToken(OracleStatementParser.PLUGGABLE, 0); }
		public TerminalNode DATABASE() { return getToken(OracleStatementParser.DATABASE, 0); }
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode CONTAINER() { return getToken(OracleStatementParser.CONTAINER, 0); }
		public PluggableDatabasesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluggableDatabasesSystemPrivilege_; }
	}

	public final PluggableDatabasesSystemPrivilege_Context pluggableDatabasesSystemPrivilege_() throws RecognitionException {
		PluggableDatabasesSystemPrivilege_Context _localctx = new PluggableDatabasesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 438, RULE_pluggableDatabasesSystemPrivilege_);
		try {
			setState(2429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2424);
				match(CREATE);
				setState(2425);
				match(PLUGGABLE);
				setState(2426);
				match(DATABASE);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(2427);
				match(SET);
				setState(2428);
				match(CONTAINER);
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

	public static class ProceduresSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode PROCEDURE() { return getToken(OracleStatementParser.PROCEDURE, 0); }
		public ProceduresSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proceduresSystemPrivilege_; }
	}

	public final ProceduresSystemPrivilege_Context proceduresSystemPrivilege_() throws RecognitionException {
		ProceduresSystemPrivilege_Context _localctx = new ProceduresSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 440, RULE_proceduresSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2431);
			systemPrivilegeOperation_();
			setState(2432);
			match(PROCEDURE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProfilesSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public ProfilesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_profilesSystemPrivilege_; }
	}

	public final ProfilesSystemPrivilege_Context profilesSystemPrivilege_() throws RecognitionException {
		ProfilesSystemPrivilege_Context _localctx = new ProfilesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 442, RULE_profilesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2434);
			systemPrivilegeOperation_();
			setState(2435);
			match(PROFILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RolesSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode GRANT() { return getToken(OracleStatementParser.GRANT, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public RolesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rolesSystemPrivilege_; }
	}

	public final RolesSystemPrivilege_Context rolesSystemPrivilege_() throws RecognitionException {
		RolesSystemPrivilege_Context _localctx = new RolesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 444, RULE_rolesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2437);
				systemPrivilegeOperation_();
				}
				break;
			case GRANT:
				{
				setState(2438);
				match(GRANT);
				setState(2439);
				match(ANY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2442);
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

	public static class RollbackSegmentsSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode ROLLBACK() { return getToken(OracleStatementParser.ROLLBACK, 0); }
		public TerminalNode SEGMENT() { return getToken(OracleStatementParser.SEGMENT, 0); }
		public RollbackSegmentsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollbackSegmentsSystemPrivilege_; }
	}

	public final RollbackSegmentsSystemPrivilege_Context rollbackSegmentsSystemPrivilege_() throws RecognitionException {
		RollbackSegmentsSystemPrivilege_Context _localctx = new RollbackSegmentsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 446, RULE_rollbackSegmentsSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2444);
			systemPrivilegeOperation_();
			setState(2445);
			match(ROLLBACK);
			setState(2446);
			match(SEGMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequencesSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode SEQUENCE() { return getToken(OracleStatementParser.SEQUENCE, 0); }
		public SequencesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequencesSystemPrivilege_; }
	}

	public final SequencesSystemPrivilege_Context sequencesSystemPrivilege_() throws RecognitionException {
		SequencesSystemPrivilege_Context _localctx = new SequencesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 448, RULE_sequencesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2448);
			systemPrivilegeOperation_();
			setState(2449);
			match(SEQUENCE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SessionsSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode SESSION() { return getToken(OracleStatementParser.SESSION, 0); }
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode RESTRICTED() { return getToken(OracleStatementParser.RESTRICTED, 0); }
		public TerminalNode RESOURCE() { return getToken(OracleStatementParser.RESOURCE, 0); }
		public TerminalNode COST() { return getToken(OracleStatementParser.COST, 0); }
		public SessionsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sessionsSystemPrivilege_; }
	}

	public final SessionsSystemPrivilege_Context sessionsSystemPrivilege_() throws RecognitionException {
		SessionsSystemPrivilege_Context _localctx = new SessionsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 450, RULE_sessionsSystemPrivilege_);
		int _la;
		try {
			setState(2456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2451);
				_la = _input.LA(1);
				if ( !(_la==CREATE || _la==ALTER || _la==RESTRICTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2452);
				match(SESSION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2453);
				match(ALTER);
				setState(2454);
				match(RESOURCE);
				setState(2455);
				match(COST);
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

	public static class SqlTranslationProfilesSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode TRANSLATION() { return getToken(OracleStatementParser.TRANSLATION, 0); }
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode USE() { return getToken(OracleStatementParser.USE, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode TRANSLATE() { return getToken(OracleStatementParser.TRANSLATE, 0); }
		public SqlTranslationProfilesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlTranslationProfilesSystemPrivilege_; }
	}

	public final SqlTranslationProfilesSystemPrivilege_Context sqlTranslationProfilesSystemPrivilege_() throws RecognitionException {
		SqlTranslationProfilesSystemPrivilege_Context _localctx = new SqlTranslationProfilesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 452, RULE_sqlTranslationProfilesSystemPrivilege_);
		try {
			setState(2469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2461);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case INSERT:
				case UPDATE:
				case DELETE:
				case CREATE:
				case ALTER:
				case DROP:
				case EXECUTE:
					{
					setState(2458);
					systemPrivilegeOperation_();
					}
					break;
				case USE:
					{
					setState(2459);
					match(USE);
					setState(2460);
					match(ANY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2463);
				match(SQL);
				setState(2464);
				match(TRANSLATION);
				setState(2465);
				match(PROFILE);
				}
				break;
			case TRANSLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2466);
				match(TRANSLATE);
				setState(2467);
				match(ANY);
				setState(2468);
				match(SQL);
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

	public static class SynonymsSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode SYNONYM() { return getToken(OracleStatementParser.SYNONYM, 0); }
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode PUBLIC() { return getToken(OracleStatementParser.PUBLIC, 0); }
		public SynonymsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synonymsSystemPrivilege_; }
	}

	public final SynonymsSystemPrivilege_Context synonymsSystemPrivilege_() throws RecognitionException {
		SynonymsSystemPrivilege_Context _localctx = new SynonymsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 454, RULE_synonymsSystemPrivilege_);
		try {
			setState(2477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2471);
				systemPrivilegeOperation_();
				setState(2472);
				match(SYNONYM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2474);
				match(DROP);
				setState(2475);
				match(PUBLIC);
				setState(2476);
				match(SYNONYM);
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

	public static class TablesSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode BACKUP() { return getToken(OracleStatementParser.BACKUP, 0); }
		public TerminalNode LOCK() { return getToken(OracleStatementParser.LOCK, 0); }
		public TerminalNode READ() { return getToken(OracleStatementParser.READ, 0); }
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TablesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablesSystemPrivilege_; }
	}

	public final TablesSystemPrivilege_Context tablesSystemPrivilege_() throws RecognitionException {
		TablesSystemPrivilege_Context _localctx = new TablesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 456, RULE_tablesSystemPrivilege_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2479);
				systemPrivilegeOperation_();
				}
				break;
			case READ:
			case FLASHBACK:
			case LOCK:
			case BACKUP:
				{
				setState(2480);
				_la = _input.LA(1);
				if ( !(_la==READ || _la==FLASHBACK || _la==LOCK || _la==BACKUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2481);
				match(ANY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2484);
			match(TABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablespacesSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode TABLESPACE() { return getToken(OracleStatementParser.TABLESPACE, 0); }
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode MANAGE() { return getToken(OracleStatementParser.MANAGE, 0); }
		public TerminalNode UNLIMITED() { return getToken(OracleStatementParser.UNLIMITED, 0); }
		public TablespacesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespacesSystemPrivilege_; }
	}

	public final TablespacesSystemPrivilege_Context tablespacesSystemPrivilege_() throws RecognitionException {
		TablespacesSystemPrivilege_Context _localctx = new TablespacesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 458, RULE_tablespacesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2486);
				systemPrivilegeOperation_();
				}
				break;
			case MANAGE:
				{
				setState(2487);
				match(MANAGE);
				}
				break;
			case UNLIMITED:
				{
				setState(2488);
				match(UNLIMITED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2491);
			match(TABLESPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TriggersSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode TRIGGER() { return getToken(OracleStatementParser.TRIGGER, 0); }
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public TerminalNode DATABASE() { return getToken(OracleStatementParser.DATABASE, 0); }
		public TriggersSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggersSystemPrivilege_; }
	}

	public final TriggersSystemPrivilege_Context triggersSystemPrivilege_() throws RecognitionException {
		TriggersSystemPrivilege_Context _localctx = new TriggersSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 460, RULE_triggersSystemPrivilege_);
		try {
			setState(2499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2493);
				systemPrivilegeOperation_();
				setState(2494);
				match(TRIGGER);
				}
				break;
			case ADMINISTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2496);
				match(ADMINISTER);
				setState(2497);
				match(DATABASE);
				setState(2498);
				match(TRIGGER);
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

	public static class TypesSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(OracleStatementParser.TYPE, 0); }
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode UNDER() { return getToken(OracleStatementParser.UNDER, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TypesSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesSystemPrivilege_; }
	}

	public final TypesSystemPrivilege_Context typesSystemPrivilege_() throws RecognitionException {
		TypesSystemPrivilege_Context _localctx = new TypesSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 462, RULE_typesSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2501);
				systemPrivilegeOperation_();
				}
				break;
			case UNDER:
				{
				setState(2502);
				match(UNDER);
				setState(2503);
				match(ANY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2506);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsersSystemPrivilege_Context extends ParserRuleContext {
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public UsersSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usersSystemPrivilege_; }
	}

	public final UsersSystemPrivilege_Context usersSystemPrivilege_() throws RecognitionException {
		UsersSystemPrivilege_Context _localctx = new UsersSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 464, RULE_usersSystemPrivilege_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2508);
			systemPrivilegeOperation_();
			setState(2509);
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

	public static class ViewsSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode VIEW() { return getToken(OracleStatementParser.VIEW, 0); }
		public SystemPrivilegeOperation_Context systemPrivilegeOperation_() {
			return getRuleContext(SystemPrivilegeOperation_Context.class,0);
		}
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode UNDER() { return getToken(OracleStatementParser.UNDER, 0); }
		public TerminalNode MERGE() { return getToken(OracleStatementParser.MERGE, 0); }
		public ViewsSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewsSystemPrivilege_; }
	}

	public final ViewsSystemPrivilege_Context viewsSystemPrivilege_() throws RecognitionException {
		ViewsSystemPrivilege_Context _localctx = new ViewsSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 466, RULE_viewsSystemPrivilege_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2511);
				systemPrivilegeOperation_();
				}
				break;
			case UNDER:
			case MERGE:
				{
				setState(2512);
				_la = _input.LA(1);
				if ( !(_la==UNDER || _la==MERGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2513);
				match(ANY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2516);
			match(VIEW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MiscellaneousSystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode ANALYZE() { return getToken(OracleStatementParser.ANALYZE, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode AUDIT() { return getToken(OracleStatementParser.AUDIT, 0); }
		public TerminalNode BECOME() { return getToken(OracleStatementParser.BECOME, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public TerminalNode CHANGE() { return getToken(OracleStatementParser.CHANGE, 0); }
		public TerminalNode NOTIFICATION() { return getToken(OracleStatementParser.NOTIFICATION, 0); }
		public TerminalNode COMMENT() { return getToken(OracleStatementParser.COMMENT, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TerminalNode EXEMPT() { return getToken(OracleStatementParser.EXEMPT, 0); }
		public TerminalNode ACCESS() { return getToken(OracleStatementParser.ACCESS, 0); }
		public TerminalNode POLICY() { return getToken(OracleStatementParser.POLICY, 0); }
		public TerminalNode FORCE() { return getToken(OracleStatementParser.FORCE, 0); }
		public TerminalNode TRANSACTION() { return getToken(OracleStatementParser.TRANSACTION, 0); }
		public TerminalNode GRANT() { return getToken(OracleStatementParser.GRANT, 0); }
		public TerminalNode PRIVILEGE() { return getToken(OracleStatementParser.PRIVILEGE, 0); }
		public TerminalNode OBJECT() { return getToken(OracleStatementParser.OBJECT, 0); }
		public TerminalNode INHERIT() { return getToken(OracleStatementParser.INHERIT, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public TerminalNode DATE() { return getToken(OracleStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode SYSGUID() { return getToken(OracleStatementParser.SYSGUID, 0); }
		public TerminalNode PURGE() { return getToken(OracleStatementParser.PURGE, 0); }
		public TerminalNode DBA_RECYCLEBIN() { return getToken(OracleStatementParser.DBA_RECYCLEBIN, 0); }
		public TerminalNode RESUMABLE() { return getToken(OracleStatementParser.RESUMABLE, 0); }
		public TerminalNode SELECT() { return getToken(OracleStatementParser.SELECT, 0); }
		public TerminalNode DICTIONARY() { return getToken(OracleStatementParser.DICTIONARY, 0); }
		public TerminalNode SYSBACKUP() { return getToken(OracleStatementParser.SYSBACKUP, 0); }
		public TerminalNode SYSDBA() { return getToken(OracleStatementParser.SYSDBA, 0); }
		public TerminalNode SYSDG() { return getToken(OracleStatementParser.SYSDG, 0); }
		public TerminalNode SYSKM() { return getToken(OracleStatementParser.SYSKM, 0); }
		public TerminalNode SYSOPER() { return getToken(OracleStatementParser.SYSOPER, 0); }
		public MiscellaneousSystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miscellaneousSystemPrivilege_; }
	}

	public final MiscellaneousSystemPrivilege_Context miscellaneousSystemPrivilege_() throws RecognitionException {
		MiscellaneousSystemPrivilege_Context _localctx = new MiscellaneousSystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 468, RULE_miscellaneousSystemPrivilege_);
		int _la;
		try {
			setState(2562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2518);
				match(ANALYZE);
				setState(2519);
				match(ANY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2520);
				match(AUDIT);
				setState(2521);
				match(ANY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2522);
				match(BECOME);
				setState(2523);
				match(USER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2524);
				match(CHANGE);
				setState(2525);
				match(NOTIFICATION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2526);
				match(COMMENT);
				setState(2527);
				match(ANY);
				setState(2528);
				match(TABLE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2529);
				match(EXEMPT);
				setState(2530);
				match(ACCESS);
				setState(2531);
				match(POLICY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2532);
				match(FORCE);
				setState(2534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANY) {
					{
					setState(2533);
					match(ANY);
					}
				}

				setState(2536);
				match(TRANSACTION);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2537);
				match(GRANT);
				setState(2538);
				match(ANY);
				setState(2540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OBJECT) {
					{
					setState(2539);
					match(OBJECT);
					}
				}

				setState(2542);
				match(PRIVILEGE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2543);
				match(INHERIT);
				setState(2544);
				match(ANY);
				setState(2545);
				match(PRIVILEGES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2546);
				match(KEEP);
				setState(2547);
				match(DATE);
				setState(2548);
				match(TIME);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2549);
				match(KEEP);
				setState(2550);
				match(SYSGUID);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2551);
				match(PURGE);
				setState(2552);
				match(DBA_RECYCLEBIN);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2553);
				match(RESUMABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2554);
				match(SELECT);
				setState(2555);
				match(ANY);
				setState(2556);
				_la = _input.LA(1);
				if ( !(_la==TRANSACTION || _la==DICTIONARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2557);
				match(SYSBACKUP);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2558);
				match(SYSDBA);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2559);
				match(SYSDG);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2560);
				match(SYSKM);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2561);
				match(SYSOPER);
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
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2564);
			match(CREATE);
			setState(2565);
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
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2567);
			match(DROP);
			setState(2568);
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
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2570);
			match(ALTER);
			setState(2571);
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
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2573);
			match(CREATE);
			setState(2574);
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
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2576);
			match(DROP);
			setState(2577);
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
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_alterRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2579);
			match(ALTER);
			setState(2580);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(OracleStatementParser.CALL, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2582);
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
		case 59:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 62:
			return booleanPrimary__sempred((BooleanPrimary_Context)_localctx, predIndex);
		case 65:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 66:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0152\u0a1b\4\2\t"+
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
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2"+
		"\u01ff\n\2\3\2\5\2\u0202\n\2\3\3\3\3\3\3\3\3\5\3\u0208\n\3\3\3\5\3\u020b"+
		"\n\3\3\3\3\3\5\3\u020f\n\3\3\4\5\4\u0212\n\4\3\4\3\4\3\4\3\4\7\4\u0218"+
		"\n\4\f\4\16\4\u021b\13\4\3\5\5\5\u021e\n\5\3\5\3\5\3\6\3\6\5\6\u0224\n"+
		"\6\3\6\3\6\3\6\5\6\u0229\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7"+
		"\t\u0235\n\t\f\t\16\t\u0238\13\t\3\n\3\n\3\n\3\n\7\n\u023e\n\n\f\n\16"+
		"\n\u0241\13\n\3\n\3\n\3\n\3\n\5\n\u0247\n\n\3\13\3\13\5\13\u024b\n\13"+
		"\3\f\3\f\5\f\u024f\n\f\3\f\3\f\5\f\u0253\n\f\3\f\5\f\u0256\n\f\3\r\3\r"+
		"\3\16\5\16\u025b\n\16\3\16\5\16\u025e\n\16\3\16\3\16\5\16\u0262\n\16\3"+
		"\16\5\16\u0265\n\16\3\16\5\16\u0268\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0273\n\17\3\20\3\20\5\20\u0277\n\20\3\20\3\20\3"+
		"\20\5\20\u027c\n\20\7\20\u027e\n\20\f\20\16\20\u0281\13\20\3\21\3\21\3"+
		"\22\3\22\3\22\5\22\u0288\n\22\3\22\7\22\u028b\n\22\f\22\16\22\u028e\13"+
		"\22\3\23\3\23\5\23\u0292\n\23\3\23\3\23\5\23\u0296\n\23\3\23\5\23\u0299"+
		"\n\23\3\23\5\23\u029c\n\23\3\23\5\23\u029f\n\23\3\23\5\23\u02a2\n\23\3"+
		"\24\3\24\3\25\3\25\5\25\u02a8\n\25\3\25\3\25\7\25\u02ac\n\25\f\25\16\25"+
		"\u02af\13\25\3\26\3\26\5\26\u02b3\n\26\3\26\5\26\u02b6\n\26\3\26\5\26"+
		"\u02b9\n\26\3\26\5\26\u02bc\n\26\3\27\3\27\5\27\u02c0\n\27\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u02cd\n\33\f\33\16\33"+
		"\u02d0\13\33\3\34\3\34\3\34\6\34\u02d5\n\34\r\34\16\34\u02d6\3\34\3\34"+
		"\7\34\u02db\n\34\f\34\16\34\u02de\13\34\5\34\u02e0\n\34\3\35\3\35\5\35"+
		"\u02e4\n\35\3\35\5\35\u02e7\n\35\3\35\3\35\5\35\u02eb\n\35\3\35\3\35\3"+
		"\35\3\35\5\35\u02f1\n\35\3\36\5\36\u02f4\n\36\3\36\5\36\u02f7\n\36\3\36"+
		"\3\36\3\36\3\36\5\36\u02fd\n\36\3\36\5\36\u0300\n\36\3\36\3\36\5\36\u0304"+
		"\n\36\3\36\3\36\3\36\5\36\u0309\n\36\5\36\u030b\n\36\3\37\3\37\3\37\3"+
		"\37\5\37\u0311\n\37\3 \3 \3 \3!\3!\3!\3!\3!\7!\u031b\n!\f!\16!\u031e\13"+
		"!\3\"\3\"\3\"\3#\3#\3#\3#\5#\u0327\n#\3#\5#\u032a\n#\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\3%\5%\u0335\n%\3&\3&\3\'\5\'\u033a\n\'\3\'\3\'\3(\3(\3(\3(\3("+
		"\3(\3(\5(\u0345\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\5-\u0351\n-\3.\3.\3/"+
		"\3/\3\60\3\60\3\60\5\60\u035a\n\60\3\60\3\60\3\61\3\61\3\61\5\61\u0361"+
		"\n\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\5\64\u036a\n\64\3\64\3\64\3\64"+
		"\7\64\u036f\n\64\f\64\16\64\u0372\13\64\3\64\5\64\u0375\n\64\3\65\5\65"+
		"\u0378\n\65\3\65\3\65\3\65\7\65\u037d\n\65\f\65\16\65\u0380\13\65\3\65"+
		"\5\65\u0383\n\65\3\66\3\66\3\67\3\67\3\67\7\67\u038a\n\67\f\67\16\67\u038d"+
		"\13\67\3\67\5\67\u0390\n\67\38\38\39\39\39\39\59\u0398\n9\59\u039a\n9"+
		"\39\39\3:\5:\u039f\n:\3:\3:\3;\3;\3;\7;\u03a6\n;\f;\16;\u03a9\13;\3<\3"+
		"<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u03b8\n=\3=\3=\3=\3=\7=\u03be\n"+
		"=\f=\16=\u03c1\13=\3>\3>\3?\3?\3@\3@\3@\3@\3@\3@\5@\u03cd\n@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u03dc\n@\f@\16@\u03df\13@\3A\3A\3B\3"+
		"B\5B\u03e5\nB\3B\3B\3B\3B\3B\5B\u03ec\nB\3B\3B\3B\3B\3B\7B\u03f3\nB\f"+
		"B\16B\u03f6\13B\3B\3B\3B\3B\5B\u03fc\nB\3B\3B\3B\3B\3B\3B\3B\5B\u0405"+
		"\nB\3B\3B\3B\3B\5B\u040b\nB\3B\5B\u040e\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\7C\u0431\nC\fC\16C\u0434\13C\3D\3D\3D\3D\3D\3D\3D\3D\5D\u043e\nD\3"+
		"D\3D\3D\3D\7D\u0444\nD\fD\16D\u0447\13D\3D\3D\3D\5D\u044c\nD\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\5D\u0456\nD\3D\3D\3D\7D\u045b\nD\fD\16D\u045e\13D\3E\3"+
		"E\3E\5E\u0463\nE\3F\3F\3F\5F\u0468\nF\3F\3F\3F\7F\u046d\nF\fF\16F\u0470"+
		"\13F\3F\5F\u0473\nF\3F\3F\3G\3G\3H\3H\3I\3I\5I\u047d\nI\3J\3J\3J\3J\3"+
		"J\3J\3J\3K\3K\3K\3K\3K\7K\u048b\nK\fK\16K\u048e\13K\3K\3K\5K\u0492\nK"+
		"\3K\3K\3L\3L\3L\3L\3L\7L\u049b\nL\fL\16L\u049e\13L\3L\5L\u04a1\nL\3L\3"+
		"L\3M\3M\3M\3M\3M\5M\u04aa\nM\3N\3N\5N\u04ae\nN\3N\6N\u04b1\nN\rN\16N\u04b2"+
		"\3N\5N\u04b6\nN\3O\3O\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\7Q\u04c5\nQ\fQ"+
		"\16Q\u04c8\13Q\3R\3R\3R\5R\u04cd\nR\3R\5R\u04d0\nR\3S\3S\3T\3T\3U\3U\3"+
		"U\7U\u04d9\nU\fU\16U\u04dc\13U\3V\3V\5V\u04e0\nV\3W\3W\3W\7W\u04e5\nW"+
		"\fW\16W\u04e8\13W\3X\3X\3X\3X\3Y\3Y\5Y\u04f0\nY\3Y\3Y\3Y\5Y\u04f5\nY\3"+
		"Y\3Y\5Y\u04f9\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0504\nZ\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\5Z\u050c\nZ\3Z\3Z\5Z\u0510\nZ\5Z\u0512\nZ\3[\3[\3[\5[\u0517\n[\3"+
		"\\\3\\\5\\\u051b\n\\\3\\\3\\\5\\\u051f\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\5\\\u0528\n\\\5\\\u052a\n\\\3]\3]\3]\3]\3]\5]\u0531\n]\3]\3]\3]\3^\3"+
		"^\3^\3^\3^\5^\u053b\n^\3_\3_\3_\5_\u0540\n_\3_\5_\u0543\n_\3_\3_\3`\3"+
		"`\6`\u0549\n`\r`\16`\u054a\3a\3a\3a\3a\3a\3b\3b\3b\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\5c\u055e\nc\3c\3c\3c\3c\3c\5c\u0565\nc\3c\3c\3c\3c\5c\u056b\n"+
		"c\3c\3c\5c\u056f\nc\3d\3d\3d\3d\3d\5d\u0576\nd\3d\3d\3d\3d\7d\u057c\n"+
		"d\fd\16d\u057f\13d\3d\3d\5d\u0583\nd\3d\5d\u0586\nd\3e\3e\3e\3e\3f\3f"+
		"\3g\3g\3g\7g\u0591\ng\fg\16g\u0594\13g\3h\3h\3i\3i\3i\3i\3i\3i\3j\3j\3"+
		"j\3j\3j\3j\3j\3k\3k\3k\3k\3k\3l\3l\3l\3l\3l\3m\3m\3m\3m\3n\3n\3n\3n\3"+
		"o\3o\3o\3o\3p\3p\5p\u05bd\np\3q\3q\3q\3q\3r\3r\3r\3s\3s\3t\3t\3t\3t\5"+
		"t\u05cc\nt\3t\3t\3t\3t\5t\u05d2\nt\3u\3u\3u\7u\u05d7\nu\fu\16u\u05da\13"+
		"u\3v\3v\3v\3v\5v\u05e0\nv\3w\3w\3w\5w\u05e5\nw\3w\3w\3w\3w\3w\5w\u05ec"+
		"\nw\3w\3w\5w\u05f0\nw\3w\6w\u05f3\nw\rw\16w\u05f4\3w\5w\u05f8\nw\3x\5"+
		"x\u05fb\nx\3y\3y\3y\5y\u0600\ny\3z\3z\3z\3z\3z\3z\5z\u0608\nz\5z\u060a"+
		"\nz\3z\3z\3z\3z\3{\5{\u0611\n{\3{\6{\u0614\n{\r{\16{\u0615\5{\u0618\n"+
		"{\3{\5{\u061b\n{\3|\3|\3|\3|\3|\5|\u0622\n|\3|\3|\3|\3|\3|\3|\3|\3|\3"+
		"|\3|\3|\3|\3|\3|\3|\3|\5|\u0634\n|\3}\3}\5}\u0638\n}\3}\3}\3}\5}\u063d"+
		"\n}\3}\5}\u0640\n}\3}\5}\u0643\n}\3}\5}\u0646\n}\3~\3~\5~\u064a\n~\3~"+
		"\5~\u064d\n~\3~\3~\3~\3~\3~\3~\3~\3~\3~\5~\u0658\n~\3~\7~\u065b\n~\f~"+
		"\16~\u065e\13~\3\177\3\177\3\177\5\177\u0663\n\177\3\177\3\177\3\177\3"+
		"\177\3\177\5\177\u066a\n\177\5\177\u066c\n\177\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0678"+
		"\n\u0080\3\u0081\5\u0081\u067b\n\u0081\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\5\u0084\u068a\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0697\n\u0086\3\u0086"+
		"\3\u0086\7\u0086\u069b\n\u0086\f\u0086\16\u0086\u069e\13\u0086\5\u0086"+
		"\u06a0\n\u0086\3\u0087\3\u0087\5\u0087\u06a4\n\u0087\3\u0087\3\u0087\5"+
		"\u0087\u06a8\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u06af"+
		"\n\u0087\3\u0087\7\u0087\u06b2\n\u0087\f\u0087\16\u0087\u06b5\13\u0087"+
		"\3\u0088\3\u0088\5\u0088\u06b9\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\5\u0088\u06ca\n\u0088\3\u0088\7\u0088\u06cd\n\u0088\f"+
		"\u0088\16\u0088\u06d0\13\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\5\u0089\u06e3\n\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\7\u0089\u06ea\n\u0089\f\u0089\16\u0089\u06ed\13\u0089"+
		"\5\u0089\u06ef\n\u0089\3\u008a\5\u008a\u06f2\n\u008a\3\u008b\3\u008b\5"+
		"\u008b\u06f6\n\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\7"+
		"\u008c\u06fe\n\u008c\f\u008c\16\u008c\u0701\13\u008c\3\u008c\3\u008c\3"+
		"\u008d\3\u008d\5\u008d\u0707\n\u008d\3\u008d\5\u008d\u070a\n\u008d\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\7\u008f\u0717\n\u008f\f\u008f\16\u008f\u071a\13\u008f\3\u008f"+
		"\3\u008f\3\u0090\3\u0090\5\u0090\u0720\n\u0090\3\u0090\3\u0090\5\u0090"+
		"\u0724\n\u0090\3\u0091\3\u0091\5\u0091\u0728\n\u0091\3\u0092\3\u0092\5"+
		"\u0092\u072c\n\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0731\n\u0092\7\u0092"+
		"\u0733\n\u0092\f\u0092\16\u0092\u0736\13\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\5\u0093\u073c\n\u0093\3\u0094\3\u0094\3\u0094\5\u0094\u0741\n"+
		"\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\6\u0096\u0748\n\u0096\r"+
		"\u0096\16\u0096\u0749\3\u0096\5\u0096\u074d\n\u0096\3\u0097\3\u0097\3"+
		"\u0097\5\u0097\u0752\n\u0097\3\u0098\3\u0098\3\u0098\5\u0098\u0757\n\u0098"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\7\u0099\u075d\n\u0099\f\u0099\16\u0099"+
		"\u0760\13\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0765\n\u0099\3\u009a"+
		"\3\u009a\5\u009a\u0769\n\u009a\3\u009b\6\u009b\u076c\n\u009b\r\u009b\16"+
		"\u009b\u076d\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009e\5"+
		"\u009e\u0777\n\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u077c\n\u009e\3\u009e"+
		"\3\u009e\5\u009e\u0780\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e"+
		"\u0786\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u078c\n\u009e\3"+
		"\u009f\3\u009f\5\u009f\u0790\n\u009f\3\u009f\3\u009f\3\u009f\7\u009f\u0795"+
		"\n\u009f\f\u009f\16\u009f\u0798\13\u009f\3\u009f\5\u009f\u079b\n\u009f"+
		"\3\u009f\5\u009f\u079e\n\u009f\3\u00a0\3\u00a0\5\u00a0\u07a2\n\u00a0\3"+
		"\u00a0\3\u00a0\5\u00a0\u07a6\n\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u07ab"+
		"\n\u00a0\3\u00a0\7\u00a0\u07ae\n\u00a0\f\u00a0\16\u00a0\u07b1\13\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u07b6\n\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\5\u00a1\u07bd\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\7\u00a2\u07c3\n\u00a2\f\u00a2\16\u00a2\u07c6\13\u00a2\3\u00a2\5\u00a2"+
		"\u07c9\n\u00a2\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u07ce\n\u00a3\f\u00a3\16"+
		"\u00a3\u07d1\13\u00a3\3\u00a3\5\u00a3\u07d4\n\u00a3\3\u00a4\3\u00a4\3"+
		"\u00a4\3\u00a4\3\u00a4\3\u00a4\7\u00a4\u07dc\n\u00a4\f\u00a4\16\u00a4"+
		"\u07df\13\u00a4\3\u00a4\3\u00a4\5\u00a4\u07e3\n\u00a4\3\u00a5\3\u00a5"+
		"\3\u00a5\5\u00a5\u07e8\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\6\u00a8"+
		"\u07f7\n\u00a8\r\u00a8\16\u00a8\u07f8\5\u00a8\u07fb\n\u00a8\3\u00a9\3"+
		"\u00a9\6\u00a9\u07ff\n\u00a9\r\u00a9\16\u00a9\u0800\3\u00a9\5\u00a9\u0804"+
		"\n\u00a9\3\u00aa\3\u00aa\3\u00aa\6\u00aa\u0809\n\u00aa\r\u00aa\16\u00aa"+
		"\u080a\3\u00aa\5\u00aa\u080e\n\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3"+
		"\u00ac\5\u00ac\u0815\n\u00ac\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u081a\n\u00ad"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\5\u00af"+
		"\u0824\n\u00af\3\u00af\3\u00af\5\u00af\u0828\n\u00af\3\u00af\3\u00af\3"+
		"\u00af\5\u00af\u082d\n\u00af\5\u00af\u082f\n\u00af\3\u00b0\3\u00b0\3\u00b0"+
		"\6\u00b0\u0834\n\u00b0\r\u00b0\16\u00b0\u0835\3\u00b1\3\u00b1\3\u00b1"+
		"\7\u00b1\u083b\n\u00b1\f\u00b1\16\u00b1\u083e\13\u00b1\3\u00b2\3\u00b2"+
		"\5\u00b2\u0842\n\u00b2\3\u00b2\3\u00b2\5\u00b2\u0846\n\u00b2\3\u00b2\7"+
		"\u00b2\u0849\n\u00b2\f\u00b2\16\u00b2\u084c\13\u00b2\3\u00b2\5\u00b2\u084f"+
		"\n\u00b2\5\u00b2\u0851\n\u00b2\3\u00b2\3\u00b2\5\u00b2\u0855\n\u00b2\3"+
		"\u00b3\3\u00b3\3\u00b3\5\u00b3\u085a\n\u00b3\3\u00b4\3\u00b4\3\u00b4\3"+
		"\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\5\u00b8\u0869\n\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9"+
		"\u086f\n\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bc"+
		"\3\u00bc\3\u00bd\3\u00bd\5\u00bd\u087b\n\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u0880\n\u00bd\7\u00bd\u0882\n\u00bd\f\u00bd\16\u00bd\u0885\13"+
		"\u00bd\3\u00be\3\u00be\5\u00be\u0889\n\u00be\3\u00be\3\u00be\3\u00be\3"+
		"\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u08a7"+
		"\n\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u08b5\n\u00bf\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u08e4"+
		"\n\u00c0\3\u00c1\3\u00c1\5\u00c1\u08e8\n\u00c1\3\u00c2\5\u00c2\u08eb\n"+
		"\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u08f2\n\u00c2\3"+
		"\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u08f9\n\u00c2\5\u00c2\u08fb"+
		"\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u090b\n\u00c6"+
		"\3\u00c7\3\u00c7\5\u00c7\u090f\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0919\n\u00c8\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00d0\3\u00d0\5\u00d0\u0934\n\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u093c\n\u00d0\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u094c\n\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0956\n\u00d4"+
		"\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u095b\n\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00da\3\u00da"+
		"\3\u00da\3\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0980\n\u00dd\3\u00de"+
		"\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df\3\u00e0\3\u00e0\3\u00e0\5\u00e0"+
		"\u098b\n\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u099b"+
		"\n\u00e3\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u09a0\n\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u09a8\n\u00e4\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u09b0\n\u00e5\3\u00e6\3\u00e6"+
		"\3\u00e6\5\u00e6\u09b5\n\u00e6\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e7"+
		"\5\u00e7\u09bc\n\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\5\u00e8\u09c6\n\u00e8\3\u00e9\3\u00e9\3\u00e9\5\u00e9"+
		"\u09cb\n\u00e9\3\u00e9\3\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00eb\3\u00eb"+
		"\3\u00eb\5\u00eb\u09d5\n\u00eb\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u09e9\n\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\5\u00ec\u09ef\n\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u0a05"+
		"\n\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00f0\3\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f2\3\u00f2"+
		"\3\u00f2\3\u00f3\3\u00f3\3\u00f3\2\6x~\u0084\u0086\u00f4\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
		"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
		"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
		"\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152"+
		"\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a"+
		"\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182"+
		"\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a"+
		"\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2"+
		"\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca"+
		"\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2"+
		"\u01e4\2 \4\2NNpp\4\2XX\\\\\4\2WWZ[\3\2\u0085\u0087\3\2kl\35\2\66\67F"+
		"FHHOSU]aakly\u0080\u0082\u0084\u0086\u0097\u009a\u009b\u009e\u00a8\u00aa"+
		"\u00ad\u00b0\u00b2\u00b4\u00b8\u00ba\u00ba\u00bc\u00da\u00dc\u00e1\u00e3"+
		"\u00e3\u00e6\u00ef\u00f1\u00f4\u00f6\u00f6\u00f8\u00fb\u00fd\u00fd\u0100"+
		"\u010b\u010d\u0111\u0116\u014d\3\2\u014e\u014f\4\2\4\5fg\4\2\6\6ii\4\2"+
		"jl\u00b0\u00b0\3\2pq\3\2\30\35\5\2\6\7\17\20\u00aa\u00aa\3\2\u0093\u0097"+
		"\3\2vw\4\2\62\62\u009e\u009e\3\2\u00bd\u00be\4\2\u00da\u00da\u00e4\u00e4"+
		"\4\2AA\u00ce\u00ce\4\2\65\65\u00c8\u00c8\4\2\u00fe\u00fe\u0103\u0103\4"+
		"\2/\65\u00bf\u00bf\3\2\u0121\u0122\3\2\63\65\4\2qq\u0129\u0129\3\2\u012b"+
		"\u012c\4\2\63\64\u013b\u013b\6\2\u00b6\u00b6\u00c3\u00c3\u0115\u0115\u013e"+
		"\u013e\4\2\u00c2\u00c2\u00cc\u00cc\4\2\u00ba\u00ba\u0126\u0126\2\u0b0d"+
		"\2\u01fe\3\2\2\2\4\u0203\3\2\2\2\6\u0211\3\2\2\2\b\u021d\3\2\2\2\n\u0221"+
		"\3\2\2\2\f\u022a\3\2\2\2\16\u022c\3\2\2\2\20\u0230\3\2\2\2\22\u0246\3"+
		"\2\2\2\24\u024a\3\2\2\2\26\u024c\3\2\2\2\30\u0257\3\2\2\2\32\u025a\3\2"+
		"\2\2\34\u0272\3\2\2\2\36\u0274\3\2\2\2 \u0282\3\2\2\2\"\u0284\3\2\2\2"+
		"$\u028f\3\2\2\2&\u02a3\3\2\2\2(\u02a7\3\2\2\2*\u02bb\3\2\2\2,\u02bf\3"+
		"\2\2\2.\u02c1\3\2\2\2\60\u02c3\3\2\2\2\62\u02c6\3\2\2\2\64\u02c9\3\2\2"+
		"\2\66\u02df\3\2\2\28\u02f0\3\2\2\2:\u030a\3\2\2\2<\u0310\3\2\2\2>\u0312"+
		"\3\2\2\2@\u0315\3\2\2\2B\u031f\3\2\2\2D\u0322\3\2\2\2F\u032b\3\2\2\2H"+
		"\u0334\3\2\2\2J\u0336\3\2\2\2L\u0339\3\2\2\2N\u0344\3\2\2\2P\u0346\3\2"+
		"\2\2R\u0348\3\2\2\2T\u034a\3\2\2\2V\u034c\3\2\2\2X\u0350\3\2\2\2Z\u0352"+
		"\3\2\2\2\\\u0354\3\2\2\2^\u0359\3\2\2\2`\u0360\3\2\2\2b\u0364\3\2\2\2"+
		"d\u0366\3\2\2\2f\u0369\3\2\2\2h\u0377\3\2\2\2j\u0384\3\2\2\2l\u038f\3"+
		"\2\2\2n\u0391\3\2\2\2p\u0393\3\2\2\2r\u039e\3\2\2\2t\u03a2\3\2\2\2v\u03aa"+
		"\3\2\2\2x\u03b7\3\2\2\2z\u03c2\3\2\2\2|\u03c4\3\2\2\2~\u03c6\3\2\2\2\u0080"+
		"\u03e0\3\2\2\2\u0082\u040d\3\2\2\2\u0084\u040f\3\2\2\2\u0086\u0455\3\2"+
		"\2\2\u0088\u0462\3\2\2\2\u008a\u0464\3\2\2\2\u008c\u0476\3\2\2\2\u008e"+
		"\u0478\3\2\2\2\u0090\u047c\3\2\2\2\u0092\u047e\3\2\2\2\u0094\u0485\3\2"+
		"\2\2\u0096\u0495\3\2\2\2\u0098\u04a9\3\2\2\2\u009a\u04ab\3\2\2\2\u009c"+
		"\u04b7\3\2\2\2\u009e\u04bc\3\2\2\2\u00a0\u04bf\3\2\2\2\u00a2\u04cc\3\2"+
		"\2\2\u00a4\u04d1\3\2\2\2\u00a6\u04d3\3\2\2\2\u00a8\u04d5\3\2\2\2\u00aa"+
		"\u04df\3\2\2\2\u00ac\u04e1\3\2\2\2\u00ae\u04e9\3\2\2\2\u00b0\u04f8\3\2"+
		"\2\2\u00b2\u0511\3\2\2\2\u00b4\u0516\3\2\2\2\u00b6\u0529\3\2\2\2\u00b8"+
		"\u052b\3\2\2\2\u00ba\u053a\3\2\2\2\u00bc\u053c\3\2\2\2\u00be\u0546\3\2"+
		"\2\2\u00c0\u054c\3\2\2\2\u00c2\u0551\3\2\2\2\u00c4\u0554\3\2\2\2\u00c6"+
		"\u0575\3\2\2\2\u00c8\u0587\3\2\2\2\u00ca\u058b\3\2\2\2\u00cc\u058d\3\2"+
		"\2\2\u00ce\u0595\3\2\2\2\u00d0\u0597\3\2\2\2\u00d2\u059d\3\2\2\2\u00d4"+
		"\u05a4\3\2\2\2\u00d6\u05a9\3\2\2\2\u00d8\u05ae\3\2\2\2\u00da\u05b2\3\2"+
		"\2\2\u00dc\u05b6\3\2\2\2\u00de\u05bc\3\2\2\2\u00e0\u05be\3\2\2\2\u00e2"+
		"\u05c2\3\2\2\2\u00e4\u05c5\3\2\2\2\u00e6\u05cb\3\2\2\2\u00e8\u05d3\3\2"+
		"\2\2\u00ea\u05df\3\2\2\2\u00ec\u05e1\3\2\2\2\u00ee\u05fa\3\2\2\2\u00f0"+
		"\u05fc\3\2\2\2\u00f2\u0601\3\2\2\2\u00f4\u0610\3\2\2\2\u00f6\u0633\3\2"+
		"\2\2\u00f8\u0637\3\2\2\2\u00fa\u0649\3\2\2\2\u00fc\u065f\3\2\2\2\u00fe"+
		"\u0677\3\2\2\2\u0100\u067a\3\2\2\2\u0102\u067e\3\2\2\2\u0104\u0681\3\2"+
		"\2\2\u0106\u0685\3\2\2\2\u0108\u068b\3\2\2\2\u010a\u069f\3\2\2\2\u010c"+
		"\u06a1\3\2\2\2\u010e\u06b8\3\2\2\2\u0110\u06ee\3\2\2\2\u0112\u06f1\3\2"+
		"\2\2\u0114\u06f3\3\2\2\2\u0116\u06f9\3\2\2\2\u0118\u0706\3\2\2\2\u011a"+
		"\u070b\3\2\2\2\u011c\u0712\3\2\2\2\u011e\u071f\3\2\2\2\u0120\u0727\3\2"+
		"\2\2\u0122\u0729\3\2\2\2\u0124\u073b\3\2\2\2\u0126\u0740\3\2\2\2\u0128"+
		"\u0742\3\2\2\2\u012a\u074c\3\2\2\2\u012c\u0751\3\2\2\2\u012e\u0753\3\2"+
		"\2\2\u0130\u0764\3\2\2\2\u0132\u0768\3\2\2\2\u0134\u076b\3\2\2\2\u0136"+
		"\u076f\3\2\2\2\u0138\u0771\3\2\2\2\u013a\u078b\3\2\2\2\u013c\u078d\3\2"+
		"\2\2\u013e\u079f\3\2\2\2\u0140\u07b2\3\2\2\2\u0142\u07c8\3\2\2\2\u0144"+
		"\u07ca\3\2\2\2\u0146\u07e2\3\2\2\2\u0148\u07e7\3\2\2\2\u014a\u07e9\3\2"+
		"\2\2\u014c\u07ec\3\2\2\2\u014e\u07fa\3\2\2\2\u0150\u07fc\3\2\2\2\u0152"+
		"\u0805\3\2\2\2\u0154\u080f\3\2\2\2\u0156\u0814\3\2\2\2\u0158\u0819\3\2"+
		"\2\2\u015a\u081b\3\2\2\2\u015c\u0820\3\2\2\2\u015e\u0833\3\2\2\2\u0160"+
		"\u0837\3\2\2\2\u0162\u0854\3\2\2\2\u0164\u0859\3\2\2\2\u0166\u085b\3\2"+
		"\2\2\u0168\u085e\3\2\2\2\u016a\u0860\3\2\2\2\u016c\u0862\3\2\2\2\u016e"+
		"\u0864\3\2\2\2\u0170\u086a\3\2\2\2\u0172\u0870\3\2\2\2\u0174\u0874\3\2"+
		"\2\2\u0176\u0876\3\2\2\2\u0178\u0878\3\2\2\2\u017a\u08a6\3\2\2\2\u017c"+
		"\u08b4\3\2\2\2\u017e\u08e3\3\2\2\2\u0180\u08e5\3\2\2\2\u0182\u08fa\3\2"+
		"\2\2\u0184\u08fc\3\2\2\2\u0186\u08ff\3\2\2\2\u0188\u0902\3\2\2\2\u018a"+
		"\u090a\3\2\2\2\u018c\u090c\3\2\2\2\u018e\u0913\3\2\2\2\u0190\u091a\3\2"+
		"\2\2\u0192\u091e\3\2\2\2\u0194\u0921\3\2\2\2\u0196\u0924\3\2\2\2\u0198"+
		"\u0927\3\2\2\2\u019a\u092b\3\2\2\2\u019c\u092e\3\2\2\2\u019e\u093b\3\2"+
		"\2\2\u01a0\u093d\3\2\2\2\u01a2\u0941\3\2\2\2\u01a4\u0944\3\2\2\2\u01a6"+
		"\u0955\3\2\2\2\u01a8\u095a\3\2\2\2\u01aa\u095f\3\2\2\2\u01ac\u0962\3\2"+
		"\2\2\u01ae\u0966\3\2\2\2\u01b0\u096a\3\2\2\2\u01b2\u096f\3\2\2\2\u01b4"+
		"\u0972\3\2\2\2\u01b6\u0975\3\2\2\2\u01b8\u097f\3\2\2\2\u01ba\u0981\3\2"+
		"\2\2\u01bc\u0984\3\2\2\2\u01be\u098a\3\2\2\2\u01c0\u098e\3\2\2\2\u01c2"+
		"\u0992\3\2\2\2\u01c4\u099a\3\2\2\2\u01c6\u09a7\3\2\2\2\u01c8\u09af\3\2"+
		"\2\2\u01ca\u09b4\3\2\2\2\u01cc\u09bb\3\2\2\2\u01ce\u09c5\3\2\2\2\u01d0"+
		"\u09ca\3\2\2\2\u01d2\u09ce\3\2\2\2\u01d4\u09d4\3\2\2\2\u01d6\u0a04\3\2"+
		"\2\2\u01d8\u0a06\3\2\2\2\u01da\u0a09\3\2\2\2\u01dc\u0a0c\3\2\2\2\u01de"+
		"\u0a0f\3\2\2\2\u01e0\u0a12\3\2\2\2\u01e2\u0a15\3\2\2\2\u01e4\u0a18\3\2"+
		"\2\2\u01e6\u01ff\5 \21\2\u01e7\u01ff\5\4\3\2\u01e8\u01ff\5\n\6\2\u01e9"+
		"\u01ff\5\26\f\2\u01ea\u01ff\5\u00d0i\2\u01eb\u01ff\5\u00d4k\2\u01ec\u01ff"+
		"\5\u00d8m\2\u01ed\u01ff\5\u00dco\2\u01ee\u01ff\5\u00d2j\2\u01ef\u01ff"+
		"\5\u00dan\2\u01f0\u01ff\5\u00d6l\2\u01f1\u01ff\5\u0168\u00b5\2\u01f2\u01ff"+
		"\5\u016a\u00b6\2\u01f3\u01ff\5\u0166\u00b4\2\u01f4\u01ff\5\u016c\u00b7"+
		"\2\u01f5\u01ff\5\u016e\u00b8\2\u01f6\u01ff\5\u0170\u00b9\2\u01f7\u01ff"+
		"\5\u01d8\u00ed\2\u01f8\u01ff\5\u01da\u00ee\2\u01f9\u01ff\5\u01dc\u00ef"+
		"\2\u01fa\u01ff\5\u01de\u00f0\2\u01fb\u01ff\5\u01e0\u00f1\2\u01fc\u01ff"+
		"\5\u01e2\u00f2\2\u01fd\u01ff\5\u01e4\u00f3\2\u01fe\u01e6\3\2\2\2\u01fe"+
		"\u01e7\3\2\2\2\u01fe\u01e8\3\2\2\2\u01fe\u01e9\3\2\2\2\u01fe\u01ea\3\2"+
		"\2\2\u01fe\u01eb\3\2\2\2\u01fe\u01ec\3\2\2\2\u01fe\u01ed\3\2\2\2\u01fe"+
		"\u01ee\3\2\2\2\u01fe\u01ef\3\2\2\2\u01fe\u01f0\3\2\2\2\u01fe\u01f1\3\2"+
		"\2\2\u01fe\u01f2\3\2\2\2\u01fe\u01f3\3\2\2\2\u01fe\u01f4\3\2\2\2\u01fe"+
		"\u01f5\3\2\2\2\u01fe\u01f6\3\2\2\2\u01fe\u01f7\3\2\2\2\u01fe\u01f8\3\2"+
		"\2\2\u01fe\u01f9\3\2\2\2\u01fe\u01fa\3\2\2\2\u01fe\u01fb\3\2\2\2\u01fe"+
		"\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u0202\7+"+
		"\2\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\3\3\2\2\2\u0203\u0204"+
		"\7\60\2\2\u0204\u0205\7J\2\2\u0205\u020a\5^\60\2\u0206\u0208\7_\2\2\u0207"+
		"\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\5,"+
		"\27\2\u020a\u0207\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020e\3\2\2\2\u020c"+
		"\u020f\5\6\4\2\u020d\u020f\5\b\5\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2"+
		"\2\2\u020f\5\3\2\2\2\u0210\u0212\5f\64\2\u0211\u0210\3\2\2\2\u0211\u0212"+
		"\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\7K\2\2\u0214\u0219\5\22\n\2\u0215"+
		"\u0216\7%\2\2\u0216\u0218\5\22\n\2\u0217\u0215\3\2\2\2\u0218\u021b\3\2"+
		"\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\7\3\2\2\2\u021b\u0219"+
		"\3\2\2\2\u021c\u021e\5f\64\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0220\5 \21\2\u0220\t\3\2\2\2\u0221\u0223\7\61\2"+
		"\2\u0222\u0224\5\f\7\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0226\5\64\33\2\u0226\u0228\5\20\t\2\u0227\u0229\5> \2"+
		"\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\13\3\2\2\2\u022a\u022b"+
		"\7\u00f6\2\2\u022b\r\3\2\2\2\u022c\u022d\5`\61\2\u022d\u022e\7\30\2\2"+
		"\u022e\u022f\5\24\13\2\u022f\17\3\2\2\2\u0230\u0231\7;\2\2\u0231\u0236"+
		"\5\16\b\2\u0232\u0233\7%\2\2\u0233\u0235\5\16\b\2\u0234\u0232\3\2\2\2"+
		"\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\21"+
		"\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\7\37\2\2\u023a\u023f\5\24\13"+
		"\2\u023b\u023c\7%\2\2\u023c\u023e\5\24\13\2\u023d\u023b\3\2\2\2\u023e"+
		"\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\3\2"+
		"\2\2\u0241\u023f\3\2\2\2\u0242\u0243\7 \2\2\u0243\u0247\3\2\2\2\u0244"+
		"\u0245\7\37\2\2\u0245\u0247\7 \2\2\u0246\u0239\3\2\2\2\u0246\u0244\3\2"+
		"\2\2\u0247\23\3\2\2\2\u0248\u024b\5x=\2\u0249\u024b\7\u0098\2\2\u024a"+
		"\u0248\3\2\2\2\u024a\u0249\3\2\2\2\u024b\25\3\2\2\2\u024c\u024e\7\62\2"+
		"\2\u024d\u024f\5\30\r\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u0252\3\2\2\2\u0250\u0253\5\32\16\2\u0251\u0253\5\34\17\2\u0252\u0250"+
		"\3\2\2\2\u0252\u0251\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0256\5> \2\u0255"+
		"\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\27\3\2\2\2\u0257\u0258\7\u00f6"+
		"\2\2\u0258\31\3\2\2\2\u0259\u025b\7T\2\2\u025a\u0259\3\2\2\2\u025a\u025b"+
		"\3\2\2\2\u025b\u025d\3\2\2\2\u025c\u025e\7\37\2\2\u025d\u025c\3\2\2\2"+
		"\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261\5^\60\2\u0260\u0262"+
		"\7 \2\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0267\3\2\2\2\u0263"+
		"\u0265\7_\2\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2"+
		"\2\2\u0266\u0268\5,\27\2\u0267\u0264\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\33\3\2\2\2\u0269\u026a\5\36\20\2\u026a\u026b\7T\2\2\u026b\u026c\5\64"+
		"\33\2\u026c\u0273\3\2\2\2\u026d\u026e\7T\2\2\u026e\u026f\5\36\20\2\u026f"+
		"\u0270\7]\2\2\u0270\u0271\5\64\33\2\u0271\u0273\3\2\2\2\u0272\u0269\3"+
		"\2\2\2\u0272\u026d\3\2\2\2\u0273\35\3\2\2\2\u0274\u0276\5^\60\2\u0275"+
		"\u0277\7\25\2\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027f\3"+
		"\2\2\2\u0278\u0279\7%\2\2\u0279\u027b\5^\60\2\u027a\u027c\7\25\2\2\u027b"+
		"\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u0278\3\2"+
		"\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\37\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0283\5\"\22\2\u0283!\3\2\2\2\u0284"+
		"\u028c\5$\23\2\u0285\u0287\7M\2\2\u0286\u0288\t\2\2\2\u0287\u0286\3\2"+
		"\2\2\u0287\u0288\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028b\5$\23\2\u028a"+
		"\u0285\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2"+
		"\2\2\u028d#\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0291\7/\2\2\u0290\u0292"+
		"\5&\24\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0295\5(\25\2\u0294\u0296\5\62\32\2\u0295\u0294\3\2\2\2\u0295\u0296\3"+
		"\2\2\2\u0296\u0298\3\2\2\2\u0297\u0299\5> \2\u0298\u0297\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u029b\3\2\2\2\u029a\u029c\5@!\2\u029b\u029a\3\2\2"+
		"\2\u029b\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u029f\5B\"\2\u029e\u029d"+
		"\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0\u02a2\5\u00a0Q"+
		"\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2%\3\2\2\2\u02a3\u02a4"+
		"\t\2\2\2\u02a4\'\3\2\2\2\u02a5\u02a8\5.\30\2\u02a6\u02a8\5*\26\2\u02a7"+
		"\u02a5\3\2\2\2\u02a7\u02a6\3\2\2\2\u02a8\u02ad\3\2\2\2\u02a9\u02aa\7%"+
		"\2\2\u02aa\u02ac\5*\26\2\u02ab\u02a9\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad"+
		"\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae)\3\2\2\2\u02af\u02ad\3\2\2\2"+
		"\u02b0\u02b3\5`\61\2\u02b1\u02b3\5x=\2\u02b2\u02b0\3\2\2\2\u02b2\u02b1"+
		"\3\2\2\2\u02b3\u02b8\3\2\2\2\u02b4\u02b6\7_\2\2\u02b5\u02b4\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b9\5,\27\2\u02b8\u02b5\3\2"+
		"\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02bc\5\60\31\2\u02bb"+
		"\u02b2\3\2\2\2\u02bb\u02ba\3\2\2\2\u02bc+\3\2\2\2\u02bd\u02c0\5X-\2\u02be"+
		"\u02c0\7\u014f\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02be\3\2\2\2\u02c0-\3\2"+
		"\2\2\u02c1\u02c2\7\21\2\2\u02c2/\3\2\2\2\u02c3\u02c4\5X-\2\u02c4\u02c5"+
		"\7\25\2\2\u02c5\61\3\2\2\2\u02c6\u02c7\7T\2\2\u02c7\u02c8\5\64\33\2\u02c8"+
		"\63\3\2\2\2\u02c9\u02ce\5\66\34\2\u02ca\u02cb\7%\2\2\u02cb\u02cd\5\66"+
		"\34\2\u02cc\u02ca\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\65\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d2\58\35"+
		"\2\u02d2\u02d3\5:\36\2\u02d3\u02d5\3\2\2\2\u02d4\u02d1\3\2\2\2\u02d5\u02d6"+
		"\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02e0\3\2\2\2\u02d8"+
		"\u02dc\58\35\2\u02d9\u02db\5:\36\2\u02da\u02d9\3\2\2\2\u02db\u02de\3\2"+
		"\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de"+
		"\u02dc\3\2\2\2\u02df\u02d4\3\2\2\2\u02df\u02d8\3\2\2\2\u02e0\67\3\2\2"+
		"\2\u02e1\u02e6\5^\60\2\u02e2\u02e4\7_\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4"+
		"\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\5,\27\2\u02e6\u02e3\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02f1\3\2\2\2\u02e8\u02ea\5D#\2\u02e9\u02eb\5f\64"+
		"\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02f1\3\2\2\2\u02ec\u02ed"+
		"\7\37\2\2\u02ed\u02ee\5\64\33\2\u02ee\u02ef\7 \2\2\u02ef\u02f1\3\2\2\2"+
		"\u02f0\u02e1\3\2\2\2\u02f0\u02e8\3\2\2\2\u02f0\u02ec\3\2\2\2\u02f19\3"+
		"\2\2\2\u02f2\u02f4\7U\2\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f6\3\2\2\2\u02f5\u02f7\t\3\2\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2"+
		"\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\7V\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u02fc\58\35\2\u02fb\u02fd\5<\37\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2"+
		"\2\2\u02fd\u030b\3\2\2\2\u02fe\u0300\7U\2\2\u02ff\u02fe\3\2\2\2\u02ff"+
		"\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303\t\4\2\2\u0302\u0304\7Y"+
		"\2\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305\3\2\2\2\u0305"+
		"\u0306\7V\2\2\u0306\u0308\58\35\2\u0307\u0309\5<\37\2\u0308\u0307\3\2"+
		"\2\2\u0308\u0309\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u02f3\3\2\2\2\u030a"+
		"\u02ff\3\2\2\2\u030b;\3\2\2\2\u030c\u030d\7`\2\2\u030d\u0311\5x=\2\u030e"+
		"\u030f\7]\2\2\u030f\u0311\5f\64\2\u0310\u030c\3\2\2\2\u0310\u030e\3\2"+
		"\2\2\u0311=\3\2\2\2\u0312\u0313\7^\2\2\u0313\u0314\5x=\2\u0314?\3\2\2"+
		"\2\u0315\u0316\7t\2\2\u0316\u0317\7u\2\2\u0317\u031c\5\u00a2R\2\u0318"+
		"\u0319\7%\2\2\u0319\u031b\5\u00a2R\2\u031a\u0318\3\2\2\2\u031b\u031e\3"+
		"\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031dA\3\2\2\2\u031e\u031c"+
		"\3\2\2\2\u031f\u0320\7x\2\2\u0320\u0321\5x=\2\u0321C\3\2\2\2\u0322\u0323"+
		"\7\37\2\2\u0323\u0324\5\"\22\2\u0324\u0326\7 \2\2\u0325\u0327\7_\2\2\u0326"+
		"\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0329\3\2\2\2\u0328\u032a\5,"+
		"\27\2\u0329\u0328\3\2\2\2\u0329\u032a\3\2\2\2\u032aE\3\2\2\2\u032b\u032c"+
		"\7)\2\2\u032cG\3\2\2\2\u032d\u0335\5J&\2\u032e\u0335\5L\'\2\u032f\u0335"+
		"\5N(\2\u0330\u0335\5P)\2\u0331\u0335\5R*\2\u0332\u0335\5T+\2\u0333\u0335"+
		"\5V,\2\u0334\u032d\3\2\2\2\u0334\u032e\3\2\2\2\u0334\u032f\3\2\2\2\u0334"+
		"\u0330\3\2\2\2\u0334\u0331\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0333\3\2"+
		"\2\2\u0335I\3\2\2\2\u0336\u0337\7\u014f\2\2\u0337K\3\2\2\2\u0338\u033a"+
		"\7\20\2\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2"+
		"\u033b\u033c\7\u0150\2\2\u033cM\3\2\2\2\u033d\u033e\t\5\2\2\u033e\u0345"+
		"\7\u014f\2\2\u033f\u0340\7!\2\2\u0340\u0341\5X-\2\u0341\u0342\7\u014f"+
		"\2\2\u0342\u0343\7\"\2\2\u0343\u0345\3\2\2\2\u0344\u033d\3\2\2\2\u0344"+
		"\u033f\3\2\2\2\u0345O\3\2\2\2\u0346\u0347\7\u0151\2\2\u0347Q\3\2\2\2\u0348"+
		"\u0349\7\u0152\2\2\u0349S\3\2\2\2\u034a\u034b\t\6\2\2\u034bU\3\2\2\2\u034c"+
		"\u034d\7j\2\2\u034dW\3\2\2\2\u034e\u0351\7\u014e\2\2\u034f\u0351\5Z.\2"+
		"\u0350\u034e\3\2\2\2\u0350\u034f\3\2\2\2\u0351Y\3\2\2\2\u0352\u0353\t"+
		"\7\2\2\u0353[\3\2\2\2\u0354\u0355\5X-\2\u0355]\3\2\2\2\u0356\u0357\5b"+
		"\62\2\u0357\u0358\7\24\2\2\u0358\u035a\3\2\2\2\u0359\u0356\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\5d\63\2\u035c_\3\2\2\2"+
		"\u035d\u035e\5b\62\2\u035e\u035f\7\24\2\2\u035f\u0361\3\2\2\2\u0360\u035d"+
		"\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363\5d\63\2\u0363"+
		"a\3\2\2\2\u0364\u0365\5X-\2\u0365c\3\2\2\2\u0366\u0367\5X-\2\u0367e\3"+
		"\2\2\2\u0368\u036a\7\37\2\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u036b\3\2\2\2\u036b\u0370\5`\61\2\u036c\u036d\7%\2\2\u036d\u036f\5`\61"+
		"\2\u036e\u036c\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371"+
		"\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0373\u0375\7 \2\2\u0374"+
		"\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375g\3\2\2\2\u0376\u0378\7\37\2\2"+
		"\u0377\u0376\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037e"+
		"\5^\60\2\u037a\u037b\7%\2\2\u037b\u037d\5^\60\2\u037c\u037a\3\2\2\2\u037d"+
		"\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0382\3\2"+
		"\2\2\u0380\u037e\3\2\2\2\u0381\u0383\7 \2\2\u0382\u0381\3\2\2\2\u0382"+
		"\u0383\3\2\2\2\u0383i\3\2\2\2\u0384\u0385\5X-\2\u0385k\3\2\2\2\u0386\u0390"+
		"\7\u014e\2\2\u0387\u0388\7\u014f\2\2\u0388\u038a\7\24\2\2\u0389\u0387"+
		"\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u038e\3\2\2\2\u038d\u038b\3\2\2\2\u038e\u0390\7\u014f\2\2\u038f\u0386"+
		"\3\2\2\2\u038f\u038b\3\2\2\2\u0390m\3\2\2\2\u0391\u0392\t\b\2\2\u0392"+
		"o\3\2\2\2\u0393\u0399\7\37\2\2\u0394\u0397\7\u0150\2\2\u0395\u0396\7%"+
		"\2\2\u0396\u0398\7\u0150\2\2\u0397\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398"+
		"\u039a\3\2\2\2\u0399\u0394\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\3\2"+
		"\2\2\u039b\u039c\7 \2\2\u039cq\3\2\2\2\u039d\u039f\7@\2\2\u039e\u039d"+
		"\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\7C\2\2\u03a1"+
		"s\3\2\2\2\u03a2\u03a7\5x=\2\u03a3\u03a4\7%\2\2\u03a4\u03a6\5x=\2\u03a5"+
		"\u03a3\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2"+
		"\2\2\u03a8u\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ab\7\37\2\2\u03ab\u03ac"+
		"\5t;\2\u03ac\u03ad\7 \2\2\u03adw\3\2\2\2\u03ae\u03af\b=\1\2\u03af\u03b0"+
		"\5|?\2\u03b0\u03b1\5x=\5\u03b1\u03b8\3\2\2\2\u03b2\u03b3\7\37\2\2\u03b3"+
		"\u03b4\5x=\2\u03b4\u03b5\7 \2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b8\5~@\2"+
		"\u03b7\u03ae\3\2\2\2\u03b7\u03b2\3\2\2\2\u03b7\u03b6\3\2\2\2\u03b8\u03bf"+
		"\3\2\2\2\u03b9\u03ba\f\6\2\2\u03ba\u03bb\5z>\2\u03bb\u03bc\5x=\7\u03bc"+
		"\u03be\3\2\2\2\u03bd\u03b9\3\2\2\2\u03be\u03c1\3\2\2\2\u03bf\u03bd\3\2"+
		"\2\2\u03bf\u03c0\3\2\2\2\u03c0y\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c2\u03c3"+
		"\t\t\2\2\u03c3{\3\2\2\2\u03c4\u03c5\t\n\2\2\u03c5}\3\2\2\2\u03c6\u03c7"+
		"\b@\1\2\u03c7\u03c8\5\u0082B\2\u03c8\u03dd\3\2\2\2\u03c9\u03ca\f\7\2\2"+
		"\u03ca\u03cc\7h\2\2\u03cb\u03cd\7i\2\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd"+
		"\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03dc\t\13\2\2\u03cf\u03d0\f\6\2\2"+
		"\u03d0\u03d1\7\26\2\2\u03d1\u03dc\5\u0082B\2\u03d2\u03d3\f\5\2\2\u03d3"+
		"\u03d4\5\u0080A\2\u03d4\u03d5\5\u0082B\2\u03d5\u03dc\3\2\2\2\u03d6\u03d7"+
		"\f\4\2\2\u03d7\u03d8\5\u0080A\2\u03d8\u03d9\t\f\2\2\u03d9\u03da\5D#\2"+
		"\u03da\u03dc\3\2\2\2\u03db\u03c9\3\2\2\2\u03db\u03cf\3\2\2\2\u03db\u03d2"+
		"\3\2\2\2\u03db\u03d6\3\2\2\2\u03dc\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd"+
		"\u03de\3\2\2\2\u03de\177\3\2\2\2\u03df\u03dd\3\2\2\2\u03e0\u03e1\t\r\2"+
		"\2\u03e1\u0081\3\2\2\2\u03e2\u03e4\5\u0084C\2\u03e3\u03e5\7i\2\2\u03e4"+
		"\u03e3\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\7o"+
		"\2\2\u03e7\u03e8\5D#\2\u03e8\u040e\3\2\2\2\u03e9\u03eb\5\u0084C\2\u03ea"+
		"\u03ec\7i\2\2\u03eb\u03ea\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed\3\2"+
		"\2\2\u03ed\u03ee\7o\2\2\u03ee\u03ef\7\37\2\2\u03ef\u03f4\5x=\2\u03f0\u03f1"+
		"\7%\2\2\u03f1\u03f3\5x=\2\u03f2\u03f0\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4"+
		"\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03f4\3\2"+
		"\2\2\u03f7\u03f8\7 \2\2\u03f8\u040e\3\2\2\2\u03f9\u03fb\5\u0084C\2\u03fa"+
		"\u03fc\7i\2\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\3\2"+
		"\2\2\u03fd\u03fe\7n\2\2\u03fe\u03ff\5\u0084C\2\u03ff\u0400\7f\2\2\u0400"+
		"\u0401\5\u0082B\2\u0401\u040e\3\2\2\2\u0402\u0404\5\u0084C\2\u0403\u0405"+
		"\7i\2\2\u0404\u0403\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406"+
		"\u0407\7r\2\2\u0407\u040a\5\u0086D\2\u0408\u0409\7\u00ab\2\2\u0409\u040b"+
		"\5\u0086D\2\u040a\u0408\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040e\3\2\2"+
		"\2\u040c\u040e\5\u0084C\2\u040d\u03e2\3\2\2\2\u040d\u03e9\3\2\2\2\u040d"+
		"\u03f9\3\2\2\2\u040d\u0402\3\2\2\2\u040d\u040c\3\2\2\2\u040e\u0083\3\2"+
		"\2\2\u040f\u0410\bC\1\2\u0410\u0411\5\u0086D\2\u0411\u0432\3\2\2\2\u0412"+
		"\u0413\f\r\2\2\u0413\u0414\7\b\2\2\u0414\u0431\5\u0084C\16\u0415\u0416"+
		"\f\f\2\2\u0416\u0417\7\t\2\2\u0417\u0431\5\u0084C\r\u0418\u0419\f\13\2"+
		"\2\u0419\u041a\7\n\2\2\u041a\u0431\5\u0084C\f\u041b\u041c\f\n\2\2\u041c"+
		"\u041d\7\13\2\2\u041d\u0431\5\u0084C\13\u041e\u041f\f\t\2\2\u041f\u0420"+
		"\7\17\2\2\u0420\u0431\5\u0084C\n\u0421\u0422\f\b\2\2\u0422\u0423\7\20"+
		"\2\2\u0423\u0431\5\u0084C\t\u0424\u0425\f\7\2\2\u0425\u0426\7\21\2\2\u0426"+
		"\u0431\5\u0084C\b\u0427\u0428\f\6\2\2\u0428\u0429\7\22\2\2\u0429\u0431"+
		"\5\u0084C\7\u042a\u042b\f\5\2\2\u042b\u042c\7\r\2\2\u042c\u0431\5\u0084"+
		"C\6\u042d\u042e\f\4\2\2\u042e\u042f\7\f\2\2\u042f\u0431\5\u0084C\5\u0430"+
		"\u0412\3\2\2\2\u0430\u0415\3\2\2\2\u0430\u0418\3\2\2\2\u0430\u041b\3\2"+
		"\2\2\u0430\u041e\3\2\2\2\u0430\u0421\3\2\2\2\u0430\u0424\3\2\2\2\u0430"+
		"\u0427\3\2\2\2\u0430\u042a\3\2\2\2\u0430\u042d\3\2\2\2\u0431\u0434\3\2"+
		"\2\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0085\3\2\2\2\u0434"+
		"\u0432\3\2\2\2\u0435\u0436\bD\1\2\u0436\u0456\5\u0088E\2\u0437\u0456\5"+
		"F$\2\u0438\u0456\5H%\2\u0439\u0456\5`\61\2\u043a\u043b\t\16\2\2\u043b"+
		"\u0456\5\u0086D\b\u043c\u043e\7\u00ae\2\2\u043d\u043c\3\2\2\2\u043d\u043e"+
		"\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\7\37\2\2\u0440\u0445\5x=\2\u0441"+
		"\u0442\7%\2\2\u0442\u0444\5x=\2\u0443\u0441\3\2\2\2\u0444\u0447\3\2\2"+
		"\2\u0445\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0448\3\2\2\2\u0447\u0445"+
		"\3\2\2\2\u0448\u0449\7 \2\2\u0449\u0456\3\2\2\2\u044a\u044c\7m\2\2\u044b"+
		"\u044a\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u0456\5D"+
		"#\2\u044e\u044f\7!\2\2\u044f\u0450\5X-\2\u0450\u0451\5x=\2\u0451\u0452"+
		"\7\"\2\2\u0452\u0456\3\2\2\2\u0453\u0456\5\u009aN\2\u0454\u0456\5\u00ba"+
		"^\2\u0455\u0435\3\2\2\2\u0455\u0437\3\2\2\2\u0455\u0438\3\2\2\2\u0455"+
		"\u0439\3\2\2\2\u0455\u043a\3\2\2\2\u0455\u043d\3\2\2\2\u0455\u044b\3\2"+
		"\2\2\u0455\u044e\3\2\2\2\u0455\u0453\3\2\2\2\u0455\u0454\3\2\2\2\u0456"+
		"\u045c\3\2\2\2\u0457\u0458\f\t\2\2\u0458\u0459\7\5\2\2\u0459\u045b\5\u0086"+
		"D\n\u045a\u0457\3\2\2\2\u045b\u045e\3\2\2\2\u045c\u045a\3\2\2\2\u045c"+
		"\u045d\3\2\2\2\u045d\u0087\3\2\2\2\u045e\u045c\3\2\2\2\u045f\u0463\5\u008a"+
		"F\2\u0460\u0463\5\u0090I\2\u0461\u0463\5\u0096L\2\u0462\u045f\3\2\2\2"+
		"\u0462\u0460\3\2\2\2\u0462\u0461\3\2\2\2\u0463\u0089\3\2\2\2\u0464\u0465"+
		"\5\u008cG\2\u0465\u0467\7\37\2\2\u0466\u0468\5\u008eH\2\u0467\u0466\3"+
		"\2\2\2\u0467\u0468\3\2\2\2\u0468\u0472\3\2\2\2\u0469\u046e\5x=\2\u046a"+
		"\u046b\7%\2\2\u046b\u046d\5x=\2\u046c\u046a\3\2\2\2\u046d\u0470\3\2\2"+
		"\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0473\3\2\2\2\u0470\u046e"+
		"\3\2\2\2\u0471\u0473\7\21\2\2\u0472\u0469\3\2\2\2\u0472\u0471\3\2\2\2"+
		"\u0472\u0473\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\7 \2\2\u0475\u008b"+
		"\3\2\2\2\u0476\u0477\t\17\2\2\u0477\u008d\3\2\2\2\u0478\u0479\7N\2\2\u0479"+
		"\u008f\3\2\2\2\u047a\u047d\5\u0092J\2\u047b\u047d\5\u0094K\2\u047c\u047a"+
		"\3\2\2\2\u047c\u047b\3\2\2\2\u047d\u0091\3\2\2\2\u047e\u047f\7Q\2\2\u047f"+
		"\u0480\7\37\2\2\u0480\u0481\5x=\2\u0481\u0482\7_\2\2\u0482\u0483\5\u00b0"+
		"Y\2\u0483\u0484\7 \2\2\u0484\u0093\3\2\2\2\u0485\u0486\7\u0081\2\2\u0486"+
		"\u0487\7\37\2\2\u0487\u048c\5x=\2\u0488\u0489\7%\2\2\u0489\u048b\5x=\2"+
		"\u048a\u0488\3\2\2\2\u048b\u048e\3\2\2\2\u048c\u048a\3\2\2\2\u048c\u048d"+
		"\3\2\2\2\u048d\u0491\3\2\2\2\u048e\u048c\3\2\2\2\u048f\u0490\7]\2\2\u0490"+
		"\u0492\5\u00caf\2\u0491\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493"+
		"\3\2\2\2\u0493\u0494\7 \2\2\u0494\u0095\3\2\2\2\u0495\u0496\5\u0098M\2"+
		"\u0496\u04a0\7\37\2\2\u0497\u049c\5x=\2\u0498\u0499\7%\2\2\u0499\u049b"+
		"\5x=\2\u049a\u0498\3\2\2\2\u049b\u049e\3\2\2\2\u049c\u049a\3\2\2\2\u049c"+
		"\u049d\3\2\2\2\u049d\u04a1\3\2\2\2\u049e\u049c\3\2\2\2\u049f\u04a1\7\21"+
		"\2\2\u04a0\u0497\3\2\2\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1"+
		"\u04a2\3\2\2\2\u04a2\u04a3\7 \2\2\u04a3\u0097\3\2\2\2\u04a4\u04aa\5X-"+
		"\2\u04a5\u04aa\7a\2\2\u04a6\u04aa\7\u0088\2\2\u04a7\u04aa\7\u0089\2\2"+
		"\u04a8\u04aa\7\u0084\2\2\u04a9\u04a4\3\2\2\2\u04a9\u04a5\3\2\2\2\u04a9"+
		"\u04a6\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9\u04a8\3\2\2\2\u04aa\u0099\3\2"+
		"\2\2\u04ab\u04ad\7O\2\2\u04ac\u04ae\5\u0086D\2\u04ad\u04ac\3\2\2\2\u04ad"+
		"\u04ae\3\2\2\2\u04ae\u04b0\3\2\2\2\u04af\u04b1\5\u009cO\2\u04b0\u04af"+
		"\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3"+
		"\u04b5\3\2\2\2\u04b4\u04b6\5\u009eP\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6"+
		"\3\2\2\2\u04b6\u009b\3\2\2\2\u04b7\u04b8\7P\2\2\u04b8\u04b9\5x=\2\u04b9"+
		"\u04ba\7c\2\2\u04ba\u04bb\5x=\2\u04bb\u009d\3\2\2\2\u04bc\u04bd\7b\2\2"+
		"\u04bd\u04be\5x=\2\u04be\u009f\3\2\2\2\u04bf\u04c0\7s\2\2\u04c0\u04c1"+
		"\7u\2\2\u04c1\u04c6\5\u00a2R\2\u04c2\u04c3\7%\2\2\u04c3\u04c5\5\u00a2"+
		"R\2\u04c4\u04c2\3\2\2\2\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6"+
		"\u04c7\3\2\2\2\u04c7\u00a1\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9\u04cd\5`"+
		"\61\2\u04ca\u04cd\5L\'\2\u04cb\u04cd\5x=\2\u04cc\u04c9\3\2\2\2\u04cc\u04ca"+
		"\3\2\2\2\u04cc\u04cb\3\2\2\2\u04cd\u04cf\3\2\2\2\u04ce\u04d0\t\20\2\2"+
		"\u04cf\u04ce\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u00a3\3\2\2\2\u04d1\u04d2"+
		"\5l\67\2\u04d2\u00a5\3\2\2\2\u04d3\u04d4\7\u014e\2\2\u04d4\u00a7\3\2\2"+
		"\2\u04d5\u04da\5\u0086D\2\u04d6\u04d7\7%\2\2\u04d7\u04d9\5\u0086D\2\u04d8"+
		"\u04d6\3\2\2\2\u04d9\u04dc\3\2\2\2\u04da\u04d8\3\2\2\2\u04da\u04db\3\2"+
		"\2\2\u04db\u00a9\3\2\2\2\u04dc\u04da\3\2\2\2\u04dd\u04e0\5\u00a4S\2\u04de"+
		"\u04e0\5`\61\2\u04df\u04dd\3\2\2\2\u04df\u04de\3\2\2\2\u04e0\u00ab\3\2"+
		"\2\2\u04e1\u04e6\5\u00aaV\2\u04e2\u04e3\7%\2\2\u04e3\u04e5\5\u00aaV\2"+
		"\u04e4\u04e2\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7"+
		"\3\2\2\2\u04e7\u00ad\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e9\u04ea\7\37\2\2"+
		"\u04ea\u04eb\5\u00acW\2\u04eb\u04ec\7 \2\2\u04ec\u00af\3\2\2\2\u04ed\u04ef"+
		"\5\u00b4[\2\u04ee\u04f0\5p9\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2"+
		"\u04f0\u04f9\3\2\2\2\u04f1\u04f9\5\u00b2Z\2\u04f2\u04f4\5\u00b4[\2\u04f3"+
		"\u04f5\5p9\2\u04f4\u04f3\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\3\2\2"+
		"\2\u04f6\u04f7\5\u00b6\\\2\u04f7\u04f9\3\2\2\2\u04f8\u04ed\3\2\2\2\u04f8"+
		"\u04f1\3\2\2\2\u04f8\u04f2\3\2\2\2\u04f9\u00b1\3\2\2\2\u04fa\u04fb\5\u00b4"+
		"[\2\u04fb\u04fc\7\37\2\2\u04fc\u04fd\7\u0150\2\2\u04fd\u04fe\7\u014e\2"+
		"\2\u04fe\u04ff\7 \2\2\u04ff\u0512\3\2\2\2\u0500\u0501\7\u00f1\2\2\u0501"+
		"\u0503\5\u00b4[\2\u0502\u0504\7\u010f\2\2\u0503\u0502\3\2\2\2\u0503\u0504"+
		"\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\7\37\2\2\u0506\u0507\7\u0150"+
		"\2\2\u0507\u0508\7 \2\2\u0508\u0512\3\2\2\2\u0509\u050b\5\u00b4[\2\u050a"+
		"\u050c\7\37\2\2\u050b\u050a\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050d\3"+
		"\2\2\2\u050d\u050f\5`\61\2\u050e\u0510\7 \2\2\u050f\u050e\3\2\2\2\u050f"+
		"\u0510\3\2\2\2\u0510\u0512\3\2\2\2\u0511\u04fa\3\2\2\2\u0511\u0500\3\2"+
		"\2\2\u0511\u0509\3\2\2\2\u0512\u00b3\3\2\2\2\u0513\u0514\7\u014e\2\2\u0514"+
		"\u0517\7\u014e\2\2\u0515\u0517\7\u014e\2\2\u0516\u0513\3\2\2\2\u0516\u0515"+
		"\3\2\2\2\u0517\u00b5\3\2\2\2\u0518\u051a\7L\2\2\u0519\u051b\7\u00a4\2"+
		"\2\u051a\u0519\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051d"+
		"\7\u0086\2\2\u051d\u051f\7\u0111\2\2\u051e\u0518\3\2\2\2\u051e\u051f\3"+
		"\2\2\2\u051f\u052a\3\2\2\2\u0520\u0521\7e\2\2\u0521\u052a\7\u008c\2\2"+
		"\u0522\u0523\7e\2\2\u0523\u0527\7\u0091\2\2\u0524\u0525\7\37\2\2\u0525"+
		"\u0526\7\u0150\2\2\u0526\u0528\7 \2\2\u0527\u0524\3\2\2\2\u0527\u0528"+
		"\3\2\2\2\u0528\u052a\3\2\2\2\u0529\u051e\3\2\2\2\u0529\u0520\3\2\2\2\u0529"+
		"\u0522\3\2\2\2\u052a\u00b7\3\2\2\2\u052b\u052c\7\u0108\2\2\u052c\u052d"+
		"\7\37\2\2\u052d\u052e\5x=\2\u052e\u0530\7_\2\2\u052f\u0531\7\u00f9\2\2"+
		"\u0530\u052f\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533"+
		"\5\u00b4[\2\u0533\u0534\7 \2\2\u0534\u00b9\3\2\2\2\u0535\u053b\5\u00b8"+
		"]\2\u0536\u053b\5\u00bc_\2\u0537\u053b\5\u00c4c\2\u0538\u053b\5\u00c6"+
		"d\2\u0539\u053b\5\u00c8e\2\u053a\u0535\3\2\2\2\u053a\u0536\3\2\2\2\u053a"+
		"\u0537\3\2\2\2\u053a\u0538\3\2\2\2\u053a\u0539\3\2\2\2\u053b\u00bb\3\2"+
		"\2\2\u053c\u053f\7O\2\2\u053d\u0540\5\u00be`\2\u053e\u0540\5\u00c0a\2"+
		"\u053f\u053d\3\2\2\2\u053f\u053e\3\2\2\2\u0540\u0542\3\2\2\2\u0541\u0543"+
		"\5\u00c2b\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0544\3\2\2"+
		"\2\u0544\u0545\7\u00de\2\2\u0545\u00bd\3\2\2\2\u0546\u0548\5x=\2\u0547"+
		"\u0549\5\u00c0a\2\u0548\u0547\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u0548"+
		"\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u00bf\3\2\2\2\u054c\u054d\7P\2\2\u054d"+
		"\u054e\5x=\2\u054e\u054f\7c\2\2\u054f\u0550\5\u0086D\2\u0550\u00c1\3\2"+
		"\2\2\u0551\u0552\7b\2\2\u0552\u0553\5x=\2\u0553\u00c3\3\2\2\2\u0554\u0555"+
		"\7\37\2\2\u0555\u0556\5x=\2\u0556\u0557\7\20\2\2\u0557\u0558\5x=\2\u0558"+
		"\u056e\7 \2\2\u0559\u055d\7\u008e\2\2\u055a\u055b\7\37\2\2\u055b\u055c"+
		"\7\u0150\2\2\u055c\u055e\7 \2\2\u055d\u055a\3\2\2\2\u055d\u055e\3\2\2"+
		"\2\u055e\u055f\3\2\2\2\u055f\u0560\7e\2\2\u0560\u0564\7\u0091\2\2\u0561"+
		"\u0562\7\37\2\2\u0562\u0563\7\u0150\2\2\u0563\u0565\7 \2\2\u0564\u0561"+
		"\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u056f\3\2\2\2\u0566\u056a\7\u008a\2"+
		"\2\u0567\u0568\7\37\2\2\u0568\u0569\7\u0150\2\2\u0569\u056b\7 \2\2\u056a"+
		"\u0567\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056d\7e"+
		"\2\2\u056d\u056f\7\u008c\2\2\u056e\u0559\3\2\2\2\u056e\u0566\3\2\2\2\u056f"+
		"\u00c5\3\2\2\2\u0570\u0571\7\37\2\2\u0571\u0572\5\u0086D\2\u0572\u0573"+
		"\7 \2\2\u0573\u0576\3\2\2\2\u0574\u0576\5\u00b8]\2\u0575\u0570\3\2\2\2"+
		"\u0575\u0574\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0585\7\24\2\2\u0578\u057d"+
		"\5\u00a4S\2\u0579\u057a\7\24\2\2\u057a\u057c\5\u00a4S\2\u057b\u0579\3"+
		"\2\2\2\u057c\u057f\3\2\2\2\u057d\u057b\3\2\2\2\u057d\u057e\3\2\2\2\u057e"+
		"\u0582\3\2\2\2\u057f\u057d\3\2\2\2\u0580\u0581\7\24\2\2\u0581\u0583\5"+
		"\u0088E\2\u0582\u0580\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0586\3\2\2\2"+
		"\u0584\u0586\5\u0088E\2\u0585\u0578\3\2\2\2\u0585\u0584\3\2\2\2\u0586"+
		"\u00c7\3\2\2\2\u0587\u0588\7\u00f2\2\2\u0588\u0589\5\u00b4[\2\u0589\u058a"+
		"\5v<\2\u058a\u00c9\3\2\2\2\u058b\u058c\7\u014e\2\2\u058c\u00cb\3\2\2\2"+
		"\u058d\u0592\5\u00caf\2\u058e\u058f\7%\2\2\u058f\u0591\5\u00caf\2\u0590"+
		"\u058e\3\2\2\2\u0591\u0594\3\2\2\2\u0592\u0590\3\2\2\2\u0592\u0593\3\2"+
		"\2\2\u0593\u00cd\3\2\2\2\u0594\u0592\3\2\2\2\u0595\u0596\7\3\2\2\u0596"+
		"\u00cf\3\2\2\2\u0597\u0598\7\63\2\2\u0598\u0599\5\u00dep\2\u0599\u059a"+
		"\7<\2\2\u059a\u059b\5^\60\2\u059b\u059c\5\u00e6t\2\u059c\u00d1\3\2\2\2"+
		"\u059d\u059e\7\63\2\2\u059e\u059f\5\u0112\u008a\2\u059f\u05a0\7>\2\2\u05a0"+
		"\u05a1\5j\66\2\u05a1\u05a2\7`\2\2\u05a2\u05a3\5\u0120\u0091\2\u05a3\u00d3"+
		"\3\2\2\2\u05a4\u05a5\7\64\2\2\u05a5\u05a6\7<\2\2\u05a6\u05a7\5^\60\2\u05a7"+
		"\u05a8\5\u0124\u0093\2\u05a8\u00d5\3\2\2\2\u05a9\u05aa\7\64\2\2\u05aa"+
		"\u05ab\7>\2\2\u05ab\u05ac\5j\66\2\u05ac\u05ad\5\u0164\u00b3\2\u05ad\u00d7"+
		"\3\2\2\2\u05ae\u05af\7\65\2\2\u05af\u05b0\7<\2\2\u05b0\u05b1\5^\60\2\u05b1"+
		"\u00d9\3\2\2\2\u05b2\u05b3\7\65\2\2\u05b3\u05b4\7>\2\2\u05b4\u05b5\5j"+
		"\66\2\u05b5\u00db\3\2\2\2\u05b6\u05b7\7\66\2\2\u05b7\u05b8\7<\2\2\u05b8"+
		"\u05b9\5^\60\2\u05b9\u00dd\3\2\2\2\u05ba\u05bb\7\u00e1\2\2\u05bb\u05bd"+
		"\7\u0106\2\2\u05bc\u05ba\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u00df\3\2\2"+
		"\2\u05be\u05bf\7\37\2\2\u05bf\u05c0\5\u00e2r\2\u05c0\u05c1\7 \2\2\u05c1"+
		"\u00e1\3\2\2\2\u05c2\u05c3\7\u0105\2\2\u05c3\u05c4\5\u00caf\2\u05c4\u00e3"+
		"\3\2\2\2\u05c5\u05c6\5\u00a6T\2\u05c6\u00e5\3\2\2\2\u05c7\u05c8\7\37\2"+
		"\2\u05c8\u05c9\5\u00e8u\2\u05c9\u05ca\7 \2\2\u05ca\u05cc\3\2\2\2\u05cb"+
		"\u05c7\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05d1\3\2\2\2\u05cd\u05ce\7`"+
		"\2\2\u05ce\u05cf\7|\2\2\u05cf\u05d0\t\21\2\2\u05d0\u05d2\7\u00af\2\2\u05d1"+
		"\u05cd\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u00e7\3\2\2\2\u05d3\u05d8\5\u00ea"+
		"v\2\u05d4\u05d5\7%\2\2\u05d5\u05d7\5\u00eav\2\u05d6\u05d4\3\2\2\2\u05d7"+
		"\u05da\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u00e9\3\2"+
		"\2\2\u05da\u05d8\3\2\2\2\u05db\u05e0\5\u00ecw\2\u05dc\u05e0\5\u010c\u0087"+
		"\2\u05dd\u05e0\5\u010e\u0088\2\u05de\u05e0\5\u0110\u0089\2\u05df\u05db"+
		"\3\2\2\2\u05df\u05dc\3\2\2\2\u05df\u05dd\3\2\2\2\u05df\u05de\3\2\2\2\u05e0"+
		"\u00eb\3\2\2\2\u05e1\u05e2\5`\61\2\u05e2\u05e4\5\u00b0Y\2\u05e3\u05e5"+
		"\7\u0102\2\2\u05e4\u05e3\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e6\3\2\2"+
		"\2\u05e6\u05eb\5\u00eex\2\u05e7\u05e8\5\u00f0y\2\u05e8\u05e9\5x=\2\u05e9"+
		"\u05ec\3\2\2\2\u05ea\u05ec\5\u00f2z\2\u05eb\u05e7\3\2\2\2\u05eb\u05ea"+
		"\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ef\3\2\2\2\u05ed\u05ee\7\u00d7\2"+
		"\2\u05ee\u05f0\5\u00f8}\2\u05ef\u05ed\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0"+
		"\u05f7\3\2\2\2\u05f1\u05f3\5\u00fa~\2\u05f2\u05f1\3\2\2\2\u05f3\u05f4"+
		"\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05f8\3\2\2\2\u05f6"+
		"\u05f8\5\u010a\u0086\2\u05f7\u05f2\3\2\2\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8"+
		"\3\2\2\2\u05f8\u00ed\3\2\2\2\u05f9\u05fb\t\22\2\2\u05fa\u05f9\3\2\2\2"+
		"\u05fa\u05fb\3\2\2\2\u05fb\u00ef\3\2\2\2\u05fc\u05ff\7\u0098\2\2\u05fd"+
		"\u05fe\7`\2\2\u05fe\u0600\7j\2\2\u05ff\u05fd\3\2\2\2\u05ff\u0600\3\2\2"+
		"\2\u0600\u00f1\3\2\2\2\u0601\u0609\7\u00b4\2\2\u0602\u060a\7\u00b1\2\2"+
		"\u0603\u0604\7u\2\2\u0604\u0607\7\u0098\2\2\u0605\u0606\7`\2\2\u0606\u0608"+
		"\7j\2\2\u0607\u0605\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u060a\3\2\2\2\u0609"+
		"\u0602\3\2\2\2\u0609\u0603\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\7_"+
		"\2\2\u060c\u060d\7\u00e3\2\2\u060d\u060e\5\u00f4{\2\u060e\u00f3\3\2\2"+
		"\2\u060f\u0611\7\37\2\2\u0610\u060f\3\2\2\2\u0610\u0611\3\2\2\2\u0611"+
		"\u0617\3\2\2\2\u0612\u0614\5\u00f6|\2\u0613\u0612\3\2\2\2\u0614\u0615"+
		"\3\2\2\2\u0615\u0613\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0618\3\2\2\2\u0617"+
		"\u0613\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u061a\3\2\2\2\u0619\u061b\7 "+
		"\2\2\u061a\u0619\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u00f5\3\2\2\2\u061c"+
		"\u061d\7\u00b9\2\2\u061d\u0621\7L\2\2\u061e\u0622\7\u0150\2\2\u061f\u0620"+
		"\7y\2\2\u0620\u0622\7\u010e\2\2\u0621\u061e\3\2\2\2\u0621\u061f\3\2\2"+
		"\2\u0622\u0634\3\2\2\2\u0623\u0624\7\u00e5\2\2\u0624\u0625\7u\2\2\u0625"+
		"\u0634\7\u0150\2\2\u0626\u0627\7\u00ea\2\2\u0627\u0634\7\u0150\2\2\u0628"+
		"\u0634\7\u00ec\2\2\u0629\u062a\7\u00eb\2\2\u062a\u0634\7\u0150\2\2\u062b"+
		"\u0634\7\u00ed\2\2\u062c\u0634\7\u00d4\2\2\u062d\u0634\7\u00d5\2\2\u062e"+
		"\u062f\7\u00cf\2\2\u062f\u0634\7\u0150\2\2\u0630\u0634\7\u00d0\2\2\u0631"+
		"\u0634\7s\2\2\u0632\u0634\7\u00f3\2\2\u0633\u061c\3\2\2\2\u0633\u0623"+
		"\3\2\2\2\u0633\u0626\3\2\2\2\u0633\u0628\3\2\2\2\u0633\u0629\3\2\2\2\u0633"+
		"\u062b\3\2\2\2\u0633\u062c\3\2\2\2\u0633\u062d\3\2\2\2\u0633\u062e\3\2"+
		"\2\2\u0633\u0630\3\2\2\2\u0633\u0631\3\2\2\2\u0633\u0632\3\2\2\2\u0634"+
		"\u00f7\3\2\2\2\u0635\u0636\7]\2\2\u0636\u0638\7\u014f\2\2\u0637\u0635"+
		"\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u063c\3\2\2\2\u0639\u063a\7\u00e2\2"+
		"\2\u063a\u063b\7u\2\2\u063b\u063d\7\u014f\2\2\u063c\u0639\3\2\2\2\u063c"+
		"\u063d\3\2\2\2\u063d\u063f\3\2\2\2\u063e\u0640\7\u014f\2\2\u063f\u063e"+
		"\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0645\3\2\2\2\u0641\u0643\7\u0109\2"+
		"\2\u0642\u0641\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0646"+
		"\7\u0100\2\2\u0645\u0642\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u00f9\3\2\2"+
		"\2\u0647\u0648\7?\2\2\u0648\u064a\5\u00caf\2\u0649\u0647\3\2\2\2\u0649"+
		"\u064a\3\2\2\2\u064a\u0657\3\2\2\2\u064b\u064d\7i\2\2\u064c\u064b\3\2"+
		"\2\2\u064c\u064d\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u0658\7j\2\2\u064f"+
		"\u0658\7A\2\2\u0650\u0658\5r:\2\u0651\u0658\5\u00fc\177\2\u0652\u0653"+
		"\7\u00b3\2\2\u0653\u0654\7\37\2\2\u0654\u0655\5x=\2\u0655\u0656\7 \2\2"+
		"\u0656\u0658\3\2\2\2\u0657\u064c\3\2\2\2\u0657\u064f\3\2\2\2\u0657\u0650"+
		"\3\2\2\2\u0657\u0651\3\2\2\2\u0657\u0652\3\2\2\2\u0658\u065c\3\2\2\2\u0659"+
		"\u065b\5\u00fe\u0080\2\u065a\u0659\3\2\2\2\u065b\u065e\3\2\2\2\u065c\u065a"+
		"\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u00fb\3\2\2\2\u065e\u065c\3\2\2\2\u065f"+
		"\u0660\7\u00b8\2\2\u0660\u0662\5^\60\2\u0661\u0663\5f\64\2\u0662\u0661"+
		"\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u066b\3\2\2\2\u0664\u0665\7`\2\2\u0665"+
		"\u0669\7\62\2\2\u0666\u066a\7\u00b2\2\2\u0667\u0668\7;\2\2\u0668\u066a"+
		"\7j\2\2\u0669\u0666\3\2\2\2\u0669\u0667\3\2\2\2\u066a\u066c\3\2\2\2\u066b"+
		"\u0664\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u00fd\3\2\2\2\u066d\u0678\5\u0100"+
		"\u0081\2\u066e\u0678\5\u0102\u0082\2\u066f\u0678\7\u00fb\2\2\u0670\u0678"+
		"\7\u00f4\2\2\u0671\u0678\5\u0106\u0084\2\u0672\u0678\7\u009a\2\2\u0673"+
		"\u0678\7\u009b\2\2\u0674\u0678\7\u010c\2\2\u0675\u0678\7\u010d\2\2\u0676"+
		"\u0678\5\u0104\u0083\2\u0677\u066d\3\2\2\2\u0677\u066e\3\2\2\2\u0677\u066f"+
		"\3\2\2\2\u0677\u0670\3\2\2\2\u0677\u0671\3\2\2\2\u0677\u0672\3\2\2\2\u0677"+
		"\u0673\3\2\2\2\u0677\u0674\3\2\2\2\u0677\u0675\3\2\2\2\u0677\u0676\3\2"+
		"\2\2\u0678\u00ff\3\2\2\2\u0679\u067b\7i\2\2\u067a\u0679\3\2\2\2\u067a"+
		"\u067b\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067d\7\u00d9\2\2\u067d\u0101"+
		"\3\2\2\2\u067e\u067f\7\u00e6\2\2\u067f\u0680\t\23\2\2\u0680\u0103\3\2"+
		"\2\2\u0681\u0682\7\u00df\2\2\u0682\u0683\7J\2\2\u0683\u0684\5^\60\2\u0684"+
		"\u0105\3\2\2\2\u0685\u0686\7]\2\2\u0686\u0689\7>\2\2\u0687\u068a\5j\66"+
		"\2\u0688\u068a\5\u0108\u0085\2\u0689\u0687\3\2\2\2\u0689\u0688\3\2\2\2"+
		"\u0689\u068a\3\2\2\2\u068a\u0107\3\2\2\2\u068b\u068c\7\37\2\2\u068c\u068d"+
		"\5\u00d2j\2\u068d\u068e\7 \2\2\u068e\u0109\3\2\2\2\u068f\u0690\7\u0101"+
		"\2\2\u0690\u0691\7h\2\2\u0691\u06a0\5^\60\2\u0692\u0693\7L\2\2\u0693\u06a0"+
		"\7\u00ff\2\2\u0694\u0695\7?\2\2\u0695\u0697\5\u00caf\2\u0696\u0694\3\2"+
		"\2\2\u0696\u0697\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u069c\5\u00fc\177\2"+
		"\u0699\u069b\5\u00fe\u0080\2\u069a\u0699\3\2\2\2\u069b\u069e\3\2\2\2\u069c"+
		"\u069a\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u06a0\3\2\2\2\u069e\u069c\3\2"+
		"\2\2\u069f\u068f\3\2\2\2\u069f\u0692\3\2\2\2\u069f\u0696\3\2\2\2\u06a0"+
		"\u010b\3\2\2\2\u06a1\u06a3\5`\61\2\u06a2\u06a4\5\u00b0Y\2\u06a3\u06a2"+
		"\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a7\3\2\2\2\u06a5\u06a6\7\u00b4\2"+
		"\2\u06a6\u06a8\7\u00b1\2\2\u06a7\u06a5\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8"+
		"\u06a9\3\2\2\2\u06a9\u06aa\7_\2\2\u06aa\u06ab\7\37\2\2\u06ab\u06ac\5x"+
		"=\2\u06ac\u06ae\7 \2\2\u06ad\u06af\7\u0110\2\2\u06ae\u06ad\3\2\2\2\u06ae"+
		"\u06af\3\2\2\2\u06af\u06b3\3\2\2\2\u06b0\u06b2\5\u00fa~\2\u06b1\u06b0"+
		"\3\2\2\2\u06b2\u06b5\3\2\2\2\u06b3\u06b1\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4"+
		"\u010d\3\2\2\2\u06b5\u06b3\3\2\2\2\u06b6\u06b7\7?\2\2\u06b7\u06b9\5\u00ca"+
		"f\2\u06b8\u06b6\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06c9\3\2\2\2\u06ba"+
		"\u06bb\7A\2\2\u06bb\u06ca\5f\64\2\u06bc\u06bd\5r:\2\u06bd\u06be\5f\64"+
		"\2\u06be\u06ca\3\2\2\2\u06bf\u06c0\7B\2\2\u06c0\u06c1\7C\2\2\u06c1\u06c2"+
		"\5f\64\2\u06c2\u06c3\5\u00fc\177\2\u06c3\u06ca\3\2\2\2\u06c4\u06c5\7\u00b3"+
		"\2\2\u06c5\u06c6\7\37\2\2\u06c6\u06c7\5x=\2\u06c7\u06c8\7 \2\2\u06c8\u06ca"+
		"\3\2\2\2\u06c9\u06ba\3\2\2\2\u06c9\u06bc\3\2\2\2\u06c9\u06bf\3\2\2\2\u06c9"+
		"\u06c4\3\2\2\2\u06ca\u06ce\3\2\2\2\u06cb\u06cd\5\u00fe\u0080\2\u06cc\u06cb"+
		"\3\2\2\2\u06cd\u06d0\3\2\2\2\u06ce\u06cc\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf"+
		"\u010f\3\2\2\2\u06d0\u06ce\3\2\2\2\u06d1\u06d2\7\u0101\2\2\u06d2\u06d3"+
		"\7d\2\2\u06d3\u06d4\7\37\2\2\u06d4\u06d5\5\u00aaV\2\u06d5\u06d6\7 \2\2"+
		"\u06d6\u06d7\7h\2\2\u06d7\u06d8\5^\60\2\u06d8\u06ef\3\2\2\2\u06d9\u06da"+
		"\7\u00f9\2\2\u06da\u06db\7\37\2\2\u06db\u06dc\5\u00aaV\2\u06dc\u06dd\7"+
		" \2\2\u06dd\u06de\7L\2\2\u06de\u06df\7\u00ff\2\2\u06df\u06ef\3\2\2\2\u06e0"+
		"\u06e1\7?\2\2\u06e1\u06e3\5\u00caf\2\u06e2\u06e0\3\2\2\2\u06e2\u06e3\3"+
		"\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e5\7B\2\2\u06e5\u06e6\7C\2\2\u06e6"+
		"\u06e7\5\u00aeX\2\u06e7\u06eb\5\u00fc\177\2\u06e8\u06ea\5\u00fe\u0080"+
		"\2\u06e9\u06e8\3\2\2\2\u06ea\u06ed\3\2\2\2\u06eb\u06e9\3\2\2\2\u06eb\u06ec"+
		"\3\2\2\2\u06ec\u06ef\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ee\u06d1\3\2\2\2\u06ee"+
		"\u06d9\3\2\2\2\u06ee\u06e2\3\2\2\2\u06ef\u0111\3\2\2\2\u06f0\u06f2\t\24"+
		"\2\2\u06f1\u06f0\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2\u0113\3\2\2\2\u06f3"+
		"\u06f5\5^\60\2\u06f4\u06f6\5,\27\2\u06f5\u06f4\3\2\2\2\u06f5\u06f6\3\2"+
		"\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f8\5\u0116\u008c\2\u06f8\u0115\3\2\2"+
		"\2\u06f9\u06fa\7\37\2\2\u06fa\u06ff\5\u0118\u008d\2\u06fb\u06fc\7%\2\2"+
		"\u06fc\u06fe\5\u0118\u008d\2\u06fd\u06fb\3\2\2\2\u06fe\u0701\3\2\2\2\u06ff"+
		"\u06fd\3\2\2\2\u06ff\u0700\3\2\2\2\u0700\u0702\3\2\2\2\u0701\u06ff\3\2"+
		"\2\2\u0702\u0703\7 \2\2\u0703\u0117\3\2\2\2\u0704\u0707\5`\61\2\u0705"+
		"\u0707\5x=\2\u0706\u0704\3\2\2\2\u0706\u0705\3\2\2\2\u0707\u0709\3\2\2"+
		"\2\u0708\u070a\t\20\2\2\u0709\u0708\3\2\2\2\u0709\u070a\3\2\2\2\u070a"+
		"\u0119\3\2\2\2\u070b\u070c\5^\60\2\u070c\u070d\5\u011c\u008f\2\u070d\u070e"+
		"\7T\2\2\u070e\u070f\5\u0122\u0092\2\u070f\u0710\7^\2\2\u0710\u0711\5x"+
		"=\2\u0711\u011b\3\2\2\2\u0712\u0713\7\37\2\2\u0713\u0718\5\u011e\u0090"+
		"\2\u0714\u0715\7%\2\2\u0715\u0717\5\u011e\u0090\2\u0716\u0714\3\2\2\2"+
		"\u0717\u071a\3\2\2\2\u0718\u0716\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u071b"+
		"\3\2\2\2\u071a\u0718\3\2\2\2\u071b\u071c\7 \2\2\u071c\u011d\3\2\2\2\u071d"+
		"\u0720\5^\60\2\u071e\u0720\5,\27\2\u071f\u071d\3\2\2\2\u071f\u071e\3\2"+
		"\2\2\u071f\u0720\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0723\5`\61\2\u0722"+
		"\u0724\t\20\2\2\u0723\u0722\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u011f\3"+
		"\2\2\2\u0725\u0728\5\u0114\u008b\2\u0726\u0728\5\u011a\u008e\2\u0727\u0725"+
		"\3\2\2\2\u0727\u0726\3\2\2\2\u0728\u0121\3\2\2\2\u0729\u072b\5^\60\2\u072a"+
		"\u072c\5,\27\2\u072b\u072a\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u0734\3\2"+
		"\2\2\u072d\u072e\7%\2\2\u072e\u0730\5^\60\2\u072f\u0731\5,\27\2\u0730"+
		"\u072f\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0733\3\2\2\2\u0732\u072d\3\2"+
		"\2\2\u0733\u0736\3\2\2\2\u0734\u0732\3\2\2\2\u0734\u0735\3\2\2\2\u0735"+
		"\u0123\3\2\2\2\u0736\u0734\3\2\2\2\u0737\u073c\5\u0126\u0094\2\u0738\u073c"+
		"\5\u012a\u0096\2\u0739\u073c\5\u014e\u00a8\2\u073a\u073c\5\u015e\u00b0"+
		"\2\u073b\u0737\3\2\2\2\u073b\u0738\3\2\2\2\u073b\u0739\3\2\2\2\u073b\u073a"+
		"\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u0125\3\2\2\2\u073d\u0741\5\u0128\u0095"+
		"\2\u073e\u073f\7\u00fa\2\2\u073f\u0741\5\u00f8}\2\u0740\u073d\3\2\2\2"+
		"\u0740\u073e\3\2\2\2\u0741\u0127\3\2\2\2\u0742\u0743\7\u00fc\2\2\u0743"+
		"\u0744\7e\2\2\u0744\u0745\5X-\2\u0745\u0129\3\2\2\2\u0746\u0748\5\u012c"+
		"\u0097\2\u0747\u0746\3\2\2\2\u0748\u0749\3\2\2\2\u0749\u0747\3\2\2\2\u0749"+
		"\u074a\3\2\2\2\u074a\u074d\3\2\2\2\u074b\u074d\5\u014c\u00a7\2\u074c\u0747"+
		"\3\2\2\2\u074c\u074b\3\2\2\2\u074d\u012b\3\2\2\2\u074e\u0752\5\u012e\u0098"+
		"\2\u074f\u0752\5\u013c\u009f\2\u0750\u0752\5\u0142\u00a2\2\u0751\u074e"+
		"\3\2\2\2\u0751\u074f\3\2\2\2\u0751\u0750\3\2\2\2\u0752\u012d\3\2\2\2\u0753"+
		"\u0754\7:\2\2\u0754\u0756\5\u0130\u0099\2\u0755\u0757\5\u0134\u009b\2"+
		"\u0756\u0755\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u012f\3\2\2\2\u0758\u0759"+
		"\7\37\2\2\u0759\u075e\5\u0132\u009a\2\u075a\u075b\7%\2\2\u075b\u075d\5"+
		"\u0132\u009a\2\u075c\u075a\3\2\2\2\u075d\u0760\3\2\2\2\u075e\u075c\3\2"+
		"\2\2\u075e\u075f\3\2\2\2\u075f\u0761\3\2\2\2\u0760\u075e\3\2\2\2\u0761"+
		"\u0762\7 \2\2\u0762\u0765\3\2\2\2\u0763\u0765\5\u0132\u009a\2\u0764\u0758"+
		"\3\2\2\2\u0764\u0763\3\2\2\2\u0765\u0131\3\2\2\2\u0766\u0769\5\u00ecw"+
		"\2\u0767\u0769\5\u010c\u0087\2\u0768\u0766\3\2\2\2\u0768\u0767\3\2\2\2"+
		"\u0769\u0133\3\2\2\2\u076a\u076c\5\u0136\u009c\2\u076b\u076a\3\2\2\2\u076c"+
		"\u076d\3\2\2\2\u076d\u076b\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u0135\3\2"+
		"\2\2\u076f\u0770\5\u0138\u009d\2\u0770\u0137\3\2\2\2\u0771\u0772\7=\2"+
		"\2\u0772\u0773\5`\61\2\u0773\u0774\5\u013a\u009e\2\u0774\u0139\3\2\2\2"+
		"\u0775\u0777\7\u00dd\2\2\u0776\u0775\3\2\2\2\u0776\u0777\3\2\2\2\u0777"+
		"\u0778\3\2\2\2\u0778\u0779\7h\2\2\u0779\u077b\7\u00f5\2\2\u077a\u077c"+
		"\7\u010a\2\2\u077b\u077a\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077d\3\2\2"+
		"\2\u077d\u077f\7\37\2\2\u077e\u0780\7\u00f6\2\2\u077f\u077e\3\2\2\2\u077f"+
		"\u0780\3\2\2\2\u0780\u0781\3\2\2\2\u0781\u0782\5\u00b4[\2\u0782\u0783"+
		"\7 \2\2\u0783\u078c\3\2\2\2\u0784\u0786\7i\2\2\u0785\u0784\3\2\2\2\u0785"+
		"\u0786\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u0788\7\u0104\2\2\u0788\u0789"+
		"\7\u00cd\2\2\u0789\u078a\7p\2\2\u078a\u078c\7\u00e9\2\2\u078b\u0776\3"+
		"\2\2\2\u078b\u0785\3\2\2\2\u078c\u013b\3\2\2\2\u078d\u079d\7\u00f0\2\2"+
		"\u078e\u0790\7\37\2\2\u078f\u078e\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0791"+
		"\3\2\2\2\u0791\u0796\5\u013e\u00a0\2\u0792\u0793\7%\2\2\u0793\u0795\5"+
		"\u013e\u00a0\2\u0794\u0792\3\2\2\2\u0795\u0798\3\2\2\2\u0796\u0794\3\2"+
		"\2\2\u0796\u0797\3\2\2\2\u0797\u079a\3\2\2\2\u0798\u0796\3\2\2\2\u0799"+
		"\u079b\7 \2\2\u079a\u0799\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079e\3\2"+
		"\2\2\u079c\u079e\5\u0140\u00a1\2\u079d\u078f\3\2\2\2\u079d\u079c\3\2\2"+
		"\2\u079e\u013d\3\2\2\2\u079f\u07a1\5`\61\2\u07a0\u07a2\5\u00b0Y\2\u07a1"+
		"\u07a0\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a5\3\2\2\2\u07a3\u07a4\7\u0098"+
		"\2\2\u07a4\u07a6\5x=\2\u07a5\u07a3\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6\u07aa"+
		"\3\2\2\2\u07a7\u07a8\7\u00d7\2\2\u07a8\u07ab\5\u00f8}\2\u07a9\u07ab\7"+
		"\u00d8\2\2\u07aa\u07a7\3\2\2\2\u07aa\u07a9\3\2\2\2\u07aa\u07ab\3\2\2\2"+
		"\u07ab\u07af\3\2\2\2\u07ac\u07ae\5\u00fa~\2\u07ad\u07ac\3\2\2\2\u07ae"+
		"\u07b1\3\2\2\2\u07af\u07ad\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u013f\3\2"+
		"\2\2\u07b1\u07af\3\2\2\2\u07b2\u07b3\7=\2\2\u07b3\u07b5\5`\61\2\u07b4"+
		"\u07b6\7i\2\2\u07b5\u07b4\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u07b7\3\2"+
		"\2\2\u07b7\u07b8\7\u0104\2\2\u07b8\u07b9\7\u00cd\2\2\u07b9\u07ba\7p\2"+
		"\2\u07ba\u07bc\7\u00e9\2\2\u07bb\u07bd\7\u00e0\2\2\u07bc\u07bb\3\2\2\2"+
		"\u07bc\u07bd\3\2\2\2\u07bd\u0141\3\2\2\2\u07be\u07bf\7;\2\2\u07bf\u07c0"+
		"\7\u010b\2\2\u07c0\u07c4\5\u0146\u00a4\2\u07c1\u07c3\5\u0148\u00a5\2\u07c2"+
		"\u07c1\3\2\2\2\u07c3\u07c6\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c4\u07c5\3\2"+
		"\2\2\u07c5\u07c9\3\2\2\2\u07c6\u07c4\3\2\2\2\u07c7\u07c9\5\u0144\u00a3"+
		"\2\u07c8\u07be\3\2\2\2\u07c8\u07c7\3\2\2\2\u07c9\u0143\3\2\2\2\u07ca\u07cb"+
		"\7\65\2\2\u07cb\u07cf\5\u0146\u00a4\2\u07cc\u07ce\5\u0148\u00a5\2\u07cd"+
		"\u07cc\3\2\2\2\u07ce\u07d1\3\2\2\2\u07cf\u07cd\3\2\2\2\u07cf\u07d0\3\2"+
		"\2\2\u07d0\u07d3\3\2\2\2\u07d1\u07cf\3\2\2\2\u07d2\u07d4\5\u014a\u00a6"+
		"\2\u07d3\u07d2\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u0145\3\2\2\2\u07d5\u07d6"+
		"\7=\2\2\u07d6\u07e3\5`\61\2\u07d7\u07d8\7\37\2\2\u07d8\u07dd\5`\61\2\u07d9"+
		"\u07da\7%\2\2\u07da\u07dc\5`\61\2\u07db\u07d9\3\2\2\2\u07dc\u07df\3\2"+
		"\2\2\u07dd\u07db\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07e0\3\2\2\2\u07df"+
		"\u07dd\3\2\2\2\u07e0\u07e1\7 \2\2\u07e1\u07e3\3\2\2\2\u07e2\u07d5\3\2"+
		"\2\2\u07e2\u07d7\3\2\2\2\u07e3\u0147\3\2\2\2\u07e4\u07e5\7\u00b2\2\2\u07e5"+
		"\u07e8\7\u00d3\2\2\u07e6\u07e8\7\u00e7\2\2\u07e7\u07e4\3\2\2\2\u07e7\u07e6"+
		"\3\2\2\2\u07e8\u0149\3\2\2\2\u07e9\u07ea\7\u00d1\2\2\u07ea\u07eb\7\u0150"+
		"\2\2\u07eb\u014b\3\2\2\2\u07ec\u07ed\7\u00fc\2\2\u07ed\u07ee\7=\2\2\u07ee"+
		"\u07ef\5`\61\2\u07ef\u07f0\7e\2\2\u07f0\u07f1\5`\61\2\u07f1\u014d\3\2"+
		"\2\2\u07f2\u07fb\5\u0150\u00a9\2\u07f3\u07fb\5\u0152\u00aa\2\u07f4\u07fb"+
		"\5\u015a\u00ae\2\u07f5\u07f7\5\u015c\u00af\2\u07f6\u07f5\3\2\2\2\u07f7"+
		"\u07f8\3\2\2\2\u07f8\u07f6\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9\u07fb\3\2"+
		"\2\2\u07fa\u07f2\3\2\2\2\u07fa\u07f3\3\2\2\2\u07fa\u07f4\3\2\2\2\u07fa"+
		"\u07f6\3\2\2\2\u07fb\u014f\3\2\2\2\u07fc\u0803\7:\2\2\u07fd\u07ff\5\u010e"+
		"\u0088\2\u07fe\u07fd\3\2\2\2\u07ff\u0800\3\2\2\2\u0800\u07fe\3\2\2\2\u0800"+
		"\u0801\3\2\2\2\u0801\u0804\3\2\2\2\u0802\u0804\5\u0110\u0089\2\u0803\u07fe"+
		"\3\2\2\2\u0803\u0802\3\2\2\2\u0804\u0151\3\2\2\2\u0805\u0806\7\u00f0\2"+
		"\2\u0806\u0808\5\u0156\u00ac\2\u0807\u0809\5\u00fe\u0080\2\u0808\u0807"+
		"\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u0808\3\2\2\2\u080a\u080b\3\2\2\2\u080b"+
		"\u080d\3\2\2\2\u080c\u080e\7\u00b2\2\2\u080d\u080c\3\2\2\2\u080d\u080e"+
		"\3\2\2\2\u080e\u0153\3\2\2\2\u080f\u0810\7?\2\2\u0810\u0811\5\u00caf\2"+
		"\u0811\u0155\3\2\2\2\u0812\u0815\5\u0154\u00ab\2\u0813\u0815\5\u0158\u00ad"+
		"\2\u0814\u0812\3\2\2\2\u0814\u0813\3\2\2\2\u0815\u0157\3\2\2\2\u0816\u081a"+
		"\5r:\2\u0817\u0818\7A\2\2\u0818\u081a\5f\64\2\u0819\u0816\3\2\2\2\u0819"+
		"\u0817\3\2\2\2\u081a\u0159\3\2\2\2\u081b\u081c\7\u00fc\2\2\u081c\u081d"+
		"\5\u0154\u00ab\2\u081d\u081e\7e\2\2\u081e\u081f\5\u00caf\2\u081f\u015b"+
		"\3\2\2\2\u0820\u082e\7\65\2\2\u0821\u0823\5\u0158\u00ad\2\u0822\u0824"+
		"\7\u00b2\2\2\u0823\u0822\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0827\3\2\2"+
		"\2\u0825\u0826\t\25\2\2\u0826\u0828\7>\2\2\u0827\u0825\3\2\2\2\u0827\u0828"+
		"\3\2\2\2\u0828\u082f\3\2\2\2\u0829\u082a\7?\2\2\u082a\u082c\5\u00caf\2"+
		"\u082b\u082d\7\u00b2\2\2\u082c\u082b\3\2\2\2\u082c\u082d\3\2\2\2\u082d"+
		"\u082f\3\2\2\2\u082e\u0821\3\2\2\2\u082e\u0829\3\2\2\2\u082f\u015d\3\2"+
		"\2\2\u0830\u0834\5\u012e\u0098\2\u0831\u0834\5\u013c\u009f\2\u0832\u0834"+
		"\5\u0144\u00a3\2\u0833\u0830\3\2\2\2\u0833\u0831\3\2\2\2\u0833\u0832\3"+
		"\2\2\2\u0834\u0835\3\2\2\2\u0835\u0833\3\2\2\2\u0835\u0836\3\2\2\2\u0836"+
		"\u015f\3\2\2\2\u0837\u083c\5\u0162\u00b2\2\u0838\u0839\7%\2\2\u0839\u083b"+
		"\5\u0162\u00b2\2\u083a\u0838\3\2\2\2\u083b\u083e\3\2\2\2\u083c\u083a\3"+
		"\2\2\2\u083c\u083d\3\2\2\2\u083d\u0161\3\2\2\2\u083e\u083c\3\2\2\2\u083f"+
		"\u0842\5`\61\2\u0840\u0842\5\u00a4S\2\u0841\u083f\3\2\2\2\u0841\u0840"+
		"\3\2\2\2\u0842\u0845\3\2\2\2\u0843\u0844\7\u0098\2\2\u0844\u0846\5x=\2"+
		"\u0845\u0843\3\2\2\2\u0845\u0846\3\2\2\2\u0846\u0850\3\2\2\2\u0847\u0849"+
		"\5\u00fa~\2\u0848\u0847\3\2\2\2\u0849\u084c\3\2\2\2\u084a\u0848\3\2\2"+
		"\2\u084a\u084b\3\2\2\2\u084b\u0851\3\2\2\2\u084c\u084a\3\2\2\2\u084d\u084f"+
		"\5\u010a\u0086\2\u084e\u084d\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0851\3"+
		"\2\2\2\u0850\u084a\3\2\2\2\u0850\u084e\3\2\2\2\u0851\u0855\3\2\2\2\u0852"+
		"\u0855\5\u010e\u0088\2\u0853\u0855\5\u0110\u0089\2\u0854\u0841\3\2\2\2"+
		"\u0854\u0852\3\2\2\2\u0854\u0853\3\2\2\2\u0855\u0163\3\2\2\2\u0856\u0857"+
		"\7\u00fc\2\2\u0857\u0858\7e\2\2\u0858\u085a\5j\66\2\u0859\u0856\3\2\2"+
		"\2\u0859\u085a\3\2\2\2\u085a\u0165\3\2\2\2\u085b\u085c\7;\2\2\u085c\u085d"+
		"\7\u00ba\2\2\u085d\u0167\3\2\2\2\u085e\u085f\7|\2\2\u085f\u0169\3\2\2"+
		"\2\u0860\u0861\7}\2\2\u0861\u016b\3\2\2\2\u0862\u0863\7~\2\2\u0863\u016d"+
		"\3\2\2\2\u0864\u0868\78\2\2\u0865\u0869\5\u0172\u00ba\2\u0866\u0869\5"+
		"\u0174\u00bb\2\u0867\u0869\5\u0176\u00bc\2\u0868\u0865\3\2\2\2\u0868\u0866"+
		"\3\2\2\2\u0868\u0867\3\2\2\2\u0869\u016f\3\2\2\2\u086a\u086e\79\2\2\u086b"+
		"\u086f\5\u0172\u00ba\2\u086c\u086f\5\u0174\u00bb\2\u086d\u086f\5\u0176"+
		"\u00bc\2\u086e\u086b\3\2\2\2\u086e\u086c\3\2\2\2\u086e\u086d\3\2\2\2\u086f"+
		"\u0171\3\2\2\2\u0870\u0871\5\u0178\u00bd\2\u0871\u0872\7`\2\2\u0872\u0873"+
		"\5\u017c\u00bf\2\u0873\u0173\3\2\2\2\u0874\u0875\5\u017e\u00c0\2\u0875"+
		"\u0175\3\2\2\2\u0876\u0877\5\u00ccg\2\u0877\u0177\3\2\2\2\u0878\u087a"+
		"\5\u017a\u00be\2\u0879\u087b\5f\64\2\u087a\u0879\3\2\2\2\u087a\u087b\3"+
		"\2\2\2\u087b\u0883\3\2\2\2\u087c\u087d\7%\2\2\u087d\u087f\5\u017a\u00be"+
		"\2\u087e\u0880\5f\64\2\u087f\u087e\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u0882"+
		"\3\2\2\2\u0881\u087c\3\2\2\2\u0882\u0885\3\2\2\2\u0883\u0881\3\2\2\2\u0883"+
		"\u0884\3\2\2\2\u0884\u0179\3\2\2\2\u0885\u0883\3\2\2\2\u0886\u0888\7p"+
		"\2\2\u0887\u0889\7\u00b5\2\2\u0888\u0887\3\2\2\2\u0888\u0889\3\2\2\2\u0889"+
		"\u08a7\3\2\2\2\u088a\u08a7\7/\2\2\u088b\u08a7\7\60\2\2\u088c\u08a7\7\62"+
		"\2\2\u088d\u08a7\7\61\2\2\u088e\u08a7\7\64\2\2\u088f\u08a7\7\u00b6\2\2"+
		"\u0890\u08a7\7\u00b7\2\2\u0891\u08a7\7\u00bf\2\2\u0892\u08a7\7\u00c0\2"+
		"\2\u0893\u08a7\7>\2\2\u0894\u08a7\7\u00b8\2\2\u0895\u08a7\7\u00c1\2\2"+
		"\u0896\u08a7\7\u00c2\2\2\u0897\u0898\7\u00c3\2\2\u0898\u08a7\7\u00c4\2"+
		"\2\u0899\u089a\7`\2\2\u089a\u089b\7|\2\2\u089b\u08a7\7\u00c5\2\2\u089c"+
		"\u089d\7\u00c6\2\2\u089d\u08a7\7\u00c7\2\2\u089e\u089f\7\u00c8\2\2\u089f"+
		"\u08a7\7\u00c9\2\2\u08a0\u08a1\7\u00ca\2\2\u08a1\u08a7\7\u00b5\2\2\u08a2"+
		"\u08a3\7\u00cb\2\2\u08a3\u08a7\7\u00a2\2\2\u08a4\u08a5\7\u00cc\2\2\u08a5"+
		"\u08a7\7I\2\2\u08a6\u0886\3\2\2\2\u08a6\u088a\3\2\2\2\u08a6\u088b\3\2"+
		"\2\2\u08a6\u088c\3\2\2\2\u08a6\u088d\3\2\2\2\u08a6\u088e\3\2\2\2\u08a6"+
		"\u088f\3\2\2\2\u08a6\u0890\3\2\2\2\u08a6\u0891\3\2\2\2\u08a6\u0892\3\2"+
		"\2\2\u08a6\u0893\3\2\2\2\u08a6\u0894\3\2\2\2\u08a6\u0895\3\2\2\2\u08a6"+
		"\u0896\3\2\2\2\u08a6\u0897\3\2\2\2\u08a6\u0899\3\2\2\2\u08a6\u089c\3\2"+
		"\2\2\u08a6\u089e\3\2\2\2\u08a6\u08a0\3\2\2\2\u08a6\u08a2\3\2\2\2\u08a6"+
		"\u08a4\3\2\2\2\u08a7\u017b\3\2\2\2\u08a8\u08b5\7\u00bb\2\2\u08a9\u08b5"+
		"\7\u00db\2\2\u08aa\u08b5\7\u00dc\2\2\u08ab\u08ac\7\u00ee\2\2\u08ac\u08b5"+
		"\7\u00ef\2\2\u08ad\u08ae\7\u00a2\2\2\u08ae\u08af\7\u0107\2\2\u08af\u08b5"+
		"\7\u00f8\2\2\u08b0\u08b1\7\u00e8\2\2\u08b1\u08b2\t\26\2\2\u08b2\u08b5"+
		"\5^\60\2\u08b3\u08b5\5^\60\2\u08b4\u08a8\3\2\2\2\u08b4\u08a9\3\2\2\2\u08b4"+
		"\u08aa\3\2\2\2\u08b4\u08ab\3\2\2\2\u08b4\u08ad\3\2\2\2\u08b4\u08b0\3\2"+
		"\2\2\u08b4\u08b3\3\2\2\2\u08b5\u017d\3\2\2\2\u08b6\u08b7\7p\2\2\u08b7"+
		"\u08e4\7\u00b5\2\2\u08b8\u08e4\5\u0182\u00c2\2\u08b9\u08e4\5\u0184\u00c3"+
		"\2\u08ba\u08e4\5\u0186\u00c4\2\u08bb\u08e4\5\u0188\u00c5\2\u08bc\u08e4"+
		"\5\u018a\u00c6\2\u08bd\u08e4\5\u018c\u00c7\2\u08be\u08e4\5\u018e\u00c8"+
		"\2\u08bf\u08e4\5\u0190\u00c9\2\u08c0\u08e4\5\u0192\u00ca\2\u08c1\u08e4"+
		"\5\u0194\u00cb\2\u08c2\u08e4\5\u0196\u00cc\2\u08c3\u08e4\5\u0198\u00cd"+
		"\2\u08c4\u08e4\5\u019a\u00ce\2\u08c5\u08e4\5\u019c\u00cf\2\u08c6\u08e4"+
		"\5\u019e\u00d0\2\u08c7\u08e4\5\u01a0\u00d1\2\u08c8\u08e4\5\u01a2\u00d2"+
		"\2\u08c9\u08e4\5\u01a4\u00d3\2\u08ca\u08e4\5\u01a6\u00d4\2\u08cb\u08e4"+
		"\5\u01a8\u00d5\2\u08cc\u08e4\5\u01aa\u00d6\2\u08cd\u08e4\5\u01ac\u00d7"+
		"\2\u08ce\u08e4\5\u01ae\u00d8\2\u08cf\u08e4\5\u01b0\u00d9\2\u08d0\u08e4"+
		"\5\u01b2\u00da\2\u08d1\u08e4\5\u01b4\u00db\2\u08d2\u08e4\5\u01b6\u00dc"+
		"\2\u08d3\u08e4\5\u01b8\u00dd\2\u08d4\u08e4\5\u01ba\u00de\2\u08d5\u08e4"+
		"\5\u01bc\u00df\2\u08d6\u08e4\5\u01be\u00e0\2\u08d7\u08e4\5\u01c0\u00e1"+
		"\2\u08d8\u08e4\5\u01c2\u00e2\2\u08d9\u08e4\5\u01c4\u00e3\2\u08da\u08e4"+
		"\5\u01c6\u00e4\2\u08db\u08e4\5\u01c8\u00e5\2\u08dc\u08e4\5\u01ca\u00e6"+
		"\2\u08dd\u08e4\5\u01cc\u00e7\2\u08de\u08e4\5\u01ce\u00e8\2\u08df\u08e4"+
		"\5\u01d0\u00e9\2\u08e0\u08e4\5\u01d2\u00ea\2\u08e1\u08e4\5\u01d4\u00eb"+
		"\2\u08e2\u08e4\5\u01d6\u00ec\2\u08e3\u08b6\3\2\2\2\u08e3\u08b8\3\2\2\2"+
		"\u08e3\u08b9\3\2\2\2\u08e3\u08ba\3\2\2\2\u08e3\u08bb\3\2\2\2\u08e3\u08bc"+
		"\3\2\2\2\u08e3\u08bd\3\2\2\2\u08e3\u08be\3\2\2\2\u08e3\u08bf\3\2\2\2\u08e3"+
		"\u08c0\3\2\2\2\u08e3\u08c1\3\2\2\2\u08e3\u08c2\3\2\2\2\u08e3\u08c3\3\2"+
		"\2\2\u08e3\u08c4\3\2\2\2\u08e3\u08c5\3\2\2\2\u08e3\u08c6\3\2\2\2\u08e3"+
		"\u08c7\3\2\2\2\u08e3\u08c8\3\2\2\2\u08e3\u08c9\3\2\2\2\u08e3\u08ca\3\2"+
		"\2\2\u08e3\u08cb\3\2\2\2\u08e3\u08cc\3\2\2\2\u08e3\u08cd\3\2\2\2\u08e3"+
		"\u08ce\3\2\2\2\u08e3\u08cf\3\2\2\2\u08e3\u08d0\3\2\2\2\u08e3\u08d1\3\2"+
		"\2\2\u08e3\u08d2\3\2\2\2\u08e3\u08d3\3\2\2\2\u08e3\u08d4\3\2\2\2\u08e3"+
		"\u08d5\3\2\2\2\u08e3\u08d6\3\2\2\2\u08e3\u08d7\3\2\2\2\u08e3\u08d8\3\2"+
		"\2\2\u08e3\u08d9\3\2\2\2\u08e3\u08da\3\2\2\2\u08e3\u08db\3\2\2\2\u08e3"+
		"\u08dc\3\2\2\2\u08e3\u08dd\3\2\2\2\u08e3\u08de\3\2\2\2\u08e3\u08df\3\2"+
		"\2\2\u08e3\u08e0\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e3\u08e2\3\2\2\2\u08e4"+
		"\u017f\3\2\2\2\u08e5\u08e7\t\27\2\2\u08e6\u08e8\7q\2\2\u08e7\u08e6\3\2"+
		"\2\2\u08e7\u08e8\3\2\2\2\u08e8\u0181\3\2\2\2\u08e9\u08eb\5\u0180\u00c1"+
		"\2\u08ea\u08e9\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u08ed"+
		"\7\u00a2\2\2\u08ed\u08fb\7\u00f8\2\2\u08ee\u08fb\7\u0116\2\2\u08ef\u08f1"+
		"\7\u0117\2\2\u08f0\u08f2\7q\2\2\u08f1\u08f0\3\2\2\2\u08f1\u08f2\3\2\2"+
		"\2\u08f2\u08f3\3\2\2\2\u08f3\u08f8\7\u00a2\2\2\u08f4\u08f5\7\u0118\2\2"+
		"\u08f5\u08f9\7;\2\2\u08f6\u08f7\7\u011a\2\2\u08f7\u08f9\7\u011b\2\2\u08f8"+
		"\u08f4\3\2\2\2\u08f8\u08f6\3\2\2\2\u08f9\u08fb\3\2\2\2\u08fa\u08ea\3\2"+
		"\2\2\u08fa\u08ee\3\2\2\2\u08fa\u08ef\3\2\2\2\u08fb\u0183\3\2\2\2\u08fc"+
		"\u08fd\5\u0180\u00c1\2\u08fd\u08fe\7\u011c\2\2\u08fe\u0185\3\2\2\2\u08ff"+
		"\u0900\5\u0180\u00c1\2\u0900\u0901\7\u011d\2\2\u0901\u0187\3\2\2\2\u0902"+
		"\u0903\7\u011e\2\2\u0903\u0904\7\u011f\2\2\u0904\u0905\7\u0120\2\2\u0905"+
		"\u0189\3\2\2\2\u0906\u0907\7\64\2\2\u0907\u090b\t\30\2\2\u0908\u0909\7"+
		"\u0123\2\2\u0909\u090b\7\u0122\2\2\u090a\u0906\3\2\2\2\u090a\u0908\3\2"+
		"\2\2\u090b\u018b\3\2\2\2\u090c\u090e\t\31\2\2\u090d\u090f\7\u0112\2\2"+
		"\u090e\u090d\3\2\2\2\u090e\u090f\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u0911"+
		"\7\u0121\2\2\u0911\u0912\7\u0124\2\2\u0912\u018d\3\2\2\2\u0913\u0918\7"+
		"\u00c1\2\2\u0914\u0915\7\u00d2\2\2\u0915\u0919\7\u0113\2\2\u0916\u0917"+
		"\7q\2\2\u0917\u0919\7H\2\2\u0918\u0914\3\2\2\2\u0918\u0916\3\2\2\2\u0919"+
		"\u018f\3\2\2\2\u091a\u091b\7\u0125\2\2\u091b\u091c\7q\2\2\u091c\u091d"+
		"\7\u0126\2\2\u091d\u0191\3\2\2\2\u091e\u091f\5\u0180\u00c1\2\u091f\u0920"+
		"\7\u0127\2\2\u0920\u0193\3\2\2\2\u0921\u0922\5\u0180\u00c1\2\u0922\u0923"+
		"\7\u00db\2\2\u0923\u0195\3\2\2\2\u0924\u0925\5\u0180\u00c1\2\u0925\u0926"+
		"\7\u00dc\2\2\u0926\u0197\3\2\2\2\u0927\u0928\7\u00c3\2\2\u0928\u0929\7"+
		"\u00c4\2\2\u0929\u092a\7\u0117\2\2\u092a\u0199\3\2\2\2\u092b\u092c\5\u0180"+
		"\u00c1\2\u092c\u092d\7>\2\2\u092d\u019b\3\2\2\2\u092e\u092f\5\u0180\u00c1"+
		"\2\u092f\u0930\7\u0128\2\2\u0930\u019d\3\2\2\2\u0931\u0933\7\63\2\2\u0932"+
		"\u0934\t\32\2\2\u0933\u0932\3\2\2\2\u0933\u0934\3\2\2\2\u0934\u0935\3"+
		"\2\2\2\u0935\u093c\7\u012a\2\2\u0936\u0937\7\u00bf\2\2\u0937\u0938\7q"+
		"\2\2\u0938\u093c\t\33\2\2\u0939\u093a\7\u0119\2\2\u093a\u093c\7\u012d"+
		"\2\2\u093b\u0931\3\2\2\2\u093b\u0936\3\2\2\2\u093b\u0939\3\2\2\2\u093c"+
		"\u019f\3\2\2\2\u093d\u093e\7\u0117\2\2\u093e\u093f\7C\2\2\u093f\u0940"+
		"\7\u011a\2\2\u0940\u01a1\3\2\2\2\u0941\u0942\5\u0180\u00c1\2\u0942\u0943"+
		"\7\u012e\2\2\u0943\u01a3\3\2\2\2\u0944\u0945\7\u012f\2\2\u0945\u01a5\3"+
		"\2\2\2\u0946\u0947\5\u0180\u00c1\2\u0947\u0948\7\u0130\2\2\u0948\u0949"+
		"\7I\2\2\u0949\u0956\3\2\2\2\u094a\u094c\7\u00e1\2\2\u094b\u094a\3\2\2"+
		"\2\u094b\u094c\3\2\2\2\u094c\u094d\3\2\2\2\u094d\u094e\7\u00c6\2\2\u094e"+
		"\u0956\7\u00c7\2\2\u094f\u0950\7`\2\2\u0950\u0951\7|\2\2\u0951\u0956\7"+
		"\u00c5\2\2\u0952\u0953\7\u00c3\2\2\u0953\u0954\7q\2\2\u0954\u0956\7<\2"+
		"\2\u0955\u0946\3\2\2\2\u0955\u094b\3\2\2\2\u0955\u094f\3\2\2\2\u0955\u0952"+
		"\3\2\2\2\u0956\u01a7\3\2\2\2\u0957\u095b\5\u0180\u00c1\2\u0958\u0959\7"+
		"\u0114\2\2\u0959\u095b\7q\2\2\u095a\u0957\3\2\2\2\u095a\u0958\3\2\2\2"+
		"\u095b\u095c\3\2\2\2\u095c\u095d\7\u00ee\2\2\u095d\u095e\7\u00ef\2\2\u095e"+
		"\u01a9\3\2\2\2\u095f\u0960\5\u0180\u00c1\2\u0960\u0961\7\u0131\2\2\u0961"+
		"\u01ab\3\2\2\2\u0962\u0963\5\u0180\u00c1\2\u0963\u0964\7\u0132\2\2\u0964"+
		"\u0965\7\u0133\2\2\u0965\u01ad\3\2\2\2\u0966\u0967\5\u0180\u00c1\2\u0967"+
		"\u0968\7\u0131\2\2\u0968\u0969\7\u0127\2\2\u0969\u01af\3\2\2\2\u096a\u096b"+
		"\5\u0180\u00c1\2\u096b\u096c\7\u0131\2\2\u096c\u096d\7\u0134\2\2\u096d"+
		"\u096e\7\u0135\2\2\u096e\u01b1\3\2\2\2\u096f\u0970\5\u0180\u00c1\2\u0970"+
		"\u0971\7\u0136\2\2\u0971\u01b3\3\2\2\2\u0972\u0973\5\u0180\u00c1\2\u0973"+
		"\u0974\7\u0137\2\2\u0974\u01b5\3\2\2\2\u0975\u0976\7\u0117\2\2\u0976\u0977"+
		"\7\u00a2\2\2\u0977\u0978\7\u011a\2\2\u0978\u0979\7\u011b\2\2\u0979\u01b7"+
		"\3\2\2\2\u097a\u097b\7\63\2\2\u097b\u097c\7\u0138\2\2\u097c\u0980\7\u0121"+
		"\2\2\u097d\u097e\7;\2\2\u097e\u0980\7\u0139\2\2\u097f\u097a\3\2\2\2\u097f"+
		"\u097d\3\2\2";
	private static final String _serializedATNSegment1 =
		"\2\u0980\u01b9\3\2\2\2\u0981\u0982\5\u0180\u00c1\2\u0982\u0983\7H\2\2"+
		"\u0983\u01bb\3\2\2\2\u0984\u0985\5\u0180\u00c1\2\u0985\u0986\7\u00f8\2"+
		"\2\u0986\u01bd\3\2\2\2\u0987\u098b\5\u0180\u00c1\2\u0988\u0989\78\2\2"+
		"\u0989\u098b\7q\2\2\u098a\u0987\3\2\2\2\u098a\u0988\3\2\2\2\u098b\u098c"+
		"\3\2\2\2\u098c\u098d\7\u00bc\2\2\u098d\u01bf\3\2\2\2\u098e\u098f\5\u0180"+
		"\u00c1\2\u098f\u0990\7}\2\2\u0990\u0991\7\u013a\2\2\u0991\u01c1\3\2\2"+
		"\2\u0992\u0993\5\u0180\u00c1\2\u0993\u0994\7\u00c9\2\2\u0994\u01c3\3\2"+
		"\2\2\u0995\u0996\t\34\2\2\u0996\u099b\7\u0113\2\2\u0997\u0998\7\64\2\2"+
		"\u0998\u0999\7\u00fe\2\2\u0999\u099b\7\u013c\2\2\u099a\u0995\3\2\2\2\u099a"+
		"\u0997\3\2\2\2\u099b\u01c5\3\2\2\2\u099c\u09a0\5\u0180\u00c1\2\u099d\u099e"+
		"\7\u00c0\2\2\u099e\u09a0\7q\2\2\u099f\u099c\3\2\2\2\u099f\u099d\3\2\2"+
		"\2\u09a0\u09a1\3\2\2\2\u09a1\u09a2\7\u00a2\2\2\u09a2\u09a3\7\u0107\2\2"+
		"\u09a3\u09a8\7\u00f8\2\2\u09a4\u09a5\7\u00cb\2\2\u09a5\u09a6\7q\2\2\u09a6"+
		"\u09a8\7\u00a2\2\2\u09a7\u099f\3\2\2\2\u09a7\u09a4\3\2\2\2\u09a8\u01c7"+
		"\3\2\2\2\u09a9\u09aa\5\u0180\u00c1\2\u09aa\u09ab\7\u013d\2\2\u09ab\u09b0"+
		"\3\2\2\2\u09ac\u09ad\7\65\2\2\u09ad\u09ae\7\u0112\2\2\u09ae\u09b0\7\u013d"+
		"\2\2\u09af\u09a9\3\2\2\2\u09af\u09ac\3\2\2\2\u09b0\u01c9\3\2\2\2\u09b1"+
		"\u09b5\5\u0180\u00c1\2\u09b2\u09b3\t\35\2\2\u09b3\u09b5\7q\2\2\u09b4\u09b1"+
		"\3\2\2\2\u09b4\u09b2\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b7\7<\2\2\u09b7"+
		"\u01cb\3\2\2\2\u09b8\u09bc\5\u0180\u00c1\2\u09b9\u09bc\7\u0119\2\2\u09ba"+
		"\u09bc\7\u013f\2\2\u09bb\u09b8\3\2\2\2\u09bb\u09b9\3\2\2\2\u09bb\u09ba"+
		"\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd\u09be\7\u0105\2\2\u09be\u01cd\3\2\2"+
		"\2\u09bf\u09c0\5\u0180\u00c1\2\u09c0\u09c1\7G\2\2\u09c1\u09c6\3\2\2\2"+
		"\u09c2\u09c3\7\u0117\2\2\u09c3\u09c4\7\u0121\2\2\u09c4\u09c6\7G\2\2\u09c5"+
		"\u09bf\3\2\2\2\u09c5\u09c2\3\2\2\2\u09c6\u01cf\3\2\2\2\u09c7\u09cb\5\u0180"+
		"\u00c1\2\u09c8\u09c9\7\u00c2\2\2\u09c9\u09cb\7q\2\2\u09ca\u09c7\3\2\2"+
		"\2\u09ca\u09c8\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09cd\7\u010a\2\2\u09cd"+
		"\u01d1\3\2\2\2\u09ce\u09cf\5\u0180\u00c1\2\u09cf\u09d0\7\u00bb\2\2\u09d0"+
		"\u01d3\3\2\2\2\u09d1\u09d5\5\u0180\u00c1\2\u09d2\u09d3\t\36\2\2\u09d3"+
		"\u09d5\7q\2\2\u09d4\u09d1\3\2\2\2\u09d4\u09d2\3\2\2\2\u09d5\u09d6\3\2"+
		"\2\2\u09d6\u09d7\7I\2\2\u09d7\u01d5\3\2\2\2\u09d8\u09d9\7\u0125\2\2\u09d9"+
		"\u0a05\7q\2\2\u09da\u09db\7\u0123\2\2\u09db\u0a05\7q\2\2\u09dc\u09dd\7"+
		"\u0140\2\2\u09dd\u0a05\7\u00bb\2\2\u09de\u09df\7\u0141\2\2\u09df\u0a05"+
		"\7\u0142\2\2\u09e0\u09e1\7\u0114\2\2\u09e1\u09e2\7q\2\2\u09e2\u0a05\7"+
		"<\2\2\u09e3\u09e4\7\u011e\2\2\u09e4\u09e5\7\u0143\2\2\u09e5\u0a05\7\u0120"+
		"\2\2\u09e6\u09e8\7\u00e0\2\2\u09e7\u09e9\7q\2\2\u09e8\u09e7\3\2\2\2\u09e8"+
		"\u09e9\3\2\2\2\u09e9\u09ea\3\2\2\2\u09ea\u0a05\7\u00ba\2\2\u09eb\u09ec"+
		"\78\2\2\u09ec\u09ee\7q\2\2\u09ed\u09ef\7\u011b\2\2\u09ee\u09ed\3\2\2\2"+
		"\u09ee\u09ef\3\2\2\2\u09ef\u09f0\3\2\2\2\u09f0\u0a05\7\u0144\2\2\u09f1"+
		"\u09f2\7\u00ca\2\2\u09f2\u09f3\7q\2\2\u09f3\u0a05\7\u00b5\2\2\u09f4\u09f5"+
		"\7\u00c8\2\2\u09f5\u09f6\7\u0085\2\2\u09f6\u0a05\7\u0086\2\2\u09f7\u09f8"+
		"\7\u00c8\2\2\u09f8\u0a05\7\u0147\2\2\u09f9\u09fa\7\u0145\2\2\u09fa\u0a05"+
		"\7\u014d\2\2\u09fb\u0a05\7\u0146\2\2\u09fc\u09fd\7/\2\2\u09fd\u09fe\7"+
		"q\2\2\u09fe\u0a05\t\37\2\2\u09ff\u0a05\7\u0148\2\2\u0a00\u0a05\7\u0149"+
		"\2\2\u0a01\u0a05\7\u014a\2\2\u0a02\u0a05\7\u014b\2\2\u0a03\u0a05\7\u014c"+
		"\2\2\u0a04\u09d8\3\2\2\2\u0a04\u09da\3\2\2\2\u0a04\u09dc\3\2\2\2\u0a04"+
		"\u09de\3\2\2\2\u0a04\u09e0\3\2\2\2\u0a04\u09e3\3\2\2\2\u0a04\u09e6\3\2"+
		"\2\2\u0a04\u09eb\3\2\2\2\u0a04\u09f1\3\2\2\2\u0a04\u09f4\3\2\2\2\u0a04"+
		"\u09f7\3\2\2\2\u0a04\u09f9\3\2\2\2\u0a04\u09fb\3\2\2\2\u0a04\u09fc\3\2"+
		"\2\2\u0a04\u09ff\3\2\2\2\u0a04\u0a00\3\2\2\2\u0a04\u0a01\3\2\2\2\u0a04"+
		"\u0a02\3\2\2\2\u0a04\u0a03\3\2\2\2\u0a05\u01d7\3\2\2\2\u0a06\u0a07\7\63"+
		"\2\2\u0a07\u0a08\7\u00bb\2\2\u0a08\u01d9\3\2\2\2\u0a09\u0a0a\7\65\2\2"+
		"\u0a0a\u0a0b\7\u00bb\2\2\u0a0b\u01db\3\2\2\2\u0a0c\u0a0d\7\64\2\2\u0a0d"+
		"\u0a0e\7\u00bb\2\2\u0a0e\u01dd\3\2\2\2\u0a0f\u0a10\7\63\2\2\u0a10\u0a11"+
		"\7\u00bc\2\2\u0a11\u01df\3\2\2\2\u0a12\u0a13\7\65\2\2\u0a13\u0a14\7\u00bc"+
		"\2\2\u0a14\u01e1\3\2\2\2\u0a15\u0a16\7\64\2\2\u0a16\u0a17\7\u00bc\2\2"+
		"\u0a17\u01e3\3\2\2\2\u0a18\u0a19\7\u009c\2\2\u0a19\u01e5\3\2\2\2\u0126"+
		"\u01fe\u0201\u0207\u020a\u020e\u0211\u0219\u021d\u0223\u0228\u0236\u023f"+
		"\u0246\u024a\u024e\u0252\u0255\u025a\u025d\u0261\u0264\u0267\u0272\u0276"+
		"\u027b\u027f\u0287\u028c\u0291\u0295\u0298\u029b\u029e\u02a1\u02a7\u02ad"+
		"\u02b2\u02b5\u02b8\u02bb\u02bf\u02ce\u02d6\u02dc\u02df\u02e3\u02e6\u02ea"+
		"\u02f0\u02f3\u02f6\u02fc\u02ff\u0303\u0308\u030a\u0310\u031c\u0326\u0329"+
		"\u0334\u0339\u0344\u0350\u0359\u0360\u0369\u0370\u0374\u0377\u037e\u0382"+
		"\u038b\u038f\u0397\u0399\u039e\u03a7\u03b7\u03bf\u03cc\u03db\u03dd\u03e4"+
		"\u03eb\u03f4\u03fb\u0404\u040a\u040d\u0430\u0432\u043d\u0445\u044b\u0455"+
		"\u045c\u0462\u0467\u046e\u0472\u047c\u048c\u0491\u049c\u04a0\u04a9\u04ad"+
		"\u04b2\u04b5\u04c6\u04cc\u04cf\u04da\u04df\u04e6\u04ef\u04f4\u04f8\u0503"+
		"\u050b\u050f\u0511\u0516\u051a\u051e\u0527\u0529\u0530\u053a\u053f\u0542"+
		"\u054a\u055d\u0564\u056a\u056e\u0575\u057d\u0582\u0585\u0592\u05bc\u05cb"+
		"\u05d1\u05d8\u05df\u05e4\u05eb\u05ef\u05f4\u05f7\u05fa\u05ff\u0607\u0609"+
		"\u0610\u0615\u0617\u061a\u0621\u0633\u0637\u063c\u063f\u0642\u0645\u0649"+
		"\u064c\u0657\u065c\u0662\u0669\u066b\u0677\u067a\u0689\u0696\u069c\u069f"+
		"\u06a3\u06a7\u06ae\u06b3\u06b8\u06c9\u06ce\u06e2\u06eb\u06ee\u06f1\u06f5"+
		"\u06ff\u0706\u0709\u0718\u071f\u0723\u0727\u072b\u0730\u0734\u073b\u0740"+
		"\u0749\u074c\u0751\u0756\u075e\u0764\u0768\u076d\u0776\u077b\u077f\u0785"+
		"\u078b\u078f\u0796\u079a\u079d\u07a1\u07a5\u07aa\u07af\u07b5\u07bc\u07c4"+
		"\u07c8\u07cf\u07d3\u07dd\u07e2\u07e7\u07f8\u07fa\u0800\u0803\u080a\u080d"+
		"\u0814\u0819\u0823\u0827\u082c\u082e\u0833\u0835\u083c\u0841\u0845\u084a"+
		"\u084e\u0850\u0854\u0859\u0868\u086e\u087a\u087f\u0883\u0888\u08a6\u08b4"+
		"\u08e3\u08e7\u08ea\u08f1\u08f8\u08fa\u090a\u090e\u0918\u0933\u093b\u094b"+
		"\u0955\u095a\u097f\u098a\u099a\u099f\u09a7\u09af\u09b4\u09bb\u09c5\u09ca"+
		"\u09d4\u09e8\u09ee\u0a04";
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