package com.p2082ss.android.vesdk;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.VEWatermarkParam */
public class VEWatermarkParam implements Parcelable {
    public static final Parcelable.Creator<VEWatermarkParam> CREATOR = new Parcelable.Creator<VEWatermarkParam>() {
        /* class com.p2082ss.android.vesdk.VEWatermarkParam.C852941 */

        static {
            Covode.recordClassIndex(99403);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEWatermarkParam[] newArray(int i) {
            return new VEWatermarkParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEWatermarkParam createFromParcel(Parcel parcel) {
            return new VEWatermarkParam(parcel);
        }
    };
    public long duration = -1;
    private VEWatermarkEntity[] entities;
    public String extFile;
    public int height;
    public String[] images;
    public int interval;
    public VEWatermarkMask mask;
    public boolean needExtFile;
    public EnumC85399bi position = EnumC85399bi.TL_BR;
    public int rotation;
    public String[] secondHalfImages;
    public Bitmap waterMarkBitmap;
    public int width;
    public int xOffset;
    public int yOffset;

    public int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.vesdk.VEWatermarkParam$VEWatermarkMask */
    public static class VEWatermarkMask implements Parcelable {
        public static final Parcelable.Creator<VEWatermarkMask> CREATOR = new Parcelable.Creator<VEWatermarkMask>() {
            /* class com.p2082ss.android.vesdk.VEWatermarkParam.VEWatermarkMask.C852961 */

            static {
                Covode.recordClassIndex(99407);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ VEWatermarkMask[] newArray(int i) {
                return new VEWatermarkMask[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ VEWatermarkMask createFromParcel(Parcel parcel) {
                return new VEWatermarkMask(parcel);
            }
        };
        public int height;
        public String maskImage;
        public int width;
        public int xOffset;
        public int yOffset;

        public int describeContents() {
            return 0;
        }

        public VEWatermarkMask() {
        }

        static {
            Covode.recordClassIndex(99406);
        }

        protected VEWatermarkMask(Parcel parcel) {
            this.maskImage = parcel.readString();
            this.xOffset = parcel.readInt();
            this.yOffset = parcel.readInt();
            this.width = parcel.readInt();
            this.height = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.maskImage);
            parcel.writeInt(this.xOffset);
            parcel.writeInt(this.yOffset);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
        }
    }

    /* renamed from: com.ss.android.vesdk.VEWatermarkParam$VEWatermarkEntity */
    public static class VEWatermarkEntity implements Parcelable {
        public static final Parcelable.Creator<VEWatermarkEntity> CREATOR = new Parcelable.Creator<VEWatermarkEntity>() {
            /* class com.p2082ss.android.vesdk.VEWatermarkParam.VEWatermarkEntity.C852951 */

            static {
                Covode.recordClassIndex(99405);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ VEWatermarkEntity[] newArray(int i) {
                return new VEWatermarkEntity[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ VEWatermarkEntity createFromParcel(Parcel parcel) {
                return new VEWatermarkEntity(parcel);
            }
        };
        public int height;
        public String[] images;
        public int interval;
        public EnumC85399bi position = EnumC85399bi.TL_BR;
        public int rotation;
        public long sequenceIn;
        public long sequenceOut;
        public int width;
        public int xOffset;
        public int yOffset;

        public int describeContents() {
            return 0;
        }

        public VEWatermarkEntity() {
        }

        public int getPosition() {
            return this.position.ordinal();
        }

        static {
            Covode.recordClassIndex(99404);
        }

        protected VEWatermarkEntity(Parcel parcel) {
            EnumC85399bi biVar;
            this.images = parcel.createStringArray();
            this.interval = parcel.readInt();
            this.xOffset = parcel.readInt();
            this.yOffset = parcel.readInt();
            this.width = parcel.readInt();
            this.height = parcel.readInt();
            this.sequenceIn = parcel.readLong();
            this.sequenceOut = parcel.readLong();
            int readInt = parcel.readInt();
            if (readInt == -1) {
                biVar = null;
            } else {
                biVar = EnumC85399bi.values()[readInt];
            }
            this.position = biVar;
            this.rotation = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            int ordinal;
            parcel.writeStringArray(this.images);
            parcel.writeInt(this.interval);
            parcel.writeInt(this.xOffset);
            parcel.writeInt(this.yOffset);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
            parcel.writeLong(this.sequenceIn);
            parcel.writeLong(this.sequenceOut);
            EnumC85399bi biVar = this.position;
            if (biVar == null) {
                ordinal = -1;
            } else {
                ordinal = biVar.ordinal();
            }
            parcel.writeInt(ordinal);
            parcel.writeInt(this.rotation);
        }
    }

    static {
        Covode.recordClassIndex(99402);
    }

    public VEWatermarkParam() {
    }

    public String toString() {
        return " needExtFile " + this.needExtFile;
    }

    public VEWatermarkEntity[] getEntities() {
        int i;
        if (this.entities == null && this.images != null) {
            if (this.secondHalfImages != null) {
                i = 2;
            } else {
                i = 1;
            }
            this.entities = new VEWatermarkEntity[i];
            int i2 = 0;
            do {
                VEWatermarkEntity vEWatermarkEntity = new VEWatermarkEntity();
                vEWatermarkEntity.images = this.images;
                vEWatermarkEntity.interval = this.interval;
                vEWatermarkEntity.width = this.width;
                vEWatermarkEntity.height = this.height;
                vEWatermarkEntity.position = this.position;
                long j = (long) i;
                vEWatermarkEntity.sequenceIn = (this.duration * ((long) i2)) / j;
                int i3 = i2 + 1;
                vEWatermarkEntity.sequenceOut = (this.duration * ((long) i3)) / j;
                vEWatermarkEntity.rotation = this.rotation;
                vEWatermarkEntity.xOffset = this.xOffset;
                vEWatermarkEntity.yOffset = this.yOffset;
                this.entities[i2] = vEWatermarkEntity;
                i2 = i3;
            } while (i2 < i);
            if (i == 2) {
                this.entities[1].images = this.secondHalfImages;
            }
            if (this.position == EnumC85399bi.TL_BR && i == 2) {
                this.entities[0].position = EnumC85399bi.TL;
                this.entities[1].position = EnumC85399bi.BR;
            }
        }
        return this.entities;
    }

    public void setEntities(VEWatermarkEntity[] vEWatermarkEntityArr) {
        this.entities = vEWatermarkEntityArr;
    }

    protected VEWatermarkParam(Parcel parcel) {
        boolean z;
        EnumC85399bi biVar;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.needExtFile = z;
        this.extFile = parcel.readString();
        this.entities = (VEWatermarkEntity[]) parcel.createTypedArray(VEWatermarkEntity.CREATOR);
        this.mask = (VEWatermarkMask) parcel.readParcelable(VEWatermarkMask.class.getClassLoader());
        this.images = parcel.createStringArray();
        this.waterMarkBitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.secondHalfImages = parcel.createStringArray();
        this.interval = parcel.readInt();
        this.xOffset = parcel.readInt();
        this.yOffset = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.duration = parcel.readLong();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            biVar = null;
        } else {
            biVar = EnumC85399bi.values()[readInt];
        }
        this.position = biVar;
        this.rotation = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        parcel.writeByte(this.needExtFile ? (byte) 1 : 0);
        parcel.writeString(this.extFile);
        parcel.writeTypedArray(this.entities, i);
        parcel.writeParcelable(this.mask, i);
        parcel.writeStringArray(this.images);
        parcel.writeParcelable(this.waterMarkBitmap, i);
        parcel.writeStringArray(this.secondHalfImages);
        parcel.writeInt(this.interval);
        parcel.writeInt(this.xOffset);
        parcel.writeInt(this.yOffset);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        EnumC85399bi biVar = this.position;
        if (biVar == null) {
            ordinal = -1;
        } else {
            ordinal = biVar.ordinal();
        }
        parcel.writeInt(ordinal);
        parcel.writeInt(this.rotation);
    }
}
