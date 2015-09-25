/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.google.gson.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import fixtures.azurespecials.models.Error;

public class ApiVersionLocalImpl implements ApiVersionLocal {
    private ApiVersionLocalService service;
    AutoRestAzureSpecialParametersTestClient client;

    public ApiVersionLocalImpl(RestAdapter restAdapter, AutoRestAzureSpecialParametersTestClient client) {
        this.service = restAdapter.create(ApiVersionLocalService.class);
        this.client = client;
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'. Possible values for this parameter include: '2.0'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void getMethodLocalValid(String apiVersion) throws ServiceException {
        if (apiVersion == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter apiVersion is required and cannot be null."));
        }
        try {
            ServiceResponse<Void> response = getMethodLocalValidDelegate(service.getMethodLocalValid(apiVersion, this.client.getAcceptLanguage()), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = getMethodLocalValidDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'. Possible values for this parameter include: '2.0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getMethodLocalValidAsync(String apiVersion, final ServiceCallback<Void> serviceCallback) {
        if (apiVersion == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter apiVersion is required and cannot be null.")));
        }
        service.getMethodLocalValidAsync(apiVersion, this.client.getAcceptLanguage(), new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getMethodLocalValidDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> getMethodLocalValidDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void getMethodLocalNull(String apiVersion) throws ServiceException {
        try {
            ServiceResponse<Void> response = getMethodLocalNullDelegate(service.getMethodLocalNull(apiVersion, this.client.getAcceptLanguage()), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = getMethodLocalNullDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getMethodLocalNullAsync(String apiVersion, final ServiceCallback<Void> serviceCallback) {
        service.getMethodLocalNullAsync(apiVersion, this.client.getAcceptLanguage(), new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getMethodLocalNullDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> getMethodLocalNullDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'. Possible values for this parameter include: '2.0'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void getPathLocalValid(String apiVersion) throws ServiceException {
        if (apiVersion == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter apiVersion is required and cannot be null."));
        }
        try {
            ServiceResponse<Void> response = getPathLocalValidDelegate(service.getPathLocalValid(apiVersion, this.client.getAcceptLanguage()), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = getPathLocalValidDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'. Possible values for this parameter include: '2.0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getPathLocalValidAsync(String apiVersion, final ServiceCallback<Void> serviceCallback) {
        if (apiVersion == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter apiVersion is required and cannot be null.")));
        }
        service.getPathLocalValidAsync(apiVersion, this.client.getAcceptLanguage(), new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getPathLocalValidDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> getPathLocalValidDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion The api version, which appears in the query, the value is always '2.0'. Possible values for this parameter include: '2.0'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void getSwaggerLocalValid(String apiVersion) throws ServiceException {
        if (apiVersion == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter apiVersion is required and cannot be null."));
        }
        try {
            ServiceResponse<Void> response = getSwaggerLocalValidDelegate(service.getSwaggerLocalValid(apiVersion, this.client.getAcceptLanguage()), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = getSwaggerLocalValidDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion The api version, which appears in the query, the value is always '2.0'. Possible values for this parameter include: '2.0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getSwaggerLocalValidAsync(String apiVersion, final ServiceCallback<Void> serviceCallback) {
        if (apiVersion == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter apiVersion is required and cannot be null.")));
        }
        service.getSwaggerLocalValidAsync(apiVersion, this.client.getAcceptLanguage(), new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getSwaggerLocalValidDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> getSwaggerLocalValidDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

}
