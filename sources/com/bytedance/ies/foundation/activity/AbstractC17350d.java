package com.bytedance.ies.foundation.activity;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1214u;
import androidx.p012a.p013a.p016c.AbstractC0189a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.AbstractC17368c;
import com.bytedance.ies.foundation.base.p1207a.C17363a;
import com.bytedance.ies.foundation.base.p1207a.C17364b;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.ies.foundation.activity.d */
public abstract class AbstractC17350d extends AbstractC17368c {

    /* renamed from: b */
    public static final C17351a f41642b = new C17351a((byte) 0);

    /* renamed from: a */
    public WeakReference<ActivityC17312a> f41643a;

    static {
        Covode.recordClassIndex(19835);
    }

    /* renamed from: com.bytedance.ies.foundation.activity.d$a */
    public static final class C17351a {
        static {
            Covode.recordClassIndex(19836);
        }

        private C17351a() {
        }

        public /* synthetic */ C17351a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: d */
    public void mo27662d(ActivityC17312a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo27662d(aVar);
        this.f41643a = null;
    }

    /* renamed from: com.bytedance.ies.foundation.activity.d$b */
    public static final class C17352b<I, O> implements AbstractC0189a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f41644a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89290k f41645b;

        /* renamed from: c */
        final /* synthetic */ ActivityC17312a f41646c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f41647d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89183m f41648e;

        static {
            Covode.recordClassIndex(19837);
        }

        public C17352b(AbstractC89290k kVar, AbstractC89290k kVar2, ActivityC17312a aVar, C89233z.C89238e eVar, AbstractC89183m mVar) {
            this.f41644a = kVar;
            this.f41645b = kVar2;
            this.f41646c = aVar;
            this.f41647d = eVar;
            this.f41648e = mVar;
        }

        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* synthetic */ Object mo365a(Object obj) {
            AbstractC89290k kVar = this.f41644a;
            C89219l.m154716b(obj, "");
            return new C17364b(kVar.get(obj), this.f41645b.get(obj));
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.d$c */
    public static final class C17353c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f41649a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89290k f41650b;

        /* renamed from: c */
        final /* synthetic */ ActivityC17312a f41651c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f41652d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89183m f41653e;

        static {
            Covode.recordClassIndex(19838);
        }

        public C17353c(AbstractC89290k kVar, AbstractC89290k kVar2, ActivityC17312a aVar, C89233z.C89238e eVar, AbstractC89183m mVar) {
            this.f41649a = kVar;
            this.f41650b = kVar2;
            this.f41651c = aVar;
            this.f41652d = eVar;
            this.f41653e = mVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            T t = (T) ((C17364b) obj);
            if (!C89219l.m154714a((Object) t, (Object) this.f41652d.element)) {
                AbstractC89183m mVar = this.f41653e;
                if (mVar != null) {
                    mVar.invoke(t.f41681a, t.f41682b);
                }
                this.f41652d.element = t;
            }
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.d$d */
    public static final class C17354d<I, O> implements AbstractC0189a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f41654a;

        /* renamed from: b */
        final /* synthetic */ ActivityC17312a f41655b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f41656c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f41657d;

        static {
            Covode.recordClassIndex(19839);
        }

        public C17354d(AbstractC89290k kVar, ActivityC17312a aVar, C89233z.C89238e eVar, AbstractC89172b bVar) {
            this.f41654a = kVar;
            this.f41655b = aVar;
            this.f41656c = eVar;
            this.f41657d = bVar;
        }

        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* synthetic */ Object mo365a(Object obj) {
            AbstractC89290k kVar = this.f41654a;
            C89219l.m154716b(obj, "");
            return new C17363a(kVar.get(obj));
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.d$e */
    public static final class C17355e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f41658a;

        /* renamed from: b */
        final /* synthetic */ ActivityC17312a f41659b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f41660c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f41661d;

        static {
            Covode.recordClassIndex(19840);
        }

        public C17355e(AbstractC89290k kVar, ActivityC17312a aVar, C89233z.C89238e eVar, AbstractC89172b bVar) {
            this.f41658a = kVar;
            this.f41659b = aVar;
            this.f41660c = eVar;
            this.f41661d = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            T t = (T) ((C17363a) obj);
            if (!C89219l.m154714a((Object) t, (Object) this.f41660c.element)) {
                AbstractC89172b bVar = this.f41661d;
                if (bVar != null) {
                    bVar.invoke(t.f41680a);
                }
                this.f41660c.element = t;
            }
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.d$f */
    public static final class C17356f<I, O> implements AbstractC0189a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f41662a;

        /* renamed from: b */
        final /* synthetic */ ActivityC17312a f41663b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f41664c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f41665d;

        static {
            Covode.recordClassIndex(19841);
        }

        public C17356f(AbstractC89290k kVar, ActivityC17312a aVar, C89233z.C89238e eVar, AbstractC89172b bVar) {
            this.f41662a = kVar;
            this.f41663b = aVar;
            this.f41664c = eVar;
            this.f41665d = bVar;
        }

        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* synthetic */ Object mo365a(Object obj) {
            AbstractC89290k kVar = this.f41662a;
            C89219l.m154716b(obj, "");
            return new C17363a(kVar.get(obj));
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.d$g */
    public static final class C17357g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f41666a;

        /* renamed from: b */
        final /* synthetic */ ActivityC17312a f41667b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f41668c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f41669d;

        static {
            Covode.recordClassIndex(19842);
        }

        public C17357g(AbstractC89290k kVar, ActivityC17312a aVar, C89233z.C89238e eVar, AbstractC89172b bVar) {
            this.f41666a = kVar;
            this.f41667b = aVar;
            this.f41668c = eVar;
            this.f41669d = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            T t = (T) ((C17363a) obj);
            if (!C89219l.m154714a((Object) t, (Object) this.f41668c.element)) {
                AbstractC89172b bVar = this.f41669d;
                if (bVar != null) {
                    bVar.invoke(t.f41680a);
                }
                this.f41668c.element = t;
            }
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.d$h */
    public static final class C17358h<I, O> implements AbstractC0189a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f41670a;

        /* renamed from: b */
        final /* synthetic */ ActivityC17312a f41671b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f41672c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f41673d;

        static {
            Covode.recordClassIndex(19843);
        }

        public C17358h(AbstractC89290k kVar, ActivityC17312a aVar, C89233z.C89238e eVar, AbstractC89172b bVar) {
            this.f41670a = kVar;
            this.f41671b = aVar;
            this.f41672c = eVar;
            this.f41673d = bVar;
        }

        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* synthetic */ Object mo365a(Object obj) {
            AbstractC89290k kVar = this.f41670a;
            C89219l.m154716b(obj, "");
            return new C17363a(kVar.get(obj));
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.d$i */
    public static final class C17359i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f41674a;

        /* renamed from: b */
        final /* synthetic */ ActivityC17312a f41675b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f41676c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f41677d;

        static {
            Covode.recordClassIndex(19844);
        }

        public C17359i(AbstractC89290k kVar, ActivityC17312a aVar, C89233z.C89238e eVar, AbstractC89172b bVar) {
            this.f41674a = kVar;
            this.f41675b = aVar;
            this.f41676c = eVar;
            this.f41677d = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            T t = (T) ((C17363a) obj);
            if (!C89219l.m154714a((Object) t, (Object) this.f41676c.element)) {
                AbstractC89172b bVar = this.f41677d;
                if (bVar != null) {
                    bVar.invoke(t.f41680a);
                }
                this.f41676c.element = t;
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: b */
    public void mo27658b(ActivityC17312a aVar, Bundle bundle) {
        C89219l.m154721d(aVar, "");
        super.mo27658b(aVar, bundle);
        if (aVar != null) {
            this.f41643a = new WeakReference<>(aVar);
        }
    }
}
