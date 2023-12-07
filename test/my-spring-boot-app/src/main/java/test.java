public class Glossary {
    private String title;
    private GlossDiv glossDiv;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GlossDiv getGlossDiv() {
        return glossDiv;
    }

    public void setGlossDiv(GlossDiv glossDiv) {
        this.glossDiv = glossDiv;
    }

    public static class GlossDiv {
        private String title;
        private GlossList glossList;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public GlossList getGlossList() {
            return glossList;
        }

        public void setGlossList(GlossList glossList) {
            this.glossList = glossList;
        }
    }

    public static class GlossList {
        private GlossEntry glossEntry;

        public GlossEntry getGlossEntry() {
            return glossEntry;
        }

        public void setGlossEntry(GlossEntry glossEntry) {
            this.glossEntry = glossEntry;
        }
    }

    public static class GlossEntry {
        private String ID;
        private String sortAs;
        private String glossTerm;
        private String acronym;
        private String abbrev;
        private GlossDef glossDef;
        private String glossSee;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getSortAs() {
            return sortAs;
        }

        public void setSortAs(String sortAs) {
            this.sortAs = sortAs;
        }

        public String getGlossTerm() {
            return glossTerm;
        }

        public void setGlossTerm(String glossTerm) {
            this.glossTerm = glossTerm;
        }

        public String getAcronym() {
            return acronym;
        }

        public void setAcronym(String acronym) {
            this.acronym = acronym;
        }

        public String getAbbrev() {
            return abbrev;
        }

        public void setAbbrev(String abbrev) {
            this.abbrev = abbrev;
        }

        public GlossDef getGlossDef() {
            return glossDef;
        }

        public void setGlossDef(GlossDef glossDef) {
            this.glossDef = glossDef;
        }

        public String getGlossSee() {
            return glossSee;
        }

        public void setGlossSee(String glossSee) {
            this.glossSee = glossSee;
        }
    }

    public static class GlossDef {
        private String para;
        private String[] glossSeeAlso;

        public String getPara() {
            return para;
        }

        public void setPara(String para) {
            this.para = para;
        }

        public String[] getGlossSeeAlso() {
            return glossSeeAlso;
        }

        public void setGlossSeeAlso(String[] glossSeeAlso) {
            this.glossSeeAlso = glossSeeAlso;
        }
    }
}
