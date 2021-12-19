package com.bytedance.android.livesdk.chatroom.p488c;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.p488c.AbstractC7394l;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.aa */
public final class C7368aa extends C7374ag {

    /* renamed from: a */
    public final String f18262a;

    /* renamed from: b */
    public final String f18263b;

    /* renamed from: c */
    public final int f18264c;

    /* renamed from: d */
    private final boolean f18265d;

    /* renamed from: e */
    private final AbstractC7394l.EnumC7395a f18266e;

    /* renamed from: f */
    private final Map<String, Object> f18267f;

    static {
        Covode.recordClassIndex(8135);
    }

    @Override // com.bytedance.android.livesdk.chatroom.p488c.C7374ag
    /* renamed from: b */
    public final String mo13596b() {
        return this.f18263b;
    }

    @Override // com.bytedance.android.livesdk.chatroom.p488c.C7374ag
    /* renamed from: c */
    public final boolean mo13597c() {
        return this.f18265d;
    }

    @Override // com.bytedance.android.livesdk.chatroom.p488c.C7374ag
    /* renamed from: d */
    public final int mo13598d() {
        return this.f18264c;
    }

    @Override // com.bytedance.android.livesdk.chatroom.p488c.C7374ag
    /* renamed from: e */
    public final AbstractC7394l.EnumC7395a mo13599e() {
        return this.f18266e;
    }

    @Override // com.bytedance.android.livesdk.chatroom.p488c.C7374ag
    /* renamed from: f */
    public final Map<String, Object> mo13600f() {
        return this.f18267f;
    }

    /* renamed from: a */
    public final boolean mo13595a() {
        return TextUtils.equals(this.f18262a, this.f18263b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7368aa(String str, String str2, boolean z, int i, AbstractC7394l.EnumC7395a aVar, Map<String, ? extends Object> map) {
        super(str2, z, i, aVar, map);
        C89219l.m154721d(str2, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(map, "");
        this.f18262a = str;
        this.f18263b = str2;
        this.f18265d = z;
        this.f18264c = i;
        this.f18266e = aVar;
        this.f18267f = map;
    }
}
