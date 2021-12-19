package com.bytedance.globalpayment.service.manager;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalService;
import com.bytedance.globalpayment.service.manager.ecommerce.wecht.IWeChtExternalService;
import com.bytedance.globalpayment.service.manager.iap.IapExternalService;
import com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService;
import com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService;
import com.bytedance.globalpayment.service.manager.p1083fe.ability.FeAbilityExternalService;
import java.util.HashMap;
import java.util.Map;

public class PaymentServiceManager {
    private static volatile AmazonIapExternalService mAmazonIapExternalService;
    private static volatile ECommerceExternalService mECommerceExternalService;
    private static volatile FeAbilityExternalService mFeAbilityExternalService;
    private static volatile GoogleIapExternalService mGoogleIapExternalService;
    private static volatile IWeChtExternalService mIWeChtExternalService;
    private static volatile IapExternalService mIapExternalService;
    private static volatile PaymentServiceManager mServiceManagerInstance;
    private Map<String, String> classNameMap;
    private Map<String, Object> instanceManager = new HashMap();

    static {
        Covode.recordClassIndex(17492);
    }

    private PaymentServiceManager() {
        HashMap hashMap = new HashMap();
        this.classNameMap = hashMap;
        hashMap.put("com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService", "com.bytedance.globalpayment.iap.amazon.service.provider.AmazonIapServiceProvider");
        this.classNameMap.put("com.bytedance.globalpayment.service.manager.fe.ability.FeAbilityExternalService", "com.bytedance.globalpayment.fe.ability.FeAbilityServiceProvider");
        this.classNameMap.put("com.bytedance.globalpayment.service.manager.ecommerce.wecht.IWeChtExternalService", "com.bytedance.globalpayment.ecommerce.wechat.service.provider.WeChtServiceProvider");
        this.classNameMap.put("com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService", "com.bytedance.globalpayment.iap.google.service.provider.GoogleIapExternalServiceProvider");
        this.classNameMap.put("com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalService", "com.bytedance.globalpayment.ecommerce.service.provider.ECommerceServiceProvider");
        this.classNameMap.put("com.bytedance.globalpayment.service.manager.iap.IapExternalService", "com.bytedance.globalpayment.iap.service.provider.IapServiceProvider");
    }

    public static PaymentServiceManager get() {
        MethodCollector.m26663i(12903);
        if (mServiceManagerInstance == null) {
            synchronized (PaymentServiceManager.class) {
                try {
                    if (mServiceManagerInstance == null) {
                        mServiceManagerInstance = new PaymentServiceManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12903);
                    throw th;
                }
            }
        }
        PaymentServiceManager paymentServiceManager = mServiceManagerInstance;
        MethodCollector.m26664o(12903);
        return paymentServiceManager;
    }

    public AmazonIapExternalService getAmazonIapExternalService() {
        MethodCollector.m26663i(12709);
        if (mAmazonIapExternalService == null) {
            synchronized (this) {
                try {
                    if (mAmazonIapExternalService == null) {
                        Object objectInstance = getObjectInstance(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService"));
                        if (objectInstance != null || (!TextUtils.equals(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService"), "com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalServiceImplOfMock") && (objectInstance = getObjectInstance("com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalServiceImplOfMock")) != null)) {
                            mAmazonIapExternalService = (AmazonIapExternalService) objectInstance;
                        } else {
                            RuntimeException runtimeException = new RuntimeException("impl class not found for com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService");
                            MethodCollector.m26664o(12709);
                            throw runtimeException;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12709);
                    throw th;
                }
            }
        }
        AmazonIapExternalService amazonIapExternalService = mAmazonIapExternalService;
        MethodCollector.m26664o(12709);
        return amazonIapExternalService;
    }

    public ECommerceExternalService getECommerceExternalService() {
        MethodCollector.m26663i(12901);
        if (mECommerceExternalService == null) {
            synchronized (this) {
                try {
                    if (mECommerceExternalService == null) {
                        Object objectInstance = getObjectInstance(this.classNameMap.get("com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalService"));
                        if (objectInstance != null || (!TextUtils.equals(this.classNameMap.get("com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalService"), "com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalServiceImplOfMock") && (objectInstance = getObjectInstance("com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalServiceImplOfMock")) != null)) {
                            mECommerceExternalService = (ECommerceExternalService) objectInstance;
                        } else {
                            RuntimeException runtimeException = new RuntimeException("impl class not found for com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalService");
                            MethodCollector.m26664o(12901);
                            throw runtimeException;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12901);
                    throw th;
                }
            }
        }
        ECommerceExternalService eCommerceExternalService = mECommerceExternalService;
        MethodCollector.m26664o(12901);
        return eCommerceExternalService;
    }

    public FeAbilityExternalService getFeAbilityExternalService() {
        MethodCollector.m26663i(12710);
        if (mFeAbilityExternalService == null) {
            synchronized (this) {
                try {
                    if (mFeAbilityExternalService == null) {
                        Object objectInstance = getObjectInstance(this.classNameMap.get("com.bytedance.globalpayment.service.manager.fe.ability.FeAbilityExternalService"));
                        if (objectInstance != null || (!TextUtils.equals(this.classNameMap.get("com.bytedance.globalpayment.service.manager.fe.ability.FeAbilityExternalService"), "com.bytedance.globalpayment.service.manager.fe.ability.FeAbilityExternalServiceImplOfMock") && (objectInstance = getObjectInstance("com.bytedance.globalpayment.service.manager.fe.ability.FeAbilityExternalServiceImplOfMock")) != null)) {
                            mFeAbilityExternalService = (FeAbilityExternalService) objectInstance;
                        } else {
                            RuntimeException runtimeException = new RuntimeException("impl class not found for com.bytedance.globalpayment.service.manager.fe.ability.FeAbilityExternalService");
                            MethodCollector.m26664o(12710);
                            throw runtimeException;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12710);
                    throw th;
                }
            }
        }
        FeAbilityExternalService feAbilityExternalService = mFeAbilityExternalService;
        MethodCollector.m26664o(12710);
        return feAbilityExternalService;
    }

    public GoogleIapExternalService getGoogleIapExternalService() {
        MethodCollector.m26663i(12817);
        if (mGoogleIapExternalService == null) {
            synchronized (this) {
                try {
                    if (mGoogleIapExternalService == null) {
                        Object objectInstance = getObjectInstance(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService"));
                        if (objectInstance != null || (!TextUtils.equals(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService"), "com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalServiceImplOfMock") && (objectInstance = getObjectInstance("com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalServiceImplOfMock")) != null)) {
                            mGoogleIapExternalService = (GoogleIapExternalService) objectInstance;
                        } else {
                            RuntimeException runtimeException = new RuntimeException("impl class not found for com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService");
                            MethodCollector.m26664o(12817);
                            throw runtimeException;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12817);
                    throw th;
                }
            }
        }
        GoogleIapExternalService googleIapExternalService = mGoogleIapExternalService;
        MethodCollector.m26664o(12817);
        return googleIapExternalService;
    }

    public IWeChtExternalService getIWeChtExternalService() {
        MethodCollector.m26663i(12711);
        if (mIWeChtExternalService == null) {
            synchronized (this) {
                try {
                    if (mIWeChtExternalService == null) {
                        Object objectInstance = getObjectInstance(this.classNameMap.get("com.bytedance.globalpayment.service.manager.ecommerce.wecht.IWeChtExternalService"));
                        if (objectInstance != null || (!TextUtils.equals(this.classNameMap.get("com.bytedance.globalpayment.service.manager.ecommerce.wecht.IWeChtExternalService"), "com.bytedance.globalpayment.service.manager.ecommerce.wecht.IWeChtExternalServiceImplOfMock") && (objectInstance = getObjectInstance("com.bytedance.globalpayment.service.manager.ecommerce.wecht.IWeChtExternalServiceImplOfMock")) != null)) {
                            mIWeChtExternalService = (IWeChtExternalService) objectInstance;
                        } else {
                            RuntimeException runtimeException = new RuntimeException("impl class not found for com.bytedance.globalpayment.service.manager.ecommerce.wecht.IWeChtExternalService");
                            MethodCollector.m26664o(12711);
                            throw runtimeException;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12711);
                    throw th;
                }
            }
        }
        IWeChtExternalService iWeChtExternalService = mIWeChtExternalService;
        MethodCollector.m26664o(12711);
        return iWeChtExternalService;
    }

    public IapExternalService getIapExternalService() {
        MethodCollector.m26663i(12902);
        if (mIapExternalService == null) {
            synchronized (this) {
                try {
                    if (mIapExternalService == null) {
                        Object objectInstance = getObjectInstance(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.IapExternalService"));
                        if (objectInstance != null || (!TextUtils.equals(this.classNameMap.get("com.bytedance.globalpayment.service.manager.iap.IapExternalService"), "com.bytedance.globalpayment.service.manager.iap.IapExternalServiceImplOfMock") && (objectInstance = getObjectInstance("com.bytedance.globalpayment.service.manager.iap.IapExternalServiceImplOfMock")) != null)) {
                            mIapExternalService = (IapExternalService) objectInstance;
                        } else {
                            RuntimeException runtimeException = new RuntimeException("impl class not found for com.bytedance.globalpayment.service.manager.iap.IapExternalService");
                            MethodCollector.m26664o(12902);
                            throw runtimeException;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12902);
                    throw th;
                }
            }
        }
        IapExternalService iapExternalService = mIapExternalService;
        MethodCollector.m26664o(12902);
        return iapExternalService;
    }

    private Object getObjectInstance(String str) {
        if (this.instanceManager.containsKey(str)) {
            return this.instanceManager.get(str);
        }
        try {
            Object newInstance = Class.forName(str).newInstance();
            this.instanceManager.put(str, newInstance);
            return newInstance;
        } catch (Throwable unused) {
            return null;
        }
    }
}
