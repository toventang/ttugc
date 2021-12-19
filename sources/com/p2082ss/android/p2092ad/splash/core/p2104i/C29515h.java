package com.p2082ss.android.p2092ad.splash.core.p2104i;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.p2092ad.splash.core.p2097b.C29406a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.core.i.h */
public final class C29515h implements AbstractC29514g {

    /* renamed from: a */
    C29406a f70280a;

    static {
        Covode.recordClassIndex(35909);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29514g
    /* renamed from: a */
    public final List<C29513f> mo51611a() {
        boolean z;
        LinkedList linkedList = new LinkedList();
        Cursor a = this.f70280a.mo51432a().mo51447a("trackurl");
        while (a.moveToNext()) {
            try {
                String string = a.getString(a.getColumnIndex("id"));
                String string2 = a.getString(a.getColumnIndex("url"));
                if (a.getInt(a.getColumnIndex("replaceholder")) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                linkedList.add(new C29513f(a.getLong(a.getColumnIndex("cid")), a.getString(a.getColumnIndex("log_extra")), string, string2, z, a.getInt(a.getColumnIndex("retry")), a.getInt(a.getColumnIndex(StringSet.type))));
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }
        a.close();
        return linkedList;
    }

    public C29515h(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f70280a = C29406a.m58903a(applicationContext);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29514g
    /* renamed from: c */
    public final void mo51614c(C29513f fVar) {
        this.f70280a.mo51432a().mo51445a("trackurl", "id=?", new String[]{fVar.f70273a});
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29514g
    /* renamed from: b */
    public final void mo51613b(C29513f fVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fVar.f70273a);
        contentValues.put("url", fVar.f70274b);
        contentValues.put("replaceholder", Integer.valueOf(fVar.f70275c ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(fVar.f70276d));
        contentValues.put(StringSet.type, Integer.valueOf(fVar.f70277e));
        contentValues.put("cid", Long.valueOf(fVar.f70278f));
        contentValues.put("log_extra", fVar.f70279g);
        this.f70280a.mo51432a().mo51444a("trackurl", contentValues, "id=?", new String[]{fVar.f70273a});
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29514g
    /* renamed from: a */
    public final void mo51612a(C29513f fVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fVar.f70273a);
        contentValues.put("url", fVar.f70274b);
        contentValues.put("replaceholder", Integer.valueOf(fVar.f70275c ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(fVar.f70276d));
        contentValues.put(StringSet.type, Integer.valueOf(fVar.f70277e));
        contentValues.put("cid", Long.valueOf(fVar.f70278f));
        contentValues.put("log_extra", fVar.f70279g);
        this.f70280a.mo51432a().mo51446a("trackurl", contentValues);
    }
}
