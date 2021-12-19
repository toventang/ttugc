package com.bytedance.globalpayment.iap.google.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.iap.common.ability.p1061h.C15156a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService;

public class PayloadPreferencesServiceImpl implements PayloadPreferencesService {
    private static volatile PayloadPreferencesService instance;

    static {
        Covode.recordClassIndex(17386);
    }

    private PayloadPreferencesServiceImpl() {
    }

    public static PayloadPreferencesService getInstance() {
        MethodCollector.m26663i(3742);
        if (instance == null) {
            synchronized (PayloadPreferencesServiceImpl.class) {
                try {
                    if (instance == null) {
                        instance = new PayloadPreferencesServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3742);
                    throw th;
                }
            }
        }
        PayloadPreferencesService payloadPreferencesService = instance;
        MethodCollector.m26664o(3742);
        return payloadPreferencesService;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService
    public void removePayload(Context context, String str) {
        C15156a.m27881a(context, str);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService
    public void removeQueryOrderParam(Context context, String str) {
        C15253a.m28071a().mo24705e();
        C15156a.m27877a(context).edit().remove("key_query_order_".concat(String.valueOf(str))).apply();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService
    public void addQueryOrderParam(Context context, String str, String str2, String str3, String str4, boolean z, String str5, boolean z2) {
        C15253a.m28071a().mo24705e();
        SharedPreferences a = C15156a.m27877a(context);
        String a2 = C15156a.m27879a(str, str3, str4, z, str5, z2);
        if (!TextUtils.isEmpty(a2)) {
            a.edit().putString("key_query_order_".concat(String.valueOf(str2)), a2).apply();
        }
    }
}
