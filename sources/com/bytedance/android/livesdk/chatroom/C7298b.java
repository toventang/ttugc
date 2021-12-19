package com.bytedance.android.livesdk.chatroom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7765aq;
import com.bytedance.android.livesdk.p561j.C9007aa;
import com.bytedance.android.livesdk.p561j.C9036bc;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.b */
public final class C7298b implements AbstractC7765aq {

    /* renamed from: j */
    private static final C7299a f18135j = new C7299a((byte) 0);

    /* renamed from: a */
    public final View f18136a;

    /* renamed from: b */
    public final ViewGroup f18137b;

    /* renamed from: c */
    public final View f18138c;

    /* renamed from: d */
    public final View f18139d;

    /* renamed from: e */
    public final View f18140e;

    /* renamed from: f */
    public final ViewGroup f18141f;

    /* renamed from: g */
    public final View f18142g;

    /* renamed from: h */
    public final View f18143h;

    /* renamed from: i */
    private final View f18144i;

    static {
        Covode.recordClassIndex(8061);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.b$a */
    static final class C7299a {
        static {
            Covode.recordClassIndex(8062);
        }

        private C7299a() {
        }

        public /* synthetic */ C7299a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7765aq
    /* renamed from: a */
    public final View mo13546a() {
        return this.f18144i;
    }

    /* renamed from: b */
    private final Context m15200b() {
        Context context = this.f18143h.getContext();
        C89219l.m154716b(context, "");
        return context;
    }

    /* renamed from: a */
    public static final boolean m15199a(DataChannel dataChannel) {
        Boolean bool;
        Boolean bool2;
        if (dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9036bc.class)) == null || !bool.booleanValue() || (bool2 = (Boolean) dataChannel.mo28318b(C9007aa.class)) == null || !bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    public C7298b(View view) {
        C89219l.m154721d(view, "");
        MethodCollector.m26663i(2659);
        this.f18143h = view;
        View inflate = LayoutInflater.from(m15200b()).inflate(R.layout.bad, (ViewGroup) null);
        C89219l.m154716b(inflate, "");
        this.f18136a = inflate;
        View findViewById = inflate.findViewById(R.id.e50);
        C89219l.m154716b(findViewById, "");
        this.f18137b = (ViewGroup) findViewById;
        View inflate2 = LayoutInflater.from(m15200b()).inflate(R.layout.bac, (ViewGroup) null);
        C89219l.m154716b(inflate2, "");
        this.f18138c = inflate2;
        View findViewById2 = inflate2.findViewById(R.id.e4y);
        C89219l.m154716b(findViewById2, "");
        this.f18139d = findViewById2;
        View findViewById3 = inflate2.findViewById(R.id.e4v);
        C89219l.m154716b(findViewById3, "");
        this.f18140e = findViewById3;
        View findViewById4 = inflate2.findViewById(R.id.e4w);
        C89219l.m154716b(findViewById4, "");
        this.f18141f = (ViewGroup) findViewById4;
        View findViewById5 = inflate2.findViewById(R.id.e4x);
        C89219l.m154716b(findViewById5, "");
        this.f18144i = findViewById5;
        View findViewById6 = inflate2.findViewById(R.id.e4z);
        C89219l.m154716b(findViewById6, "");
        this.f18142g = findViewById6;
        MethodCollector.m26664o(2659);
    }
}
