package com.bytedance.ies.powerlist.debug;

import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.debug.Dr */
public final class C17648Dr {

    /* renamed from: a */
    public static C17651a f42203a;

    /* renamed from: b */
    public static boolean f42204b;

    /* renamed from: c */
    public static final C17648Dr f42205c = new C17648Dr();

    /* renamed from: com.bytedance.ies.powerlist.debug.Dr$Tracker */
    public static final class Tracker implements Parcelable {
        public static final C17649a CREATOR = new C17649a((byte) 0);

        /* renamed from: a */
        public final AbstractC89244h f42206a;

        /* renamed from: b */
        public long f42207b;

        /* renamed from: c */
        public long f42208c;

        /* renamed from: d */
        public long f42209d;

        /* renamed from: e */
        public long f42210e;

        /* renamed from: f */
        public int f42211f;

        /* renamed from: g */
        public int f42212g;

        /* renamed from: h */
        public int f42213h;

        /* renamed from: i */
        private int f42214i;

        static {
            Covode.recordClassIndex(20202);
        }

        public final int describeContents() {
            return 0;
        }

        /* renamed from: com.bytedance.ies.powerlist.debug.Dr$Tracker$a */
        public static final class C17649a implements Parcelable.Creator<Tracker> {
            static {
                Covode.recordClassIndex(20203);
            }

            private C17649a() {
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Tracker[] newArray(int i) {
                return new Tracker[i];
            }

            public /* synthetic */ C17649a(byte b) {
                this();
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Tracker createFromParcel(Parcel parcel) {
                C89219l.m154719c(parcel, "");
                return new Tracker(parcel);
            }
        }

        /* renamed from: com.bytedance.ies.powerlist.debug.Dr$Tracker$b */
        static final class C17650b extends AbstractC89220m implements AbstractC89171a<Thread> {

            /* renamed from: a */
            public static final C17650b f42215a = new C17650b();

            static {
                Covode.recordClassIndex(20204);
            }

            C17650b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Thread invoke() {
                Looper mainLooper = Looper.getMainLooper();
                C89219l.m154709a((Object) mainLooper, "");
                return mainLooper.getThread();
            }
        }

        public Tracker() {
            this.f42206a = C89250i.m154773a((AbstractC89171a) C17650b.f42215a);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Tracker(Parcel parcel) {
            this();
            C89219l.m154719c(parcel, "");
            this.f42207b = parcel.readLong();
            this.f42208c = parcel.readLong();
            this.f42209d = parcel.readLong();
            this.f42210e = parcel.readLong();
            this.f42211f = parcel.readInt();
            this.f42212g = parcel.readInt();
            this.f42213h = parcel.readInt();
            this.f42214i = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154719c(parcel, "");
            parcel.writeLong(this.f42207b);
            parcel.writeLong(this.f42208c);
            parcel.writeLong(this.f42209d);
            parcel.writeLong(this.f42210e);
            parcel.writeInt(this.f42211f);
            parcel.writeInt(this.f42212g);
            parcel.writeInt(this.f42213h);
            parcel.writeInt(this.f42214i);
        }
    }

    private C17648Dr() {
    }

    static {
        Covode.recordClassIndex(20201);
    }
}
