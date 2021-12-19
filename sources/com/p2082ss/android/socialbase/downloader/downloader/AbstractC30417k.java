package com.p2082ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30334ab;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30342af;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30353e;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30390x;
import com.p2082ss.android.socialbase.downloader.model.AbstractC30589a;
import com.p2082ss.android.socialbase.downloader.model.DownloadChunk;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.k */
public interface AbstractC30417k extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.downloader.k$a */
    public static abstract class AbstractBinderC30418a extends Binder implements AbstractC30417k {
        static {
            Covode.recordClassIndex(36937);
        }

        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.socialbase.downloader.downloader.k$a$a */
        public static class C30419a implements AbstractC30417k {

            /* renamed from: a */
            public static AbstractC30417k f72545a;

            /* renamed from: b */
            private IBinder f72546b;

            static {
                Covode.recordClassIndex(36938);
            }

            public final IBinder asBinder() {
                return this.f72546b;
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54100a(AbstractC30589a aVar) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f72546b.transact(1, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54100a(aVar);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54096a(int i, boolean z) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (this.f72546b.transact(3, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54096a(i, z);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: b */
            public final boolean mo54111b(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.f72546b.transact(4, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54111b(i);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54101a(List<String> list) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStringList(list);
                    if (this.f72546b.transact(20, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54101a(list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: b */
            public final void mo54110b(List<String> list) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStringList(list);
                    if (this.f72546b.transact(21, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54110b(list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54097a(int i, boolean z, boolean z2) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    int i2 = 1;
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    if (this.f72546b.transact(22, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54097a(i, z, z2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54090a(int i, int i2, AbstractC30359g gVar, int i3, boolean z) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    obtain.writeInt(i3);
                    obtain.writeInt(z ? 1 : 0);
                    if (this.f72546b.transact(25, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54090a(i, i2, gVar, i3, z);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54091a(int i, int i2, AbstractC30359g gVar, int i3, boolean z, boolean z2) {
                Throwable th;
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    obtain.writeInt(i3);
                    int i4 = 1;
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i4 = 0;
                    }
                    obtain.writeInt(i4);
                    try {
                        if (this.f72546b.transact(27, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                            obtain2.readException();
                        } else {
                            kVar.mo54091a(i, i2, gVar, i3, z, z2);
                        }
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th2) {
                        th = th2;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final boolean mo54103a(DownloadInfo downloadInfo) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f72546b.transact(28, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54103a(downloadInfo);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54093a(int i, Notification notification) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f72546b.transact(29, obtain, null, 1) || (kVar = f72545a) == null) {
                        obtain.recycle();
                    } else {
                        kVar.mo54093a(i, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54102a(boolean z) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(z ? 1 : 0);
                    if (this.f72546b.transact(30, obtain, null, 1) || (kVar = f72545a) == null) {
                        obtain.recycle();
                    } else {
                        kVar.mo54102a(z);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54099a(DownloadChunk downloadChunk) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (downloadChunk != null) {
                        obtain.writeInt(1);
                        downloadChunk.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f72546b.transact(38, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54099a(downloadChunk);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: b */
            public final boolean mo54112b(DownloadInfo downloadInfo) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f72546b.transact(39, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54112b(downloadInfo);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54089a(int i, int i2, long j) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    if (this.f72546b.transact(42, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54089a(i, i2, j);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54088a(int i, int i2, int i3, long j) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeLong(j);
                    if (this.f72546b.transact(43, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54088a(i, i2, i3, j);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54095a(int i, List<DownloadChunk> list) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    if (this.f72546b.transact(47, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54095a(i, list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54098a(AbstractC30342af afVar) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    if (this.f72546b.transact(49, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54098a(afVar);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54094a(int i, AbstractC30390x xVar) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(xVar != null ? xVar.asBinder() : null);
                    if (this.f72546b.transact(53, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54094a(i, xVar);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54092a(int i, long j) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    if (this.f72546b.transact(56, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54092a(i, j);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54084a() {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (this.f72546b.transact(7, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54084a();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: b */
            public final List<DownloadInfo> mo54105b() {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (!this.f72546b.transact(19, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54105b();
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: f */
            public final boolean mo54124f() {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    if (!this.f72546b.transact(55, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54124f();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: d */
            public final boolean mo54119d() {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    if (!this.f72546b.transact(35, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54119d();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: e */
            public final void mo54122e() {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (this.f72546b.transact(46, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54122e();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: c */
            public final boolean mo54116c() {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    if (!this.f72546b.transact(31, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54116c();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C30419a(IBinder iBinder) {
                this.f72546b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: c */
            public final void mo54114c(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (this.f72546b.transact(5, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54114c(i);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: d */
            public final void mo54118d(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (this.f72546b.transact(6, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54118d(i);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: e */
            public final long mo54120e(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (!this.f72546b.transact(8, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54120e(i);
                    }
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    obtain2.recycle();
                    obtain.recycle();
                    return readLong;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: f */
            public final int mo54123f(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (!this.f72546b.transact(9, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54123f(i);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: j */
            public final void mo54128j(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (this.f72546b.transact(24, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54128j(i);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: l */
            public final void mo54130l(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (this.f72546b.transact(34, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54130l(i);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: m */
            public final int mo54131m(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (!this.f72546b.transact(37, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54131m(i);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: o */
            public final void mo54133o(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (this.f72546b.transact(41, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54133o(i);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: c */
            public final List<DownloadInfo> mo54113c(String str) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.f72546b.transact(17, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54113c(str);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: d */
            public final List<DownloadInfo> mo54117d(String str) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.f72546b.transact(18, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54117d(str);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: e */
            public final List<DownloadInfo> mo54121e(String str) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.f72546b.transact(32, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54121e(str);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: g */
            public final boolean mo54125g(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.f72546b.transact(10, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54125g(i);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: h */
            public final DownloadInfo mo54126h(int i) {
                DownloadInfo downloadInfo;
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (!this.f72546b.transact(11, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54126h(i);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: i */
            public final List<DownloadChunk> mo54127i(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (!this.f72546b.transact(13, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54127i(i);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadChunk.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: k */
            public final boolean mo54129k(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.f72546b.transact(33, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54129k(i);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: n */
            public final boolean mo54132n(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.f72546b.transact(40, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54132n(i);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: p */
            public final boolean mo54134p(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.f72546b.transact(45, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54134p(i);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: q */
            public final AbstractC30390x mo54135q(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (!this.f72546b.transact(51, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54135q(i);
                    }
                    obtain2.readException();
                    AbstractC30390x a = AbstractC30390x.AbstractBinderC30391a.m61644a(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: r */
            public final AbstractC30334ab mo54136r(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (!this.f72546b.transact(52, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54136r(i);
                    }
                    obtain2.readException();
                    AbstractC30334ab a = AbstractC30334ab.AbstractBinderC30335a.m61560a(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: s */
            public final AbstractC30353e mo54137s(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (!this.f72546b.transact(54, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54137s(i);
                    }
                    obtain2.readException();
                    AbstractC30353e a = AbstractC30353e.AbstractBinderC30354a.m61580a(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final List<DownloadInfo> mo54083a(String str) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.f72546b.transact(12, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54083a(str);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: b */
            public final List<DownloadInfo> mo54106b(String str) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.f72546b.transact(16, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54106b(str);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54085a(int i) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (this.f72546b.transact(2, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54085a(i);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final int mo54082a(String str, String str2) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f72546b.transact(14, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54082a(str, str2);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: b */
            public final DownloadInfo mo54104b(String str, String str2) {
                DownloadInfo downloadInfo;
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f72546b.transact(15, obtain, obtain2, 0) && (kVar = f72545a) != null) {
                        return kVar.mo54104b(str, str2);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: c */
            public final void mo54115c(int i, boolean z) {
                int i2;
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    if (this.f72546b.transact(36, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54115c(i, z);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54086a(int i, int i2) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (this.f72546b.transact(50, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54086a(i, i2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: b */
            public final void mo54108b(int i, List<DownloadChunk> list) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    if (this.f72546b.transact(48, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54108b(i, list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: b */
            public final void mo54109b(int i, boolean z) {
                int i2;
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    if (this.f72546b.transact(23, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54109b(i, z);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: a */
            public final void mo54087a(int i, int i2, int i3, int i4) {
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    if (this.f72546b.transact(44, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54087a(i, i2, i3, i4);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
            /* renamed from: b */
            public final void mo54107b(int i, int i2, AbstractC30359g gVar, int i3, boolean z) {
                IBinder iBinder;
                int i4;
                AbstractC30417k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (gVar != null) {
                        iBinder = gVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i3);
                    if (z) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    obtain.writeInt(i4);
                    if (this.f72546b.transact(26, obtain, obtain2, 0) || (kVar = f72545a) == null) {
                        obtain2.readException();
                    } else {
                        kVar.mo54107b(i, i2, gVar, i3, z);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC30418a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
        }

        /* renamed from: a */
        public static AbstractC30417k m61845a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30417k)) {
                return new C30419a(iBinder);
            }
            return (AbstractC30417k) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            if (i != 1598968902) {
                AbstractC30589a aVar = null;
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                IBinder iBinder3 = null;
                AbstractC30342af aVar2 = null;
                DownloadInfo downloadInfo = null;
                DownloadChunk downloadChunk = null;
                Notification notification = null;
                DownloadInfo downloadInfo2 = null;
                boolean z6 = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30589a)) {
                                aVar = new AbstractC30589a.AbstractBinderC30590a.C30591a(readStrongBinder);
                            } else {
                                aVar = (AbstractC30589a) queryLocalInterface;
                            }
                        }
                        mo54100a(aVar);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54085a(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        mo54096a(readInt, z6);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean b = mo54111b(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(b ? 1 : 0);
                        return true;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54114c(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54118d(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54084a();
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        long e = mo54120e(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeLong(e);
                        return true;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int f = mo54123f(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(f);
                        return true;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean g = mo54125g(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(g ? 1 : 0);
                        return true;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        DownloadInfo h = mo54126h(parcel.readInt());
                        parcel2.writeNoException();
                        if (h != null) {
                            parcel2.writeInt(1);
                            h.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> a = mo54083a(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(a);
                        return true;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadChunk> i3 = mo54127i(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(i3);
                        return true;
                    case ABRConfig.ABR_SELECT_SCENE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int a2 = mo54082a(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(a2);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        DownloadInfo b2 = mo54104b(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (b2 != null) {
                            parcel2.writeInt(1);
                            b2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 16:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> b3 = mo54106b(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(b3);
                        return true;
                    case 17:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> c = mo54113c(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(c);
                        return true;
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> d = mo54117d(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(d);
                        return true;
                    case 19:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> b4 = mo54105b();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(b4);
                        return true;
                    case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54101a(parcel.createStringArrayList());
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54110b(parcel.createStringArrayList());
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt2 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        mo54097a(readInt2, z, z6);
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt3 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        mo54109b(readInt3, z6);
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54128j(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 25:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt4 = parcel.readInt();
                        int readInt5 = parcel.readInt();
                        AbstractC30359g a3 = AbstractC30359g.AbstractBinderC30360a.m61597a(parcel.readStrongBinder());
                        int readInt6 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        mo54090a(readInt4, readInt5, a3, readInt6, z2);
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt7 = parcel.readInt();
                        int readInt8 = parcel.readInt();
                        AbstractC30359g a4 = AbstractC30359g.AbstractBinderC30360a.m61597a(parcel.readStrongBinder());
                        int readInt9 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        mo54107b(readInt7, readInt8, a4, readInt9, z3);
                        parcel2.writeNoException();
                        return true;
                    case 27:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt10 = parcel.readInt();
                        int readInt11 = parcel.readInt();
                        AbstractC30359g a5 = AbstractC30359g.AbstractBinderC30360a.m61597a(parcel.readStrongBinder());
                        int readInt12 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (parcel.readInt() != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        mo54091a(readInt10, readInt11, a5, readInt12, z4, z5);
                        parcel2.writeNoException();
                        return true;
                    case 28:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        if (parcel.readInt() != 0) {
                            downloadInfo2 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        boolean a6 = mo54103a(downloadInfo2);
                        parcel2.writeNoException();
                        parcel2.writeInt(a6 ? 1 : 0);
                        return true;
                    case 29:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt13 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            notification = (Notification) Notification.CREATOR.createFromParcel(parcel);
                        }
                        mo54093a(readInt13, notification);
                        return true;
                    case 30:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        mo54102a(z6);
                        return true;
                    case 31:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean c2 = mo54116c();
                        parcel2.writeNoException();
                        parcel2.writeInt(c2 ? 1 : 0);
                        return true;
                    case 32:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> e2 = mo54121e(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(e2);
                        return true;
                    case 33:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean k = mo54129k(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(k ? 1 : 0);
                        return true;
                    case 34:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54130l(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 35:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean d2 = mo54119d();
                        parcel2.writeNoException();
                        parcel2.writeInt(d2 ? 1 : 0);
                        return true;
                    case 36:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt14 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        mo54115c(readInt14, z6);
                        parcel2.writeNoException();
                        return true;
                    case 37:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int m = mo54131m(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(m);
                        return true;
                    case 38:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        if (parcel.readInt() != 0) {
                            downloadChunk = DownloadChunk.CREATOR.createFromParcel(parcel);
                        }
                        mo54099a(downloadChunk);
                        parcel2.writeNoException();
                        return true;
                    case 39:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        if (parcel.readInt() != 0) {
                            downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        boolean b5 = mo54112b(downloadInfo);
                        parcel2.writeNoException();
                        parcel2.writeInt(b5 ? 1 : 0);
                        return true;
                    case 40:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean n = mo54132n(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(n ? 1 : 0);
                        return true;
                    case 41:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54133o(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 42:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54089a(parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 43:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54088a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case BuildConfig.VERSION_CODE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54087a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 45:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean p = mo54134p(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(p ? 1 : 0);
                        return true;
                    case 46:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54122e();
                        parcel2.writeNoException();
                        return true;
                    case 47:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54095a(parcel.readInt(), parcel.createTypedArrayList(DownloadChunk.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 48:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54108b(parcel.readInt(), parcel.createTypedArrayList(DownloadChunk.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 49:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof AbstractC30342af)) {
                                aVar2 = new AbstractC30342af.AbstractBinderC30343a.C30344a(readStrongBinder2);
                            } else {
                                aVar2 = (AbstractC30342af) queryLocalInterface2;
                            }
                        }
                        mo54098a(aVar2);
                        parcel2.writeNoException();
                        return true;
                    case 50:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54086a(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 51:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        AbstractC30390x q = mo54135q(parcel.readInt());
                        parcel2.writeNoException();
                        if (q != null) {
                            iBinder3 = q.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder3);
                        return true;
                    case 52:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        AbstractC30334ab r = mo54136r(parcel.readInt());
                        parcel2.writeNoException();
                        if (r != null) {
                            iBinder2 = r.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder2);
                        return true;
                    case 53:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54094a(parcel.readInt(), AbstractC30390x.AbstractBinderC30391a.m61644a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 54:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        AbstractC30353e s = mo54137s(parcel.readInt());
                        parcel2.writeNoException();
                        if (s != null) {
                            iBinder = s.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 55:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean f2 = mo54124f();
                        parcel2.writeNoException();
                        parcel2.writeInt(f2 ? 1 : 0);
                        return true;
                    case 56:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        mo54092a(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36936);
    }

    /* renamed from: a */
    int mo54082a(String str, String str2);

    /* renamed from: a */
    List<DownloadInfo> mo54083a(String str);

    /* renamed from: a */
    void mo54084a();

    /* renamed from: a */
    void mo54085a(int i);

    /* renamed from: a */
    void mo54086a(int i, int i2);

    /* renamed from: a */
    void mo54087a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo54088a(int i, int i2, int i3, long j);

    /* renamed from: a */
    void mo54089a(int i, int i2, long j);

    /* renamed from: a */
    void mo54090a(int i, int i2, AbstractC30359g gVar, int i3, boolean z);

    /* renamed from: a */
    void mo54091a(int i, int i2, AbstractC30359g gVar, int i3, boolean z, boolean z2);

    /* renamed from: a */
    void mo54092a(int i, long j);

    /* renamed from: a */
    void mo54093a(int i, Notification notification);

    /* renamed from: a */
    void mo54094a(int i, AbstractC30390x xVar);

    /* renamed from: a */
    void mo54095a(int i, List<DownloadChunk> list);

    /* renamed from: a */
    void mo54096a(int i, boolean z);

    /* renamed from: a */
    void mo54097a(int i, boolean z, boolean z2);

    /* renamed from: a */
    void mo54098a(AbstractC30342af afVar);

    /* renamed from: a */
    void mo54099a(DownloadChunk downloadChunk);

    /* renamed from: a */
    void mo54100a(AbstractC30589a aVar);

    /* renamed from: a */
    void mo54101a(List<String> list);

    /* renamed from: a */
    void mo54102a(boolean z);

    /* renamed from: a */
    boolean mo54103a(DownloadInfo downloadInfo);

    /* renamed from: b */
    DownloadInfo mo54104b(String str, String str2);

    /* renamed from: b */
    List<DownloadInfo> mo54105b();

    /* renamed from: b */
    List<DownloadInfo> mo54106b(String str);

    /* renamed from: b */
    void mo54107b(int i, int i2, AbstractC30359g gVar, int i3, boolean z);

    /* renamed from: b */
    void mo54108b(int i, List<DownloadChunk> list);

    /* renamed from: b */
    void mo54109b(int i, boolean z);

    /* renamed from: b */
    void mo54110b(List<String> list);

    /* renamed from: b */
    boolean mo54111b(int i);

    /* renamed from: b */
    boolean mo54112b(DownloadInfo downloadInfo);

    /* renamed from: c */
    List<DownloadInfo> mo54113c(String str);

    /* renamed from: c */
    void mo54114c(int i);

    /* renamed from: c */
    void mo54115c(int i, boolean z);

    /* renamed from: c */
    boolean mo54116c();

    /* renamed from: d */
    List<DownloadInfo> mo54117d(String str);

    /* renamed from: d */
    void mo54118d(int i);

    /* renamed from: d */
    boolean mo54119d();

    /* renamed from: e */
    long mo54120e(int i);

    /* renamed from: e */
    List<DownloadInfo> mo54121e(String str);

    /* renamed from: e */
    void mo54122e();

    /* renamed from: f */
    int mo54123f(int i);

    /* renamed from: f */
    boolean mo54124f();

    /* renamed from: g */
    boolean mo54125g(int i);

    /* renamed from: h */
    DownloadInfo mo54126h(int i);

    /* renamed from: i */
    List<DownloadChunk> mo54127i(int i);

    /* renamed from: j */
    void mo54128j(int i);

    /* renamed from: k */
    boolean mo54129k(int i);

    /* renamed from: l */
    void mo54130l(int i);

    /* renamed from: m */
    int mo54131m(int i);

    /* renamed from: n */
    boolean mo54132n(int i);

    /* renamed from: o */
    void mo54133o(int i);

    /* renamed from: p */
    boolean mo54134p(int i);

    /* renamed from: q */
    AbstractC30390x mo54135q(int i);

    /* renamed from: r */
    AbstractC30334ab mo54136r(int i);

    /* renamed from: s */
    AbstractC30353e mo54137s(int i);
}
