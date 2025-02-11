class RemoveOccurences:
    def removeOccurrences(self, s: str, part: str) -> str:
        sb = list(s)  # Step 1: Convert `s` to a list (mutable)
        part_len = len(part)
        index = ''.join(sb).find(part)
        while index != -1:
            del sb[index:index + len(part)]
            index = ''.join(sb).find(part)
        return ''.join(sb)