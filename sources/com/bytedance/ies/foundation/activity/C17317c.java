package com.bytedance.ies.foundation.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.AbstractC17368c;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.ies.foundation.activity.c */
public final class C17317c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final CopyOnWriteArrayList<AbstractC17315b> f41603a = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(19802);
    }

    public final void onActivityDestroyed(Activity activity) {
        C89219l.m154721d(activity, "");
        m32099a(this, activity, false, null, C17327d.f41616a, 6);
    }

    public final void onActivityPaused(Activity activity) {
        C89219l.m154721d(activity, "");
        m32099a(this, activity, false, null, C17328e.f41617a, 6);
    }

    public final void onActivityResumed(Activity activity) {
        C89219l.m154721d(activity, "");
        m32099a(this, activity, false, null, C17331h.f41623a, 6);
    }

    public final void onActivityStarted(Activity activity) {
        C89219l.m154721d(activity, "");
        m32099a(this, activity, false, null, C17333j.f41625a, 6);
    }

    public final void onActivityStopped(Activity activity) {
        C89219l.m154721d(activity, "");
        m32099a(this, activity, false, null, C17334k.f41626a, 6);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C89219l.m154721d(activity, "");
        m32099a(this, activity, false, null, new C17326c(bundle), 6);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bundle, "");
        m32099a(this, activity, false, null, new C17332i(bundle), 6);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$a */
    public static final class C17318a extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17318a f41604a = new C17318a();

        static {
            Covode.recordClassIndex(19803);
        }

        C17318a() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar, "");
            bVar2.mo27646a();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$ab */
    public static final class C17320ab extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Bundle f41607a;

        static {
            Covode.recordClassIndex(19805);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17320ab(Bundle bundle) {
            super(3);
            this.f41607a = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar, "");
            bVar2.mo27650a(this.f41607a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.c$ac */
    static final class C17321ac extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17321ac f41608a = new C17321ac();

        static {
            Covode.recordClassIndex(19806);
        }

        C17321ac() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27651a(aVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$ad */
    public static final class C17322ad extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f41609a;

        static {
            Covode.recordClassIndex(19807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17322ad(boolean z) {
            super(3);
            this.f41609a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27654a(aVar2, this.f41609a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.c$ae */
    static final class C17323ae extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Activity f41610a;

        /* renamed from: b */
        final /* synthetic */ int f41611b;

        static {
            Covode.recordClassIndex(19808);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17323ae(Activity activity, int i) {
            super(3);
            this.f41610a = activity;
            this.f41611b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar, "");
            bVar2.mo27656b(this.f41610a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.c$af */
    static final class C17324af extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Activity f41612a;

        /* renamed from: b */
        final /* synthetic */ View f41613b;

        static {
            Covode.recordClassIndex(19809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17324af(Activity activity, View view) {
            super(3);
            this.f41612a = activity;
            this.f41613b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar, "");
            bVar2.mo27659c(this.f41612a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.c$b */
    static final class C17325b extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, Resources, Resources> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f41614a;

        static {
            Covode.recordClassIndex(19810);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17325b(C89233z.C89238e eVar) {
            super(3);
            this.f41614a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ Resources invoke(AbstractC17315b bVar, ActivityC17312a aVar, Resources resources) {
            AbstractC17315b bVar2 = bVar;
            Resources resources2 = resources;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar, "");
            if (resources2 != null) {
                this.f41614a.element = (T) bVar2.mo27645a(resources2);
            }
            return this.f41614a.element;
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.c$c */
    static final class C17326c extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Bundle f41615a;

        static {
            Covode.recordClassIndex(19811);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17326c(Bundle bundle) {
            super(3);
            this.f41615a = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27658b(aVar2, this.f41615a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.c$d */
    static final class C17327d extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17327d f41616a = new C17327d();

        static {
            Covode.recordClassIndex(19812);
        }

        C17327d() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27662d(aVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.c$e */
    static final class C17328e extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17328e f41617a = new C17328e();

        static {
            Covode.recordClassIndex(19813);
        }

        C17328e() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27657b(aVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.c$f */
    static final class C17329f extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f41618a;

        /* renamed from: b */
        final /* synthetic */ Intent f41619b;

        static {
            Covode.recordClassIndex(19814);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17329f(int i, Intent intent) {
            super(3);
            this.f41618a = i;
            this.f41619b = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar, "");
            bVar2.mo27648a(this.f41618a, this.f41619b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$g */
    public static final class C17330g extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f41620a;

        /* renamed from: b */
        final /* synthetic */ int f41621b;

        /* renamed from: c */
        final /* synthetic */ Intent f41622c;

        static {
            Covode.recordClassIndex(19815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17330g(int i, int i2, Intent intent) {
            super(3);
            this.f41620a = i;
            this.f41621b = i2;
            this.f41622c = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar, "");
            bVar2.mo27647a(this.f41620a, this.f41621b, this.f41622c);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.c$h */
    static final class C17331h extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17331h f41623a = new C17331h();

        static {
            Covode.recordClassIndex(19816);
        }

        C17331h() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27665f(aVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.c$i */
    static final class C17332i extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Bundle f41624a;

        static {
            Covode.recordClassIndex(19817);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17332i(Bundle bundle) {
            super(3);
            this.f41624a = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27653a(aVar2, this.f41624a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.c$j */
    static final class C17333j extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17333j f41625a = new C17333j();

        static {
            Covode.recordClassIndex(19818);
        }

        C17333j() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27660c(aVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.c$k */
    static final class C17334k extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17334k f41626a = new C17334k();

        static {
            Covode.recordClassIndex(19819);
        }

        C17334k() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27664e(aVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$l */
    public static final class C17335l extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Bundle f41627a;

        static {
            Covode.recordClassIndex(19820);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17335l(Bundle bundle) {
            super(3);
            this.f41627a = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27667h(aVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$m */
    public static final class C17336m extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17336m f41628a = new C17336m();

        static {
            Covode.recordClassIndex(19821);
        }

        C17336m() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27669j(aVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$n */
    public static final class C17337n extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17337n f41629a = new C17337n();

        static {
            Covode.recordClassIndex(19822);
        }

        C17337n() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27670k(aVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$o */
    public static final class C17338o extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17338o f41630a = new C17338o();

        static {
            Covode.recordClassIndex(19823);
        }

        C17338o() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27668i(aVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$p */
    public static final class C17339p extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Bundle f41631a;

        static {
            Covode.recordClassIndex(19824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17339p(Bundle bundle) {
            super(3);
            this.f41631a = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27661c(aVar2, this.f41631a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$q */
    public static final class C17340q extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17340q f41632a = new C17340q();

        static {
            Covode.recordClassIndex(19825);
        }

        C17340q() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27671l(aVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$r */
    public static final class C17341r extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17341r f41633a = new C17341r();

        static {
            Covode.recordClassIndex(19826);
        }

        C17341r() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27672m(aVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$s */
    public static final class C17342s extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Bundle f41634a;

        static {
            Covode.recordClassIndex(19827);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17342s(Bundle bundle) {
            super(3);
            this.f41634a = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27666g(aVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$t */
    public static final class C17343t extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17343t f41635a = new C17343t();

        static {
            Covode.recordClassIndex(19828);
        }

        C17343t() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27673n(aVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$u */
    public static final class C17344u extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17344u f41636a = new C17344u();

        static {
            Covode.recordClassIndex(19829);
        }

        C17344u() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27674o(aVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$v */
    public static final class C17345v extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17345v f41637a = new C17345v();

        static {
            Covode.recordClassIndex(19830);
        }

        C17345v() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27675p(aVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$w */
    public static final class C17346w extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Bundle f41638a;

        static {
            Covode.recordClassIndex(19831);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17346w(Bundle bundle) {
            super(3);
            this.f41638a = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27663d(aVar2, this.f41638a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$x */
    public static final class C17347x extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17347x f41639a = new C17347x();

        static {
            Covode.recordClassIndex(19832);
        }

        C17347x() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27676q(aVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$y */
    public static final class C17348y extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        public static final C17348y f41640a = new C17348y();

        static {
            Covode.recordClassIndex(19833);
        }

        C17348y() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27677r(aVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$z */
    public static final class C17349z extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Configuration f41641a;

        static {
            Covode.recordClassIndex(19834);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17349z(Configuration configuration) {
            super(3);
            this.f41641a = configuration;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC17315b bVar, ActivityC17312a aVar, C89391z zVar) {
            AbstractC17315b bVar2 = bVar;
            ActivityC17312a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            bVar2.mo27652a(aVar2, this.f41641a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.foundation.activity.c$aa */
    public static final class C17319aa extends AbstractC89220m implements AbstractC89187q<AbstractC17315b, ActivityC17312a, Boolean, Boolean> {

        /* renamed from: a */
        final /* synthetic */ int f41605a;

        /* renamed from: b */
        final /* synthetic */ KeyEvent f41606b;

        static {
            Covode.recordClassIndex(19804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17319aa(int i, KeyEvent keyEvent) {
            super(3);
            this.f41605a = i;
            this.f41606b = keyEvent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ Boolean invoke(AbstractC17315b bVar, ActivityC17312a aVar, Boolean bool) {
            AbstractC17315b bVar2 = bVar;
            Boolean bool2 = bool;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar, "");
            boolean z = false;
            if (bVar2.mo27655a(this.f41605a, this.f41606b) || (bool2 != null && bool2.booleanValue())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:9:0x0023 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x0059 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: ? super T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v7, resolved type: ? super T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: ? super T */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T> T mo27678a(Activity activity, boolean z, T t, AbstractC89187q<? super AbstractC17315b, ? super ActivityC17312a, ? super T, ? extends T> qVar) {
        if (!(activity instanceof ActivityC17312a)) {
            activity = null;
        }
        ActivityC17312a aVar = (ActivityC17312a) activity;
        if (aVar != null) {
            Iterator<AbstractC17315b> it = this.f41603a.iterator();
            t = t;
            while (it.hasNext()) {
                AbstractC17315b next = it.next();
                C89219l.m154716b(next, "");
                t = (Object) qVar.invoke(next, aVar, t);
            }
            if (z) {
                t = t;
                for (AbstractC17368c cVar : aVar.getViewModel().getProcessors()) {
                    t = (Object) qVar.invoke(cVar, aVar, t);
                }
            }
            if (aVar.innerProcessors != null) {
                t = t;
                for (AbstractC17350d dVar : aVar.innerProcessors) {
                    t = (Object) qVar.invoke(dVar, aVar, t);
                }
            }
        }
        return t;
    }

    /* renamed from: a */
    static /* synthetic */ Object m32099a(C17317c cVar, Activity activity, boolean z, Object obj, AbstractC89187q qVar, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return cVar.mo27678a(activity, z, obj, qVar);
    }
}
