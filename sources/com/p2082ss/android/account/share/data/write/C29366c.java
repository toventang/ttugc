package com.p2082ss.android.account.share.data.write;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.account.share.data.C29356a;
import java.security.MessageDigest;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.account.share.data.write.c */
public final class C29366c {

    /* renamed from: a */
    public static final C29366c f69719a = new C29366c();

    private C29366c() {
    }

    static {
        Covode.recordClassIndex(35756);
    }

    /* renamed from: a */
    public static String m58798a(Context context, String str) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(str, "");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            C89219l.m154709a((Object) packageInfo, "");
            Signature signature = packageInfo.signatures[0];
            C89219l.m154709a((Object) signature, "");
            return m58799a(signature, "SHA256");
        } catch (Exception e) {
            e.printStackTrace();
            C29356a.m58786a().mo51314a("share_sdk_get_pkg_sign_failed").mo51315a("err_msg", e.getMessage()).mo51315a("err_msg_stack", Log.getStackTraceString(e)).mo51316b();
            return null;
        }
    }

    /* renamed from: a */
    private static String m58799a(Signature signature, String str) {
        C89219l.m154719c(signature, "");
        byte[] byteArray = signature.toByteArray();
        C89219l.m154709a((Object) byteArray, "");
        try {
            StringBuffer stringBuffer = new StringBuffer();
            MessageDigest instance = MessageDigest.getInstance(str);
            if (instance == null) {
                return "";
            }
            instance.reset();
            instance.update(byteArray);
            byte[] digest = instance.digest();
            C89219l.m154709a((Object) digest, "");
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                if (Integer.toHexString(digest[i] & 255).length() == 1) {
                    stringBuffer.append("0").append(Integer.toHexString(digest[i] & 255));
                } else {
                    stringBuffer.append(Integer.toHexString(digest[i] & 255));
                }
            }
            String stringBuffer2 = stringBuffer.toString();
            C89219l.m154709a((Object) stringBuffer2, "");
            if (stringBuffer2 != null) {
                String upperCase = stringBuffer2.toUpperCase();
                C89219l.m154709a((Object) upperCase, "");
                return upperCase;
            }
            throw new C89388w("null cannot be cast to non-null type");
        } catch (Exception e) {
            e.printStackTrace();
            C29356a.m58786a().mo51314a("share_sdk_get_pkg_sign_failed").mo51315a("err_msg", e.getMessage()).mo51315a("err_msg_stack", Log.getStackTraceString(e)).mo51316b();
            return "";
        }
    }
}
