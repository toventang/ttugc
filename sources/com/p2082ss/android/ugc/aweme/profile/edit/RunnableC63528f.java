package com.p2082ss.android.ugc.aweme.profile.edit;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.f */
final /* synthetic */ class RunnableC63528f implements Runnable {

    /* renamed from: a */
    private final InstagramPresenter f144178a;

    /* renamed from: b */
    private final String f144179b;

    static {
        Covode.recordClassIndex(74843);
    }

    RunnableC63528f(InstagramPresenter instagramPresenter, String str) {
        this.f144178a = instagramPresenter;
        this.f144179b = str;
    }

    public final void run() {
        String str;
        InstagramPresenter instagramPresenter = this.f144178a;
        String str2 = this.f144179b;
        instagramPresenter.f144146g = true;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("code", Uri.encode(str2));
            hashMap.put("new_flow", "true");
            String str3 = instagramPresenter.f144145f.doPost(InstagramPresenter.f144139a, hashMap).get();
            if (!TextUtils.isEmpty(str3)) {
                String string = new JSONObject(str3).getString("status_code");
                if (TextUtils.equals(string, "0")) {
                    instagramPresenter.f144144e.queryUser(instagramPresenter.f144143d);
                    return;
                }
                str = "Failure response, status: ".concat(String.valueOf(string));
            } else {
                str = "Empty response";
            }
        } catch (Exception e) {
            str = e.getMessage();
        }
        instagramPresenter.mo102153a(str, "send_token_to_sever");
        C80214ai.m139044b(new RunnableC63527e(instagramPresenter), "BoltsUtils");
    }
}
