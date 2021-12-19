package com.google.firebase.installations.p2016a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.firebase.C27695b;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.a.c */
public final class C27823c {

    /* renamed from: a */
    private final File f65368a;

    /* renamed from: b */
    private final C27695b f65369b;

    static {
        Covode.recordClassIndex(33412);
    }

    /* renamed from: com.google.firebase.installations.a.c$a */
    public enum EnumC27824a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR;

        static {
            Covode.recordClassIndex(33413);
        }
    }

    /* renamed from: b */
    private JSONObject m55646b() {
        MethodCollector.m26663i(3497);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        FileInputStream fileInputStream = new FileInputStream(this.f65368a);
        while (true) {
            try {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    try {
                        fileInputStream.close();
                        MethodCollector.m26664o(3497);
                        return jSONObject;
                    } catch (IOException | JSONException unused) {
                        JSONObject jSONObject2 = new JSONObject();
                        MethodCollector.m26664o(3497);
                        return jSONObject2;
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        MethodCollector.m26664o(3497);
        throw th;
    }

    /* renamed from: a */
    public final AbstractC27825d mo46505a() {
        JSONObject b = m55646b();
        String optString = b.optString("Fid", null);
        int optInt = b.optInt("Status", EnumC27824a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = b.optString("AuthToken", null);
        String optString3 = b.optString("RefreshToken", null);
        long optLong = b.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = b.optLong("ExpiresInSecs", 0);
        return AbstractC27825d.m55649m().mo46497a(optString).mo46496a(EnumC27824a.values()[optInt]).mo46500b(optString2).mo46501c(optString3).mo46499b(optLong).mo46495a(optLong2).mo46502d(b.optString("FisError", null)).mo46498a();
    }

    /* renamed from: a */
    private static File m55645a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    public C27823c(C27695b bVar) {
        this.f65368a = new File(m55645a(bVar.mo46324a()), "PersistedInstallation." + bVar.mo46332h() + ".json");
        this.f65369b = bVar;
    }

    /* renamed from: a */
    public final AbstractC27825d mo46506a(AbstractC27825d dVar) {
        MethodCollector.m26663i(3529);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.mo46484a());
            jSONObject.put("Status", dVar.mo46485b().ordinal());
            jSONObject.put("AuthToken", dVar.mo46486c());
            jSONObject.put("RefreshToken", dVar.mo46487d());
            jSONObject.put("TokenCreationEpochInSecs", dVar.mo46490f());
            jSONObject.put("ExpiresInSecs", dVar.mo46488e());
            jSONObject.put("FisError", dVar.mo46491g());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", m55645a(this.f65369b.mo46324a()));
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.f65368a)) {
                MethodCollector.m26664o(3529);
                return dVar;
            }
            IOException iOException = new IOException("unable to rename the tmpfile to PersistedInstallation");
            MethodCollector.m26664o(3529);
            throw iOException;
        } catch (IOException | JSONException unused) {
        }
    }
}
