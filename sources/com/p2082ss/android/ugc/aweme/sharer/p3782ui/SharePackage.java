package com.p2082ss.android.ugc.aweme.sharer.p3782ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69650k;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88974o;
import p4560f.p4561a.AbstractC88976q;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.SharePackage */
public class SharePackage implements Parcelable {
    public static final Parcelable.Creator<SharePackage> CREATOR = new C69656c();

    /* renamed from: k */
    public static final C69655b f155486k = new C69655b((byte) 0);

    /* renamed from: d */
    public final String f155487d;

    /* renamed from: e */
    public final String f155488e;

    /* renamed from: f */
    public final String f155489f;

    /* renamed from: g */
    public final String f155490g;

    /* renamed from: h */
    public final String f155491h;

    /* renamed from: i */
    public final Bundle f155492i;

    /* renamed from: j */
    public final C69654a f155493j;

    /* renamed from: a */
    public boolean mo109321a(AbstractC69581b bVar, Context context) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(context, "");
        return false;
    }

    /* renamed from: a */
    public boolean mo109574a(AbstractC69693h hVar, Context context) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(context, "");
        return false;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.SharePackage$b */
    public static final class C69655b {
        static {
            Covode.recordClassIndex(82028);
        }

        private C69655b() {
        }

        public /* synthetic */ C69655b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.SharePackage$c */
    public static final class C69656c implements Parcelable.Creator<SharePackage> {
        static {
            Covode.recordClassIndex(82029);
        }

        C69656c() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SharePackage[] newArray(int i) {
            return new SharePackage[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SharePackage createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            C69654a aVar = new C69654a();
            C89219l.m154721d(parcel, "");
            aVar.f155494a = parcel.readString();
            aVar.f155495b = parcel.readString();
            aVar.f155496c = parcel.readString();
            aVar.f155497d = parcel.readString();
            aVar.f155498e = parcel.readString();
            aVar.f155499f.putAll(parcel.readBundle(aVar.getClass().getClassLoader()));
            return new SharePackage(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.SharePackage$a */
    public static class C69654a {

        /* renamed from: a */
        public String f155494a;

        /* renamed from: b */
        public String f155495b;

        /* renamed from: c */
        public String f155496c;

        /* renamed from: d */
        public String f155497d;

        /* renamed from: e */
        public String f155498e;

        /* renamed from: f */
        public final Bundle f155499f = new Bundle();

        static {
            Covode.recordClassIndex(82027);
        }

        /* renamed from: a */
        public final SharePackage mo109805a() {
            return new SharePackage(this);
        }

        /* renamed from: a */
        public final C69654a mo109803a(String str) {
            C89219l.m154721d(str, "");
            this.f155494a = str;
            return this;
        }

        /* renamed from: b */
        public final C69654a mo109806b(String str) {
            C89219l.m154721d(str, "");
            this.f155495b = str;
            return this;
        }

        /* renamed from: c */
        public final C69654a mo109807c(String str) {
            C89219l.m154721d(str, "");
            this.f155496c = str;
            return this;
        }

        /* renamed from: d */
        public final C69654a mo109808d(String str) {
            C89219l.m154721d(str, "");
            this.f155497d = str;
            return this;
        }

        /* renamed from: e */
        public final C69654a mo109809e(String str) {
            C89219l.m154721d(str, "");
            this.f155498e = str;
            return this;
        }

        /* renamed from: a */
        public final C69654a mo109804a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f155499f.putString(str, str2);
            return this;
        }
    }

    static {
        Covode.recordClassIndex(82026);
    }

    /* renamed from: a */
    public AbstractC69645h mo87088a(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        return new C69650k(this.f155491h, null, null, 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.SharePackage$d */
    static final class C69657d<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ SharePackage f155500a;

        /* renamed from: b */
        final /* synthetic */ AbstractC69581b f155501b;

        static {
            Covode.recordClassIndex(82030);
        }

        C69657d(SharePackage sharePackage, AbstractC69581b bVar) {
            this.f155500a = sharePackage;
            this.f155501b = bVar;
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<AbstractC69645h> oVar) {
            C89219l.m154721d(oVar, "");
            oVar.mo143049a(this.f155500a.mo87088a(this.f155501b));
        }
    }

    /* renamed from: b */
    public AbstractC88973n<AbstractC69645h> mo109580b(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        AbstractC88973n<AbstractC69645h> a = AbstractC88973n.m154243a((AbstractC88976q) new C69657d(this, bVar));
        C89219l.m154716b(a, "");
        return a;
    }

    public SharePackage(C69654a aVar) {
        String str = "";
        C89219l.m154721d(aVar, str);
        this.f155493j = aVar;
        Bundle bundle = new Bundle();
        this.f155492i = bundle;
        String str2 = aVar.f155494a;
        if (str2 == null) {
            C89219l.m154715b();
        }
        this.f155487d = str2;
        String str3 = aVar.f155495b;
        this.f155488e = str3 == null ? str : str3;
        String str4 = aVar.f155496c;
        this.f155489f = str4 == null ? str : str4;
        String str5 = aVar.f155497d;
        this.f155490g = str5 == null ? str : str5;
        String str6 = aVar.f155498e;
        this.f155491h = str6 != null ? str6 : str;
        bundle.putAll(aVar.f155499f);
    }

    /* renamed from: a */
    public void mo109572a(AbstractC69581b bVar, AbstractC89172b<? super AbstractC69645h, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        bVar2.invoke(mo87088a(bVar));
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeString(this.f155487d);
            parcel.writeString(this.f155488e);
            parcel.writeString(this.f155489f);
            parcel.writeString(this.f155490g);
            parcel.writeString(this.f155491h);
            parcel.writeBundle(this.f155492i);
        }
    }

    /* renamed from: a */
    public void mo109570a(Context context, AbstractC69581b bVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(context, "");
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: a */
    public boolean mo109573a(AbstractC69581b bVar, Context context, AbstractC89172b<? super Boolean, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar2, "");
        return mo109321a(bVar, context);
    }
}
