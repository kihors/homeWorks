package com.homework.third.secondPart;

/*
 * task from Stepik
 * https://stepik.org/lesson/14513/step/9?unit=4147
 */

public interface TextAnalyzer {

    public enum Label {
        SPAM,
        NEGATIVE_TEXT,
        TOO_LONG,
        OK
    }

    Label processText(String text);

    abstract class KeywordAnalyzer implements TextAnalyzer {
        protected abstract String[] getKeywords();

        protected abstract Label getLabel();

        public Label processText(String text) {
            String[] keywords = getKeywords();
            for (String keyword : keywords) {
                if (text.contains(keyword)) {
                    return getLabel();
                }
            }
            return Label.OK;
        }

    }

    class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
        private String[] keywords;

        public SpamAnalyzer(String[] keywords) {
            this.keywords = keywords;
        }

        @Override
        protected String[] getKeywords() {
            return keywords;
        }

        @Override
        protected Label getLabel() {
            return Label.SPAM;
        }
    }

    class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
        private final String[] KEYWORDS = {":(", "=(", ":|"};

        @Override
        protected String[] getKeywords() {
            return KEYWORDS;
        }

        @Override
        protected Label getLabel() {
            return Label.NEGATIVE_TEXT;
        }

    }

    class TooLongTextAnalyzer implements TextAnalyzer {
        private int maxLength;

        public TooLongTextAnalyzer(int threshold) {
            this.maxLength = threshold;
        }

        @Override
        public Label processText(String text) {
            if (text.length() > maxLength) {
                return Label.TOO_LONG;
            } else {
                return Label.OK;
            }
        }
    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            if (analyzer.processText(text) != Label.OK) {
                return analyzer.processText(text);
            }
        }
        return Label.OK;
    }
}
