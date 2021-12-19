package com.bytedance.p1399im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19625c;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.utils.c */
public final class C19994c {
    static {
        Covode.recordClassIndex(22839);
    }

    /* renamed from: a */
    public static C19538ai m37742a(C19538ai aiVar) {
        JSONObject jSONObject;
        if (!(aiVar == null || aiVar.getAttachments() == null || aiVar.getAttachments().isEmpty())) {
            JSONObject jSONObject2 = new JSONObject();
            for (C19625c cVar : aiVar.getAttachments()) {
                if (!TextUtils.isEmpty(cVar.getDisplayType())) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("length", cVar.getLength());
                        jSONObject3.put("md5", cVar.getHash());
                        jSONObject3.put("mime", cVar.getMimeType());
                        jSONObject3.put("remoteURL", cVar.getRemoteUrl());
                        jSONObject3.put("displayType", cVar.getDisplayType());
                        jSONObject3.put(StringSet.type, cVar.getType());
                        jSONObject3.put("encryptUrl", cVar.getEncryptUrl());
                        jSONObject3.put("secretKey", cVar.getSecretKey());
                        jSONObject3.put("algorithm", cVar.getAlgorithm());
                        jSONObject3.put("ext", C19997f.m37772c(cVar.getExt()));
                        jSONObject2.put(cVar.getDisplayType(), jSONObject3);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                if (TextUtils.isEmpty(aiVar.getContent())) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(aiVar.getContent());
                }
                jSONObject.put("__files", jSONObject2);
                aiVar.setContent(jSONObject.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return aiVar;
    }

    /* renamed from: b */
    public static C19538ai m37743b(C19538ai aiVar) {
        if (TextUtils.isEmpty(aiVar.getContent())) {
            return aiVar;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject optJSONObject = new JSONObject(aiVar.getContent()).optJSONObject("__files");
            if (optJSONObject == null) {
                return aiVar;
            }
            Iterator<String> keys = optJSONObject.keys();
            int i = 0;
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject = optJSONObject.getJSONObject(next);
                C19625c cVar = new C19625c();
                cVar.setMsgUuid(aiVar.getUuid());
                cVar.setDisplayType(next);
                cVar.setLength(jSONObject.optLong("length"));
                cVar.setHash(jSONObject.optString("md5"));
                cVar.setMimeType(jSONObject.optString("mime"));
                cVar.setRemoteUrl(jSONObject.optString("remoteURL"));
                cVar.setType(jSONObject.optString(StringSet.type));
                cVar.setIndex(i);
                cVar.setStatus(1);
                cVar.setExt(C19997f.m37770a(jSONObject.optJSONObject("ext")));
                cVar.setEncryptUrl(jSONObject.optString("encryptUrl"));
                cVar.setSecretKey(jSONObject.optString("secretKey"));
                cVar.setAlgorithm(jSONObject.optString("algorithm"));
                arrayList.add(cVar);
                i++;
            }
            if (!arrayList.isEmpty()) {
                aiVar.setAttachments(arrayList);
            }
            return aiVar;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
