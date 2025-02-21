class FindElements:
    def __init__(self, root):
        self.recovered_values = set()
        self.recover_tree(root, 0)

    def recover_tree(self, node, value):
        if node is None:
            return
        node.val = value
        self.recovered_values.add(value)
        self.recover_tree(node.left, 2 * value + 1)
        self.recover_tree(node.right, 2 * value + 2)

    def find(self, target):
        return target in self.recovered_values