package com.p2082ss.android.socialbase.downloader.p2180c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.socialbase.downloader.model.DownloadChunk;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30298b;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.c.c */
public interface AbstractC30301c extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.c.c$a */
    public static abstract class AbstractBinderC30302a extends Binder implements AbstractC30301c {
        static {
            Covode.recordClassIndex(36814);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.c.c$a$a */
        static class C30303a implements AbstractC30301c {

            /* renamed from: a */
            public static AbstractC30301c f72278a;

            /* renamed from: b */
            private IBinder f72279b;

            static {
                Covode.recordClassIndex(36815);
            }

            public final IBinder asBinder() {
                return this.f72279b;
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: a */
            public final boolean mo53775a(int i) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.f72279b.transact(2, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53775a(i);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: a */
            public final void mo53774a(DownloadChunk downloadChunk) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (downloadChunk != null) {
                        obtain.writeInt(1);
                        downloadChunk.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f72279b.transact(11, obtain, obtain2, 0) || (cVar = f72278a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.mo53774a(downloadChunk);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: a */
            public final void mo53771a(int i, int i2, long j) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    if (this.f72279b.transact(13, obtain, obtain2, 0) || (cVar = f72278a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.mo53771a(i, i2, j);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: a */
            public final void mo53770a(int i, int i2, int i3, long j) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeLong(j);
                    if (this.f72279b.transact(14, obtain, obtain2, 0) || (cVar = f72278a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.mo53770a(i, i2, i3, j);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: a */
            public final boolean mo53776a(DownloadInfo downloadInfo) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f72279b.transact(17, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53776a(downloadInfo);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: b */
            public final void mo53783b(DownloadInfo downloadInfo) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f72279b.transact(33, obtain, obtain2, 0) || (cVar = f72278a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.mo53783b(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: a */
            public final void mo53772a(int i, List<DownloadChunk> list) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    if (this.f72279b.transact(34, obtain, obtain2, 0) || (cVar = f72278a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.mo53772a(i, list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: a */
            public final void mo53773a(AbstractC30298b bVar) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (this.f72279b.transact(36, obtain, obtain2, 0) || (cVar = f72278a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.mo53773a(bVar);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: a */
            public final void mo53768a() {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (this.f72279b.transact(1, obtain, obtain2, 0) || (cVar = f72278a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.mo53768a();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: b */
            public final List<DownloadInfo> mo53779b() {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (!this.f72279b.transact(8, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53779b();
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: c */
            public final void mo53787c() {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (this.f72279b.transact(20, obtain, obtain2, 0) || (cVar = f72278a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.mo53787c();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: e */
            public final boolean mo53793e() {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    boolean z = false;
                    if (!this.f72279b.transact(32, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53793e();
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: d */
            public final boolean mo53791d() {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    boolean z = false;
                    if (!this.f72279b.transact(31, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53791d();
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

            C30303a(IBinder iBinder) {
                this.f72279b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: d */
            public final void mo53790d(int i) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    if (this.f72279b.transact(10, obtain, obtain2, 0) || (cVar = f72278a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.mo53790d(i);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: b */
            public final DownloadInfo mo53777b(int i) {
                DownloadInfo downloadInfo;
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    if (!this.f72279b.transact(3, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53777b(i);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: f */
            public final boolean mo53795f(int i) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.f72279b.transact(19, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53795f(i);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: g */
            public final DownloadInfo mo53796g(int i) {
                DownloadInfo downloadInfo;
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    if (!this.f72279b.transact(21, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53796g(i);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: h */
            public final DownloadInfo mo53797h(int i) {
                DownloadInfo downloadInfo;
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    if (!this.f72279b.transact(25, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53797h(i);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: i */
            public final DownloadInfo mo53798i(int i) {
                DownloadInfo downloadInfo;
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    if (!this.f72279b.transact(29, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53798i(i);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: j */
            public final DownloadInfo mo53799j(int i) {
                DownloadInfo downloadInfo;
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    if (!this.f72279b.transact(30, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53799j(i);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: c */
            public final List<DownloadChunk> mo53785c(int i) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    if (!this.f72279b.transact(9, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53785c(i);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: d */
            public final List<DownloadInfo> mo53789d(String str) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.f72279b.transact(7, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53789d(str);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: e */
            public final boolean mo53794e(int i) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.f72279b.transact(18, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53794e(i);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: b */
            public final List<DownloadInfo> mo53780b(String str) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.f72279b.transact(5, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53780b(str);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: c */
            public final List<DownloadInfo> mo53786c(String str) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.f72279b.transact(6, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53786c(str);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: a */
            public final List<DownloadInfo> mo53767a(String str) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.f72279b.transact(4, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53767a(str);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: b */
            public final void mo53782b(DownloadChunk downloadChunk) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (downloadChunk != null) {
                        obtain.writeInt(1);
                        downloadChunk.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f72279b.transact(12, obtain, obtain2, 0) || (cVar = f72278a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.mo53782b(downloadChunk);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: a */
            public final DownloadInfo mo53764a(int i, int i2) {
                DownloadInfo downloadInfo;
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.f72279b.transact(16, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53764a(i, i2);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: c */
            public final DownloadInfo mo53784c(int i, long j) {
                DownloadInfo downloadInfo;
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    if (!this.f72279b.transact(26, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53784c(i, j);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: d */
            public final DownloadInfo mo53788d(int i, long j) {
                DownloadInfo downloadInfo;
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    if (!this.f72279b.transact(27, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53788d(i, j);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: e */
            public final DownloadInfo mo53792e(int i, long j) {
                DownloadInfo downloadInfo;
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    if (!this.f72279b.transact(28, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53792e(i, j);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: a */
            public final DownloadInfo mo53765a(int i, long j) {
                DownloadInfo downloadInfo;
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    if (!this.f72279b.transact(23, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53765a(i, j);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: b */
            public final DownloadInfo mo53778b(int i, long j) {
                DownloadInfo downloadInfo;
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    if (!this.f72279b.transact(24, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53778b(i, j);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: b */
            public final void mo53781b(int i, List<DownloadChunk> list) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    if (this.f72279b.transact(35, obtain, obtain2, 0) || (cVar = f72278a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.mo53781b(i, list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: a */
            public final DownloadInfo mo53766a(int i, long j, String str, String str2) {
                DownloadInfo downloadInfo;
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f72279b.transact(22, obtain, obtain2, 0) && (cVar = f72278a) != null) {
                        return cVar.mo53766a(i, j, str, str2);
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

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
            /* renamed from: a */
            public final void mo53769a(int i, int i2, int i3, int i4) {
                AbstractC30301c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    if (this.f72279b.transact(15, obtain, obtain2, 0) || (cVar = f72278a) == null) {
                        obtain2.readException();
                    } else {
                        cVar.mo53769a(i, i2, i3, i4);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC30302a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                DownloadChunk downloadChunk = null;
                AbstractC30298b aVar = null;
                DownloadInfo downloadInfo = null;
                DownloadInfo downloadInfo2 = null;
                DownloadChunk downloadChunk2 = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        mo53768a();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean a = mo53775a(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(a ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo b = mo53777b(parcel.readInt());
                        parcel2.writeNoException();
                        if (b != null) {
                            parcel2.writeInt(1);
                            b.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> a2 = mo53767a(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(a2);
                        return true;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> b2 = mo53780b(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(b2);
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> c = mo53786c(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(c);
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> d = mo53789d(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(d);
                        return true;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> b3 = mo53779b();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(b3);
                        return true;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadChunk> c2 = mo53785c(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(c2);
                        return true;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        mo53790d(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        if (parcel.readInt() != 0) {
                            downloadChunk = DownloadChunk.CREATOR.createFromParcel(parcel);
                        }
                        mo53774a(downloadChunk);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        if (parcel.readInt() != 0) {
                            downloadChunk2 = DownloadChunk.CREATOR.createFromParcel(parcel);
                        }
                        mo53782b(downloadChunk2);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        mo53771a(parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_SELECT_SCENE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        mo53770a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        mo53769a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo a3 = mo53764a(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (a3 != null) {
                            parcel2.writeInt(1);
                            a3.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 17:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        if (parcel.readInt() != 0) {
                            downloadInfo2 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        boolean a4 = mo53776a(downloadInfo2);
                        parcel2.writeNoException();
                        parcel2.writeInt(a4 ? 1 : 0);
                        return true;
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean e = mo53794e(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(e ? 1 : 0);
                        return true;
                    case 19:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean f = mo53795f(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(f ? 1 : 0);
                        return true;
                    case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        mo53787c();
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo g = mo53796g(parcel.readInt());
                        parcel2.writeNoException();
                        if (g != null) {
                            parcel2.writeInt(1);
                            g.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 22:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo a5 = mo53766a(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (a5 != null) {
                            parcel2.writeInt(1);
                            a5.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 23:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo a6 = mo53765a(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (a6 != null) {
                            parcel2.writeInt(1);
                            a6.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 24:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo b4 = mo53778b(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (b4 != null) {
                            parcel2.writeInt(1);
                            b4.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 25:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo h = mo53797h(parcel.readInt());
                        parcel2.writeNoException();
                        if (h != null) {
                            parcel2.writeInt(1);
                            h.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 26:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo c3 = mo53784c(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (c3 != null) {
                            parcel2.writeInt(1);
                            c3.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 27:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo d2 = mo53788d(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (d2 != null) {
                            parcel2.writeInt(1);
                            d2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 28:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo e2 = mo53792e(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (e2 != null) {
                            parcel2.writeInt(1);
                            e2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 29:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo i3 = mo53798i(parcel.readInt());
                        parcel2.writeNoException();
                        if (i3 != null) {
                            parcel2.writeInt(1);
                            i3.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 30:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo j = mo53799j(parcel.readInt());
                        parcel2.writeNoException();
                        if (j != null) {
                            parcel2.writeInt(1);
                            j.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 31:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean d3 = mo53791d();
                        parcel2.writeNoException();
                        parcel2.writeInt(d3 ? 1 : 0);
                        return true;
                    case 32:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean e3 = mo53793e();
                        parcel2.writeNoException();
                        parcel2.writeInt(e3 ? 1 : 0);
                        return true;
                    case 33:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        if (parcel.readInt() != 0) {
                            downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        mo53783b(downloadInfo);
                        parcel2.writeNoException();
                        return true;
                    case 34:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        mo53772a(parcel.readInt(), parcel.createTypedArrayList(DownloadChunk.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 35:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        mo53781b(parcel.readInt(), parcel.createTypedArrayList(DownloadChunk.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 36:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30298b)) {
                                aVar = new AbstractC30298b.AbstractBinderC30299a.C30300a(readStrongBinder);
                            } else {
                                aVar = (AbstractC30298b) queryLocalInterface;
                            }
                        }
                        mo53773a(aVar);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36813);
    }

    /* renamed from: a */
    DownloadInfo mo53764a(int i, int i2);

    /* renamed from: a */
    DownloadInfo mo53765a(int i, long j);

    /* renamed from: a */
    DownloadInfo mo53766a(int i, long j, String str, String str2);

    /* renamed from: a */
    List<DownloadInfo> mo53767a(String str);

    /* renamed from: a */
    void mo53768a();

    /* renamed from: a */
    void mo53769a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo53770a(int i, int i2, int i3, long j);

    /* renamed from: a */
    void mo53771a(int i, int i2, long j);

    /* renamed from: a */
    void mo53772a(int i, List<DownloadChunk> list);

    /* renamed from: a */
    void mo53773a(AbstractC30298b bVar);

    /* renamed from: a */
    void mo53774a(DownloadChunk downloadChunk);

    /* renamed from: a */
    boolean mo53775a(int i);

    /* renamed from: a */
    boolean mo53776a(DownloadInfo downloadInfo);

    /* renamed from: b */
    DownloadInfo mo53777b(int i);

    /* renamed from: b */
    DownloadInfo mo53778b(int i, long j);

    /* renamed from: b */
    List<DownloadInfo> mo53779b();

    /* renamed from: b */
    List<DownloadInfo> mo53780b(String str);

    /* renamed from: b */
    void mo53781b(int i, List<DownloadChunk> list);

    /* renamed from: b */
    void mo53782b(DownloadChunk downloadChunk);

    /* renamed from: b */
    void mo53783b(DownloadInfo downloadInfo);

    /* renamed from: c */
    DownloadInfo mo53784c(int i, long j);

    /* renamed from: c */
    List<DownloadChunk> mo53785c(int i);

    /* renamed from: c */
    List<DownloadInfo> mo53786c(String str);

    /* renamed from: c */
    void mo53787c();

    /* renamed from: d */
    DownloadInfo mo53788d(int i, long j);

    /* renamed from: d */
    List<DownloadInfo> mo53789d(String str);

    /* renamed from: d */
    void mo53790d(int i);

    /* renamed from: d */
    boolean mo53791d();

    /* renamed from: e */
    DownloadInfo mo53792e(int i, long j);

    /* renamed from: e */
    boolean mo53793e();

    /* renamed from: e */
    boolean mo53794e(int i);

    /* renamed from: f */
    boolean mo53795f(int i);

    /* renamed from: g */
    DownloadInfo mo53796g(int i);

    /* renamed from: h */
    DownloadInfo mo53797h(int i);

    /* renamed from: i */
    DownloadInfo mo53798i(int i);

    /* renamed from: j */
    DownloadInfo mo53799j(int i);
}
