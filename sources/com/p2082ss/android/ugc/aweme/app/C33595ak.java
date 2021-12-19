package com.p2082ss.android.ugc.aweme.app;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.app.ak */
public final class C33595ak<T> extends C33594aj<List<T>> {

    /* renamed from: d */
    private Class<T> f79766d;

    static {
        Covode.recordClassIndex(40485);
    }

    /* renamed from: d */
    public final List<T> mo59941c() {
        String string = SharePrefCache.inst().getSharePref().getString(this.f79764b, "");
        if (TextUtils.isEmpty(string)) {
            return (List) this.f79763a;
        }
        String[] split = string.split(",");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str : split) {
            Class<T> cls = this.f79766d;
            if (cls == String.class) {
                arrayList.add(str);
            } else if (cls == Integer.class) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str)));
            } else if (cls == Float.class) {
                arrayList.add(Float.valueOf(Float.parseFloat(str)));
            } else if (cls == Long.class) {
                arrayList.add(Long.valueOf(Long.parseLong(str)));
            } else if (cls == Boolean.class) {
                arrayList.add(Boolean.valueOf(Boolean.parseBoolean(str)));
            } else {
                throw new RuntimeException("un support type: " + this.f79766d.getName());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.app.C33594aj
    /* renamed from: a */
    public final /* synthetic */ void mo59937a(Object obj) {
        Collection collection = (Collection) obj;
        SharedPreferences.Editor edit = SharePrefCache.inst().getSharePref().edit();
        if (C13603b.m24435a(collection)) {
            edit.remove(this.f79764b);
        } else {
            edit.putString(this.f79764b, TextUtils.join(",", collection));
        }
        edit.apply();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.app.C33594aj
    /* renamed from: a */
    public final /* synthetic */ void mo59936a(SharedPreferences.Editor editor, Object obj) {
        Collection collection = (Collection) obj;
        if (C13603b.m24435a(collection)) {
            editor.remove(this.f79764b);
        } else {
            editor.putString(this.f79764b, TextUtils.join(",", collection));
        }
    }

    public C33595ak(Class<T> cls, String str, List<T> list) {
        super(str, list);
        this.f79766d = cls;
    }
}
