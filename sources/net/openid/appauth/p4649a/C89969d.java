package net.openid.appauth.p4649a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;

/* renamed from: net.openid.appauth.a.d */
public final class C89969d {

    /* renamed from: a */
    static final Intent f203863a = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));

    static {
        Covode.recordClassIndex(106140);
    }

    /* renamed from: a */
    public static C89967b m156105a(Context context) {
        C89967b bVar = null;
        for (C89967b bVar2 : m156107b(context)) {
            if (bVar2.f203862d.booleanValue()) {
                return bVar2;
            }
            if (bVar == null) {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    /* renamed from: a */
    private static boolean m156106a(ResolveInfo resolveInfo) {
        if (!resolveInfo.filter.hasAction("android.intent.action.VIEW") || !resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") || resolveInfo.filter.schemesIterator() == null || resolveInfo.filter.authoritiesIterator() != null) {
            return false;
        }
        Iterator<String> schemesIterator = resolveInfo.filter.schemesIterator();
        boolean z = false;
        boolean z2 = false;
        while (schemesIterator.hasNext()) {
            String next = schemesIterator.next();
            z |= "http".equals(next);
            z2 |= "https".equals(next);
            if (z && z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084 A[Catch:{ NameNotFoundException -> 0x0029 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c A[Catch:{ NameNotFoundException -> 0x0029 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<net.openid.appauth.p4649a.C89967b> m156107b(android.content.Context r10) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: net.openid.appauth.p4649a.C89969d.m156107b(android.content.Context):java.util.List");
    }
}
