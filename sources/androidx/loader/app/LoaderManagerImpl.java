package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import androidx.core.p036g.C0689b;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.C1213t;
import androidx.loader.app.AbstractC1247a;
import androidx.loader.p062a.C1232c;
import androidx.p025c.C0498h;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* access modifiers changed from: package-private */
public final class LoaderManagerImpl extends AbstractC1247a {

    /* renamed from: a */
    static boolean f4075a;

    /* renamed from: b */
    private final AbstractC1204m f4076b;

    /* renamed from: c */
    private final LoaderViewModel f4077c;

    static {
        Covode.recordClassIndex(1351);
    }

    /* renamed from: androidx.loader.app.LoaderManagerImpl$a */
    public static class C1245a<D> extends C1213t<D> implements C1232c.AbstractC1234b<D> {

        /* renamed from: a */
        final int f4081a;

        /* renamed from: b */
        final Bundle f4082b;

        /* renamed from: c */
        public final C1232c<D> f4083c;

        /* renamed from: d */
        C1246b<D> f4084d;

        /* renamed from: e */
        private AbstractC1204m f4085e;

        /* renamed from: f */
        private C1232c<D> f4086f = null;

        static {
            Covode.recordClassIndex(1354);
        }

        @Override // androidx.lifecycle.LiveData
        public final void onActive() {
            this.f4083c.mo4079j();
        }

        @Override // androidx.lifecycle.LiveData
        public final void onInactive() {
            this.f4083c.mo4082m();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4104a() {
            AbstractC1204m mVar = this.f4085e;
            C1246b<D> bVar = this.f4084d;
            if (mVar != null && bVar != null) {
                super.removeObserver(bVar);
                observe(mVar, bVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final C1232c<D> mo4105b() {
            this.f4083c.mo4080k();
            this.f4083c.f4052r = true;
            C1246b<D> bVar = this.f4084d;
            if (bVar != null) {
                removeObserver(bVar);
                bVar.mo4107a();
            }
            this.f4083c.mo4078a(this);
            this.f4083c.mo4083n();
            return this.f4086f;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f4081a);
            sb.append(" : ");
            C0689b.m2445a(this.f4083c, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.lifecycle.u<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public final void removeObserver(AbstractC1214u<? super D> uVar) {
            super.removeObserver(uVar);
            this.f4085e = null;
            this.f4084d = null;
        }

        @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
        public final void setValue(D d) {
            super.setValue(d);
            C1232c<D> cVar = this.f4086f;
            if (cVar != null) {
                cVar.mo4083n();
                this.f4086f = null;
            }
        }

        @Override // androidx.loader.p062a.C1232c.AbstractC1234b
        /* renamed from: a */
        public final void mo4088a(D d) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d);
            } else {
                postValue(d);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C1232c<D> mo4103a(AbstractC1204m mVar, AbstractC1247a.AbstractC1248a<D> aVar) {
            C1246b<D> bVar = new C1246b<>(this.f4083c, aVar);
            observe(mVar, bVar);
            C1246b<D> bVar2 = this.f4084d;
            if (bVar2 != null) {
                removeObserver(bVar2);
            }
            this.f4085e = mVar;
            this.f4084d = bVar;
            return this.f4083c;
        }

        C1245a(int i, Bundle bundle, C1232c<D> cVar) {
            this.f4081a = i;
            this.f4082b = bundle;
            this.f4083c = cVar;
            if (cVar.f4049o == null) {
                cVar.f4049o = this;
                cVar.f4048n = i;
                return;
            }
            throw new IllegalStateException("There is already a listener registered");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.loader.app.LoaderManagerImpl$b */
    public static class C1246b<D> implements AbstractC1214u<D> {

        /* renamed from: a */
        public boolean f4087a;

        /* renamed from: b */
        private final C1232c<D> f4088b;

        /* renamed from: c */
        private final AbstractC1247a.AbstractC1248a<D> f4089c;

        static {
            Covode.recordClassIndex(1355);
        }

        public final String toString() {
            return this.f4089c.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4107a() {
            if (this.f4087a) {
                this.f4089c.mo4110a();
            }
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final void onChanged(D d) {
            if (LoaderManagerImpl.f4075a) {
                C1232c.m3954c(d);
            }
            this.f4089c.mo4111a((Object) d);
            this.f4087a = true;
        }

        C1246b(C1232c<D> cVar, AbstractC1247a.AbstractC1248a<D> aVar) {
            this.f4088b = cVar;
            this.f4089c = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static class LoaderViewModel extends AbstractC1174ac {

        /* renamed from: a */
        static final C1175ad.AbstractC1177b f4078a = new C1175ad.AbstractC1177b() {
            /* class androidx.loader.app.LoaderManagerImpl.LoaderViewModel.C12441 */

            static {
                Covode.recordClassIndex(1353);
            }

            @Override // androidx.lifecycle.C1175ad.AbstractC1177b
            /* renamed from: a */
            public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                return new LoaderViewModel();
            }
        };

        /* renamed from: b */
        C0498h<C1245a> f4079b = new C0498h<>();

        /* renamed from: c */
        public boolean f4080c = false;

        static {
            Covode.recordClassIndex(1352);
        }

        LoaderViewModel() {
        }

        @Override // androidx.lifecycle.AbstractC1174ac
        public void onCleared() {
            super.onCleared();
            int b = this.f4079b.mo2184b();
            for (int i = 0; i < b; i++) {
                this.f4079b.mo2190d(i).mo4105b();
            }
            C0498h<C1245a> hVar = this.f4079b;
            int i2 = hVar.f1889c;
            Object[] objArr = hVar.f1888b;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            hVar.f1889c = 0;
            hVar.f1887a = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final <D> C1245a<D> mo4102a(int i) {
            return this.f4079b.mo2183a(i, null);
        }
    }

    @Override // androidx.loader.app.AbstractC1247a
    /* renamed from: a */
    public final void mo4098a() {
        LoaderViewModel loaderViewModel = this.f4077c;
        int b = loaderViewModel.f4079b.mo2184b();
        for (int i = 0; i < b; i++) {
            loaderViewModel.f4079b.mo2190d(i).mo4104a();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0689b.m2445a(this.f4076b, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // androidx.loader.app.AbstractC1247a
    /* renamed from: a */
    public final void mo4099a(int i) {
        if (this.f4077c.f4080c) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C1245a a = this.f4077c.mo4102a(i);
            if (a != null) {
                a.mo4105b();
                this.f4077c.f4079b.mo2185b(i);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    LoaderManagerImpl(AbstractC1204m mVar, C1182af afVar) {
        this.f4076b = mVar;
        this.f4077c = (LoaderViewModel) new C1175ad(afVar, LoaderViewModel.f4078a).mo3983a(LoaderViewModel.class);
    }

    @Override // androidx.loader.app.AbstractC1247a
    /* renamed from: a */
    public final <D> C1232c<D> mo4097a(int i, Bundle bundle, AbstractC1247a.AbstractC1248a<D> aVar) {
        if (this.f4077c.f4080c) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C1245a<D> a = this.f4077c.mo4102a(i);
            if (a == null) {
                return m3978b(i, bundle, aVar);
            }
            return a.mo4103a(this.f4076b, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private <D> C1232c<D> m3978b(int i, Bundle bundle, AbstractC1247a.AbstractC1248a<D> aVar) {
        try {
            this.f4077c.f4080c = true;
            C1232c<D> a = aVar.mo4109a(bundle);
            if (a == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            } else if (!a.getClass().isMemberClass() || Modifier.isStatic(a.getClass().getModifiers())) {
                C1245a aVar2 = new C1245a(i, bundle, a);
                this.f4077c.f4079b.mo2186b(i, aVar2);
                this.f4077c.f4080c = false;
                return aVar2.mo4103a(this.f4076b, aVar);
            } else {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: ".concat(String.valueOf(a)));
            }
        } catch (Throwable th) {
            this.f4077c.f4080c = false;
            throw th;
        }
    }

    @Override // androidx.loader.app.AbstractC1247a
    /* renamed from: a */
    public final void mo4100a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        LoaderViewModel loaderViewModel = this.f4077c;
        if (loaderViewModel.f4079b.mo2184b() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < loaderViewModel.f4079b.mo2184b(); i++) {
                C1245a d = loaderViewModel.f4079b.mo2190d(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(loaderViewModel.f4079b.mo2187c(i));
                printWriter.print(": ");
                printWriter.println(d.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(d.f4081a);
                printWriter.print(" mArgs=");
                printWriter.println(d.f4082b);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(d.f4083c);
                d.f4083c.mo4064a(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (d.f4084d != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(d.f4084d);
                    C1246b<D> bVar = d.f4084d;
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar.f4087a);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                printWriter.println(C1232c.m3954c(d.getValue()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(d.hasActiveObservers());
            }
        }
    }
}
