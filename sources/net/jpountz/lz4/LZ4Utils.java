package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public enum LZ4Utils {
    ;

    static int hash(int i) {
        return (i * -1640531535) >>> 20;
    }

    static int hash64k(int i) {
        return (i * -1640531535) >>> 19;
    }

    static int hashHC(int i) {
        return (i * -1640531535) >>> 17;
    }

    static class Match {
        int len;
        int ref;
        int start;

        static {
            Covode.recordClassIndex(106096);
        }

        Match() {
        }

        /* access modifiers changed from: package-private */
        public int end() {
            return this.start + this.len;
        }

        /* access modifiers changed from: package-private */
        public void fix(int i) {
            this.start += i;
            this.ref += i;
            this.len -= i;
        }
    }

    static {
        Covode.recordClassIndex(106095);
    }

    static int maxCompressedLength(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("length must be >= 0, got ".concat(String.valueOf(i)));
        } else if (i < 2113929216) {
            return i + (i / 255) + 16;
        } else {
            throw new IllegalArgumentException("length must be < 2113929216");
        }
    }

    static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }
}
