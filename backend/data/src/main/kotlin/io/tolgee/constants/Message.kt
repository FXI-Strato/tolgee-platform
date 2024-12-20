/*
 * Copyright (c) 2020. Tolgee
 */
package io.tolgee.constants

import com.fasterxml.jackson.annotation.JsonValue
import java.util.*

enum class Message {
  UNAUTHENTICATED,
  API_ACCESS_FORBIDDEN,
  API_KEY_NOT_FOUND,
  INVALID_API_KEY,
  INVALID_PROJECT_API_KEY,
  PROJECT_API_KEY_EXPIRED,
  BAD_CREDENTIALS,
  MFA_ENABLED,
  INVALID_OTP_CODE,
  MFA_NOT_ENABLED,
  CAN_NOT_REVOKE_OWN_PERMISSIONS,
  DATA_CORRUPTED,
  INVITATION_CODE_DOES_NOT_EXIST_OR_EXPIRED,
  LANGUAGE_TAG_EXISTS,
  LANGUAGE_NAME_EXISTS,
  LANGUAGE_NOT_FOUND,
  OPERATION_NOT_PERMITTED,
  REGISTRATIONS_NOT_ALLOWED,
  PROJECT_NOT_FOUND,
  RESOURCE_NOT_FOUND,
  SCOPE_NOT_FOUND,
  KEY_EXISTS,
  THIRD_PARTY_AUTH_ERROR_MESSAGE,
  THIRD_PARTY_AUTH_NO_EMAIL,
  THIRD_PARTY_AUTH_NO_SUB,
  THIRD_PARTY_AUTH_UNKNOWN_ERROR,
  EMAIL_ALREADY_VERIFIED,
  THIRD_PARTY_UNAUTHORIZED,
  THIRD_PARTY_GOOGLE_WORKSPACE_MISMATCH,
  USERNAME_ALREADY_EXISTS,
  USERNAME_OR_PASSWORD_INVALID,
  USER_ALREADY_HAS_PERMISSIONS,
  USER_ALREADY_HAS_ROLE,
  USER_NOT_FOUND,
  FILE_NOT_IMAGE,
  FILE_TOO_BIG,
  INVALID_TIMESTAMP,
  EMAIL_NOT_VERIFIED,
  MISSING_CALLBACK_URL,
  INVALID_JWT_TOKEN,
  EXPIRED_JWT_TOKEN,
  GENERAL_JWT_ERROR,
  CANNOT_FIND_SUITABLE_ADDRESS_PART,
  ADDRESS_PART_NOT_UNIQUE,
  USER_IS_NOT_MEMBER_OF_ORGANIZATION,
  ORGANIZATION_HAS_NO_OTHER_OWNER,
  USER_HAS_NO_PROJECT_ACCESS,
  USER_IS_ORGANIZATION_OWNER,
  CANNOT_SET_YOUR_OWN_PERMISSIONS,
  USER_IS_ORGANIZATION_MEMBER,
  PROPERTY_NOT_MUTABLE,
  IMPORT_LANGUAGE_NOT_FROM_PROJECT,
  EXISTING_LANGUAGE_NOT_SELECTED,
  CONFLICT_IS_NOT_RESOLVED,
  LANGUAGE_ALREADY_SELECTED,
  CANNOT_PARSE_FILE,
  COULD_NOT_RESOLVE_PROPERTY,
  CANNOT_ADD_MORE_THEN_100_LANGUAGES,
  NO_LANGUAGES_PROVIDED,
  LANGUAGE_WITH_BASE_LANGUAGE_TAG_NOT_FOUND,
  LANGUAGE_NOT_FROM_PROJECT,
  NAMESPACE_NOT_FROM_PROJECT,
  CANNOT_DELETE_BASE_LANGUAGE,
  KEY_NOT_FROM_PROJECT,
  MAX_SCREENSHOTS_EXCEEDED,
  TRANSLATION_NOT_FROM_PROJECT,
  CAN_EDIT_ONLY_OWN_COMMENT,
  REQUEST_PARSE_ERROR,
  FILTER_BY_VALUE_STATE_NOT_VALID,
  IMPORT_HAS_EXPIRED,
  TAG_NOT_FROM_PROJECT,
  TRANSLATION_TEXT_TOO_LONG,
  INVALID_RECAPTCHA_TOKEN,
  CANNOT_LEAVE_OWNING_PROJECT,
  CANNOT_LEAVE_PROJECT_WITH_ORGANIZATION_ROLE,
  DONT_HAVE_DIRECT_PERMISSIONS,
  TAG_TOO_LOG,
  TOO_MANY_UPLOADED_IMAGES,
  ONE_OR_MORE_IMAGES_NOT_FOUND,
  SCREENSHOT_NOT_OF_KEY,
  SERVICE_NOT_FOUND,
  TOO_MANY_REQUESTS,
  TRANSLATION_NOT_FOUND,
  OUT_OF_CREDITS,
  KEY_NOT_FOUND,
  ORGANIZATION_NOT_FOUND,
  CANNOT_FIND_BASE_LANGUAGE,
  BASE_LANGUAGE_NOT_FOUND,
  NO_EXPORTED_RESULT,
  CANNOT_SET_YOUR_OWN_ROLE,
  ONLY_TRANSLATE_REVIEW_OR_VIEW_PERMISSION_ACCEPTS_VIEW_LANGUAGES,
  OAUTH2_TOKEN_URL_NOT_SET,
  OAUTH2_USER_URL_NOT_SET,
  EMAIL_ALREADY_INVITED_OR_MEMBER,
  PRICE_NOT_FOUND,
  INVOICE_NOT_FROM_ORGANIZATION,
  INVOICE_NOT_FOUND,
  PLAN_NOT_FOUND,
  PLAN_NOT_AVAILABLE_ANY_MORE,
  NO_AUTO_TRANSLATION_METHOD,
  CANNOT_TRANSLATE_BASE_LANGUAGE,
  PAT_NOT_FOUND,
  INVALID_PAT,
  PAT_EXPIRED,
  OPERATION_UNAVAILABLE_FOR_ACCOUNT_TYPE,
  VALIDATION_EMAIL_IS_NOT_VALID,
  CURRENT_PASSWORD_REQUIRED,
  CANNOT_CREATE_ORGANIZATION,
  WRONG_CURRENT_PASSWORD,
  WRONG_PARAM_TYPE,
  EXPIRED_SUPER_JWT_TOKEN,
  CANNOT_DELETE_YOUR_OWN_ACCOUNT,
  CANNOT_SORT_BY_THIS_COLUMN,
  NAMESPACE_NOT_FOUND,
  NAMESPACE_EXISTS,
  INVALID_AUTHENTICATION_METHOD,
  UNKNOWN_SORT_PROPERTY,
  ONLY_REVIEW_PERMISSION_ACCEPTS_STATE_CHANGE_LANGUAGES,
  ONLY_TRANSLATE_OR_REVIEW_PERMISSION_ACCEPTS_TRANSLATE_LANGUAGES,
  CANNOT_SET_LANGUAGE_PERMISSIONS_FOR_ADMIN_SCOPE,
  CANNOT_SET_VIEW_LANGUAGES_WITHOUT_TRANSLATIONS_VIEW_SCOPE,
  CANNOT_SET_TRANSLATE_LANGUAGES_WITHOUT_TRANSLATIONS_EDIT_SCOPE,
  CANNOT_SET_STATE_CHANGE_LANGUAGES_WITHOUT_TRANSLATIONS_STATE_EDIT_SCOPE,
  LANGUAGE_NOT_PERMITTED,
  SCOPES_HAS_TO_BE_SET,
  SET_EXACTLY_ONE_OF_SCOPES_OR_TYPE,
  TRANSLATION_EXISTS,
  IMPORT_KEYS_ERROR,
  PROVIDE_ONLY_ONE_OF_SCREENSHOTS_AND_SCREENSHOT_UPLOADED_IMAGE_IDS,
  MULTIPLE_PROJECTS_NOT_SUPPORTED,
  PLAN_TRANSLATION_LIMIT_EXCEEDED,
  FEATURE_NOT_ENABLED,
  LICENSE_KEY_NOT_FOUND,
  CANNOT_SET_VIEW_LANGUAGES_WITHOUT_FOR_LEVEL_BASED_PERMISSIONS,
  CANNOT_SET_DIFFERENT_TRANSLATE_AND_STATE_CHANGE_LANGUAGES_FOR_LEVEL_BASED_PERMISSIONS,
  CANNOT_DISABLE_YOUR_OWN_ACCOUNT,
  SUBSCRIPTION_NOT_FOUND,
  INVOICE_DOES_NOT_HAVE_USAGE,
  CUSTOMER_NOT_FOUND,
  SUBSCRIPTION_NOT_ACTIVE,
  ORGANIZATION_ALREADY_SUBSCRIBED,
  ORGANIZATION_NOT_SUBSCRIBED,
  LICENSE_KEY_USED_BY_ANOTHER_INSTANCE,
  TRANSLATION_SPENDING_LIMIT_EXCEEDED,
  CREDIT_SPENDING_LIMIT_EXCEEDED,
  SEATS_SPENDING_LIMIT_EXCEEDED,
  THIS_INSTANCE_IS_ALREADY_LICENSED,
  BIG_META_NOT_FROM_PROJECT,
  MT_SERVICE_NOT_ENABLED,
  PROJECT_NOT_SELECTED,
  ORGANIZATION_NOT_SELECTED,
  PLAN_HAS_SUBSCRIBERS,
  TRANSLATION_FAILED,
  BATCH_JOB_NOT_FOUND,
  KEY_EXISTS_IN_NAMESPACE,
  TAG_IS_BLANK,
  EXECUTION_FAILED_ON_MANAGEMENT_ERROR,
  TRANSLATION_API_RATE_LIMIT,
  CANNOT_FINALIZE_ACTIVITY,
  FORMALITY_NOT_SUPPORTED_BY_SERVICE,
  LANGUAGE_NOT_SUPPORTED_BY_SERVICE,
  RATE_LIMITED,
  PAT_ACCESS_NOT_ALLOWED,
  PAK_ACCESS_NOT_ALLOWED,
  CANNOT_MODIFY_DISABLED_TRANSLATION,
  AZURE_CONFIG_REQUIRED,
  S3_CONFIG_REQUIRED,
  CONTENT_STORAGE_CONFIG_REQUIRED,
  CONTENT_STORAGE_TEST_FAILED,
  CONTENT_STORAGE_CONFIG_INVALID,
  INVALID_CONNECTION_STRING,
  CANNOT_CREATE_AZURE_STORAGE_CLIENT,
  S3_ACCESS_KEY_REQUIRED,
  AZURE_CONNECTION_STRING_REQUIRED,
  S3_SECRET_KEY_REQUIRED,
  CANNOT_STORE_FILE_TO_CONTENT_STORAGE,
  UNEXPECTED_ERROR_WHILE_PUBLISHING_TO_CONTENT_STORAGE,
  WEBHOOK_RESPONDED_WITH_NON_200_STATUS,
  UNEXPECTED_ERROR_WHILE_EXECUTING_WEBHOOK,
  CONTENT_STORAGE_IS_IN_USE,
  CANNOT_SET_STATE_FOR_MISSING_TRANSLATION,
  NO_PROJECT_ID_PROVIDED,
  LICENSE_KEY_NOT_PROVIDED,
  SUBSCRIPTION_ALREADY_CANCELED,
  USER_IS_SUBSCRIBED_TO_PAID_PLAN,
  CANNOT_CREATE_FREE_PLAN_WITHOUT_FIXED_TYPE,
  CANNOT_MODIFY_PLAN_FREE_STATUS,
  KEY_ID_NOT_PROVIDED,
  FREE_SELF_HOSTED_SEAT_LIMIT_EXCEEDED,
  ADVANCED_PARAMS_NOT_SUPPORTED,
  PLURAL_FORMS_NOT_FOUND_FOR_LANGUAGE,
  NESTED_PLURALS_NOT_SUPPORTED,
  MESSAGE_IS_NOT_PLURAL,
  CONTENT_OUTSIDE_PLURAL_FORMS,
  INVALID_PLURAL_FORM,
  MULTIPLE_PLURALS_NOT_SUPPORTED,
  CUSTOM_VALUES_JSON_TOO_LONG,
  UNSUPPORTED_PO_MESSAGE_FORMAT,
  PLURAL_FORMS_DATA_LOSS,
  CURRENT_USER_DOES_NOT_OWN_IMAGE,
  USER_CANNOT_VIEW_THIS_ORGANIZATION,
  USER_IS_NOT_OWNER_OF_ORGANIZATION,
  PAK_CREATED_FOR_DIFFERENT_PROJECT,
  CUSTOM_SLUG_IS_ONLY_APPLICABLE_FOR_CUSTOM_STORAGE,
  INVALID_SLUG_FORMAT,
  BATCH_JOB_CANCELLATION_TIMEOUT,
  IMPORT_FAILED,
  CANNOT_ADD_MORE_THEN_1000_LANGUAGES,
  NO_DATA_TO_IMPORT,
  MULTIPLE_NAMESPACES_MAPPED_TO_SINGLE_FILE,
  MULTIPLE_MAPPINGS_FOR_SAME_FILE_LANGUAGE_NAME,
  MULTIPLE_MAPPINGS_FOR_NULL_FILE_LANGUAGE_NAME,
  TOO_MANY_MAPPINGS_FOR_FILE,
  MISSING_PLACEHOLDER_IN_TEMPLATE,
  TAG_NOT_FOUND,
  CANNOT_PARSE_ENCRYPTED_SLACK_LOGIN_DATA,
  SLACK_WORKSPACE_NOT_FOUND,
  CANNOT_FETCH_USER_DETAILS_FROM_SLACK,
  SLACK_MISSING_SCOPE,
  SLACK_NOT_CONNECTED_TO_YOUR_ACCOUNT,
  SLACK_INVALID_COMMAND,
  SLACK_NOT_SUBSCRIBED_YET,
  SLACK_CONNECTION_FAILED,
  TOLGEE_ACCOUNT_ALREADY_CONNECTED,
  SLACK_NOT_CONFIGURED,
  SLACK_WORKSPACE_ALREADY_CONNECTED,
  SLACK_CONNECTION_ERROR,
  EMAIL_VERIFICATION_CODE_NOT_VALID,
  CANNOT_SUBSCRIBE_TO_FREE_PLAN,
  PLAN_AUTO_ASSIGNMENT_ONLY_FOR_FREE_PLANS,
  PLAN_AUTO_ASSIGNMENT_ONLY_FOR_PRIVATE_PLANS,
  PLAN_AUTO_ASSIGNMENT_ORGANIZATION_IDS_NOT_IN_FOR_ORGANIZATION_IDS,
  TASK_NOT_FOUND,
  TASK_NOT_FINISHED,
  TASK_NOT_OPEN,
  TRANSLATION_AGENCY_NOT_FOUND,
  THIS_FEATURE_IS_NOT_IMPLEMENTED_IN_OSS,
  SSO_TOKEN_EXCHANGE_FAILED,
  SSO_USER_INFO_RETRIEVAL_FAILED,
  SSO_ID_TOKEN_EXPIRED,
  SSO_USER_CANNOT_CREATE_ORGANIZATION,
  SSO_CANT_VERIFY_USER,
  SSO_AUTH_MISSING_DOMAIN,
  SSO_DOMAIN_NOT_FOUND_OR_DISABLED,
  NATIVE_AUTHENTICATION_DISABLED,
  INVITATION_ORGANIZATION_MISMATCH,
  USER_IS_MANAGED_BY_ORGANIZATION,
  CANNOT_SET_SSO_PROVIDER_MISSING_FIELDS,
  NAMESPACES_CANNOT_BE_DISABLED_WHEN_NAMESPACE_EXISTS,
  NAMESPACE_CANNOT_BE_USED_WHEN_FEATURE_IS_DISABLED,
  ;

  val code: String
    get() = name.lowercase(Locale.getDefault())

  @JsonValue
  fun toLowerCase() = name.lowercase(Locale.getDefault())
}
