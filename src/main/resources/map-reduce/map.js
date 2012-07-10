function () {
    for (var i = 0; i < this.accounts.length; i++) {
        emit(this.accounts[i].balance, 1);
    }
}