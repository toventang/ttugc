package com.ttnet.org.chromium.base.library_loader;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.C87457f;
import java.io.IOException;

public class Linker {

    /* renamed from: b */
    static final /* synthetic */ boolean f198382b = true;

    /* renamed from: f */
    private static final Linker f198383f = new Linker();

    /* renamed from: a */
    protected final Object f198384a = new Object();

    /* renamed from: c */
    private boolean f198385c = true;

    /* renamed from: d */
    private long f198386d = -1;

    /* renamed from: e */
    private long f198387e = -1;

    private static native boolean nativeAddZipArchivePath(String str);

    private static native boolean nativeCreateSharedRelro(String str, long j, LibInfo libInfo);

    private static native long nativeGetRandomBaseLoadAddress();

    private static native boolean nativeLoadLibrary(String str, long j, LibInfo libInfo);

    private static native boolean nativeUseSharedRelro(String str, LibInfo libInfo);

    static class LibInfo implements Parcelable {
        public static final Parcelable.Creator<LibInfo> CREATOR = new Parcelable.Creator<LibInfo>() {
            /* class com.ttnet.org.chromium.base.library_loader.Linker.LibInfo.C874661 */

            static {
                Covode.recordClassIndex(103406);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ LibInfo[] newArray(int i) {
                return new LibInfo[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ LibInfo createFromParcel(Parcel parcel) {
                return new LibInfo(parcel);
            }
        };
        public long mLoadAddress;
        public long mLoadSize;
        public int mRelroFd = -1;
        public long mRelroSize;
        public long mRelroStart;

        public int describeContents() {
            return 1;
        }

        LibInfo() {
        }

        static {
            Covode.recordClassIndex(103405);
        }

        LibInfo(Parcel parcel) {
            this.mLoadAddress = parcel.readLong();
            this.mLoadSize = parcel.readLong();
            this.mRelroStart = parcel.readLong();
            this.mRelroSize = parcel.readLong();
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            if (parcelFileDescriptor != null) {
                this.mRelroFd = parcelFileDescriptor.detachFd();
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (this.mRelroFd >= 0) {
                parcel.writeLong(this.mLoadAddress);
                parcel.writeLong(this.mLoadSize);
                parcel.writeLong(this.mRelroStart);
                parcel.writeLong(this.mRelroSize);
                try {
                    ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(this.mRelroFd);
                    fromFd.writeToParcel(parcel, 0);
                    fromFd.close();
                } catch (IOException e) {
                    C87457f.m151789c("LibraryLoader", "Can't write LibInfo file descriptor to parcel", e);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(103404);
    }

    private Linker() {
        if (!f198382b && !C87467a.f198388a) {
            throw new AssertionError();
        }
    }
}
