package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.AbstractC28026s;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AuthTokenAdapter implements AbstractC28018k<AbstractC87681a>, AbstractC28026s<AbstractC87681a> {

    /* renamed from: a */
    static final Map<String, Class<? extends AbstractC87681a>> f199169a;

    /* renamed from: b */
    private final C27910f f199170b = new C27910f();

    static {
        Covode.recordClassIndex(103663);
        HashMap hashMap = new HashMap();
        f199169a = hashMap;
        hashMap.put("oauth1a", TwitterAuthToken.class);
        hashMap.put("oauth2", OAuth2Token.class);
        hashMap.put("guest", GuestAuthToken.class);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.gson.AbstractC28026s
    /* renamed from: a */
    public final /* synthetic */ AbstractC28019l mo16610a(AbstractC87681a aVar) {
        String str;
        C28022o oVar = new C28022o();
        Class<?> cls = aVar.getClass();
        Iterator<Map.Entry<String, Class<? extends AbstractC87681a>>> it = f199169a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "";
                break;
            }
            Map.Entry<String, Class<? extends AbstractC87681a>> next = it.next();
            if (next.getValue().equals(cls)) {
                str = next.getKey();
                break;
            }
        }
        oVar.mo46801a("auth_type", str);
        oVar.mo46797a("auth_token", this.f199170b.mo46661a(aVar));
        return oVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* synthetic */ AbstractC87681a mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        C28022o j = lVar.mo46789j();
        String c = j.mo46804d("auth_type").mo46689c();
        return this.f199170b.mo46667a(j.mo46803c("auth_token"), (Class) f199169a.get(c));
    }
}
