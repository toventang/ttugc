package com.bytedance.librarian.elf;

public interface Elf {

    public static abstract class DynamicStructure {

        /* renamed from: a */
        public long f48917a;

        /* renamed from: b */
        public long f48918b;
    }

    public static abstract class Header {

        /* renamed from: a */
        public boolean f48919a;

        /* renamed from: b */
        public int f48920b;

        /* renamed from: c */
        public long f48921c;

        /* renamed from: d */
        public long f48922d;

        /* renamed from: e */
        public int f48923e;

        /* renamed from: f */
        public int f48924f;

        /* renamed from: g */
        public int f48925g;

        /* renamed from: h */
        public int f48926h;

        /* renamed from: i */
        public int f48927i;

        /* renamed from: a */
        public abstract DynamicStructure mo34117a(long j, int i);

        /* renamed from: a */
        public abstract ProgramHeader mo34118a(long j);

        /* renamed from: a */
        public abstract SectionHeader mo34119a();
    }

    public static abstract class ProgramHeader {

        /* renamed from: a */
        public long f48928a;

        /* renamed from: b */
        public long f48929b;

        /* renamed from: c */
        public long f48930c;

        /* renamed from: d */
        public long f48931d;
    }

    public static abstract class SectionHeader {

        /* renamed from: a */
        public long f48932a;
    }
}
