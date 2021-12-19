package com.p2082ss.android.ugc.aweme.app.api.p2319b;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.api.b.a */
public final class C33615a {
    static {
        Covode.recordClassIndex(40508);
    }

    /* renamed from: a */
    public static Throwable m68845a(Throwable th) {
        if (th instanceof ExecutionException) {
            return th.getCause();
        }
        return th;
    }

    /* renamed from: a */
    public static C34485a m68844a(Exception exc) {
        if (exc instanceof C34485a) {
            return (C34485a) exc;
        }
        Throwable cause = exc.getCause();
        if (cause instanceof C34485a) {
            return (C34485a) cause;
        }
        return null;
    }

    /* renamed from: a */
    public static void m68846a(Context context, C34485a aVar) {
        if (!TextUtils.isEmpty(aVar.getResponse())) {
            try {
                JSONObject jSONObject = new JSONObject(aVar.getResponse());
                if (!TextUtils.isEmpty(jSONObject.optString("status_msg"))) {
                    aVar.setErrorMsg(jSONObject.optString("status_msg"));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        m68848a(context, (Throwable) aVar, (int) R.string.g1i);
    }

    /* renamed from: a */
    public static void m68847a(Context context, Exception exc, int i) {
        Throwable a = m68845a((Throwable) exc);
        if (a instanceof C34485a) {
            C34485a aVar = (C34485a) a;
            if (aVar.getErrorCode() == 2752) {
                String errorMsg = aVar.getErrorMsg();
                String string = context.getResources().getString(i);
                C17197a.C17200a a2 = new C17197a.C17200a(context).mo27189a(R.string.d0x);
                if (TextUtils.isEmpty(errorMsg)) {
                    errorMsg = string;
                }
                a2.f41071b = errorMsg;
                a2.mo27190a(R.string.as0, (DialogInterface.OnClickListener) null, false).mo27193a().mo27184b();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m68848a(android.content.Context r3, java.lang.Throwable r4, int r5) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a.m68848a(android.content.Context, java.lang.Throwable, int):void");
    }
}
