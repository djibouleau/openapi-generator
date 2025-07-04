package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import org.openapitools.client.model.Client;
import java.io.File;
import org.openapitools.client.model.FileSchemaTestClass;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.User;
import org.openapitools.client.model.XmlItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class FakeApi {
  private ApiClient apiClient;

  public FakeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FakeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * creates an XmlItem
   * this route creates an XmlItem
   * @param xmlItem XmlItem Body (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public void createXmlItem(@javax.annotation.Nonnull XmlItem xmlItem) throws ApiException {
    createXmlItemWithHttpInfo(xmlItem);
  }

  /**
   * creates an XmlItem
   * this route creates an XmlItem
   * @param xmlItem XmlItem Body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> createXmlItemWithHttpInfo(@javax.annotation.Nonnull XmlItem xmlItem) throws ApiException {
    // Check required parameters
    if (xmlItem == null) {
      throw new ApiException(400, "Missing the required parameter 'xmlItem' when calling createXmlItem");
    }

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/xml", "application/xml; charset=utf-8", "application/xml; charset=utf-16", "text/xml", "text/xml; charset=utf-8", "text/xml; charset=utf-16");
    return apiClient.invokeAPI("FakeApi.createXmlItem", "/fake/create_xml_item", "POST", new ArrayList<>(), xmlItem,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * Test serialization of outer boolean types
   * @param body Input boolean as post body (optional)
   * @return Boolean
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Output boolean </td><td>  -  </td></tr>
     </table>
   */
  public Boolean fakeOuterBooleanSerialize(@javax.annotation.Nullable Boolean body) throws ApiException {
    return fakeOuterBooleanSerializeWithHttpInfo(body).getData();
  }

  /**
   * 
   * Test serialization of outer boolean types
   * @param body Input boolean as post body (optional)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Output boolean </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Boolean> fakeOuterBooleanSerializeWithHttpInfo(@javax.annotation.Nullable Boolean body) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};
    return apiClient.invokeAPI("FakeApi.fakeOuterBooleanSerialize", "/fake/outer/boolean", "POST", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * Test serialization of object with outer number type
   * @param body Input composite as post body (optional)
   * @return OuterComposite
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Output composite </td><td>  -  </td></tr>
     </table>
   */
  public OuterComposite fakeOuterCompositeSerialize(@javax.annotation.Nullable OuterComposite body) throws ApiException {
    return fakeOuterCompositeSerializeWithHttpInfo(body).getData();
  }

  /**
   * 
   * Test serialization of object with outer number type
   * @param body Input composite as post body (optional)
   * @return ApiResponse&lt;OuterComposite&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Output composite </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OuterComposite> fakeOuterCompositeSerializeWithHttpInfo(@javax.annotation.Nullable OuterComposite body) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<OuterComposite> localVarReturnType = new GenericType<OuterComposite>() {};
    return apiClient.invokeAPI("FakeApi.fakeOuterCompositeSerialize", "/fake/outer/composite", "POST", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * Test serialization of outer number types
   * @param body Input number as post body (optional)
   * @return BigDecimal
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Output number </td><td>  -  </td></tr>
     </table>
   */
  public BigDecimal fakeOuterNumberSerialize(@javax.annotation.Nullable BigDecimal body) throws ApiException {
    return fakeOuterNumberSerializeWithHttpInfo(body).getData();
  }

  /**
   * 
   * Test serialization of outer number types
   * @param body Input number as post body (optional)
   * @return ApiResponse&lt;BigDecimal&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Output number </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BigDecimal> fakeOuterNumberSerializeWithHttpInfo(@javax.annotation.Nullable BigDecimal body) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<BigDecimal> localVarReturnType = new GenericType<BigDecimal>() {};
    return apiClient.invokeAPI("FakeApi.fakeOuterNumberSerialize", "/fake/outer/number", "POST", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * Test serialization of outer string types
   * @param body Input string as post body (optional)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Output string </td><td>  -  </td></tr>
     </table>
   */
  public String fakeOuterStringSerialize(@javax.annotation.Nullable String body) throws ApiException {
    return fakeOuterStringSerializeWithHttpInfo(body).getData();
  }

  /**
   * 
   * Test serialization of outer string types
   * @param body Input string as post body (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Output string </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> fakeOuterStringSerializeWithHttpInfo(@javax.annotation.Nullable String body) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("FakeApi.fakeOuterStringSerialize", "/fake/outer/string", "POST", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * 
   * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
   * @param body  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void testBodyWithFileSchema(@javax.annotation.Nonnull FileSchemaTestClass body) throws ApiException {
    testBodyWithFileSchemaWithHttpInfo(body);
  }

  /**
   * 
   * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
   * @param body  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> testBodyWithFileSchemaWithHttpInfo(@javax.annotation.Nonnull FileSchemaTestClass body) throws ApiException {
    // Check required parameters
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling testBodyWithFileSchema");
    }

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("FakeApi.testBodyWithFileSchema", "/fake/body-with-file-schema", "PUT", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * 
   * @param query  (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void testBodyWithQueryParams(@javax.annotation.Nonnull String query, @javax.annotation.Nonnull User body) throws ApiException {
    testBodyWithQueryParamsWithHttpInfo(query, body);
  }

  /**
   * 
   * 
   * @param query  (required)
   * @param body  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> testBodyWithQueryParamsWithHttpInfo(@javax.annotation.Nonnull String query, @javax.annotation.Nonnull User body) throws ApiException {
    // Check required parameters
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling testBodyWithQueryParams");
    }
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling testBodyWithQueryParams");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "query", query)
    );

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("FakeApi.testBodyWithQueryParams", "/fake/body-with-query-params", "PUT", localVarQueryParams, body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * To test \&quot;client\&quot; model
   * To test \&quot;client\&quot; model
   * @param body client model (required)
   * @return Client
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public Client testClientModel(@javax.annotation.Nonnull Client body) throws ApiException {
    return testClientModelWithHttpInfo(body).getData();
  }

  /**
   * To test \&quot;client\&quot; model
   * To test \&quot;client\&quot; model
   * @param body client model (required)
   * @return ApiResponse&lt;Client&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Client> testClientModelWithHttpInfo(@javax.annotation.Nonnull Client body) throws ApiException {
    // Check required parameters
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling testClientModel");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Client> localVarReturnType = new GenericType<Client>() {};
    return apiClient.invokeAPI("FakeApi.testClientModel", "/fake", "PATCH", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
   * Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
   * @param number None (required)
   * @param _double None (required)
   * @param patternWithoutDelimiter None (required)
   * @param _byte None (required)
   * @param integer None (optional)
   * @param int32 None (optional)
   * @param int64 None (optional)
   * @param _float None (optional)
   * @param string None (optional)
   * @param binary None (optional)
   * @param date None (optional)
   * @param dateTime None (optional)
   * @param password None (optional)
   * @param paramCallback None (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Invalid username supplied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
   */
  public void testEndpointParameters(@javax.annotation.Nonnull BigDecimal number, @javax.annotation.Nonnull Double _double, @javax.annotation.Nonnull String patternWithoutDelimiter, @javax.annotation.Nonnull byte[] _byte, @javax.annotation.Nullable Integer integer, @javax.annotation.Nullable Integer int32, @javax.annotation.Nullable Long int64, @javax.annotation.Nullable Float _float, @javax.annotation.Nullable String string, @javax.annotation.Nullable File binary, @javax.annotation.Nullable LocalDate date, @javax.annotation.Nullable LocalDateTime dateTime, @javax.annotation.Nullable String password, @javax.annotation.Nullable String paramCallback) throws ApiException {
    testEndpointParametersWithHttpInfo(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback);
  }

  /**
   * Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
   * Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
   * @param number None (required)
   * @param _double None (required)
   * @param patternWithoutDelimiter None (required)
   * @param _byte None (required)
   * @param integer None (optional)
   * @param int32 None (optional)
   * @param int64 None (optional)
   * @param _float None (optional)
   * @param string None (optional)
   * @param binary None (optional)
   * @param date None (optional)
   * @param dateTime None (optional)
   * @param password None (optional)
   * @param paramCallback None (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Invalid username supplied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> testEndpointParametersWithHttpInfo(@javax.annotation.Nonnull BigDecimal number, @javax.annotation.Nonnull Double _double, @javax.annotation.Nonnull String patternWithoutDelimiter, @javax.annotation.Nonnull byte[] _byte, @javax.annotation.Nullable Integer integer, @javax.annotation.Nullable Integer int32, @javax.annotation.Nullable Long int64, @javax.annotation.Nullable Float _float, @javax.annotation.Nullable String string, @javax.annotation.Nullable File binary, @javax.annotation.Nullable LocalDate date, @javax.annotation.Nullable LocalDateTime dateTime, @javax.annotation.Nullable String password, @javax.annotation.Nullable String paramCallback) throws ApiException {
    // Check required parameters
    if (number == null) {
      throw new ApiException(400, "Missing the required parameter 'number' when calling testEndpointParameters");
    }
    if (_double == null) {
      throw new ApiException(400, "Missing the required parameter '_double' when calling testEndpointParameters");
    }
    if (patternWithoutDelimiter == null) {
      throw new ApiException(400, "Missing the required parameter 'patternWithoutDelimiter' when calling testEndpointParameters");
    }
    if (_byte == null) {
      throw new ApiException(400, "Missing the required parameter '_byte' when calling testEndpointParameters");
    }

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (integer != null) {
      localVarFormParams.put("integer", integer);
    }
    if (int32 != null) {
      localVarFormParams.put("int32", int32);
    }
    if (int64 != null) {
      localVarFormParams.put("int64", int64);
    }
    localVarFormParams.put("number", number);
    if (_float != null) {
      localVarFormParams.put("float", _float);
    }
    localVarFormParams.put("double", _double);
    if (string != null) {
      localVarFormParams.put("string", string);
    }
    localVarFormParams.put("pattern_without_delimiter", patternWithoutDelimiter);
    localVarFormParams.put("byte", _byte);
    if (binary != null) {
      localVarFormParams.put("binary", binary);
    }
    if (date != null) {
      localVarFormParams.put("date", date);
    }
    if (dateTime != null) {
      localVarFormParams.put("dateTime", dateTime);
    }
    if (password != null) {
      localVarFormParams.put("password", password);
    }
    if (paramCallback != null) {
      localVarFormParams.put("callback", paramCallback);
    }

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/x-www-form-urlencoded");
    String[] localVarAuthNames = new String[] {"http_basic_test"};
    return apiClient.invokeAPI("FakeApi.testEndpointParameters", "/fake", "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * To test enum parameters
   * To test enum parameters
   * @param enumHeaderStringArray Header parameter enum test (string array) (optional)
   * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
   * @param enumQueryStringArray Query parameter enum test (string array) (optional)
   * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
   * @param enumQueryInteger Query parameter enum test (double) (optional)
   * @param enumQueryDouble Query parameter enum test (double) (optional)
   * @param enumFormStringArray Form parameter enum test (string array) (optional, default to $)
   * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public void testEnumParameters(@javax.annotation.Nullable List<String> enumHeaderStringArray, @javax.annotation.Nullable String enumHeaderString, @javax.annotation.Nullable List<String> enumQueryStringArray, @javax.annotation.Nullable String enumQueryString, @javax.annotation.Nullable Integer enumQueryInteger, @javax.annotation.Nullable Double enumQueryDouble, @javax.annotation.Nullable List<String> enumFormStringArray, @javax.annotation.Nullable String enumFormString) throws ApiException {
    testEnumParametersWithHttpInfo(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumFormStringArray, enumFormString);
  }

  /**
   * To test enum parameters
   * To test enum parameters
   * @param enumHeaderStringArray Header parameter enum test (string array) (optional)
   * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
   * @param enumQueryStringArray Query parameter enum test (string array) (optional)
   * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
   * @param enumQueryInteger Query parameter enum test (double) (optional)
   * @param enumQueryDouble Query parameter enum test (double) (optional)
   * @param enumFormStringArray Form parameter enum test (string array) (optional, default to $)
   * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> testEnumParametersWithHttpInfo(@javax.annotation.Nullable List<String> enumHeaderStringArray, @javax.annotation.Nullable String enumHeaderString, @javax.annotation.Nullable List<String> enumQueryStringArray, @javax.annotation.Nullable String enumQueryString, @javax.annotation.Nullable Integer enumQueryInteger, @javax.annotation.Nullable Double enumQueryDouble, @javax.annotation.Nullable List<String> enumFormStringArray, @javax.annotation.Nullable String enumFormString) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "enum_query_string_array", enumQueryStringArray)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enum_query_string", enumQueryString));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enum_query_integer", enumQueryInteger));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enum_query_double", enumQueryDouble));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (enumHeaderStringArray != null) {
      localVarHeaderParams.put("enum_header_string_array", apiClient.parameterToString(enumHeaderStringArray));
    }
    if (enumHeaderString != null) {
      localVarHeaderParams.put("enum_header_string", apiClient.parameterToString(enumHeaderString));
    }

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (enumFormStringArray != null) {
      localVarFormParams.put("enum_form_string_array", enumFormStringArray);
    }
    if (enumFormString != null) {
      localVarFormParams.put("enum_form_string", enumFormString);
    }

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/x-www-form-urlencoded");
    return apiClient.invokeAPI("FakeApi.testEnumParameters", "/fake", "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               null, null, false);
  }

private ApiResponse<Void> testGroupParametersWithHttpInfo(@javax.annotation.Nonnull Integer requiredStringGroup, @javax.annotation.Nonnull Boolean requiredBooleanGroup, @javax.annotation.Nonnull Long requiredInt64Group, @javax.annotation.Nullable Integer stringGroup, @javax.annotation.Nullable Boolean booleanGroup, @javax.annotation.Nullable Long int64Group) throws ApiException {
    // Check required parameters
    if (requiredStringGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'requiredStringGroup' when calling testGroupParameters");
    }
    if (requiredBooleanGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'requiredBooleanGroup' when calling testGroupParameters");
    }
    if (requiredInt64Group == null) {
      throw new ApiException(400, "Missing the required parameter 'requiredInt64Group' when calling testGroupParameters");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "required_string_group", requiredStringGroup)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "required_int64_group", requiredInt64Group));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "string_group", stringGroup));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "int64_group", int64Group));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    localVarHeaderParams.put("required_boolean_group", apiClient.parameterToString(requiredBooleanGroup));
    if (booleanGroup != null) {
      localVarHeaderParams.put("boolean_group", apiClient.parameterToString(booleanGroup));
    }

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("FakeApi.testGroupParameters", "/fake", "DELETE", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }

  public class APItestGroupParametersRequest {
    @javax.annotation.Nonnull
    private Integer requiredStringGroup;
    @javax.annotation.Nonnull
    private Boolean requiredBooleanGroup;
    @javax.annotation.Nonnull
    private Long requiredInt64Group;
    @javax.annotation.Nullable
    private Integer stringGroup;
    @javax.annotation.Nullable
    private Boolean booleanGroup;
    @javax.annotation.Nullable
    private Long int64Group;

    private APItestGroupParametersRequest() {
    }

    /**
     * Set requiredStringGroup
     * @param requiredStringGroup Required String in group parameters (required)
     * @return APItestGroupParametersRequest
     */
    public APItestGroupParametersRequest requiredStringGroup(@javax.annotation.Nonnull Integer requiredStringGroup) {
      this.requiredStringGroup = requiredStringGroup;
      return this;
    }

    /**
     * Set requiredBooleanGroup
     * @param requiredBooleanGroup Required Boolean in group parameters (required)
     * @return APItestGroupParametersRequest
     */
    public APItestGroupParametersRequest requiredBooleanGroup(@javax.annotation.Nonnull Boolean requiredBooleanGroup) {
      this.requiredBooleanGroup = requiredBooleanGroup;
      return this;
    }

    /**
     * Set requiredInt64Group
     * @param requiredInt64Group Required Integer in group parameters (required)
     * @return APItestGroupParametersRequest
     */
    public APItestGroupParametersRequest requiredInt64Group(@javax.annotation.Nonnull Long requiredInt64Group) {
      this.requiredInt64Group = requiredInt64Group;
      return this;
    }

    /**
     * Set stringGroup
     * @param stringGroup String in group parameters (optional)
     * @return APItestGroupParametersRequest
     */
    public APItestGroupParametersRequest stringGroup(@javax.annotation.Nullable Integer stringGroup) {
      this.stringGroup = stringGroup;
      return this;
    }

    /**
     * Set booleanGroup
     * @param booleanGroup Boolean in group parameters (optional)
     * @return APItestGroupParametersRequest
     */
    public APItestGroupParametersRequest booleanGroup(@javax.annotation.Nullable Boolean booleanGroup) {
      this.booleanGroup = booleanGroup;
      return this;
    }

    /**
     * Set int64Group
     * @param int64Group Integer in group parameters (optional)
     * @return APItestGroupParametersRequest
     */
    public APItestGroupParametersRequest int64Group(@javax.annotation.Nullable Long int64Group) {
      this.int64Group = int64Group;
      return this;
    }

    /**
     * Execute testGroupParameters request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table border="1">
       <caption>Response Details</caption>
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 400 </td><td> Something wrong </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute testGroupParameters request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table border="1">
       <caption>Response Details</caption>
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 400 </td><td> Something wrong </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return testGroupParametersWithHttpInfo(requiredStringGroup, requiredBooleanGroup, requiredInt64Group, stringGroup, booleanGroup, int64Group);
    }
  }

  /**
   * Fake endpoint to test group parameters (optional)
   * Fake endpoint to test group parameters (optional)
   * @return testGroupParametersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APItestGroupParametersRequest testGroupParameters() throws ApiException {
    return new APItestGroupParametersRequest();
  }
  /**
   * test inline additionalProperties
   * 
   * @param param request body (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public void testInlineAdditionalProperties(@javax.annotation.Nonnull Map<String, String> param) throws ApiException {
    testInlineAdditionalPropertiesWithHttpInfo(param);
  }

  /**
   * test inline additionalProperties
   * 
   * @param param request body (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> testInlineAdditionalPropertiesWithHttpInfo(@javax.annotation.Nonnull Map<String, String> param) throws ApiException {
    // Check required parameters
    if (param == null) {
      throw new ApiException(400, "Missing the required parameter 'param' when calling testInlineAdditionalProperties");
    }

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("FakeApi.testInlineAdditionalProperties", "/fake/inline-additionalProperties", "POST", new ArrayList<>(), param,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * test json serialization of form data
   * 
   * @param param field1 (required)
   * @param param2 field2 (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public void testJsonFormData(@javax.annotation.Nonnull String param, @javax.annotation.Nonnull String param2) throws ApiException {
    testJsonFormDataWithHttpInfo(param, param2);
  }

  /**
   * test json serialization of form data
   * 
   * @param param field1 (required)
   * @param param2 field2 (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> testJsonFormDataWithHttpInfo(@javax.annotation.Nonnull String param, @javax.annotation.Nonnull String param2) throws ApiException {
    // Check required parameters
    if (param == null) {
      throw new ApiException(400, "Missing the required parameter 'param' when calling testJsonFormData");
    }
    if (param2 == null) {
      throw new ApiException(400, "Missing the required parameter 'param2' when calling testJsonFormData");
    }

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams.put("param", param);
    localVarFormParams.put("param2", param2);

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/x-www-form-urlencoded");
    return apiClient.invokeAPI("FakeApi.testJsonFormData", "/fake/jsonFormData", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * 
   * To test the collection format in query parameters
   * @param pipe  (required)
   * @param ioutil  (required)
   * @param http  (required)
   * @param url  (required)
   * @param context  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void testQueryParameterCollectionFormat(@javax.annotation.Nonnull List<String> pipe, @javax.annotation.Nonnull List<String> ioutil, @javax.annotation.Nonnull List<String> http, @javax.annotation.Nonnull List<String> url, @javax.annotation.Nonnull List<String> context) throws ApiException {
    testQueryParameterCollectionFormatWithHttpInfo(pipe, ioutil, http, url, context);
  }

  /**
   * 
   * To test the collection format in query parameters
   * @param pipe  (required)
   * @param ioutil  (required)
   * @param http  (required)
   * @param url  (required)
   * @param context  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> testQueryParameterCollectionFormatWithHttpInfo(@javax.annotation.Nonnull List<String> pipe, @javax.annotation.Nonnull List<String> ioutil, @javax.annotation.Nonnull List<String> http, @javax.annotation.Nonnull List<String> url, @javax.annotation.Nonnull List<String> context) throws ApiException {
    // Check required parameters
    if (pipe == null) {
      throw new ApiException(400, "Missing the required parameter 'pipe' when calling testQueryParameterCollectionFormat");
    }
    if (ioutil == null) {
      throw new ApiException(400, "Missing the required parameter 'ioutil' when calling testQueryParameterCollectionFormat");
    }
    if (http == null) {
      throw new ApiException(400, "Missing the required parameter 'http' when calling testQueryParameterCollectionFormat");
    }
    if (url == null) {
      throw new ApiException(400, "Missing the required parameter 'url' when calling testQueryParameterCollectionFormat");
    }
    if (context == null) {
      throw new ApiException(400, "Missing the required parameter 'context' when calling testQueryParameterCollectionFormat");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "pipe", pipe)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ioutil", ioutil));
    localVarQueryParams.addAll(apiClient.parameterToPairs("ssv", "http", http));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "url", url));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "context", context));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("FakeApi.testQueryParameterCollectionFormat", "/fake/test-query-parameters", "PUT", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
